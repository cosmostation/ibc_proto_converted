// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/snapshot/v1beta1/params.proto

package com.axelar.snapshot.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:axelar.snapshot.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 min_proxy_balance = 1 [json_name = "minProxyBalance"];</code>
     * @return The minProxyBalance.
     */
    long getMinProxyBalance();
  }
  /**
   * <pre>
   * Params represent the genesis parameters for the module
   * </pre>
   *
   * Protobuf type {@code axelar.snapshot.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.snapshot.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.snapshot.v1beta1.ParamsProto.internal_static_axelar_snapshot_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.snapshot.v1beta1.ParamsProto.internal_static_axelar_snapshot_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.snapshot.v1beta1.ParamsProto.Params.class, com.axelar.snapshot.v1beta1.ParamsProto.Params.Builder.class);
    }

    public static final int MIN_PROXY_BALANCE_FIELD_NUMBER = 1;
    private long minProxyBalance_ = 0L;
    /**
     * <code>int64 min_proxy_balance = 1 [json_name = "minProxyBalance"];</code>
     * @return The minProxyBalance.
     */
    @java.lang.Override
    public long getMinProxyBalance() {
      return minProxyBalance_;
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
      if (minProxyBalance_ != 0L) {
        output.writeInt64(1, minProxyBalance_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minProxyBalance_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, minProxyBalance_);
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
      if (!(obj instanceof com.axelar.snapshot.v1beta1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.axelar.snapshot.v1beta1.ParamsProto.Params other = (com.axelar.snapshot.v1beta1.ParamsProto.Params) obj;

      if (getMinProxyBalance()
          != other.getMinProxyBalance()) return false;
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
      hash = (37 * hash) + MIN_PROXY_BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinProxyBalance());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.snapshot.v1beta1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.axelar.snapshot.v1beta1.ParamsProto.Params prototype) {
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
     * Params represent the genesis parameters for the module
     * </pre>
     *
     * Protobuf type {@code axelar.snapshot.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.snapshot.v1beta1.Params)
        com.axelar.snapshot.v1beta1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.axelar.snapshot.v1beta1.ParamsProto.internal_static_axelar_snapshot_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.axelar.snapshot.v1beta1.ParamsProto.internal_static_axelar_snapshot_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.axelar.snapshot.v1beta1.ParamsProto.Params.class, com.axelar.snapshot.v1beta1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.axelar.snapshot.v1beta1.ParamsProto.Params.newBuilder()
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
        minProxyBalance_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.axelar.snapshot.v1beta1.ParamsProto.internal_static_axelar_snapshot_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public com.axelar.snapshot.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
        return com.axelar.snapshot.v1beta1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.axelar.snapshot.v1beta1.ParamsProto.Params build() {
        com.axelar.snapshot.v1beta1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.axelar.snapshot.v1beta1.ParamsProto.Params buildPartial() {
        com.axelar.snapshot.v1beta1.ParamsProto.Params result = new com.axelar.snapshot.v1beta1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.axelar.snapshot.v1beta1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.minProxyBalance_ = minProxyBalance_;
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
        if (other instanceof com.axelar.snapshot.v1beta1.ParamsProto.Params) {
          return mergeFrom((com.axelar.snapshot.v1beta1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.axelar.snapshot.v1beta1.ParamsProto.Params other) {
        if (other == com.axelar.snapshot.v1beta1.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.getMinProxyBalance() != 0L) {
          setMinProxyBalance(other.getMinProxyBalance());
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
                minProxyBalance_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private long minProxyBalance_ ;
      /**
       * <code>int64 min_proxy_balance = 1 [json_name = "minProxyBalance"];</code>
       * @return The minProxyBalance.
       */
      @java.lang.Override
      public long getMinProxyBalance() {
        return minProxyBalance_;
      }
      /**
       * <code>int64 min_proxy_balance = 1 [json_name = "minProxyBalance"];</code>
       * @param value The minProxyBalance to set.
       * @return This builder for chaining.
       */
      public Builder setMinProxyBalance(long value) {

        minProxyBalance_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 min_proxy_balance = 1 [json_name = "minProxyBalance"];</code>
       * @return This builder for chaining.
       */
      public Builder clearMinProxyBalance() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minProxyBalance_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:axelar.snapshot.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:axelar.snapshot.v1beta1.Params)
    private static final com.axelar.snapshot.v1beta1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.axelar.snapshot.v1beta1.ParamsProto.Params();
    }

    public static com.axelar.snapshot.v1beta1.ParamsProto.Params getDefaultInstance() {
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
    public com.axelar.snapshot.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_snapshot_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$axelar/snapshot/v1beta1/params.proto\022\027" +
      "axelar.snapshot.v1beta1\032\024gogoproto/gogo." +
      "proto\032\036google/protobuf/duration.proto\"4\n" +
      "\006Params\022*\n\021min_proxy_balance\030\001 \001(\003R\017minP" +
      "roxyBalanceB\341\001\n\033com.axelar.snapshot.v1be" +
      "ta1B\013ParamsProtoZ5github.com/axelarnetwo" +
      "rk/axelar-core/x/snapshot/types\242\002\003ASX\252\002\027" +
      "Axelar.Snapshot.V1beta1\312\002\027Axelar\\Snapsho" +
      "t\\V1beta1\342\002#Axelar\\Snapshot\\V1beta1\\GPBM" +
      "etadata\352\002\031Axelar::Snapshot::V1beta1\310\341\036\000b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_axelar_snapshot_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_snapshot_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_Params_descriptor,
        new java.lang.String[] { "MinProxyBalance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
