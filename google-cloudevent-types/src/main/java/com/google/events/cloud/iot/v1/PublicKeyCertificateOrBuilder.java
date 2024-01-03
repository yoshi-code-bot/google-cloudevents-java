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
// source: google/events/cloud/iot/v1/data.proto

package com.google.events.cloud.iot.v1;

public interface PublicKeyCertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.iot.v1.PublicKeyCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The certificate format.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();

  /**
   *
   *
   * <pre>
   * The certificate format.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
   *
   * @return The format.
   */
  com.google.events.cloud.iot.v1.PublicKeyCertificateFormat getFormat();

  /**
   *
   *
   * <pre>
   * The certificate data.
   * </pre>
   *
   * <code>string certificate = 2;</code>
   *
   * @return The certificate.
   */
  java.lang.String getCertificate();

  /**
   *
   *
   * <pre>
   * The certificate data.
   * </pre>
   *
   * <code>string certificate = 2;</code>
   *
   * @return The bytes for certificate.
   */
  com.google.protobuf.ByteString getCertificateBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   *
   * @return Whether the x509Details field is set.
   */
  boolean hasX509Details();

  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   *
   * @return The x509Details.
   */
  com.google.events.cloud.iot.v1.X509CertificateDetails getX509Details();

  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   */
  com.google.events.cloud.iot.v1.X509CertificateDetailsOrBuilder getX509DetailsOrBuilder();
}
