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

public interface GkeClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.GkeCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Information specifying a GKE Cluster. Format is
   * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();

  /**
   *
   *
   * <pre>
   * Information specifying a GKE Cluster. Format is
   * `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Optional. If true, `cluster` is accessed using the private IP address of
   * the control plane endpoint. Otherwise, the default IP address of the
   * control plane endpoint is used. The default IP address is the private IP
   * address for clusters with private control-plane endpoints and the public IP
   * address otherwise.
   * Only specify this option when `cluster` is a [private GKE
   * cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
   * </pre>
   *
   * <code>bool internal_ip = 2;</code>
   *
   * @return The internalIp.
   */
  boolean getInternalIp();
}
