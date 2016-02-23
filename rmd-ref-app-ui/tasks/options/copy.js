/**
 * Configure copying tasks into dist version
 */
module.exports = {
    dist: {
        files: [
            {
                expand: true,
                cwd: 'public',
                src: [
                    'index.html',
                    'polymer-loader.vulcanized.html',
                    'images/*',
                    // 'sample-data/*',
                    'views/*',
                    'docs/*',
                    'bower_components/webcomponentsjs/webcomponents-lite.js',
                    'bower_components/px/dist/px.min.js',
                    'bower_components/es6-promise/dist/es6-promise.min.js',
                    'bower_components/requirejs/require.js',
                    'bower_components/font-awesome/fonts/*',
                    'bower_components/px-typography-design/type/*',
                    // TODO: put cards inside the UI app...
                    'bower_components/rmd-ref-app-cards/**/**'
                ],
                dest: 'dist/www/'
            }
        ]
    },
    serve: {
        files: [
            {
                expand: true,
                cwd: 'public',
                src: ['polymer-loader.html'],
                rename: function(src, dest) {
                    return 'public/polymer-loader.vulcanized.html';
                }
            }
        ]
    }
};
