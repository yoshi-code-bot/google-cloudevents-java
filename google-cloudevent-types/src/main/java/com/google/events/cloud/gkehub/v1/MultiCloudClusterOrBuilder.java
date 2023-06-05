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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface MultiCloudClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.MultiCloudCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster.
   * For example:
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/attachedClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1;</code>
   *
   * @return The resourceLink.
   */
  java.lang.String getResourceLink();
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster.
   * For example:
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
   *  //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/attachedClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1;</code>
   *
   * @return The bytes for resourceLink.
   */
  com.google.protobuf.ByteString getResourceLinkBytes();

  /**
   *
   *
   * <pre>
   * Output only. If cluster_missing is set then it denotes that
   * API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster
   * no longer exists.
   * </pre>
   *
   * <code>bool cluster_missing = 2;</code>
   *
   * @return The clusterMissing.
   */
  boolean getClusterMissing();
}
