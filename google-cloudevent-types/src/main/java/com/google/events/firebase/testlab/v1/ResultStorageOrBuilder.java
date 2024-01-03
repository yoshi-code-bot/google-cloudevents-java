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
// source: google/events/firebase/testlab/v1/data.proto

package com.google.events.firebase.testlab.v1;

public interface ResultStorageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.testlab.v1.ResultStorage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Tool Results history resource containing test results. Format is
   * `projects/{project_id}/histories/{history_id}`.
   * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
   * for more information.
   * </pre>
   *
   * <code>string tool_results_history = 1;</code>
   *
   * @return The toolResultsHistory.
   */
  java.lang.String getToolResultsHistory();

  /**
   *
   *
   * <pre>
   * Tool Results history resource containing test results. Format is
   * `projects/{project_id}/histories/{history_id}`.
   * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
   * for more information.
   * </pre>
   *
   * <code>string tool_results_history = 1;</code>
   *
   * @return The bytes for toolResultsHistory.
   */
  com.google.protobuf.ByteString getToolResultsHistoryBytes();

  /**
   *
   *
   * <pre>
   * Tool Results execution resource containing test results. Format is
   * `projects/{project_id}/histories/{history_id}/executions/{execution_id}`.
   * Optional, can be omitted in erroneous test states.
   * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
   * for more information.
   * </pre>
   *
   * <code>string tool_results_execution = 2;</code>
   *
   * @return The toolResultsExecution.
   */
  java.lang.String getToolResultsExecution();

  /**
   *
   *
   * <pre>
   * Tool Results execution resource containing test results. Format is
   * `projects/{project_id}/histories/{history_id}/executions/{execution_id}`.
   * Optional, can be omitted in erroneous test states.
   * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
   * for more information.
   * </pre>
   *
   * <code>string tool_results_execution = 2;</code>
   *
   * @return The bytes for toolResultsExecution.
   */
  com.google.protobuf.ByteString getToolResultsExecutionBytes();

  /**
   *
   *
   * <pre>
   * URI to the test results in the Firebase Web Console.
   * </pre>
   *
   * <code>string results_uri = 3;</code>
   *
   * @return The resultsUri.
   */
  java.lang.String getResultsUri();

  /**
   *
   *
   * <pre>
   * URI to the test results in the Firebase Web Console.
   * </pre>
   *
   * <code>string results_uri = 3;</code>
   *
   * @return The bytes for resultsUri.
   */
  com.google.protobuf.ByteString getResultsUriBytes();

  /**
   *
   *
   * <pre>
   * Location in Google Cloud Storage where test results are written to.
   * In the form "gs://bucket/path/to/somewhere".
   * </pre>
   *
   * <code>string gcs_path = 4;</code>
   *
   * @return The gcsPath.
   */
  java.lang.String getGcsPath();

  /**
   *
   *
   * <pre>
   * Location in Google Cloud Storage where test results are written to.
   * In the form "gs://bucket/path/to/somewhere".
   * </pre>
   *
   * <code>string gcs_path = 4;</code>
   *
   * @return The bytes for gcsPath.
   */
  com.google.protobuf.ByteString getGcsPathBytes();
}
