// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/callbacks.proto

package com.stride.records;

public final class CallbacksProto {
  private CallbacksProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransferCallbackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:stride.records.TransferCallback)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 deposit_record_id = 1 [json_name = "depositRecordId"];</code>
     * @return The depositRecordId.
     */
    long getDepositRecordId();
  }
  /**
   * <pre>
   * ---------------------- Transfer Callback ---------------------- //
   * </pre>
   *
   * Protobuf type {@code stride.records.TransferCallback}
   */
  public static final class TransferCallback extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:stride.records.TransferCallback)
      TransferCallbackOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransferCallback.newBuilder() to construct.
    private TransferCallback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransferCallback() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransferCallback();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.records.CallbacksProto.internal_static_stride_records_TransferCallback_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.records.CallbacksProto.internal_static_stride_records_TransferCallback_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.records.CallbacksProto.TransferCallback.class, com.stride.records.CallbacksProto.TransferCallback.Builder.class);
    }

    public static final int DEPOSIT_RECORD_ID_FIELD_NUMBER = 1;
    private long depositRecordId_ = 0L;
    /**
     * <code>uint64 deposit_record_id = 1 [json_name = "depositRecordId"];</code>
     * @return The depositRecordId.
     */
    @java.lang.Override
    public long getDepositRecordId() {
      return depositRecordId_;
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
      if (depositRecordId_ != 0L) {
        output.writeUInt64(1, depositRecordId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (depositRecordId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, depositRecordId_);
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
      if (!(obj instanceof com.stride.records.CallbacksProto.TransferCallback)) {
        return super.equals(obj);
      }
      com.stride.records.CallbacksProto.TransferCallback other = (com.stride.records.CallbacksProto.TransferCallback) obj;

      if (getDepositRecordId()
          != other.getDepositRecordId()) return false;
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
      hash = (37 * hash) + DEPOSIT_RECORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDepositRecordId());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.stride.records.CallbacksProto.TransferCallback parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.stride.records.CallbacksProto.TransferCallback parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stride.records.CallbacksProto.TransferCallback parseFrom(
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
    public static Builder newBuilder(com.stride.records.CallbacksProto.TransferCallback prototype) {
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
     * ---------------------- Transfer Callback ---------------------- //
     * </pre>
     *
     * Protobuf type {@code stride.records.TransferCallback}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:stride.records.TransferCallback)
        com.stride.records.CallbacksProto.TransferCallbackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.stride.records.CallbacksProto.internal_static_stride_records_TransferCallback_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.stride.records.CallbacksProto.internal_static_stride_records_TransferCallback_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.stride.records.CallbacksProto.TransferCallback.class, com.stride.records.CallbacksProto.TransferCallback.Builder.class);
      }

      // Construct using com.stride.records.CallbacksProto.TransferCallback.newBuilder()
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
        depositRecordId_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.stride.records.CallbacksProto.internal_static_stride_records_TransferCallback_descriptor;
      }

      @java.lang.Override
      public com.stride.records.CallbacksProto.TransferCallback getDefaultInstanceForType() {
        return com.stride.records.CallbacksProto.TransferCallback.getDefaultInstance();
      }

      @java.lang.Override
      public com.stride.records.CallbacksProto.TransferCallback build() {
        com.stride.records.CallbacksProto.TransferCallback result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.stride.records.CallbacksProto.TransferCallback buildPartial() {
        com.stride.records.CallbacksProto.TransferCallback result = new com.stride.records.CallbacksProto.TransferCallback(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.stride.records.CallbacksProto.TransferCallback result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.depositRecordId_ = depositRecordId_;
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
        if (other instanceof com.stride.records.CallbacksProto.TransferCallback) {
          return mergeFrom((com.stride.records.CallbacksProto.TransferCallback)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.stride.records.CallbacksProto.TransferCallback other) {
        if (other == com.stride.records.CallbacksProto.TransferCallback.getDefaultInstance()) return this;
        if (other.getDepositRecordId() != 0L) {
          setDepositRecordId(other.getDepositRecordId());
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
                depositRecordId_ = input.readUInt64();
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

      private long depositRecordId_ ;
      /**
       * <code>uint64 deposit_record_id = 1 [json_name = "depositRecordId"];</code>
       * @return The depositRecordId.
       */
      @java.lang.Override
      public long getDepositRecordId() {
        return depositRecordId_;
      }
      /**
       * <code>uint64 deposit_record_id = 1 [json_name = "depositRecordId"];</code>
       * @param value The depositRecordId to set.
       * @return This builder for chaining.
       */
      public Builder setDepositRecordId(long value) {

        depositRecordId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 deposit_record_id = 1 [json_name = "depositRecordId"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDepositRecordId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        depositRecordId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:stride.records.TransferCallback)
    }

    // @@protoc_insertion_point(class_scope:stride.records.TransferCallback)
    private static final com.stride.records.CallbacksProto.TransferCallback DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.stride.records.CallbacksProto.TransferCallback();
    }

    public static com.stride.records.CallbacksProto.TransferCallback getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransferCallback>
        PARSER = new com.google.protobuf.AbstractParser<TransferCallback>() {
      @java.lang.Override
      public TransferCallback parsePartialFrom(
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

    public static com.google.protobuf.Parser<TransferCallback> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransferCallback> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.stride.records.CallbacksProto.TransferCallback getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_TransferCallback_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_TransferCallback_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036stride/records/callbacks.proto\022\016stride" +
      ".records\">\n\020TransferCallback\022*\n\021deposit_" +
      "record_id\030\001 \001(\004R\017depositRecordIdB\255\001\n\022com" +
      ".stride.recordsB\016CallbacksProtoZ0github." +
      "com/Stride-Labs/stride/v9/x/records/type" +
      "s\242\002\003SRX\252\002\016Stride.Records\312\002\016Stride\\Record" +
      "s\342\002\032Stride\\Records\\GPBMetadata\352\002\017Stride:" +
      ":Recordsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_stride_records_TransferCallback_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_records_TransferCallback_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_TransferCallback_descriptor,
        new java.lang.String[] { "DepositRecordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
