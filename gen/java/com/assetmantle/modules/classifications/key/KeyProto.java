// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/classifications/key/key.proto

package com.assetmantle.modules.classifications.key;

public final class KeyProto {
  private KeyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.classifications.key.Key)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    boolean hasClassificationID();
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID();
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.classifications.key.Key}
   */
  public static final class Key extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.classifications.key.Key)
      KeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Key.newBuilder() to construct.
    private Key(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Key() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Key();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.classifications.key.KeyProto.internal_static_assetmantle_modules_classifications_key_Key_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.classifications.key.KeyProto.internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.classifications.key.KeyProto.Key.class, com.assetmantle.modules.classifications.key.KeyProto.Key.Builder.class);
    }

    public static final int CLASSIFICATION_I_D_FIELD_NUMBER = 1;
    private com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID classificationID_;
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    @java.lang.Override
    public boolean hasClassificationID() {
      return classificationID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID() {
      return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
      return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
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
      if (classificationID_ != null) {
        output.writeMessage(1, getClassificationID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (classificationID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getClassificationID());
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
      if (!(obj instanceof com.assetmantle.modules.classifications.key.KeyProto.Key)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.classifications.key.KeyProto.Key other = (com.assetmantle.modules.classifications.key.KeyProto.Key) obj;

      if (hasClassificationID() != other.hasClassificationID()) return false;
      if (hasClassificationID()) {
        if (!getClassificationID()
            .equals(other.getClassificationID())) return false;
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
      if (hasClassificationID()) {
        hash = (37 * hash) + CLASSIFICATION_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getClassificationID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.classifications.key.KeyProto.Key parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.classifications.key.KeyProto.Key prototype) {
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
     * Protobuf type {@code assetmantle.modules.classifications.key.Key}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.classifications.key.Key)
        com.assetmantle.modules.classifications.key.KeyProto.KeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.classifications.key.KeyProto.internal_static_assetmantle_modules_classifications_key_Key_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.classifications.key.KeyProto.internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.classifications.key.KeyProto.Key.class, com.assetmantle.modules.classifications.key.KeyProto.Key.Builder.class);
      }

      // Construct using com.assetmantle.modules.classifications.key.KeyProto.Key.newBuilder()
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
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.classifications.key.KeyProto.internal_static_assetmantle_modules_classifications_key_Key_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.key.KeyProto.Key getDefaultInstanceForType() {
        return com.assetmantle.modules.classifications.key.KeyProto.Key.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.key.KeyProto.Key build() {
        com.assetmantle.modules.classifications.key.KeyProto.Key result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.key.KeyProto.Key buildPartial() {
        com.assetmantle.modules.classifications.key.KeyProto.Key result = new com.assetmantle.modules.classifications.key.KeyProto.Key(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.classifications.key.KeyProto.Key result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.classificationID_ = classificationIDBuilder_ == null
              ? classificationID_
              : classificationIDBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.classifications.key.KeyProto.Key) {
          return mergeFrom((com.assetmantle.modules.classifications.key.KeyProto.Key)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.classifications.key.KeyProto.Key other) {
        if (other == com.assetmantle.modules.classifications.key.KeyProto.Key.getDefaultInstance()) return this;
        if (other.hasClassificationID()) {
          mergeClassificationID(other.getClassificationID());
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
                    getClassificationIDFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID classificationID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder> classificationIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       * @return Whether the classificationID field is set.
       */
      public boolean hasClassificationID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       * @return The classificationID.
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID getClassificationID() {
        if (classificationIDBuilder_ == null) {
          return classificationID_ == null ? com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
        } else {
          return classificationIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder setClassificationID(com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          classificationID_ = value;
        } else {
          classificationIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder setClassificationID(
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder builderForValue) {
        if (classificationIDBuilder_ == null) {
          classificationID_ = builderForValue.build();
        } else {
          classificationIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder mergeClassificationID(com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            classificationID_ != null &&
            classificationID_ != com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance()) {
            getClassificationIDBuilder().mergeFrom(value);
          } else {
            classificationID_ = value;
          }
        } else {
          classificationIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public Builder clearClassificationID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder getClassificationIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getClassificationIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      public com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
        if (classificationIDBuilder_ != null) {
          return classificationIDBuilder_.getMessageOrBuilder();
        } else {
          return classificationID_ == null ?
              com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.getDefaultInstance() : classificationID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder> 
          getClassificationIDFieldBuilder() {
        if (classificationIDBuilder_ == null) {
          classificationIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationID.Builder, com.assetmantle.schema.ids.base.ClassificationIdProto.ClassificationIDOrBuilder>(
                  getClassificationID(),
                  getParentForChildren(),
                  isClean());
          classificationID_ = null;
        }
        return classificationIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.classifications.key.Key)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.classifications.key.Key)
    private static final com.assetmantle.modules.classifications.key.KeyProto.Key DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.classifications.key.KeyProto.Key();
    }

    public static com.assetmantle.modules.classifications.key.KeyProto.Key getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Key>
        PARSER = new com.google.protobuf.AbstractParser<Key>() {
      @java.lang.Override
      public Key parsePartialFrom(
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

    public static com.google.protobuf.Parser<Key> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Key> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.classifications.key.KeyProto.Key getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_classifications_key_Key_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)assetmantle/classifications/key/key.pr" +
      "oto\022\'assetmantle.modules.classifications" +
      ".key\032,assetmantle/ids/base/classificatio" +
      "n_id.proto\"b\n\003Key\022[\n\022classification_i_d\030" +
      "\001 \001(\0132-.assetmantle.schema.ids.base.Clas" +
      "sificationIDR\020classificationIDB\365\001\n+com.a" +
      "ssetmantle.modules.classifications.keyB\010" +
      "KeyProto\242\002\004AMCK\252\002\'Assetmantle.Modules.Cl" +
      "assifications.Key\312\002\'Assetmantle\\Modules\\" +
      "Classifications\\Key\342\0023Assetmantle\\Module" +
      "s\\Classifications\\Key\\GPBMetadata\352\002*Asse" +
      "tmantle::Modules::Classifications::Keyb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_classifications_key_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_classifications_key_Key_descriptor,
        new java.lang.String[] { "ClassificationID", });
    com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
