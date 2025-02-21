// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zrchain/mint/module/v1/module.proto

package com.zrchain.mint.module.v1;

public final class ModuleProto {
  private ModuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModuleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:zrchain.mint.module.v1.Module)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
     * @return The feeCollectorName.
     */
    java.lang.String getFeeCollectorName();
    /**
     * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
     * @return The bytes for feeCollectorName.
     */
    com.google.protobuf.ByteString
        getFeeCollectorNameBytes();

    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     * @return The authority.
     */
    java.lang.String getAuthority();
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     * @return The bytes for authority.
     */
    com.google.protobuf.ByteString
        getAuthorityBytes();
  }
  /**
   * <pre>
   * Module is the config object of the mint module.
   * </pre>
   *
   * Protobuf type {@code zrchain.mint.module.v1.Module}
   */
  public static final class Module extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:zrchain.mint.module.v1.Module)
      ModuleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Module.newBuilder() to construct.
    private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Module() {
      feeCollectorName_ = "";
      authority_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Module();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zrchain.mint.module.v1.ModuleProto.internal_static_zrchain_mint_module_v1_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zrchain.mint.module.v1.ModuleProto.internal_static_zrchain_mint_module_v1_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zrchain.mint.module.v1.ModuleProto.Module.class, com.zrchain.mint.module.v1.ModuleProto.Module.Builder.class);
    }

    public static final int FEE_COLLECTOR_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object feeCollectorName_ = "";
    /**
     * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
     * @return The feeCollectorName.
     */
    @java.lang.Override
    public java.lang.String getFeeCollectorName() {
      java.lang.Object ref = feeCollectorName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feeCollectorName_ = s;
        return s;
      }
    }
    /**
     * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
     * @return The bytes for feeCollectorName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeeCollectorNameBytes() {
      java.lang.Object ref = feeCollectorName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feeCollectorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHORITY_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object authority_ = "";
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     * @return The authority.
     */
    @java.lang.Override
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2 [json_name = "authority"];</code>
     * @return The bytes for authority.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeCollectorName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, feeCollectorName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authority_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeCollectorName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, feeCollectorName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authority_);
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
      if (!(obj instanceof com.zrchain.mint.module.v1.ModuleProto.Module)) {
        return super.equals(obj);
      }
      com.zrchain.mint.module.v1.ModuleProto.Module other = (com.zrchain.mint.module.v1.ModuleProto.Module) obj;

      if (!getFeeCollectorName()
          .equals(other.getFeeCollectorName())) return false;
      if (!getAuthority()
          .equals(other.getAuthority())) return false;
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
      hash = (37 * hash) + FEE_COLLECTOR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFeeCollectorName().hashCode();
      hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
      hash = (53 * hash) + getAuthority().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.zrchain.mint.module.v1.ModuleProto.Module parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.zrchain.mint.module.v1.ModuleProto.Module parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.mint.module.v1.ModuleProto.Module parseFrom(
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
    public static Builder newBuilder(com.zrchain.mint.module.v1.ModuleProto.Module prototype) {
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
     * Module is the config object of the mint module.
     * </pre>
     *
     * Protobuf type {@code zrchain.mint.module.v1.Module}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:zrchain.mint.module.v1.Module)
        com.zrchain.mint.module.v1.ModuleProto.ModuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zrchain.mint.module.v1.ModuleProto.internal_static_zrchain_mint_module_v1_Module_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zrchain.mint.module.v1.ModuleProto.internal_static_zrchain_mint_module_v1_Module_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zrchain.mint.module.v1.ModuleProto.Module.class, com.zrchain.mint.module.v1.ModuleProto.Module.Builder.class);
      }

      // Construct using com.zrchain.mint.module.v1.ModuleProto.Module.newBuilder()
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
        feeCollectorName_ = "";
        authority_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zrchain.mint.module.v1.ModuleProto.internal_static_zrchain_mint_module_v1_Module_descriptor;
      }

      @java.lang.Override
      public com.zrchain.mint.module.v1.ModuleProto.Module getDefaultInstanceForType() {
        return com.zrchain.mint.module.v1.ModuleProto.Module.getDefaultInstance();
      }

      @java.lang.Override
      public com.zrchain.mint.module.v1.ModuleProto.Module build() {
        com.zrchain.mint.module.v1.ModuleProto.Module result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.zrchain.mint.module.v1.ModuleProto.Module buildPartial() {
        com.zrchain.mint.module.v1.ModuleProto.Module result = new com.zrchain.mint.module.v1.ModuleProto.Module(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.zrchain.mint.module.v1.ModuleProto.Module result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.feeCollectorName_ = feeCollectorName_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.authority_ = authority_;
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
        if (other instanceof com.zrchain.mint.module.v1.ModuleProto.Module) {
          return mergeFrom((com.zrchain.mint.module.v1.ModuleProto.Module)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zrchain.mint.module.v1.ModuleProto.Module other) {
        if (other == com.zrchain.mint.module.v1.ModuleProto.Module.getDefaultInstance()) return this;
        if (!other.getFeeCollectorName().isEmpty()) {
          feeCollectorName_ = other.feeCollectorName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getAuthority().isEmpty()) {
          authority_ = other.authority_;
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
                feeCollectorName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                authority_ = input.readStringRequireUtf8();
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

      private java.lang.Object feeCollectorName_ = "";
      /**
       * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
       * @return The feeCollectorName.
       */
      public java.lang.String getFeeCollectorName() {
        java.lang.Object ref = feeCollectorName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          feeCollectorName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
       * @return The bytes for feeCollectorName.
       */
      public com.google.protobuf.ByteString
          getFeeCollectorNameBytes() {
        java.lang.Object ref = feeCollectorName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          feeCollectorName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
       * @param value The feeCollectorName to set.
       * @return This builder for chaining.
       */
      public Builder setFeeCollectorName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        feeCollectorName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFeeCollectorName() {
        feeCollectorName_ = getDefaultInstance().getFeeCollectorName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string fee_collector_name = 1 [json_name = "feeCollectorName"];</code>
       * @param value The bytes for feeCollectorName to set.
       * @return This builder for chaining.
       */
      public Builder setFeeCollectorNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        feeCollectorName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object authority_ = "";
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2 [json_name = "authority"];</code>
       * @return The authority.
       */
      public java.lang.String getAuthority() {
        java.lang.Object ref = authority_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authority_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2 [json_name = "authority"];</code>
       * @return The bytes for authority.
       */
      public com.google.protobuf.ByteString
          getAuthorityBytes() {
        java.lang.Object ref = authority_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authority_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2 [json_name = "authority"];</code>
       * @param value The authority to set.
       * @return This builder for chaining.
       */
      public Builder setAuthority(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        authority_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2 [json_name = "authority"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthority() {
        authority_ = getDefaultInstance().getAuthority();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2 [json_name = "authority"];</code>
       * @param value The bytes for authority to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        authority_ = value;
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


      // @@protoc_insertion_point(builder_scope:zrchain.mint.module.v1.Module)
    }

    // @@protoc_insertion_point(class_scope:zrchain.mint.module.v1.Module)
    private static final com.zrchain.mint.module.v1.ModuleProto.Module DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zrchain.mint.module.v1.ModuleProto.Module();
    }

    public static com.zrchain.mint.module.v1.ModuleProto.Module getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Module>
        PARSER = new com.google.protobuf.AbstractParser<Module>() {
      @java.lang.Override
      public Module parsePartialFrom(
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

    public static com.google.protobuf.Parser<Module> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Module> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.zrchain.mint.module.v1.ModuleProto.Module getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zrchain_mint_module_v1_Module_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zrchain_mint_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#zrchain/mint/module/v1/module.proto\022\026z" +
      "rchain.mint.module.v1\032 cosmos/app/v1alph" +
      "a1/module.proto\"\215\001\n\006Module\022,\n\022fee_collec" +
      "tor_name\030\001 \001(\tR\020feeCollectorName\022\034\n\tauth" +
      "ority\030\002 \001(\tR\tauthority:7\272\300\226\332\0011\n/github.c" +
      "om/Zenrock-Foundation/zrchain/v5/x/mintB" +
      "\242\001\n\032com.zrchain.mint.module.v1B\013ModulePr" +
      "oto\242\002\003ZMM\252\002\026Zrchain.Mint.Module.V1\312\002\026Zrc" +
      "hain\\Mint\\Module\\V1\342\002\"Zrchain\\Mint\\Modul" +
      "e\\V1\\GPBMetadata\352\002\031Zrchain::Mint::Module" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.app.v1alpha1.ModuleProto.getDescriptor(),
        });
    internal_static_zrchain_mint_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zrchain_mint_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zrchain_mint_module_v1_Module_descriptor,
        new java.lang.String[] { "FeeCollectorName", "Authority", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.app.v1alpha1.ModuleProto.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.app.v1alpha1.ModuleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
