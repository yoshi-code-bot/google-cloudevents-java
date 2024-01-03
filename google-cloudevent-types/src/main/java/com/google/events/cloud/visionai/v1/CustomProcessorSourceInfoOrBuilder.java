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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

public interface CustomProcessorSourceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.CustomProcessorSourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name original model hosted in the vertex AI platform.
   * </pre>
   *
   * <code>string vertex_model = 2;</code>
   *
   * @return Whether the vertexModel field is set.
   */
  boolean hasVertexModel();

  /**
   *
   *
   * <pre>
   * The resource name original model hosted in the vertex AI platform.
   * </pre>
   *
   * <code>string vertex_model = 2;</code>
   *
   * @return The vertexModel.
   */
  java.lang.String getVertexModel();

  /**
   *
   *
   * <pre>
   * The resource name original model hosted in the vertex AI platform.
   * </pre>
   *
   * <code>string vertex_model = 2;</code>
   *
   * @return The bytes for vertexModel.
   */
  com.google.protobuf.ByteString getVertexModelBytes();

  /**
   *
   *
   * <pre>
   * The original product which holds the custom processor's functionality.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.SourceType source_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();

  /**
   *
   *
   * <pre>
   * The original product which holds the custom processor's functionality.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.SourceType source_type = 1;
   * </code>
   *
   * @return The sourceType.
   */
  com.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.SourceType getSourceType();

  /**
   *
   *
   * <pre>
   * Output only. Additional info related to the imported custom processor.
   * Data is filled in by app platform during the processor creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_info = 4;</code>
   */
  int getAdditionalInfoCount();

  /**
   *
   *
   * <pre>
   * Output only. Additional info related to the imported custom processor.
   * Data is filled in by app platform during the processor creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_info = 4;</code>
   */
  boolean containsAdditionalInfo(java.lang.String key);

  /** Use {@link #getAdditionalInfoMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAdditionalInfo();

  /**
   *
   *
   * <pre>
   * Output only. Additional info related to the imported custom processor.
   * Data is filled in by app platform during the processor creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_info = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAdditionalInfoMap();

  /**
   *
   *
   * <pre>
   * Output only. Additional info related to the imported custom processor.
   * Data is filled in by app platform during the processor creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_info = 4;</code>
   */
  /* nullable */
  java.lang.String getAdditionalInfoOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Additional info related to the imported custom processor.
   * Data is filled in by app platform during the processor creation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_info = 4;</code>
   */
  java.lang.String getAdditionalInfoOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Model schema files which specifies the signature of the model.
   * For VERTEX_CUSTOM models, instances schema is required.
   * If instances schema is not specified during the processor creation,
   * VisionAI Platform will try to get it from Vertex, if it doesn't exist, the
   * creation will fail.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ModelSchema model_schema = 5;
   * </code>
   *
   * @return Whether the modelSchema field is set.
   */
  boolean hasModelSchema();

  /**
   *
   *
   * <pre>
   * Model schema files which specifies the signature of the model.
   * For VERTEX_CUSTOM models, instances schema is required.
   * If instances schema is not specified during the processor creation,
   * VisionAI Platform will try to get it from Vertex, if it doesn't exist, the
   * creation will fail.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ModelSchema model_schema = 5;
   * </code>
   *
   * @return The modelSchema.
   */
  com.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ModelSchema getModelSchema();

  /**
   *
   *
   * <pre>
   * Model schema files which specifies the signature of the model.
   * For VERTEX_CUSTOM models, instances schema is required.
   * If instances schema is not specified during the processor creation,
   * VisionAI Platform will try to get it from Vertex, if it doesn't exist, the
   * creation will fail.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ModelSchema model_schema = 5;
   * </code>
   */
  com.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ModelSchemaOrBuilder
      getModelSchemaOrBuilder();

  public com.google.events.cloud.visionai.v1.CustomProcessorSourceInfo.ArtifactPathCase
      getArtifactPathCase();
}
