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

public interface MediaWarehouseConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.MediaWarehouseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the Media Warehouse corpus.
   * Format:
   * projects/${project_id}/locations/${location_id}/corpora/${corpus_id}
   * </pre>
   *
   * <code>string corpus = 1;</code>
   *
   * @return The corpus.
   */
  java.lang.String getCorpus();
  /**
   *
   *
   * <pre>
   * Resource name of the Media Warehouse corpus.
   * Format:
   * projects/${project_id}/locations/${location_id}/corpora/${corpus_id}
   * </pre>
   *
   * <code>string corpus = 1;</code>
   *
   * @return The bytes for corpus.
   */
  com.google.protobuf.ByteString getCorpusBytes();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string region = 2;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string region = 2;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   *
   *
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   *
   *
   * <pre>
   * The duration for which all media assets, associated metadata, and search
   * documents can exist.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();
}