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

public interface EventDimensionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.EventDimensions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The date on which this event was logged.
   * (YYYYMMDD format in the registered timezone of your app.)
   * </pre>
   *
   * <code>string date = 6;</code>
   *
   * @return The date.
   */
  java.lang.String getDate();

  /**
   *
   *
   * <pre>
   * The date on which this event was logged.
   * (YYYYMMDD format in the registered timezone of your app.)
   * </pre>
   *
   * <code>string date = 6;</code>
   *
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString getDateBytes();

  /**
   *
   *
   * <pre>
   * The name of this event.
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
   * The name of this event.
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
   * A repeated record of the parameters associated with this event.
   * </pre>
   *
   * <code>map&lt;string, .google.events.firebase.analytics.v1.AnalyticsValue&gt; params = 2;</code>
   */
  int getParamsCount();

  /**
   *
   *
   * <pre>
   * A repeated record of the parameters associated with this event.
   * </pre>
   *
   * <code>map&lt;string, .google.events.firebase.analytics.v1.AnalyticsValue&gt; params = 2;</code>
   */
  boolean containsParams(java.lang.String key);

  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.events.firebase.analytics.v1.AnalyticsValue>
      getParams();

  /**
   *
   *
   * <pre>
   * A repeated record of the parameters associated with this event.
   * </pre>
   *
   * <code>map&lt;string, .google.events.firebase.analytics.v1.AnalyticsValue&gt; params = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.events.firebase.analytics.v1.AnalyticsValue>
      getParamsMap();

  /**
   *
   *
   * <pre>
   * A repeated record of the parameters associated with this event.
   * </pre>
   *
   * <code>map&lt;string, .google.events.firebase.analytics.v1.AnalyticsValue&gt; params = 2;</code>
   */
  /* nullable */
  com.google.events.firebase.analytics.v1.AnalyticsValue getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.events.firebase.analytics.v1.AnalyticsValue defaultValue);

  /**
   *
   *
   * <pre>
   * A repeated record of the parameters associated with this event.
   * </pre>
   *
   * <code>map&lt;string, .google.events.firebase.analytics.v1.AnalyticsValue&gt; params = 2;</code>
   */
  com.google.events.firebase.analytics.v1.AnalyticsValue getParamsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * UTC client time when the event happened.
   * </pre>
   *
   * <code>int64 timestamp_micros = 4;</code>
   *
   * @return The timestampMicros.
   */
  long getTimestampMicros();

  /**
   *
   *
   * <pre>
   * UTC client time when the previous event happened.
   * </pre>
   *
   * <code>int64 previous_timestamp_micros = 5;</code>
   *
   * @return The previousTimestampMicros.
   */
  long getPreviousTimestampMicros();

  /**
   *
   *
   * <pre>
   * Value param in USD.
   * </pre>
   *
   * <code>double value_in_usd = 7;</code>
   *
   * @return The valueInUsd.
   */
  double getValueInUsd();
}
