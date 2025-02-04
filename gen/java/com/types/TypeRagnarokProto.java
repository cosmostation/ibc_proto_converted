// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thorchain/v1/x/thorchain/types/type_ragnarok.proto

package com.types;

public final class TypeRagnarokProto {
  private TypeRagnarokProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RagnarokWithdrawPositionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.RagnarokWithdrawPosition)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 number = 1 [json_name = "number"];</code>
     * @return The number.
     */
    long getNumber();

    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     * @return Whether the pool field is set.
     */
    boolean hasPool();
    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     * @return The pool.
     */
    com.common.CommonProto.Asset getPool();
    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     */
    com.common.CommonProto.AssetOrBuilder getPoolOrBuilder();
  }
  /**
   * Protobuf type {@code types.RagnarokWithdrawPosition}
   */
  public static final class RagnarokWithdrawPosition extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.RagnarokWithdrawPosition)
      RagnarokWithdrawPositionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RagnarokWithdrawPosition.newBuilder() to construct.
    private RagnarokWithdrawPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RagnarokWithdrawPosition() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RagnarokWithdrawPosition();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.types.TypeRagnarokProto.internal_static_types_RagnarokWithdrawPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.types.TypeRagnarokProto.internal_static_types_RagnarokWithdrawPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.types.TypeRagnarokProto.RagnarokWithdrawPosition.class, com.types.TypeRagnarokProto.RagnarokWithdrawPosition.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private long number_ = 0L;
    /**
     * <code>int64 number = 1 [json_name = "number"];</code>
     * @return The number.
     */
    @java.lang.Override
    public long getNumber() {
      return number_;
    }

    public static final int POOL_FIELD_NUMBER = 2;
    private com.common.CommonProto.Asset pool_;
    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     * @return Whether the pool field is set.
     */
    @java.lang.Override
    public boolean hasPool() {
      return pool_ != null;
    }
    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     * @return The pool.
     */
    @java.lang.Override
    public com.common.CommonProto.Asset getPool() {
      return pool_ == null ? com.common.CommonProto.Asset.getDefaultInstance() : pool_;
    }
    /**
     * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.common.CommonProto.AssetOrBuilder getPoolOrBuilder() {
      return pool_ == null ? com.common.CommonProto.Asset.getDefaultInstance() : pool_;
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
      if (number_ != 0L) {
        output.writeInt64(1, number_);
      }
      if (pool_ != null) {
        output.writeMessage(2, getPool());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (number_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, number_);
      }
      if (pool_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPool());
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
      if (!(obj instanceof com.types.TypeRagnarokProto.RagnarokWithdrawPosition)) {
        return super.equals(obj);
      }
      com.types.TypeRagnarokProto.RagnarokWithdrawPosition other = (com.types.TypeRagnarokProto.RagnarokWithdrawPosition) obj;

      if (getNumber()
          != other.getNumber()) return false;
      if (hasPool() != other.hasPool()) return false;
      if (hasPool()) {
        if (!getPool()
            .equals(other.getPool())) return false;
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
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumber());
      if (hasPool()) {
        hash = (37 * hash) + POOL_FIELD_NUMBER;
        hash = (53 * hash) + getPool().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition parseFrom(
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
    public static Builder newBuilder(com.types.TypeRagnarokProto.RagnarokWithdrawPosition prototype) {
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
     * Protobuf type {@code types.RagnarokWithdrawPosition}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.RagnarokWithdrawPosition)
        com.types.TypeRagnarokProto.RagnarokWithdrawPositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.types.TypeRagnarokProto.internal_static_types_RagnarokWithdrawPosition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.types.TypeRagnarokProto.internal_static_types_RagnarokWithdrawPosition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.types.TypeRagnarokProto.RagnarokWithdrawPosition.class, com.types.TypeRagnarokProto.RagnarokWithdrawPosition.Builder.class);
      }

      // Construct using com.types.TypeRagnarokProto.RagnarokWithdrawPosition.newBuilder()
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
        number_ = 0L;
        pool_ = null;
        if (poolBuilder_ != null) {
          poolBuilder_.dispose();
          poolBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.types.TypeRagnarokProto.internal_static_types_RagnarokWithdrawPosition_descriptor;
      }

      @java.lang.Override
      public com.types.TypeRagnarokProto.RagnarokWithdrawPosition getDefaultInstanceForType() {
        return com.types.TypeRagnarokProto.RagnarokWithdrawPosition.getDefaultInstance();
      }

      @java.lang.Override
      public com.types.TypeRagnarokProto.RagnarokWithdrawPosition build() {
        com.types.TypeRagnarokProto.RagnarokWithdrawPosition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.types.TypeRagnarokProto.RagnarokWithdrawPosition buildPartial() {
        com.types.TypeRagnarokProto.RagnarokWithdrawPosition result = new com.types.TypeRagnarokProto.RagnarokWithdrawPosition(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.types.TypeRagnarokProto.RagnarokWithdrawPosition result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.number_ = number_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pool_ = poolBuilder_ == null
              ? pool_
              : poolBuilder_.build();
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
        if (other instanceof com.types.TypeRagnarokProto.RagnarokWithdrawPosition) {
          return mergeFrom((com.types.TypeRagnarokProto.RagnarokWithdrawPosition)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.types.TypeRagnarokProto.RagnarokWithdrawPosition other) {
        if (other == com.types.TypeRagnarokProto.RagnarokWithdrawPosition.getDefaultInstance()) return this;
        if (other.getNumber() != 0L) {
          setNumber(other.getNumber());
        }
        if (other.hasPool()) {
          mergePool(other.getPool());
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
                number_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getPoolFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private long number_ ;
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @return The number.
       */
      @java.lang.Override
      public long getNumber() {
        return number_;
      }
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @param value The number to set.
       * @return This builder for chaining.
       */
      public Builder setNumber(long value) {

        number_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = 0L;
        onChanged();
        return this;
      }

      private com.common.CommonProto.Asset pool_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.common.CommonProto.Asset, com.common.CommonProto.Asset.Builder, com.common.CommonProto.AssetOrBuilder> poolBuilder_;
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       * @return Whether the pool field is set.
       */
      public boolean hasPool() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       * @return The pool.
       */
      public com.common.CommonProto.Asset getPool() {
        if (poolBuilder_ == null) {
          return pool_ == null ? com.common.CommonProto.Asset.getDefaultInstance() : pool_;
        } else {
          return poolBuilder_.getMessage();
        }
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public Builder setPool(com.common.CommonProto.Asset value) {
        if (poolBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pool_ = value;
        } else {
          poolBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public Builder setPool(
          com.common.CommonProto.Asset.Builder builderForValue) {
        if (poolBuilder_ == null) {
          pool_ = builderForValue.build();
        } else {
          poolBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergePool(com.common.CommonProto.Asset value) {
        if (poolBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            pool_ != null &&
            pool_ != com.common.CommonProto.Asset.getDefaultInstance()) {
            getPoolBuilder().mergeFrom(value);
          } else {
            pool_ = value;
          }
        } else {
          poolBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearPool() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pool_ = null;
        if (poolBuilder_ != null) {
          poolBuilder_.dispose();
          poolBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public com.common.CommonProto.Asset.Builder getPoolBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPoolFieldBuilder().getBuilder();
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      public com.common.CommonProto.AssetOrBuilder getPoolOrBuilder() {
        if (poolBuilder_ != null) {
          return poolBuilder_.getMessageOrBuilder();
        } else {
          return pool_ == null ?
              com.common.CommonProto.Asset.getDefaultInstance() : pool_;
        }
      }
      /**
       * <code>.common.Asset pool = 2 [json_name = "pool", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.common.CommonProto.Asset, com.common.CommonProto.Asset.Builder, com.common.CommonProto.AssetOrBuilder> 
          getPoolFieldBuilder() {
        if (poolBuilder_ == null) {
          poolBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.common.CommonProto.Asset, com.common.CommonProto.Asset.Builder, com.common.CommonProto.AssetOrBuilder>(
                  getPool(),
                  getParentForChildren(),
                  isClean());
          pool_ = null;
        }
        return poolBuilder_;
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


      // @@protoc_insertion_point(builder_scope:types.RagnarokWithdrawPosition)
    }

    // @@protoc_insertion_point(class_scope:types.RagnarokWithdrawPosition)
    private static final com.types.TypeRagnarokProto.RagnarokWithdrawPosition DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.types.TypeRagnarokProto.RagnarokWithdrawPosition();
    }

    public static com.types.TypeRagnarokProto.RagnarokWithdrawPosition getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RagnarokWithdrawPosition>
        PARSER = new com.google.protobuf.AbstractParser<RagnarokWithdrawPosition>() {
      @java.lang.Override
      public RagnarokWithdrawPosition parsePartialFrom(
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

    public static com.google.protobuf.Parser<RagnarokWithdrawPosition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RagnarokWithdrawPosition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.types.TypeRagnarokProto.RagnarokWithdrawPosition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_RagnarokWithdrawPosition_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_RagnarokWithdrawPosition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2thorchain/v1/x/thorchain/types/type_ra" +
      "gnarok.proto\022\005types\032 thorchain/v1/common" +
      "/common.proto\032\024gogoproto/gogo.proto\"[\n\030R" +
      "agnarokWithdrawPosition\022\026\n\006number\030\001 \001(\003R" +
      "\006number\022\'\n\004pool\030\002 \001(\0132\r.common.AssetB\004\310\336" +
      "\037\000R\004poolB\201\001\n\tcom.typesB\021TypeRagnarokProt" +
      "oZ/gitlab.com/thorchain/thornode/x/thorc" +
      "hain/types\242\002\003TXX\252\002\005Types\312\002\005Types\342\002\021Types" +
      "\\GPBMetadata\352\002\005Typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.common.CommonProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_types_RagnarokWithdrawPosition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_RagnarokWithdrawPosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_RagnarokWithdrawPosition_descriptor,
        new java.lang.String[] { "Number", "Pool", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.common.CommonProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
