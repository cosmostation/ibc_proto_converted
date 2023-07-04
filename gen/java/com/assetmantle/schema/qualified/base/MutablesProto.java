// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/qualified/base/mutables.proto

package com.assetmantle.schema.qualified.base;

public final class MutablesProto {
  private MutablesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MutablesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.schema.qualified.base.Mutables)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return Whether the propertyList field is set.
     */
    boolean hasPropertyList();
    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return The propertyList.
     */
    com.assetmantle.schema.lists.base.PropertyListProto.PropertyList getPropertyList();
    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder getPropertyListOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.schema.qualified.base.Mutables}
   */
  public static final class Mutables extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.schema.qualified.base.Mutables)
      MutablesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mutables.newBuilder() to construct.
    private Mutables(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mutables() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mutables();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.schema.qualified.base.MutablesProto.internal_static_assetmantle_schema_qualified_base_Mutables_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.schema.qualified.base.MutablesProto.internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.schema.qualified.base.MutablesProto.Mutables.class, com.assetmantle.schema.qualified.base.MutablesProto.Mutables.Builder.class);
    }

    public static final int PROPERTY_LIST_FIELD_NUMBER = 1;
    private com.assetmantle.schema.lists.base.PropertyListProto.PropertyList propertyList_;
    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return Whether the propertyList field is set.
     */
    @java.lang.Override
    public boolean hasPropertyList() {
      return propertyList_ != null;
    }
    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return The propertyList.
     */
    @java.lang.Override
    public com.assetmantle.schema.lists.base.PropertyListProto.PropertyList getPropertyList() {
      return propertyList_ == null ? com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.getDefaultInstance() : propertyList_;
    }
    /**
     * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder getPropertyListOrBuilder() {
      return propertyList_ == null ? com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.getDefaultInstance() : propertyList_;
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
      if (propertyList_ != null) {
        output.writeMessage(1, getPropertyList());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (propertyList_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPropertyList());
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
      if (!(obj instanceof com.assetmantle.schema.qualified.base.MutablesProto.Mutables)) {
        return super.equals(obj);
      }
      com.assetmantle.schema.qualified.base.MutablesProto.Mutables other = (com.assetmantle.schema.qualified.base.MutablesProto.Mutables) obj;

      if (hasPropertyList() != other.hasPropertyList()) return false;
      if (hasPropertyList()) {
        if (!getPropertyList()
            .equals(other.getPropertyList())) return false;
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
      if (hasPropertyList()) {
        hash = (37 * hash) + PROPERTY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPropertyList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables parseFrom(
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
    public static Builder newBuilder(com.assetmantle.schema.qualified.base.MutablesProto.Mutables prototype) {
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
     * Protobuf type {@code assetmantle.schema.qualified.base.Mutables}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.schema.qualified.base.Mutables)
        com.assetmantle.schema.qualified.base.MutablesProto.MutablesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.schema.qualified.base.MutablesProto.internal_static_assetmantle_schema_qualified_base_Mutables_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.schema.qualified.base.MutablesProto.internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.schema.qualified.base.MutablesProto.Mutables.class, com.assetmantle.schema.qualified.base.MutablesProto.Mutables.Builder.class);
      }

      // Construct using com.assetmantle.schema.qualified.base.MutablesProto.Mutables.newBuilder()
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
        propertyList_ = null;
        if (propertyListBuilder_ != null) {
          propertyListBuilder_.dispose();
          propertyListBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.schema.qualified.base.MutablesProto.internal_static_assetmantle_schema_qualified_base_Mutables_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.schema.qualified.base.MutablesProto.Mutables getDefaultInstanceForType() {
        return com.assetmantle.schema.qualified.base.MutablesProto.Mutables.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.schema.qualified.base.MutablesProto.Mutables build() {
        com.assetmantle.schema.qualified.base.MutablesProto.Mutables result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.schema.qualified.base.MutablesProto.Mutables buildPartial() {
        com.assetmantle.schema.qualified.base.MutablesProto.Mutables result = new com.assetmantle.schema.qualified.base.MutablesProto.Mutables(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.schema.qualified.base.MutablesProto.Mutables result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.propertyList_ = propertyListBuilder_ == null
              ? propertyList_
              : propertyListBuilder_.build();
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
        if (other instanceof com.assetmantle.schema.qualified.base.MutablesProto.Mutables) {
          return mergeFrom((com.assetmantle.schema.qualified.base.MutablesProto.Mutables)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.schema.qualified.base.MutablesProto.Mutables other) {
        if (other == com.assetmantle.schema.qualified.base.MutablesProto.Mutables.getDefaultInstance()) return this;
        if (other.hasPropertyList()) {
          mergePropertyList(other.getPropertyList());
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
                    getPropertyListFieldBuilder().getBuilder(),
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

      private com.assetmantle.schema.lists.base.PropertyListProto.PropertyList propertyList_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.lists.base.PropertyListProto.PropertyList, com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.Builder, com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder> propertyListBuilder_;
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       * @return Whether the propertyList field is set.
       */
      public boolean hasPropertyList() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       * @return The propertyList.
       */
      public com.assetmantle.schema.lists.base.PropertyListProto.PropertyList getPropertyList() {
        if (propertyListBuilder_ == null) {
          return propertyList_ == null ? com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.getDefaultInstance() : propertyList_;
        } else {
          return propertyListBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public Builder setPropertyList(com.assetmantle.schema.lists.base.PropertyListProto.PropertyList value) {
        if (propertyListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          propertyList_ = value;
        } else {
          propertyListBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public Builder setPropertyList(
          com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.Builder builderForValue) {
        if (propertyListBuilder_ == null) {
          propertyList_ = builderForValue.build();
        } else {
          propertyListBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public Builder mergePropertyList(com.assetmantle.schema.lists.base.PropertyListProto.PropertyList value) {
        if (propertyListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            propertyList_ != null &&
            propertyList_ != com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.getDefaultInstance()) {
            getPropertyListBuilder().mergeFrom(value);
          } else {
            propertyList_ = value;
          }
        } else {
          propertyListBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public Builder clearPropertyList() {
        bitField0_ = (bitField0_ & ~0x00000001);
        propertyList_ = null;
        if (propertyListBuilder_ != null) {
          propertyListBuilder_.dispose();
          propertyListBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.Builder getPropertyListBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPropertyListFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      public com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder getPropertyListOrBuilder() {
        if (propertyListBuilder_ != null) {
          return propertyListBuilder_.getMessageOrBuilder();
        } else {
          return propertyList_ == null ?
              com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.getDefaultInstance() : propertyList_;
        }
      }
      /**
       * <code>.assetmantle.schema.lists.base.PropertyList property_list = 1 [json_name = "propertyList"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.lists.base.PropertyListProto.PropertyList, com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.Builder, com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder> 
          getPropertyListFieldBuilder() {
        if (propertyListBuilder_ == null) {
          propertyListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.lists.base.PropertyListProto.PropertyList, com.assetmantle.schema.lists.base.PropertyListProto.PropertyList.Builder, com.assetmantle.schema.lists.base.PropertyListProto.PropertyListOrBuilder>(
                  getPropertyList(),
                  getParentForChildren(),
                  isClean());
          propertyList_ = null;
        }
        return propertyListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.schema.qualified.base.Mutables)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.schema.qualified.base.Mutables)
    private static final com.assetmantle.schema.qualified.base.MutablesProto.Mutables DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.schema.qualified.base.MutablesProto.Mutables();
    }

    public static com.assetmantle.schema.qualified.base.MutablesProto.Mutables getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mutables>
        PARSER = new com.google.protobuf.AbstractParser<Mutables>() {
      @java.lang.Override
      public Mutables parsePartialFrom(
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

    public static com.google.protobuf.Parser<Mutables> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mutables> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.schema.qualified.base.MutablesProto.Mutables getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_qualified_base_Mutables_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)assetmantle/qualified/base/mutables.pr" +
      "oto\022!assetmantle.schema.qualified.base\032\024" +
      "gogoproto/gogo.proto\032*assetmantle/lists/" +
      "base/property_list.proto\"b\n\010Mutables\022P\n\r" +
      "property_list\030\001 \001(\0132+.assetmantle.schema" +
      ".lists.base.PropertyListR\014propertyList:\004" +
      "\210\240\037\000B\334\001\n%com.assetmantle.schema.qualifie" +
      "d.baseB\rMutablesProto\242\002\004ASQB\252\002!Assetmant" +
      "le.Schema.Qualified.Base\312\002!Assetmantle\\S" +
      "chema\\Qualified\\Base\342\002-Assetmantle\\Schem" +
      "a\\Qualified\\Base\\GPBMetadata\352\002$Assetmant" +
      "le::Schema::Qualified::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_qualified_base_Mutables_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_qualified_base_Mutables_descriptor,
        new java.lang.String[] { "PropertyList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}