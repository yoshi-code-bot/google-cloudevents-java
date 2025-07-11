/*
 * Copyright 2025 Google LLC
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
// source: google/events/cloud/beyondcorp/appconnectors/v1/data.proto

package com.google.events.cloud.beyondcorp.appconnectors.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_ResourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_ServiceAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_ServiceAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnectorEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnectorEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/events/cloud/beyondcorp/appconn"
          + "ectors/v1/data.proto\022/google.events.clou"
          + "d.beyondcorp.appconnectors.v1\032\037google/pr"
          + "otobuf/timestamp.proto\"\337\001\n\014ResourceInfo\022"
          + "\n\n\002id\030\001 \001(\t\022M\n\006status\030\002 \001(\0162=.google.eve"
          + "nts.cloud.beyondcorp.appconnectors.v1.He"
          + "althStatus\022(\n\004time\030\004 \001(\0132\032.google.protob"
          + "uf.Timestamp\022J\n\003sub\030\005 \003(\0132=.google.event"
          + "s.cloud.beyondcorp.appconnectors.v1.Reso"
          + "urceInfo\"\315\006\n\014AppConnector\022\014\n\004name\030\001 \001(\t\022"
          + "/\n\013create_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestamp\022/\n\013update_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022Y\n\006labels\030\004 \003(\0132I.goog"
          + "le.events.cloud.beyondcorp.appconnectors"
          + ".v1.AppConnector.LabelsEntry\022\024\n\014display_"
          + "name\030\005 \001(\t\022\013\n\003uid\030\006 \001(\t\022R\n\005state\030\007 \001(\0162C"
          + ".google.events.cloud.beyondcorp.appconne"
          + "ctors.v1.AppConnector.State\022c\n\016principal"
          + "_info\030\010 \001(\0132K.google.events.cloud.beyond"
          + "corp.appconnectors.v1.AppConnector.Princ"
          + "ipalInfo\022T\n\rresource_info\030\013 \001(\0132=.google"
          + ".events.cloud.beyondcorp.appconnectors.v"
          + "1.ResourceInfo\032\257\001\n\rPrincipalInfo\022u\n\017serv"
          + "ice_account\030\001 \001(\0132Z.google.events.cloud."
          + "beyondcorp.appconnectors.v1.AppConnector"
          + ".PrincipalInfo.ServiceAccountH\000\032\037\n\016Servi"
          + "ceAccount\022\r\n\005email\030\001 \001(\tB\006\n\004type\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "_\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREAT"
          + "ING\020\001\022\013\n\007CREATED\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DELE"
          + "TING\020\004\022\010\n\004DOWN\020\005\"x\n\025AppConnectorEventDat"
          + "a\022S\n\007payload\030\001 \001(\0132=.google.events.cloud"
          + ".beyondcorp.appconnectors.v1.AppConnecto"
          + "rH\000\210\001\001B\n\n\010_payload*i\n\014HealthStatus\022\035\n\031HE"
          + "ALTH_STATUS_UNSPECIFIED\020\000\022\013\n\007HEALTHY\020\001\022\r"
          + "\n\tUNHEALTHY\020\002\022\020\n\014UNRESPONSIVE\020\003\022\014\n\010DEGRA"
          + "DED\020\004B\333\001\n3com.google.events.cloud.beyond"
          + "corp.appconnectors.v1P\001\252\0028Google.Events."
          + "Protobuf.Cloud.BeyondCorp.AppConnectors."
          + "V1\312\002/Google\\Events\\Cloud\\BeyondCorp\\AppC"
          + "onnectors\\V1\352\0024Google::Events::Cloud::Be"
          + "yondCorp::AppConnectors::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_ResourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor,
            new java.lang.String[] {
              "Id", "Status", "Time", "Sub",
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "Uid",
              "State",
              "PrincipalInfo",
              "ResourceInfo",
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_descriptor,
            new java.lang.String[] {
              "ServiceAccount", "Type",
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_ServiceAccount_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_ServiceAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_PrincipalInfo_ServiceAccount_descriptor,
            new java.lang.String[] {
              "Email",
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_LabelsEntry_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnector_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnectorEventData_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnectorEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnectors_v1_AppConnectorEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
