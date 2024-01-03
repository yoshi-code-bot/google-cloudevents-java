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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface KubernetesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.KubernetesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Kubernetes API server version string as reported by
   * `/version`.
   * </pre>
   *
   * <code>string kubernetes_api_server_version = 1;</code>
   *
   * @return The kubernetesApiServerVersion.
   */
  java.lang.String getKubernetesApiServerVersion();

  /**
   *
   *
   * <pre>
   * Output only. Kubernetes API server version string as reported by
   * `/version`.
   * </pre>
   *
   * <code>string kubernetes_api_server_version = 1;</code>
   *
   * @return The bytes for kubernetesApiServerVersion.
   */
  com.google.protobuf.ByteString getKubernetesApiServerVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Node providerID as reported by the first node in the list of
   * nodes on the Kubernetes endpoint. On Kubernetes platforms that support
   * zero-node clusters (like GKE-on-GCP), the node_count will be zero and the
   * node_provider_id will be empty.
   * </pre>
   *
   * <code>string node_provider_id = 2;</code>
   *
   * @return The nodeProviderId.
   */
  java.lang.String getNodeProviderId();

  /**
   *
   *
   * <pre>
   * Output only. Node providerID as reported by the first node in the list of
   * nodes on the Kubernetes endpoint. On Kubernetes platforms that support
   * zero-node clusters (like GKE-on-GCP), the node_count will be zero and the
   * node_provider_id will be empty.
   * </pre>
   *
   * <code>string node_provider_id = 2;</code>
   *
   * @return The bytes for nodeProviderId.
   */
  com.google.protobuf.ByteString getNodeProviderIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Node count as reported by Kubernetes nodes resources.
   * </pre>
   *
   * <code>int32 node_count = 3;</code>
   *
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   *
   *
   * <pre>
   * Output only. vCPU count as reported by Kubernetes nodes resources.
   * </pre>
   *
   * <code>int32 vcpu_count = 4;</code>
   *
   * @return The vcpuCount.
   */
  int getVcpuCount();

  /**
   *
   *
   * <pre>
   * Output only. The total memory capacity as reported by the sum of all
   * Kubernetes nodes resources, defined in MB.
   * </pre>
   *
   * <code>int32 memory_mb = 5;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * Output only. The time at which these details were last updated. This
   * update_time is different from the Membership-level update_time since
   * EndpointDetails are updated internally for API consumers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 100;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which these details were last updated. This
   * update_time is different from the Membership-level update_time since
   * EndpointDetails are updated internally for API consumers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 100;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which these details were last updated. This
   * update_time is different from the Membership-level update_time since
   * EndpointDetails are updated internally for API consumers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 100;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
