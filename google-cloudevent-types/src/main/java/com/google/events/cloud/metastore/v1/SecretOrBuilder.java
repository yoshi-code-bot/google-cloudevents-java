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
// source: google/events/cloud/metastore/v1/data.proto

package com.google.events.cloud.metastore.v1;

public interface SecretOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.metastore.v1.Secret)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   *
   * @return Whether the cloudSecret field is set.
   */
  boolean hasCloudSecret();

  /**
   *
   *
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   *
   * @return The cloudSecret.
   */
  java.lang.String getCloudSecret();

  /**
   *
   *
   * <pre>
   * The relative resource name of a Secret Manager secret version, in the
   * following form:
   * `projects/{project_number}/secrets/{secret_id}/versions/{version_id}`.
   * </pre>
   *
   * <code>string cloud_secret = 2;</code>
   *
   * @return The bytes for cloudSecret.
   */
  com.google.protobuf.ByteString getCloudSecretBytes();

  public com.google.events.cloud.metastore.v1.Secret.ValueCase getValueCase();
}
