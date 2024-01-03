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
// source: google/events/cloud/networkconnectivity/v1/data.proto

package com.google.events.cloud.networkconnectivity.v1;

public interface LinkedRouterApplianceInstancesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;
   * </code>
   */
  java.util.List<com.google.events.cloud.networkconnectivity.v1.RouterApplianceInstance>
      getInstancesList();

  /**
   *
   *
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.RouterApplianceInstance getInstances(int index);

  /**
   *
   *
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;
   * </code>
   */
  int getInstancesCount();

  /**
   *
   *
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.events.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder>
      getInstancesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder
      getInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A value that controls whether site-to-site data transfer is enabled for
   * these resources. Data transfer is available only in [supported
   * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
   * </pre>
   *
   * <code>bool site_to_site_data_transfer = 2;</code>
   *
   * @return The siteToSiteDataTransfer.
   */
  boolean getSiteToSiteDataTransfer();

  /**
   *
   *
   * <pre>
   * Output only. The VPC network where these router appliance instances are
   * located.
   * </pre>
   *
   * <code>string vpc_network = 3;</code>
   *
   * @return The vpcNetwork.
   */
  java.lang.String getVpcNetwork();

  /**
   *
   *
   * <pre>
   * Output only. The VPC network where these router appliance instances are
   * located.
   * </pre>
   *
   * <code>string vpc_network = 3;</code>
   *
   * @return The bytes for vpcNetwork.
   */
  com.google.protobuf.ByteString getVpcNetworkBytes();
}
