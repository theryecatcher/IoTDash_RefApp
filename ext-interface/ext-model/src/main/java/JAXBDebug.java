//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import com.ge.dsp.aaas.entity.attributedefidentifier.AttributeDefIdentifier;
import com.ge.dsp.aaas.entity.attributedefidentifier.AttributeDefIdentifierList;
import com.ge.dsp.aaas.entity.identifier.Identifier;
import com.ge.dsp.aaas.entity.identifier.IdentifierList;
import com.ge.dsp.aaas.entity.message.Message;
import com.ge.dsp.aaas.entity.message.MessageList;
import com.ge.dsp.aaas.entity.resultinfo.ResultInfo;
import com.ge.dsp.aaas.entity.resultinfo.ResultInfoList;
import com.ge.dsp.pm.ext.entity.action.Action;
import com.ge.dsp.pm.ext.entity.action.ActionList;
import com.ge.dsp.pm.ext.entity.analytic.port.PortList;
import com.ge.dsp.pm.ext.entity.analytic.port.portidentifier.PortIdentifier;
import com.ge.dsp.pm.ext.entity.analytic.port.portidentifier.PortIdentifierList;
import com.ge.dsp.pm.ext.entity.app.appidentifier.AppIdentifier;
import com.ge.dsp.pm.ext.entity.app.appidentifier.AppIdentifierList;
import com.ge.dsp.pm.ext.entity.asset.AssetList;
import com.ge.dsp.pm.ext.entity.asset.assetidentifier.AssetIdentifier;
import com.ge.dsp.pm.ext.entity.asset.assetidentifier.AssetIdentifierList;
import com.ge.dsp.pm.ext.entity.assetselector.AssetSelector;
import com.ge.dsp.pm.ext.entity.attribute.Attribute;
import com.ge.dsp.pm.ext.entity.attribute.AttributeList;
import com.ge.dsp.pm.ext.entity.attribute.NamedAttribute;
import com.ge.dsp.pm.ext.entity.attribute.PositionalAttributes;
import com.ge.dsp.pm.ext.entity.attributedef.AttributeDef;
import com.ge.dsp.pm.ext.entity.attributedef.AttributeDefList;
import com.ge.dsp.pm.ext.entity.attributedef.AttributeType;
import com.ge.dsp.pm.ext.entity.context.AnalyticContext;
import com.ge.dsp.pm.ext.entity.context.OrchestrationContext;
import com.ge.dsp.pm.ext.entity.context.OrchestrationDesignContext;
import com.ge.dsp.pm.ext.entity.context.ServiceIdentifier;
import com.ge.dsp.pm.ext.entity.field.Field;
import com.ge.dsp.pm.ext.entity.field.FieldList;
import com.ge.dsp.pm.ext.entity.field.FieldType;
import com.ge.dsp.pm.ext.entity.field.FieldTypeList;
import com.ge.dsp.pm.ext.entity.field.SearchType;
import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifier;
import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifierList;
import com.ge.dsp.pm.ext.entity.fielddata.FieldData;
import com.ge.dsp.pm.ext.entity.fielddata.FieldDataList;
import com.ge.dsp.pm.ext.entity.fielddata.Fields;
import com.ge.dsp.pm.ext.entity.fielddata.KnownDataTypes;
import com.ge.dsp.pm.ext.entity.fielddata.OsaData;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierObject;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValue;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValueList;
import com.ge.dsp.pm.ext.entity.fieldselection.FieldSelection;
import com.ge.dsp.pm.ext.entity.fieldselection.FieldSelectionList;
import com.ge.dsp.pm.ext.entity.fieldtrigger.FieldTrigger;
import com.ge.dsp.pm.ext.entity.fieldtrigger.FieldTriggerList;
import com.ge.dsp.pm.ext.entity.fieldvalue.FieldValue;
import com.ge.dsp.pm.ext.entity.fieldvalue.FieldValueList;
import com.ge.dsp.pm.ext.entity.fieldvalues.FieldValues;
import com.ge.dsp.pm.ext.entity.fieldvalues.FieldValuesList;
import com.ge.dsp.pm.ext.entity.iidhfield.IidhField;
import com.ge.dsp.pm.ext.entity.iidhfield.IidhFieldList;
import com.ge.dsp.pm.ext.entity.model.Model;
import com.ge.dsp.pm.ext.entity.model.ModelList;
import com.ge.dsp.pm.ext.entity.model.SampleEngine;
import com.ge.dsp.pm.ext.entity.modelfield.ModelField;
import com.ge.dsp.pm.ext.entity.modelfield.ModelFieldList;
import com.ge.dsp.pm.ext.entity.moduleconfigroot.ModuleConfigRoot;
import com.ge.dsp.pm.ext.entity.osa.dmboolseries.DMBoolSeries;
import com.ge.dsp.pm.ext.entity.osa.dmintseries.DMIntSeries;
import com.ge.dsp.pm.ext.entity.osa.dmrealseries.DMRealSeries;
import com.ge.dsp.pm.ext.entity.osa.errordataevent.ErrorDataEvent;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.EntireDataSetSelectionFilter;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.NameStringOrField;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.NameValueSelectionFilter;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.NameValueSelectionFilterRow;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.RowSelectionFilter;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.SelectionFilterDefinition;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.SelectionFilterRoot;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.TimeOrRowSelectionFilter;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.TimeSelectionFilter;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.ValueStringOrField;
import com.ge.dsp.pm.ext.entity.property.Property;
import com.ge.dsp.pm.ext.entity.property.propertyidentifier.PropertyIdentifier;
import com.ge.dsp.pm.ext.entity.property.propertyidentifier.PropertyIdentifierList;
import com.ge.dsp.pm.ext.entity.propertytype.PropertyType;
import com.ge.dsp.pm.ext.entity.selectionfilter.FieldIdentifierNestedValue;
import com.ge.dsp.pm.ext.entity.selectionfilter.FieldSelectionFilter;
import com.ge.dsp.pm.ext.entity.selectionfilter.FieldTypeSelectionFilter;
import com.ge.dsp.pm.ext.entity.selectionfilter.NestedSelectionFilter;
import com.ge.dsp.pm.ext.entity.selectionfilter.OsaSelectionFilter;
import com.ge.dsp.pm.ext.entity.solution.Solution;
import com.ge.dsp.pm.ext.entity.solution.SolutionList;
import com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.SolutionIdentifier;
import com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.SolutionIdentifierList;
import com.ge.dsp.pm.ext.entity.source.Source;
import com.ge.dsp.pm.ext.entity.source.SourceType;
import com.ge.dsp.pm.ext.entity.source.SourceTypeList;
import com.ge.dsp.pm.ext.entity.sourceinfo.SourceInfo;
import com.ge.dsp.pm.ext.entity.sourceinfo.SourceInfoList;
import com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier.SourceInfoIdentifier;
import com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier.SourceInfoIdentifierList;
import com.ge.dsp.pm.ext.entity.strategy.Strategy;
import com.ge.dsp.pm.ext.entity.strategy.StrategyList;
import com.ge.dsp.pm.ext.entity.strategy.StrategyType;
import com.ge.dsp.pm.ext.entity.strategy.StrategyTypeList;
import com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier.StrategyIdentifier;
import com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier.StrategyIdentifierList;
import com.ge.dsp.pm.ext.entity.strategydetail.StrategyDetail;
import com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier.StrategyDetailIdentifier;
import com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier.StrategyDetailIdentifierList;
import com.ge.dsp.pm.ext.entity.strategysequence.StrategySequence;
import com.ge.dsp.pm.ext.entity.strategysequence.StrategySequenceList;
import com.ge.dsp.pm.ext.entity.tenant.tenantidentifier.TenantIdentifier;
import com.ge.dsp.pm.ext.entity.tenant.tenantidentifier.TenantIdentifierList;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.Aggregator;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.Datapoint;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.GroupBy;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.IngestBody;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.PredixEventTimeSelectionFilter;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.PredixTimeSelection;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.PredixTimeSelectionFilter;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.PredixTimeseriesIngestion;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.RangeSize;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.RelativeTime;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.Sampling;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.TagGroupBy;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.Tags;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.TimeGroupBy;
import com.ge.dsp.pm.ext.entity.timeselectionfilter.ValueGroupBy;
import com.ge.dsp.pm.ext.entity.trigger.Trigger;
import com.ge.dsp.pm.ext.entity.trigger.TriggerList;
import com.ge.dsp.pm.ext.entity.trigger.triggeridentifier.TriggerIdentifier;
import com.ge.dsp.pm.ext.entity.trigger.triggeridentifier.TriggerIdentifierList;
import com.ge.dsp.pm.ext.entity.util.map.Map;
import com.ge.dsp.pm.ext.entity.util.map.SimpleMap;
import com.ge.dsp.pm.ext.entity.vo.unitcode.UnitCodeVO;
import com.ge.dsp.pm.ext.entity.vo.unitcode.UnitCodesVO;
import com.ge.dsp.pm.solution.service.entity.fieldchanged.FieldChanged;
import com.ge.dsp.pm.solution.service.entity.fieldchanged.FieldChangedList;
import com.ge.dsp.pm.solution.service.fieldchanged.FieldChangedEvent;
import org.mimosa.osacbmv3_3.AGDataEvent;
import org.mimosa.osacbmv3_3.AGPort;
import org.mimosa.osacbmv3_3.AgentAlertFilter;
import org.mimosa.osacbmv3_3.AlertRegion;
import org.mimosa.osacbmv3_3.AlertRegionCBM;
import org.mimosa.osacbmv3_3.AlertRegionRef;
import org.mimosa.osacbmv3_3.AlertType;
import org.mimosa.osacbmv3_3.Algorithm;
import org.mimosa.osacbmv3_3.AlgorithmInputChar;
import org.mimosa.osacbmv3_3.AlgorithmInputData;
import org.mimosa.osacbmv3_3.AlgorithmInputInt;
import org.mimosa.osacbmv3_3.AlgorithmInputReal;
import org.mimosa.osacbmv3_3.AlgorithmInputValue;
import org.mimosa.osacbmv3_3.AlgorithmModel;
import org.mimosa.osacbmv3_3.AlgorithmOutput;
import org.mimosa.osacbmv3_3.AmbiguityGroup;
import org.mimosa.osacbmv3_3.Ampl;
import org.mimosa.osacbmv3_3.AndConnector;
import org.mimosa.osacbmv3_3.AppChange;
import org.mimosa.osacbmv3_3.AppInfo;
import org.mimosa.osacbmv3_3.AppRequest;
import org.mimosa.osacbmv3_3.AssetInfo;
import org.mimosa.osacbmv3_3.BLOB;
import org.mimosa.osacbmv3_3.BooleanArrayValue;
import org.mimosa.osacbmv3_3.BooleanValue;
import org.mimosa.osacbmv3_3.ByteArrayValue;
import org.mimosa.osacbmv3_3.ByteValue;
import org.mimosa.osacbmv3_3.CPB;
import org.mimosa.osacbmv3_3.CharArrayValue;
import org.mimosa.osacbmv3_3.CharValue;
import org.mimosa.osacbmv3_3.CmplxArrayValue;
import org.mimosa.osacbmv3_3.CmplxFrqSpect;
import org.mimosa.osacbmv3_3.CmplxWaveform;
import org.mimosa.osacbmv3_3.ComplexValue;
import org.mimosa.osacbmv3_3.ConfigRequest;
import org.mimosa.osacbmv3_3.Configuration;
import org.mimosa.osacbmv3_3.ControlChange;
import org.mimosa.osacbmv3_3.ControlInfo;
import org.mimosa.osacbmv3_3.ControlRequest;
import org.mimosa.osacbmv3_3.DABLOBData;
import org.mimosa.osacbmv3_3.DABool;
import org.mimosa.osacbmv3_3.DADataEvent;
import org.mimosa.osacbmv3_3.DADataSeq;
import org.mimosa.osacbmv3_3.DAInt;
import org.mimosa.osacbmv3_3.DAPort;
import org.mimosa.osacbmv3_3.DAReal;
import org.mimosa.osacbmv3_3.DAString;
import org.mimosa.osacbmv3_3.DAValueDataSeq;
import org.mimosa.osacbmv3_3.DAValueWaveform;
import org.mimosa.osacbmv3_3.DAVector;
import org.mimosa.osacbmv3_3.DAWaveform;
import org.mimosa.osacbmv3_3.DMBLOBData;
import org.mimosa.osacbmv3_3.DMBool;
import org.mimosa.osacbmv3_3.DMDataEvent;
import org.mimosa.osacbmv3_3.DMDataSeq;
import org.mimosa.osacbmv3_3.DMInt;
import org.mimosa.osacbmv3_3.DMPort;
import org.mimosa.osacbmv3_3.DMReal;
import org.mimosa.osacbmv3_3.DMVector;
import org.mimosa.osacbmv3_3.DataEvent;
import org.mimosa.osacbmv3_3.DataEventSet;
import org.mimosa.osacbmv3_3.DataRef;
import org.mimosa.osacbmv3_3.DataSource;
import org.mimosa.osacbmv3_3.DataSourceMeasInfo;
import org.mimosa.osacbmv3_3.DataType;
import org.mimosa.osacbmv3_3.DblArrayValue;
import org.mimosa.osacbmv3_3.DoubleValue;
import org.mimosa.osacbmv3_3.EPSStatus;
import org.mimosa.osacbmv3_3.EntryPointStringified;
import org.mimosa.osacbmv3_3.EnumValue;
import org.mimosa.osacbmv3_3.ErrorInfo;
import org.mimosa.osacbmv3_3.ErrorRequest;
import org.mimosa.osacbmv3_3.Explanation;
import org.mimosa.osacbmv3_3.ExplanationData;
import org.mimosa.osacbmv3_3.ExplanationDataRef;
import org.mimosa.osacbmv3_3.ExplanationDataRefSet;
import org.mimosa.osacbmv3_3.ExplanationDataSet;
import org.mimosa.osacbmv3_3.ExplanationSrcs;
import org.mimosa.osacbmv3_3.ExplanationSrcsStr;
import org.mimosa.osacbmv3_3.FloatArrayValue;
import org.mimosa.osacbmv3_3.FloatValue;
import org.mimosa.osacbmv3_3.Function;
import org.mimosa.osacbmv3_3.FutureHealth;
import org.mimosa.osacbmv3_3.FutureHlthTrend;
import org.mimosa.osacbmv3_3.GeneralParameter;
import org.mimosa.osacbmv3_3.HADataEvent;
import org.mimosa.osacbmv3_3.HAPort;
import org.mimosa.osacbmv3_3.HlthLevelType;
import org.mimosa.osacbmv3_3.IntArrayValue;
import org.mimosa.osacbmv3_3.IntValue;
import org.mimosa.osacbmv3_3.Item;
import org.mimosa.osacbmv3_3.ItemAlertRegions;
import org.mimosa.osacbmv3_3.ItemEvent;
import org.mimosa.osacbmv3_3.ItemEventBLOB;
import org.mimosa.osacbmv3_3.ItemEventChar;
import org.mimosa.osacbmv3_3.ItemEventConfig;
import org.mimosa.osacbmv3_3.ItemEventNumInt;
import org.mimosa.osacbmv3_3.ItemEventNumReal;
import org.mimosa.osacbmv3_3.ItemHealth;
import org.mimosa.osacbmv3_3.ItemId;
import org.mimosa.osacbmv3_3.ItemPrognosis;
import org.mimosa.osacbmv3_3.ItemRecommendation;
import org.mimosa.osacbmv3_3.ItemRecommendationRemark;
import org.mimosa.osacbmv3_3.ItemRequestForWork;
import org.mimosa.osacbmv3_3.LocalTime;
import org.mimosa.osacbmv3_3.LogicalConnector;
import org.mimosa.osacbmv3_3.LongArrayValue;
import org.mimosa.osacbmv3_3.LongValue;
import org.mimosa.osacbmv3_3.MIMAgent;
import org.mimosa.osacbmv3_3.MIMKey1;
import org.mimosa.osacbmv3_3.MIMKey2;
import org.mimosa.osacbmv3_3.MIMKey3;
import org.mimosa.osacbmv3_3.MeasLoc;
import org.mimosa.osacbmv3_3.MeasLocAlertFilter;
import org.mimosa.osacbmv3_3.MeasLocMIM;
import org.mimosa.osacbmv3_3.Metric;
import org.mimosa.osacbmv3_3.MimTypeDescriptors;
import org.mimosa.osacbmv3_3.Mime;
import org.mimosa.osacbmv3_3.ModuleDescriptor;
import org.mimosa.osacbmv3_3.ModuleRef;
import org.mimosa.osacbmv3_3.MonitorId;
import org.mimosa.osacbmv3_3.MonitorIdGroup;
import org.mimosa.osacbmv3_3.MonitorIdGroupList;
import org.mimosa.osacbmv3_3.NotConnector;
import org.mimosa.osacbmv3_3.NumAlert;
import org.mimosa.osacbmv3_3.OrConnector;
import org.mimosa.osacbmv3_3.OsacbmTime;
import org.mimosa.osacbmv3_3.OutPortSet;
import org.mimosa.osacbmv3_3.PADataEvent;
import org.mimosa.osacbmv3_3.PAPort;
import org.mimosa.osacbmv3_3.Parameter;
import org.mimosa.osacbmv3_3.PortRef;
import org.mimosa.osacbmv3_3.PropEvent;
import org.mimosa.osacbmv3_3.RUL;
import org.mimosa.osacbmv3_3.RULDistrbn;
import org.mimosa.osacbmv3_3.RealFrqSpect;
import org.mimosa.osacbmv3_3.RealWaveform;
import org.mimosa.osacbmv3_3.RefUnit;
import org.mimosa.osacbmv3_3.Role;
import org.mimosa.osacbmv3_3.SDBool;
import org.mimosa.osacbmv3_3.SDDataEvent;
import org.mimosa.osacbmv3_3.SDEnum;
import org.mimosa.osacbmv3_3.SDEnumSet;
import org.mimosa.osacbmv3_3.SDEnumSetDataItem;
import org.mimosa.osacbmv3_3.SDEvent;
import org.mimosa.osacbmv3_3.SDInt;
import org.mimosa.osacbmv3_3.SDPort;
import org.mimosa.osacbmv3_3.SDReal;
import org.mimosa.osacbmv3_3.SDTestInt;
import org.mimosa.osacbmv3_3.SDTestReal;
import org.mimosa.osacbmv3_3.Segment;
import org.mimosa.osacbmv3_3.SequenceSelect;
import org.mimosa.osacbmv3_3.ShortArrayValue;
import org.mimosa.osacbmv3_3.ShortValue;
import org.mimosa.osacbmv3_3.Site;
import org.mimosa.osacbmv3_3.StringArrayValue;
import org.mimosa.osacbmv3_3.StringValue;
import org.mimosa.osacbmv3_3.SupportingData;
import org.mimosa.osacbmv3_3.TimeSelect;
import org.mimosa.osacbmv3_3.Transducer;
import org.mimosa.osacbmv3_3.TransducerMeasInfo;
import org.mimosa.osacbmv3_3.UnitConverter;
import org.mimosa.osacbmv3_3.UserDef;
import org.mimosa.osacbmv3_3.Value;
import org.mimosa.osacbmv3_3.WindowType;

