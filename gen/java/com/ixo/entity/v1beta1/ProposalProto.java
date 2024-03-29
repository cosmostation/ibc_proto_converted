// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/entity/v1beta1/proposal.proto

package com.ixo.entity.v1beta1;

public final class ProposalProto {
  private ProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitializeNftContractOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ixo.entity.v1beta1.InitializeNftContract)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 NftContractCodeId = 1 [json_name = "NftContractCodeId"];</code>
     * @return The nftContractCodeId.
     */
    long getNftContractCodeId();

    /**
     * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
     * @return The nftMinterAddress.
     */
    java.lang.String getNftMinterAddress();
    /**
     * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
     * @return The bytes for nftMinterAddress.
     */
    com.google.protobuf.ByteString
        getNftMinterAddressBytes();
  }
  /**
   * Protobuf type {@code ixo.entity.v1beta1.InitializeNftContract}
   */
  public static final class InitializeNftContract extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ixo.entity.v1beta1.InitializeNftContract)
      InitializeNftContractOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InitializeNftContract.newBuilder() to construct.
    private InitializeNftContract(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitializeNftContract() {
      nftMinterAddress_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InitializeNftContract();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.entity.v1beta1.ProposalProto.internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.entity.v1beta1.ProposalProto.internal_static_ixo_entity_v1beta1_InitializeNftContract_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.class, com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.Builder.class);
    }

    public static final int NFTCONTRACTCODEID_FIELD_NUMBER = 1;
    private long nftContractCodeId_ = 0L;
    /**
     * <code>uint64 NftContractCodeId = 1 [json_name = "NftContractCodeId"];</code>
     * @return The nftContractCodeId.
     */
    @java.lang.Override
    public long getNftContractCodeId() {
      return nftContractCodeId_;
    }

    public static final int NFTMINTERADDRESS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nftMinterAddress_ = "";
    /**
     * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
     * @return The nftMinterAddress.
     */
    @java.lang.Override
    public java.lang.String getNftMinterAddress() {
      java.lang.Object ref = nftMinterAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nftMinterAddress_ = s;
        return s;
      }
    }
    /**
     * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
     * @return The bytes for nftMinterAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNftMinterAddressBytes() {
      java.lang.Object ref = nftMinterAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nftMinterAddress_ = b;
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
      if (nftContractCodeId_ != 0L) {
        output.writeUInt64(1, nftContractCodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftMinterAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nftMinterAddress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nftContractCodeId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, nftContractCodeId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftMinterAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nftMinterAddress_);
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
      if (!(obj instanceof com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract)) {
        return super.equals(obj);
      }
      com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract other = (com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract) obj;

      if (getNftContractCodeId()
          != other.getNftContractCodeId()) return false;
      if (!getNftMinterAddress()
          .equals(other.getNftMinterAddress())) return false;
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
      hash = (37 * hash) + NFTCONTRACTCODEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNftContractCodeId());
      hash = (37 * hash) + NFTMINTERADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getNftMinterAddress().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract parseFrom(
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
    public static Builder newBuilder(com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract prototype) {
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
     * Protobuf type {@code ixo.entity.v1beta1.InitializeNftContract}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ixo.entity.v1beta1.InitializeNftContract)
        com.ixo.entity.v1beta1.ProposalProto.InitializeNftContractOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ixo.entity.v1beta1.ProposalProto.internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ixo.entity.v1beta1.ProposalProto.internal_static_ixo_entity_v1beta1_InitializeNftContract_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.class, com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.Builder.class);
      }

      // Construct using com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.newBuilder()
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
        nftContractCodeId_ = 0L;
        nftMinterAddress_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ixo.entity.v1beta1.ProposalProto.internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor;
      }

      @java.lang.Override
      public com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract getDefaultInstanceForType() {
        return com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.getDefaultInstance();
      }

      @java.lang.Override
      public com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract build() {
        com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract buildPartial() {
        com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract result = new com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nftContractCodeId_ = nftContractCodeId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nftMinterAddress_ = nftMinterAddress_;
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
        if (other instanceof com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract) {
          return mergeFrom((com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract other) {
        if (other == com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract.getDefaultInstance()) return this;
        if (other.getNftContractCodeId() != 0L) {
          setNftContractCodeId(other.getNftContractCodeId());
        }
        if (!other.getNftMinterAddress().isEmpty()) {
          nftMinterAddress_ = other.nftMinterAddress_;
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
              case 8: {
                nftContractCodeId_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                nftMinterAddress_ = input.readStringRequireUtf8();
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

      private long nftContractCodeId_ ;
      /**
       * <code>uint64 NftContractCodeId = 1 [json_name = "NftContractCodeId"];</code>
       * @return The nftContractCodeId.
       */
      @java.lang.Override
      public long getNftContractCodeId() {
        return nftContractCodeId_;
      }
      /**
       * <code>uint64 NftContractCodeId = 1 [json_name = "NftContractCodeId"];</code>
       * @param value The nftContractCodeId to set.
       * @return This builder for chaining.
       */
      public Builder setNftContractCodeId(long value) {

        nftContractCodeId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 NftContractCodeId = 1 [json_name = "NftContractCodeId"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNftContractCodeId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nftContractCodeId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object nftMinterAddress_ = "";
      /**
       * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
       * @return The nftMinterAddress.
       */
      public java.lang.String getNftMinterAddress() {
        java.lang.Object ref = nftMinterAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nftMinterAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
       * @return The bytes for nftMinterAddress.
       */
      public com.google.protobuf.ByteString
          getNftMinterAddressBytes() {
        java.lang.Object ref = nftMinterAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nftMinterAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
       * @param value The nftMinterAddress to set.
       * @return This builder for chaining.
       */
      public Builder setNftMinterAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nftMinterAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNftMinterAddress() {
        nftMinterAddress_ = getDefaultInstance().getNftMinterAddress();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string NftMinterAddress = 2 [json_name = "NftMinterAddress"];</code>
       * @param value The bytes for nftMinterAddress to set.
       * @return This builder for chaining.
       */
      public Builder setNftMinterAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nftMinterAddress_ = value;
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


      // @@protoc_insertion_point(builder_scope:ixo.entity.v1beta1.InitializeNftContract)
    }

    // @@protoc_insertion_point(class_scope:ixo.entity.v1beta1.InitializeNftContract)
    private static final com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract();
    }

    public static com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InitializeNftContract>
        PARSER = new com.google.protobuf.AbstractParser<InitializeNftContract>() {
      @java.lang.Override
      public InitializeNftContract parsePartialFrom(
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

    public static com.google.protobuf.Parser<InitializeNftContract> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitializeNftContract> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ixo.entity.v1beta1.ProposalProto.InitializeNftContract getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ixo_entity_v1beta1_InitializeNftContract_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ixo/entity/v1beta1/proposal.proto\022\022ixo" +
      ".entity.v1beta1\032\024gogoproto/gogo.proto\"q\n" +
      "\025InitializeNftContract\022,\n\021NftContractCod" +
      "eId\030\001 \001(\004R\021NftContractCodeId\022*\n\020NftMinte" +
      "rAddress\030\002 \001(\tR\020NftMinterAddressB\307\001\n\026com" +
      ".ixo.entity.v1beta1B\rProposalProtoZ6gith" +
      "ub.com/ixofoundation/ixo-blockchain/x/en" +
      "tity/types\242\002\003IEX\252\002\022Ixo.Entity.V1beta1\312\002\022" +
      "Ixo\\Entity\\V1beta1\342\002\036Ixo\\Entity\\V1beta1\\" +
      "GPBMetadata\352\002\024Ixo::Entity::V1beta1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ixo_entity_v1beta1_InitializeNftContract_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ixo_entity_v1beta1_InitializeNftContract_descriptor,
        new java.lang.String[] { "NftContractCodeId", "NftMinterAddress", });
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
