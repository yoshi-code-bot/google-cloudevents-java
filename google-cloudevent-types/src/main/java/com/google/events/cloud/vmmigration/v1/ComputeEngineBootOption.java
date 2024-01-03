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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * Possible values for vm boot option.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.vmmigration.v1.ComputeEngineBootOption}
 */
public enum ComputeEngineBootOption implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The boot option is unknown.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_UNSPECIFIED = 0;</code>
   */
  COMPUTE_ENGINE_BOOT_OPTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The boot option is EFI.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_EFI = 1;</code>
   */
  COMPUTE_ENGINE_BOOT_OPTION_EFI(1),
  /**
   *
   *
   * <pre>
   * The boot option is BIOS.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_BIOS = 2;</code>
   */
  COMPUTE_ENGINE_BOOT_OPTION_BIOS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The boot option is unknown.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_UNSPECIFIED = 0;</code>
   */
  public static final int COMPUTE_ENGINE_BOOT_OPTION_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The boot option is EFI.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_EFI = 1;</code>
   */
  public static final int COMPUTE_ENGINE_BOOT_OPTION_EFI_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The boot option is BIOS.
   * </pre>
   *
   * <code>COMPUTE_ENGINE_BOOT_OPTION_BIOS = 2;</code>
   */
  public static final int COMPUTE_ENGINE_BOOT_OPTION_BIOS_VALUE = 2;

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
  public static ComputeEngineBootOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ComputeEngineBootOption forNumber(int value) {
    switch (value) {
      case 0:
        return COMPUTE_ENGINE_BOOT_OPTION_UNSPECIFIED;
      case 1:
        return COMPUTE_ENGINE_BOOT_OPTION_EFI;
      case 2:
        return COMPUTE_ENGINE_BOOT_OPTION_BIOS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComputeEngineBootOption>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ComputeEngineBootOption>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ComputeEngineBootOption>() {
            public ComputeEngineBootOption findValueByNumber(int number) {
              return ComputeEngineBootOption.forNumber(number);
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
    return com.google.events.cloud.vmmigration.v1.Data.getDescriptor().getEnumTypes().get(2);
  }

  private static final ComputeEngineBootOption[] VALUES = values();

  public static ComputeEngineBootOption valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ComputeEngineBootOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.vmmigration.v1.ComputeEngineBootOption)
}
