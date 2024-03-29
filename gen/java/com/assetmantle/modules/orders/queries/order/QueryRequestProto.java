// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/orders/queries/order/query_request.proto

package com.assetmantle.modules.orders.queries.order;

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
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.orders.queries.order.QueryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     * @return Whether the orderID field is set.
     */
    boolean hasOrderID();
    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     * @return The orderID.
     */
    com.assetmantle.schema.ids.base.OrderIdProto.OrderID getOrderID();
    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     */
    com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder getOrderIDOrBuilder();
  }
  /**
   * Protobuf type {@code assetmantle.modules.orders.queries.order.QueryRequest}
   */
  public static final class QueryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.orders.queries.order.QueryRequest)
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
      return com.assetmantle.modules.orders.queries.order.QueryRequestProto.internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.orders.queries.order.QueryRequestProto.internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.class, com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.Builder.class);
    }

    public static final int ORDER_I_D_FIELD_NUMBER = 1;
    private com.assetmantle.schema.ids.base.OrderIdProto.OrderID orderID_;
    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     * @return Whether the orderID field is set.
     */
    @java.lang.Override
    public boolean hasOrderID() {
      return orderID_ != null;
    }
    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     * @return The orderID.
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.OrderIdProto.OrderID getOrderID() {
      return orderID_ == null ? com.assetmantle.schema.ids.base.OrderIdProto.OrderID.getDefaultInstance() : orderID_;
    }
    /**
     * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
     */
    @java.lang.Override
    public com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder getOrderIDOrBuilder() {
      return orderID_ == null ? com.assetmantle.schema.ids.base.OrderIdProto.OrderID.getDefaultInstance() : orderID_;
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
      if (orderID_ != null) {
        output.writeMessage(1, getOrderID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (orderID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getOrderID());
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
      if (!(obj instanceof com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest other = (com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest) obj;

      if (hasOrderID() != other.hasOrderID()) return false;
      if (hasOrderID()) {
        if (!getOrderID()
            .equals(other.getOrderID())) return false;
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
      if (hasOrderID()) {
        hash = (37 * hash) + ORDER_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getOrderID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest prototype) {
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
     * Protobuf type {@code assetmantle.modules.orders.queries.order.QueryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.orders.queries.order.QueryRequest)
        com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.orders.queries.order.QueryRequestProto.internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.orders.queries.order.QueryRequestProto.internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.class, com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.Builder.class);
      }

      // Construct using com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.newBuilder()
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
        orderID_ = null;
        if (orderIDBuilder_ != null) {
          orderIDBuilder_.dispose();
          orderIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.orders.queries.order.QueryRequestProto.internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest getDefaultInstanceForType() {
        return com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest build() {
        com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest buildPartial() {
        com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest result = new com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.orderID_ = orderIDBuilder_ == null
              ? orderID_
              : orderIDBuilder_.build();
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
        if (other instanceof com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest) {
          return mergeFrom((com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest other) {
        if (other == com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest.getDefaultInstance()) return this;
        if (other.hasOrderID()) {
          mergeOrderID(other.getOrderID());
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
                    getOrderIDFieldBuilder().getBuilder(),
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

      private com.assetmantle.schema.ids.base.OrderIdProto.OrderID orderID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.OrderIdProto.OrderID, com.assetmantle.schema.ids.base.OrderIdProto.OrderID.Builder, com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder> orderIDBuilder_;
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       * @return Whether the orderID field is set.
       */
      public boolean hasOrderID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       * @return The orderID.
       */
      public com.assetmantle.schema.ids.base.OrderIdProto.OrderID getOrderID() {
        if (orderIDBuilder_ == null) {
          return orderID_ == null ? com.assetmantle.schema.ids.base.OrderIdProto.OrderID.getDefaultInstance() : orderID_;
        } else {
          return orderIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public Builder setOrderID(com.assetmantle.schema.ids.base.OrderIdProto.OrderID value) {
        if (orderIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          orderID_ = value;
        } else {
          orderIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public Builder setOrderID(
          com.assetmantle.schema.ids.base.OrderIdProto.OrderID.Builder builderForValue) {
        if (orderIDBuilder_ == null) {
          orderID_ = builderForValue.build();
        } else {
          orderIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public Builder mergeOrderID(com.assetmantle.schema.ids.base.OrderIdProto.OrderID value) {
        if (orderIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            orderID_ != null &&
            orderID_ != com.assetmantle.schema.ids.base.OrderIdProto.OrderID.getDefaultInstance()) {
            getOrderIDBuilder().mergeFrom(value);
          } else {
            orderID_ = value;
          }
        } else {
          orderIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public Builder clearOrderID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        orderID_ = null;
        if (orderIDBuilder_ != null) {
          orderIDBuilder_.dispose();
          orderIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public com.assetmantle.schema.ids.base.OrderIdProto.OrderID.Builder getOrderIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getOrderIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      public com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder getOrderIDOrBuilder() {
        if (orderIDBuilder_ != null) {
          return orderIDBuilder_.getMessageOrBuilder();
        } else {
          return orderID_ == null ?
              com.assetmantle.schema.ids.base.OrderIdProto.OrderID.getDefaultInstance() : orderID_;
        }
      }
      /**
       * <code>.assetmantle.schema.ids.base.OrderID order_i_d = 1 [json_name = "orderID"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.assetmantle.schema.ids.base.OrderIdProto.OrderID, com.assetmantle.schema.ids.base.OrderIdProto.OrderID.Builder, com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder> 
          getOrderIDFieldBuilder() {
        if (orderIDBuilder_ == null) {
          orderIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.assetmantle.schema.ids.base.OrderIdProto.OrderID, com.assetmantle.schema.ids.base.OrderIdProto.OrderID.Builder, com.assetmantle.schema.ids.base.OrderIdProto.OrderIDOrBuilder>(
                  getOrderID(),
                  getParentForChildren(),
                  isClean());
          orderID_ = null;
        }
        return orderIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.orders.queries.order.QueryRequest)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.orders.queries.order.QueryRequest)
    private static final com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest();
    }

    public static com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest getDefaultInstance() {
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
    public com.assetmantle.modules.orders.queries.order.QueryRequestProto.QueryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4assetmantle/orders/queries/order/query" +
      "_request.proto\022(assetmantle.modules.orde" +
      "rs.queries.order\032#assetmantle/ids/base/o" +
      "rder_id.proto\"P\n\014QueryRequest\022@\n\torder_i" +
      "_d\030\001 \001(\0132$.assetmantle.schema.ids.base.O" +
      "rderIDR\007orderIDB\205\002\n,com.assetmantle.modu" +
      "les.orders.queries.orderB\021QueryRequestPr" +
      "oto\242\002\005AMOQO\252\002(Assetmantle.Modules.Orders" +
      ".Queries.Order\312\002(Assetmantle\\Modules\\Ord" +
      "ers\\Queries\\Order\342\0024Assetmantle\\Modules\\" +
      "Orders\\Queries\\Order\\GPBMetadata\352\002,Asset" +
      "mantle::Modules::Orders::Queries::Orderb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor,
        new java.lang.String[] { "OrderID", });
    com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
