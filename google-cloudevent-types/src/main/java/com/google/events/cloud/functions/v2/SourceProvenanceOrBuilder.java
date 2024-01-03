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
// source: google/events/cloud/functions/v2/data.proto

package com.google.events.cloud.functions.v2;

public interface SourceProvenanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.functions.v2.SourceProvenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   *
   * @return Whether the resolvedStorageSource field is set.
   */
  boolean hasResolvedStorageSource();

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   *
   * @return The resolvedStorageSource.
   */
  com.google.events.cloud.functions.v2.StorageSource getResolvedStorageSource();

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   */
  com.google.events.cloud.functions.v2.StorageSourceOrBuilder getResolvedStorageSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   *
   * @return Whether the resolvedRepoSource field is set.
   */
  boolean hasResolvedRepoSource();

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   *
   * @return The resolvedRepoSource.
   */
  com.google.events.cloud.functions.v2.RepoSource getResolvedRepoSource();

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   */
  com.google.events.cloud.functions.v2.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder();
}
