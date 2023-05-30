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
// source: google/events/cloud/video/transcoder/v1/data.proto

package com.google.events.cloud.video.transcoder.v1;

public interface JobTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.video.transcoder.v1.JobTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the job template.
   * Format:
   * `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
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
   * The resource name of the job template.
   * Format:
   * `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
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
   * The configuration for this template.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.JobConfig config = 2;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The configuration for this template.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.JobConfig config = 2;</code>
   *
   * @return The config.
   */
  com.google.events.cloud.video.transcoder.v1.JobConfig getConfig();
  /**
   *
   *
   * <pre>
   * The configuration for this template.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.JobConfig config = 2;</code>
   */
  com.google.events.cloud.video.transcoder.v1.JobConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels associated with this job template. You can use these to organize
   * and group your job templates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels associated with this job template. You can use these to organize
   * and group your job templates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels associated with this job template. You can use these to organize
   * and group your job templates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels associated with this job template. You can use these to organize
   * and group your job templates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
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
   * The labels associated with this job template. You can use these to organize
   * and group your job templates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
