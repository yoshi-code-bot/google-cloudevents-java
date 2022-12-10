// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/testlab/v1/data.proto

package com.google.events.firebase.testlab.v1;

public final class Data {
  private Data() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_events_firebase_testlab_v1_TestMatrixEventData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_testlab_v1_TestMatrixEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_events_firebase_testlab_v1_ClientInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_testlab_v1_ClientInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_events_firebase_testlab_v1_ClientInfo_DetailsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_testlab_v1_ClientInfo_DetailsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_events_firebase_testlab_v1_ResultStorage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_testlab_v1_ResultStorage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/events/firebase/testlab/v1/data" +
      ".proto\022!google.events.firebase.testlab.v" +
      "1\032\037google/protobuf/timestamp.proto\"\225\003\n\023T" +
      "estMatrixEventData\022/\n\013create_time\030\001 \001(\0132" +
      "\032.google.protobuf.Timestamp\022;\n\005state\030\002 \001" +
      "(\0162,.google.events.firebase.testlab.v1.T" +
      "estState\022\036\n\026invalid_matrix_details\030\003 \001(\t" +
      "\022J\n\017outcome_summary\030\004 \001(\01621.google.event" +
      "s.firebase.testlab.v1.OutcomeSummary\022H\n\016" +
      "result_storage\030\005 \001(\01320.google.events.fir" +
      "ebase.testlab.v1.ResultStorage\022B\n\013client" +
      "_info\030\006 \001(\0132-.google.events.firebase.tes" +
      "tlab.v1.ClientInfo\022\026\n\016test_matrix_id\030\007 \001" +
      "(\t\"\231\001\n\nClientInfo\022\016\n\006client\030\001 \001(\t\022K\n\007det" +
      "ails\030\002 \003(\0132:.google.events.firebase.test" +
      "lab.v1.ClientInfo.DetailsEntry\032.\n\014Detail" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"t" +
      "\n\rResultStorage\022\034\n\024tool_results_history\030" +
      "\001 \001(\t\022\036\n\026tool_results_execution\030\002 \001(\t\022\023\n" +
      "\013results_uri\030\003 \001(\t\022\020\n\010gcs_path\030\004 \001(\t*j\n\t" +
      "TestState\022\032\n\026TEST_STATE_UNSPECIFIED\020\000\022\016\n" +
      "\nVALIDATING\020\001\022\013\n\007PENDING\020\002\022\014\n\010FINISHED\020\003" +
      "\022\t\n\005ERROR\020\004\022\013\n\007INVALID\020\005*j\n\016OutcomeSumma" +
      "ry\022\037\n\033OUTCOME_SUMMARY_UNSPECIFIED\020\000\022\013\n\007S" +
      "UCCESS\020\001\022\013\n\007FAILURE\020\002\022\020\n\014INCONCLUSIVE\020\003\022" +
      "\013\n\007SKIPPED\020\004BV\n%com.google.events.fireba" +
      "se.testlab.v1P\001\252\002*Google.Events.Protobuf" +
      ".Firebase.TestLab.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_events_firebase_testlab_v1_TestMatrixEventData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_firebase_testlab_v1_TestMatrixEventData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_events_firebase_testlab_v1_TestMatrixEventData_descriptor,
        new java.lang.String[] { "CreateTime", "State", "InvalidMatrixDetails", "OutcomeSummary", "ResultStorage", "ClientInfo", "TestMatrixId", });
    internal_static_google_events_firebase_testlab_v1_ClientInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_firebase_testlab_v1_ClientInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_events_firebase_testlab_v1_ClientInfo_descriptor,
        new java.lang.String[] { "Client", "Details", });
    internal_static_google_events_firebase_testlab_v1_ClientInfo_DetailsEntry_descriptor =
      internal_static_google_events_firebase_testlab_v1_ClientInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_events_firebase_testlab_v1_ClientInfo_DetailsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_events_firebase_testlab_v1_ClientInfo_DetailsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_events_firebase_testlab_v1_ResultStorage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_firebase_testlab_v1_ResultStorage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_events_firebase_testlab_v1_ResultStorage_descriptor,
        new java.lang.String[] { "ToolResultsHistory", "ToolResultsExecution", "ResultsUri", "GcsPath", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
