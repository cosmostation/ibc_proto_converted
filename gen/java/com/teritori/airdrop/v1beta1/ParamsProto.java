// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teritori/airdrop/v1beta1/params.proto

package com.teritori.airdrop.v1beta1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:teritori.airdrop.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The owner.
     */
    java.lang.String getOwner();
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The bytes for owner.
     */
    com.google.protobuf.ByteString
        getOwnerBytes();
  }
  /**
   * <pre>
   * Params defines the module's parameters.
   * </pre>
   *
   * Protobuf type {@code teritori.airdrop.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:teritori.airdrop.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      owner_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.teritori.airdrop.v1beta1.ParamsProto.internal_static_teritori_airdrop_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.teritori.airdrop.v1beta1.ParamsProto.internal_static_teritori_airdrop_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.teritori.airdrop.v1beta1.ParamsProto.Params.class, com.teritori.airdrop.v1beta1.ParamsProto.Params.Builder.class);
    }

    public static final int OWNER_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object owner_ = "";
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The owner.
     */
    @java.lang.Override
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     * @return The bytes for owner.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
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
      if (!(obj instanceof com.teritori.airdrop.v1beta1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.teritori.airdrop.v1beta1.ParamsProto.Params other = (com.teritori.airdrop.v1beta1.ParamsProto.Params) obj;

      if (!getOwner()
          .equals(other.getOwner())) return false;
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
      hash = (37 * hash) + OWNER_FIELD_NUMBER;
      hash = (53 * hash) + getOwner().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.teritori.airdrop.v1beta1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.teritori.airdrop.v1beta1.ParamsProto.Params prototype) {
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
     * Params defines the module's parameters.
     * </pre>
     *
     * Protobuf type {@code teritori.airdrop.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:teritori.airdrop.v1beta1.Params)
        com.teritori.airdrop.v1beta1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.teritori.airdrop.v1beta1.ParamsProto.internal_static_teritori_airdrop_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.teritori.airdrop.v1beta1.ParamsProto.internal_static_teritori_airdrop_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.teritori.airdrop.v1beta1.ParamsProto.Params.class, com.teritori.airdrop.v1beta1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.teritori.airdrop.v1beta1.ParamsProto.Params.newBuilder()
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
        owner_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.teritori.airdrop.v1beta1.ParamsProto.internal_static_teritori_airdrop_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public com.teritori.airdrop.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
        return com.teritori.airdrop.v1beta1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.teritori.airdrop.v1beta1.ParamsProto.Params build() {
        com.teritori.airdrop.v1beta1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.teritori.airdrop.v1beta1.ParamsProto.Params buildPartial() {
        com.teritori.airdrop.v1beta1.ParamsProto.Params result = new com.teritori.airdrop.v1beta1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.teritori.airdrop.v1beta1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.owner_ = owner_;
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
        if (other instanceof com.teritori.airdrop.v1beta1.ParamsProto.Params) {
          return mergeFrom((com.teritori.airdrop.v1beta1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.teritori.airdrop.v1beta1.ParamsProto.Params other) {
        if (other == com.teritori.airdrop.v1beta1.ParamsProto.Params.getDefaultInstance()) return this;
        if (!other.getOwner().isEmpty()) {
          owner_ = other.owner_;
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
                owner_ = input.readStringRequireUtf8();
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

      private java.lang.Object owner_ = "";
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       * @return The owner.
       */
      public java.lang.String getOwner() {
        java.lang.Object ref = owner_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          owner_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       * @return The bytes for owner.
       */
      public com.google.protobuf.ByteString
          getOwnerBytes() {
        java.lang.Object ref = owner_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          owner_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       * @param value The owner to set.
       * @return This builder for chaining.
       */
      public Builder setOwner(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        owner_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       * @return This builder for chaining.
       */
      public Builder clearOwner() {
        owner_ = getDefaultInstance().getOwner();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string owner = 1 [json_name = "owner"];</code>
       * @param value The bytes for owner to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        owner_ = value;
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


      // @@protoc_insertion_point(builder_scope:teritori.airdrop.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:teritori.airdrop.v1beta1.Params)
    private static final com.teritori.airdrop.v1beta1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.teritori.airdrop.v1beta1.ParamsProto.Params();
    }

    public static com.teritori.airdrop.v1beta1.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.teritori.airdrop.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_teritori_airdrop_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_teritori_airdrop_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%teritori/airdrop/v1beta1/params.proto\022" +
      "\030teritori.airdrop.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\036google/protobuf/duration.proto\032" +
      "\037google/protobuf/timestamp.proto\"\036\n\006Para" +
      "ms\022\024\n\005owner\030\001 \001(\tR\005ownerB\337\001\n\034com.teritor" +
      "i.airdrop.v1beta1B\013ParamsProtoZ2github.c" +
      "om/TERITORI/teritori-chain/x/airdrop/typ" +
      "es\242\002\003TAX\252\002\030Teritori.Airdrop.V1beta1\312\002\030Te" +
      "ritori\\Airdrop\\V1beta1\342\002$Teritori\\Airdro" +
      "p\\V1beta1\\GPBMetadata\352\002\032Teritori::Airdro" +
      "p::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_teritori_airdrop_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_teritori_airdrop_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_teritori_airdrop_v1beta1_Params_descriptor,
        new java.lang.String[] { "Owner", });
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}