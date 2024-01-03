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
// source: google/events/cloud/memcache/v1/data.proto

package com.google.events.cloud.memcache.v1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.memcache.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Memcached instances are managed and addressed at the regional level
   * so `location_id` here refers to a Google Cloud region; however, users may
   * choose which zones Memcached nodes should be provisioned in within an
   * instance. Refer to [zones][google.cloud.memcache.v1.Instance.zones] field
   * for more details.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Memcached instances are managed and addressed at the regional level
   * so `location_id` here refers to a Google Cloud region; however, users may
   * choose which zones Memcached nodes should be provisioned in within an
   * instance. Refer to [zones][google.cloud.memcache.v1.Instance.zones] field
   * for more details.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * User provided name for the instance, which is only used for display
   * purposes. Cannot be more than 80 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * User provided name for the instance, which is only used for display
   * purposes. Cannot be more than 80 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The full name of the Google Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 4;</code>
   *
   * @return The authorizedNetwork.
   */
  java.lang.String getAuthorizedNetwork();

  /**
   *
   *
   * <pre>
   * The full name of the Google Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 4;</code>
   *
   * @return The bytes for authorizedNetwork.
   */
  com.google.protobuf.ByteString getAuthorizedNetworkBytes();

  /**
   *
   *
   * <pre>
   * Zones in which Memcached nodes should be provisioned.
   * Memcached nodes will be equally distributed across these zones. If not
   * provided, the service will by default create nodes in all zones in the
   * region for the instance.
   * </pre>
   *
   * <code>repeated string zones = 5;</code>
   *
   * @return A list containing the zones.
   */
  java.util.List<java.lang.String> getZonesList();

  /**
   *
   *
   * <pre>
   * Zones in which Memcached nodes should be provisioned.
   * Memcached nodes will be equally distributed across these zones. If not
   * provided, the service will by default create nodes in all zones in the
   * region for the instance.
   * </pre>
   *
   * <code>repeated string zones = 5;</code>
   *
   * @return The count of zones.
   */
  int getZonesCount();

  /**
   *
   *
   * <pre>
   * Zones in which Memcached nodes should be provisioned.
   * Memcached nodes will be equally distributed across these zones. If not
   * provided, the service will by default create nodes in all zones in the
   * region for the instance.
   * </pre>
   *
   * <code>repeated string zones = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The zones at the given index.
   */
  java.lang.String getZones(int index);

  /**
   *
   *
   * <pre>
   * Zones in which Memcached nodes should be provisioned.
   * Memcached nodes will be equally distributed across these zones. If not
   * provided, the service will by default create nodes in all zones in the
   * region for the instance.
   * </pre>
   *
   * <code>repeated string zones = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the zones at the given index.
   */
  com.google.protobuf.ByteString getZonesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Number of nodes in the Memcached instance.
   * </pre>
   *
   * <code>int32 node_count = 6;</code>
   *
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   *
   *
   * <pre>
   * Required. Configuration for Memcached nodes.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.Instance.NodeConfig node_config = 7;</code>
   *
   * @return Whether the nodeConfig field is set.
   */
  boolean hasNodeConfig();

  /**
   *
   *
   * <pre>
   * Required. Configuration for Memcached nodes.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.Instance.NodeConfig node_config = 7;</code>
   *
   * @return The nodeConfig.
   */
  com.google.events.cloud.memcache.v1.Instance.NodeConfig getNodeConfig();

  /**
   *
   *
   * <pre>
   * Required. Configuration for Memcached nodes.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.Instance.NodeConfig node_config = 7;</code>
   */
  com.google.events.cloud.memcache.v1.Instance.NodeConfigOrBuilder getNodeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The major version of Memcached software.
   * If not provided, latest supported version will be used. Currently the
   * latest supported major version is `MEMCACHE_1_5`.
   * The minor version will be automatically determined by our system based on
   * the latest supported minor version.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MemcacheVersion memcache_version = 9;</code>
   *
   * @return The enum numeric value on the wire for memcacheVersion.
   */
  int getMemcacheVersionValue();

  /**
   *
   *
   * <pre>
   * The major version of Memcached software.
   * If not provided, latest supported version will be used. Currently the
   * latest supported major version is `MEMCACHE_1_5`.
   * The minor version will be automatically determined by our system based on
   * the latest supported minor version.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MemcacheVersion memcache_version = 9;</code>
   *
   * @return The memcacheVersion.
   */
  com.google.events.cloud.memcache.v1.MemcacheVersion getMemcacheVersion();

  /**
   *
   *
   * <pre>
   * User defined parameters to apply to the memcached process
   * on each node.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MemcacheParameters parameters = 11;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();

  /**
   *
   *
   * <pre>
   * User defined parameters to apply to the memcached process
   * on each node.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MemcacheParameters parameters = 11;</code>
   *
   * @return The parameters.
   */
  com.google.events.cloud.memcache.v1.MemcacheParameters getParameters();

  /**
   *
   *
   * <pre>
   * User defined parameters to apply to the memcached process
   * on each node.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MemcacheParameters parameters = 11;</code>
   */
  com.google.events.cloud.memcache.v1.MemcacheParametersOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. List of Memcached nodes.
   * Refer to [Node][google.cloud.memcache.v1.Instance.Node] message for more
   * details.
   * </pre>
   *
   * <code>repeated .google.events.cloud.memcache.v1.Instance.Node memcache_nodes = 12;</code>
   */
  java.util.List<com.google.events.cloud.memcache.v1.Instance.Node> getMemcacheNodesList();

  /**
   *
   *
   * <pre>
   * Output only. List of Memcached nodes.
   * Refer to [Node][google.cloud.memcache.v1.Instance.Node] message for more
   * details.
   * </pre>
   *
   * <code>repeated .google.events.cloud.memcache.v1.Instance.Node memcache_nodes = 12;</code>
   */
  com.google.events.cloud.memcache.v1.Instance.Node getMemcacheNodes(int index);

  /**
   *
   *
   * <pre>
   * Output only. List of Memcached nodes.
   * Refer to [Node][google.cloud.memcache.v1.Instance.Node] message for more
   * details.
   * </pre>
   *
   * <code>repeated .google.events.cloud.memcache.v1.Instance.Node memcache_nodes = 12;</code>
   */
  int getMemcacheNodesCount();

  /**
   *
   *
   * <pre>
   * Output only. List of Memcached nodes.
   * Refer to [Node][google.cloud.memcache.v1.Instance.Node] message for more
   * details.
   * </pre>
   *
   * <code>repeated .google.events.cloud.memcache.v1.Instance.Node memcache_nodes = 12;</code>
   */
  java.util.List<? extends com.google.events.cloud.memcache.v1.Instance.NodeOrBuilder>
      getMemcacheNodesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. List of Memcached nodes.
   * Refer to [Node][google.cloud.memcache.v1.Instance.Node] message for more
   * details.
   * </pre>
   *
   * <code>repeated .google.events.cloud.memcache.v1.Instance.Node memcache_nodes = 12;</code>
   */
  com.google.events.cloud.memcache.v1.Instance.NodeOrBuilder getMemcacheNodesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of this Memcached instance.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.Instance.State state = 15;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The state of this Memcached instance.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.Instance.State state = 15;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.memcache.v1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The full version of memcached server running on this instance.
   * System automatically determines the full memcached version for an instance
   * based on the input MemcacheVersion.
   * The full version format will be "memcached-1.5.16".
   * </pre>
   *
   * <code>string memcache_full_version = 18;</code>
   *
   * @return The memcacheFullVersion.
   */
  java.lang.String getMemcacheFullVersion();

  /**
   *
   *
   * <pre>
   * Output only. The full version of memcached server running on this instance.
   * System automatically determines the full memcached version for an instance
   * based on the input MemcacheVersion.
   * The full version format will be "memcached-1.5.16".
   * </pre>
   *
   * <code>string memcache_full_version = 18;</code>
   *
   * @return The bytes for memcacheFullVersion.
   */
  com.google.protobuf.ByteString getMemcacheFullVersionBytes();

  /**
   *
   *
   * <pre>
   * List of messages that describe the current state of the Memcached instance.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.memcache.v1.Instance.InstanceMessage instance_messages = 19;
   * </code>
   */
  java.util.List<com.google.events.cloud.memcache.v1.Instance.InstanceMessage>
      getInstanceMessagesList();

  /**
   *
   *
   * <pre>
   * List of messages that describe the current state of the Memcached instance.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.memcache.v1.Instance.InstanceMessage instance_messages = 19;
   * </code>
   */
  com.google.events.cloud.memcache.v1.Instance.InstanceMessage getInstanceMessages(int index);

  /**
   *
   *
   * <pre>
   * List of messages that describe the current state of the Memcached instance.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.memcache.v1.Instance.InstanceMessage instance_messages = 19;
   * </code>
   */
  int getInstanceMessagesCount();

  /**
   *
   *
   * <pre>
   * List of messages that describe the current state of the Memcached instance.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.memcache.v1.Instance.InstanceMessage instance_messages = 19;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.memcache.v1.Instance.InstanceMessageOrBuilder>
      getInstanceMessagesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of messages that describe the current state of the Memcached instance.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.memcache.v1.Instance.InstanceMessage instance_messages = 19;
   * </code>
   */
  com.google.events.cloud.memcache.v1.Instance.InstanceMessageOrBuilder
      getInstanceMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Endpoint for the Discovery API.
   * </pre>
   *
   * <code>string discovery_endpoint = 20;</code>
   *
   * @return The discoveryEndpoint.
   */
  java.lang.String getDiscoveryEndpoint();

  /**
   *
   *
   * <pre>
   * Output only. Endpoint for the Discovery API.
   * </pre>
   *
   * <code>string discovery_endpoint = 20;</code>
   *
   * @return The bytes for discoveryEndpoint.
   */
  com.google.protobuf.ByteString getDiscoveryEndpointBytes();

  /**
   *
   *
   * <pre>
   * The maintenance policy for the instance. If not provided,
   * the maintenance event will be performed based on Memorystore
   * internal rollout schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenancePolicy maintenance_policy = 21;</code>
   *
   * @return Whether the maintenancePolicy field is set.
   */
  boolean hasMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * The maintenance policy for the instance. If not provided,
   * the maintenance event will be performed based on Memorystore
   * internal rollout schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenancePolicy maintenance_policy = 21;</code>
   *
   * @return The maintenancePolicy.
   */
  com.google.events.cloud.memcache.v1.MaintenancePolicy getMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * The maintenance policy for the instance. If not provided,
   * the maintenance event will be performed based on Memorystore
   * internal rollout schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenancePolicy maintenance_policy = 21;</code>
   */
  com.google.events.cloud.memcache.v1.MaintenancePolicyOrBuilder getMaintenancePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Published maintenance schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenanceSchedule maintenance_schedule = 22;</code>
   *
   * @return Whether the maintenanceSchedule field is set.
   */
  boolean hasMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. Published maintenance schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenanceSchedule maintenance_schedule = 22;</code>
   *
   * @return The maintenanceSchedule.
   */
  com.google.events.cloud.memcache.v1.MaintenanceSchedule getMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. Published maintenance schedule.
   * </pre>
   *
   * <code>.google.events.cloud.memcache.v1.MaintenanceSchedule maintenance_schedule = 22;</code>
   */
  com.google.events.cloud.memcache.v1.MaintenanceScheduleOrBuilder
      getMaintenanceScheduleOrBuilder();
}
