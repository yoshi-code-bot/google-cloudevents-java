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
// source: google/events/cloud/cloudbuild/v1/data.proto

package com.google.events.cloud.cloudbuild.v1;

public interface SourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.cloudbuild.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.StorageSource storage_source = 2;</code>
   *
   * @return Whether the storageSource field is set.
   */
  boolean hasStorageSource();

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.StorageSource storage_source = 2;</code>
   *
   * @return The storageSource.
   */
  com.google.events.cloud.cloudbuild.v1.StorageSource getStorageSource();

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.StorageSource storage_source = 2;</code>
   */
  com.google.events.cloud.cloudbuild.v1.StorageSourceOrBuilder getStorageSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.RepoSource repo_source = 3;</code>
   *
   * @return Whether the repoSource field is set.
   */
  boolean hasRepoSource();

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.RepoSource repo_source = 3;</code>
   *
   * @return The repoSource.
   */
  com.google.events.cloud.cloudbuild.v1.RepoSource getRepoSource();

  /**
   *
   *
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.RepoSource repo_source = 3;</code>
   */
  com.google.events.cloud.cloudbuild.v1.RepoSourceOrBuilder getRepoSourceOrBuilder();

  public com.google.events.cloud.cloudbuild.v1.Source.SourceCase getSourceCase();
}
