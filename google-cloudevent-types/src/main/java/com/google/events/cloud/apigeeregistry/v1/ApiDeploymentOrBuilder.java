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
// source: google/events/cloud/apigeeregistry/v1/data.proto

package com.google.events.cloud.apigeeregistry.v1;

public interface ApiDeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.apigeeregistry.v1.ApiDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name.
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
   * Resource name.
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
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the deployment.
   * A new revision is committed whenever the deployment contents are changed.
   * The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 4;</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the deployment.
   * A new revision is committed whenever the deployment contents are changed.
   * The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>string revision_id = 4;</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp; when the deployment resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp; when the deployment resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp; when the deployment resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Revision creation timestamp; when the represented revision was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 6;</code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Revision creation timestamp; when the represented revision was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 6;</code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Revision creation timestamp; when the represented revision was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp: when the represented revision was last
   * modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_update_time = 7;</code>
   *
   * @return Whether the revisionUpdateTime field is set.
   */
  boolean hasRevisionUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp: when the represented revision was last
   * modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_update_time = 7;</code>
   *
   * @return The revisionUpdateTime.
   */
  com.google.protobuf.Timestamp getRevisionUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp: when the represented revision was last
   * modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revision_update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The full resource name (including revision ID) of the spec of the API being
   * served by the deployment. Changes to this value will update the revision.
   * Format: `apis/{api}/deployments/{deployment}`
   * </pre>
   *
   * <code>string api_spec_revision = 8;</code>
   *
   * @return The apiSpecRevision.
   */
  java.lang.String getApiSpecRevision();

  /**
   *
   *
   * <pre>
   * The full resource name (including revision ID) of the spec of the API being
   * served by the deployment. Changes to this value will update the revision.
   * Format: `apis/{api}/deployments/{deployment}`
   * </pre>
   *
   * <code>string api_spec_revision = 8;</code>
   *
   * @return The bytes for apiSpecRevision.
   */
  com.google.protobuf.ByteString getApiSpecRevisionBytes();

  /**
   *
   *
   * <pre>
   * The address where the deployment is serving. Changes to this value will
   * update the revision.
   * </pre>
   *
   * <code>string endpoint_uri = 9;</code>
   *
   * @return The endpointUri.
   */
  java.lang.String getEndpointUri();

  /**
   *
   *
   * <pre>
   * The address where the deployment is serving. Changes to this value will
   * update the revision.
   * </pre>
   *
   * <code>string endpoint_uri = 9;</code>
   *
   * @return The bytes for endpointUri.
   */
  com.google.protobuf.ByteString getEndpointUriBytes();

  /**
   *
   *
   * <pre>
   * The address of the external channel of the API (e.g., the Developer
   * Portal). Changes to this value will not affect the revision.
   * </pre>
   *
   * <code>string external_channel_uri = 10;</code>
   *
   * @return The externalChannelUri.
   */
  java.lang.String getExternalChannelUri();

  /**
   *
   *
   * <pre>
   * The address of the external channel of the API (e.g., the Developer
   * Portal). Changes to this value will not affect the revision.
   * </pre>
   *
   * <code>string external_channel_uri = 10;</code>
   *
   * @return The bytes for externalChannelUri.
   */
  com.google.protobuf.ByteString getExternalChannelUriBytes();

  /**
   *
   *
   * <pre>
   * Text briefly identifying the intended audience of the API. Changes to this
   * value will not affect the revision.
   * </pre>
   *
   * <code>string intended_audience = 11;</code>
   *
   * @return The intendedAudience.
   */
  java.lang.String getIntendedAudience();

  /**
   *
   *
   * <pre>
   * Text briefly identifying the intended audience of the API. Changes to this
   * value will not affect the revision.
   * </pre>
   *
   * <code>string intended_audience = 11;</code>
   *
   * @return The bytes for intendedAudience.
   */
  com.google.protobuf.ByteString getIntendedAudienceBytes();

  /**
   *
   *
   * <pre>
   * Text briefly describing how to access the endpoint. Changes to this value
   * will not affect the revision.
   * </pre>
   *
   * <code>string access_guidance = 12;</code>
   *
   * @return The accessGuidance.
   */
  java.lang.String getAccessGuidance();

  /**
   *
   *
   * <pre>
   * Text briefly describing how to access the endpoint. Changes to this value
   * will not affect the revision.
   * </pre>
   *
   * <code>string access_guidance = 12;</code>
   *
   * @return The bytes for accessGuidance.
   */
  com.google.protobuf.ByteString getAccessGuidanceBytes();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
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
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 14;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 15;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);
}
