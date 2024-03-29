// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/kavadist/v1beta1/genesis.proto

package com.kava.kavadist.v1beta1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:kava.kavadist.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    com.kava.kavadist.v1beta1.ParamsProto.Params getParams();
    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder();

    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the previousBlockTime field is set.
     */
    boolean hasPreviousBlockTime();
    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The previousBlockTime.
     */
    com.google.protobuf.Timestamp getPreviousBlockTime();
    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    com.google.protobuf.TimestampOrBuilder getPreviousBlockTimeOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the kavadist module's genesis state.
   * </pre>
   *
   * Protobuf type {@code kava.kavadist.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:kava.kavadist.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.kavadist.v1beta1.GenesisProto.internal_static_kava_kavadist_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.kavadist.v1beta1.GenesisProto.internal_static_kava_kavadist_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.kavadist.v1beta1.GenesisProto.GenesisState.class, com.kava.kavadist.v1beta1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private com.kava.kavadist.v1beta1.ParamsProto.Params params_;
    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public com.kava.kavadist.v1beta1.ParamsProto.Params getParams() {
      return params_ == null ? com.kava.kavadist.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
    }
    /**
     * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? com.kava.kavadist.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
    }

    public static final int PREVIOUS_BLOCK_TIME_FIELD_NUMBER = 2;
    private com.google.protobuf.Timestamp previousBlockTime_;
    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the previousBlockTime field is set.
     */
    @java.lang.Override
    public boolean hasPreviousBlockTime() {
      return previousBlockTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The previousBlockTime.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getPreviousBlockTime() {
      return previousBlockTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousBlockTime_;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getPreviousBlockTimeOrBuilder() {
      return previousBlockTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousBlockTime_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (params_ != null) {
        output.writeMessage(1, getParams());
      }
      if (previousBlockTime_ != null) {
        output.writeMessage(2, getPreviousBlockTime());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getParams());
      }
      if (previousBlockTime_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPreviousBlockTime());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.kava.kavadist.v1beta1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.kava.kavadist.v1beta1.GenesisProto.GenesisState other = (com.kava.kavadist.v1beta1.GenesisProto.GenesisState) obj;

      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (hasPreviousBlockTime() != other.hasPreviousBlockTime()) return false;
      if (hasPreviousBlockTime()) {
        if (!getPreviousBlockTime()
            .equals(other.getPreviousBlockTime())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      if (hasPreviousBlockTime()) {
        hash = (37 * hash) + PREVIOUS_BLOCK_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getPreviousBlockTime().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.kava.kavadist.v1beta1.GenesisProto.GenesisState prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * GenesisState defines the kavadist module's genesis state.
     * </pre>
     *
     * Protobuf type {@code kava.kavadist.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:kava.kavadist.v1beta1.GenesisState)
        com.kava.kavadist.v1beta1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kava.kavadist.v1beta1.GenesisProto.internal_static_kava_kavadist_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kava.kavadist.v1beta1.GenesisProto.internal_static_kava_kavadist_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kava.kavadist.v1beta1.GenesisProto.GenesisState.class, com.kava.kavadist.v1beta1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.kava.kavadist.v1beta1.GenesisProto.GenesisState.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        previousBlockTime_ = null;
        if (previousBlockTimeBuilder_ != null) {
          previousBlockTimeBuilder_.dispose();
          previousBlockTimeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kava.kavadist.v1beta1.GenesisProto.internal_static_kava_kavadist_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.kava.kavadist.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.kava.kavadist.v1beta1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.kava.kavadist.v1beta1.GenesisProto.GenesisState build() {
        com.kava.kavadist.v1beta1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kava.kavadist.v1beta1.GenesisProto.GenesisState buildPartial() {
        com.kava.kavadist.v1beta1.GenesisProto.GenesisState result = new com.kava.kavadist.v1beta1.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.kava.kavadist.v1beta1.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.params_ = paramsBuilder_ == null
              ? params_
              : paramsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.previousBlockTime_ = previousBlockTimeBuilder_ == null
              ? previousBlockTime_
              : previousBlockTimeBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kava.kavadist.v1beta1.GenesisProto.GenesisState) {
          return mergeFrom((com.kava.kavadist.v1beta1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kava.kavadist.v1beta1.GenesisProto.GenesisState other) {
        if (other == com.kava.kavadist.v1beta1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        if (other.hasPreviousBlockTime()) {
          mergePreviousBlockTime(other.getPreviousBlockTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getParamsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getPreviousBlockTimeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.kava.kavadist.v1beta1.ParamsProto.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.kava.kavadist.v1beta1.ParamsProto.Params, com.kava.kavadist.v1beta1.ParamsProto.Params.Builder, com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder> paramsBuilder_;
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public com.kava.kavadist.v1beta1.ParamsProto.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? com.kava.kavadist.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(com.kava.kavadist.v1beta1.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
        } else {
          paramsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          com.kava.kavadist.v1beta1.ParamsProto.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(com.kava.kavadist.v1beta1.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            params_ != null &&
            params_ != com.kava.kavadist.v1beta1.ParamsProto.Params.getDefaultInstance()) {
            getParamsBuilder().mergeFrom(value);
          } else {
            params_ = value;
          }
        } else {
          paramsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000001);
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.kava.kavadist.v1beta1.ParamsProto.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              com.kava.kavadist.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <code>.kava.kavadist.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.kava.kavadist.v1beta1.ParamsProto.Params, com.kava.kavadist.v1beta1.ParamsProto.Params.Builder, com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.kava.kavadist.v1beta1.ParamsProto.Params, com.kava.kavadist.v1beta1.ParamsProto.Params.Builder, com.kava.kavadist.v1beta1.ParamsProto.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private com.google.protobuf.Timestamp previousBlockTime_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> previousBlockTimeBuilder_;
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return Whether the previousBlockTime field is set.
       */
      public boolean hasPreviousBlockTime() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return The previousBlockTime.
       */
      public com.google.protobuf.Timestamp getPreviousBlockTime() {
        if (previousBlockTimeBuilder_ == null) {
          return previousBlockTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousBlockTime_;
        } else {
          return previousBlockTimeBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setPreviousBlockTime(com.google.protobuf.Timestamp value) {
        if (previousBlockTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          previousBlockTime_ = value;
        } else {
          previousBlockTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setPreviousBlockTime(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (previousBlockTimeBuilder_ == null) {
          previousBlockTime_ = builderForValue.build();
        } else {
          previousBlockTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder mergePreviousBlockTime(com.google.protobuf.Timestamp value) {
        if (previousBlockTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            previousBlockTime_ != null &&
            previousBlockTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getPreviousBlockTimeBuilder().mergeFrom(value);
          } else {
            previousBlockTime_ = value;
          }
        } else {
          previousBlockTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder clearPreviousBlockTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        previousBlockTime_ = null;
        if (previousBlockTimeBuilder_ != null) {
          previousBlockTimeBuilder_.dispose();
          previousBlockTimeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.Timestamp.Builder getPreviousBlockTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPreviousBlockTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.TimestampOrBuilder getPreviousBlockTimeOrBuilder() {
        if (previousBlockTimeBuilder_ != null) {
          return previousBlockTimeBuilder_.getMessageOrBuilder();
        } else {
          return previousBlockTime_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : previousBlockTime_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp previous_block_time = 2 [json_name = "previousBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getPreviousBlockTimeFieldBuilder() {
        if (previousBlockTimeBuilder_ == null) {
          previousBlockTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getPreviousBlockTime(),
                  getParentForChildren(),
                  isClean());
          previousBlockTime_ = null;
        }
        return previousBlockTimeBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:kava.kavadist.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:kava.kavadist.v1beta1.GenesisState)
    private static final com.kava.kavadist.v1beta1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kava.kavadist.v1beta1.GenesisProto.GenesisState();
    }

    public static com.kava.kavadist.v1beta1.GenesisProto.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.kava.kavadist.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_kavadist_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_kavadist_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#kava/kavadist/v1beta1/genesis.proto\022\025k" +
      "ava.kavadist.v1beta1\032\024gogoproto/gogo.pro" +
      "to\032\037google/protobuf/timestamp.proto\032\"kav" +
      "a/kavadist/v1beta1/params.proto\"\241\001\n\014Gene" +
      "sisState\022;\n\006params\030\001 \001(\0132\035.kava.kavadist" +
      ".v1beta1.ParamsB\004\310\336\037\000R\006params\022T\n\023previou" +
      "s_block_time\030\002 \001(\0132\032.google.protobuf.Tim" +
      "estampB\010\310\336\037\000\220\337\037\001R\021previousBlockTimeB\311\001\n\031" +
      "com.kava.kavadist.v1beta1B\014GenesisProtoZ" +
      "*github.com/kava-labs/kava/x/kavadist/ty" +
      "pes\242\002\003KKX\252\002\025Kava.Kavadist.V1beta1\312\002\025Kava" +
      "\\Kavadist\\V1beta1\342\002!Kava\\Kavadist\\V1beta" +
      "1\\GPBMetadata\352\002\027Kava::Kavadist::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.kava.kavadist.v1beta1.ParamsProto.getDescriptor(),
        });
    internal_static_kava_kavadist_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_kavadist_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_kavadist_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "PreviousBlockTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.kava.kavadist.v1beta1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
