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
// source: google/events/cloud/dataplex/v1/data.proto

package com.google.events.cloud.dataplex.v1;

public interface DataProfileResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.dataplex.v1.DataProfileResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The count of rows scanned.
   * </pre>
   *
   * <code>int64 row_count = 3;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();

  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   *
   * @return The profile.
   */
  com.google.events.cloud.dataplex.v1.DataProfileResult.Profile getProfile();

  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   */
  com.google.events.cloud.dataplex.v1.DataProfileResult.ProfileOrBuilder getProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   *
   * @return Whether the scannedData field is set.
   */
  boolean hasScannedData();

  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   *
   * @return The scannedData.
   */
  com.google.events.cloud.dataplex.v1.ScannedData getScannedData();

  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   */
  com.google.events.cloud.dataplex.v1.ScannedDataOrBuilder getScannedDataOrBuilder();
}
