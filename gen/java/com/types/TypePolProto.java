// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thorchain/v1/x/thorchain/types/type_pol.proto

package com.types;

public final class TypePolProto {
  private TypePolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProtocolOwnedLiquidityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.ProtocolOwnedLiquidity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The runeDeposited.
     */
    java.lang.String getRuneDeposited();
    /**
     * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The bytes for runeDeposited.
     */
    com.google.protobuf.ByteString
        getRuneDepositedBytes();

    /**
     * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The runeWithdrawn.
     */
    java.lang.String getRuneWithdrawn();
    /**
     * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The bytes for runeWithdrawn.
     */
    com.google.protobuf.ByteString
        getRuneWithdrawnBytes();
  }
  /**
   * Protobuf type {@code types.ProtocolOwnedLiquidity}
   */
  public static final class ProtocolOwnedLiquidity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.ProtocolOwnedLiquidity)
      ProtocolOwnedLiquidityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProtocolOwnedLiquidity.newBuilder() to construct.
    private ProtocolOwnedLiquidity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProtocolOwnedLiquidity() {
      runeDeposited_ = "";
      runeWithdrawn_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProtocolOwnedLiquidity();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.types.TypePolProto.internal_static_types_ProtocolOwnedLiquidity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.types.TypePolProto.internal_static_types_ProtocolOwnedLiquidity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.types.TypePolProto.ProtocolOwnedLiquidity.class, com.types.TypePolProto.ProtocolOwnedLiquidity.Builder.class);
    }

    public static final int RUNE_DEPOSITED_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object runeDeposited_ = "";
    /**
     * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The runeDeposited.
     */
    @java.lang.Override
    public java.lang.String getRuneDeposited() {
      java.lang.Object ref = runeDeposited_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runeDeposited_ = s;
        return s;
      }
    }
    /**
     * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The bytes for runeDeposited.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRuneDepositedBytes() {
      java.lang.Object ref = runeDeposited_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runeDeposited_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RUNE_WITHDRAWN_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object runeWithdrawn_ = "";
    /**
     * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The runeWithdrawn.
     */
    @java.lang.Override
    public java.lang.String getRuneWithdrawn() {
      java.lang.Object ref = runeWithdrawn_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runeWithdrawn_ = s;
        return s;
      }
    }
    /**
     * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
     * @return The bytes for runeWithdrawn.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRuneWithdrawnBytes() {
      java.lang.Object ref = runeWithdrawn_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runeWithdrawn_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runeDeposited_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, runeDeposited_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runeWithdrawn_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runeWithdrawn_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runeDeposited_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, runeDeposited_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runeWithdrawn_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runeWithdrawn_);
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
      if (!(obj instanceof com.types.TypePolProto.ProtocolOwnedLiquidity)) {
        return super.equals(obj);
      }
      com.types.TypePolProto.ProtocolOwnedLiquidity other = (com.types.TypePolProto.ProtocolOwnedLiquidity) obj;

      if (!getRuneDeposited()
          .equals(other.getRuneDeposited())) return false;
      if (!getRuneWithdrawn()
          .equals(other.getRuneWithdrawn())) return false;
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
      hash = (37 * hash) + RUNE_DEPOSITED_FIELD_NUMBER;
      hash = (53 * hash) + getRuneDeposited().hashCode();
      hash = (37 * hash) + RUNE_WITHDRAWN_FIELD_NUMBER;
      hash = (53 * hash) + getRuneWithdrawn().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypePolProto.ProtocolOwnedLiquidity parseFrom(
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
    public static Builder newBuilder(com.types.TypePolProto.ProtocolOwnedLiquidity prototype) {
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
     * Protobuf type {@code types.ProtocolOwnedLiquidity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.ProtocolOwnedLiquidity)
        com.types.TypePolProto.ProtocolOwnedLiquidityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.types.TypePolProto.internal_static_types_ProtocolOwnedLiquidity_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.types.TypePolProto.internal_static_types_ProtocolOwnedLiquidity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.types.TypePolProto.ProtocolOwnedLiquidity.class, com.types.TypePolProto.ProtocolOwnedLiquidity.Builder.class);
      }

      // Construct using com.types.TypePolProto.ProtocolOwnedLiquidity.newBuilder()
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
        runeDeposited_ = "";
        runeWithdrawn_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.types.TypePolProto.internal_static_types_ProtocolOwnedLiquidity_descriptor;
      }

      @java.lang.Override
      public com.types.TypePolProto.ProtocolOwnedLiquidity getDefaultInstanceForType() {
        return com.types.TypePolProto.ProtocolOwnedLiquidity.getDefaultInstance();
      }

      @java.lang.Override
      public com.types.TypePolProto.ProtocolOwnedLiquidity build() {
        com.types.TypePolProto.ProtocolOwnedLiquidity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.types.TypePolProto.ProtocolOwnedLiquidity buildPartial() {
        com.types.TypePolProto.ProtocolOwnedLiquidity result = new com.types.TypePolProto.ProtocolOwnedLiquidity(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.types.TypePolProto.ProtocolOwnedLiquidity result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.runeDeposited_ = runeDeposited_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.runeWithdrawn_ = runeWithdrawn_;
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
        if (other instanceof com.types.TypePolProto.ProtocolOwnedLiquidity) {
          return mergeFrom((com.types.TypePolProto.ProtocolOwnedLiquidity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.types.TypePolProto.ProtocolOwnedLiquidity other) {
        if (other == com.types.TypePolProto.ProtocolOwnedLiquidity.getDefaultInstance()) return this;
        if (!other.getRuneDeposited().isEmpty()) {
          runeDeposited_ = other.runeDeposited_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getRuneWithdrawn().isEmpty()) {
          runeWithdrawn_ = other.runeWithdrawn_;
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
                runeDeposited_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                runeWithdrawn_ = input.readStringRequireUtf8();
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

      private java.lang.Object runeDeposited_ = "";
      /**
       * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return The runeDeposited.
       */
      public java.lang.String getRuneDeposited() {
        java.lang.Object ref = runeDeposited_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          runeDeposited_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return The bytes for runeDeposited.
       */
      public com.google.protobuf.ByteString
          getRuneDepositedBytes() {
        java.lang.Object ref = runeDeposited_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          runeDeposited_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @param value The runeDeposited to set.
       * @return This builder for chaining.
       */
      public Builder setRuneDeposited(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        runeDeposited_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneDeposited() {
        runeDeposited_ = getDefaultInstance().getRuneDeposited();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string rune_deposited = 1 [json_name = "runeDeposited", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @param value The bytes for runeDeposited to set.
       * @return This builder for chaining.
       */
      public Builder setRuneDepositedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        runeDeposited_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object runeWithdrawn_ = "";
      /**
       * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return The runeWithdrawn.
       */
      public java.lang.String getRuneWithdrawn() {
        java.lang.Object ref = runeWithdrawn_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          runeWithdrawn_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return The bytes for runeWithdrawn.
       */
      public com.google.protobuf.ByteString
          getRuneWithdrawnBytes() {
        java.lang.Object ref = runeWithdrawn_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          runeWithdrawn_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @param value The runeWithdrawn to set.
       * @return This builder for chaining.
       */
      public Builder setRuneWithdrawn(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        runeWithdrawn_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneWithdrawn() {
        runeWithdrawn_ = getDefaultInstance().getRuneWithdrawn();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string rune_withdrawn = 2 [json_name = "runeWithdrawn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
       * @param value The bytes for runeWithdrawn to set.
       * @return This builder for chaining.
       */
      public Builder setRuneWithdrawnBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        runeWithdrawn_ = value;
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


      // @@protoc_insertion_point(builder_scope:types.ProtocolOwnedLiquidity)
    }

    // @@protoc_insertion_point(class_scope:types.ProtocolOwnedLiquidity)
    private static final com.types.TypePolProto.ProtocolOwnedLiquidity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.types.TypePolProto.ProtocolOwnedLiquidity();
    }

    public static com.types.TypePolProto.ProtocolOwnedLiquidity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProtocolOwnedLiquidity>
        PARSER = new com.google.protobuf.AbstractParser<ProtocolOwnedLiquidity>() {
      @java.lang.Override
      public ProtocolOwnedLiquidity parsePartialFrom(
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

    public static com.google.protobuf.Parser<ProtocolOwnedLiquidity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProtocolOwnedLiquidity> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.types.TypePolProto.ProtocolOwnedLiquidity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_ProtocolOwnedLiquidity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_ProtocolOwnedLiquidity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-thorchain/v1/x/thorchain/types/type_po" +
      "l.proto\022\005types\032\024gogoproto/gogo.proto\"\310\001\n" +
      "\026ProtocolOwnedLiquidity\022V\n\016rune_deposite" +
      "d\030\001 \001(\tB/\310\336\037\000\332\336\037\'github.com/cosmos/cosmo" +
      "s-sdk/types.UintR\rruneDeposited\022V\n\016rune_" +
      "withdrawn\030\002 \001(\tB/\310\336\037\000\332\336\037\'github.com/cosm" +
      "os/cosmos-sdk/types.UintR\rruneWithdrawnB" +
      "|\n\tcom.typesB\014TypePolProtoZ/gitlab.com/t" +
      "horchain/thornode/x/thorchain/types\242\002\003TX" +
      "X\252\002\005Types\312\002\005Types\342\002\021Types\\GPBMetadata\352\002\005" +
      "Typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_types_ProtocolOwnedLiquidity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_ProtocolOwnedLiquidity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_ProtocolOwnedLiquidity_descriptor,
        new java.lang.String[] { "RuneDeposited", "RuneWithdrawn", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
