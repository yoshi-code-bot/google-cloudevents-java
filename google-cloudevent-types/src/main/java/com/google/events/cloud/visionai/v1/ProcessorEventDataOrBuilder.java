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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

public interface ProcessorEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.ProcessorEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Processor event payload. Unset for deletion events.
   * </pre>
   *
   * <code>optional .google.events.cloud.visionai.v1.Processor payload = 1;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. The Processor event payload. Unset for deletion events.
   * </pre>
   *
   * <code>optional .google.events.cloud.visionai.v1.Processor payload = 1;</code>
   *
   * @return The payload.
   */
  com.google.events.cloud.visionai.v1.Processor getPayload();
  /**
   *
   *
   * <pre>
   * Optional. The Processor event payload. Unset for deletion events.
   * </pre>
   *
   * <code>optional .google.events.cloud.visionai.v1.Processor payload = 1;</code>
   */
  com.google.events.cloud.visionai.v1.ProcessorOrBuilder getPayloadOrBuilder();
}
