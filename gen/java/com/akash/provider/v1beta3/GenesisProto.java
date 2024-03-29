// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta3/genesis.proto

package com.akash.provider.v1beta3;

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
      // @@protoc_insertion_point(interface_extends:akash.provider.v1beta3.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider> 
        getProvidersList();
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    com.akash.provider.v1beta3.ProviderProto.Provider getProviders(int index);
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    int getProvidersCount();
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    java.util.List<? extends com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder> 
        getProvidersOrBuilderList();
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder getProvidersOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState defines the basic genesis state used by provider module
   * </pre>
   *
   * Protobuf type {@code akash.provider.v1beta3.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.provider.v1beta3.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      providers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.provider.v1beta3.GenesisProto.internal_static_akash_provider_v1beta3_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.provider.v1beta3.GenesisProto.internal_static_akash_provider_v1beta3_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.provider.v1beta3.GenesisProto.GenesisState.class, com.akash.provider.v1beta3.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PROVIDERS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider> providers_;
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider> getProvidersList() {
      return providers_;
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder> 
        getProvidersOrBuilderList() {
      return providers_;
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    @java.lang.Override
    public int getProvidersCount() {
      return providers_.size();
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    @java.lang.Override
    public com.akash.provider.v1beta3.ProviderProto.Provider getProviders(int index) {
      return providers_.get(index);
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
     */
    @java.lang.Override
    public com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder getProvidersOrBuilder(
        int index) {
      return providers_.get(index);
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
      for (int i = 0; i < providers_.size(); i++) {
        output.writeMessage(1, providers_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < providers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, providers_.get(i));
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
      if (!(obj instanceof com.akash.provider.v1beta3.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.akash.provider.v1beta3.GenesisProto.GenesisState other = (com.akash.provider.v1beta3.GenesisProto.GenesisState) obj;

      if (!getProvidersList()
          .equals(other.getProvidersList())) return false;
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
      if (getProvidersCount() > 0) {
        hash = (37 * hash) + PROVIDERS_FIELD_NUMBER;
        hash = (53 * hash) + getProvidersList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.provider.v1beta3.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.akash.provider.v1beta3.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the basic genesis state used by provider module
     * </pre>
     *
     * Protobuf type {@code akash.provider.v1beta3.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.provider.v1beta3.GenesisState)
        com.akash.provider.v1beta3.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akash.provider.v1beta3.GenesisProto.internal_static_akash_provider_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akash.provider.v1beta3.GenesisProto.internal_static_akash_provider_v1beta3_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akash.provider.v1beta3.GenesisProto.GenesisState.class, com.akash.provider.v1beta3.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.akash.provider.v1beta3.GenesisProto.GenesisState.newBuilder()
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
        if (providersBuilder_ == null) {
          providers_ = java.util.Collections.emptyList();
        } else {
          providers_ = null;
          providersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akash.provider.v1beta3.GenesisProto.internal_static_akash_provider_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.akash.provider.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.akash.provider.v1beta3.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.akash.provider.v1beta3.GenesisProto.GenesisState build() {
        com.akash.provider.v1beta3.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.akash.provider.v1beta3.GenesisProto.GenesisState buildPartial() {
        com.akash.provider.v1beta3.GenesisProto.GenesisState result = new com.akash.provider.v1beta3.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.akash.provider.v1beta3.GenesisProto.GenesisState result) {
        if (providersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            providers_ = java.util.Collections.unmodifiableList(providers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.providers_ = providers_;
        } else {
          result.providers_ = providersBuilder_.build();
        }
      }

      private void buildPartial0(com.akash.provider.v1beta3.GenesisProto.GenesisState result) {
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
        if (other instanceof com.akash.provider.v1beta3.GenesisProto.GenesisState) {
          return mergeFrom((com.akash.provider.v1beta3.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akash.provider.v1beta3.GenesisProto.GenesisState other) {
        if (other == com.akash.provider.v1beta3.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (providersBuilder_ == null) {
          if (!other.providers_.isEmpty()) {
            if (providers_.isEmpty()) {
              providers_ = other.providers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProvidersIsMutable();
              providers_.addAll(other.providers_);
            }
            onChanged();
          }
        } else {
          if (!other.providers_.isEmpty()) {
            if (providersBuilder_.isEmpty()) {
              providersBuilder_.dispose();
              providersBuilder_ = null;
              providers_ = other.providers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              providersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getProvidersFieldBuilder() : null;
            } else {
              providersBuilder_.addAllMessages(other.providers_);
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
                com.akash.provider.v1beta3.ProviderProto.Provider m =
                    input.readMessage(
                        com.akash.provider.v1beta3.ProviderProto.Provider.parser(),
                        extensionRegistry);
                if (providersBuilder_ == null) {
                  ensureProvidersIsMutable();
                  providers_.add(m);
                } else {
                  providersBuilder_.addMessage(m);
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

      private java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider> providers_ =
        java.util.Collections.emptyList();
      private void ensureProvidersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          providers_ = new java.util.ArrayList<com.akash.provider.v1beta3.ProviderProto.Provider>(providers_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.akash.provider.v1beta3.ProviderProto.Provider, com.akash.provider.v1beta3.ProviderProto.Provider.Builder, com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder> providersBuilder_;

      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider> getProvidersList() {
        if (providersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(providers_);
        } else {
          return providersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public int getProvidersCount() {
        if (providersBuilder_ == null) {
          return providers_.size();
        } else {
          return providersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public com.akash.provider.v1beta3.ProviderProto.Provider getProviders(int index) {
        if (providersBuilder_ == null) {
          return providers_.get(index);
        } else {
          return providersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder setProviders(
          int index, com.akash.provider.v1beta3.ProviderProto.Provider value) {
        if (providersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProvidersIsMutable();
          providers_.set(index, value);
          onChanged();
        } else {
          providersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder setProviders(
          int index, com.akash.provider.v1beta3.ProviderProto.Provider.Builder builderForValue) {
        if (providersBuilder_ == null) {
          ensureProvidersIsMutable();
          providers_.set(index, builderForValue.build());
          onChanged();
        } else {
          providersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder addProviders(com.akash.provider.v1beta3.ProviderProto.Provider value) {
        if (providersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProvidersIsMutable();
          providers_.add(value);
          onChanged();
        } else {
          providersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder addProviders(
          int index, com.akash.provider.v1beta3.ProviderProto.Provider value) {
        if (providersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProvidersIsMutable();
          providers_.add(index, value);
          onChanged();
        } else {
          providersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder addProviders(
          com.akash.provider.v1beta3.ProviderProto.Provider.Builder builderForValue) {
        if (providersBuilder_ == null) {
          ensureProvidersIsMutable();
          providers_.add(builderForValue.build());
          onChanged();
        } else {
          providersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder addProviders(
          int index, com.akash.provider.v1beta3.ProviderProto.Provider.Builder builderForValue) {
        if (providersBuilder_ == null) {
          ensureProvidersIsMutable();
          providers_.add(index, builderForValue.build());
          onChanged();
        } else {
          providersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder addAllProviders(
          java.lang.Iterable<? extends com.akash.provider.v1beta3.ProviderProto.Provider> values) {
        if (providersBuilder_ == null) {
          ensureProvidersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, providers_);
          onChanged();
        } else {
          providersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder clearProviders() {
        if (providersBuilder_ == null) {
          providers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          providersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public Builder removeProviders(int index) {
        if (providersBuilder_ == null) {
          ensureProvidersIsMutable();
          providers_.remove(index);
          onChanged();
        } else {
          providersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public com.akash.provider.v1beta3.ProviderProto.Provider.Builder getProvidersBuilder(
          int index) {
        return getProvidersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder getProvidersOrBuilder(
          int index) {
        if (providersBuilder_ == null) {
          return providers_.get(index);  } else {
          return providersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public java.util.List<? extends com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder> 
           getProvidersOrBuilderList() {
        if (providersBuilder_ != null) {
          return providersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(providers_);
        }
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public com.akash.provider.v1beta3.ProviderProto.Provider.Builder addProvidersBuilder() {
        return getProvidersFieldBuilder().addBuilder(
            com.akash.provider.v1beta3.ProviderProto.Provider.getDefaultInstance());
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public com.akash.provider.v1beta3.ProviderProto.Provider.Builder addProvidersBuilder(
          int index) {
        return getProvidersFieldBuilder().addBuilder(
            index, com.akash.provider.v1beta3.ProviderProto.Provider.getDefaultInstance());
      }
      /**
       * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
       */
      public java.util.List<com.akash.provider.v1beta3.ProviderProto.Provider.Builder> 
           getProvidersBuilderList() {
        return getProvidersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.akash.provider.v1beta3.ProviderProto.Provider, com.akash.provider.v1beta3.ProviderProto.Provider.Builder, com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder> 
          getProvidersFieldBuilder() {
        if (providersBuilder_ == null) {
          providersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.akash.provider.v1beta3.ProviderProto.Provider, com.akash.provider.v1beta3.ProviderProto.Provider.Builder, com.akash.provider.v1beta3.ProviderProto.ProviderOrBuilder>(
                  providers_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          providers_ = null;
        }
        return providersBuilder_;
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


      // @@protoc_insertion_point(builder_scope:akash.provider.v1beta3.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:akash.provider.v1beta3.GenesisState)
    private static final com.akash.provider.v1beta3.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akash.provider.v1beta3.GenesisProto.GenesisState();
    }

    public static com.akash.provider.v1beta3.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.akash.provider.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_provider_v1beta3_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_provider_v1beta3_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$akash/provider/v1beta3/genesis.proto\022\026" +
      "akash.provider.v1beta3\032\024gogoproto/gogo.p" +
      "roto\032%akash/provider/v1beta3/provider.pr" +
      "oto\"u\n\014GenesisState\022e\n\tproviders\030\001 \003(\0132 " +
      ".akash.provider.v1beta3.ProviderB%\310\336\037\000\352\336" +
      "\037\tproviders\362\336\037\020yaml:\"providers\"R\tprovide" +
      "rsB\337\001\n\032com.akash.provider.v1beta3B\014Genes" +
      "isProtoZ;github.com/akash-network/akash-" +
      "api/go/node/provider/v1beta3\242\002\003APX\252\002\026Aka" +
      "sh.Provider.V1beta3\312\002\026Akash\\Provider\\V1b" +
      "eta3\342\002\"Akash\\Provider\\V1beta3\\GPBMetadat" +
      "a\352\002\030Akash::Provider::V1beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.provider.v1beta3.ProviderProto.getDescriptor(),
        });
    internal_static_akash_provider_v1beta3_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_provider_v1beta3_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_provider_v1beta3_GenesisState_descriptor,
        new java.lang.String[] { "Providers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.provider.v1beta3.ProviderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
