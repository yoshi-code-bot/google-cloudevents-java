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
// source: google/events/cloud/clouddms/v1/data.proto

package com.google.events.cloud.clouddms.v1;

public interface ReverseSshConnectivityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.clouddms.v1.ReverseSshConnectivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The IP of the virtual machine (Compute Engine) used as the
   * bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>string vm_ip = 1;</code>
   *
   * @return The vmIp.
   */
  java.lang.String getVmIp();

  /**
   *
   *
   * <pre>
   * Required. The IP of the virtual machine (Compute Engine) used as the
   * bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>string vm_ip = 1;</code>
   *
   * @return The bytes for vmIp.
   */
  com.google.protobuf.ByteString getVmIpBytes();

  /**
   *
   *
   * <pre>
   * Required. The forwarding port of the virtual machine (Compute Engine) used
   * as the bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>int32 vm_port = 2;</code>
   *
   * @return The vmPort.
   */
  int getVmPort();

  /**
   *
   *
   * <pre>
   * The name of the virtual machine (Compute Engine) used as the bastion server
   * for the SSH tunnel.
   * </pre>
   *
   * <code>string vm = 3;</code>
   *
   * @return The vm.
   */
  java.lang.String getVm();

  /**
   *
   *
   * <pre>
   * The name of the virtual machine (Compute Engine) used as the bastion server
   * for the SSH tunnel.
   * </pre>
   *
   * <code>string vm = 3;</code>
   *
   * @return The bytes for vm.
   */
  com.google.protobuf.ByteString getVmBytes();

  /**
   *
   *
   * <pre>
   * The name of the VPC to peer with the Cloud SQL private network.
   * </pre>
   *
   * <code>string vpc = 4;</code>
   *
   * @return The vpc.
   */
  java.lang.String getVpc();

  /**
   *
   *
   * <pre>
   * The name of the VPC to peer with the Cloud SQL private network.
   * </pre>
   *
   * <code>string vpc = 4;</code>
   *
   * @return The bytes for vpc.
   */
  com.google.protobuf.ByteString getVpcBytes();
}
