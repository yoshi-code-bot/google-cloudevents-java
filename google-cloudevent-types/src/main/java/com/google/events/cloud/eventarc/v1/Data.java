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
// source: google/events/cloud/eventarc/v1/data.proto

package com.google.events.cloud.eventarc.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Channel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Channel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_ChannelConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_ChannelConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Trigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Trigger_ConditionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Trigger_ConditionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_EventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_EventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_StateCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_StateCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Transport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Transport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_CloudRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_CloudRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_GKE_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_GKE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_Pubsub_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_Pubsub_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_TriggerEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_TriggerEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_ChannelEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_ChannelEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/events/cloud/eventarc/v1/data.p"
          + "roto\022\037google.events.cloud.eventarc.v1\032\037g"
          + "oogle/protobuf/timestamp.proto\032\025google/r"
          + "pc/code.proto\"\366\002\n\007Channel\022\014\n\004name\030\001 \001(\t\022"
          + "\013\n\003uid\030\002 \001(\t\022/\n\013create_time\030\005 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022/\n\013update_time\030\006 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\020\n\010provid"
          + "er\030\007 \001(\t\022\026\n\014pubsub_topic\030\010 \001(\tH\000\022=\n\005stat"
          + "e\030\t \001(\0162..google.events.cloud.eventarc.v"
          + "1.Channel.State\022\030\n\020activation_token\030\n \001("
          + "\t\022\027\n\017crypto_key_name\030\013 \001(\t\"E\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\n\n\006ACTIV"
          + "E\020\002\022\014\n\010INACTIVE\020\003B\013\n\ttransport\"\241\001\n\021Chann"
          + "elConnection\022\014\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022"
          + "\017\n\007channel\030\005 \001(\t\022/\n\013create_time\030\006 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\007 \001(\0132\032.google.protobuf.Timestamp\"\315\005\n\007T"
          + "rigger\022\014\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022/\n\013cre"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\022C\n\revent_filters\030\010 \003(\0132,.goo"
          + "gle.events.cloud.eventarc.v1.EventFilter"
          + "\022\027\n\017service_account\030\t \001(\t\022A\n\013destination"
          + "\030\n \001(\0132,.google.events.cloud.eventarc.v1"
          + ".Destination\022=\n\ttransport\030\013 \001(\0132*.google"
          + ".events.cloud.eventarc.v1.Transport\022D\n\006l"
          + "abels\030\014 \003(\01324.google.events.cloud.eventa"
          + "rc.v1.Trigger.LabelsEntry\022\017\n\007channel\030\r \001"
          + "(\t\022L\n\nconditions\030\017 \003(\01328.google.events.c"
          + "loud.eventarc.v1.Trigger.ConditionsEntry"
          + "\022\037\n\027event_data_content_type\030\020 \001(\t\022\014\n\004eta"
          + "g\030c \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\032b\n\017ConditionsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022>\n\005value\030\002 \001(\0132/.google.events.cl"
          + "oud.eventarc.v1.StateCondition:\0028\001\"A\n\013Ev"
          + "entFilter\022\021\n\tattribute\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t\022\020\n\010operator\030\003 \001(\t\"A\n\016StateCondition\022"
          + "\036\n\004code\030\001 \001(\0162\020.google.rpc.Code\022\017\n\007messa"
          + "ge\030\002 \001(\t\"\276\001\n\013Destination\022>\n\tcloud_run\030\001 "
          + "\001(\0132).google.events.cloud.eventarc.v1.Cl"
          + "oudRunH\000\022\030\n\016cloud_function\030\002 \001(\tH\000\0223\n\003gk"
          + "e\030\003 \001(\0132$.google.events.cloud.eventarc.v"
          + "1.GKEH\000\022\022\n\010workflow\030\004 \001(\tH\000B\014\n\ndescripto"
          + "r\"V\n\tTransport\0229\n\006pubsub\030\001 \001(\0132\'.google."
          + "events.cloud.eventarc.v1.PubsubH\000B\016\n\014int"
          + "ermediary\"9\n\010CloudRun\022\017\n\007service\030\001 \001(\t\022\014"
          + "\n\004path\030\002 \001(\t\022\016\n\006region\030\003 \001(\t\"Z\n\003GKE\022\017\n\007c"
          + "luster\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\022\021\n\tnamesp"
          + "ace\030\003 \001(\t\022\017\n\007service\030\004 \001(\t\022\014\n\004path\030\005 \001(\t"
          + "\"-\n\006Pubsub\022\r\n\005topic\030\001 \001(\t\022\024\n\014subscriptio"
          + "n\030\002 \001(\t\"M\n\020TriggerEventData\0229\n\007payload\030\001"
          + " \001(\0132(.google.events.cloud.eventarc.v1.T"
          + "rigger\"M\n\020ChannelEventData\0229\n\007payload\030\001 "
          + "\001(\0132(.google.events.cloud.eventarc.v1.Ch"
          + "annel\"a\n\032ChannelConnectionEventData\022C\n\007p"
          + "ayload\030\001 \001(\01322.google.events.cloud.event"
          + "arc.v1.ChannelConnectionB\232\001\n#com.google."
          + "events.cloud.eventarc.v1P\001\252\002(Google.Even"
          + "ts.Protobuf.Cloud.Eventarc.V1\312\002\037Google\\E"
          + "vents\\Cloud\\Eventarc\\V1\352\002#Google::Events"
          + "::Cloud::Eventarc::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.CodeProto.getDescriptor(),
            });
    internal_static_google_events_cloud_eventarc_v1_Channel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_eventarc_v1_Channel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Channel_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Provider",
              "PubsubTopic",
              "State",
              "ActivationToken",
              "CryptoKeyName",
              "Transport",
            });
    internal_static_google_events_cloud_eventarc_v1_ChannelConnection_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_eventarc_v1_ChannelConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_ChannelConnection_descriptor,
            new java.lang.String[] {
              "Name", "Uid", "Channel", "CreateTime", "UpdateTime",
            });
    internal_static_google_events_cloud_eventarc_v1_Trigger_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_eventarc_v1_Trigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Trigger_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "EventFilters",
              "ServiceAccount",
              "Destination",
              "Transport",
              "Labels",
              "Channel",
              "Conditions",
              "EventDataContentType",
              "Etag",
            });
    internal_static_google_events_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor =
        internal_static_google_events_cloud_eventarc_v1_Trigger_descriptor.getNestedTypes().get(0);
    internal_static_google_events_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_eventarc_v1_Trigger_ConditionsEntry_descriptor =
        internal_static_google_events_cloud_eventarc_v1_Trigger_descriptor.getNestedTypes().get(1);
    internal_static_google_events_cloud_eventarc_v1_Trigger_ConditionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Trigger_ConditionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_eventarc_v1_EventFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_eventarc_v1_EventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_EventFilter_descriptor,
            new java.lang.String[] {
              "Attribute", "Value", "Operator",
            });
    internal_static_google_events_cloud_eventarc_v1_StateCondition_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_eventarc_v1_StateCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_StateCondition_descriptor,
            new java.lang.String[] {
              "Code", "Message",
            });
    internal_static_google_events_cloud_eventarc_v1_Destination_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_eventarc_v1_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Destination_descriptor,
            new java.lang.String[] {
              "CloudRun", "CloudFunction", "Gke", "Workflow", "Descriptor",
            });
    internal_static_google_events_cloud_eventarc_v1_Transport_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_events_cloud_eventarc_v1_Transport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Transport_descriptor,
            new java.lang.String[] {
              "Pubsub", "Intermediary",
            });
    internal_static_google_events_cloud_eventarc_v1_CloudRun_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_events_cloud_eventarc_v1_CloudRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_CloudRun_descriptor,
            new java.lang.String[] {
              "Service", "Path", "Region",
            });
    internal_static_google_events_cloud_eventarc_v1_GKE_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_events_cloud_eventarc_v1_GKE_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_GKE_descriptor,
            new java.lang.String[] {
              "Cluster", "Location", "Namespace", "Service", "Path",
            });
    internal_static_google_events_cloud_eventarc_v1_Pubsub_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_events_cloud_eventarc_v1_Pubsub_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_Pubsub_descriptor,
            new java.lang.String[] {
              "Topic", "Subscription",
            });
    internal_static_google_events_cloud_eventarc_v1_TriggerEventData_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_events_cloud_eventarc_v1_TriggerEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_TriggerEventData_descriptor,
            new java.lang.String[] {
              "Payload",
            });
    internal_static_google_events_cloud_eventarc_v1_ChannelEventData_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_events_cloud_eventarc_v1_ChannelEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_ChannelEventData_descriptor,
            new java.lang.String[] {
              "Payload",
            });
    internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor,
            new java.lang.String[] {
              "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.CodeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}