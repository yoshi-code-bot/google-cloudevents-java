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
// source: google/events/cloud/apihub/v1/data.proto

package com.google.events.cloud.apihub.v1;

public interface LintResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.apihub.v1.LintResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Array of issues found in the analyzed document.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.Issue issues = 1;</code>
   */
  java.util.List<com.google.events.cloud.apihub.v1.Issue> getIssuesList();

  /**
   *
   *
   * <pre>
   * Optional. Array of issues found in the analyzed document.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.Issue issues = 1;</code>
   */
  com.google.events.cloud.apihub.v1.Issue getIssues(int index);

  /**
   *
   *
   * <pre>
   * Optional. Array of issues found in the analyzed document.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.Issue issues = 1;</code>
   */
  int getIssuesCount();

  /**
   *
   *
   * <pre>
   * Optional. Array of issues found in the analyzed document.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.Issue issues = 1;</code>
   */
  java.util.List<? extends com.google.events.cloud.apihub.v1.IssueOrBuilder>
      getIssuesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Array of issues found in the analyzed document.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.Issue issues = 1;</code>
   */
  com.google.events.cloud.apihub.v1.IssueOrBuilder getIssuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Summary of all issue types and counts for each severity level.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.LintResponse.SummaryEntry summary = 2;</code>
   */
  java.util.List<com.google.events.cloud.apihub.v1.LintResponse.SummaryEntry> getSummaryList();

  /**
   *
   *
   * <pre>
   * Optional. Summary of all issue types and counts for each severity level.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.LintResponse.SummaryEntry summary = 2;</code>
   */
  com.google.events.cloud.apihub.v1.LintResponse.SummaryEntry getSummary(int index);

  /**
   *
   *
   * <pre>
   * Optional. Summary of all issue types and counts for each severity level.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.LintResponse.SummaryEntry summary = 2;</code>
   */
  int getSummaryCount();

  /**
   *
   *
   * <pre>
   * Optional. Summary of all issue types and counts for each severity level.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.LintResponse.SummaryEntry summary = 2;</code>
   */
  java.util.List<? extends com.google.events.cloud.apihub.v1.LintResponse.SummaryEntryOrBuilder>
      getSummaryOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Summary of all issue types and counts for each severity level.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apihub.v1.LintResponse.SummaryEntry summary = 2;</code>
   */
  com.google.events.cloud.apihub.v1.LintResponse.SummaryEntryOrBuilder getSummaryOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. Lint state represents success or failure for linting.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.LintState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Required. Lint state represents success or failure for linting.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.LintState state = 3;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.apihub.v1.LintState getState();

  /**
   *
   *
   * <pre>
   * Required. Name of the linting application.
   * </pre>
   *
   * <code>string source = 4;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();

  /**
   *
   *
   * <pre>
   * Required. Name of the linting application.
   * </pre>
   *
   * <code>string source = 4;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the linter used.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.Linter linter = 5;</code>
   *
   * @return The enum numeric value on the wire for linter.
   */
  int getLinterValue();

  /**
   *
   *
   * <pre>
   * Required. Name of the linter used.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.Linter linter = 5;</code>
   *
   * @return The linter.
   */
  com.google.events.cloud.apihub.v1.Linter getLinter();

  /**
   *
   *
   * <pre>
   * Required. Timestamp when the linting response was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Required. Timestamp when the linting response was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Required. Timestamp when the linting response was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
