/**
 * Renders all the widgets on the tab and triggers the datasources that are used by the widgets.
 * Customize your widgets by:
 *  - Overriding or extending widget API methods
 *  - Changing widget settings or options
 */
/* jshint unused: false */
define(['angular',
    './sample-module'
], function (angular, controllers) {
    'use strict';

    // Controller definition
    controllers.controller('DashboardCtrl', ['$scope', '$log', 'PredixAssetService', 'PredixLiveDataService',
            function ($scope, $log, PredixAssetService, PredixLiveDataService) {

        // on initial load, get the top level groups:
        PredixAssetService.getRmdRefAppEntities({uri: '/group/root'}).then(function (initialContext) {
            $scope.initialContexts = initialContext;
        }, function (message) {
            $log.error(message);
        });

        // Since it's difficult to set up web socket proxying, we'll just get the web socket URL here in the browser for now:
        PredixLiveDataService.getWsUrl().then(function(urlData) {
            $scope.wsUrl = urlData.wsUrl;
        }, function (msg) {
            $log.error(msg);
        });

        // Take an asset object defined in the Ref App asset model,
        //  and create a list of parameters to display.
        $scope.getPickerOptionsFromAsset = function (asset) {
            var pickerOptions = [];

            if (asset.assetMeter) {
                for(var key in asset.assetMeter) {
                    var m = asset.assetMeter[key];
                    var option = {
                        sourceTagId: m.sourceTagId,
                        meterUri: m.uri,
                        thresholdHigh: m.outputMaximum,
                        thresholdLow: m.outputMinimum,
                        wsUrl: $scope.wsUrl + m.meterDatasource.machineUri,
                        label: key
                    };
                    pickerOptions.push(option);
                }
            }
            return pickerOptions;
        };

        // callback for when the Open button is clicked
        $scope.openContext = function (contextDetails) {

            // need to clean up the context details so it doesn't have the infinite parent/children cycle,
            // which causes problems later (can't interpolate: {{context}} TypeError: Converting circular structure to JSON)
            var newContext = angular.copy(contextDetails);
            newContext.children = [];
            newContext.parent = [];

            newContext.pickerOptions = $scope.getPickerOptionsFromAsset(newContext);
            $scope.context = newContext;

            if (newContext.uri.indexOf('group') >= 0) {
                // TODO: remove this hardcoded path...
                $scope.selectedDeck = 'bower_components/rmd-ref-app-cards/group-deck.html';
            } else {
                // TODO: remove this hardcoded path...
                $scope.selectedDeck = 'bower_components/rmd-ref-app-cards/compressor-deck.html';
            }
            document.querySelector('#dashboard-description-card').hidden = true;
            $scope.$digest();
        };

        // this function called "getChildren" is called by the px-context-browser
        $scope.getChildren = function (parent, options) {
            // call a custom function developed for this application:
            return PredixAssetService.getRmdRefAppEntities(parent);
        };

        $scope.handlers = {
            itemOpenHandler: $scope.openContext,
            getChildren: $scope.getChildren
            // (optional) click handler: itemClickHandler: $scope.clickHandler
        };

    }]);
});
