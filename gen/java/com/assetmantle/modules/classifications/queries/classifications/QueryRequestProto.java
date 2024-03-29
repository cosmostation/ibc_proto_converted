// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/classifications/queries/classifications/query_request.proto

package com.assetmantle.modules.classifications.queries.classifications;

public final class QueryRequestProto {
  private QueryRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.classifications.queries.classifications.QueryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return Whether the pageRequest field is set.
     */
    boolean hasPageRequest();
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return The pageRequest.
     */
    com.cosmos.base.query.v1beta1.PaginationProto.PageRequest getPageRequest();
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder getPageRequestOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.classifications.queries.classifications.QueryRequest}
   */
  public static final class QueryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.classifications.queries.classifications.QueryRequest)
      QueryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryRequest.newBuilder() to construct.
    private QueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.class, com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.Builder.class);
    }

    public static final int PAGE_REQUEST_FIELD_NUMBER = 1;
    private com.cosmos.base.query.v1beta1.PaginationProto.PageRequest pageRequest_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return Whether the pageRequest field is set.
     */
    @java.lang.Override
    public boolean hasPageRequest() {
      return pageRequest_ != null;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return The pageRequest.
     */
    @java.lang.Override
    public com.cosmos.base.query.v1beta1.PaginationProto.PageRequest getPageRequest() {
      return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.getDefaultInstance() : pageRequest_;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    @java.lang.Override
    public com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder getPageRequestOrBuilder() {
      return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.getDefaultInstance() : pageRequest_;
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
      if (pageRequest_ != null) {
        output.writeMessage(1, getPageRequest());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pageRequest_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPageRequest());
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
      if (!(obj instanceof com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest other = (com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest) obj;

      if (hasPageRequest() != other.hasPageRequest()) return false;
      if (hasPageRequest()) {
        if (!getPageRequest()
            .equals(other.getPageRequest())) return false;
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
      if (hasPageRequest()) {
        hash = (37 * hash) + PAGE_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getPageRequest().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest prototype) {
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
     * Protobuf type {@code assetmantle.modules.classifications.queries.classifications.QueryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.classifications.queries.classifications.QueryRequest)
        com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.class, com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.Builder.class);
      }

      // Construct using com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.newBuilder()
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
        pageRequest_ = null;
        if (pageRequestBuilder_ != null) {
          pageRequestBuilder_.dispose();
          pageRequestBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest getDefaultInstanceForType() {
        return com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest build() {
        com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest buildPartial() {
        com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest result = new com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pageRequest_ = pageRequestBuilder_ == null
              ? pageRequest_
              : pageRequestBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest) {
          return mergeFrom((com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest other) {
        if (other == com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest.getDefaultInstance()) return this;
        if (other.hasPageRequest()) {
          mergePageRequest(other.getPageRequest());
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
                    getPageRequestFieldBuilder().getBuilder(),
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

      private com.cosmos.base.query.v1beta1.PaginationProto.PageRequest pageRequest_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.query.v1beta1.PaginationProto.PageRequest, com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.Builder, com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder> pageRequestBuilder_;
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       * @return Whether the pageRequest field is set.
       */
      public boolean hasPageRequest() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       * @return The pageRequest.
       */
      public com.cosmos.base.query.v1beta1.PaginationProto.PageRequest getPageRequest() {
        if (pageRequestBuilder_ == null) {
          return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.getDefaultInstance() : pageRequest_;
        } else {
          return pageRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public Builder setPageRequest(com.cosmos.base.query.v1beta1.PaginationProto.PageRequest value) {
        if (pageRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pageRequest_ = value;
        } else {
          pageRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public Builder setPageRequest(
          com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.Builder builderForValue) {
        if (pageRequestBuilder_ == null) {
          pageRequest_ = builderForValue.build();
        } else {
          pageRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public Builder mergePageRequest(com.cosmos.base.query.v1beta1.PaginationProto.PageRequest value) {
        if (pageRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            pageRequest_ != null &&
            pageRequest_ != com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.getDefaultInstance()) {
            getPageRequestBuilder().mergeFrom(value);
          } else {
            pageRequest_ = value;
          }
        } else {
          pageRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public Builder clearPageRequest() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pageRequest_ = null;
        if (pageRequestBuilder_ != null) {
          pageRequestBuilder_.dispose();
          pageRequestBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.Builder getPageRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPageRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      public com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder getPageRequestOrBuilder() {
        if (pageRequestBuilder_ != null) {
          return pageRequestBuilder_.getMessageOrBuilder();
        } else {
          return pageRequest_ == null ?
              com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.getDefaultInstance() : pageRequest_;
        }
      }
      /**
       * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.query.v1beta1.PaginationProto.PageRequest, com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.Builder, com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder> 
          getPageRequestFieldBuilder() {
        if (pageRequestBuilder_ == null) {
          pageRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.cosmos.base.query.v1beta1.PaginationProto.PageRequest, com.cosmos.base.query.v1beta1.PaginationProto.PageRequest.Builder, com.cosmos.base.query.v1beta1.PaginationProto.PageRequestOrBuilder>(
                  getPageRequest(),
                  getParentForChildren(),
                  isClean());
          pageRequest_ = null;
        }
        return pageRequestBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.classifications.queries.classifications.QueryRequest)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.classifications.queries.classifications.QueryRequest)
    private static final com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest();
    }

    public static com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryRequest>
        PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
      @java.lang.Override
      public QueryRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.classifications.queries.classifications.QueryRequestProto.QueryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGassetmantle/classifications/queries/cl" +
      "assifications/query_request.proto\022;asset" +
      "mantle.modules.classifications.queries.c" +
      "lassifications\032*cosmos/base/query/v1beta" +
      "1/pagination.proto\"Y\n\014QueryRequest\022I\n\014pa" +
      "ge_request\030\001 \001(\0132&.cosmos.base.query.v1b" +
      "eta1.PageRequestR\013pageRequestB\344\002\n?com.as" +
      "setmantle.modules.classifications.querie" +
      "s.classificationsB\021QueryRequestProto\242\002\005A" +
      "MCQC\252\002;Assetmantle.Modules.Classificatio" +
      "ns.Queries.Classifications\312\002;Assetmantle" +
      "\\Modules\\Classifications\\Queries\\Classif" +
      "ications\342\002GAssetmantle\\Modules\\Classific" +
      "ations\\Queries\\Classifications\\GPBMetada" +
      "ta\352\002?Assetmantle::Modules::Classificatio" +
      "ns::Queries::Classificationsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_classifications_queries_classifications_QueryRequest_descriptor,
        new java.lang.String[] { "PageRequest", });
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
