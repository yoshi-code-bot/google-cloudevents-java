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
// source: google/events/cloud/redis/v1/data.proto

package com.google.events.cloud.redis.v1;

public interface PersistenceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.redis.v1.PersistenceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Controls whether Persistence features are enabled.
   * If not provided, the existing value will be used.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig.PersistenceMode persistence_mode = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for persistenceMode.
   */
  int getPersistenceModeValue();

  /**
   *
   *
   * <pre>
   * Optional. Controls whether Persistence features are enabled.
   * If not provided, the existing value will be used.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig.PersistenceMode persistence_mode = 1;
   * </code>
   *
   * @return The persistenceMode.
   */
  com.google.events.cloud.redis.v1.PersistenceConfig.PersistenceMode getPersistenceMode();

  /**
   *
   *
   * <pre>
   * Optional. Period between RDB snapshots. Snapshots will be attempted every
   * period starting from the provided snapshot start time. For example, a start
   * time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing
   * until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45,
   * 18:45, and 00:45 the next day, and so on. If not provided,
   * TWENTY_FOUR_HOURS will be used as default.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig.SnapshotPeriod rdb_snapshot_period = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for rdbSnapshotPeriod.
   */
  int getRdbSnapshotPeriodValue();

  /**
   *
   *
   * <pre>
   * Optional. Period between RDB snapshots. Snapshots will be attempted every
   * period starting from the provided snapshot start time. For example, a start
   * time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing
   * until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45,
   * 18:45, and 00:45 the next day, and so on. If not provided,
   * TWENTY_FOUR_HOURS will be used as default.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig.SnapshotPeriod rdb_snapshot_period = 2;
   * </code>
   *
   * @return The rdbSnapshotPeriod.
   */
  com.google.events.cloud.redis.v1.PersistenceConfig.SnapshotPeriod getRdbSnapshotPeriod();

  /**
   *
   *
   * <pre>
   * Output only. The next time that a snapshot attempt is scheduled to occur.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_next_snapshot_time = 4;</code>
   *
   * @return Whether the rdbNextSnapshotTime field is set.
   */
  boolean hasRdbNextSnapshotTime();

  /**
   *
   *
   * <pre>
   * Output only. The next time that a snapshot attempt is scheduled to occur.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_next_snapshot_time = 4;</code>
   *
   * @return The rdbNextSnapshotTime.
   */
  com.google.protobuf.Timestamp getRdbNextSnapshotTime();

  /**
   *
   *
   * <pre>
   * Output only. The next time that a snapshot attempt is scheduled to occur.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_next_snapshot_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRdbNextSnapshotTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Date and time that the first snapshot was/will be attempted, and
   * to which future snapshots will be aligned. If not provided, the current
   * time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_snapshot_start_time = 5;</code>
   *
   * @return Whether the rdbSnapshotStartTime field is set.
   */
  boolean hasRdbSnapshotStartTime();

  /**
   *
   *
   * <pre>
   * Optional. Date and time that the first snapshot was/will be attempted, and
   * to which future snapshots will be aligned. If not provided, the current
   * time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_snapshot_start_time = 5;</code>
   *
   * @return The rdbSnapshotStartTime.
   */
  com.google.protobuf.Timestamp getRdbSnapshotStartTime();

  /**
   *
   *
   * <pre>
   * Optional. Date and time that the first snapshot was/will be attempted, and
   * to which future snapshots will be aligned. If not provided, the current
   * time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rdb_snapshot_start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRdbSnapshotStartTimeOrBuilder();
}
