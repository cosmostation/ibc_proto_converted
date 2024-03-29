// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/icacallbacks/params.proto

package com.lum.network.icacallbacks;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lum.network.icacallbacks.Params)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code lum.network.icacallbacks.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lum.network.icacallbacks.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.icacallbacks.ParamsProto.internal_static_lum_network_icacallbacks_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.icacallbacks.ParamsProto.internal_static_lum_network_icacallbacks_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.icacallbacks.ParamsProto.Params.class, com.lum.network.icacallbacks.ParamsProto.Params.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.lum.network.icacallbacks.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.lum.network.icacallbacks.ParamsProto.Params other = (com.lum.network.icacallbacks.ParamsProto.Params) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.lum.network.icacallbacks.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.lum.network.icacallbacks.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.icacallbacks.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.lum.network.icacallbacks.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the module.
     * </pre>
     *
     * Protobuf type {@code lum.network.icacallbacks.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lum.network.icacallbacks.Params)
        com.lum.network.icacallbacks.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lum.network.icacallbacks.ParamsProto.internal_static_lum_network_icacallbacks_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lum.network.icacallbacks.ParamsProto.internal_static_lum_network_icacallbacks_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lum.network.icacallbacks.ParamsProto.Params.class, com.lum.network.icacallbacks.ParamsProto.Params.Builder.class);
      }

      // Construct using com.lum.network.icacallbacks.ParamsProto.Params.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lum.network.icacallbacks.ParamsProto.internal_static_lum_network_icacallbacks_Params_descriptor;
      }

      @java.lang.Override
      public com.lum.network.icacallbacks.ParamsProto.Params getDefaultInstanceForType() {
        return com.lum.network.icacallbacks.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.lum.network.icacallbacks.ParamsProto.Params build() {
        com.lum.network.icacallbacks.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lum.network.icacallbacks.ParamsProto.Params buildPartial() {
        com.lum.network.icacallbacks.ParamsProto.Params result = new com.lum.network.icacallbacks.ParamsProto.Params(this);
        onBuilt();
        return result;
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
        if (other instanceof com.lum.network.icacallbacks.ParamsProto.Params) {
          return mergeFrom((com.lum.network.icacallbacks.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lum.network.icacallbacks.ParamsProto.Params other) {
        if (other == com.lum.network.icacallbacks.ParamsProto.Params.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:lum.network.icacallbacks.Params)
    }

    // @@protoc_insertion_point(class_scope:lum.network.icacallbacks.Params)
    private static final com.lum.network.icacallbacks.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lum.network.icacallbacks.ParamsProto.Params();
    }

    public static com.lum.network.icacallbacks.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lum.network.icacallbacks.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_icacallbacks_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_icacallbacks_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%lum-network/icacallbacks/params.proto\022" +
      "\030lum.network.icacallbacks\032\024gogoproto/gog" +
      "o.proto\"\016\n\006Params:\004\230\240\037\000B\336\001\n\034com.lum.netw" +
      "ork.icacallbacksB\013ParamsProtoZ1github.co" +
      "m/lum-network/chain/x/icacallbacks/types" +
      "\242\002\003LNI\252\002\030Lum.Network.Icacallbacks\312\002\030Lum\\" +
      "Network\\Icacallbacks\342\002$Lum\\Network\\Icaca" +
      "llbacks\\GPBMetadata\352\002\032Lum::Network::Icac" +
      "allbacksb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_lum_network_icacallbacks_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lum_network_icacallbacks_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_icacallbacks_Params_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
