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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

public interface ExecutionStageStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.dataflow.v1beta3.ExecutionStageState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the execution stage.
   * </pre>
   *
   * <code>string execution_stage_name = 1;</code>
   *
   * @return The executionStageName.
   */
  java.lang.String getExecutionStageName();
  /**
   *
   *
   * <pre>
   * The name of the execution stage.
   * </pre>
   *
   * <code>string execution_stage_name = 1;</code>
   *
   * @return The bytes for executionStageName.
   */
  com.google.protobuf.ByteString getExecutionStageNameBytes();

  /**
   *
   *
   * <pre>
   * Executions stage states allow the same set of values as JobState.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
   *
   * @return The enum numeric value on the wire for executionStageState.
   */
  int getExecutionStageStateValue();
  /**
   *
   *
   * <pre>
   * Executions stage states allow the same set of values as JobState.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState execution_stage_state = 2;</code>
   *
   * @return The executionStageState.
   */
  com.google.events.cloud.dataflow.v1beta3.JobState getExecutionStageState();

  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   *
   * @return Whether the currentStateTime field is set.
   */
  boolean hasCurrentStateTime();
  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   *
   * @return The currentStateTime.
   */
  com.google.protobuf.Timestamp getCurrentStateTime();
  /**
   *
   *
   * <pre>
   * The time at which the stage transitioned to this state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentStateTimeOrBuilder();
}
