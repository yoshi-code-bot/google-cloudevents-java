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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

public interface ConnectionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datastream.v1.ConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource's name.
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
   * Output only. The resource's name.
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
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Oracle ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleProfile oracle_profile = 100;</code>
   *
   * @return Whether the oracleProfile field is set.
   */
  boolean hasOracleProfile();

  /**
   *
   *
   * <pre>
   * Oracle ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleProfile oracle_profile = 100;</code>
   *
   * @return The oracleProfile.
   */
  com.google.events.cloud.datastream.v1.OracleProfile getOracleProfile();

  /**
   *
   *
   * <pre>
   * Oracle ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleProfile oracle_profile = 100;</code>
   */
  com.google.events.cloud.datastream.v1.OracleProfileOrBuilder getOracleProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.GcsProfile gcs_profile = 101;</code>
   *
   * @return Whether the gcsProfile field is set.
   */
  boolean hasGcsProfile();

  /**
   *
   *
   * <pre>
   * Cloud Storage ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.GcsProfile gcs_profile = 101;</code>
   *
   * @return The gcsProfile.
   */
  com.google.events.cloud.datastream.v1.GcsProfile getGcsProfile();

  /**
   *
   *
   * <pre>
   * Cloud Storage ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.GcsProfile gcs_profile = 101;</code>
   */
  com.google.events.cloud.datastream.v1.GcsProfileOrBuilder getGcsProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * MySQL ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlProfile mysql_profile = 102;</code>
   *
   * @return Whether the mysqlProfile field is set.
   */
  boolean hasMysqlProfile();

  /**
   *
   *
   * <pre>
   * MySQL ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlProfile mysql_profile = 102;</code>
   *
   * @return The mysqlProfile.
   */
  com.google.events.cloud.datastream.v1.MysqlProfile getMysqlProfile();

  /**
   *
   *
   * <pre>
   * MySQL ConnectionProfile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlProfile mysql_profile = 102;</code>
   */
  com.google.events.cloud.datastream.v1.MysqlProfileOrBuilder getMysqlProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * BigQuery Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.BigQueryProfile bigquery_profile = 103;</code>
   *
   * @return Whether the bigqueryProfile field is set.
   */
  boolean hasBigqueryProfile();

  /**
   *
   *
   * <pre>
   * BigQuery Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.BigQueryProfile bigquery_profile = 103;</code>
   *
   * @return The bigqueryProfile.
   */
  com.google.events.cloud.datastream.v1.BigQueryProfile getBigqueryProfile();

  /**
   *
   *
   * <pre>
   * BigQuery Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.BigQueryProfile bigquery_profile = 103;</code>
   */
  com.google.events.cloud.datastream.v1.BigQueryProfileOrBuilder getBigqueryProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * PostgreSQL Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlProfile postgresql_profile = 104;</code>
   *
   * @return Whether the postgresqlProfile field is set.
   */
  boolean hasPostgresqlProfile();

  /**
   *
   *
   * <pre>
   * PostgreSQL Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlProfile postgresql_profile = 104;</code>
   *
   * @return The postgresqlProfile.
   */
  com.google.events.cloud.datastream.v1.PostgresqlProfile getPostgresqlProfile();

  /**
   *
   *
   * <pre>
   * PostgreSQL Connection Profile configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlProfile postgresql_profile = 104;</code>
   */
  com.google.events.cloud.datastream.v1.PostgresqlProfileOrBuilder getPostgresqlProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Static Service IP connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.StaticServiceIpConnectivity static_service_ip_connectivity = 200;
   * </code>
   *
   * @return Whether the staticServiceIpConnectivity field is set.
   */
  boolean hasStaticServiceIpConnectivity();

  /**
   *
   *
   * <pre>
   * Static Service IP connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.StaticServiceIpConnectivity static_service_ip_connectivity = 200;
   * </code>
   *
   * @return The staticServiceIpConnectivity.
   */
  com.google.events.cloud.datastream.v1.StaticServiceIpConnectivity
      getStaticServiceIpConnectivity();

  /**
   *
   *
   * <pre>
   * Static Service IP connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.StaticServiceIpConnectivity static_service_ip_connectivity = 200;
   * </code>
   */
  com.google.events.cloud.datastream.v1.StaticServiceIpConnectivityOrBuilder
      getStaticServiceIpConnectivityOrBuilder();

  /**
   *
   *
   * <pre>
   * Forward SSH tunnel connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.ForwardSshTunnelConnectivity forward_ssh_connectivity = 201;
   * </code>
   *
   * @return Whether the forwardSshConnectivity field is set.
   */
  boolean hasForwardSshConnectivity();

  /**
   *
   *
   * <pre>
   * Forward SSH tunnel connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.ForwardSshTunnelConnectivity forward_ssh_connectivity = 201;
   * </code>
   *
   * @return The forwardSshConnectivity.
   */
  com.google.events.cloud.datastream.v1.ForwardSshTunnelConnectivity getForwardSshConnectivity();

  /**
   *
   *
   * <pre>
   * Forward SSH tunnel connectivity.
   * </pre>
   *
   * <code>
   * .google.events.cloud.datastream.v1.ForwardSshTunnelConnectivity forward_ssh_connectivity = 201;
   * </code>
   */
  com.google.events.cloud.datastream.v1.ForwardSshTunnelConnectivityOrBuilder
      getForwardSshConnectivityOrBuilder();

  /**
   *
   *
   * <pre>
   * Private connectivity.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PrivateConnectivity private_connectivity = 202;</code>
   *
   * @return Whether the privateConnectivity field is set.
   */
  boolean hasPrivateConnectivity();

  /**
   *
   *
   * <pre>
   * Private connectivity.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PrivateConnectivity private_connectivity = 202;</code>
   *
   * @return The privateConnectivity.
   */
  com.google.events.cloud.datastream.v1.PrivateConnectivity getPrivateConnectivity();

  /**
   *
   *
   * <pre>
   * Private connectivity.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PrivateConnectivity private_connectivity = 202;</code>
   */
  com.google.events.cloud.datastream.v1.PrivateConnectivityOrBuilder
      getPrivateConnectivityOrBuilder();

  public com.google.events.cloud.datastream.v1.ConnectionProfile.ProfileCase getProfileCase();

  public com.google.events.cloud.datastream.v1.ConnectionProfile.ConnectivityCase
      getConnectivityCase();
}
