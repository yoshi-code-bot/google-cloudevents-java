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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

public interface CustomTargetSkaffoldActionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.CustomTargetSkaffoldActions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold custom action responsible for render operations. If
   * not provided then Cloud Deploy will perform the render operations via
   * `skaffold render`.
   * </pre>
   *
   * <code>string render_action = 1;</code>
   *
   * @return The renderAction.
   */
  java.lang.String getRenderAction();

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold custom action responsible for render operations. If
   * not provided then Cloud Deploy will perform the render operations via
   * `skaffold render`.
   * </pre>
   *
   * <code>string render_action = 1;</code>
   *
   * @return The bytes for renderAction.
   */
  com.google.protobuf.ByteString getRenderActionBytes();

  /**
   *
   *
   * <pre>
   * Required. The Skaffold custom action responsible for deploy operations.
   * </pre>
   *
   * <code>string deploy_action = 2;</code>
   *
   * @return The deployAction.
   */
  java.lang.String getDeployAction();

  /**
   *
   *
   * <pre>
   * Required. The Skaffold custom action responsible for deploy operations.
   * </pre>
   *
   * <code>string deploy_action = 2;</code>
   *
   * @return The bytes for deployAction.
   */
  com.google.protobuf.ByteString getDeployActionBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of Skaffold modules Cloud Deploy will include in the
   * Skaffold Config as required before performing diagnose.
   * </pre>
   *
   * <code>repeated .google.events.cloud.deploy.v1.SkaffoldModules include_skaffold_modules = 3;
   * </code>
   */
  java.util.List<com.google.events.cloud.deploy.v1.SkaffoldModules> getIncludeSkaffoldModulesList();

  /**
   *
   *
   * <pre>
   * Optional. List of Skaffold modules Cloud Deploy will include in the
   * Skaffold Config as required before performing diagnose.
   * </pre>
   *
   * <code>repeated .google.events.cloud.deploy.v1.SkaffoldModules include_skaffold_modules = 3;
   * </code>
   */
  com.google.events.cloud.deploy.v1.SkaffoldModules getIncludeSkaffoldModules(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of Skaffold modules Cloud Deploy will include in the
   * Skaffold Config as required before performing diagnose.
   * </pre>
   *
   * <code>repeated .google.events.cloud.deploy.v1.SkaffoldModules include_skaffold_modules = 3;
   * </code>
   */
  int getIncludeSkaffoldModulesCount();

  /**
   *
   *
   * <pre>
   * Optional. List of Skaffold modules Cloud Deploy will include in the
   * Skaffold Config as required before performing diagnose.
   * </pre>
   *
   * <code>repeated .google.events.cloud.deploy.v1.SkaffoldModules include_skaffold_modules = 3;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.deploy.v1.SkaffoldModulesOrBuilder>
      getIncludeSkaffoldModulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. List of Skaffold modules Cloud Deploy will include in the
   * Skaffold Config as required before performing diagnose.
   * </pre>
   *
   * <code>repeated .google.events.cloud.deploy.v1.SkaffoldModules include_skaffold_modules = 3;
   * </code>
   */
  com.google.events.cloud.deploy.v1.SkaffoldModulesOrBuilder getIncludeSkaffoldModulesOrBuilder(
      int index);
}
