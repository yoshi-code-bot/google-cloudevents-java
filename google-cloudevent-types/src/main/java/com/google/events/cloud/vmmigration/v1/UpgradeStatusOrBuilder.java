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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

public interface UpgradeStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.UpgradeStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version to upgrade to.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * The version to upgrade to.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * The state of the upgradeAppliance operation.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.UpgradeStatus.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * The state of the upgradeAppliance operation.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.UpgradeStatus.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.vmmigration.v1.UpgradeStatus.State getState();

  /**
   *
   *
   * <pre>
   * Provides details on the state of the upgrade operation in case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();

  /**
   *
   *
   * <pre>
   * Provides details on the state of the upgrade operation in case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();

  /**
   *
   *
   * <pre>
   * Provides details on the state of the upgrade operation in case of an error.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The time the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The time the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The version from which we upgraded.
   * </pre>
   *
   * <code>string previous_version = 5;</code>
   *
   * @return The previousVersion.
   */
  java.lang.String getPreviousVersion();

  /**
   *
   *
   * <pre>
   * The version from which we upgraded.
   * </pre>
   *
   * <code>string previous_version = 5;</code>
   *
   * @return The bytes for previousVersion.
   */
  com.google.protobuf.ByteString getPreviousVersionBytes();
}
