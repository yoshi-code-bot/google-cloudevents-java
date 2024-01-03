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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * RunMode represents the mode to launch the Process on.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.visionai.v1.RunMode}
 */
public enum RunMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Mode is unspecified.
   * </pre>
   *
   * <code>RUN_MODE_UNSPECIFIED = 0;</code>
   */
  RUN_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Live mode. Meaning the Process is launched to handle live video
   * source, and possible packet drops are expected.
   * </pre>
   *
   * <code>LIVE = 1;</code>
   */
  LIVE(1),
  /**
   *
   *
   * <pre>
   * Submission mode. Meaning the Process is launched to handle bounded video
   * files, with no packet drop. Completion status is tracked.
   * </pre>
   *
   * <code>SUBMISSION = 2;</code>
   */
  SUBMISSION(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Mode is unspecified.
   * </pre>
   *
   * <code>RUN_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int RUN_MODE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Live mode. Meaning the Process is launched to handle live video
   * source, and possible packet drops are expected.
   * </pre>
   *
   * <code>LIVE = 1;</code>
   */
  public static final int LIVE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Submission mode. Meaning the Process is launched to handle bounded video
   * files, with no packet drop. Completion status is tracked.
   * </pre>
   *
   * <code>SUBMISSION = 2;</code>
   */
  public static final int SUBMISSION_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RunMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RunMode forNumber(int value) {
    switch (value) {
      case 0:
        return RUN_MODE_UNSPECIFIED;
      case 1:
        return LIVE;
      case 2:
        return SUBMISSION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RunMode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RunMode> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RunMode>() {
        public RunMode findValueByNumber(int number) {
          return RunMode.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data.getDescriptor().getEnumTypes().get(1);
  }

  private static final RunMode[] VALUES = values();

  public static RunMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RunMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.visionai.v1.RunMode)
}
