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
// source: google/events/cloud/eventarc/v1/data.proto

package com.google.events.cloud.eventarc.v1;

public interface TransportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.eventarc.v1.Transport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as a transport
   * intermediary.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   *
   * @return Whether the pubsub field is set.
   */
  boolean hasPubsub();

  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as a transport
   * intermediary.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   *
   * @return The pubsub.
   */
  com.google.events.cloud.eventarc.v1.Pubsub getPubsub();

  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as a transport
   * intermediary.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   */
  com.google.events.cloud.eventarc.v1.PubsubOrBuilder getPubsubOrBuilder();

  public com.google.events.cloud.eventarc.v1.Transport.IntermediaryCase getIntermediaryCase();
}
