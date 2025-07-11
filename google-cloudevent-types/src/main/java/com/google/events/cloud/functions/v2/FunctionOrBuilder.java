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
// source: google/events/cloud/functions/v2/data.proto

package com.google.events.cloud.functions.v2;

public interface FunctionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.functions.v2.Function)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Describe whether the function is gen1 or gen2.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.Environment environment = 10;</code>
   *
   * @return The enum numeric value on the wire for environment.
   */
  int getEnvironmentValue();

  /**
   *
   *
   * <pre>
   * Describe whether the function is gen1 or gen2.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.Environment environment = 10;</code>
   *
   * @return The environment.
   */
  com.google.events.cloud.functions.v2.Environment getEnvironment();

  /**
   *
   *
   * <pre>
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.BuildConfig build_config = 3;</code>
   *
   * @return Whether the buildConfig field is set.
   */
  boolean hasBuildConfig();

  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.BuildConfig build_config = 3;</code>
   *
   * @return The buildConfig.
   */
  com.google.events.cloud.functions.v2.BuildConfig getBuildConfig();

  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.BuildConfig build_config = 3;</code>
   */
  com.google.events.cloud.functions.v2.BuildConfigOrBuilder getBuildConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.ServiceConfig service_config = 4;</code>
   *
   * @return Whether the serviceConfig field is set.
   */
  boolean hasServiceConfig();

  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.ServiceConfig service_config = 4;</code>
   *
   * @return The serviceConfig.
   */
  com.google.events.cloud.functions.v2.ServiceConfig getServiceConfig();

  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.ServiceConfig service_config = 4;</code>
   */
  com.google.events.cloud.functions.v2.ServiceConfigOrBuilder getServiceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.EventTrigger event_trigger = 5;</code>
   *
   * @return Whether the eventTrigger field is set.
   */
  boolean hasEventTrigger();

  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.EventTrigger event_trigger = 5;</code>
   *
   * @return The eventTrigger.
   */
  com.google.events.cloud.functions.v2.EventTrigger getEventTrigger();

  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.EventTrigger event_trigger = 5;</code>
   */
  com.google.events.cloud.functions.v2.EventTriggerOrBuilder getEventTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the function.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.Function.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the function.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.Function.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.functions.v2.Function.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.StateMessage state_messages = 9;</code>
   */
  java.util.List<com.google.events.cloud.functions.v2.StateMessage> getStateMessagesList();

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.StateMessage state_messages = 9;</code>
   */
  com.google.events.cloud.functions.v2.StateMessage getStateMessages(int index);

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.StateMessage state_messages = 9;</code>
   */
  int getStateMessagesCount();

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.StateMessage state_messages = 9;</code>
   */
  java.util.List<? extends com.google.events.cloud.functions.v2.StateMessageOrBuilder>
      getStateMessagesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.StateMessage state_messages = 9;</code>
   */
  com.google.events.cloud.functions.v2.StateMessageOrBuilder getStateMessagesOrBuilder(int index);
}
