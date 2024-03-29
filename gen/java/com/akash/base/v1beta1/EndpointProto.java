// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta1/endpoint.proto

package com.akash.base.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EndpointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.base.v1beta1.Endpoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
     * @return The enum numeric value on the wire for kind.
     */
    int getKindValue();
    /**
     * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
     * @return The kind.
     */
    com.akash.base.v1beta1.EndpointProto.Endpoint.Kind getKind();
  }
  /**
   * <pre>
   * Endpoint describes a publicly accessible IP service
   * </pre>
   *
   * Protobuf type {@code akash.base.v1beta1.Endpoint}
   */
  public static final class Endpoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.base.v1beta1.Endpoint)
      EndpointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Endpoint.newBuilder() to construct.
    private Endpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Endpoint() {
      kind_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Endpoint();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.base.v1beta1.EndpointProto.internal_static_akash_base_v1beta1_Endpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.base.v1beta1.EndpointProto.internal_static_akash_base_v1beta1_Endpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.base.v1beta1.EndpointProto.Endpoint.class, com.akash.base.v1beta1.EndpointProto.Endpoint.Builder.class);
    }

    /**
     * <pre>
     * This describes how the endpoint is implemented when the lease is deployed
     * </pre>
     *
     * Protobuf enum {@code akash.base.v1beta1.Endpoint.Kind}
     */
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * Describes an endpoint that becomes a Kubernetes Ingress
       * </pre>
       *
       * <code>SHARED_HTTP = 0;</code>
       */
      SHARED_HTTP(0),
      /**
       * <pre>
       * Describes an endpoint that becomes a Kubernetes NodePort
       * </pre>
       *
       * <code>RANDOM_PORT = 1;</code>
       */
      RANDOM_PORT(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * Describes an endpoint that becomes a Kubernetes Ingress
       * </pre>
       *
       * <code>SHARED_HTTP = 0;</code>
       */
      public static final int SHARED_HTTP_VALUE = 0;
      /**
       * <pre>
       * Describes an endpoint that becomes a Kubernetes NodePort
       * </pre>
       *
       * <code>RANDOM_PORT = 1;</code>
       */
      public static final int RANDOM_PORT_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Kind valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Kind forNumber(int value) {
        switch (value) {
          case 0: return SHARED_HTTP;
          case 1: return RANDOM_PORT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Kind> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.akash.base.v1beta1.EndpointProto.Endpoint.getDescriptor().getEnumTypes().get(0);
      }

      private static final Kind[] VALUES = values();

      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Kind(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:akash.base.v1beta1.Endpoint.Kind)
    }

    public static final int KIND_FIELD_NUMBER = 1;
    private int kind_ = 0;
    /**
     * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override public int getKindValue() {
      return kind_;
    }
    /**
     * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
     * @return The kind.
     */
    @java.lang.Override public com.akash.base.v1beta1.EndpointProto.Endpoint.Kind getKind() {
      com.akash.base.v1beta1.EndpointProto.Endpoint.Kind result = com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.forNumber(kind_);
      return result == null ? com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.UNRECOGNIZED : result;
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
      if (kind_ != com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.SHARED_HTTP.getNumber()) {
        output.writeEnum(1, kind_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kind_ != com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.SHARED_HTTP.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, kind_);
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
      if (!(obj instanceof com.akash.base.v1beta1.EndpointProto.Endpoint)) {
        return super.equals(obj);
      }
      com.akash.base.v1beta1.EndpointProto.Endpoint other = (com.akash.base.v1beta1.EndpointProto.Endpoint) obj;

      if (kind_ != other.kind_) return false;
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
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + kind_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.base.v1beta1.EndpointProto.Endpoint parseFrom(
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
    public static Builder newBuilder(com.akash.base.v1beta1.EndpointProto.Endpoint prototype) {
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
     * Endpoint describes a publicly accessible IP service
     * </pre>
     *
     * Protobuf type {@code akash.base.v1beta1.Endpoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.base.v1beta1.Endpoint)
        com.akash.base.v1beta1.EndpointProto.EndpointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akash.base.v1beta1.EndpointProto.internal_static_akash_base_v1beta1_Endpoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akash.base.v1beta1.EndpointProto.internal_static_akash_base_v1beta1_Endpoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akash.base.v1beta1.EndpointProto.Endpoint.class, com.akash.base.v1beta1.EndpointProto.Endpoint.Builder.class);
      }

      // Construct using com.akash.base.v1beta1.EndpointProto.Endpoint.newBuilder()
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
        kind_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akash.base.v1beta1.EndpointProto.internal_static_akash_base_v1beta1_Endpoint_descriptor;
      }

      @java.lang.Override
      public com.akash.base.v1beta1.EndpointProto.Endpoint getDefaultInstanceForType() {
        return com.akash.base.v1beta1.EndpointProto.Endpoint.getDefaultInstance();
      }

      @java.lang.Override
      public com.akash.base.v1beta1.EndpointProto.Endpoint build() {
        com.akash.base.v1beta1.EndpointProto.Endpoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.akash.base.v1beta1.EndpointProto.Endpoint buildPartial() {
        com.akash.base.v1beta1.EndpointProto.Endpoint result = new com.akash.base.v1beta1.EndpointProto.Endpoint(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.akash.base.v1beta1.EndpointProto.Endpoint result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.kind_ = kind_;
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
        if (other instanceof com.akash.base.v1beta1.EndpointProto.Endpoint) {
          return mergeFrom((com.akash.base.v1beta1.EndpointProto.Endpoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akash.base.v1beta1.EndpointProto.Endpoint other) {
        if (other == com.akash.base.v1beta1.EndpointProto.Endpoint.getDefaultInstance()) return this;
        if (other.kind_ != 0) {
          setKindValue(other.getKindValue());
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
              case 8: {
                kind_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

      private int kind_ = 0;
      /**
       * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
       * @return The enum numeric value on the wire for kind.
       */
      @java.lang.Override public int getKindValue() {
        return kind_;
      }
      /**
       * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
       * @param value The enum numeric value on the wire for kind to set.
       * @return This builder for chaining.
       */
      public Builder setKindValue(int value) {
        kind_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
       * @return The kind.
       */
      @java.lang.Override
      public com.akash.base.v1beta1.EndpointProto.Endpoint.Kind getKind() {
        com.akash.base.v1beta1.EndpointProto.Endpoint.Kind result = com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.forNumber(kind_);
        return result == null ? com.akash.base.v1beta1.EndpointProto.Endpoint.Kind.UNRECOGNIZED : result;
      }
      /**
       * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
       * @param value The kind to set.
       * @return This builder for chaining.
       */
      public Builder setKind(com.akash.base.v1beta1.EndpointProto.Endpoint.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.akash.base.v1beta1.Endpoint.Kind kind = 1 [json_name = "kind"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = 0;
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


      // @@protoc_insertion_point(builder_scope:akash.base.v1beta1.Endpoint)
    }

    // @@protoc_insertion_point(class_scope:akash.base.v1beta1.Endpoint)
    private static final com.akash.base.v1beta1.EndpointProto.Endpoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akash.base.v1beta1.EndpointProto.Endpoint();
    }

    public static com.akash.base.v1beta1.EndpointProto.Endpoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Endpoint>
        PARSER = new com.google.protobuf.AbstractParser<Endpoint>() {
      @java.lang.Override
      public Endpoint parsePartialFrom(
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

    public static com.google.protobuf.Parser<Endpoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Endpoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.akash.base.v1beta1.EndpointProto.Endpoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_base_v1beta1_Endpoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_base_v1beta1_Endpoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!akash/base/v1beta1/endpoint.proto\022\022aka" +
      "sh.base.v1beta1\032\024gogoproto/gogo.proto\"q\n" +
      "\010Endpoint\0225\n\004kind\030\001 \001(\0162!.akash.base.v1b" +
      "eta1.Endpoint.KindR\004kind\"(\n\004Kind\022\017\n\013SHAR" +
      "ED_HTTP\020\000\022\017\n\013RANDOM_PORT\020\001:\004\350\240\037\001B\311\001\n\026com" +
      ".akash.base.v1beta1B\rEndpointProtoZ8gith" +
      "ub.com/akash-network/akash-api/go/node/t" +
      "ypes/v1beta1\242\002\003ABX\252\002\022Akash.Base.V1beta1\312" +
      "\002\022Akash\\Base\\V1beta1\342\002\036Akash\\Base\\V1beta" +
      "1\\GPBMetadata\352\002\024Akash::Base::V1beta1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_akash_base_v1beta1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_base_v1beta1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_base_v1beta1_Endpoint_descriptor,
        new java.lang.String[] { "Kind", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
