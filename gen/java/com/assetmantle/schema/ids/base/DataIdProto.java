// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/ids/base/data_id.proto

package com.assetmantle.schema.ids.base;

public final class DataIdProto {
  private DataIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DataIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.schema.ids.base.DataID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     * @return Whether the typeID field is set.
     */
    boolean hasTypeID();
    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     * @return The typeID.
     */
    com.assetmantle.schema.ids.base.StringIdProto.StringID getTypeID();
    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     */
    com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder getTypeIDOrBuilder();

    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     * @return Whether the hashID field is set.
     */
    boolean hasHashID();
    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     * @return The hashID.
     */
    com.assetmantle.schema.ids.base.HashIdProto.HashID getHashID();
    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     */
    com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder getHashIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.schema.ids.base.DataID}
   */
  public static final class DataID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.schema.ids.base.DataID)
      DataIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DataID.newBuilder() to construct.
    private DataID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataID() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DataID();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.schema.ids.base.DataIdProto.internal_static_assetmantle_schema_ids_base_DataID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.schema.ids.base.DataIdProto.internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.schema.ids.base.DataIdProto.DataID.class, com.assetmantle.schema.ids.base.DataIdProto.DataID.Builder.class);
    }

    public static final int TYPE_I_D_FIELD_NUMBER = 1;
    private com.assetmantle.schema.ids.base.StringIdProto.StringID typeID_;
    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     * @return Whether the typeID field is set.
     */
    @java.lang.Override
    public boolean hasTypeID() {
      return typeID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     * @return The typeID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.StringIdProto.StringID getTypeID() {
      return typeID_ == null ? com.assetmantle.schema.ids.base.StringIdProto.StringID.getDefaultInstance() : typeID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder getTypeIDOrBuilder() {
      return typeID_ == null ? com.assetmantle.schema.ids.base.StringIdProto.StringID.getDefaultInstance() : typeID_;
    }

    public static final int HASH_I_D_FIELD_NUMBER = 2;
    private com.assetmantle.schema.ids.base.HashIdProto.HashID hashID_;
    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     * @return Whether the hashID field is set.
     */
    @java.lang.Override
    public boolean hasHashID() {
      return hashID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     * @return The hashID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.HashIdProto.HashID getHashID() {
      return hashID_ == null ? com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance() : hashID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder getHashIDOrBuilder() {
      return hashID_ == null ? com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance() : hashID_;
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
      if (typeID_ != null) {
        output.writeMessage(1, getTypeID());
      }
      if (hashID_ != null) {
        output.writeMessage(2, getHashID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typeID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTypeID());
      }
      if (hashID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getHashID());
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
      if (!(obj instanceof com.assetmantle.schema.ids.base.DataIdProto.DataID)) {
        return super.equals(obj);
      }
      com.assetmantle.schema.ids.base.DataIdProto.DataID other = (com.assetmantle.schema.ids.base.DataIdProto.DataID) obj;

      if (hasTypeID() != other.hasTypeID()) return false;
      if (hasTypeID()) {
        if (!getTypeID()
            .equals(other.getTypeID())) return false;
      }
      if (hasHashID() != other.hasHashID()) return false;
      if (hasHashID()) {
        if (!getHashID()
            .equals(other.getHashID())) return false;
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
      if (hasTypeID()) {
        hash = (37 * hash) + TYPE_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getTypeID().hashCode();
      }
      if (hasHashID()) {
        hash = (37 * hash) + HASH_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getHashID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.ids.base.DataIdProto.DataID parseFrom(
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
    public static Builder newBuilder(com.assetmantle.schema.ids.base.DataIdProto.DataID prototype) {
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
     * Protobuf type {@code assetmantle.schema.ids.base.DataID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.schema.ids.base.DataID)
        com.assetmantle.schema.ids.base.DataIdProto.DataIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.schema.ids.base.DataIdProto.internal_static_assetmantle_schema_ids_base_DataID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.schema.ids.base.DataIdProto.internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.schema.ids.base.DataIdProto.DataID.class, com.assetmantle.schema.ids.base.DataIdProto.DataID.Builder.class);
      }

      // Construct using com.assetmantle.schema.ids.base.DataIdProto.DataID.newBuilder()
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
        typeID_ = null;
        if (typeIDBuilder_ != null) {
          typeIDBuilder_.dispose();
          typeIDBuilder_ = null;
        }
        hashID_ = null;
        if (hashIDBuilder_ != null) {
          hashIDBuilder_.dispose();
          hashIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.schema.ids.base.DataIdProto.internal_static_assetmantle_schema_ids_base_DataID_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.DataIdProto.DataID getDefaultInstanceForType() {
        return com.assetmantle.schema.ids.base.DataIdProto.DataID.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.DataIdProto.DataID build() {
        com.assetmantle.schema.ids.base.DataIdProto.DataID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.DataIdProto.DataID buildPartial() {
        com.assetmantle.schema.ids.base.DataIdProto.DataID result = new com.assetmantle.schema.ids.base.DataIdProto.DataID(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.schema.ids.base.DataIdProto.DataID result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.typeID_ = typeIDBuilder_ == null
              ? typeID_
              : typeIDBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hashID_ = hashIDBuilder_ == null
              ? hashID_
              : hashIDBuilder_.build();
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
        if (other instanceof com.assetmantle.schema.ids.base.DataIdProto.DataID) {
          return mergeFrom((com.assetmantle.schema.ids.base.DataIdProto.DataID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.schema.ids.base.DataIdProto.DataID other) {
        if (other == com.assetmantle.schema.ids.base.DataIdProto.DataID.getDefaultInstance()) return this;
        if (other.hasTypeID()) {
          mergeTypeID(other.getTypeID());
        }
        if (other.hasHashID()) {
          mergeHashID(other.getHashID());
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
                input.readMessage(
                    getTypeIDFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getHashIDFieldBuilder().getBuilder(),
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

      private com.assetmantle.schema.ids.base.StringIdProto.StringID typeID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.StringIdProto.StringID, com.assetmantle.schema.ids.base.StringIdProto.StringID.Builder, com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder> typeIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       * @return Whether the typeID field is set.
       */
      public boolean hasTypeID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       * @return The typeID.
       */
      public com.assetmantle.schema.ids.base.StringIdProto.StringID getTypeID() {
        if (typeIDBuilder_ == null) {
          return typeID_ == null ? com.assetmantle.schema.ids.base.StringIdProto.StringID.getDefaultInstance() : typeID_;
        } else {
          return typeIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public Builder setTypeID(com.assetmantle.schema.ids.base.StringIdProto.StringID value) {
        if (typeIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          typeID_ = value;
        } else {
          typeIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public Builder setTypeID(
          com.assetmantle.schema.ids.base.StringIdProto.StringID.Builder builderForValue) {
        if (typeIDBuilder_ == null) {
          typeID_ = builderForValue.build();
        } else {
          typeIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public Builder mergeTypeID(com.assetmantle.schema.ids.base.StringIdProto.StringID value) {
        if (typeIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            typeID_ != null &&
            typeID_ != com.assetmantle.schema.ids.base.StringIdProto.StringID.getDefaultInstance()) {
            getTypeIDBuilder().mergeFrom(value);
          } else {
            typeID_ = value;
          }
        } else {
          typeIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public Builder clearTypeID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        typeID_ = null;
        if (typeIDBuilder_ != null) {
          typeIDBuilder_.dispose();
          typeIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public com.assetmantle.schema.ids.base.StringIdProto.StringID.Builder getTypeIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTypeIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      public com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder getTypeIDOrBuilder() {
        if (typeIDBuilder_ != null) {
          return typeIDBuilder_.getMessageOrBuilder();
        } else {
          return typeID_ == null ?
              com.assetmantle.schema.ids.base.StringIdProto.StringID.getDefaultInstance() : typeID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.StringID type_i_d = 1 [json_name = "typeID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.StringIdProto.StringID, com.assetmantle.schema.ids.base.StringIdProto.StringID.Builder, com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder> 
          getTypeIDFieldBuilder() {
        if (typeIDBuilder_ == null) {
          typeIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.StringIdProto.StringID, com.assetmantle.schema.ids.base.StringIdProto.StringID.Builder, com.assetmantle.schema.ids.base.StringIdProto.StringIDOrBuilder>(
                  getTypeID(),
                  getParentForChildren(),
                  isClean());
          typeID_ = null;
        }
        return typeIDBuilder_;
      }

      private com.assetmantle.schema.ids.base.HashIdProto.HashID hashID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.HashIdProto.HashID, com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder, com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder> hashIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       * @return Whether the hashID field is set.
       */
      public boolean hasHashID() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       * @return The hashID.
       */
      public com.assetmantle.schema.ids.base.HashIdProto.HashID getHashID() {
        if (hashIDBuilder_ == null) {
          return hashID_ == null ? com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance() : hashID_;
        } else {
          return hashIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public Builder setHashID(com.assetmantle.schema.ids.base.HashIdProto.HashID value) {
        if (hashIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hashID_ = value;
        } else {
          hashIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public Builder setHashID(
          com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder builderForValue) {
        if (hashIDBuilder_ == null) {
          hashID_ = builderForValue.build();
        } else {
          hashIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public Builder mergeHashID(com.assetmantle.schema.ids.base.HashIdProto.HashID value) {
        if (hashIDBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            hashID_ != null &&
            hashID_ != com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance()) {
            getHashIDBuilder().mergeFrom(value);
          } else {
            hashID_ = value;
          }
        } else {
          hashIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public Builder clearHashID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hashID_ = null;
        if (hashIDBuilder_ != null) {
          hashIDBuilder_.dispose();
          hashIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder getHashIDBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getHashIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      public com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder getHashIDOrBuilder() {
        if (hashIDBuilder_ != null) {
          return hashIDBuilder_.getMessageOrBuilder();
        } else {
          return hashID_ == null ?
              com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance() : hashID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.HashID hash_i_d = 2 [json_name = "hashID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.HashIdProto.HashID, com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder, com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder> 
          getHashIDFieldBuilder() {
        if (hashIDBuilder_ == null) {
          hashIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.HashIdProto.HashID, com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder, com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder>(
                  getHashID(),
                  getParentForChildren(),
                  isClean());
          hashID_ = null;
        }
        return hashIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.schema.ids.base.DataID)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.schema.ids.base.DataID)
    private static final com.assetmantle.schema.ids.base.DataIdProto.DataID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.schema.ids.base.DataIdProto.DataID();
    }

    public static com.assetmantle.schema.ids.base.DataIdProto.DataID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DataID>
        PARSER = new com.google.protobuf.AbstractParser<DataID>() {
      @java.lang.Override
      public DataID parsePartialFrom(
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

    public static com.google.protobuf.Parser<DataID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.schema.ids.base.DataIdProto.DataID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_DataID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"assetmantle/ids/base/data_id.proto\022\033as" +
      "setmantle.schema.ids.base\032\024gogoproto/gog" +
      "o.proto\032\"assetmantle/ids/base/hash_id.pr" +
      "oto\032$assetmantle/ids/base/string_id.prot" +
      "o\"\216\001\n\006DataID\022?\n\010type_i_d\030\001 \001(\0132%.assetma" +
      "ntle.schema.ids.base.StringIDR\006typeID\022=\n" +
      "\010hash_i_d\030\002 \001(\0132#.assetmantle.schema.ids" +
      ".base.HashIDR\006hashID:\004\210\240\037\000B\274\001\n\037com.asset" +
      "mantle.schema.ids.baseB\013DataIdProto\242\002\004AS" +
      "IB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033Asset" +
      "mantle\\Schema\\Ids\\Base\342\002\'Assetmantle\\Sch" +
      "ema\\Ids\\Base\\GPBMetadata\352\002\036Assetmantle::" +
      "Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.HashIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.StringIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_DataID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_DataID_descriptor,
        new java.lang.String[] { "TypeID", "HashID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.HashIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.StringIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}