// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

public interface AuthorizationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.audit.v1.AuthorizationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource being accessed, as a REST-style string. For example:
   *     bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   * <pre>
   * The resource being accessed, as a REST-style string. For example:
   *     bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
   * </pre>
   *
   * <code>string resource = 1;</code>
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString
      getResourceBytes();

  /**
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   * @return The permission.
   */
  java.lang.String getPermission();
  /**
   * <pre>
   * The required IAM permission.
   * </pre>
   *
   * <code>string permission = 2;</code>
   * @return The bytes for permission.
   */
  com.google.protobuf.ByteString
      getPermissionBytes();

  /**
   * <pre>
   * Whether or not authorization for `resource` and `permission`
   * was granted.
   * </pre>
   *
   * <code>bool granted = 3;</code>
   * @return The granted.
   */
  boolean getGranted();

  /**
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLogData.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   * @return Whether the resourceAttributes field is set.
   */
  boolean hasResourceAttributes();
  /**
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLogData.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   * @return The resourceAttributes.
   */
  com.google.rpc.context.AttributeContext.Resource getResourceAttributes();
  /**
   * <pre>
   * Resource attributes used in IAM condition evaluation. This field contains
   * resource attributes like resource type and resource name.
   * To get the whole view of the attributes used in IAM
   * condition evaluation, the user must also look into
   * `AuditLogData.request_metadata.request_attributes`.
   * </pre>
   *
   * <code>.google.rpc.context.AttributeContext.Resource resource_attributes = 5;</code>
   */
  com.google.rpc.context.AttributeContext.ResourceOrBuilder getResourceAttributesOrBuilder();
}
