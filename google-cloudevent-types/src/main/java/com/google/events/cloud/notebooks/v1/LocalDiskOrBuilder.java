/*
 * Copyright 2025 Google LLC
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
// source: google/events/cloud/notebooks/v1/data.proto

package com.google.events.cloud.notebooks.v1;

public interface LocalDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.notebooks.v1.LocalDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Output only. Specifies whether the disk will be auto-deleted when
   * the instance is deleted (but not when the disk is detached from the
   * instance).
   * </pre>
   *
   * <code>bool auto_delete = 1;</code>
   *
   * @return The autoDelete.
   */
  boolean getAutoDelete();

  /**
   *
   *
   * <pre>
   * Optional. Output only. Indicates that this is a boot disk. The virtual
   * machine will use the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>bool boot = 2;</code>
   *
   * @return The boot.
   */
  boolean getBoot();

  /**
   *
   *
   * <pre>
   * Optional. Output only. Specifies a unique device name
   * of your choice that is reflected into the
   * `/dev/disk/by-id/google-*` tree of a Linux operating system running within
   * the instance. This name can be used to reference the device for mounting,
   * resizing, and so on, from within the instance.
   * If not specified, the server chooses a default device name to apply to this
   * disk, in the form persistent-disk-x, where x is a number assigned by Google
   * Compute Engine. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>string device_name = 3;</code>
   *
   * @return The deviceName.
   */
  java.lang.String getDeviceName();

  /**
   *
   *
   * <pre>
   * Optional. Output only. Specifies a unique device name
   * of your choice that is reflected into the
   * `/dev/disk/by-id/google-*` tree of a Linux operating system running within
   * the instance. This name can be used to reference the device for mounting,
   * resizing, and so on, from within the instance.
   * If not specified, the server chooses a default device name to apply to this
   * disk, in the form persistent-disk-x, where x is a number assigned by Google
   * Compute Engine. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>string device_name = 3;</code>
   *
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString getDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates a list of features to enable on the guest operating
   * system. Applicable only for bootable images. Read  Enabling guest operating
   * system features to see a list of available options.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature guest_os_features = 4;
   * </code>
   */
  java.util.List<com.google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature>
      getGuestOsFeaturesList();

  /**
   *
   *
   * <pre>
   * Output only. Indicates a list of features to enable on the guest operating
   * system. Applicable only for bootable images. Read  Enabling guest operating
   * system features to see a list of available options.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature guest_os_features = 4;
   * </code>
   */
  com.google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature getGuestOsFeatures(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Indicates a list of features to enable on the guest operating
   * system. Applicable only for bootable images. Read  Enabling guest operating
   * system features to see a list of available options.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature guest_os_features = 4;
   * </code>
   */
  int getGuestOsFeaturesCount();

  /**
   *
   *
   * <pre>
   * Output only. Indicates a list of features to enable on the guest operating
   * system. Applicable only for bootable images. Read  Enabling guest operating
   * system features to see a list of available options.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature guest_os_features = 4;
   * </code>
   */
  java.util.List<
          ? extends com.google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeatureOrBuilder>
      getGuestOsFeaturesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Indicates a list of features to enable on the guest operating
   * system. Applicable only for bootable images. Read  Enabling guest operating
   * system features to see a list of available options.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeature guest_os_features = 4;
   * </code>
   */
  com.google.events.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeatureOrBuilder
      getGuestOsFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A zero-based index to this disk, where 0 is reserved for the
   * boot disk. If you have many disks attached to an instance, each disk would
   * have a unique index number.
   * </pre>
   *
   * <code>int32 index = 5;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is
   * either SCSI or NVME. The default is SCSI. Persistent disks must always use
   * SCSI and the request will fail if you attempt to attach a persistent disk
   * in any other format than SCSI. Local SSDs can use either NVME or SCSI. For
   * performance characteristics of SCSI over NVMe, see Local SSD performance.
   * Valid values:
   * * `NVME`
   * * `SCSI`
   * </pre>
   *
   * <code>string interface = 7;</code>
   *
   * @return The interface.
   */
  java.lang.String getInterface();

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is
   * either SCSI or NVME. The default is SCSI. Persistent disks must always use
   * SCSI and the request will fail if you attempt to attach a persistent disk
   * in any other format than SCSI. Local SSDs can use either NVME or SCSI. For
   * performance characteristics of SCSI over NVMe, see Local SSD performance.
   * Valid values:
   * * `NVME`
   * * `SCSI`
   * </pre>
   *
   * <code>string interface = 7;</code>
   *
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString getInterfaceBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of the resource. Always compute#attachedDisk for attached
   * disks.
   * </pre>
   *
   * <code>string kind = 8;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * Output only. Type of the resource. Always compute#attachedDisk for attached
   * disks.
   * </pre>
   *
   * <code>string kind = 8;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Output only. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 9;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();

  /**
   *
   *
   * <pre>
   * Output only. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 9;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();

  /**
   *
   *
   * <pre>
   * Output only. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);

  /**
   *
   *
   * <pre>
   * Output only. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk, either `READ_WRITE` or `READ_ONLY`.
   * If not specified, the default is to attach the disk in `READ_WRITE` mode.
   * Valid values:
   * * `READ_ONLY`
   * * `READ_WRITE`
   * </pre>
   *
   * <code>string mode = 10;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();

  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk, either `READ_WRITE` or `READ_ONLY`.
   * If not specified, the default is to attach the disk in `READ_WRITE` mode.
   * Valid values:
   * * `READ_ONLY`
   * * `READ_WRITE`
   * </pre>
   *
   * <code>string mode = 10;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();

  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk
   * resource.
   * </pre>
   *
   * <code>string source = 11;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();

  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk
   * resource.
   * </pre>
   *
   * <code>string source = 11;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk, either `SCRATCH` or `PERSISTENT`. If not
   * specified, the default is `PERSISTENT`.
   * Valid values:
   * * `PERSISTENT`
   * * `SCRATCH`
   * </pre>
   *
   * <code>string type = 12;</code>
   *
   * @return The type.
   */
  java.lang.String getType();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk, either `SCRATCH` or `PERSISTENT`. If not
   * specified, the default is `PERSISTENT`.
   * Valid values:
   * * `PERSISTENT`
   * * `SCRATCH`
   * </pre>
   *
   * <code>string type = 12;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
