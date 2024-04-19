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

public interface ExecutionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.ExecutionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1;
   * </code>
   *
   * @return A list containing the usages.
   */
  java.util.List<com.google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage>
      getUsagesList();

  /**
   *
   *
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1;
   * </code>
   *
   * @return The count of usages.
   */
  int getUsagesCount();

  /**
   *
   *
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The usages at the given index.
   */
  com.google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage getUsages(int index);

  /**
   *
   *
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for usages.
   */
  java.util.List<java.lang.Integer> getUsagesValueList();

  /**
   *
   *
   * <pre>
   * Required. Usages when this configuration should be applied.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentUsage usages = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usages at the given index.
   */
  int getUsagesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.DefaultPool default_pool = 2;</code>
   *
   * @return Whether the defaultPool field is set.
   */
  boolean hasDefaultPool();

  /**
   *
   *
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.DefaultPool default_pool = 2;</code>
   *
   * @return The defaultPool.
   */
  com.google.events.cloud.deploy.v1.DefaultPool getDefaultPool();

  /**
   *
   *
   * <pre>
   * Optional. Use default Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.DefaultPool default_pool = 2;</code>
   */
  com.google.events.cloud.deploy.v1.DefaultPoolOrBuilder getDefaultPoolOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.PrivatePool private_pool = 3;</code>
   *
   * @return Whether the privatePool field is set.
   */
  boolean hasPrivatePool();

  /**
   *
   *
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.PrivatePool private_pool = 3;</code>
   *
   * @return The privatePool.
   */
  com.google.events.cloud.deploy.v1.PrivatePool getPrivatePool();

  /**
   *
   *
   * <pre>
   * Optional. Use private Cloud Build pool.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.PrivatePool private_pool = 3;</code>
   */
  com.google.events.cloud.deploy.v1.PrivatePoolOrBuilder getPrivatePoolOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * If this optional field is unspecified, the default Cloud Build pool will be
   * used.
   * </pre>
   *
   * <code>string worker_pool = 4;</code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * If this optional field is unspecified, the default Cloud Build pool will be
   * used.
   * </pre>
   *
   * <code>string worker_pool = 4;</code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) is used.
   * </pre>
   *
   * <code>string service_account = 5;</code>
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
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) is used.
   * </pre>
   *
   * <code>string service_account = 5;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage location in which to store execution outputs. This
   * can either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 6;</code>
   *
   * @return The artifactStorage.
   */
  java.lang.String getArtifactStorage();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage location in which to store execution outputs. This
   * can either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 6;</code>
   *
   * @return The bytes for artifactStorage.
   */
  com.google.protobuf.ByteString getArtifactStorageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be
   * between 10m and 24h in seconds format. If unspecified, a default timeout of
   * 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7;</code>
   *
   * @return Whether the executionTimeout field is set.
   */
  boolean hasExecutionTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be
   * between 10m and 24h in seconds format. If unspecified, a default timeout of
   * 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7;</code>
   *
   * @return The executionTimeout.
   */
  com.google.protobuf.Duration getExecutionTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Execution timeout for a Cloud Build Execution. This must be
   * between 10m and 24h in seconds format. If unspecified, a default timeout of
   * 1h is used.
   * </pre>
   *
   * <code>.google.protobuf.Duration execution_timeout = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder();

  public com.google.events.cloud.deploy.v1.ExecutionConfig.ExecutionEnvironmentCase
      getExecutionEnvironmentCase();
}
