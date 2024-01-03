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

public interface MaintenanceScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.memcache.v1.MaintenanceSchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this
   * instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not
   * go beyond, including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 4;</code>
   *
   * @return Whether the scheduleDeadlineTime field is set.
   */
  boolean hasScheduleDeadlineTime();

  /**
   *
   *
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not
   * go beyond, including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 4;</code>
   *
   * @return The scheduleDeadlineTime.
   */
  com.google.protobuf.Timestamp getScheduleDeadlineTime();

  /**
   *
   *
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not
   * go beyond, including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleDeadlineTimeOrBuilder();
}
