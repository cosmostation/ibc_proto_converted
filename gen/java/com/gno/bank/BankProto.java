// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gno/bank.proto

package com.gno.bank;

public final class BankProto {
  private BankProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgSendOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gno.bank.MsgSend)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * the bech32 address of the fund sender
     * </pre>
     *
     * <code>string from_address = 1 [json_name = "fromAddress"];</code>
     * @return The fromAddress.
     */
    java.lang.String getFromAddress();
    /**
     * <pre>
     * the bech32 address of the fund sender
     * </pre>
     *
     * <code>string from_address = 1 [json_name = "fromAddress"];</code>
     * @return The bytes for fromAddress.
     */
    com.google.protobuf.ByteString
        getFromAddressBytes();

    /**
     * <pre>
     * the bech32 address of the fund receiver
     * </pre>
     *
     * <code>string to_address = 2 [json_name = "toAddress"];</code>
     * @return The toAddress.
     */
    java.lang.String getToAddress();
    /**
     * <pre>
     * the bech32 address of the fund receiver
     * </pre>
     *
     * <code>string to_address = 2 [json_name = "toAddress"];</code>
     * @return The bytes for toAddress.
     */
    com.google.protobuf.ByteString
        getToAddressBytes();

    /**
     * <pre>
     * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    java.lang.String getAmount();
    /**
     * <pre>
     * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    com.google.protobuf.ByteString
        getAmountBytes();
  }
  /**
   * <pre>
   * MsgSend is the fund transfer tx message
   * </pre>
   *
   * Protobuf type {@code gno.bank.MsgSend}
   */
  public static final class MsgSend extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:gno.bank.MsgSend)
      MsgSendOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgSend.newBuilder() to construct.
    private MsgSend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgSend() {
      fromAddress_ = "";
      toAddress_ = "";
      amount_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MsgSend();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gno.bank.BankProto.internal_static_gno_bank_MsgSend_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gno.bank.BankProto.internal_static_gno_bank_MsgSend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gno.bank.BankProto.MsgSend.class, com.gno.bank.BankProto.MsgSend.Builder.class);
    }

    public static final int FROM_ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object fromAddress_ = "";
    /**
     * <pre>
     * the bech32 address of the fund sender
     * </pre>
     *
     * <code>string from_address = 1 [json_name = "fromAddress"];</code>
     * @return The fromAddress.
     */
    @java.lang.Override
    public java.lang.String getFromAddress() {
      java.lang.Object ref = fromAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * the bech32 address of the fund sender
     * </pre>
     *
     * <code>string from_address = 1 [json_name = "fromAddress"];</code>
     * @return The bytes for fromAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFromAddressBytes() {
      java.lang.Object ref = fromAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TO_ADDRESS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object toAddress_ = "";
    /**
     * <pre>
     * the bech32 address of the fund receiver
     * </pre>
     *
     * <code>string to_address = 2 [json_name = "toAddress"];</code>
     * @return The toAddress.
     */
    @java.lang.Override
    public java.lang.String getToAddress() {
      java.lang.Object ref = toAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * the bech32 address of the fund receiver
     * </pre>
     *
     * <code>string to_address = 2 [json_name = "toAddress"];</code>
     * @return The bytes for toAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getToAddressBytes() {
      java.lang.Object ref = toAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object amount_ = "";
    /**
     * <pre>
     * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
     * </pre>
     *
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
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
      if (!(obj instanceof com.gno.bank.BankProto.MsgSend)) {
        return super.equals(obj);
      }
      com.gno.bank.BankProto.MsgSend other = (com.gno.bank.BankProto.MsgSend) obj;

      if (!getFromAddress()
          .equals(other.getFromAddress())) return false;
      if (!getToAddress()
          .equals(other.getToAddress())) return false;
      if (!getAmount()
          .equals(other.getAmount())) return false;
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
      hash = (37 * hash) + FROM_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFromAddress().hashCode();
      hash = (37 * hash) + TO_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getToAddress().hashCode();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gno.bank.BankProto.MsgSend parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.gno.bank.BankProto.MsgSend parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.gno.bank.BankProto.MsgSend parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gno.bank.BankProto.MsgSend parseFrom(
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
    public static Builder newBuilder(com.gno.bank.BankProto.MsgSend prototype) {
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
     * MsgSend is the fund transfer tx message
     * </pre>
     *
     * Protobuf type {@code gno.bank.MsgSend}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gno.bank.MsgSend)
        com.gno.bank.BankProto.MsgSendOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gno.bank.BankProto.internal_static_gno_bank_MsgSend_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gno.bank.BankProto.internal_static_gno_bank_MsgSend_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gno.bank.BankProto.MsgSend.class, com.gno.bank.BankProto.MsgSend.Builder.class);
      }

      // Construct using com.gno.bank.BankProto.MsgSend.newBuilder()
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
        fromAddress_ = "";
        toAddress_ = "";
        amount_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gno.bank.BankProto.internal_static_gno_bank_MsgSend_descriptor;
      }

      @java.lang.Override
      public com.gno.bank.BankProto.MsgSend getDefaultInstanceForType() {
        return com.gno.bank.BankProto.MsgSend.getDefaultInstance();
      }

      @java.lang.Override
      public com.gno.bank.BankProto.MsgSend build() {
        com.gno.bank.BankProto.MsgSend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gno.bank.BankProto.MsgSend buildPartial() {
        com.gno.bank.BankProto.MsgSend result = new com.gno.bank.BankProto.MsgSend(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.gno.bank.BankProto.MsgSend result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fromAddress_ = fromAddress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.toAddress_ = toAddress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.amount_ = amount_;
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
        if (other instanceof com.gno.bank.BankProto.MsgSend) {
          return mergeFrom((com.gno.bank.BankProto.MsgSend)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gno.bank.BankProto.MsgSend other) {
        if (other == com.gno.bank.BankProto.MsgSend.getDefaultInstance()) return this;
        if (!other.getFromAddress().isEmpty()) {
          fromAddress_ = other.fromAddress_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getToAddress().isEmpty()) {
          toAddress_ = other.toAddress_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getAmount().isEmpty()) {
          amount_ = other.amount_;
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
                fromAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                toAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                amount_ = input.readStringRequireUtf8();
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

      private java.lang.Object fromAddress_ = "";
      /**
       * <pre>
       * the bech32 address of the fund sender
       * </pre>
       *
       * <code>string from_address = 1 [json_name = "fromAddress"];</code>
       * @return The fromAddress.
       */
      public java.lang.String getFromAddress() {
        java.lang.Object ref = fromAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fromAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * the bech32 address of the fund sender
       * </pre>
       *
       * <code>string from_address = 1 [json_name = "fromAddress"];</code>
       * @return The bytes for fromAddress.
       */
      public com.google.protobuf.ByteString
          getFromAddressBytes() {
        java.lang.Object ref = fromAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fromAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * the bech32 address of the fund sender
       * </pre>
       *
       * <code>string from_address = 1 [json_name = "fromAddress"];</code>
       * @param value The fromAddress to set.
       * @return This builder for chaining.
       */
      public Builder setFromAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        fromAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the bech32 address of the fund sender
       * </pre>
       *
       * <code>string from_address = 1 [json_name = "fromAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFromAddress() {
        fromAddress_ = getDefaultInstance().getFromAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the bech32 address of the fund sender
       * </pre>
       *
       * <code>string from_address = 1 [json_name = "fromAddress"];</code>
       * @param value The bytes for fromAddress to set.
       * @return This builder for chaining.
       */
      public Builder setFromAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        fromAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object toAddress_ = "";
      /**
       * <pre>
       * the bech32 address of the fund receiver
       * </pre>
       *
       * <code>string to_address = 2 [json_name = "toAddress"];</code>
       * @return The toAddress.
       */
      public java.lang.String getToAddress() {
        java.lang.Object ref = toAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          toAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * the bech32 address of the fund receiver
       * </pre>
       *
       * <code>string to_address = 2 [json_name = "toAddress"];</code>
       * @return The bytes for toAddress.
       */
      public com.google.protobuf.ByteString
          getToAddressBytes() {
        java.lang.Object ref = toAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          toAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * the bech32 address of the fund receiver
       * </pre>
       *
       * <code>string to_address = 2 [json_name = "toAddress"];</code>
       * @param value The toAddress to set.
       * @return This builder for chaining.
       */
      public Builder setToAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        toAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the bech32 address of the fund receiver
       * </pre>
       *
       * <code>string to_address = 2 [json_name = "toAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearToAddress() {
        toAddress_ = getDefaultInstance().getToAddress();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the bech32 address of the fund receiver
       * </pre>
       *
       * <code>string to_address = 2 [json_name = "toAddress"];</code>
       * @param value The bytes for toAddress to set.
       * @return This builder for chaining.
       */
      public Builder setToAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        toAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object amount_ = "";
      /**
       * <pre>
       * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
       * </pre>
       *
       * <code>string amount = 3 [json_name = "amount"];</code>
       * @return The amount.
       */
      public java.lang.String getAmount() {
        java.lang.Object ref = amount_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          amount_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
       * </pre>
       *
       * <code>string amount = 3 [json_name = "amount"];</code>
       * @return The bytes for amount.
       */
      public com.google.protobuf.ByteString
          getAmountBytes() {
        java.lang.Object ref = amount_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          amount_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
       * </pre>
       *
       * <code>string amount = 3 [json_name = "amount"];</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        amount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
       * </pre>
       *
       * <code>string amount = 3 [json_name = "amount"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        amount_ = getDefaultInstance().getAmount();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the denomination and amount of fund sent ("&lt;amount&gt;&lt;denomination&gt;")
       * </pre>
       *
       * <code>string amount = 3 [json_name = "amount"];</code>
       * @param value The bytes for amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        amount_ = value;
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


      // @@protoc_insertion_point(builder_scope:gno.bank.MsgSend)
    }

    // @@protoc_insertion_point(class_scope:gno.bank.MsgSend)
    private static final com.gno.bank.BankProto.MsgSend DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gno.bank.BankProto.MsgSend();
    }

    public static com.gno.bank.BankProto.MsgSend getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgSend>
        PARSER = new com.google.protobuf.AbstractParser<MsgSend>() {
      @java.lang.Override
      public MsgSend parsePartialFrom(
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

    public static com.google.protobuf.Parser<MsgSend> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgSend> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gno.bank.BankProto.MsgSend getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gno_bank_MsgSend_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gno_bank_MsgSend_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016gno/bank.proto\022\010gno.bank\"c\n\007MsgSend\022!\n" +
      "\014from_address\030\001 \001(\tR\013fromAddress\022\035\n\nto_a" +
      "ddress\030\002 \001(\tR\ttoAddress\022\026\n\006amount\030\003 \001(\tR" +
      "\006amountBX\n\014com.gno.bankB\tBankProto\242\002\003GBX" +
      "\252\002\010Gno.Bank\312\002\010Gno\\Bank\342\002\024Gno\\Bank\\GPBMet" +
      "adata\352\002\tGno::Bankb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gno_bank_MsgSend_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gno_bank_MsgSend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gno_bank_MsgSend_descriptor,
        new java.lang.String[] { "FromAddress", "ToAddress", "Amount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}