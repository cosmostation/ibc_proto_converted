// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thorchain/v1/x/thorchain/types/msg_ban.proto

package com.types;

public final class MsgBanProto {
  private MsgBanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgBanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.MsgBan)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes node_address = 2 [json_name = "nodeAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The nodeAddress.
     */
    com.google.protobuf.ByteString getNodeAddress();

    /**
     * <code>bytes signer = 3 [json_name = "signer", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The signer.
     */
    com.google.protobuf.ByteString getSigner();
  }
  /**
   * Protobuf type {@code types.MsgBan}
   */
  public static final class MsgBan extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.MsgBan)
      MsgBanOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgBan.newBuilder() to construct.
    private MsgBan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgBan() {
      nodeAddress_ = com.google.protobuf.ByteString.EMPTY;
      signer_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MsgBan();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.types.MsgBanProto.internal_static_types_MsgBan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.types.MsgBanProto.internal_static_types_MsgBan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.types.MsgBanProto.MsgBan.class, com.types.MsgBanProto.MsgBan.Builder.class);
    }

    public static final int NODE_ADDRESS_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString nodeAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes node_address = 2 [json_name = "nodeAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The nodeAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNodeAddress() {
      return nodeAddress_;
    }

    public static final int SIGNER_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signer = 3 [json_name = "signer", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The signer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSigner() {
      return signer_;
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
      if (!nodeAddress_.isEmpty()) {
        output.writeBytes(2, nodeAddress_);
      }
      if (!signer_.isEmpty()) {
        output.writeBytes(3, signer_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!nodeAddress_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, nodeAddress_);
      }
      if (!signer_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, signer_);
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
      if (!(obj instanceof com.types.MsgBanProto.MsgBan)) {
        return super.equals(obj);
      }
      com.types.MsgBanProto.MsgBan other = (com.types.MsgBanProto.MsgBan) obj;

      if (!getNodeAddress()
          .equals(other.getNodeAddress())) return false;
      if (!getSigner()
          .equals(other.getSigner())) return false;
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
      hash = (37 * hash) + NODE_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getNodeAddress().hashCode();
      hash = (37 * hash) + SIGNER_FIELD_NUMBER;
      hash = (53 * hash) + getSigner().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.types.MsgBanProto.MsgBan parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.types.MsgBanProto.MsgBan parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.types.MsgBanProto.MsgBan parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.MsgBanProto.MsgBan parseFrom(
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
    public static Builder newBuilder(com.types.MsgBanProto.MsgBan prototype) {
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
     * Protobuf type {@code types.MsgBan}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.MsgBan)
        com.types.MsgBanProto.MsgBanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.types.MsgBanProto.internal_static_types_MsgBan_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.types.MsgBanProto.internal_static_types_MsgBan_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.types.MsgBanProto.MsgBan.class, com.types.MsgBanProto.MsgBan.Builder.class);
      }

      // Construct using com.types.MsgBanProto.MsgBan.newBuilder()
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
        nodeAddress_ = com.google.protobuf.ByteString.EMPTY;
        signer_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.types.MsgBanProto.internal_static_types_MsgBan_descriptor;
      }

      @java.lang.Override
      public com.types.MsgBanProto.MsgBan getDefaultInstanceForType() {
        return com.types.MsgBanProto.MsgBan.getDefaultInstance();
      }

      @java.lang.Override
      public com.types.MsgBanProto.MsgBan build() {
        com.types.MsgBanProto.MsgBan result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.types.MsgBanProto.MsgBan buildPartial() {
        com.types.MsgBanProto.MsgBan result = new com.types.MsgBanProto.MsgBan(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.types.MsgBanProto.MsgBan result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nodeAddress_ = nodeAddress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.signer_ = signer_;
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
        if (other instanceof com.types.MsgBanProto.MsgBan) {
          return mergeFrom((com.types.MsgBanProto.MsgBan)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.types.MsgBanProto.MsgBan other) {
        if (other == com.types.MsgBanProto.MsgBan.getDefaultInstance()) return this;
        if (other.getNodeAddress() != com.google.protobuf.ByteString.EMPTY) {
          setNodeAddress(other.getNodeAddress());
        }
        if (other.getSigner() != com.google.protobuf.ByteString.EMPTY) {
          setSigner(other.getSigner());
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
              case 18: {
                nodeAddress_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 26: {
                signer_ = input.readBytes();
                bitField0_ |= 0x00000002;
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

      private com.google.protobuf.ByteString nodeAddress_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes node_address = 2 [json_name = "nodeAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return The nodeAddress.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getNodeAddress() {
        return nodeAddress_;
      }
      /**
       * <code>bytes node_address = 2 [json_name = "nodeAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @param value The nodeAddress to set.
       * @return This builder for chaining.
       */
      public Builder setNodeAddress(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        nodeAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes node_address = 2 [json_name = "nodeAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNodeAddress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeAddress_ = getDefaultInstance().getNodeAddress();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString signer_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes signer = 3 [json_name = "signer", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return The signer.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getSigner() {
        return signer_;
      }
      /**
       * <code>bytes signer = 3 [json_name = "signer", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @param value The signer to set.
       * @return This builder for chaining.
       */
      public Builder setSigner(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        signer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes signer = 3 [json_name = "signer", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSigner() {
        bitField0_ = (bitField0_ & ~0x00000002);
        signer_ = getDefaultInstance().getSigner();
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


      // @@protoc_insertion_point(builder_scope:types.MsgBan)
    }

    // @@protoc_insertion_point(class_scope:types.MsgBan)
    private static final com.types.MsgBanProto.MsgBan DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.types.MsgBanProto.MsgBan();
    }

    public static com.types.MsgBanProto.MsgBan getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgBan>
        PARSER = new com.google.protobuf.AbstractParser<MsgBan>() {
      @java.lang.Override
      public MsgBan parsePartialFrom(
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

    public static com.google.protobuf.Parser<MsgBan> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgBan> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.types.MsgBanProto.MsgBan getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_MsgBan_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_MsgBan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,thorchain/v1/x/thorchain/types/msg_ban" +
      ".proto\022\005types\032\024gogoproto/gogo.proto\"\251\001\n\006" +
      "MsgBan\022T\n\014node_address\030\002 \001(\014B1\372\336\037-github" +
      ".com/cosmos/cosmos-sdk/types.AccAddressR" +
      "\013nodeAddress\022I\n\006signer\030\003 \001(\014B1\372\336\037-github" +
      ".com/cosmos/cosmos-sdk/types.AccAddressR" +
      "\006signerB{\n\tcom.typesB\013MsgBanProtoZ/gitla" +
      "b.com/thorchain/thornode/x/thorchain/typ" +
      "es\242\002\003TXX\252\002\005Types\312\002\005Types\342\002\021Types\\GPBMeta" +
      "data\352\002\005Typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_types_MsgBan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_MsgBan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_MsgBan_descriptor,
        new java.lang.String[] { "NodeAddress", "Signer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}