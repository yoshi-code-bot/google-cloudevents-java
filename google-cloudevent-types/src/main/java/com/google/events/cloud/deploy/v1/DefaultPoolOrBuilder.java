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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

public interface DefaultPoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.DefaultPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
   * </pre>
   *
   * <code>string service_account = 1;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
   * </pre>
   *
   * <code>string service_account = 1;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage location where execution outputs should be stored.
   * This can either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 2;</code>
   *
   * @return The artifactStorage.
   */
  java.lang.String getArtifactStorage();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage location where execution outputs should be stored.
   * This can either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 2;</code>
   *
   * @return The bytes for artifactStorage.
   */
  com.google.protobuf.ByteString getArtifactStorageBytes();
}
