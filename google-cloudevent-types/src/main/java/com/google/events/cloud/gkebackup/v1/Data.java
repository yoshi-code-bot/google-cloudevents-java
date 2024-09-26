/*
 * Copyright 2024 Google LLC
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
// source: google/events/cloud/gkebackup/v1/data.proto

package com.google.events.cloud.gkebackup.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Namespaces_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Namespaces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_NamespacedName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_NamespacedNames_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_EncryptionKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Backup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Backup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Restore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Restore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_Restore_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_GroupKind_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestorePlan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestorePlanEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestorePlanEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_BackupPlanEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_BackupPlanEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_gkebackup_v1_RestoreEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_gkebackup_v1_RestoreEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/events/cloud/gkebackup/v1/data."
          + "proto\022 google.events.cloud.gkebackup.v1\032"
          + "\037google/protobuf/timestamp.proto\" \n\nName"
          + "spaces\022\022\n\nnamespaces\030\001 \003(\t\"1\n\016Namespaced"
          + "Name\022\021\n\tnamespace\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\"]\n"
          + "\017NamespacedNames\022J\n\020namespaced_names\030\001 \003"
          + "(\01320.google.events.cloud.gkebackup.v1.Na"
          + "mespacedName\"/\n\rEncryptionKey\022\036\n\026gcp_kms"
          + "_encryption_key\030\001 \001(\t\"\377\013\n\006Backup\022\014\n\004name"
          + "\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022/\n\013create_time\030\003 \001(\013"
          + "2\032.google.protobuf.Timestamp\022/\n\013update_t"
          + "ime\030\004 \001(\0132\032.google.protobuf.Timestamp\022\016\n"
          + "\006manual\030\005 \001(\010\022D\n\006labels\030\006 \003(\01324.google.e"
          + "vents.cloud.gkebackup.v1.Backup.LabelsEn"
          + "try\022\030\n\020delete_lock_days\030\007 \001(\005\022;\n\027delete_"
          + "lock_expire_time\030\010 \001(\0132\032.google.protobuf"
          + ".Timestamp\022\023\n\013retain_days\030\t \001(\005\0226\n\022retai"
          + "n_expire_time\030\n \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022G\n\016encryption_key\030\013 \001(\0132/.google"
          + ".events.cloud.gkebackup.v1.EncryptionKey"
          + "\022\030\n\016all_namespaces\030\014 \001(\010H\000\022K\n\023selected_n"
          + "amespaces\030\r \001(\0132,.google.events.cloud.gk"
          + "ebackup.v1.NamespacesH\000\022R\n\025selected_appl"
          + "ications\030\016 \001(\01321.google.events.cloud.gke"
          + "backup.v1.NamespacedNamesH\000\022\034\n\024contains_"
          + "volume_data\030\017 \001(\010\022\030\n\020contains_secrets\030\020 "
          + "\001(\010\022R\n\020cluster_metadata\030\021 \001(\01328.google.e"
          + "vents.cloud.gkebackup.v1.Backup.ClusterM"
          + "etadata\022=\n\005state\030\022 \001(\0162..google.events.c"
          + "loud.gkebackup.v1.Backup.State\022\024\n\014state_"
          + "reason\030\023 \001(\t\0221\n\rcomplete_time\030\024 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022\026\n\016resource_coun"
          + "t\030\025 \001(\005\022\024\n\014volume_count\030\026 \001(\005\022\022\n\nsize_by"
          + "tes\030\027 \001(\003\022\014\n\004etag\030\030 \001(\t\022\023\n\013description\030\031"
          + " \001(\t\022\021\n\tpod_count\030\032 \001(\005\022 \n\030config_backup"
          + "_size_bytes\030\033 \001(\003\032\244\002\n\017ClusterMetadata\022\017\n"
          + "\007cluster\030\001 \001(\t\022\023\n\013k8s_version\030\002 \001(\t\022l\n\023b"
          + "ackup_crd_versions\030\003 \003(\0132O.google.events"
          + ".cloud.gkebackup.v1.Backup.ClusterMetada"
          + "ta.BackupCrdVersionsEntry\022\025\n\013gke_version"
          + "\030\004 \001(\tH\000\022\030\n\016anthos_version\030\005 \001(\tH\000\0328\n\026Ba"
          + "ckupCrdVersionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001B\022\n\020platform_version\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "f\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREAT"
          + "ING\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n"
          + "\006FAILED\020\004\022\014\n\010DELETING\020\005B\016\n\014backup_scope\""
          + "\320\010\n\nBackupPlan\022\014\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001("
          + "\t\022/\n\013create_time\030\003 \001(\0132\032.google.protobuf"
          + ".Timestamp\022/\n\013update_time\030\004 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\023\n\013description\030\005 \001(\t"
          + "\022\017\n\007cluster\030\006 \001(\t\022V\n\020retention_policy\030\007 "
          + "\001(\0132<.google.events.cloud.gkebackup.v1.B"
          + "ackupPlan.RetentionPolicy\022H\n\006labels\030\010 \003("
          + "\01328.google.events.cloud.gkebackup.v1.Bac"
          + "kupPlan.LabelsEntry\022N\n\017backup_schedule\030\t"
          + " \001(\01325.google.events.cloud.gkebackup.v1."
          + "BackupPlan.Schedule\022\014\n\004etag\030\n \001(\t\022\023\n\013dea"
          + "ctivated\030\013 \001(\010\022P\n\rbackup_config\030\014 \001(\01329."
          + "google.events.cloud.gkebackup.v1.BackupP"
          + "lan.BackupConfig\022\033\n\023protected_pod_count\030"
          + "\r \001(\005\032^\n\017RetentionPolicy\022\037\n\027backup_delet"
          + "e_lock_days\030\001 \001(\005\022\032\n\022backup_retain_days\030"
          + "\002 \001(\005\022\016\n\006locked\030\003 \001(\010\0321\n\010Schedule\022\025\n\rcro"
          + "n_schedule\030\001 \001(\t\022\016\n\006paused\030\002 \001(\010\032\330\002\n\014Bac"
          + "kupConfig\022\030\n\016all_namespaces\030\001 \001(\010H\000\022K\n\023s"
          + "elected_namespaces\030\002 \001(\0132,.google.events"
          + ".cloud.gkebackup.v1.NamespacesH\000\022R\n\025sele"
          + "cted_applications\030\003 \001(\01321.google.events."
          + "cloud.gkebackup.v1.NamespacedNamesH\000\022\033\n\023"
          + "include_volume_data\030\004 \001(\010\022\027\n\017include_sec"
          + "rets\030\005 \001(\010\022G\n\016encryption_key\030\006 \001(\0132/.goo"
          + "gle.events.cloud.gkebackup.v1.Encryption"
          + "KeyB\016\n\014backup_scope\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\376\005\n\007Restore\022\014"
          + "\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022/\n\013create_time"
          + "\030\003 \001(\0132\032.google.protobuf.Timestamp\022/\n\013up"
          + "date_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "amp\022\023\n\013description\030\005 \001(\t\022\016\n\006backup\030\006 \001(\t"
          + "\022\017\n\007cluster\030\007 \001(\t\022G\n\016restore_config\030\010 \001("
          + "\0132/.google.events.cloud.gkebackup.v1.Res"
          + "toreConfig\022E\n\006labels\030\t \003(\01325.google.even"
          + "ts.cloud.gkebackup.v1.Restore.LabelsEntr"
          + "y\022>\n\005state\030\n \001(\0162/.google.events.cloud.g"
          + "kebackup.v1.Restore.State\022\024\n\014state_reaso"
          + "n\030\013 \001(\t\0221\n\rcomplete_time\030\014 \001(\0132\032.google."
          + "protobuf.Timestamp\022 \n\030resources_restored"
          + "_count\030\r \001(\005\022 \n\030resources_excluded_count"
          + "\030\016 \001(\005\022\036\n\026resources_failed_count\030\017 \001(\005\022\036"
          + "\n\026volumes_restored_count\030\020 \001(\005\022\014\n\004etag\030\021"
          + " \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001\"f\n\005State\022\025\n\021STATE_UNSPECIFIE"
          + "D\020\000\022\014\n\010CREATING\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tSU"
          + "CCEEDED\020\003\022\n\n\006FAILED\020\004\022\014\n\010DELETING\020\005\"\342\014\n\r"
          + "RestoreConfig\022k\n\032volume_data_restore_pol"
          + "icy\030\001 \001(\0162G.google.events.cloud.gkebacku"
          + "p.v1.RestoreConfig.VolumeDataRestorePoli"
          + "cy\022w\n cluster_resource_conflict_policy\030\002"
          + " \001(\0162M.google.events.cloud.gkebackup.v1."
          + "RestoreConfig.ClusterResourceConflictPol"
          + "icy\022w\n namespaced_resource_restore_mode\030"
          + "\003 \001(\0162M.google.events.cloud.gkebackup.v1"
          + ".RestoreConfig.NamespacedResourceRestore"
          + "Mode\022s\n\036cluster_resource_restore_scope\030\004"
          + " \001(\0132K.google.events.cloud.gkebackup.v1."
          + "RestoreConfig.ClusterResourceRestoreScop"
          + "e\022\030\n\016all_namespaces\030\005 \001(\010H\000\022K\n\023selected_"
          + "namespaces\030\006 \001(\0132,.google.events.cloud.g"
          + "kebackup.v1.NamespacesH\000\022R\n\025selected_app"
          + "lications\030\007 \001(\01321.google.events.cloud.gk"
          + "ebackup.v1.NamespacedNamesH\000\022\\\n\022substitu"
          + "tion_rules\030\010 \003(\0132@.google.events.cloud.g"
          + "kebackup.v1.RestoreConfig.SubstitutionRu"
          + "le\032:\n\tGroupKind\022\026\n\016resource_group\030\001 \001(\t\022"
          + "\025\n\rresource_kind\030\002 \001(\t\032v\n\033ClusterResourc"
          + "eRestoreScope\022W\n\024selected_group_kinds\030\001 "
          + "\003(\01329.google.events.cloud.gkebackup.v1.R"
          + "estoreConfig.GroupKind\032\321\001\n\020SubstitutionR"
          + "ule\022\031\n\021target_namespaces\030\001 \003(\t\022U\n\022target"
          + "_group_kinds\030\002 \003(\01329.google.events.cloud"
          + ".gkebackup.v1.RestoreConfig.GroupKind\022\030\n"
          + "\020target_json_path\030\003 \001(\t\022\036\n\026original_valu"
          + "e_pattern\030\004 \001(\t\022\021\n\tnew_value\030\005 \001(\t\"\257\001\n\027V"
          + "olumeDataRestorePolicy\022*\n&VOLUME_DATA_RE"
          + "STORE_POLICY_UNSPECIFIED\020\000\022#\n\037RESTORE_VO"
          + "LUME_DATA_FROM_BACKUP\020\001\022#\n\037REUSE_VOLUME_"
          + "HANDLE_FROM_BACKUP\020\002\022\036\n\032NO_VOLUME_DATA_R"
          + "ESTORATION\020\003\"\203\001\n\035ClusterResourceConflict"
          + "Policy\0220\n,CLUSTER_RESOURCE_CONFLICT_POLI"
          + "CY_UNSPECIFIED\020\000\022\030\n\024USE_EXISTING_VERSION"
          + "\020\001\022\026\n\022USE_BACKUP_VERSION\020\002\"\177\n\035Namespaced"
          + "ResourceRestoreMode\0220\n,NAMESPACED_RESOUR"
          + "CE_RESTORE_MODE_UNSPECIFIED\020\000\022\026\n\022DELETE_"
          + "AND_RESTORE\020\001\022\024\n\020FAIL_ON_CONFLICT\020\002B#\n!n"
          + "amespaced_resource_restore_scope\"\226\003\n\013Res"
          + "torePlan\022\014\n\004name\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022/\n\013c"
          + "reate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tamp\022/\n\013update_time\030\004 \001(\0132\032.google.proto"
          + "buf.Timestamp\022\023\n\013description\030\005 \001(\t\022\023\n\013ba"
          + "ckup_plan\030\006 \001(\t\022\017\n\007cluster\030\007 \001(\t\022G\n\016rest"
          + "ore_config\030\010 \001(\0132/.google.events.cloud.g"
          + "kebackup.v1.RestoreConfig\022I\n\006labels\030\t \003("
          + "\01329.google.events.cloud.gkebackup.v1.Res"
          + "torePlan.LabelsEntry\022\014\n\004etag\030\n \001(\t\032-\n\013La"
          + "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"g\n\024RestorePlanEventData\022C\n\007payload\030\001 \001"
          + "(\0132-.google.events.cloud.gkebackup.v1.Re"
          + "storePlanH\000\210\001\001B\n\n\010_payload\"]\n\017BackupEven"
          + "tData\022>\n\007payload\030\001 \001(\0132(.google.events.c"
          + "loud.gkebackup.v1.BackupH\000\210\001\001B\n\n\010_payloa"
          + "d\"e\n\023BackupPlanEventData\022B\n\007payload\030\001 \001("
          + "\0132,.google.events.cloud.gkebackup.v1.Bac"
          + "kupPlanH\000\210\001\001B\n\n\010_payload\"_\n\020RestoreEvent"
          + "Data\022?\n\007payload\030\001 \001(\0132).google.events.cl"
          + "oud.gkebackup.v1.RestoreH\000\210\001\001B\n\n\010_payloa"
          + "dB\236\001\n$com.google.events.cloud.gkebackup."
          + "v1P\001\252\002)Google.Events.Protobuf.Cloud.GkeB"
          + "ackup.V1\312\002 Google\\Events\\Cloud\\GkeBackup"
          + "\\V1\352\002$Google::Events::Cloud::GkeBackup::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_gkebackup_v1_Namespaces_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_gkebackup_v1_Namespaces_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Namespaces_descriptor,
            new java.lang.String[] {
              "Namespaces",
            });
    internal_static_google_events_cloud_gkebackup_v1_NamespacedName_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_NamespacedName_descriptor,
            new java.lang.String[] {
              "Namespace", "Name",
            });
    internal_static_google_events_cloud_gkebackup_v1_NamespacedNames_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_NamespacedNames_descriptor,
            new java.lang.String[] {
              "NamespacedNames",
            });
    internal_static_google_events_cloud_gkebackup_v1_EncryptionKey_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_EncryptionKey_descriptor,
            new java.lang.String[] {
              "GcpKmsEncryptionKey",
            });
    internal_static_google_events_cloud_gkebackup_v1_Backup_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_gkebackup_v1_Backup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Backup_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Manual",
              "Labels",
              "DeleteLockDays",
              "DeleteLockExpireTime",
              "RetainDays",
              "RetainExpireTime",
              "EncryptionKey",
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "ContainsVolumeData",
              "ContainsSecrets",
              "ClusterMetadata",
              "State",
              "StateReason",
              "CompleteTime",
              "ResourceCount",
              "VolumeCount",
              "SizeBytes",
              "Etag",
              "Description",
              "PodCount",
              "ConfigBackupSizeBytes",
              "BackupScope",
            });
    internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(0);
    internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor,
            new java.lang.String[] {
              "Cluster",
              "K8SVersion",
              "BackupCrdVersions",
              "GkeVersion",
              "AnthosVersion",
              "PlatformVersion",
            });
    internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(1);
    internal_static_google_events_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "Cluster",
              "RetentionPolicy",
              "Labels",
              "BackupSchedule",
              "Etag",
              "Deactivated",
              "BackupConfig",
              "ProtectedPodCount",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlan_RetentionPolicy_descriptor,
            new java.lang.String[] {
              "BackupDeleteLockDays", "BackupRetainDays", "Locked",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlan_Schedule_descriptor,
            new java.lang.String[] {
              "CronSchedule", "Paused",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_BackupConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlan_BackupConfig_descriptor,
            new java.lang.String[] {
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "IncludeVolumeData",
              "IncludeSecrets",
              "EncryptionKey",
              "BackupScope",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_BackupPlan_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_gkebackup_v1_Restore_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_events_cloud_gkebackup_v1_Restore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Restore_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "Backup",
              "Cluster",
              "RestoreConfig",
              "Labels",
              "State",
              "StateReason",
              "CompleteTime",
              "ResourcesRestoredCount",
              "ResourcesExcludedCount",
              "ResourcesFailedCount",
              "VolumesRestoredCount",
              "Etag",
            });
    internal_static_google_events_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_Restore_descriptor.getNestedTypes().get(0);
    internal_static_google_events_cloud_gkebackup_v1_Restore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_Restore_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor,
            new java.lang.String[] {
              "VolumeDataRestorePolicy",
              "ClusterResourceConflictPolicy",
              "NamespacedResourceRestoreMode",
              "ClusterResourceRestoreScope",
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "SubstitutionRules",
              "NamespacedResourceRestoreScope",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_GroupKind_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_GroupKind_descriptor,
            new java.lang.String[] {
              "ResourceGroup", "ResourceKind",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_ClusterResourceRestoreScope_descriptor,
            new java.lang.String[] {
              "SelectedGroupKinds",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestoreConfig_SubstitutionRule_descriptor,
            new java.lang.String[] {
              "TargetNamespaces",
              "TargetGroupKinds",
              "TargetJsonPath",
              "OriginalValuePattern",
              "NewValue",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestorePlan_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_events_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestorePlan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "BackupPlan",
              "Cluster",
              "RestoreConfig",
              "Labels",
              "Etag",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor =
        internal_static_google_events_cloud_gkebackup_v1_RestorePlan_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestorePlanEventData_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_events_cloud_gkebackup_v1_RestorePlanEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestorePlanEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupEventData_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_events_cloud_gkebackup_v1_BackupEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_gkebackup_v1_BackupPlanEventData_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_events_cloud_gkebackup_v1_BackupPlanEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_BackupPlanEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_gkebackup_v1_RestoreEventData_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_events_cloud_gkebackup_v1_RestoreEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_gkebackup_v1_RestoreEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
