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
// source: google/events/cloud/datafusion/v1/data.proto

package com.google.events.cloud.datafusion.v1;

public interface DnsPeeringOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datafusion.v1.DnsPeering)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the dns peering zone.
   * Format:
   * projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering}
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
   * Required. The resource name of the dns peering zone.
   * Format:
   * projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering}
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
   * Required. The dns name suffix of the zone.
   * </pre>
   *
   * <code>string domain = 2;</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();

  /**
   *
   *
   * <pre>
   * Required. The dns name suffix of the zone.
   * </pre>
   *
   * <code>string domain = 2;</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional description of the dns zone.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. Optional description of the dns zone.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional target project to which dns peering should happen.
   * </pre>
   *
   * <code>string target_project = 4;</code>
   *
   * @return The targetProject.
   */
  java.lang.String getTargetProject();

  /**
   *
   *
   * <pre>
   * Optional. Optional target project to which dns peering should happen.
   * </pre>
   *
   * <code>string target_project = 4;</code>
   *
   * @return The bytes for targetProject.
   */
  com.google.protobuf.ByteString getTargetProjectBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional target network to which dns peering should happen.
   * </pre>
   *
   * <code>string target_network = 5;</code>
   *
   * @return The targetNetwork.
   */
  java.lang.String getTargetNetwork();

  /**
   *
   *
   * <pre>
   * Optional. Optional target network to which dns peering should happen.
   * </pre>
   *
   * <code>string target_network = 5;</code>
   *
   * @return The bytes for targetNetwork.
   */
  com.google.protobuf.ByteString getTargetNetworkBytes();
}
