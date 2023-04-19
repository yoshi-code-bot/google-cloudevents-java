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
// source: google/events/cloud/functions/v2/data.proto

package com.google.events.cloud.functions.v2;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_Function_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_Function_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_Function_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_Function_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_StateMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_StateMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_StorageSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_StorageSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_RepoSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_RepoSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_Source_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_Source_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_SourceProvenance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_BuildConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_BuildConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_BuildConfig_EnvironmentVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_BuildConfig_EnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_ServiceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_ServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_ServiceConfig_EnvironmentVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_ServiceConfig_EnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_SecretEnvVar_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_SecretEnvVar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_SecretVolume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_SecretVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_SecretVolume_SecretVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_SecretVolume_SecretVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_EventTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_EventTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_EventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_EventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_functions_v2_FunctionEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_functions_v2_FunctionEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/events/cloud/functions/v2/data."
          + "proto\022 google.events.cloud.functions.v2\032"
          + "\037google/protobuf/timestamp.proto\"\331\005\n\010Fun"
          + "ction\022\014\n\004name\030\001 \001(\t\022B\n\013environment\030\n \001(\016"
          + "2-.google.events.cloud.functions.v2.Envi"
          + "ronment\022\023\n\013description\030\002 \001(\t\022C\n\014build_co"
          + "nfig\030\003 \001(\0132-.google.events.cloud.functio"
          + "ns.v2.BuildConfig\022G\n\016service_config\030\004 \001("
          + "\0132/.google.events.cloud.functions.v2.Ser"
          + "viceConfig\022E\n\revent_trigger\030\005 \001(\0132..goog"
          + "le.events.cloud.functions.v2.EventTrigge"
          + "r\022?\n\005state\030\006 \001(\01620.google.events.cloud.f"
          + "unctions.v2.Function.State\022/\n\013update_tim"
          + "e\030\007 \001(\0132\032.google.protobuf.Timestamp\022F\n\006l"
          + "abels\030\010 \003(\01326.google.events.cloud.functi"
          + "ons.v2.Function.LabelsEntry\022F\n\016state_mes"
          + "sages\030\t \003(\0132..google.events.cloud.functi"
          + "ons.v2.StateMessage\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006FAILED"
          + "\020\002\022\r\n\tDEPLOYING\020\003\022\014\n\010DELETING\020\004\022\013\n\007UNKNO"
          + "WN\020\005\"\300\001\n\014StateMessage\022I\n\010severity\030\001 \001(\0162"
          + "7.google.events.cloud.functions.v2.State"
          + "Message.Severity\022\014\n\004type\030\002 \001(\t\022\017\n\007messag"
          + "e\030\003 \001(\t\"F\n\010Severity\022\030\n\024SEVERITY_UNSPECIF"
          + "IED\020\000\022\t\n\005ERROR\020\001\022\013\n\007WARNING\020\002\022\010\n\004INFO\020\003\""
          + "C\n\rStorageSource\022\016\n\006bucket\030\001 \001(\t\022\016\n\006obje"
          + "ct\030\002 \001(\t\022\022\n\ngeneration\030\003 \001(\003\"\243\001\n\nRepoSou"
          + "rce\022\025\n\013branch_name\030\003 \001(\tH\000\022\022\n\010tag_name\030\004"
          + " \001(\tH\000\022\024\n\ncommit_sha\030\005 \001(\tH\000\022\022\n\nproject_"
          + "id\030\001 \001(\t\022\021\n\trepo_name\030\002 \001(\t\022\013\n\003dir\030\006 \001(\t"
          + "\022\024\n\014invert_regex\030\007 \001(\010B\n\n\010revision\"\242\001\n\006S"
          + "ource\022I\n\016storage_source\030\001 \001(\0132/.google.e"
          + "vents.cloud.functions.v2.StorageSourceH\000"
          + "\022C\n\013repo_source\030\002 \001(\0132,.google.events.cl"
          + "oud.functions.v2.RepoSourceH\000B\010\n\006source\""
          + "\260\001\n\020SourceProvenance\022P\n\027resolved_storage"
          + "_source\030\001 \001(\0132/.google.events.cloud.func"
          + "tions.v2.StorageSource\022J\n\024resolved_repo_"
          + "source\030\002 \001(\0132,.google.events.cloud.funct"
          + "ions.v2.RepoSource\"\362\004\n\013BuildConfig\022\r\n\005bu"
          + "ild\030\001 \001(\t\022\017\n\007runtime\030\002 \001(\t\022\023\n\013entry_poin"
          + "t\030\003 \001(\t\0228\n\006source\030\004 \001(\0132(.google.events."
          + "cloud.functions.v2.Source\022M\n\021source_prov"
          + "enance\030\010 \001(\01322.google.events.cloud.funct"
          + "ions.v2.SourceProvenance\022\023\n\013worker_pool\030"
          + "\005 \001(\t\022f\n\025environment_variables\030\006 \003(\0132G.g"
          + "oogle.events.cloud.functions.v2.BuildCon"
          + "fig.EnvironmentVariablesEntry\022U\n\017docker_"
          + "registry\030\n \001(\0162<.google.events.cloud.fun"
          + "ctions.v2.BuildConfig.DockerRegistry\022\031\n\021"
          + "docker_repository\030\007 \001(\t\022\027\n\017buildpack_sta"
          + "ck\030\t \001(\t\032;\n\031EnvironmentVariablesEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\016DockerR"
          + "egistry\022\037\n\033DOCKER_REGISTRY_UNSPECIFIED\020\000"
          + "\022\026\n\022CONTAINER_REGISTRY\020\001\022\025\n\021ARTIFACT_REG"
          + "ISTRY\020\002\"\375\t\n\rServiceConfig\022\017\n\007service\030\001 \001"
          + "(\t\022\027\n\017timeout_seconds\030\002 \001(\005\022\030\n\020available"
          + "_memory\030\r \001(\t\022\025\n\ravailable_cpu\030\026 \001(\t\022h\n\025"
          + "environment_variables\030\004 \003(\0132I.google.eve"
          + "nts.cloud.functions.v2.ServiceConfig.Env"
          + "ironmentVariablesEntry\022\032\n\022max_instance_c"
          + "ount\030\005 \001(\005\022\032\n\022min_instance_count\030\014 \001(\005\022\025"
          + "\n\rvpc_connector\030\006 \001(\t\022q\n\035vpc_connector_e"
          + "gress_settings\030\007 \001(\0162J.google.events.clo"
          + "ud.functions.v2.ServiceConfig.VpcConnect"
          + "orEgressSettings\022Y\n\020ingress_settings\030\010 \001"
          + "(\0162?.google.events.cloud.functions.v2.Se"
          + "rviceConfig.IngressSettings\022\013\n\003uri\030\t \001(\t"
          + "\022\035\n\025service_account_email\030\n \001(\t\022&\n\036all_t"
          + "raffic_on_latest_revision\030\020 \001(\010\022T\n\034secre"
          + "t_environment_variables\030\021 \003(\0132..google.e"
          + "vents.cloud.functions.v2.SecretEnvVar\022F\n"
          + "\016secret_volumes\030\023 \003(\0132..google.events.cl"
          + "oud.functions.v2.SecretVolume\022\020\n\010revisio"
          + "n\030\022 \001(\t\022(\n max_instance_request_concurre"
          + "ncy\030\024 \001(\005\022U\n\016security_level\030\025 \001(\0162=.goog"
          + "le.events.cloud.functions.v2.ServiceConf"
          + "ig.SecurityLevel\032;\n\031EnvironmentVariables"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"u\n"
          + "\032VpcConnectorEgressSettings\022-\n)VPC_CONNE"
          + "CTOR_EGRESS_SETTINGS_UNSPECIFIED\020\000\022\027\n\023PR"
          + "IVATE_RANGES_ONLY\020\001\022\017\n\013ALL_TRAFFIC\020\002\"x\n\017"
          + "IngressSettings\022 \n\034INGRESS_SETTINGS_UNSP"
          + "ECIFIED\020\000\022\r\n\tALLOW_ALL\020\001\022\027\n\023ALLOW_INTERN"
          + "AL_ONLY\020\002\022\033\n\027ALLOW_INTERNAL_AND_GCLB\020\003\"W"
          + "\n\rSecurityLevel\022\036\n\032SECURITY_LEVEL_UNSPEC"
          + "IFIED\020\000\022\021\n\rSECURE_ALWAYS\020\001\022\023\n\017SECURE_OPT"
          + "IONAL\020\002\"P\n\014SecretEnvVar\022\013\n\003key\030\001 \001(\t\022\022\n\n"
          + "project_id\030\002 \001(\t\022\016\n\006secret\030\003 \001(\t\022\017\n\007vers"
          + "ion\030\004 \001(\t\"\306\001\n\014SecretVolume\022\022\n\nmount_path"
          + "\030\001 \001(\t\022\022\n\nproject_id\030\002 \001(\t\022\016\n\006secret\030\003 \001"
          + "(\t\022N\n\010versions\030\004 \003(\0132<.google.events.clo"
          + "ud.functions.v2.SecretVolume.SecretVersi"
          + "on\032.\n\rSecretVersion\022\017\n\007version\030\001 \001(\t\022\014\n\004"
          + "path\030\002 \001(\t\"\215\003\n\014EventTrigger\022\017\n\007trigger\030\001"
          + " \001(\t\022\026\n\016trigger_region\030\002 \001(\t\022\022\n\nevent_ty"
          + "pe\030\003 \001(\t\022D\n\revent_filters\030\004 \003(\0132-.google"
          + ".events.cloud.functions.v2.EventFilter\022\024"
          + "\n\014pubsub_topic\030\005 \001(\t\022\035\n\025service_account_"
          + "email\030\006 \001(\t\022P\n\014retry_policy\030\007 \001(\0162:.goog"
          + "le.events.cloud.functions.v2.EventTrigge"
          + "r.RetryPolicy\022\017\n\007channel\030\010 \001(\t\"b\n\013RetryP"
          + "olicy\022\034\n\030RETRY_POLICY_UNSPECIFIED\020\000\022\035\n\031R"
          + "ETRY_POLICY_DO_NOT_RETRY\020\001\022\026\n\022RETRY_POLI"
          + "CY_RETRY\020\002\"A\n\013EventFilter\022\021\n\tattribute\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t\022\020\n\010operator\030\003 \001(\t\"a\n"
          + "\021FunctionEventData\022@\n\007payload\030\001 \001(\0132*.go"
          + "ogle.events.cloud.functions.v2.FunctionH"
          + "\000\210\001\001B\n\n\010_payload*@\n\013Environment\022\033\n\027ENVIR"
          + "ONMENT_UNSPECIFIED\020\000\022\t\n\005GEN_1\020\001\022\t\n\005GEN_2"
          + "\020\002B\236\001\n$com.google.events.cloud.functions"
          + ".v2P\001\252\002)Google.Events.Protobuf.Cloud.Fun"
          + "ctions.V2\312\002 Google\\Events\\Cloud\\Function"
          + "s\\V2\352\002$Google::Events::Cloud::Functions:"
          + ":V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_functions_v2_Function_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_functions_v2_Function_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_Function_descriptor,
            new java.lang.String[] {
              "Name",
              "Environment",
              "Description",
              "BuildConfig",
              "ServiceConfig",
              "EventTrigger",
              "State",
              "UpdateTime",
              "Labels",
              "StateMessages",
            });
    internal_static_google_events_cloud_functions_v2_Function_LabelsEntry_descriptor =
        internal_static_google_events_cloud_functions_v2_Function_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_functions_v2_Function_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_Function_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_functions_v2_StateMessage_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_functions_v2_StateMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_StateMessage_descriptor,
            new java.lang.String[] {
              "Severity", "Type", "Message",
            });
    internal_static_google_events_cloud_functions_v2_StorageSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_functions_v2_StorageSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_StorageSource_descriptor,
            new java.lang.String[] {
              "Bucket", "Object", "Generation",
            });
    internal_static_google_events_cloud_functions_v2_RepoSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_functions_v2_RepoSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_RepoSource_descriptor,
            new java.lang.String[] {
              "BranchName",
              "TagName",
              "CommitSha",
              "ProjectId",
              "RepoName",
              "Dir",
              "InvertRegex",
              "Revision",
            });
    internal_static_google_events_cloud_functions_v2_Source_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_functions_v2_Source_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_Source_descriptor,
            new java.lang.String[] {
              "StorageSource", "RepoSource", "Source",
            });
    internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_functions_v2_SourceProvenance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor,
            new java.lang.String[] {
              "ResolvedStorageSource", "ResolvedRepoSource",
            });
    internal_static_google_events_cloud_functions_v2_BuildConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_events_cloud_functions_v2_BuildConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_BuildConfig_descriptor,
            new java.lang.String[] {
              "Build",
              "Runtime",
              "EntryPoint",
              "Source",
              "SourceProvenance",
              "WorkerPool",
              "EnvironmentVariables",
              "DockerRegistry",
              "DockerRepository",
              "BuildpackStack",
            });
    internal_static_google_events_cloud_functions_v2_BuildConfig_EnvironmentVariablesEntry_descriptor =
        internal_static_google_events_cloud_functions_v2_BuildConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_functions_v2_BuildConfig_EnvironmentVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_BuildConfig_EnvironmentVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_functions_v2_ServiceConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_events_cloud_functions_v2_ServiceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_ServiceConfig_descriptor,
            new java.lang.String[] {
              "Service",
              "TimeoutSeconds",
              "AvailableMemory",
              "AvailableCpu",
              "EnvironmentVariables",
              "MaxInstanceCount",
              "MinInstanceCount",
              "VpcConnector",
              "VpcConnectorEgressSettings",
              "IngressSettings",
              "Uri",
              "ServiceAccountEmail",
              "AllTrafficOnLatestRevision",
              "SecretEnvironmentVariables",
              "SecretVolumes",
              "Revision",
              "MaxInstanceRequestConcurrency",
              "SecurityLevel",
            });
    internal_static_google_events_cloud_functions_v2_ServiceConfig_EnvironmentVariablesEntry_descriptor =
        internal_static_google_events_cloud_functions_v2_ServiceConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_functions_v2_ServiceConfig_EnvironmentVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_ServiceConfig_EnvironmentVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_functions_v2_SecretEnvVar_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_events_cloud_functions_v2_SecretEnvVar_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_SecretEnvVar_descriptor,
            new java.lang.String[] {
              "Key", "ProjectId", "Secret", "Version",
            });
    internal_static_google_events_cloud_functions_v2_SecretVolume_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_events_cloud_functions_v2_SecretVolume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_SecretVolume_descriptor,
            new java.lang.String[] {
              "MountPath", "ProjectId", "Secret", "Versions",
            });
    internal_static_google_events_cloud_functions_v2_SecretVolume_SecretVersion_descriptor =
        internal_static_google_events_cloud_functions_v2_SecretVolume_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_functions_v2_SecretVolume_SecretVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_SecretVolume_SecretVersion_descriptor,
            new java.lang.String[] {
              "Version", "Path",
            });
    internal_static_google_events_cloud_functions_v2_EventTrigger_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_events_cloud_functions_v2_EventTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_EventTrigger_descriptor,
            new java.lang.String[] {
              "Trigger",
              "TriggerRegion",
              "EventType",
              "EventFilters",
              "PubsubTopic",
              "ServiceAccountEmail",
              "RetryPolicy",
              "Channel",
            });
    internal_static_google_events_cloud_functions_v2_EventFilter_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_events_cloud_functions_v2_EventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_EventFilter_descriptor,
            new java.lang.String[] {
              "Attribute", "Value", "Operator",
            });
    internal_static_google_events_cloud_functions_v2_FunctionEventData_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_events_cloud_functions_v2_FunctionEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_functions_v2_FunctionEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
