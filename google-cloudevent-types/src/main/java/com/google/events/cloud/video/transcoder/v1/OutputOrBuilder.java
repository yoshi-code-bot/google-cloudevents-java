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
// source: google/events/cloud/video/transcoder/v1/data.proto

package com.google.events.cloud.video.transcoder.v1;

public interface OutputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.video.transcoder.v1.Output)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI for the output file(s). For example, `gs://my-bucket/outputs/`.
   * If empty, the value is populated from `Job.output_uri`. See
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * URI for the output file(s). For example, `gs://my-bucket/outputs/`.
   * If empty, the value is populated from `Job.output_uri`. See
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();
}
