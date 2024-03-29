// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/gov/v1beta3/genesis.proto

package com.akash.gov.v1beta3;

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
      // @@protoc_insertion_point(interface_extends:akash.gov.v1beta3.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     * @return Whether the depositParams field is set.
     */
    boolean hasDepositParams();
    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     * @return The depositParams.
     */
    com.akash.gov.v1beta3.ParamsProto.DepositParams getDepositParams();
    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     */
    com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder getDepositParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState stores slice of genesis deployment instance
   * </pre>
   *
   * Protobuf type {@code akash.gov.v1beta3.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.gov.v1beta3.GenesisState)
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
      return com.akash.gov.v1beta3.GenesisProto.internal_static_akash_gov_v1beta3_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.gov.v1beta3.GenesisProto.internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.gov.v1beta3.GenesisProto.GenesisState.class, com.akash.gov.v1beta3.GenesisProto.GenesisState.Builder.class);
    }

    public static final int DEPOSIT_PARAMS_FIELD_NUMBER = 1;
    private com.akash.gov.v1beta3.ParamsProto.DepositParams depositParams_;
    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     * @return Whether the depositParams field is set.
     */
    @java.lang.Override
    public boolean hasDepositParams() {
      return depositParams_ != null;
    }
    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     * @return The depositParams.
     */
    @java.lang.Override
    public com.akash.gov.v1beta3.ParamsProto.DepositParams getDepositParams() {
      return depositParams_ == null ? com.akash.gov.v1beta3.ParamsProto.DepositParams.getDefaultInstance() : depositParams_;
    }
    /**
     * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
     */
    @java.lang.Override
    public com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder getDepositParamsOrBuilder() {
      return depositParams_ == null ? com.akash.gov.v1beta3.ParamsProto.DepositParams.getDefaultInstance() : depositParams_;
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
      if (depositParams_ != null) {
        output.writeMessage(1, getDepositParams());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (depositParams_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDepositParams());
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
      if (!(obj instanceof com.akash.gov.v1beta3.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.akash.gov.v1beta3.GenesisProto.GenesisState other = (com.akash.gov.v1beta3.GenesisProto.GenesisState) obj;

      if (hasDepositParams() != other.hasDepositParams()) return false;
      if (hasDepositParams()) {
        if (!getDepositParams()
            .equals(other.getDepositParams())) return false;
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
      if (hasDepositParams()) {
        hash = (37 * hash) + DEPOSIT_PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getDepositParams().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.gov.v1beta3.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.akash.gov.v1beta3.GenesisProto.GenesisState prototype) {
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
     * GenesisState stores slice of genesis deployment instance
     * </pre>
     *
     * Protobuf type {@code akash.gov.v1beta3.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.gov.v1beta3.GenesisState)
        com.akash.gov.v1beta3.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akash.gov.v1beta3.GenesisProto.internal_static_akash_gov_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akash.gov.v1beta3.GenesisProto.internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akash.gov.v1beta3.GenesisProto.GenesisState.class, com.akash.gov.v1beta3.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.akash.gov.v1beta3.GenesisProto.GenesisState.newBuilder()
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
        depositParams_ = null;
        if (depositParamsBuilder_ != null) {
          depositParamsBuilder_.dispose();
          depositParamsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akash.gov.v1beta3.GenesisProto.internal_static_akash_gov_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.akash.gov.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.akash.gov.v1beta3.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.akash.gov.v1beta3.GenesisProto.GenesisState build() {
        com.akash.gov.v1beta3.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.akash.gov.v1beta3.GenesisProto.GenesisState buildPartial() {
        com.akash.gov.v1beta3.GenesisProto.GenesisState result = new com.akash.gov.v1beta3.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.akash.gov.v1beta3.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.depositParams_ = depositParamsBuilder_ == null
              ? depositParams_
              : depositParamsBuilder_.build();
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
        if (other instanceof com.akash.gov.v1beta3.GenesisProto.GenesisState) {
          return mergeFrom((com.akash.gov.v1beta3.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akash.gov.v1beta3.GenesisProto.GenesisState other) {
        if (other == com.akash.gov.v1beta3.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (other.hasDepositParams()) {
          mergeDepositParams(other.getDepositParams());
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
                    getDepositParamsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private com.akash.gov.v1beta3.ParamsProto.DepositParams depositParams_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.akash.gov.v1beta3.ParamsProto.DepositParams, com.akash.gov.v1beta3.ParamsProto.DepositParams.Builder, com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder> depositParamsBuilder_;
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       * @return Whether the depositParams field is set.
       */
      public boolean hasDepositParams() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       * @return The depositParams.
       */
      public com.akash.gov.v1beta3.ParamsProto.DepositParams getDepositParams() {
        if (depositParamsBuilder_ == null) {
          return depositParams_ == null ? com.akash.gov.v1beta3.ParamsProto.DepositParams.getDefaultInstance() : depositParams_;
        } else {
          return depositParamsBuilder_.getMessage();
        }
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public Builder setDepositParams(com.akash.gov.v1beta3.ParamsProto.DepositParams value) {
        if (depositParamsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          depositParams_ = value;
        } else {
          depositParamsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public Builder setDepositParams(
          com.akash.gov.v1beta3.ParamsProto.DepositParams.Builder builderForValue) {
        if (depositParamsBuilder_ == null) {
          depositParams_ = builderForValue.build();
        } else {
          depositParamsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public Builder mergeDepositParams(com.akash.gov.v1beta3.ParamsProto.DepositParams value) {
        if (depositParamsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            depositParams_ != null &&
            depositParams_ != com.akash.gov.v1beta3.ParamsProto.DepositParams.getDefaultInstance()) {
            getDepositParamsBuilder().mergeFrom(value);
          } else {
            depositParams_ = value;
          }
        } else {
          depositParamsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public Builder clearDepositParams() {
        bitField0_ = (bitField0_ & ~0x00000001);
        depositParams_ = null;
        if (depositParamsBuilder_ != null) {
          depositParamsBuilder_.dispose();
          depositParamsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public com.akash.gov.v1beta3.ParamsProto.DepositParams.Builder getDepositParamsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDepositParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      public com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder getDepositParamsOrBuilder() {
        if (depositParamsBuilder_ != null) {
          return depositParamsBuilder_.getMessageOrBuilder();
        } else {
          return depositParams_ == null ?
              com.akash.gov.v1beta3.ParamsProto.DepositParams.getDefaultInstance() : depositParams_;
        }
      }
      /**
       * <code>.akash.gov.v1beta3.DepositParams deposit_params = 1 [json_name = "depositParams", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deposit_params", (.gogoproto.moretags) = "yaml:&#92;"deposit_params&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.akash.gov.v1beta3.ParamsProto.DepositParams, com.akash.gov.v1beta3.ParamsProto.DepositParams.Builder, com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder> 
          getDepositParamsFieldBuilder() {
        if (depositParamsBuilder_ == null) {
          depositParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.akash.gov.v1beta3.ParamsProto.DepositParams, com.akash.gov.v1beta3.ParamsProto.DepositParams.Builder, com.akash.gov.v1beta3.ParamsProto.DepositParamsOrBuilder>(
                  getDepositParams(),
                  getParentForChildren(),
                  isClean());
          depositParams_ = null;
        }
        return depositParamsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:akash.gov.v1beta3.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:akash.gov.v1beta3.GenesisState)
    private static final com.akash.gov.v1beta3.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akash.gov.v1beta3.GenesisProto.GenesisState();
    }

    public static com.akash.gov.v1beta3.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.akash.gov.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_gov_v1beta3_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037akash/gov/v1beta3/genesis.proto\022\021akash" +
      ".gov.v1beta3\032\024gogoproto/gogo.proto\032\036akas" +
      "h/gov/v1beta3/params.proto\"\210\001\n\014GenesisSt" +
      "ate\022x\n\016deposit_params\030\001 \001(\0132 .akash.gov." +
      "v1beta3.DepositParamsB/\310\336\037\000\352\336\037\016deposit_p" +
      "arams\362\336\037\025yaml:\"deposit_params\"R\rdepositP" +
      "aramsB\301\001\n\025com.akash.gov.v1beta3B\014Genesis" +
      "ProtoZ6github.com/akash-network/akash-ap" +
      "i/go/node/gov/v1beta3\242\002\003AGX\252\002\021Akash.Gov." +
      "V1beta3\312\002\021Akash\\Gov\\V1beta3\342\002\035Akash\\Gov\\" +
      "V1beta3\\GPBMetadata\352\002\023Akash::Gov::V1beta" +
      "3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.gov.v1beta3.ParamsProto.getDescriptor(),
        });
    internal_static_akash_gov_v1beta3_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_gov_v1beta3_GenesisState_descriptor,
        new java.lang.String[] { "DepositParams", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.gov.v1beta3.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
