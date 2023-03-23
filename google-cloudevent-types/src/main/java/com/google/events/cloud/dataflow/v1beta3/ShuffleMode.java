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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Specifies the shuffle mode used by a
 * [google.dataflow.v1beta3.Job], which determines the approach data is shuffled
 * during processing. More details in:
 * https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#dataflow-shuffle
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.dataflow.v1beta3.ShuffleMode}
 */
public enum ShuffleMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Shuffle mode information is not available.
   * </pre>
   *
   * <code>SHUFFLE_MODE_UNSPECIFIED = 0;</code>
   */
  SHUFFLE_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Shuffle is done on the worker VMs.
   * </pre>
   *
   * <code>VM_BASED = 1;</code>
   */
  VM_BASED(1),
  /**
   *
   *
   * <pre>
   * Shuffle is done on the service side.
   * </pre>
   *
   * <code>SERVICE_BASED = 2;</code>
   */
  SERVICE_BASED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Shuffle mode information is not available.
   * </pre>
   *
   * <code>SHUFFLE_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int SHUFFLE_MODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Shuffle is done on the worker VMs.
   * </pre>
   *
   * <code>VM_BASED = 1;</code>
   */
  public static final int VM_BASED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Shuffle is done on the service side.
   * </pre>
   *
   * <code>SERVICE_BASED = 2;</code>
   */
  public static final int SERVICE_BASED_VALUE = 2;

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
  public static ShuffleMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ShuffleMode forNumber(int value) {
    switch (value) {
      case 0:
        return SHUFFLE_MODE_UNSPECIFIED;
      case 1:
        return VM_BASED;
      case 2:
        return SERVICE_BASED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ShuffleMode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ShuffleMode> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ShuffleMode>() {
        public ShuffleMode findValueByNumber(int number) {
          return ShuffleMode.forNumber(number);
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
    return com.google.events.cloud.dataflow.v1beta3.Data.getDescriptor().getEnumTypes().get(6);
  }

  private static final ShuffleMode[] VALUES = values();

  public static ShuffleMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ShuffleMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.dataflow.v1beta3.ShuffleMode)
}
