// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/genesis.proto

package com.cosmos.feegrant.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:cosmos.feegrant.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> 
        getAllowancesList();
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    com.cosmos.feegrant.v1beta1.FeegrantProto.Grant getAllowances(int index);
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    int getAllowancesCount();
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    java.util.List<? extends com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder> 
        getAllowancesOrBuilderList();
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder getAllowancesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState contains a set of fee allowances, persisted from the store
   * </pre>
   *
   * Protobuf type {@code cosmos.feegrant.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.feegrant.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      allowances_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.feegrant.v1beta1.GenesisProto.internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.feegrant.v1beta1.GenesisProto.internal_static_cosmos_feegrant_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.class, com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int ALLOWANCES_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> allowances_;
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> getAllowancesList() {
      return allowances_;
    }
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder> 
        getAllowancesOrBuilderList() {
      return allowances_;
    }
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public int getAllowancesCount() {
      return allowances_.size();
    }
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public com.cosmos.feegrant.v1beta1.FeegrantProto.Grant getAllowances(int index) {
      return allowances_.get(index);
    }
    /**
     * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    @java.lang.Override
    public com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder getAllowancesOrBuilder(
        int index) {
      return allowances_.get(index);
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
      for (int i = 0; i < allowances_.size(); i++) {
        output.writeMessage(1, allowances_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < allowances_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, allowances_.get(i));
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
      if (!(obj instanceof com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState other = (com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState) obj;

      if (!getAllowancesList()
          .equals(other.getAllowancesList())) return false;
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
      if (getAllowancesCount() > 0) {
        hash = (37 * hash) + ALLOWANCES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowancesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState prototype) {
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
     * GenesisState contains a set of fee allowances, persisted from the store
     * </pre>
     *
     * Protobuf type {@code cosmos.feegrant.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.feegrant.v1beta1.GenesisState)
        com.cosmos.feegrant.v1beta1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cosmos.feegrant.v1beta1.GenesisProto.internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cosmos.feegrant.v1beta1.GenesisProto.internal_static_cosmos_feegrant_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.class, com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.newBuilder()
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
        if (allowancesBuilder_ == null) {
          allowances_ = java.util.Collections.emptyList();
        } else {
          allowances_ = null;
          allowancesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cosmos.feegrant.v1beta1.GenesisProto.internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState build() {
        com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState buildPartial() {
        com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState result = new com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState result) {
        if (allowancesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            allowances_ = java.util.Collections.unmodifiableList(allowances_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.allowances_ = allowances_;
        } else {
          result.allowances_ = allowancesBuilder_.build();
        }
      }

      private void buildPartial0(com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState result) {
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
        if (other instanceof com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState) {
          return mergeFrom((com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState other) {
        if (other == com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (allowancesBuilder_ == null) {
          if (!other.allowances_.isEmpty()) {
            if (allowances_.isEmpty()) {
              allowances_ = other.allowances_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAllowancesIsMutable();
              allowances_.addAll(other.allowances_);
            }
            onChanged();
          }
        } else {
          if (!other.allowances_.isEmpty()) {
            if (allowancesBuilder_.isEmpty()) {
              allowancesBuilder_.dispose();
              allowancesBuilder_ = null;
              allowances_ = other.allowances_;
              bitField0_ = (bitField0_ & ~0x00000001);
              allowancesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAllowancesFieldBuilder() : null;
            } else {
              allowancesBuilder_.addAllMessages(other.allowances_);
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
                com.cosmos.feegrant.v1beta1.FeegrantProto.Grant m =
                    input.readMessage(
                        com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.parser(),
                        extensionRegistry);
                if (allowancesBuilder_ == null) {
                  ensureAllowancesIsMutable();
                  allowances_.add(m);
                } else {
                  allowancesBuilder_.addMessage(m);
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

      private java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> allowances_ =
        java.util.Collections.emptyList();
      private void ensureAllowancesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          allowances_ = new java.util.ArrayList<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant>(allowances_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.cosmos.feegrant.v1beta1.FeegrantProto.Grant, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder, com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder> allowancesBuilder_;

      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> getAllowancesList() {
        if (allowancesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowances_);
        } else {
          return allowancesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public int getAllowancesCount() {
        if (allowancesBuilder_ == null) {
          return allowances_.size();
        } else {
          return allowancesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public com.cosmos.feegrant.v1beta1.FeegrantProto.Grant getAllowances(int index) {
        if (allowancesBuilder_ == null) {
          return allowances_.get(index);
        } else {
          return allowancesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setAllowances(
          int index, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant value) {
        if (allowancesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowancesIsMutable();
          allowances_.set(index, value);
          onChanged();
        } else {
          allowancesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder setAllowances(
          int index, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder builderForValue) {
        if (allowancesBuilder_ == null) {
          ensureAllowancesIsMutable();
          allowances_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowancesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder addAllowances(com.cosmos.feegrant.v1beta1.FeegrantProto.Grant value) {
        if (allowancesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowancesIsMutable();
          allowances_.add(value);
          onChanged();
        } else {
          allowancesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder addAllowances(
          int index, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant value) {
        if (allowancesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowancesIsMutable();
          allowances_.add(index, value);
          onChanged();
        } else {
          allowancesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder addAllowances(
          com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder builderForValue) {
        if (allowancesBuilder_ == null) {
          ensureAllowancesIsMutable();
          allowances_.add(builderForValue.build());
          onChanged();
        } else {
          allowancesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder addAllowances(
          int index, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder builderForValue) {
        if (allowancesBuilder_ == null) {
          ensureAllowancesIsMutable();
          allowances_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowancesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder addAllAllowances(
          java.lang.Iterable<? extends com.cosmos.feegrant.v1beta1.FeegrantProto.Grant> values) {
        if (allowancesBuilder_ == null) {
          ensureAllowancesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, allowances_);
          onChanged();
        } else {
          allowancesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder clearAllowances() {
        if (allowancesBuilder_ == null) {
          allowances_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          allowancesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public Builder removeAllowances(int index) {
        if (allowancesBuilder_ == null) {
          ensureAllowancesIsMutable();
          allowances_.remove(index);
          onChanged();
        } else {
          allowancesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder getAllowancesBuilder(
          int index) {
        return getAllowancesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder getAllowancesOrBuilder(
          int index) {
        if (allowancesBuilder_ == null) {
          return allowances_.get(index);  } else {
          return allowancesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public java.util.List<? extends com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder> 
           getAllowancesOrBuilderList() {
        if (allowancesBuilder_ != null) {
          return allowancesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowances_);
        }
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder addAllowancesBuilder() {
        return getAllowancesFieldBuilder().addBuilder(
            com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.getDefaultInstance());
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder addAllowancesBuilder(
          int index) {
        return getAllowancesFieldBuilder().addBuilder(
            index, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.getDefaultInstance());
      }
      /**
       * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
       */
      public java.util.List<com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder> 
           getAllowancesBuilderList() {
        return getAllowancesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.cosmos.feegrant.v1beta1.FeegrantProto.Grant, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder, com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder> 
          getAllowancesFieldBuilder() {
        if (allowancesBuilder_ == null) {
          allowancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.cosmos.feegrant.v1beta1.FeegrantProto.Grant, com.cosmos.feegrant.v1beta1.FeegrantProto.Grant.Builder, com.cosmos.feegrant.v1beta1.FeegrantProto.GrantOrBuilder>(
                  allowances_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          allowances_ = null;
        }
        return allowancesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:cosmos.feegrant.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:cosmos.feegrant.v1beta1.GenesisState)
    private static final com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState();
    }

    public static com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.cosmos.feegrant.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%cosmos/feegrant/v1beta1/genesis.proto\022" +
      "\027cosmos.feegrant.v1beta1\032\024gogoproto/gogo" +
      ".proto\032&cosmos/feegrant/v1beta1/feegrant" +
      ".proto\032\021amino/amino.proto\"Y\n\014GenesisStat" +
      "e\022I\n\nallowances\030\001 \003(\0132\036.cosmos.feegrant." +
      "v1beta1.GrantB\t\310\336\037\000\250\347\260*\001R\nallowancesB\300\001\n" +
      "\033com.cosmos.feegrant.v1beta1B\014GenesisPro" +
      "toZ\027cosmossdk.io/x/feegrant\242\002\003CFX\252\002\027Cosm" +
      "os.Feegrant.V1beta1\312\002\027Cosmos\\Feegrant\\V1" +
      "beta1\342\002#Cosmos\\Feegrant\\V1beta1\\GPBMetad" +
      "ata\352\002\031Cosmos::Feegrant::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.feegrant.v1beta1.FeegrantProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_feegrant_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Allowances", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.feegrant.v1beta1.FeegrantProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
