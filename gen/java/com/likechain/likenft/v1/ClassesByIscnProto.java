// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/classes_by_iscn.proto

package com.likechain.likenft.v1;

public final class ClassesByIscnProto {
  private ClassesByIscnProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClassesByISCNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.ClassesByISCN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The iscnIdPrefix.
     */
    java.lang.String getIscnIdPrefix();
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The bytes for iscnIdPrefix.
     */
    com.google.protobuf.ByteString
        getIscnIdPrefixBytes();

    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @return A list containing the classIds.
     */
    java.util.List<java.lang.String>
        getClassIdsList();
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @return The count of classIds.
     */
    int getClassIdsCount();
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @param index The index of the element to return.
     * @return The classIds at the given index.
     */
    java.lang.String getClassIds(int index);
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the classIds at the given index.
     */
    com.google.protobuf.ByteString
        getClassIdsBytes(int index);
  }
  /**
   * Protobuf type {@code likechain.likenft.v1.ClassesByISCN}
   */
  public static final class ClassesByISCN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:likechain.likenft.v1.ClassesByISCN)
      ClassesByISCNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClassesByISCN.newBuilder() to construct.
    private ClassesByISCN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClassesByISCN() {
      iscnIdPrefix_ = "";
      classIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClassesByISCN();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.ClassesByIscnProto.internal_static_likechain_likenft_v1_ClassesByISCN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.ClassesByIscnProto.internal_static_likechain_likenft_v1_ClassesByISCN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.class, com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.Builder.class);
    }

    public static final int ISCN_ID_PREFIX_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object iscnIdPrefix_ = "";
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The iscnIdPrefix.
     */
    @java.lang.Override
    public java.lang.String getIscnIdPrefix() {
      java.lang.Object ref = iscnIdPrefix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iscnIdPrefix_ = s;
        return s;
      }
    }
    /**
     * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
     * @return The bytes for iscnIdPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIscnIdPrefixBytes() {
      java.lang.Object ref = iscnIdPrefix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iscnIdPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLASS_IDS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList classIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @return A list containing the classIds.
     */
    public com.google.protobuf.ProtocolStringList
        getClassIdsList() {
      return classIds_;
    }
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @return The count of classIds.
     */
    public int getClassIdsCount() {
      return classIds_.size();
    }
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @param index The index of the element to return.
     * @return The classIds at the given index.
     */
    public java.lang.String getClassIds(int index) {
      return classIds_.get(index);
    }
    /**
     * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the classIds at the given index.
     */
    public com.google.protobuf.ByteString
        getClassIdsBytes(int index) {
      return classIds_.getByteString(index);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnIdPrefix_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iscnIdPrefix_);
      }
      for (int i = 0; i < classIds_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classIds_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iscnIdPrefix_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iscnIdPrefix_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < classIds_.size(); i++) {
          dataSize += computeStringSizeNoTag(classIds_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getClassIdsList().size();
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
      if (!(obj instanceof com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN)) {
        return super.equals(obj);
      }
      com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN other = (com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN) obj;

      if (!getIscnIdPrefix()
          .equals(other.getIscnIdPrefix())) return false;
      if (!getClassIdsList()
          .equals(other.getClassIdsList())) return false;
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
      hash = (37 * hash) + ISCN_ID_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getIscnIdPrefix().hashCode();
      if (getClassIdsCount() > 0) {
        hash = (37 * hash) + CLASS_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getClassIdsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN parseFrom(
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
    public static Builder newBuilder(com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN prototype) {
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
     * Protobuf type {@code likechain.likenft.v1.ClassesByISCN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.ClassesByISCN)
        com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.likechain.likenft.v1.ClassesByIscnProto.internal_static_likechain_likenft_v1_ClassesByISCN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.likechain.likenft.v1.ClassesByIscnProto.internal_static_likechain_likenft_v1_ClassesByISCN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.class, com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.Builder.class);
      }

      // Construct using com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.newBuilder()
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
        iscnIdPrefix_ = "";
        classIds_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.likechain.likenft.v1.ClassesByIscnProto.internal_static_likechain_likenft_v1_ClassesByISCN_descriptor;
      }

      @java.lang.Override
      public com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN getDefaultInstanceForType() {
        return com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.getDefaultInstance();
      }

      @java.lang.Override
      public com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN build() {
        com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN buildPartial() {
        com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN result = new com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iscnIdPrefix_ = iscnIdPrefix_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          classIds_.makeImmutable();
          result.classIds_ = classIds_;
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
        if (other instanceof com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN) {
          return mergeFrom((com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN other) {
        if (other == com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN.getDefaultInstance()) return this;
        if (!other.getIscnIdPrefix().isEmpty()) {
          iscnIdPrefix_ = other.iscnIdPrefix_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.classIds_.isEmpty()) {
          if (classIds_.isEmpty()) {
            classIds_ = other.classIds_;
            bitField0_ |= 0x00000002;
          } else {
            ensureClassIdsIsMutable();
            classIds_.addAll(other.classIds_);
          }
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
                iscnIdPrefix_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureClassIdsIsMutable();
                classIds_.add(s);
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

      private java.lang.Object iscnIdPrefix_ = "";
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return The iscnIdPrefix.
       */
      public java.lang.String getIscnIdPrefix() {
        java.lang.Object ref = iscnIdPrefix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          iscnIdPrefix_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return The bytes for iscnIdPrefix.
       */
      public com.google.protobuf.ByteString
          getIscnIdPrefixBytes() {
        java.lang.Object ref = iscnIdPrefix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          iscnIdPrefix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @param value The iscnIdPrefix to set.
       * @return This builder for chaining.
       */
      public Builder setIscnIdPrefix(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        iscnIdPrefix_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @return This builder for chaining.
       */
      public Builder clearIscnIdPrefix() {
        iscnIdPrefix_ = getDefaultInstance().getIscnIdPrefix();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string iscn_id_prefix = 1 [json_name = "iscnIdPrefix"];</code>
       * @param value The bytes for iscnIdPrefix to set.
       * @return This builder for chaining.
       */
      public Builder setIscnIdPrefixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        iscnIdPrefix_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList classIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureClassIdsIsMutable() {
        if (!classIds_.isModifiable()) {
          classIds_ = new com.google.protobuf.LazyStringArrayList(classIds_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @return A list containing the classIds.
       */
      public com.google.protobuf.ProtocolStringList
          getClassIdsList() {
        classIds_.makeImmutable();
        return classIds_;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @return The count of classIds.
       */
      public int getClassIdsCount() {
        return classIds_.size();
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param index The index of the element to return.
       * @return The classIds at the given index.
       */
      public java.lang.String getClassIds(int index) {
        return classIds_.get(index);
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param index The index of the value to return.
       * @return The bytes of the classIds at the given index.
       */
      public com.google.protobuf.ByteString
          getClassIdsBytes(int index) {
        return classIds_.getByteString(index);
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param index The index to set the value at.
       * @param value The classIds to set.
       * @return This builder for chaining.
       */
      public Builder setClassIds(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureClassIdsIsMutable();
        classIds_.set(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param value The classIds to add.
       * @return This builder for chaining.
       */
      public Builder addClassIds(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureClassIdsIsMutable();
        classIds_.add(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param values The classIds to add.
       * @return This builder for chaining.
       */
      public Builder addAllClassIds(
          java.lang.Iterable<java.lang.String> values) {
        ensureClassIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, classIds_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @return This builder for chaining.
       */
      public Builder clearClassIds() {
        classIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string class_ids = 2 [json_name = "classIds"];</code>
       * @param value The bytes of the classIds to add.
       * @return This builder for chaining.
       */
      public Builder addClassIdsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureClassIdsIsMutable();
        classIds_.add(value);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.ClassesByISCN)
    }

    // @@protoc_insertion_point(class_scope:likechain.likenft.v1.ClassesByISCN)
    private static final com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN();
    }

    public static com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClassesByISCN>
        PARSER = new com.google.protobuf.AbstractParser<ClassesByISCN>() {
      @java.lang.Override
      public ClassesByISCN parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClassesByISCN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClassesByISCN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.ClassesByIscnProto.ClassesByISCN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_ClassesByISCN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_ClassesByISCN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*likechain/likenft/v1/classes_by_iscn.p" +
      "roto\022\024likechain.likenft.v1\"R\n\rClassesByI" +
      "SCN\022$\n\016iscn_id_prefix\030\001 \001(\tR\014iscnIdPrefi" +
      "x\022\033\n\tclass_ids\030\002 \003(\tR\010classIdsB\325\001\n\030com.l" +
      "ikechain.likenft.v1B\022ClassesByIscnProtoZ" +
      "5github.com/likecoin/likecoin-chain/v4/x" +
      "/likenft/types\242\002\003LLX\252\002\024Likechain.Likenft" +
      ".V1\312\002\024Likechain\\Likenft\\V1\342\002 Likechain\\L" +
      "ikenft\\V1\\GPBMetadata\352\002\026Likechain::Liken" +
      "ft::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_likechain_likenft_v1_ClassesByISCN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_likechain_likenft_v1_ClassesByISCN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_ClassesByISCN_descriptor,
        new java.lang.String[] { "IscnIdPrefix", "ClassIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
