// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/maintainers/mappable/mappable.proto

package com.assetmantle.modules.maintainers.mappable;

public final class MappableProto {
  private MappableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MappableOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.maintainers.mappable.Mappable)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     * @return Whether the maintainer field is set.
     */
    boolean hasMaintainer();
    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     * @return The maintainer.
     */
    com.assetmantle.schema.documents.base.DocumentProto.Document getMaintainer();
    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     */
    com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder getMaintainerOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.maintainers.mappable.Mappable}
   */
  public static final class Mappable extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.maintainers.mappable.Mappable)
      MappableOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mappable.newBuilder() to construct.
    private Mappable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mappable() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mappable();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.maintainers.mappable.MappableProto.internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.maintainers.mappable.MappableProto.internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.class, com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.Builder.class);
    }

    public static final int MAINTAINER_FIELD_NUMBER = 1;
    private com.assetmantle.schema.documents.base.DocumentProto.Document maintainer_;
    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     * @return Whether the maintainer field is set.
     */
    @java.lang.Override
    public boolean hasMaintainer() {
      return maintainer_ != null;
    }
    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     * @return The maintainer.
     */
    @java.lang.Override
    public com.assetmantle.schema.documents.base.DocumentProto.Document getMaintainer() {
      return maintainer_ == null ? com.assetmantle.schema.documents.base.DocumentProto.Document.getDefaultInstance() : maintainer_;
    }
    /**
     * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder getMaintainerOrBuilder() {
      return maintainer_ == null ? com.assetmantle.schema.documents.base.DocumentProto.Document.getDefaultInstance() : maintainer_;
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
      if (maintainer_ != null) {
        output.writeMessage(1, getMaintainer());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maintainer_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMaintainer());
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
      if (!(obj instanceof com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable other = (com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable) obj;

      if (hasMaintainer() != other.hasMaintainer()) return false;
      if (hasMaintainer()) {
        if (!getMaintainer()
            .equals(other.getMaintainer())) return false;
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
      if (hasMaintainer()) {
        hash = (37 * hash) + MAINTAINER_FIELD_NUMBER;
        hash = (53 * hash) + getMaintainer().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable prototype) {
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
     * Protobuf type {@code assetmantle.modules.maintainers.mappable.Mappable}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.maintainers.mappable.Mappable)
        com.assetmantle.modules.maintainers.mappable.MappableProto.MappableOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.maintainers.mappable.MappableProto.internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.maintainers.mappable.MappableProto.internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.class, com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.Builder.class);
      }

      // Construct using com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.newBuilder()
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
        maintainer_ = null;
        if (maintainerBuilder_ != null) {
          maintainerBuilder_.dispose();
          maintainerBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.maintainers.mappable.MappableProto.internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable getDefaultInstanceForType() {
        return com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable build() {
        com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable buildPartial() {
        com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable result = new com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maintainer_ = maintainerBuilder_ == null
              ? maintainer_
              : maintainerBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable) {
          return mergeFrom((com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable other) {
        if (other == com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable.getDefaultInstance()) return this;
        if (other.hasMaintainer()) {
          mergeMaintainer(other.getMaintainer());
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
                    getMaintainerFieldBuilder().getBuilder(),
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

      private com.assetmantle.schema.documents.base.DocumentProto.Document maintainer_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.documents.base.DocumentProto.Document, com.assetmantle.schema.documents.base.DocumentProto.Document.Builder, com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder> maintainerBuilder_;
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       * @return Whether the maintainer field is set.
       */
      public boolean hasMaintainer() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       * @return The maintainer.
       */
      public com.assetmantle.schema.documents.base.DocumentProto.Document getMaintainer() {
        if (maintainerBuilder_ == null) {
          return maintainer_ == null ? com.assetmantle.schema.documents.base.DocumentProto.Document.getDefaultInstance() : maintainer_;
        } else {
          return maintainerBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public Builder setMaintainer(com.assetmantle.schema.documents.base.DocumentProto.Document value) {
        if (maintainerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          maintainer_ = value;
        } else {
          maintainerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public Builder setMaintainer(
          com.assetmantle.schema.documents.base.DocumentProto.Document.Builder builderForValue) {
        if (maintainerBuilder_ == null) {
          maintainer_ = builderForValue.build();
        } else {
          maintainerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public Builder mergeMaintainer(com.assetmantle.schema.documents.base.DocumentProto.Document value) {
        if (maintainerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            maintainer_ != null &&
            maintainer_ != com.assetmantle.schema.documents.base.DocumentProto.Document.getDefaultInstance()) {
            getMaintainerBuilder().mergeFrom(value);
          } else {
            maintainer_ = value;
          }
        } else {
          maintainerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public Builder clearMaintainer() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maintainer_ = null;
        if (maintainerBuilder_ != null) {
          maintainerBuilder_.dispose();
          maintainerBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public com.assetmantle.schema.documents.base.DocumentProto.Document.Builder getMaintainerBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMaintainerFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      public com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder getMaintainerOrBuilder() {
        if (maintainerBuilder_ != null) {
          return maintainerBuilder_.getMessageOrBuilder();
        } else {
          return maintainer_ == null ?
              com.assetmantle.schema.documents.base.DocumentProto.Document.getDefaultInstance() : maintainer_;
        }
      }
      /**
       * <code>.assetmantle.schema.documents.base.Document maintainer = 1 [json_name = "maintainer"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.documents.base.DocumentProto.Document, com.assetmantle.schema.documents.base.DocumentProto.Document.Builder, com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder> 
          getMaintainerFieldBuilder() {
        if (maintainerBuilder_ == null) {
          maintainerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.documents.base.DocumentProto.Document, com.assetmantle.schema.documents.base.DocumentProto.Document.Builder, com.assetmantle.schema.documents.base.DocumentProto.DocumentOrBuilder>(
                  getMaintainer(),
                  getParentForChildren(),
                  isClean());
          maintainer_ = null;
        }
        return maintainerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.maintainers.mappable.Mappable)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.maintainers.mappable.Mappable)
    private static final com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable();
    }

    public static com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mappable>
        PARSER = new com.google.protobuf.AbstractParser<Mappable>() {
      @java.lang.Override
      public Mappable parsePartialFrom(
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

    public static com.google.protobuf.Parser<Mappable> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mappable> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.maintainers.mappable.MappableProto.Mappable getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/assetmantle/maintainers/mappable/mappa" +
      "ble.proto\022(assetmantle.modules.maintaine" +
      "rs.mappable\032)assetmantle/documents/base/" +
      "document.proto\"W\n\010Mappable\022K\n\nmaintainer" +
      "\030\001 \001(\0132+.assetmantle.schema.documents.ba" +
      "se.DocumentR\nmaintainerB\377\001\n,com.assetman" +
      "tle.modules.maintainers.mappableB\rMappab" +
      "leProto\242\002\004AMMM\252\002(Assetmantle.Modules.Mai" +
      "ntainers.Mappable\312\002(Assetmantle\\Modules\\" +
      "Maintainers\\Mappable\342\0024Assetmantle\\Modul" +
      "es\\Maintainers\\Mappable\\GPBMetadata\352\002+As" +
      "setmantle::Modules::Maintainers::Mappabl" +
      "eb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.documents.base.DocumentProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor,
        new java.lang.String[] { "Maintainer", });
    com.assetmantle.schema.documents.base.DocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}