public class JAXBDebug {


    public static JAXBContext createContext(ClassLoader classLoader)
        throws JAXBException
    {
        return JAXBContext.newInstance(FieldChangedEvent.class, FieldChangedList.class, FieldChanged.class, AlertRegion.class, SDTestInt.class, Configuration.class, ItemHealth.class, SequenceSelect.class, SDReal.class, NumAlert.class, TimeSelect.class, Item.class, BooleanValue.class, org.mimosa.osacbmv3_3.Asset.class, DAWaveform.class, AlgorithmModel.class, ControlChange.class, DAValueDataSeq.class, StringValue.class, AlgorithmInputReal.class, IntValue.class, MonitorId.class, LocalTime.class, ItemEventNumInt.class, DataEventSet.class, ControlRequest.class, DataSource.class, PAPort.class, AmbiguityGroup.class, DataSourceMeasInfo.class, ExplanationSrcs.class, CmplxArrayValue.class, ExplanationDataRef.class, MeasLocAlertFilter.class, ItemRequestForWork.class, ByteArrayValue.class, FloatValue.class, AGPort.class, StringArrayValue.class, Site.class, AGDataEvent.class, ItemEvent.class, EntryPointStringified.class, FutureHealth.class, DMInt.class, HADataEvent.class, PropEvent.class, RefUnit.class, AssetInfo.class, ItemRecommendation.class, Transducer.class, LongArrayValue.class, MeasLocMIM.class, DataRef.class, RealFrqSpect.class, Ampl.class, DataType.class, SDBool.class, DAPort.class, MimTypeDescriptors.class, ErrorRequest.class, CmplxWaveform.class, PADataEvent.class, RUL.class, UserDef.class, SDEnumSetDataItem.class, AlgorithmInputChar.class, SDInt.class, Mime.class, GeneralParameter.class, SDEnum.class, CPB.class, DMBool.class, DoubleValue.class, SDEnumSet.class, Parameter.class, ExplanationDataSet.class, OsacbmTime.class, SDEvent.class, AgentAlertFilter.class, DAReal.class, DMBLOBData.class, ByteValue.class, BLOB.class, ItemAlertRegions.class, ItemRecommendationRemark.class, EnumValue.class, Explanation.class, DAValueWaveform.class, org.mimosa.osacbmv3_3.Port.class, ModuleRef.class, CharValue.class, HAPort.class, ItemId.class, AlertRegionRef.class, DADataSeq.class, DAString.class, ExplanationSrcsStr.class, DblArrayValue.class, AlgorithmInputValue.class, IntArrayValue.class, ComplexValue.class, DMVector.class, FloatArrayValue.class, ErrorInfo.class, NotConnector.class, DMDataSeq.class, RealWaveform.class, AndConnector.class, DMReal.class, DataEvent.class, ControlInfo.class, Algorithm.class, AppInfo.class, Role.class, MIMKey1 .class, ItemPrognosis.class, DMDataEvent.class, ExplanationDataRefSet.class, MIMKey2 .class, MIMKey3 .class, ItemEventChar.class, LongValue.class, Value.class, AlertRegionCBM.class, OrConnector.class, DABool.class, SDDataEvent.class, WindowType.class, EPSStatus.class, SDTestReal.class, DABLOBData.class, MonitorIdGroup.class, OutPortSet.class, SupportingData.class, AlgorithmOutput.class, ConfigRequest.class, DMPort.class, AppChange.class, LogicalConnector.class, BooleanArrayValue.class, org.mimosa.osacbmv3_3.SelectionFilter.class, TransducerMeasInfo.class, Segment.class, AlertType.class, ExplanationData.class, Function.class, DADataEvent.class, MeasLoc.class, ShortValue.class, ItemEventConfig.class, RULDistrbn.class, MonitorIdGroupList.class, UnitConverter.class, HlthLevelType.class, AlgorithmInputData.class, ShortArrayValue.class, CharArrayValue.class, MIMAgent.class, ItemEventBLOB.class, AlgorithmInputInt.class, DAVector.class, ItemEventNumReal.class, org.mimosa.osacbmv3_3.Data.class, PortRef.class, DAInt.class, AppRequest.class, ModuleDescriptor.class, org.mimosa.osacbmv3_3.EngUnit.class, SDPort.class, CmplxFrqSpect.class, FutureHlthTrend.class, Metric.class, SolutionIdentifierList.class, SolutionIdentifier.class, Identifier.class, IdentifierList.class, com.ge.dsp.pm.ext.entity.asset.Asset.class, AssetList.class, AssetIdentifier.class, AssetIdentifierList.class, AssetSelector.class, FieldIdentifierObject.class, FieldIdentifierValueList.class, FieldIdentifierValue.class, FieldIdentifier.class, FieldIdentifierList.class, Field.class, SearchType.class, FieldTypeList.class, FieldList.class, FieldType.class, AttributeDef.class, AttributeType.class, AttributeDefList.class, com.ge.dsp.pm.ext.entity.util.map.Entry.class, Map.class, SimpleMap.class, UnitCodesVO.class, UnitCodeVO.class, TriggerList.class, Trigger.class, TriggerIdentifierList.class, TriggerIdentifier.class, Tags.class, ValueGroupBy.class, IngestBody.class, GroupBy.class, PredixTimeSelection.class, Aggregator.class, PredixTimeseriesIngestion.class, TagGroupBy.class, RelativeTime.class, PredixTimeSelectionFilter.class, TimeGroupBy.class, Datapoint.class, RangeSize.class, Sampling.class, PredixEventTimeSelectionFilter.class, com.ge.dsp.pm.ext.entity.selectionfilter.SelectionFilter.class, OsaSelectionFilter.class, FieldSelectionFilter.class, FieldIdentifierNestedValue.class, FieldTypeSelectionFilter.class, NestedSelectionFilter.class, FieldValue.class, FieldValueList.class, TenantIdentifier.class, TenantIdentifierList.class, StrategyDetail.class, SourceInfo.class, SourceInfoList.class, SourceInfoIdentifierList.class, SourceInfoIdentifier.class, Property.class, PropertyType.class, PropertyIdentifierList.class, PropertyIdentifier.class, SourceTypeList.class, SourceType.class, Source.class, Action.class, ActionList.class, StrategyDetailIdentifierList.class, StrategyDetailIdentifier.class, StrategySequence.class, StrategySequenceList.class, StrategyTypeList.class, Strategy.class, StrategyList.class, StrategyType.class, StrategyIdentifierList.class, StrategyIdentifier.class, Solution.class, SolutionList.class, com.ge.dsp.pm.ext.entity.analytic.port.Port.class, PortList.class, FieldSelection.class, FieldSelectionList.class, com.ge.dsp.pm.ext.entity.engunit.EngUnit.class, PortIdentifier.class, PortIdentifierList.class, com.ge.dsp.pm.ext.entity.fielddata.Data.class, FieldData.class, KnownDataTypes.class, FieldDataList.class, Fields.class, OsaData.class, SelectionFilterDefinition.class, NameValueSelectionFilter.class, TimeOrRowSelectionFilter.class, SelectionFilterRoot.class, EntireDataSetSelectionFilter.class, RowSelectionFilter.class, NameValueSelectionFilterRow.class, TimeSelectionFilter.class, ValueStringOrField.class, NameStringOrField.class, ErrorDataEvent.class, DMRealSeries.class, DMIntSeries.class, DMBoolSeries.class, ModuleConfigRoot.class, OrchestrationContext.class, AnalyticContext.class, OrchestrationDesignContext.class, ServiceIdentifier.class, ModelField.class, ModelFieldList.class, AppIdentifier.class, AppIdentifierList.class, ModelList.class, SampleEngine.class, Model.class, com.ge.dsp.pm.ext.entity.model.Entry.class, AttributeList.class, Attribute.class, NamedAttribute.class, PositionalAttributes.class, IidhField.class, IidhFieldList.class, FieldTrigger.class, FieldTriggerList.class, FieldValues.class, FieldValuesList.class, AttributeDefIdentifier.class, AttributeDefIdentifierList.class, ResultInfoList.class, ResultInfo.class, MessageList.class, Message.class, com.ge.dsp.aaas.entity.attributedefidentifier.ObjectFactory.class, com.ge.dsp.aaas.entity.identifier.ObjectFactory.class, com.ge.dsp.aaas.entity.message.ObjectFactory.class, com.ge.dsp.aaas.entity.resultinfo.ObjectFactory.class, com.ge.dsp.aaas.entity.xmllist.ObjectFactory.class, com.ge.dsp.pm.ext.entity.action.ObjectFactory.class, com.ge.dsp.pm.ext.entity.analytic.port.ObjectFactory.class, com.ge.dsp.pm.ext.entity.analytic.port.portidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.app.appidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.asset.ObjectFactory.class, com.ge.dsp.pm.ext.entity.asset.assetidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.assetselector.ObjectFactory.class, com.ge.dsp.pm.ext.entity.attribute.ObjectFactory.class, com.ge.dsp.pm.ext.entity.attributedef.ObjectFactory.class, com.ge.dsp.pm.ext.entity.context.ObjectFactory.class, com.ge.dsp.pm.ext.entity.engunit.ObjectFactory.class, com.ge.dsp.pm.ext.entity.field.ObjectFactory.class, com.ge.dsp.pm.ext.entity.field.fieldidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fielddata.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldidentifiervalue.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldselection.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldtrigger.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldvalue.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldvalues.ObjectFactory.class, com.ge.dsp.pm.ext.entity.iidhfield.ObjectFactory.class, com.ge.dsp.pm.ext.entity.model.ObjectFactory.class, com.ge.dsp.pm.ext.entity.modelfield.ObjectFactory.class, com.ge.dsp.pm.ext.entity.moduleconfigroot.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.dmboolseries.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.dmintseries.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.dmrealseries.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.errordataevent.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.selectionfilter.ObjectFactory.class, com.ge.dsp.pm.ext.entity.property.ObjectFactory.class, com.ge.dsp.pm.ext.entity.property.propertyidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.propertytype.ObjectFactory.class, com.ge.dsp.pm.ext.entity.selectionfilter.ObjectFactory.class, com.ge.dsp.pm.ext.entity.solution.ObjectFactory.class, com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.source.ObjectFactory.class, com.ge.dsp.pm.ext.entity.sourceinfo.ObjectFactory.class, com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.strategy.ObjectFactory.class, com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.strategydetail.ObjectFactory.class, com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.strategysequence.ObjectFactory.class, com.ge.dsp.pm.ext.entity.tenant.tenantidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.timeselectionfilter.ObjectFactory.class, com.ge.dsp.pm.ext.entity.trigger.ObjectFactory.class, com.ge.dsp.pm.ext.entity.trigger.triggeridentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.util.map.ObjectFactory.class, com.ge.dsp.pm.ext.entity.vo.unitcode.ObjectFactory.class, com.ge.dsp.pm.solution.service.entity.fieldchanged.ObjectFactory.class, com.ge.dsp.pm.solution.service.fieldchanged.ObjectFactory.class, org.mimosa.osacbmv3_3.ObjectFactory.class);
    }

}
