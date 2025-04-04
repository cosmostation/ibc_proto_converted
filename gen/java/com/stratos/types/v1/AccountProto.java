// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stratos/types/v1/account.proto

package com.stratos.types.v1;

public final class AccountProto {
  private AccountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EthAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:stratos.types.v1.EthAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return Whether the baseAccount field is set.
     */
    boolean hasBaseAccount();
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return The baseAccount.
     */
    com.cosmos.auth.v1beta1.AuthProto.BaseAccount getBaseAccount();
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     */
    com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder getBaseAccountOrBuilder();

    /**
     * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The codeHash.
     */
    java.lang.String getCodeHash();
    /**
     * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The bytes for codeHash.
     */
    com.google.protobuf.ByteString
        getCodeHashBytes();
  }
  /**
   * <pre>
   * EthAccount implements the authtypes.AccountI interface and embeds an
   * authtypes.BaseAccount type. It is compatible with the auth AccountKeeper.
   * </pre>
   *
   * Protobuf type {@code stratos.types.v1.EthAccount}
   */
  public static final class EthAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:stratos.types.v1.EthAccount)
      EthAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EthAccount.newBuilder() to construct.
    private EthAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EthAccount() {
      codeHash_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EthAccount();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stratos.types.v1.AccountProto.internal_static_stratos_types_v1_EthAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stratos.types.v1.AccountProto.internal_static_stratos_types_v1_EthAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stratos.types.v1.AccountProto.EthAccount.class, com.stratos.types.v1.AccountProto.EthAccount.Builder.class);
    }

    public static final int BASE_ACCOUNT_FIELD_NUMBER = 1;
    private com.cosmos.auth.v1beta1.AuthProto.BaseAccount baseAccount_;
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return Whether the baseAccount field is set.
     */
    @java.lang.Override
    public boolean hasBaseAccount() {
      return baseAccount_ != null;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     * @return The baseAccount.
     */
    @java.lang.Override
    public com.cosmos.auth.v1beta1.AuthProto.BaseAccount getBaseAccount() {
      return baseAccount_ == null ? com.cosmos.auth.v1beta1.AuthProto.BaseAccount.getDefaultInstance() : baseAccount_;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
     */
    @java.lang.Override
    public com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder getBaseAccountOrBuilder() {
      return baseAccount_ == null ? com.cosmos.auth.v1beta1.AuthProto.BaseAccount.getDefaultInstance() : baseAccount_;
    }

    public static final int CODE_HASH_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object codeHash_ = "";
    /**
     * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The codeHash.
     */
    @java.lang.Override
    public java.lang.String getCodeHash() {
      java.lang.Object ref = codeHash_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codeHash_ = s;
        return s;
      }
    }
    /**
     * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     * @return The bytes for codeHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeHashBytes() {
      java.lang.Object ref = codeHash_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codeHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (baseAccount_ != null) {
        output.writeMessage(1, getBaseAccount());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeHash_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codeHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseAccount_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseAccount());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeHash_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codeHash_);
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
      if (!(obj instanceof com.stratos.types.v1.AccountProto.EthAccount)) {
        return super.equals(obj);
      }
      com.stratos.types.v1.AccountProto.EthAccount other = (com.stratos.types.v1.AccountProto.EthAccount) obj;

      if (hasBaseAccount() != other.hasBaseAccount()) return false;
      if (hasBaseAccount()) {
        if (!getBaseAccount()
            .equals(other.getBaseAccount())) return false;
      }
      if (!getCodeHash()
          .equals(other.getCodeHash())) return false;
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
      if (hasBaseAccount()) {
        hash = (37 * hash) + BASE_ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getBaseAccount().hashCode();
      }
      hash = (37 * hash) + CODE_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getCodeHash().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.stratos.types.v1.AccountProto.EthAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.stratos.types.v1.AccountProto.EthAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stratos.types.v1.AccountProto.EthAccount parseFrom(
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
    public static Builder newBuilder(com.stratos.types.v1.AccountProto.EthAccount prototype) {
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
     * EthAccount implements the authtypes.AccountI interface and embeds an
     * authtypes.BaseAccount type. It is compatible with the auth AccountKeeper.
     * </pre>
     *
     * Protobuf type {@code stratos.types.v1.EthAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:stratos.types.v1.EthAccount)
        com.stratos.types.v1.AccountProto.EthAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.stratos.types.v1.AccountProto.internal_static_stratos_types_v1_EthAccount_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.stratos.types.v1.AccountProto.internal_static_stratos_types_v1_EthAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.stratos.types.v1.AccountProto.EthAccount.class, com.stratos.types.v1.AccountProto.EthAccount.Builder.class);
      }

      // Construct using com.stratos.types.v1.AccountProto.EthAccount.newBuilder()
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
        baseAccount_ = null;
        if (baseAccountBuilder_ != null) {
          baseAccountBuilder_.dispose();
          baseAccountBuilder_ = null;
        }
        codeHash_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.stratos.types.v1.AccountProto.internal_static_stratos_types_v1_EthAccount_descriptor;
      }

      @java.lang.Override
      public com.stratos.types.v1.AccountProto.EthAccount getDefaultInstanceForType() {
        return com.stratos.types.v1.AccountProto.EthAccount.getDefaultInstance();
      }

      @java.lang.Override
      public com.stratos.types.v1.AccountProto.EthAccount build() {
        com.stratos.types.v1.AccountProto.EthAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.stratos.types.v1.AccountProto.EthAccount buildPartial() {
        com.stratos.types.v1.AccountProto.EthAccount result = new com.stratos.types.v1.AccountProto.EthAccount(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.stratos.types.v1.AccountProto.EthAccount result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.baseAccount_ = baseAccountBuilder_ == null
              ? baseAccount_
              : baseAccountBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.codeHash_ = codeHash_;
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
        if (other instanceof com.stratos.types.v1.AccountProto.EthAccount) {
          return mergeFrom((com.stratos.types.v1.AccountProto.EthAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.stratos.types.v1.AccountProto.EthAccount other) {
        if (other == com.stratos.types.v1.AccountProto.EthAccount.getDefaultInstance()) return this;
        if (other.hasBaseAccount()) {
          mergeBaseAccount(other.getBaseAccount());
        }
        if (!other.getCodeHash().isEmpty()) {
          codeHash_ = other.codeHash_;
          bitField0_ |= 0x00000002;
          onChanged();
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
                    getBaseAccountFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                codeHash_ = input.readStringRequireUtf8();
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

      private com.cosmos.auth.v1beta1.AuthProto.BaseAccount baseAccount_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.auth.v1beta1.AuthProto.BaseAccount, com.cosmos.auth.v1beta1.AuthProto.BaseAccount.Builder, com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder> baseAccountBuilder_;
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       * @return Whether the baseAccount field is set.
       */
      public boolean hasBaseAccount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       * @return The baseAccount.
       */
      public com.cosmos.auth.v1beta1.AuthProto.BaseAccount getBaseAccount() {
        if (baseAccountBuilder_ == null) {
          return baseAccount_ == null ? com.cosmos.auth.v1beta1.AuthProto.BaseAccount.getDefaultInstance() : baseAccount_;
        } else {
          return baseAccountBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder setBaseAccount(com.cosmos.auth.v1beta1.AuthProto.BaseAccount value) {
        if (baseAccountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseAccount_ = value;
        } else {
          baseAccountBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder setBaseAccount(
          com.cosmos.auth.v1beta1.AuthProto.BaseAccount.Builder builderForValue) {
        if (baseAccountBuilder_ == null) {
          baseAccount_ = builderForValue.build();
        } else {
          baseAccountBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder mergeBaseAccount(com.cosmos.auth.v1beta1.AuthProto.BaseAccount value) {
        if (baseAccountBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            baseAccount_ != null &&
            baseAccount_ != com.cosmos.auth.v1beta1.AuthProto.BaseAccount.getDefaultInstance()) {
            getBaseAccountBuilder().mergeFrom(value);
          } else {
            baseAccount_ = value;
          }
        } else {
          baseAccountBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public Builder clearBaseAccount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        baseAccount_ = null;
        if (baseAccountBuilder_ != null) {
          baseAccountBuilder_.dispose();
          baseAccountBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public com.cosmos.auth.v1beta1.AuthProto.BaseAccount.Builder getBaseAccountBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseAccountFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      public com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder getBaseAccountOrBuilder() {
        if (baseAccountBuilder_ != null) {
          return baseAccountBuilder_.getMessageOrBuilder();
        } else {
          return baseAccount_ == null ?
              com.cosmos.auth.v1beta1.AuthProto.BaseAccount.getDefaultInstance() : baseAccount_;
        }
      }
      /**
       * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.auth.v1beta1.AuthProto.BaseAccount, com.cosmos.auth.v1beta1.AuthProto.BaseAccount.Builder, com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder> 
          getBaseAccountFieldBuilder() {
        if (baseAccountBuilder_ == null) {
          baseAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.cosmos.auth.v1beta1.AuthProto.BaseAccount, com.cosmos.auth.v1beta1.AuthProto.BaseAccount.Builder, com.cosmos.auth.v1beta1.AuthProto.BaseAccountOrBuilder>(
                  getBaseAccount(),
                  getParentForChildren(),
                  isClean());
          baseAccount_ = null;
        }
        return baseAccountBuilder_;
      }

      private java.lang.Object codeHash_ = "";
      /**
       * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @return The codeHash.
       */
      public java.lang.String getCodeHash() {
        java.lang.Object ref = codeHash_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          codeHash_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @return The bytes for codeHash.
       */
      public com.google.protobuf.ByteString
          getCodeHashBytes() {
        java.lang.Object ref = codeHash_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          codeHash_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @param value The codeHash to set.
       * @return This builder for chaining.
       */
      public Builder setCodeHash(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        codeHash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearCodeHash() {
        codeHash_ = getDefaultInstance().getCodeHash();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string code_hash = 2 [json_name = "codeHash", (.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
       * @param value The bytes for codeHash to set.
       * @return This builder for chaining.
       */
      public Builder setCodeHashBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        codeHash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:stratos.types.v1.EthAccount)
    }

    // @@protoc_insertion_point(class_scope:stratos.types.v1.EthAccount)
    private static final com.stratos.types.v1.AccountProto.EthAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.stratos.types.v1.AccountProto.EthAccount();
    }

    public static com.stratos.types.v1.AccountProto.EthAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EthAccount>
        PARSER = new com.google.protobuf.AbstractParser<EthAccount>() {
      @java.lang.Override
      public EthAccount parsePartialFrom(
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

    public static com.google.protobuf.Parser<EthAccount> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EthAccount> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.stratos.types.v1.AccountProto.EthAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stratos_types_v1_EthAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stratos_types_v1_EthAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036stratos/types/v1/account.proto\022\020strato" +
      "s.types.v1\032\036cosmos/auth/v1beta1/auth.pro" +
      "to\032\031cosmos_proto/cosmos.proto\032\024gogoproto" +
      "/gogo.proto\"\345\001\n\nEthAccount\022`\n\014base_accou" +
      "nt\030\001 \001(\0132 .cosmos.auth.v1beta1.BaseAccou" +
      "ntB\033\320\336\037\001\362\336\037\023yaml:\"base_account\"R\013baseAcc" +
      "ount\0221\n\tcode_hash\030\002 \001(\tB\024\362\336\037\020yaml:\"code_" +
      "hash\"R\010codeHash:B\210\240\037\000\230\240\037\000\350\240\037\000\312\264-2github." +
      "com/cosmos/cosmos-sdk/x/auth/types.Accou" +
      "ntIB\257\001\n\024com.stratos.types.v1B\014AccountPro" +
      "toZ)github.com/stratosnet/stratos-chain/" +
      "types\242\002\003STX\252\002\020Stratos.Types.V1\312\002\020Stratos" +
      "\\Types\\V1\342\002\034Stratos\\Types\\V1\\GPBMetadata" +
      "\352\002\022Stratos::Types::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.auth.v1beta1.AuthProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stratos_types_v1_EthAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stratos_types_v1_EthAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stratos_types_v1_EthAccount_descriptor,
        new java.lang.String[] { "BaseAccount", "CodeHash", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.embed);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.auth.v1beta1.AuthProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
