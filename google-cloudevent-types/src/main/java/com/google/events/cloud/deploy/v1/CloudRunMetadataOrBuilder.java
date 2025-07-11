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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

public interface CloudRunMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.CloudRunMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`. Format is
   * `projects/{project}/locations/{location}/services/{service}`.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`. Format is
   * `projects/{project}/locations/{location}/services/{service}`.
   * </pre>
   *
   * <code>string service = 1;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2;</code>
   *
   * @return A list containing the serviceUrls.
   */
  java.util.List<java.lang.String> getServiceUrlsList();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2;</code>
   *
   * @return The count of serviceUrls.
   */
  int getServiceUrlsCount();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The serviceUrls at the given index.
   */
  java.lang.String getServiceUrls(int index);

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Service urls that are associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>repeated string service_urls = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the serviceUrls at the given index.
   */
  com.google.protobuf.ByteString getServiceUrlsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Revision id associated with a `Rollout`.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The revision.
   */
  java.lang.String getRevision();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud Run Revision id associated with a `Rollout`.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run job that is associated with a
   * `Rollout`. Format is
   * `projects/{project}/locations/{location}/jobs/{job_name}`.
   * </pre>
   *
   * <code>string job = 4;</code>
   *
   * @return The job.
   */
  java.lang.String getJob();

  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run job that is associated with a
   * `Rollout`. Format is
   * `projects/{project}/locations/{location}/jobs/{job_name}`.
   * </pre>
   *
   * <code>string job = 4;</code>
   *
   * @return The bytes for job.
   */
  com.google.protobuf.ByteString getJobBytes();
}
