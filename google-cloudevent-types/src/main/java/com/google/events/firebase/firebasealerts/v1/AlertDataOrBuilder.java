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
// source: google/events/firebase/firebasealerts/v1/data.proto

package com.google.events.firebase.firebasealerts.v1;

public interface AlertDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.firebasealerts.v1.AlertData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time that the event has created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Time that the event has created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Time that the event has created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time that the event has ended. Optional, only present for alertsthat are
   * ongoing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Time that the event has ended. Optional, only present for alertsthat are
   * ongoing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Time that the event has ended. Optional, only present for alertsthat are
   * ongoing
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Payload of the event, which includes the details of the specific alert.
   * It's a map of keys of String type and values of various types
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();

  /**
   *
   *
   * <pre>
   * Payload of the event, which includes the details of the specific alert.
   * It's a map of keys of String type and values of various types
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();

  /**
   *
   *
   * <pre>
   * Payload of the event, which includes the details of the specific alert.
   * It's a map of keys of String type and values of various types
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();
}
