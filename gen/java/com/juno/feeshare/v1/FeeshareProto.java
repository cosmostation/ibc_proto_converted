// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/feeshare/v1/feeshare.proto

package com.juno.feeshare.v1;

public final class FeeshareProto {
  private FeeshareProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FeeShareOrBuilder extends
      // @@protoc_insertion_point(interface_extends:juno.feeshare.v1.FeeShare)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * contract_address is the bech32 address of a registered contract in string
     * form
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The contractAddress.
     */
    java.lang.String getContractAddress();
    /**
     * <pre>
     * contract_address is the bech32 address of a registered contract in string
     * form
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The bytes for contractAddress.
     */
    com.google.protobuf.ByteString
        getContractAddressBytes();

    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the
     * same as the contracts admin address.
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The deployerAddress.
     */
    java.lang.String getDeployerAddress();
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the
     * same as the contracts admin address.
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The bytes for deployerAddress.
     */
    com.google.protobuf.ByteString
        getDeployerAddressBytes();

    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the
     * transaction fees.
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The withdrawerAddress.
     */
    java.lang.String getWithdrawerAddress();
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the
     * transaction fees.
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The bytes for withdrawerAddress.
     */
    com.google.protobuf.ByteString
        getWithdrawerAddressBytes();
  }
  /**
   * <pre>
   * FeeShare defines an instance that organizes fee distribution conditions for
   * the owner of a given smart contract
   * </pre>
   *
   * Protobuf type {@code juno.feeshare.v1.FeeShare}
   */
  public static final class FeeShare extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:juno.feeshare.v1.FeeShare)
      FeeShareOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FeeShare.newBuilder() to construct.
    private FeeShare(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FeeShare() {
      contractAddress_ = "";
      deployerAddress_ = "";
      withdrawerAddress_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FeeShare();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.juno.feeshare.v1.FeeshareProto.internal_static_juno_feeshare_v1_FeeShare_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.juno.feeshare.v1.FeeshareProto.internal_static_juno_feeshare_v1_FeeShare_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.juno.feeshare.v1.FeeshareProto.FeeShare.class, com.juno.feeshare.v1.FeeshareProto.FeeShare.Builder.class);
    }

    public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object contractAddress_ = "";
    /**
     * <pre>
     * contract_address is the bech32 address of a registered contract in string
     * form
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The contractAddress.
     */
    @java.lang.Override
    public java.lang.String getContractAddress() {
      java.lang.Object ref = contractAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contractAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * contract_address is the bech32 address of a registered contract in string
     * form
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The bytes for contractAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContractAddressBytes() {
      java.lang.Object ref = contractAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contractAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEPLOYER_ADDRESS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object deployerAddress_ = "";
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the
     * same as the contracts admin address.
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The deployerAddress.
     */
    @java.lang.Override
    public java.lang.String getDeployerAddress() {
      java.lang.Object ref = deployerAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployerAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the
     * same as the contracts admin address.
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The bytes for deployerAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeployerAddressBytes() {
      java.lang.Object ref = deployerAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WITHDRAWER_ADDRESS_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object withdrawerAddress_ = "";
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the
     * transaction fees.
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The withdrawerAddress.
     */
    @java.lang.Override
    public java.lang.String getWithdrawerAddress() {
      java.lang.Object ref = withdrawerAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        withdrawerAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the
     * transaction fees.
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The bytes for withdrawerAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getWithdrawerAddressBytes() {
      java.lang.Object ref = withdrawerAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        withdrawerAddress_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contractAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployerAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawerAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, withdrawerAddress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contractAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployerAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawerAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, withdrawerAddress_);
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
      if (!(obj instanceof com.juno.feeshare.v1.FeeshareProto.FeeShare)) {
        return super.equals(obj);
      }
      com.juno.feeshare.v1.FeeshareProto.FeeShare other = (com.juno.feeshare.v1.FeeshareProto.FeeShare) obj;

      if (!getContractAddress()
          .equals(other.getContractAddress())) return false;
      if (!getDeployerAddress()
          .equals(other.getDeployerAddress())) return false;
      if (!getWithdrawerAddress()
          .equals(other.getWithdrawerAddress())) return false;
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
      hash = (37 * hash) + CONTRACT_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getContractAddress().hashCode();
      hash = (37 * hash) + DEPLOYER_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getDeployerAddress().hashCode();
      hash = (37 * hash) + WITHDRAWER_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getWithdrawerAddress().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.juno.feeshare.v1.FeeshareProto.FeeShare parseFrom(
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
    public static Builder newBuilder(com.juno.feeshare.v1.FeeshareProto.FeeShare prototype) {
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
     * FeeShare defines an instance that organizes fee distribution conditions for
     * the owner of a given smart contract
     * </pre>
     *
     * Protobuf type {@code juno.feeshare.v1.FeeShare}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:juno.feeshare.v1.FeeShare)
        com.juno.feeshare.v1.FeeshareProto.FeeShareOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.juno.feeshare.v1.FeeshareProto.internal_static_juno_feeshare_v1_FeeShare_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.juno.feeshare.v1.FeeshareProto.internal_static_juno_feeshare_v1_FeeShare_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.juno.feeshare.v1.FeeshareProto.FeeShare.class, com.juno.feeshare.v1.FeeshareProto.FeeShare.Builder.class);
      }

      // Construct using com.juno.feeshare.v1.FeeshareProto.FeeShare.newBuilder()
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
        contractAddress_ = "";
        deployerAddress_ = "";
        withdrawerAddress_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.juno.feeshare.v1.FeeshareProto.internal_static_juno_feeshare_v1_FeeShare_descriptor;
      }

      @java.lang.Override
      public com.juno.feeshare.v1.FeeshareProto.FeeShare getDefaultInstanceForType() {
        return com.juno.feeshare.v1.FeeshareProto.FeeShare.getDefaultInstance();
      }

      @java.lang.Override
      public com.juno.feeshare.v1.FeeshareProto.FeeShare build() {
        com.juno.feeshare.v1.FeeshareProto.FeeShare result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.juno.feeshare.v1.FeeshareProto.FeeShare buildPartial() {
        com.juno.feeshare.v1.FeeshareProto.FeeShare result = new com.juno.feeshare.v1.FeeshareProto.FeeShare(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.juno.feeshare.v1.FeeshareProto.FeeShare result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.contractAddress_ = contractAddress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.deployerAddress_ = deployerAddress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.withdrawerAddress_ = withdrawerAddress_;
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
        if (other instanceof com.juno.feeshare.v1.FeeshareProto.FeeShare) {
          return mergeFrom((com.juno.feeshare.v1.FeeshareProto.FeeShare)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.juno.feeshare.v1.FeeshareProto.FeeShare other) {
        if (other == com.juno.feeshare.v1.FeeshareProto.FeeShare.getDefaultInstance()) return this;
        if (!other.getContractAddress().isEmpty()) {
          contractAddress_ = other.contractAddress_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getDeployerAddress().isEmpty()) {
          deployerAddress_ = other.deployerAddress_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getWithdrawerAddress().isEmpty()) {
          withdrawerAddress_ = other.withdrawerAddress_;
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
                contractAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                deployerAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                withdrawerAddress_ = input.readStringRequireUtf8();
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

      private java.lang.Object contractAddress_ = "";
      /**
       * <pre>
       * contract_address is the bech32 address of a registered contract in string
       * form
       * </pre>
       *
       * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
       * @return The contractAddress.
       */
      public java.lang.String getContractAddress() {
        java.lang.Object ref = contractAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          contractAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * contract_address is the bech32 address of a registered contract in string
       * form
       * </pre>
       *
       * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
       * @return The bytes for contractAddress.
       */
      public com.google.protobuf.ByteString
          getContractAddressBytes() {
        java.lang.Object ref = contractAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          contractAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * contract_address is the bech32 address of a registered contract in string
       * form
       * </pre>
       *
       * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
       * @param value The contractAddress to set.
       * @return This builder for chaining.
       */
      public Builder setContractAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        contractAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * contract_address is the bech32 address of a registered contract in string
       * form
       * </pre>
       *
       * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearContractAddress() {
        contractAddress_ = getDefaultInstance().getContractAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * contract_address is the bech32 address of a registered contract in string
       * form
       * </pre>
       *
       * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
       * @param value The bytes for contractAddress to set.
       * @return This builder for chaining.
       */
      public Builder setContractAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        contractAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object deployerAddress_ = "";
      /**
       * <pre>
       * deployer_address is the bech32 address of message sender. It must be the
       * same as the contracts admin address.
       * </pre>
       *
       * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
       * @return The deployerAddress.
       */
      public java.lang.String getDeployerAddress() {
        java.lang.Object ref = deployerAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deployerAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * deployer_address is the bech32 address of message sender. It must be the
       * same as the contracts admin address.
       * </pre>
       *
       * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
       * @return The bytes for deployerAddress.
       */
      public com.google.protobuf.ByteString
          getDeployerAddressBytes() {
        java.lang.Object ref = deployerAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deployerAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * deployer_address is the bech32 address of message sender. It must be the
       * same as the contracts admin address.
       * </pre>
       *
       * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
       * @param value The deployerAddress to set.
       * @return This builder for chaining.
       */
      public Builder setDeployerAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        deployerAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * deployer_address is the bech32 address of message sender. It must be the
       * same as the contracts admin address.
       * </pre>
       *
       * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDeployerAddress() {
        deployerAddress_ = getDefaultInstance().getDeployerAddress();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * deployer_address is the bech32 address of message sender. It must be the
       * same as the contracts admin address.
       * </pre>
       *
       * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
       * @param value The bytes for deployerAddress to set.
       * @return This builder for chaining.
       */
      public Builder setDeployerAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        deployerAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object withdrawerAddress_ = "";
      /**
       * <pre>
       * withdrawer_address is the bech32 address of account receiving the
       * transaction fees.
       * </pre>
       *
       * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
       * @return The withdrawerAddress.
       */
      public java.lang.String getWithdrawerAddress() {
        java.lang.Object ref = withdrawerAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          withdrawerAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * withdrawer_address is the bech32 address of account receiving the
       * transaction fees.
       * </pre>
       *
       * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
       * @return The bytes for withdrawerAddress.
       */
      public com.google.protobuf.ByteString
          getWithdrawerAddressBytes() {
        java.lang.Object ref = withdrawerAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          withdrawerAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * withdrawer_address is the bech32 address of account receiving the
       * transaction fees.
       * </pre>
       *
       * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
       * @param value The withdrawerAddress to set.
       * @return This builder for chaining.
       */
      public Builder setWithdrawerAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        withdrawerAddress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * withdrawer_address is the bech32 address of account receiving the
       * transaction fees.
       * </pre>
       *
       * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearWithdrawerAddress() {
        withdrawerAddress_ = getDefaultInstance().getWithdrawerAddress();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * withdrawer_address is the bech32 address of account receiving the
       * transaction fees.
       * </pre>
       *
       * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
       * @param value The bytes for withdrawerAddress to set.
       * @return This builder for chaining.
       */
      public Builder setWithdrawerAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        withdrawerAddress_ = value;
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


      // @@protoc_insertion_point(builder_scope:juno.feeshare.v1.FeeShare)
    }

    // @@protoc_insertion_point(class_scope:juno.feeshare.v1.FeeShare)
    private static final com.juno.feeshare.v1.FeeshareProto.FeeShare DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.juno.feeshare.v1.FeeshareProto.FeeShare();
    }

    public static com.juno.feeshare.v1.FeeshareProto.FeeShare getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FeeShare>
        PARSER = new com.google.protobuf.AbstractParser<FeeShare>() {
      @java.lang.Override
      public FeeShare parsePartialFrom(
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

    public static com.google.protobuf.Parser<FeeShare> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FeeShare> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.juno.feeshare.v1.FeeshareProto.FeeShare getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_juno_feeshare_v1_FeeShare_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_juno_feeshare_v1_FeeShare_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037juno/feeshare/v1/feeshare.proto\022\020juno." +
      "feeshare.v1\"\217\001\n\010FeeShare\022)\n\020contract_add" +
      "ress\030\001 \001(\tR\017contractAddress\022)\n\020deployer_" +
      "address\030\002 \001(\tR\017deployerAddress\022-\n\022withdr" +
      "awer_address\030\003 \001(\tR\021withdrawerAddressB\267\001" +
      "\n\024com.juno.feeshare.v1B\rFeeshareProtoZ0g" +
      "ithub.com/CosmosContracts/juno/x/feeshar" +
      "e/types\242\002\003JFX\252\002\020Juno.Feeshare.V1\312\002\020Juno\\" +
      "Feeshare\\V1\342\002\034Juno\\Feeshare\\V1\\GPBMetada" +
      "ta\352\002\022Juno::Feeshare::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_juno_feeshare_v1_FeeShare_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_juno_feeshare_v1_FeeShare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_juno_feeshare_v1_FeeShare_descriptor,
        new java.lang.String[] { "ContractAddress", "DeployerAddress", "WithdrawerAddress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
