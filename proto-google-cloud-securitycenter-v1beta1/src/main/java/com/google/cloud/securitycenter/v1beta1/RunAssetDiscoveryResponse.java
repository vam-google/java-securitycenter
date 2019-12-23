/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/run_asset_discovery_response.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 *
 *
 * <pre>
 * Response of asset discovery run
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse}
 */
public final class RunAssetDiscoveryResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)
    RunAssetDiscoveryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunAssetDiscoveryResponse.newBuilder() to construct.
  private RunAssetDiscoveryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunAssetDiscoveryResponse() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunAssetDiscoveryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RunAssetDiscoveryResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (duration_ != null) {
                subBuilder = duration_.toBuilder();
              }
              duration_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(duration_);
                duration_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOuterClass
        .internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOuterClass
        .internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.class,
            com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The state of an asset discovery run.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Asset discovery run state was unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Asset discovery run completed successfully.
     * </pre>
     *
     * <code>COMPLETED = 1;</code>
     */
    COMPLETED(1),
    /**
     *
     *
     * <pre>
     * Asset discovery run was cancelled with tasks still pending, as another
     * run for the same organization was started with a higher priority.
     * </pre>
     *
     * <code>SUPERSEDED = 2;</code>
     */
    SUPERSEDED(2),
    /**
     *
     *
     * <pre>
     * Asset discovery run was killed and terminated.
     * </pre>
     *
     * <code>TERMINATED = 3;</code>
     */
    TERMINATED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Asset discovery run state was unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Asset discovery run completed successfully.
     * </pre>
     *
     * <code>COMPLETED = 1;</code>
     */
    public static final int COMPLETED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Asset discovery run was cancelled with tasks still pending, as another
     * run for the same organization was started with a higher priority.
     * </pre>
     *
     * <code>SUPERSEDED = 2;</code>
     */
    public static final int SUPERSEDED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Asset discovery run was killed and terminated.
     * </pre>
     *
     * <code>TERMINATED = 3;</code>
     */
    public static final int TERMINATED_VALUE = 3;

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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return COMPLETED;
        case 2:
          return SUPERSEDED;
        case 3:
          return TERMINATED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   *
   *
   * <pre>
   * The state of an asset discovery run.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The state of an asset discovery run.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
   *
   * @return The state.
   */
  public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State result =
        com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.valueOf(state_);
    return result == null
        ? com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.UNRECOGNIZED
        : result;
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration duration_;
  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return Whether the duration field is set.
   */
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return The duration.
   */
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (state_
        != com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, state_);
    }
    if (duration_ != null) {
      output.writeMessage(2, getDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDuration());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse other =
        (com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse) obj;

    if (state_ != other.state_) return false;
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration().equals(other.getDuration())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response of asset discovery run
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.class,
              com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = 0;

      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponseOuterClass
          .internal_static_google_cloud_securitycenter_v1beta1_RunAssetDiscoveryResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse build() {
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse buildPartial() {
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse result =
          new com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse(this);
      result.state_ = state_;
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse other) {
      if (other
          == com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The state of an asset discovery run.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The state of an asset discovery run.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of an asset discovery run.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
     *
     * @return The state.
     */
    public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State result =
          com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.valueOf(state_);
      return result == null
          ? com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The state of an asset discovery run.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of an asset discovery run.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        durationBuilder_;
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     *
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     *
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
              com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {

      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     *
     *
     * <pre>
     * The duration between asset discovery run start and end
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getDuration(), getParentForChildren(), isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse)
  private static final com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse();
  }

  public static com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunAssetDiscoveryResponse> PARSER =
      new com.google.protobuf.AbstractParser<RunAssetDiscoveryResponse>() {
        @java.lang.Override
        public RunAssetDiscoveryResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RunAssetDiscoveryResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RunAssetDiscoveryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunAssetDiscoveryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
