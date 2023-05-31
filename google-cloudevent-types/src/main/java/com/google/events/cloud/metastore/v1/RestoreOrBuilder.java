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
// source: google/events/cloud/metastore/v1/data.proto

package com.google.events.cloud.metastore.v1;

public interface RestoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.metastore.v1.Restore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The time when the restore started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the restore started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the restore started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the restore ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the restore ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the restore ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the restore.
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.Restore.State state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the restore.
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.Restore.State state = 3;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.metastore.v1.Restore.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the metastore service backup to
   * restore from, in the following form:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string backup = 4;</code>
   *
   * @return The backup.
   */
  java.lang.String getBackup();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the metastore service backup to
   * restore from, in the following form:
   * `projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string backup = 4;</code>
   *
   * @return The bytes for backup.
   */
  com.google.protobuf.ByteString getBackupBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of restore.
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.Restore.RestoreType type = 5;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of restore.
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.Restore.RestoreType type = 5;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.metastore.v1.Restore.RestoreType getType();

  /**
   *
   *
   * <pre>
   * Output only. The restore details containing the revision of the service to
   * be restored to, in format of JSON.
   * </pre>
   *
   * <code>string details = 6;</code>
   *
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   *
   *
   * <pre>
   * Output only. The restore details containing the revision of the service to
   * be restored to, in format of JSON.
   * </pre>
   *
   * <code>string details = 6;</code>
   *
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString getDetailsBytes();
}
