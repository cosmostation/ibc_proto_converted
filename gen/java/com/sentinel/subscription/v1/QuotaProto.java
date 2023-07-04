// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v1/quota.proto

package com.sentinel.subscription.v1;

public final class QuotaProto {
  private QuotaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuotaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.subscription.v1.Quota)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The allocated.
     */
    java.lang.String getAllocated();
    /**
     * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for allocated.
     */
    com.google.protobuf.ByteString
        getAllocatedBytes();

    /**
     * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The consumed.
     */
    java.lang.String getConsumed();
    /**
     * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for consumed.
     */
    com.google.protobuf.ByteString
        getConsumedBytes();
  }
  /**
   * Protobuf type {@code sentinel.subscription.v1.Quota}
   */
  public static final class Quota extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.subscription.v1.Quota)
      QuotaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Quota.newBuilder() to construct.
    private Quota(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Quota() {
      address_ = "";
      allocated_ = "";
      consumed_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Quota();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.subscription.v1.QuotaProto.internal_static_sentinel_subscription_v1_Quota_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.subscription.v1.QuotaProto.internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.subscription.v1.QuotaProto.Quota.class, com.sentinel.subscription.v1.QuotaProto.Quota.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOCATED_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object allocated_ = "";
    /**
     * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The allocated.
     */
    @java.lang.Override
    public java.lang.String getAllocated() {
      java.lang.Object ref = allocated_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        allocated_ = s;
        return s;
      }
    }
    /**
     * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for allocated.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAllocatedBytes() {
      java.lang.Object ref = allocated_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        allocated_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONSUMED_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object consumed_ = "";
    /**
     * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The consumed.
     */
    @java.lang.Override
    public java.lang.String getConsumed() {
      java.lang.Object ref = consumed_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumed_ = s;
        return s;
      }
    }
    /**
     * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for consumed.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getConsumedBytes() {
      java.lang.Object ref = consumed_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumed_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(allocated_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, allocated_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumed_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, consumed_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(allocated_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, allocated_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumed_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, consumed_);
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
      if (!(obj instanceof com.sentinel.subscription.v1.QuotaProto.Quota)) {
        return super.equals(obj);
      }
      com.sentinel.subscription.v1.QuotaProto.Quota other = (com.sentinel.subscription.v1.QuotaProto.Quota) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getAllocated()
          .equals(other.getAllocated())) return false;
      if (!getConsumed()
          .equals(other.getConsumed())) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + ALLOCATED_FIELD_NUMBER;
      hash = (53 * hash) + getAllocated().hashCode();
      hash = (37 * hash) + CONSUMED_FIELD_NUMBER;
      hash = (53 * hash) + getConsumed().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.sentinel.subscription.v1.QuotaProto.Quota parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.sentinel.subscription.v1.QuotaProto.Quota parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.subscription.v1.QuotaProto.Quota parseFrom(
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
    public static Builder newBuilder(com.sentinel.subscription.v1.QuotaProto.Quota prototype) {
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
     * Protobuf type {@code sentinel.subscription.v1.Quota}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.subscription.v1.Quota)
        com.sentinel.subscription.v1.QuotaProto.QuotaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sentinel.subscription.v1.QuotaProto.internal_static_sentinel_subscription_v1_Quota_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sentinel.subscription.v1.QuotaProto.internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sentinel.subscription.v1.QuotaProto.Quota.class, com.sentinel.subscription.v1.QuotaProto.Quota.Builder.class);
      }

      // Construct using com.sentinel.subscription.v1.QuotaProto.Quota.newBuilder()
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
        address_ = "";
        allocated_ = "";
        consumed_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sentinel.subscription.v1.QuotaProto.internal_static_sentinel_subscription_v1_Quota_descriptor;
      }

      @java.lang.Override
      public com.sentinel.subscription.v1.QuotaProto.Quota getDefaultInstanceForType() {
        return com.sentinel.subscription.v1.QuotaProto.Quota.getDefaultInstance();
      }

      @java.lang.Override
      public com.sentinel.subscription.v1.QuotaProto.Quota build() {
        com.sentinel.subscription.v1.QuotaProto.Quota result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sentinel.subscription.v1.QuotaProto.Quota buildPartial() {
        com.sentinel.subscription.v1.QuotaProto.Quota result = new com.sentinel.subscription.v1.QuotaProto.Quota(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.sentinel.subscription.v1.QuotaProto.Quota result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.allocated_ = allocated_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.consumed_ = consumed_;
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
        if (other instanceof com.sentinel.subscription.v1.QuotaProto.Quota) {
          return mergeFrom((com.sentinel.subscription.v1.QuotaProto.Quota)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sentinel.subscription.v1.QuotaProto.Quota other) {
        if (other == com.sentinel.subscription.v1.QuotaProto.Quota.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getAllocated().isEmpty()) {
          allocated_ = other.allocated_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getConsumed().isEmpty()) {
          consumed_ = other.consumed_;
          bitField0_ |= 0x00000004;
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
                address_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                allocated_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                consumed_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 1 [json_name = "address"];</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 1 [json_name = "address"];</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 1 [json_name = "address"];</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1 [json_name = "address"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        address_ = getDefaultInstance().getAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1 [json_name = "address"];</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object allocated_ = "";
      /**
       * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The allocated.
       */
      public java.lang.String getAllocated() {
        java.lang.Object ref = allocated_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          allocated_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for allocated.
       */
      public com.google.protobuf.ByteString
          getAllocatedBytes() {
        java.lang.Object ref = allocated_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          allocated_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The allocated to set.
       * @return This builder for chaining.
       */
      public Builder setAllocated(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        allocated_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocated() {
        allocated_ = getDefaultInstance().getAllocated();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string allocated = 2 [json_name = "allocated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for allocated to set.
       * @return This builder for chaining.
       */
      public Builder setAllocatedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        allocated_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object consumed_ = "";
      /**
       * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The consumed.
       */
      public java.lang.String getConsumed() {
        java.lang.Object ref = consumed_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          consumed_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for consumed.
       */
      public com.google.protobuf.ByteString
          getConsumedBytes() {
        java.lang.Object ref = consumed_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          consumed_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The consumed to set.
       * @return This builder for chaining.
       */
      public Builder setConsumed(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        consumed_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearConsumed() {
        consumed_ = getDefaultInstance().getConsumed();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string consumed = 3 [json_name = "consumed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for consumed to set.
       * @return This builder for chaining.
       */
      public Builder setConsumedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        consumed_ = value;
        bitField0_ |= 0x00000004;
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


      // @@protoc_insertion_point(builder_scope:sentinel.subscription.v1.Quota)
    }

    // @@protoc_insertion_point(class_scope:sentinel.subscription.v1.Quota)
    private static final com.sentinel.subscription.v1.QuotaProto.Quota DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sentinel.subscription.v1.QuotaProto.Quota();
    }

    public static com.sentinel.subscription.v1.QuotaProto.Quota getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Quota>
        PARSER = new com.google.protobuf.AbstractParser<Quota>() {
      @java.lang.Override
      public Quota parsePartialFrom(
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

    public static com.google.protobuf.Parser<Quota> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Quota> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sentinel.subscription.v1.QuotaProto.Quota getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_subscription_v1_Quota_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$sentinel/subscription/v1/quota.proto\022\030" +
      "sentinel.subscription.v1\032\024gogoproto/gogo" +
      ".proto\"\273\001\n\005Quota\022\030\n\007address\030\001 \001(\tR\007addre" +
      "ss\022L\n\tallocated\030\002 \001(\tB.\310\336\037\000\332\336\037&github.co" +
      "m/cosmos/cosmos-sdk/types.IntR\tallocated" +
      "\022J\n\010consumed\030\003 \001(\tB.\310\336\037\000\332\336\037&github.com/c" +
      "osmos/cosmos-sdk/types.IntR\010consumedB\363\001\n" +
      "\034com.sentinel.subscription.v1B\nQuotaProt" +
      "oZ?github.com/sentinel-official/hub/x/su" +
      "bscription/legacy/v1/types\242\002\003SSX\252\002\030Senti" +
      "nel.Subscription.V1\312\002\030Sentinel\\Subscript" +
      "ion\\V1\342\002$Sentinel\\Subscription\\V1\\GPBMet" +
      "adata\352\002\032Sentinel::Subscription::V1\310\341\036\000\250\342" +
      "\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_sentinel_subscription_v1_Quota_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_subscription_v1_Quota_descriptor,
        new java.lang.String[] { "Address", "Allocated", "Consumed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}