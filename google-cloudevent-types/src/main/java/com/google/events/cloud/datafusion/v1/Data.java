/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/datafusion/v1/data.proto

package com.google.events.cloud.datafusion.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_NetworkConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_Accelerator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_Accelerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_CryptoKeyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_Instance_OptionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_Instance_OptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_EventPublishConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_EventPublishConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_DnsPeering_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_DnsPeering_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_InstanceEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_InstanceEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_datafusion_v1_DnsPeeringEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_datafusion_v1_DnsPeeringEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/events/cloud/datafusion/v1/data"
          + ".proto\022!google.events.cloud.datafusion.v"
          + "1\032\037google/protobuf/timestamp.proto\"7\n\rNe"
          + "tworkConfig\022\017\n\007network\030\001 \001(\t\022\025\n\rip_alloc"
          + "ation\030\002 \001(\t\"\344\001\n\007Version\022\026\n\016version_numbe"
          + "r\030\001 \001(\t\022\027\n\017default_version\030\002 \001(\010\022\032\n\022avai"
          + "lable_features\030\003 \003(\t\022=\n\004type\030\004 \001(\0162/.goo"
          + "gle.events.cloud.datafusion.v1.Version.T"
          + "ype\"M\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\020\n\014TYP"
          + "E_PREVIEW\020\001\022\035\n\031TYPE_GENERAL_AVAILABILITY"
          + "\020\002\"\325\002\n\013Accelerator\022X\n\020accelerator_type\030\001"
          + " \001(\0162>.google.events.cloud.datafusion.v1"
          + ".Accelerator.AcceleratorType\022C\n\005state\030\002 "
          + "\001(\01624.google.events.cloud.datafusion.v1."
          + "Accelerator.State\"_\n\017AcceleratorType\022 \n\034"
          + "ACCELERATOR_TYPE_UNSPECIFIED\020\000\022\007\n\003CDC\020\001\022"
          + "\016\n\nHEALTHCARE\020\002\022\021\n\rCCAI_INSIGHTS\020\003\"F\n\005St"
          + "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022"
          + "\014\n\010DISABLED\020\002\022\013\n\007UNKNOWN\020\003\"(\n\017CryptoKeyC"
          + "onfig\022\025\n\rkey_reference\030\001 \001(\t\"\265\r\n\010Instanc"
          + "e\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022>\n\004"
          + "type\030\003 \001(\01620.google.events.cloud.datafus"
          + "ion.v1.Instance.Type\022\"\n\032enable_stackdriv"
          + "er_logging\030\004 \001(\010\022%\n\035enable_stackdriver_m"
          + "onitoring\030\005 \001(\010\022\030\n\020private_instance\030\006 \001("
          + "\010\022H\n\016network_config\030\007 \001(\01320.google.event"
          + "s.cloud.datafusion.v1.NetworkConfig\022G\n\006l"
          + "abels\030\010 \003(\01327.google.events.cloud.datafu"
          + "sion.v1.Instance.LabelsEntry\022I\n\007options\030"
          + "\t \003(\01328.google.events.cloud.datafusion.v"
          + "1.Instance.OptionsEntry\022/\n\013create_time\030\n"
          + " \001(\0132\032.google.protobuf.Timestamp\022/\n\013upda"
          + "te_time\030\013 \001(\0132\032.google.protobuf.Timestam"
          + "p\022@\n\005state\030\014 \001(\01621.google.events.cloud.d"
          + "atafusion.v1.Instance.State\022\025\n\rstate_mes"
          + "sage\030\r \001(\t\022\030\n\020service_endpoint\030\016 \001(\t\022\014\n\004"
          + "zone\030\017 \001(\t\022\017\n\007version\030\020 \001(\t\022\027\n\017service_a"
          + "ccount\030\021 \001(\t\022\024\n\014display_name\030\022 \001(\t\022E\n\021av"
          + "ailable_version\030\023 \003(\0132*.google.events.cl"
          + "oud.datafusion.v1.Version\022\024\n\014api_endpoin"
          + "t\030\024 \001(\t\022\022\n\ngcs_bucket\030\025 \001(\t\022D\n\014accelerat"
          + "ors\030\026 \003(\0132..google.events.cloud.datafusi"
          + "on.v1.Accelerator\022\032\n\022p4_service_account\030"
          + "\027 \001(\t\022\031\n\021tenant_project_id\030\030 \001(\t\022 \n\030data"
          + "proc_service_account\030\031 \001(\t\022\023\n\013enable_rba"
          + "c\030\033 \001(\010\022M\n\021crypto_key_config\030\034 \001(\01322.goo"
          + "gle.events.cloud.datafusion.v1.CryptoKey"
          + "Config\022S\n\017disabled_reason\030\035 \003(\0162:.google"
          + ".events.cloud.datafusion.v1.Instance.Dis"
          + "abledReason\022S\n\024event_publish_config\030\036 \001("
          + "\01325.google.events.cloud.datafusion.v1.Ev"
          + "entPublishConfig\022\036\n\026enable_zone_separati"
          + "on\030\037 \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\001\032.\n\014OptionsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"F\n\004Type\022\024\n\020TYPE_"
          + "UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\016\n\nENTERPRISE\020\002"
          + "\022\r\n\tDEVELOPER\020\003\"\264\001\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\n\n\006FA"
          + "ILED\020\003\022\014\n\010DELETING\020\004\022\r\n\tUPGRADING\020\005\022\016\n\nR"
          + "ESTARTING\020\006\022\014\n\010UPDATING\020\007\022\021\n\rAUTO_UPDATI"
          + "NG\020\010\022\022\n\016AUTO_UPGRADING\020\t\022\014\n\010DISABLED\020\n\"D"
          + "\n\016DisabledReason\022\037\n\033DISABLED_REASON_UNSP"
          + "ECIFIED\020\000\022\021\n\rKMS_KEY_ISSUE\020\001\"4\n\022EventPub"
          + "lishConfig\022\017\n\007enabled\030\001 \001(\010\022\r\n\005topic\030\002 \001"
          + "(\t\"o\n\nDnsPeering\022\014\n\004name\030\001 \001(\t\022\016\n\006domain"
          + "\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\026\n\016target_pr"
          + "oject\030\004 \001(\t\022\026\n\016target_network\030\005 \001(\t\"b\n\021I"
          + "nstanceEventData\022A\n\007payload\030\001 \001(\0132+.goog"
          + "le.events.cloud.datafusion.v1.InstanceH\000"
          + "\210\001\001B\n\n\010_payload\"f\n\023DnsPeeringEventData\022C"
          + "\n\007payload\030\001 \001(\0132-.google.events.cloud.da"
          + "tafusion.v1.DnsPeeringH\000\210\001\001B\n\n\010_payloadB"
          + "\242\001\n%com.google.events.cloud.datafusion.v"
          + "1P\001\252\002*Google.Events.Protobuf.Cloud.DataF"
          + "usion.V1\312\002!Google\\Events\\Cloud\\DataFusio"
          + "n\\V1\352\002%Google::Events::Cloud::DataFusion"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_datafusion_v1_NetworkConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_NetworkConfig_descriptor,
            new java.lang.String[] {
              "Network", "IpAllocation",
            });
    internal_static_google_events_cloud_datafusion_v1_Version_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_datafusion_v1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_Version_descriptor,
            new java.lang.String[] {
              "VersionNumber", "DefaultVersion", "AvailableFeatures", "Type",
            });
    internal_static_google_events_cloud_datafusion_v1_Accelerator_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_datafusion_v1_Accelerator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_Accelerator_descriptor,
            new java.lang.String[] {
              "AcceleratorType", "State",
            });
    internal_static_google_events_cloud_datafusion_v1_CryptoKeyConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_CryptoKeyConfig_descriptor,
            new java.lang.String[] {
              "KeyReference",
            });
    internal_static_google_events_cloud_datafusion_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_datafusion_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Type",
              "EnableStackdriverLogging",
              "EnableStackdriverMonitoring",
              "PrivateInstance",
              "NetworkConfig",
              "Labels",
              "Options",
              "CreateTime",
              "UpdateTime",
              "State",
              "StateMessage",
              "ServiceEndpoint",
              "Zone",
              "Version",
              "ServiceAccount",
              "DisplayName",
              "AvailableVersion",
              "ApiEndpoint",
              "GcsBucket",
              "Accelerators",
              "P4ServiceAccount",
              "TenantProjectId",
              "DataprocServiceAccount",
              "EnableRbac",
              "CryptoKeyConfig",
              "DisabledReason",
              "EventPublishConfig",
              "EnableZoneSeparation",
            });
    internal_static_google_events_cloud_datafusion_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_events_cloud_datafusion_v1_Instance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_datafusion_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_datafusion_v1_Instance_OptionsEntry_descriptor =
        internal_static_google_events_cloud_datafusion_v1_Instance_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_datafusion_v1_Instance_OptionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_Instance_OptionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_datafusion_v1_EventPublishConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_datafusion_v1_EventPublishConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_EventPublishConfig_descriptor,
            new java.lang.String[] {
              "Enabled", "Topic",
            });
    internal_static_google_events_cloud_datafusion_v1_DnsPeering_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_events_cloud_datafusion_v1_DnsPeering_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_DnsPeering_descriptor,
            new java.lang.String[] {
              "Name", "Domain", "Description", "TargetProject", "TargetNetwork",
            });
    internal_static_google_events_cloud_datafusion_v1_InstanceEventData_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_events_cloud_datafusion_v1_InstanceEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_InstanceEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_datafusion_v1_DnsPeeringEventData_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_events_cloud_datafusion_v1_DnsPeeringEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_datafusion_v1_DnsPeeringEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
