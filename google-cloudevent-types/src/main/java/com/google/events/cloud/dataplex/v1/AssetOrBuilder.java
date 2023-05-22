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
// source: google/events/cloud/dataplex/v1/data.proto

package com.google.events.cloud.dataplex.v1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.dataplex.v1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the asset, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}`.
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
   * Output only. The relative resource name of the asset, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}`.
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
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the asset. This ID
   * will be different if the asset is deleted and re-created with the same
   * name.
   * </pre>
   *
   * <code>string uid = 3;</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the asset. This ID
   * will be different if the asset is deleted and re-created with the same
   * name.
   * </pre>
   *
   * <code>string uid = 3;</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the asset was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the asset.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the asset.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the asset.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the asset.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the asset.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Description of the asset.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the asset.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.State state = 8;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.State state = 8;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.dataplex.v1.State getState();

  /**
   *
   *
   * <pre>
   * Required. Specification of the resource that is referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceSpec resource_spec = 100;</code>
   *
   * @return Whether the resourceSpec field is set.
   */
  boolean hasResourceSpec();
  /**
   *
   *
   * <pre>
   * Required. Specification of the resource that is referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceSpec resource_spec = 100;</code>
   *
   * @return The resourceSpec.
   */
  com.google.events.cloud.dataplex.v1.Asset.ResourceSpec getResourceSpec();
  /**
   *
   *
   * <pre>
   * Required. Specification of the resource that is referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceSpec resource_spec = 100;</code>
   */
  com.google.events.cloud.dataplex.v1.Asset.ResourceSpecOrBuilder getResourceSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the resource referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceStatus resource_status = 101;</code>
   *
   * @return Whether the resourceStatus field is set.
   */
  boolean hasResourceStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the resource referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceStatus resource_status = 101;</code>
   *
   * @return The resourceStatus.
   */
  com.google.events.cloud.dataplex.v1.Asset.ResourceStatus getResourceStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the resource referenced by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.ResourceStatus resource_status = 101;</code>
   */
  com.google.events.cloud.dataplex.v1.Asset.ResourceStatusOrBuilder getResourceStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the security policy applied to resource referenced
   * by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.SecurityStatus security_status = 103;</code>
   *
   * @return Whether the securityStatus field is set.
   */
  boolean hasSecurityStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the security policy applied to resource referenced
   * by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.SecurityStatus security_status = 103;</code>
   *
   * @return The securityStatus.
   */
  com.google.events.cloud.dataplex.v1.Asset.SecurityStatus getSecurityStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the security policy applied to resource referenced
   * by this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.SecurityStatus security_status = 103;</code>
   */
  com.google.events.cloud.dataplex.v1.Asset.SecurityStatusOrBuilder getSecurityStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specification of the discovery feature applied to data referenced
   * by this asset. When this spec is left unset, the asset will use the spec
   * set on the parent zone.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoverySpec discovery_spec = 106;</code>
   *
   * @return Whether the discoverySpec field is set.
   */
  boolean hasDiscoverySpec();
  /**
   *
   *
   * <pre>
   * Optional. Specification of the discovery feature applied to data referenced
   * by this asset. When this spec is left unset, the asset will use the spec
   * set on the parent zone.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoverySpec discovery_spec = 106;</code>
   *
   * @return The discoverySpec.
   */
  com.google.events.cloud.dataplex.v1.Asset.DiscoverySpec getDiscoverySpec();
  /**
   *
   *
   * <pre>
   * Optional. Specification of the discovery feature applied to data referenced
   * by this asset. When this spec is left unset, the asset will use the spec
   * set on the parent zone.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoverySpec discovery_spec = 106;</code>
   */
  com.google.events.cloud.dataplex.v1.Asset.DiscoverySpecOrBuilder getDiscoverySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the discovery feature applied to data referenced by
   * this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoveryStatus discovery_status = 107;</code>
   *
   * @return Whether the discoveryStatus field is set.
   */
  boolean hasDiscoveryStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the discovery feature applied to data referenced by
   * this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoveryStatus discovery_status = 107;</code>
   *
   * @return The discoveryStatus.
   */
  com.google.events.cloud.dataplex.v1.Asset.DiscoveryStatus getDiscoveryStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the discovery feature applied to data referenced by
   * this asset.
   * </pre>
   *
   * <code>.google.events.cloud.dataplex.v1.Asset.DiscoveryStatus discovery_status = 107;</code>
   */
  com.google.events.cloud.dataplex.v1.Asset.DiscoveryStatusOrBuilder getDiscoveryStatusOrBuilder();
}
