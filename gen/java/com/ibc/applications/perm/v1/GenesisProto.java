// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/perm/v1/genesis.proto

package com.ibc.applications.perm.v1;

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
      // @@protoc_insertion_point(interface_extends:ibc.applications.perm.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> 
        getPermissionedRelayersList();
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers getPermissionedRelayers(int index);
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    int getPermissionedRelayersCount();
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    java.util.List<? extends com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder> 
        getPermissionedRelayersOrBuilderList();
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder getPermissionedRelayersOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState defines the ibc perm genesis state
   * </pre>
   *
   * Protobuf type {@code ibc.applications.perm.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ibc.applications.perm.v1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      permissionedRelayers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.perm.v1.GenesisProto.internal_static_ibc_applications_perm_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.perm.v1.GenesisProto.internal_static_ibc_applications_perm_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.perm.v1.GenesisProto.GenesisState.class, com.ibc.applications.perm.v1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PERMISSIONED_RELAYERS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> permissionedRelayers_;
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> getPermissionedRelayersList() {
      return permissionedRelayers_;
    }
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder> 
        getPermissionedRelayersOrBuilderList() {
      return permissionedRelayers_;
    }
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    @java.lang.Override
    public int getPermissionedRelayersCount() {
      return permissionedRelayers_.size();
    }
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    @java.lang.Override
    public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers getPermissionedRelayers(int index) {
      return permissionedRelayers_.get(index);
    }
    /**
     * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
     */
    @java.lang.Override
    public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder getPermissionedRelayersOrBuilder(
        int index) {
      return permissionedRelayers_.get(index);
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
      for (int i = 0; i < permissionedRelayers_.size(); i++) {
        output.writeMessage(1, permissionedRelayers_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < permissionedRelayers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, permissionedRelayers_.get(i));
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
      if (!(obj instanceof com.ibc.applications.perm.v1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.ibc.applications.perm.v1.GenesisProto.GenesisState other = (com.ibc.applications.perm.v1.GenesisProto.GenesisState) obj;

      if (!getPermissionedRelayersList()
          .equals(other.getPermissionedRelayersList())) return false;
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
      if (getPermissionedRelayersCount() > 0) {
        hash = (37 * hash) + PERMISSIONED_RELAYERS_FIELD_NUMBER;
        hash = (53 * hash) + getPermissionedRelayersList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.ibc.applications.perm.v1.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the ibc perm genesis state
     * </pre>
     *
     * Protobuf type {@code ibc.applications.perm.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ibc.applications.perm.v1.GenesisState)
        com.ibc.applications.perm.v1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ibc.applications.perm.v1.GenesisProto.internal_static_ibc_applications_perm_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ibc.applications.perm.v1.GenesisProto.internal_static_ibc_applications_perm_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ibc.applications.perm.v1.GenesisProto.GenesisState.class, com.ibc.applications.perm.v1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.ibc.applications.perm.v1.GenesisProto.GenesisState.newBuilder()
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
        if (permissionedRelayersBuilder_ == null) {
          permissionedRelayers_ = java.util.Collections.emptyList();
        } else {
          permissionedRelayers_ = null;
          permissionedRelayersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ibc.applications.perm.v1.GenesisProto.internal_static_ibc_applications_perm_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.ibc.applications.perm.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.ibc.applications.perm.v1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.ibc.applications.perm.v1.GenesisProto.GenesisState build() {
        com.ibc.applications.perm.v1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ibc.applications.perm.v1.GenesisProto.GenesisState buildPartial() {
        com.ibc.applications.perm.v1.GenesisProto.GenesisState result = new com.ibc.applications.perm.v1.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.ibc.applications.perm.v1.GenesisProto.GenesisState result) {
        if (permissionedRelayersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            permissionedRelayers_ = java.util.Collections.unmodifiableList(permissionedRelayers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.permissionedRelayers_ = permissionedRelayers_;
        } else {
          result.permissionedRelayers_ = permissionedRelayersBuilder_.build();
        }
      }

      private void buildPartial0(com.ibc.applications.perm.v1.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof com.ibc.applications.perm.v1.GenesisProto.GenesisState) {
          return mergeFrom((com.ibc.applications.perm.v1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ibc.applications.perm.v1.GenesisProto.GenesisState other) {
        if (other == com.ibc.applications.perm.v1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (permissionedRelayersBuilder_ == null) {
          if (!other.permissionedRelayers_.isEmpty()) {
            if (permissionedRelayers_.isEmpty()) {
              permissionedRelayers_ = other.permissionedRelayers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePermissionedRelayersIsMutable();
              permissionedRelayers_.addAll(other.permissionedRelayers_);
            }
            onChanged();
          }
        } else {
          if (!other.permissionedRelayers_.isEmpty()) {
            if (permissionedRelayersBuilder_.isEmpty()) {
              permissionedRelayersBuilder_.dispose();
              permissionedRelayersBuilder_ = null;
              permissionedRelayers_ = other.permissionedRelayers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              permissionedRelayersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPermissionedRelayersFieldBuilder() : null;
            } else {
              permissionedRelayersBuilder_.addAllMessages(other.permissionedRelayers_);
            }
          }
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
                com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers m =
                    input.readMessage(
                        com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.parser(),
                        extensionRegistry);
                if (permissionedRelayersBuilder_ == null) {
                  ensurePermissionedRelayersIsMutable();
                  permissionedRelayers_.add(m);
                } else {
                  permissionedRelayersBuilder_.addMessage(m);
                }
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

      private java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> permissionedRelayers_ =
        java.util.Collections.emptyList();
      private void ensurePermissionedRelayersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          permissionedRelayers_ = new java.util.ArrayList<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers>(permissionedRelayers_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder> permissionedRelayersBuilder_;

      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> getPermissionedRelayersList() {
        if (permissionedRelayersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(permissionedRelayers_);
        } else {
          return permissionedRelayersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public int getPermissionedRelayersCount() {
        if (permissionedRelayersBuilder_ == null) {
          return permissionedRelayers_.size();
        } else {
          return permissionedRelayersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers getPermissionedRelayers(int index) {
        if (permissionedRelayersBuilder_ == null) {
          return permissionedRelayers_.get(index);
        } else {
          return permissionedRelayersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder setPermissionedRelayers(
          int index, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers value) {
        if (permissionedRelayersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.set(index, value);
          onChanged();
        } else {
          permissionedRelayersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder setPermissionedRelayers(
          int index, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder builderForValue) {
        if (permissionedRelayersBuilder_ == null) {
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.set(index, builderForValue.build());
          onChanged();
        } else {
          permissionedRelayersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder addPermissionedRelayers(com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers value) {
        if (permissionedRelayersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.add(value);
          onChanged();
        } else {
          permissionedRelayersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder addPermissionedRelayers(
          int index, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers value) {
        if (permissionedRelayersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.add(index, value);
          onChanged();
        } else {
          permissionedRelayersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder addPermissionedRelayers(
          com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder builderForValue) {
        if (permissionedRelayersBuilder_ == null) {
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.add(builderForValue.build());
          onChanged();
        } else {
          permissionedRelayersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder addPermissionedRelayers(
          int index, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder builderForValue) {
        if (permissionedRelayersBuilder_ == null) {
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.add(index, builderForValue.build());
          onChanged();
        } else {
          permissionedRelayersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder addAllPermissionedRelayers(
          java.lang.Iterable<? extends com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers> values) {
        if (permissionedRelayersBuilder_ == null) {
          ensurePermissionedRelayersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, permissionedRelayers_);
          onChanged();
        } else {
          permissionedRelayersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder clearPermissionedRelayers() {
        if (permissionedRelayersBuilder_ == null) {
          permissionedRelayers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          permissionedRelayersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public Builder removePermissionedRelayers(int index) {
        if (permissionedRelayersBuilder_ == null) {
          ensurePermissionedRelayersIsMutable();
          permissionedRelayers_.remove(index);
          onChanged();
        } else {
          permissionedRelayersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder getPermissionedRelayersBuilder(
          int index) {
        return getPermissionedRelayersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder getPermissionedRelayersOrBuilder(
          int index) {
        if (permissionedRelayersBuilder_ == null) {
          return permissionedRelayers_.get(index);  } else {
          return permissionedRelayersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public java.util.List<? extends com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder> 
           getPermissionedRelayersOrBuilderList() {
        if (permissionedRelayersBuilder_ != null) {
          return permissionedRelayersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(permissionedRelayers_);
        }
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder addPermissionedRelayersBuilder() {
        return getPermissionedRelayersFieldBuilder().addBuilder(
            com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.getDefaultInstance());
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder addPermissionedRelayersBuilder(
          int index) {
        return getPermissionedRelayersFieldBuilder().addBuilder(
            index, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.getDefaultInstance());
      }
      /**
       * <code>repeated .ibc.applications.perm.v1.PermissionedRelayers permissioned_relayers = 1 [json_name = "permissionedRelayers", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"permissioned_relayers&#92;""];</code>
       */
      public java.util.List<com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder> 
           getPermissionedRelayersBuilderList() {
        return getPermissionedRelayersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder> 
          getPermissionedRelayersFieldBuilder() {
        if (permissionedRelayersBuilder_ == null) {
          permissionedRelayersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayers.Builder, com.ibc.applications.perm.v1.TypesProto.PermissionedRelayersOrBuilder>(
                  permissionedRelayers_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          permissionedRelayers_ = null;
        }
        return permissionedRelayersBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ibc.applications.perm.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:ibc.applications.perm.v1.GenesisState)
    private static final com.ibc.applications.perm.v1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ibc.applications.perm.v1.GenesisProto.GenesisState();
    }

    public static com.ibc.applications.perm.v1.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.ibc.applications.perm.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_perm_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_perm_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&ibc/applications/perm/v1/genesis.proto" +
      "\022\030ibc.applications.perm.v1\032\024gogoproto/go" +
      "go.proto\032$ibc/applications/perm/v1/types" +
      ".proto\"\232\001\n\014GenesisState\022\211\001\n\025permissioned" +
      "_relayers\030\001 \003(\0132..ibc.applications.perm." +
      "v1.PermissionedRelayersB$\310\336\037\000\362\336\037\034yaml:\"p" +
      "ermissioned_relayers\"R\024permissionedRelay" +
      "ersB\335\001\n\034com.ibc.applications.perm.v1B\014Ge" +
      "nesisProtoZ.github.com/initia-labs/initi" +
      "a/x/ibc/perm/types\242\002\003IAP\252\002\030Ibc.Applicati" +
      "ons.Perm.V1\312\002\030Ibc\\Applications\\Perm\\V1\342\002" +
      "$Ibc\\Applications\\Perm\\V1\\GPBMetadata\352\002\033" +
      "Ibc::Applications::Perm::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.applications.perm.v1.TypesProto.getDescriptor(),
        });
    internal_static_ibc_applications_perm_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_perm_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_perm_v1_GenesisState_descriptor,
        new java.lang.String[] { "PermissionedRelayers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.applications.perm.v1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
