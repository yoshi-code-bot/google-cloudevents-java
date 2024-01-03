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

public interface MembershipEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.MembershipEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE-on-GCP cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.GkeCluster gke_cluster = 1;</code>
   *
   * @return Whether the gkeCluster field is set.
   */
  boolean hasGkeCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE-on-GCP cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.GkeCluster gke_cluster = 1;</code>
   *
   * @return The gkeCluster.
   */
  com.google.events.cloud.gkehub.v1.GkeCluster getGkeCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE-on-GCP cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.GkeCluster gke_cluster = 1;</code>
   */
  com.google.events.cloud.gkehub.v1.GkeClusterOrBuilder getGkeClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE On-Prem cluster. An onprem
   * user-cluster who has no resourceLink is not allowed to use this field, it
   * should have a nil "type" instead.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.OnPremCluster on_prem_cluster = 4;</code>
   *
   * @return Whether the onPremCluster field is set.
   */
  boolean hasOnPremCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE On-Prem cluster. An onprem
   * user-cluster who has no resourceLink is not allowed to use this field, it
   * should have a nil "type" instead.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.OnPremCluster on_prem_cluster = 4;</code>
   *
   * @return The onPremCluster.
   */
  com.google.events.cloud.gkehub.v1.OnPremCluster getOnPremCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE On-Prem cluster. An onprem
   * user-cluster who has no resourceLink is not allowed to use this field, it
   * should have a nil "type" instead.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.OnPremCluster on_prem_cluster = 4;</code>
   */
  com.google.events.cloud.gkehub.v1.OnPremClusterOrBuilder getOnPremClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE Multi-Cloud cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MultiCloudCluster multi_cloud_cluster = 5;</code>
   *
   * @return Whether the multiCloudCluster field is set.
   */
  boolean hasMultiCloudCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE Multi-Cloud cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MultiCloudCluster multi_cloud_cluster = 5;</code>
   *
   * @return The multiCloudCluster.
   */
  com.google.events.cloud.gkehub.v1.MultiCloudCluster getMultiCloudCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GKE Multi-Cloud cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MultiCloudCluster multi_cloud_cluster = 5;</code>
   */
  com.google.events.cloud.gkehub.v1.MultiCloudClusterOrBuilder getMultiCloudClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a Google Edge cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.EdgeCluster edge_cluster = 6;</code>
   *
   * @return Whether the edgeCluster field is set.
   */
  boolean hasEdgeCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a Google Edge cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.EdgeCluster edge_cluster = 6;</code>
   *
   * @return The edgeCluster.
   */
  com.google.events.cloud.gkehub.v1.EdgeCluster getEdgeCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a Google Edge cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.EdgeCluster edge_cluster = 6;</code>
   */
  com.google.events.cloud.gkehub.v1.EdgeClusterOrBuilder getEdgeClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GDC Edge Appliance cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ApplianceCluster appliance_cluster = 7;</code>
   *
   * @return Whether the applianceCluster field is set.
   */
  boolean hasApplianceCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GDC Edge Appliance cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ApplianceCluster appliance_cluster = 7;</code>
   *
   * @return The applianceCluster.
   */
  com.google.events.cloud.gkehub.v1.ApplianceCluster getApplianceCluster();

  /**
   *
   *
   * <pre>
   * Optional. Specific information for a GDC Edge Appliance cluster.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ApplianceCluster appliance_cluster = 7;</code>
   */
  com.google.events.cloud.gkehub.v1.ApplianceClusterOrBuilder getApplianceClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Useful Kubernetes-specific metadata.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesMetadata kubernetes_metadata = 2;</code>
   *
   * @return Whether the kubernetesMetadata field is set.
   */
  boolean hasKubernetesMetadata();

  /**
   *
   *
   * <pre>
   * Output only. Useful Kubernetes-specific metadata.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesMetadata kubernetes_metadata = 2;</code>
   *
   * @return The kubernetesMetadata.
   */
  com.google.events.cloud.gkehub.v1.KubernetesMetadata getKubernetesMetadata();

  /**
   *
   *
   * <pre>
   * Output only. Useful Kubernetes-specific metadata.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesMetadata kubernetes_metadata = 2;</code>
   */
  com.google.events.cloud.gkehub.v1.KubernetesMetadataOrBuilder getKubernetesMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The in-cluster Kubernetes Resources that should be applied for a
   * correctly registered cluster, in the steady state. These resources:
   *   * Ensure that the cluster is exclusively registered to one and only one
   *     Hub Membership.
   *   * Propagate Workload Pool Information available in the Membership
   *     Authority field.
   *   * Ensure proper initial configuration of default Hub Features.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesResource kubernetes_resource = 3;</code>
   *
   * @return Whether the kubernetesResource field is set.
   */
  boolean hasKubernetesResource();

  /**
   *
   *
   * <pre>
   * Optional. The in-cluster Kubernetes Resources that should be applied for a
   * correctly registered cluster, in the steady state. These resources:
   *   * Ensure that the cluster is exclusively registered to one and only one
   *     Hub Membership.
   *   * Propagate Workload Pool Information available in the Membership
   *     Authority field.
   *   * Ensure proper initial configuration of default Hub Features.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesResource kubernetes_resource = 3;</code>
   *
   * @return The kubernetesResource.
   */
  com.google.events.cloud.gkehub.v1.KubernetesResource getKubernetesResource();

  /**
   *
   *
   * <pre>
   * Optional. The in-cluster Kubernetes Resources that should be applied for a
   * correctly registered cluster, in the steady state. These resources:
   *   * Ensure that the cluster is exclusively registered to one and only one
   *     Hub Membership.
   *   * Propagate Workload Pool Information available in the Membership
   *     Authority field.
   *   * Ensure proper initial configuration of default Hub Features.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.KubernetesResource kubernetes_resource = 3;</code>
   */
  com.google.events.cloud.gkehub.v1.KubernetesResourceOrBuilder getKubernetesResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Whether the lifecycle of this membership is managed by a
   * google cluster platform service.
   * </pre>
   *
   * <code>bool google_managed = 8;</code>
   *
   * @return The googleManaged.
   */
  boolean getGoogleManaged();

  public com.google.events.cloud.gkehub.v1.MembershipEndpoint.TypeCase getTypeCase();
}
