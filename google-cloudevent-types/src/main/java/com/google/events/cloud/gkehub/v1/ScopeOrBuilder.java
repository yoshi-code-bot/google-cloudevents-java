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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface ScopeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.Scope)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name for the scope
   * `projects/{project}/locations/{location}/scopes/{scope}`
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
   * The resource name for the scope
   * `projects/{project}/locations/{location}/scopes/{scope}`
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
   * Output only. Google-generated UUID for this resource. This is unique across
   * all scope resources. If a scope resource is deleted and another resource
   * with the same name is created, it gets a different uid.
   * </pre>
   *
   * <code>string uid = 2;</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across
   * all scope resources. If a scope resource is deleted and another resource
   * with the same name is created, it gets a different uid.
   * </pre>
   *
   * <code>string uid = 2;</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. When the scope was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the scope resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ScopeLifecycleState state = 6;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();

  /**
   *
   *
   * <pre>
   * Output only. State of the scope resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ScopeLifecycleState state = 6;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.gkehub.v1.ScopeLifecycleState getState();

  /**
   *
   *
   * <pre>
   * Output only. State of the scope resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ScopeLifecycleState state = 6;</code>
   */
  com.google.events.cloud.gkehub.v1.ScopeLifecycleStateOrBuilder getStateOrBuilder();
}
