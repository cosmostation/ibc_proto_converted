// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/admins.proto

package com.cudoventures.cudosnode.marketplace;

public final class AdminsProto {
  private AdminsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AdminsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cudoventures.cudosnode.marketplace.Admins)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @return A list containing the addresses.
     */
    java.util.List<java.lang.String>
        getAddressesList();
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @return The count of addresses.
     */
    int getAddressesCount();
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @param index The index of the element to return.
     * @return The addresses at the given index.
     */
    java.lang.String getAddresses(int index);
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @param index The index of the value to return.
     * @return The bytes of the addresses at the given index.
     */
    com.google.protobuf.ByteString
        getAddressesBytes(int index);
  }
  /**
   * Protobuf type {@code cudoventures.cudosnode.marketplace.Admins}
   */
  public static final class Admins extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cudoventures.cudosnode.marketplace.Admins)
      AdminsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Admins.newBuilder() to construct.
    private Admins(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Admins() {
      addresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Admins();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudoventures.cudosnode.marketplace.AdminsProto.internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudoventures.cudosnode.marketplace.AdminsProto.internal_static_cudoventures_cudosnode_marketplace_Admins_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.class, com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.Builder.class);
    }

    public static final int ADDRESSES_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList addresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @return A list containing the addresses.
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_;
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @return The count of addresses.
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @param index The index of the element to return.
     * @return The addresses at the given index.
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
     * @param index The index of the value to return.
     * @return The bytes of the addresses at the given index.
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
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
      for (int i = 0; i < addresses_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addresses_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < addresses_.size(); i++) {
          dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAddressesList().size();
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
      if (!(obj instanceof com.cudoventures.cudosnode.marketplace.AdminsProto.Admins)) {
        return super.equals(obj);
      }
      com.cudoventures.cudosnode.marketplace.AdminsProto.Admins other = (com.cudoventures.cudosnode.marketplace.AdminsProto.Admins) obj;

      if (!getAddressesList()
          .equals(other.getAddressesList())) return false;
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
      if (getAddressesCount() > 0) {
        hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
        hash = (53 * hash) + getAddressesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins parseFrom(
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
    public static Builder newBuilder(com.cudoventures.cudosnode.marketplace.AdminsProto.Admins prototype) {
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
     * Protobuf type {@code cudoventures.cudosnode.marketplace.Admins}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cudoventures.cudosnode.marketplace.Admins)
        com.cudoventures.cudosnode.marketplace.AdminsProto.AdminsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cudoventures.cudosnode.marketplace.AdminsProto.internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cudoventures.cudosnode.marketplace.AdminsProto.internal_static_cudoventures_cudosnode_marketplace_Admins_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.class, com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.Builder.class);
      }

      // Construct using com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.newBuilder()
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
        addresses_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cudoventures.cudosnode.marketplace.AdminsProto.internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor;
      }

      @java.lang.Override
      public com.cudoventures.cudosnode.marketplace.AdminsProto.Admins getDefaultInstanceForType() {
        return com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.getDefaultInstance();
      }

      @java.lang.Override
      public com.cudoventures.cudosnode.marketplace.AdminsProto.Admins build() {
        com.cudoventures.cudosnode.marketplace.AdminsProto.Admins result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cudoventures.cudosnode.marketplace.AdminsProto.Admins buildPartial() {
        com.cudoventures.cudosnode.marketplace.AdminsProto.Admins result = new com.cudoventures.cudosnode.marketplace.AdminsProto.Admins(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.cudoventures.cudosnode.marketplace.AdminsProto.Admins result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          addresses_.makeImmutable();
          result.addresses_ = addresses_;
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
        if (other instanceof com.cudoventures.cudosnode.marketplace.AdminsProto.Admins) {
          return mergeFrom((com.cudoventures.cudosnode.marketplace.AdminsProto.Admins)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cudoventures.cudosnode.marketplace.AdminsProto.Admins other) {
        if (other == com.cudoventures.cudosnode.marketplace.AdminsProto.Admins.getDefaultInstance()) return this;
        if (!other.addresses_.isEmpty()) {
          if (addresses_.isEmpty()) {
            addresses_ = other.addresses_;
            bitField0_ |= 0x00000001;
          } else {
            ensureAddressesIsMutable();
            addresses_.addAll(other.addresses_);
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureAddressesIsMutable();
                addresses_.add(s);
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

      private com.google.protobuf.LazyStringArrayList addresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureAddressesIsMutable() {
        if (!addresses_.isModifiable()) {
          addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @return A list containing the addresses.
       */
      public com.google.protobuf.ProtocolStringList
          getAddressesList() {
        addresses_.makeImmutable();
        return addresses_;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @return The count of addresses.
       */
      public int getAddressesCount() {
        return addresses_.size();
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param index The index of the element to return.
       * @return The addresses at the given index.
       */
      public java.lang.String getAddresses(int index) {
        return addresses_.get(index);
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param index The index of the value to return.
       * @return The bytes of the addresses at the given index.
       */
      public com.google.protobuf.ByteString
          getAddressesBytes(int index) {
        return addresses_.getByteString(index);
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param index The index to set the value at.
       * @param value The addresses to set.
       * @return This builder for chaining.
       */
      public Builder setAddresses(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAddressesIsMutable();
        addresses_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param value The addresses to add.
       * @return This builder for chaining.
       */
      public Builder addAddresses(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAddressesIsMutable();
        addresses_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param values The addresses to add.
       * @return This builder for chaining.
       */
      public Builder addAllAddresses(
          java.lang.Iterable<java.lang.String> values) {
        ensureAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addresses_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearAddresses() {
        addresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
       * @param value The bytes of the addresses to add.
       * @return This builder for chaining.
       */
      public Builder addAddressesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureAddressesIsMutable();
        addresses_.add(value);
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:cudoventures.cudosnode.marketplace.Admins)
    }

    // @@protoc_insertion_point(class_scope:cudoventures.cudosnode.marketplace.Admins)
    private static final com.cudoventures.cudosnode.marketplace.AdminsProto.Admins DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cudoventures.cudosnode.marketplace.AdminsProto.Admins();
    }

    public static com.cudoventures.cudosnode.marketplace.AdminsProto.Admins getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Admins>
        PARSER = new com.google.protobuf.AbstractParser<Admins>() {
      @java.lang.Override
      public Admins parsePartialFrom(
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

    public static com.google.protobuf.Parser<Admins> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Admins> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.AdminsProto.Admins getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cudoventures_cudosnode_marketplace_Admins_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036cudos/marketplace/admins.proto\022\"cudove" +
      "ntures.cudosnode.marketplace\032\024gogoproto/" +
      "gogo.proto\"2\n\006Admins\022\"\n\taddresses\030\001 \003(\tB" +
      "\004\310\336\037\000R\taddresses:\004\350\240\037\001B\225\002\n&com.cudoventu" +
      "res.cudosnode.marketplaceB\013AdminsProtoZ6" +
      "github.com/CudoVentures/cudos-node/x/mar" +
      "ketplace/types\242\002\003CCM\252\002\"Cudoventures.Cudo" +
      "snode.Marketplace\312\002\"Cudoventures\\Cudosno" +
      "de\\Marketplace\342\002.Cudoventures\\Cudosnode\\" +
      "Marketplace\\GPBMetadata\352\002$Cudoventures::" +
      "Cudosnode::Marketplaceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cudoventures_cudosnode_marketplace_Admins_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cudoventures_cudosnode_marketplace_Admins_descriptor,
        new java.lang.String[] { "Addresses", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}