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

public interface MigrationWarningOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.MigrationWarning)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The warning code.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.MigrationWarning.WarningCode code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();

  /**
   *
   *
   * <pre>
   * The warning code.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.MigrationWarning.WarningCode code = 1;</code>
   *
   * @return The code.
   */
  com.google.events.cloud.vmmigration.v1.MigrationWarning.WarningCode getCode();

  /**
   *
   *
   * <pre>
   * The localized warning message.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage warning_message = 2;</code>
   *
   * @return Whether the warningMessage field is set.
   */
  boolean hasWarningMessage();

  /**
   *
   *
   * <pre>
   * The localized warning message.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage warning_message = 2;</code>
   *
   * @return The warningMessage.
   */
  com.google.rpc.LocalizedMessage getWarningMessage();

  /**
   *
   *
   * <pre>
   * The localized warning message.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage warning_message = 2;</code>
   */
  com.google.rpc.LocalizedMessageOrBuilder getWarningMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * Suggested action for solving the warning.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage action_item = 3;</code>
   *
   * @return Whether the actionItem field is set.
   */
  boolean hasActionItem();

  /**
   *
   *
   * <pre>
   * Suggested action for solving the warning.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage action_item = 3;</code>
   *
   * @return The actionItem.
   */
  com.google.rpc.LocalizedMessage getActionItem();

  /**
   *
   *
   * <pre>
   * Suggested action for solving the warning.
   * </pre>
   *
   * <code>.google.rpc.LocalizedMessage action_item = 3;</code>
   */
  com.google.rpc.LocalizedMessageOrBuilder getActionItemOrBuilder();

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current warning.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link help_links = 4;</code>
   */
  java.util.List<com.google.rpc.Help.Link> getHelpLinksList();

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current warning.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link help_links = 4;</code>
   */
  com.google.rpc.Help.Link getHelpLinks(int index);

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current warning.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link help_links = 4;</code>
   */
  int getHelpLinksCount();

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current warning.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link help_links = 4;</code>
   */
  java.util.List<? extends com.google.rpc.Help.LinkOrBuilder> getHelpLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current warning.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link help_links = 4;</code>
   */
  com.google.rpc.Help.LinkOrBuilder getHelpLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The time the warning occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp warning_time = 5;</code>
   *
   * @return Whether the warningTime field is set.
   */
  boolean hasWarningTime();

  /**
   *
   *
   * <pre>
   * The time the warning occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp warning_time = 5;</code>
   *
   * @return The warningTime.
   */
  com.google.protobuf.Timestamp getWarningTime();

  /**
   *
   *
   * <pre>
   * The time the warning occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp warning_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWarningTimeOrBuilder();
}
