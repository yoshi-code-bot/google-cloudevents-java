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
// source: google/events/cloud/gkebackup/v1/data.proto

package com.google.events.cloud.gkebackup.v1;

public interface NamespacedNameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkebackup.v1.NamespacedName)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Namespace of the Kubernetes resource.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();

  /**
   *
   *
   * <pre>
   * The Namespace of the Kubernetes resource.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * The name of the Kubernetes resource.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the Kubernetes resource.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
