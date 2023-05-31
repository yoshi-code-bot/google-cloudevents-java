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

public interface AppliedLicenseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.AppliedLicense)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The license type that was used in OS adaptation.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.AppliedLicense.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The license type that was used in OS adaptation.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.AppliedLicense.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.vmmigration.v1.AppliedLicense.Type getType();

  /**
   *
   *
   * <pre>
   * The OS license returned from the adaptation module's report.
   * </pre>
   *
   * <code>string os_license = 2;</code>
   *
   * @return The osLicense.
   */
  java.lang.String getOsLicense();
  /**
   *
   *
   * <pre>
   * The OS license returned from the adaptation module's report.
   * </pre>
   *
   * <code>string os_license = 2;</code>
   *
   * @return The bytes for osLicense.
   */
  com.google.protobuf.ByteString getOsLicenseBytes();
}
