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
// source: google/events/cloud/alloydb/v1/data.proto

package com.google.events.cloud.alloydb.v1;

public interface MigrationSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.alloydb.v1.MigrationSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1;</code>
   *
   * @return The hostPort.
   */
  java.lang.String getHostPort();
  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1;</code>
   *
   * @return The bytes for hostPort.
   */
  com.google.protobuf.ByteString getHostPortBytes();

  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2;</code>
   *
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2;</code>
   *
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString getReferenceIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
   * </code>
   *
   * @return The sourceType.
   */
  com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType getSourceType();
}