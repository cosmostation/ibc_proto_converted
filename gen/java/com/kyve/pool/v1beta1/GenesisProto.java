// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/pool/v1beta1/genesis.proto

package com.kyve.pool.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:kyve.pool.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool> 
        getPoolListList();
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    com.kyve.pool.v1beta1.PoolProto.Pool getPoolList(int index);
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    int getPoolListCount();
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder> 
        getPoolListOrBuilderList();
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder getPoolListOrBuilder(
        int index);

    /**
     * <pre>
     * pool_count ...
     * </pre>
     *
     * <code>uint64 pool_count = 3 [json_name = "poolCount"];</code>
     * @return The poolCount.
     */
    long getPoolCount();
  }
  /**
   * <pre>
   * GenesisState defines the pool module's genesis state.
   * </pre>
   *
   * Protobuf type {@code kyve.pool.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:kyve.pool.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      poolList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.pool.v1beta1.GenesisProto.internal_static_kyve_pool_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.pool.v1beta1.GenesisProto.internal_static_kyve_pool_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.pool.v1beta1.GenesisProto.GenesisState.class, com.kyve.pool.v1beta1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int POOL_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool> poolList_;
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool> getPoolListList() {
      return poolList_;
    }
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder> 
        getPoolListOrBuilderList() {
      return poolList_;
    }
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getPoolListCount() {
      return poolList_.size();
    }
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.kyve.pool.v1beta1.PoolProto.Pool getPoolList(int index) {
      return poolList_.get(index);
    }
    /**
     * <pre>
     * pool_list ...
     * </pre>
     *
     * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder getPoolListOrBuilder(
        int index) {
      return poolList_.get(index);
    }

    public static final int POOL_COUNT_FIELD_NUMBER = 3;
    private long poolCount_ = 0L;
    /**
     * <pre>
     * pool_count ...
     * </pre>
     *
     * <code>uint64 pool_count = 3 [json_name = "poolCount"];</code>
     * @return The poolCount.
     */
    @java.lang.Override
    public long getPoolCount() {
      return poolCount_;
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
      for (int i = 0; i < poolList_.size(); i++) {
        output.writeMessage(2, poolList_.get(i));
      }
      if (poolCount_ != 0L) {
        output.writeUInt64(3, poolCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < poolList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, poolList_.get(i));
      }
      if (poolCount_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, poolCount_);
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
      if (!(obj instanceof com.kyve.pool.v1beta1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.kyve.pool.v1beta1.GenesisProto.GenesisState other = (com.kyve.pool.v1beta1.GenesisProto.GenesisState) obj;

      if (!getPoolListList()
          .equals(other.getPoolListList())) return false;
      if (getPoolCount()
          != other.getPoolCount()) return false;
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
      if (getPoolListCount() > 0) {
        hash = (37 * hash) + POOL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPoolListList().hashCode();
      }
      hash = (37 * hash) + POOL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPoolCount());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.kyve.pool.v1beta1.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the pool module's genesis state.
     * </pre>
     *
     * Protobuf type {@code kyve.pool.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:kyve.pool.v1beta1.GenesisState)
        com.kyve.pool.v1beta1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kyve.pool.v1beta1.GenesisProto.internal_static_kyve_pool_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kyve.pool.v1beta1.GenesisProto.internal_static_kyve_pool_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kyve.pool.v1beta1.GenesisProto.GenesisState.class, com.kyve.pool.v1beta1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.kyve.pool.v1beta1.GenesisProto.GenesisState.newBuilder()
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
        if (poolListBuilder_ == null) {
          poolList_ = java.util.Collections.emptyList();
        } else {
          poolList_ = null;
          poolListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        poolCount_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kyve.pool.v1beta1.GenesisProto.internal_static_kyve_pool_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.kyve.pool.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.kyve.pool.v1beta1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.kyve.pool.v1beta1.GenesisProto.GenesisState build() {
        com.kyve.pool.v1beta1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kyve.pool.v1beta1.GenesisProto.GenesisState buildPartial() {
        com.kyve.pool.v1beta1.GenesisProto.GenesisState result = new com.kyve.pool.v1beta1.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.kyve.pool.v1beta1.GenesisProto.GenesisState result) {
        if (poolListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            poolList_ = java.util.Collections.unmodifiableList(poolList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.poolList_ = poolList_;
        } else {
          result.poolList_ = poolListBuilder_.build();
        }
      }

      private void buildPartial0(com.kyve.pool.v1beta1.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.poolCount_ = poolCount_;
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
        if (other instanceof com.kyve.pool.v1beta1.GenesisProto.GenesisState) {
          return mergeFrom((com.kyve.pool.v1beta1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kyve.pool.v1beta1.GenesisProto.GenesisState other) {
        if (other == com.kyve.pool.v1beta1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (poolListBuilder_ == null) {
          if (!other.poolList_.isEmpty()) {
            if (poolList_.isEmpty()) {
              poolList_ = other.poolList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePoolListIsMutable();
              poolList_.addAll(other.poolList_);
            }
            onChanged();
          }
        } else {
          if (!other.poolList_.isEmpty()) {
            if (poolListBuilder_.isEmpty()) {
              poolListBuilder_.dispose();
              poolListBuilder_ = null;
              poolList_ = other.poolList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              poolListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPoolListFieldBuilder() : null;
            } else {
              poolListBuilder_.addAllMessages(other.poolList_);
            }
          }
        }
        if (other.getPoolCount() != 0L) {
          setPoolCount(other.getPoolCount());
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
              case 18: {
                com.kyve.pool.v1beta1.PoolProto.Pool m =
                    input.readMessage(
                        com.kyve.pool.v1beta1.PoolProto.Pool.parser(),
                        extensionRegistry);
                if (poolListBuilder_ == null) {
                  ensurePoolListIsMutable();
                  poolList_.add(m);
                } else {
                  poolListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 24: {
                poolCount_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
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

      private java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool> poolList_ =
        java.util.Collections.emptyList();
      private void ensurePoolListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          poolList_ = new java.util.ArrayList<com.kyve.pool.v1beta1.PoolProto.Pool>(poolList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.kyve.pool.v1beta1.PoolProto.Pool, com.kyve.pool.v1beta1.PoolProto.Pool.Builder, com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder> poolListBuilder_;

      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool> getPoolListList() {
        if (poolListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(poolList_);
        } else {
          return poolListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public int getPoolListCount() {
        if (poolListBuilder_ == null) {
          return poolList_.size();
        } else {
          return poolListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public com.kyve.pool.v1beta1.PoolProto.Pool getPoolList(int index) {
        if (poolListBuilder_ == null) {
          return poolList_.get(index);
        } else {
          return poolListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder setPoolList(
          int index, com.kyve.pool.v1beta1.PoolProto.Pool value) {
        if (poolListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolListIsMutable();
          poolList_.set(index, value);
          onChanged();
        } else {
          poolListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder setPoolList(
          int index, com.kyve.pool.v1beta1.PoolProto.Pool.Builder builderForValue) {
        if (poolListBuilder_ == null) {
          ensurePoolListIsMutable();
          poolList_.set(index, builderForValue.build());
          onChanged();
        } else {
          poolListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder addPoolList(com.kyve.pool.v1beta1.PoolProto.Pool value) {
        if (poolListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolListIsMutable();
          poolList_.add(value);
          onChanged();
        } else {
          poolListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder addPoolList(
          int index, com.kyve.pool.v1beta1.PoolProto.Pool value) {
        if (poolListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolListIsMutable();
          poolList_.add(index, value);
          onChanged();
        } else {
          poolListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder addPoolList(
          com.kyve.pool.v1beta1.PoolProto.Pool.Builder builderForValue) {
        if (poolListBuilder_ == null) {
          ensurePoolListIsMutable();
          poolList_.add(builderForValue.build());
          onChanged();
        } else {
          poolListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder addPoolList(
          int index, com.kyve.pool.v1beta1.PoolProto.Pool.Builder builderForValue) {
        if (poolListBuilder_ == null) {
          ensurePoolListIsMutable();
          poolList_.add(index, builderForValue.build());
          onChanged();
        } else {
          poolListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder addAllPoolList(
          java.lang.Iterable<? extends com.kyve.pool.v1beta1.PoolProto.Pool> values) {
        if (poolListBuilder_ == null) {
          ensurePoolListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, poolList_);
          onChanged();
        } else {
          poolListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearPoolList() {
        if (poolListBuilder_ == null) {
          poolList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          poolListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public Builder removePoolList(int index) {
        if (poolListBuilder_ == null) {
          ensurePoolListIsMutable();
          poolList_.remove(index);
          onChanged();
        } else {
          poolListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public com.kyve.pool.v1beta1.PoolProto.Pool.Builder getPoolListBuilder(
          int index) {
        return getPoolListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder getPoolListOrBuilder(
          int index) {
        if (poolListBuilder_ == null) {
          return poolList_.get(index);  } else {
          return poolListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder> 
           getPoolListOrBuilderList() {
        if (poolListBuilder_ != null) {
          return poolListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(poolList_);
        }
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public com.kyve.pool.v1beta1.PoolProto.Pool.Builder addPoolListBuilder() {
        return getPoolListFieldBuilder().addBuilder(
            com.kyve.pool.v1beta1.PoolProto.Pool.getDefaultInstance());
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public com.kyve.pool.v1beta1.PoolProto.Pool.Builder addPoolListBuilder(
          int index) {
        return getPoolListFieldBuilder().addBuilder(
            index, com.kyve.pool.v1beta1.PoolProto.Pool.getDefaultInstance());
      }
      /**
       * <pre>
       * pool_list ...
       * </pre>
       *
       * <code>repeated .kyve.pool.v1beta1.Pool pool_list = 2 [json_name = "poolList", (.gogoproto.nullable) = false];</code>
       */
      public java.util.List<com.kyve.pool.v1beta1.PoolProto.Pool.Builder> 
           getPoolListBuilderList() {
        return getPoolListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.kyve.pool.v1beta1.PoolProto.Pool, com.kyve.pool.v1beta1.PoolProto.Pool.Builder, com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder> 
          getPoolListFieldBuilder() {
        if (poolListBuilder_ == null) {
          poolListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.kyve.pool.v1beta1.PoolProto.Pool, com.kyve.pool.v1beta1.PoolProto.Pool.Builder, com.kyve.pool.v1beta1.PoolProto.PoolOrBuilder>(
                  poolList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          poolList_ = null;
        }
        return poolListBuilder_;
      }

      private long poolCount_ ;
      /**
       * <pre>
       * pool_count ...
       * </pre>
       *
       * <code>uint64 pool_count = 3 [json_name = "poolCount"];</code>
       * @return The poolCount.
       */
      @java.lang.Override
      public long getPoolCount() {
        return poolCount_;
      }
      /**
       * <pre>
       * pool_count ...
       * </pre>
       *
       * <code>uint64 pool_count = 3 [json_name = "poolCount"];</code>
       * @param value The poolCount to set.
       * @return This builder for chaining.
       */
      public Builder setPoolCount(long value) {

        poolCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * pool_count ...
       * </pre>
       *
       * <code>uint64 pool_count = 3 [json_name = "poolCount"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        poolCount_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:kyve.pool.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:kyve.pool.v1beta1.GenesisState)
    private static final com.kyve.pool.v1beta1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kyve.pool.v1beta1.GenesisProto.GenesisState();
    }

    public static com.kyve.pool.v1beta1.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.kyve.pool.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kyve_pool_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_pool_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037kyve/pool/v1beta1/genesis.proto\022\021kyve." +
      "pool.v1beta1\032\024gogoproto/gogo.proto\032\034kyve" +
      "/pool/v1beta1/pool.proto\"w\n\014GenesisState" +
      "\022:\n\tpool_list\030\002 \003(\0132\027.kyve.pool.v1beta1." +
      "PoolB\004\310\336\037\000R\010poolList\022\035\n\npool_count\030\003 \001(\004" +
      "R\tpoolCountJ\004\010\001\020\002R\006paramsB\264\001\n\025com.kyve.p" +
      "ool.v1beta1B\014GenesisProtoZ)github.com/KY" +
      "VENetwork/chain/x/pool/types\242\002\003KPX\252\002\021Kyv" +
      "e.Pool.V1beta1\312\002\021Kyve\\Pool\\V1beta1\342\002\035Kyv" +
      "e\\Pool\\V1beta1\\GPBMetadata\352\002\023Kyve::Pool:" +
      ":V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.kyve.pool.v1beta1.PoolProto.getDescriptor(),
        });
    internal_static_kyve_pool_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_pool_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_pool_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "PoolList", "PoolCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.kyve.pool.v1beta1.PoolProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}