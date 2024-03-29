// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/provision/message.proto

package com.assetmantle.modules.identities.transactions.provision;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.transactions.provision.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The from.
     */
    java.lang.String getFrom();
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The bytes for from.
     */
    com.google.protobuf.ByteString
        getFromBytes();

    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The to.
     */
    java.lang.String getTo();
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The bytes for to.
     */
    com.google.protobuf.ByteString
        getToBytes();

    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return Whether the identityID field is set.
     */
    boolean hasIdentityID();
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return The identityID.
     */
    com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getIdentityID();
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getIdentityIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.identities.transactions.provision.Message}
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.identities.transactions.provision.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      from_ = "";
      to_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.identities.transactions.provision.MessageProto.internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.identities.transactions.provision.MessageProto.internal_static_assetmantle_modules_identities_transactions_provision_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.class, com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.Builder.class);
    }

    public static final int FROM_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object from_ = "";
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The from.
     */
    @java.lang.Override
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The bytes for from.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TO_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object to_ = "";
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The to.
     */
    @java.lang.Override
    public java.lang.String getTo() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        to_ = s;
        return s;
      }
    }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The bytes for to.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IDENTITY_I_D_FIELD_NUMBER = 3;
    private com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID identityID_;
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return Whether the identityID field is set.
     */
    @java.lang.Override
    public boolean hasIdentityID() {
      return identityID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return The identityID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getIdentityID() {
      return identityID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : identityID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getIdentityIDOrBuilder() {
      return identityID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : identityID_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(to_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_);
      }
      if (identityID_ != null) {
        output.writeMessage(3, getIdentityID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(to_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, to_);
      }
      if (identityID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getIdentityID());
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
      if (!(obj instanceof com.assetmantle.modules.identities.transactions.provision.MessageProto.Message)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.identities.transactions.provision.MessageProto.Message other = (com.assetmantle.modules.identities.transactions.provision.MessageProto.Message) obj;

      if (!getFrom()
          .equals(other.getFrom())) return false;
      if (!getTo()
          .equals(other.getTo())) return false;
      if (hasIdentityID() != other.hasIdentityID()) return false;
      if (hasIdentityID()) {
        if (!getIdentityID()
            .equals(other.getIdentityID())) return false;
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
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo().hashCode();
      if (hasIdentityID()) {
        hash = (37 * hash) + IDENTITY_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getIdentityID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.identities.transactions.provision.MessageProto.Message prototype) {
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
     * Protobuf type {@code assetmantle.modules.identities.transactions.provision.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.identities.transactions.provision.Message)
        com.assetmantle.modules.identities.transactions.provision.MessageProto.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.identities.transactions.provision.MessageProto.internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.identities.transactions.provision.MessageProto.internal_static_assetmantle_modules_identities_transactions_provision_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.class, com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.Builder.class);
      }

      // Construct using com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.newBuilder()
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
        from_ = "";
        to_ = "";
        identityID_ = null;
        if (identityIDBuilder_ != null) {
          identityIDBuilder_.dispose();
          identityIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.identities.transactions.provision.MessageProto.internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.provision.MessageProto.Message getDefaultInstanceForType() {
        return com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.provision.MessageProto.Message build() {
        com.assetmantle.modules.identities.transactions.provision.MessageProto.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.identities.transactions.provision.MessageProto.Message buildPartial() {
        com.assetmantle.modules.identities.transactions.provision.MessageProto.Message result = new com.assetmantle.modules.identities.transactions.provision.MessageProto.Message(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.identities.transactions.provision.MessageProto.Message result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.from_ = from_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.to_ = to_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.identityID_ = identityIDBuilder_ == null
              ? identityID_
              : identityIDBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.identities.transactions.provision.MessageProto.Message) {
          return mergeFrom((com.assetmantle.modules.identities.transactions.provision.MessageProto.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.identities.transactions.provision.MessageProto.Message other) {
        if (other == com.assetmantle.modules.identities.transactions.provision.MessageProto.Message.getDefaultInstance()) return this;
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getTo().isEmpty()) {
          to_ = other.to_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasIdentityID()) {
          mergeIdentityID(other.getIdentityID());
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
                from_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                to_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getIdentityIDFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private java.lang.Object from_ = "";
      /**
       * <code>string from = 1 [json_name = "from"];</code>
       * @return The from.
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string from = 1 [json_name = "from"];</code>
       * @return The bytes for from.
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 1 [json_name = "from"];</code>
       * @param value The from to set.
       * @return This builder for chaining.
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        from_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1 [json_name = "from"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFrom() {
        from_ = getDefaultInstance().getFrom();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1 [json_name = "from"];</code>
       * @param value The bytes for from to set.
       * @return This builder for chaining.
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        from_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object to_ = "";
      /**
       * <code>string to = 2 [json_name = "to"];</code>
       * @return The to.
       */
      public java.lang.String getTo() {
        java.lang.Object ref = to_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string to = 2 [json_name = "to"];</code>
       * @return The bytes for to.
       */
      public com.google.protobuf.ByteString
          getToBytes() {
        java.lang.Object ref = to_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          to_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string to = 2 [json_name = "to"];</code>
       * @param value The to to set.
       * @return This builder for chaining.
       */
      public Builder setTo(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        to_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2 [json_name = "to"];</code>
       * @return This builder for chaining.
       */
      public Builder clearTo() {
        to_ = getDefaultInstance().getTo();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2 [json_name = "to"];</code>
       * @param value The bytes for to to set.
       * @return This builder for chaining.
       */
      public Builder setToBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        to_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID identityID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder> identityIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       * @return Whether the identityID field is set.
       */
      public boolean hasIdentityID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       * @return The identityID.
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID getIdentityID() {
        if (identityIDBuilder_ == null) {
          return identityID_ == null ? com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : identityID_;
        } else {
          return identityIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public Builder setIdentityID(com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID value) {
        if (identityIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          identityID_ = value;
        } else {
          identityIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public Builder setIdentityID(
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder builderForValue) {
        if (identityIDBuilder_ == null) {
          identityID_ = builderForValue.build();
        } else {
          identityIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public Builder mergeIdentityID(com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID value) {
        if (identityIDBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            identityID_ != null &&
            identityID_ != com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance()) {
            getIdentityIDBuilder().mergeFrom(value);
          } else {
            identityID_ = value;
          }
        } else {
          identityIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public Builder clearIdentityID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        identityID_ = null;
        if (identityIDBuilder_ != null) {
          identityIDBuilder_.dispose();
          identityIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder getIdentityIDBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getIdentityIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      public com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder getIdentityIDOrBuilder() {
        if (identityIDBuilder_ != null) {
          return identityIDBuilder_.getMessageOrBuilder();
        } else {
          return identityID_ == null ?
              com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.getDefaultInstance() : identityID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder> 
          getIdentityIDFieldBuilder() {
        if (identityIDBuilder_ == null) {
          identityIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityID.Builder, com.assetmantle.schema.ids.base.IdentityIdProto.IdentityIDOrBuilder>(
                  getIdentityID(),
                  getParentForChildren(),
                  isClean());
          identityID_ = null;
        }
        return identityIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.identities.transactions.provision.Message)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.identities.transactions.provision.Message)
    private static final com.assetmantle.modules.identities.transactions.provision.MessageProto.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.identities.transactions.provision.MessageProto.Message();
    }

    public static com.assetmantle.modules.identities.transactions.provision.MessageProto.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
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

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.provision.MessageProto.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_transactions_provision_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;assetmantle/identities/transactions/pr" +
      "ovision/message.proto\0225assetmantle.modul" +
      "es.identities.transactions.provision\032&as" +
      "setmantle/ids/base/identity_id.proto\"x\n\007" +
      "Message\022\022\n\004from\030\001 \001(\tR\004from\022\016\n\002to\030\002 \001(\tR" +
      "\002to\022I\n\014identity_i_d\030\003 \001(\0132\'.assetmantle." +
      "schema.ids.base.IdentityIDR\nidentityIDB\301" +
      "\002\n9com.assetmantle.modules.identities.tr" +
      "ansactions.provisionB\014MessageProto\242\002\005AMI" +
      "TP\252\0025Assetmantle.Modules.Identities.Tran" +
      "sactions.Provision\312\0025Assetmantle\\Modules" +
      "\\Identities\\Transactions\\Provision\342\002AAss" +
      "etmantle\\Modules\\Identities\\Transactions" +
      "\\Provision\\GPBMetadata\352\0029Assetmantle::Mo" +
      "dules::Identities::Transactions::Provisi" +
      "onb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_transactions_provision_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_transactions_provision_Message_descriptor,
        new java.lang.String[] { "From", "To", "IdentityID", });
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
