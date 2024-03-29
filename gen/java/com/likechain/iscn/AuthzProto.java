// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/iscn/authz.proto

package com.likechain.iscn;

public final class AuthzProto {
  private AuthzProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateAuthorizationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:likechain.iscn.UpdateAuthorization)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The iscnIdPrefix.
     */
    java.lang.String getIscnIdPrefix();
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The bytes for iscnIdPrefix.
     */
    com.google.protobuf.ByteString
        getIscnIdPrefixBytes();
  }
  /**
   * Protobuf type {@code likechain.iscn.UpdateAuthorization}
   */
  public static final class UpdateAuthorization extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:likechain.iscn.UpdateAuthorization)
      UpdateAuthorizationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateAuthorization.newBuilder() to construct.
    private UpdateAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateAuthorization() {
      iscnIdPrefix_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdateAuthorization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.iscn.AuthzProto.internal_static_likechain_iscn_UpdateAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.iscn.AuthzProto.internal_static_likechain_iscn_UpdateAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.iscn.AuthzProto.UpdateAuthorization.class, com.likechain.iscn.AuthzProto.UpdateAuthorization.Builder.class);
    }

    public static final int ISCN_ID_PREFIX_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object iscnIdPrefix_ = "";
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The iscnIdPrefix.
     */
    @java.lang.Override
    public java.lang.String getIscnIdPrefix() {
      java.lang.Object ref = iscnIdPrefix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iscnIdPrefix_ = s;
        return s;
      }
    }
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The bytes for iscnIdPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIscnIdPrefixBytes() {
      java.lang.Object ref = iscnIdPrefix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iscnIdPrefix_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnIdPrefix_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iscnIdPrefix_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnIdPrefix_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iscnIdPrefix_);
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
      if (!(obj instanceof com.likechain.iscn.AuthzProto.UpdateAuthorization)) {
        return super.equals(obj);
      }
      com.likechain.iscn.AuthzProto.UpdateAuthorization other = (com.likechain.iscn.AuthzProto.UpdateAuthorization) obj;

      if (!getIscnIdPrefix()
          .equals(other.getIscnIdPrefix())) return false;
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
      hash = (37 * hash) + ISCN_ID_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getIscnIdPrefix().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.iscn.AuthzProto.UpdateAuthorization parseFrom(
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
    public static Builder newBuilder(com.likechain.iscn.AuthzProto.UpdateAuthorization prototype) {
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
     * Protobuf type {@code likechain.iscn.UpdateAuthorization}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:likechain.iscn.UpdateAuthorization)
        com.likechain.iscn.AuthzProto.UpdateAuthorizationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.likechain.iscn.AuthzProto.internal_static_likechain_iscn_UpdateAuthorization_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.likechain.iscn.AuthzProto.internal_static_likechain_iscn_UpdateAuthorization_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.likechain.iscn.AuthzProto.UpdateAuthorization.class, com.likechain.iscn.AuthzProto.UpdateAuthorization.Builder.class);
      }

      // Construct using com.likechain.iscn.AuthzProto.UpdateAuthorization.newBuilder()
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
        iscnIdPrefix_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.likechain.iscn.AuthzProto.internal_static_likechain_iscn_UpdateAuthorization_descriptor;
      }

      @java.lang.Override
      public com.likechain.iscn.AuthzProto.UpdateAuthorization getDefaultInstanceForType() {
        return com.likechain.iscn.AuthzProto.UpdateAuthorization.getDefaultInstance();
      }

      @java.lang.Override
      public com.likechain.iscn.AuthzProto.UpdateAuthorization build() {
        com.likechain.iscn.AuthzProto.UpdateAuthorization result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.likechain.iscn.AuthzProto.UpdateAuthorization buildPartial() {
        com.likechain.iscn.AuthzProto.UpdateAuthorization result = new com.likechain.iscn.AuthzProto.UpdateAuthorization(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.likechain.iscn.AuthzProto.UpdateAuthorization result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iscnIdPrefix_ = iscnIdPrefix_;
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
        if (other instanceof com.likechain.iscn.AuthzProto.UpdateAuthorization) {
          return mergeFrom((com.likechain.iscn.AuthzProto.UpdateAuthorization)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.likechain.iscn.AuthzProto.UpdateAuthorization other) {
        if (other == com.likechain.iscn.AuthzProto.UpdateAuthorization.getDefaultInstance()) return this;
        if (!other.getIscnIdPrefix().isEmpty()) {
          iscnIdPrefix_ = other.iscnIdPrefix_;
          bitField0_ |= 0x00000001;
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
                iscnIdPrefix_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

      private java.lang.Object iscnIdPrefix_ = "";
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return The iscnIdPrefix.
       */
      public java.lang.String getIscnIdPrefix() {
        java.lang.Object ref = iscnIdPrefix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          iscnIdPrefix_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return The bytes for iscnIdPrefix.
       */
      public com.google.protobuf.ByteString
          getIscnIdPrefixBytes() {
        java.lang.Object ref = iscnIdPrefix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          iscnIdPrefix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @param value The iscnIdPrefix to set.
       * @return This builder for chaining.
       */
      public Builder setIscnIdPrefix(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        iscnIdPrefix_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return This builder for chaining.
       */
      public Builder clearIscnIdPrefix() {
        iscnIdPrefix_ = getDefaultInstance().getIscnIdPrefix();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @param value The bytes for iscnIdPrefix to set.
       * @return This builder for chaining.
       */
      public Builder setIscnIdPrefixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        iscnIdPrefix_ = value;
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


      // @@protoc_insertion_point(builder_scope:likechain.iscn.UpdateAuthorization)
    }

    // @@protoc_insertion_point(class_scope:likechain.iscn.UpdateAuthorization)
    private static final com.likechain.iscn.AuthzProto.UpdateAuthorization DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.likechain.iscn.AuthzProto.UpdateAuthorization();
    }

    public static com.likechain.iscn.AuthzProto.UpdateAuthorization getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdateAuthorization>
        PARSER = new com.google.protobuf.AbstractParser<UpdateAuthorization>() {
      @java.lang.Override
      public UpdateAuthorization parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdateAuthorization> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateAuthorization> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.likechain.iscn.AuthzProto.UpdateAuthorization getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_iscn_UpdateAuthorization_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_iscn_UpdateAuthorization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032likechain/iscn/authz.proto\022\016likechain." +
      "iscn\032\031cosmos_proto/cosmos.proto\032\024gogopro" +
      "to/gogo.proto\"N\n\023UpdateAuthorization\022$\n\016" +
      "iscn_id_prefix\030\001 \001(\tR\014iscnIdPrefix:\021\312\264-\r" +
      "AuthorizationB\253\001\n\022com.likechain.iscnB\nAu" +
      "thzProtoZ2github.com/likecoin/likecoin-c" +
      "hain/v4/x/iscn/types\242\002\003LIX\252\002\016Likechain.I" +
      "scn\312\002\016Likechain\\Iscn\342\002\032Likechain\\Iscn\\GP" +
      "BMetadata\352\002\017Likechain::Iscnb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_likechain_iscn_UpdateAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_likechain_iscn_UpdateAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_iscn_UpdateAuthorization_descriptor,
        new java.lang.String[] { "IscnIdPrefix", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
