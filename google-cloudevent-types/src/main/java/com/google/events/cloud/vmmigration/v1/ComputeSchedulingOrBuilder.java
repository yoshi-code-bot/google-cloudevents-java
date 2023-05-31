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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

public interface ComputeSchedulingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.ComputeScheduling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * How the instance should behave when the host machine undergoes
   * maintenance that may temporarily impact instance performance.
   * </pre>
   *
   * <code>
   * .google.events.cloud.vmmigration.v1.ComputeScheduling.OnHostMaintenance on_host_maintenance = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for onHostMaintenance.
   */
  int getOnHostMaintenanceValue();
  /**
   *
   *
   * <pre>
   * How the instance should behave when the host machine undergoes
   * maintenance that may temporarily impact instance performance.
   * </pre>
   *
   * <code>
   * .google.events.cloud.vmmigration.v1.ComputeScheduling.OnHostMaintenance on_host_maintenance = 1;
   * </code>
   *
   * @return The onHostMaintenance.
   */
  com.google.events.cloud.vmmigration.v1.ComputeScheduling.OnHostMaintenance getOnHostMaintenance();

  /**
   *
   *
   * <pre>
   * Whether the Instance should be automatically restarted whenever it is
   * terminated by Compute Engine (not terminated by user).
   * This configuration is identical to `automaticRestart` field in Compute
   * Engine create instance under scheduling.
   * It was changed to an enum (instead of a boolean) to match the default
   * value in Compute Engine which is automatic restart.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.ComputeScheduling.RestartType restart_type = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for restartType.
   */
  int getRestartTypeValue();
  /**
   *
   *
   * <pre>
   * Whether the Instance should be automatically restarted whenever it is
   * terminated by Compute Engine (not terminated by user).
   * This configuration is identical to `automaticRestart` field in Compute
   * Engine create instance under scheduling.
   * It was changed to an enum (instead of a boolean) to match the default
   * value in Compute Engine which is automatic restart.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.ComputeScheduling.RestartType restart_type = 5;
   * </code>
   *
   * @return The restartType.
   */
  com.google.events.cloud.vmmigration.v1.ComputeScheduling.RestartType getRestartType();

  /**
   *
   *
   * <pre>
   * A set of node affinity and anti-affinity configurations for sole tenant
   * nodes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.SchedulingNodeAffinity node_affinities = 3;
   * </code>
   */
  java.util.List<com.google.events.cloud.vmmigration.v1.SchedulingNodeAffinity>
      getNodeAffinitiesList();
  /**
   *
   *
   * <pre>
   * A set of node affinity and anti-affinity configurations for sole tenant
   * nodes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.SchedulingNodeAffinity node_affinities = 3;
   * </code>
   */
  com.google.events.cloud.vmmigration.v1.SchedulingNodeAffinity getNodeAffinities(int index);
  /**
   *
   *
   * <pre>
   * A set of node affinity and anti-affinity configurations for sole tenant
   * nodes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.SchedulingNodeAffinity node_affinities = 3;
   * </code>
   */
  int getNodeAffinitiesCount();
  /**
   *
   *
   * <pre>
   * A set of node affinity and anti-affinity configurations for sole tenant
   * nodes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.SchedulingNodeAffinity node_affinities = 3;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.vmmigration.v1.SchedulingNodeAffinityOrBuilder>
      getNodeAffinitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A set of node affinity and anti-affinity configurations for sole tenant
   * nodes.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.SchedulingNodeAffinity node_affinities = 3;
   * </code>
   */
  com.google.events.cloud.vmmigration.v1.SchedulingNodeAffinityOrBuilder getNodeAffinitiesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The minimum number of virtual CPUs this instance will consume when
   * running on a sole-tenant node. Ignored if no node_affinites are
   * configured.
   * </pre>
   *
   * <code>int32 min_node_cpus = 4;</code>
   *
   * @return The minNodeCpus.
   */
  int getMinNodeCpus();
}
