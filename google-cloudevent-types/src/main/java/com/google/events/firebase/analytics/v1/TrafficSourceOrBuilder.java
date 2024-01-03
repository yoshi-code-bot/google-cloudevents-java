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
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

public interface TrafficSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.TrafficSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the campaign which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_campaign = 2;</code>
   *
   * @return The userAcquiredCampaign.
   */
  java.lang.String getUserAcquiredCampaign();

  /**
   *
   *
   * <pre>
   * The name of the campaign which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_campaign = 2;</code>
   *
   * @return The bytes for userAcquiredCampaign.
   */
  com.google.protobuf.ByteString getUserAcquiredCampaignBytes();

  /**
   *
   *
   * <pre>
   * The name of the network which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_source = 3;</code>
   *
   * @return The userAcquiredSource.
   */
  java.lang.String getUserAcquiredSource();

  /**
   *
   *
   * <pre>
   * The name of the network which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_source = 3;</code>
   *
   * @return The bytes for userAcquiredSource.
   */
  com.google.protobuf.ByteString getUserAcquiredSourceBytes();

  /**
   *
   *
   * <pre>
   * The name of the medium which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_medium = 4;</code>
   *
   * @return The userAcquiredMedium.
   */
  java.lang.String getUserAcquiredMedium();

  /**
   *
   *
   * <pre>
   * The name of the medium which acquired the user.
   * </pre>
   *
   * <code>string user_acquired_medium = 4;</code>
   *
   * @return The bytes for userAcquiredMedium.
   */
  com.google.protobuf.ByteString getUserAcquiredMediumBytes();
}
