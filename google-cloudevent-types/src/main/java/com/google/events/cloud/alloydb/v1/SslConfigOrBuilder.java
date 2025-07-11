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
// source: google/events/cloud/alloydb/v1/data.proto

package com.google.events.cloud.alloydb.v1;

public interface SslConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.alloydb.v1.SslConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1;</code>
   *
   * @return The enum numeric value on the wire for sslMode.
   */
  int getSslModeValue();

  /**
   *
   *
   * <pre>
   * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1;</code>
   *
   * @return The sslMode.
   */
  com.google.events.cloud.alloydb.v1.SslConfig.SslMode getSslMode();

  /**
   *
   *
   * <pre>
   * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
   * supported currently, and is the default value.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2;</code>
   *
   * @return The enum numeric value on the wire for caSource.
   */
  int getCaSourceValue();

  /**
   *
   *
   * <pre>
   * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
   * supported currently, and is the default value.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2;</code>
   *
   * @return The caSource.
   */
  com.google.events.cloud.alloydb.v1.SslConfig.CaSource getCaSource();
}
