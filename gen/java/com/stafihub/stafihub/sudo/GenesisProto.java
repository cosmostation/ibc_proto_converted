// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/sudo/genesis.proto

package com.stafihub.stafihub.sudo;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:stafihub.stafihub.sudo.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    java.lang.String getAdmin();
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    com.google.protobuf.ByteString
        getAdminBytes();
  }
  /**
   * <pre>
   * GenesisState defines the sudo module's genesis state.
   * </pre>
   *
   * Protobuf type {@code stafihub.stafihub.sudo.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:stafihub.stafihub.sudo.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      admin_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.sudo.GenesisProto.internal_static_stafihub_stafihub_sudo_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.sudo.GenesisProto.internal_static_stafihub_stafihub_sudo_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.sudo.GenesisProto.GenesisState.class, com.stafihub.stafihub.sudo.GenesisProto.GenesisState.Builder.class);
    }

    public static final int ADMIN_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object admin_ = "";
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    @java.lang.Override
    public java.lang.String getAdmin() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        admin_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdminBytes() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        admin_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, admin_);
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
      if (!(obj instanceof com.stafihub.stafihub.sudo.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.stafihub.stafihub.sudo.GenesisProto.GenesisState other = (com.stafihub.stafihub.sudo.GenesisProto.GenesisState) obj;

      if (!getAdmin()
          .equals(other.getAdmin())) return false;
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
      hash = (37 * hash) + ADMIN_FIELD_NUMBER;
      hash = (53 * hash) + getAdmin().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.stafihub.stafihub.sudo.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the sudo module's genesis state.
     * </pre>
     *
     * Protobuf type {@code stafihub.stafihub.sudo.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:stafihub.stafihub.sudo.GenesisState)
        com.stafihub.stafihub.sudo.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.stafihub.stafihub.sudo.GenesisProto.internal_static_stafihub_stafihub_sudo_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.stafihub.stafihub.sudo.GenesisProto.internal_static_stafihub_stafihub_sudo_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.stafihub.stafihub.sudo.GenesisProto.GenesisState.class, com.stafihub.stafihub.sudo.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.stafihub.stafihub.sudo.GenesisProto.GenesisState.newBuilder()
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
        admin_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.stafihub.stafihub.sudo.GenesisProto.internal_static_stafihub_stafihub_sudo_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.stafihub.stafihub.sudo.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.stafihub.stafihub.sudo.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.stafihub.stafihub.sudo.GenesisProto.GenesisState build() {
        com.stafihub.stafihub.sudo.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.stafihub.stafihub.sudo.GenesisProto.GenesisState buildPartial() {
        com.stafihub.stafihub.sudo.GenesisProto.GenesisState result = new com.stafihub.stafihub.sudo.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.stafihub.stafihub.sudo.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.admin_ = admin_;
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
        if (other instanceof com.stafihub.stafihub.sudo.GenesisProto.GenesisState) {
          return mergeFrom((com.stafihub.stafihub.sudo.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.stafihub.stafihub.sudo.GenesisProto.GenesisState other) {
        if (other == com.stafihub.stafihub.sudo.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (!other.getAdmin().isEmpty()) {
          admin_ = other.admin_;
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
                admin_ = input.readStringRequireUtf8();
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

      private java.lang.Object admin_ = "";
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The admin.
       */
      public java.lang.String getAdmin() {
        java.lang.Object ref = admin_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          admin_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The bytes for admin.
       */
      public com.google.protobuf.ByteString
          getAdminBytes() {
        java.lang.Object ref = admin_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          admin_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdmin(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        admin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearAdmin() {
        admin_ = getDefaultInstance().getAdmin();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The bytes for admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdminBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        admin_ = value;
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


      // @@protoc_insertion_point(builder_scope:stafihub.stafihub.sudo.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:stafihub.stafihub.sudo.GenesisState)
    private static final com.stafihub.stafihub.sudo.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.stafihub.stafihub.sudo.GenesisProto.GenesisState();
    }

    public static com.stafihub.stafihub.sudo.GenesisProto.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.stafihub.stafihub.sudo.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_sudo_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_sudo_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033stafihub/sudo/genesis.proto\022\026stafihub." +
      "stafihub.sudo\032\024gogoproto/gogo.proto\"6\n\014G" +
      "enesisState\022&\n\005admin\030\001 \001(\tB\020\362\336\037\014yaml:\"ad" +
      "min\"R\005adminB\315\001\n\032com.stafihub.stafihub.su" +
      "doB\014GenesisProtoZ)github.com/stafihub/st" +
      "afihub/x/sudo/types\242\002\003SSS\252\002\026Stafihub.Sta" +
      "fihub.Sudo\312\002\026Stafihub\\Stafihub\\Sudo\342\002\"St" +
      "afihub\\Stafihub\\Sudo\\GPBMetadata\352\002\030Stafi" +
      "hub::Stafihub::Sudob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_sudo_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_sudo_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_sudo_GenesisState_descriptor,
        new java.lang.String[] { "Admin", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
