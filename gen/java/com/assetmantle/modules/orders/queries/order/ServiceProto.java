// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/orders/queries/order/service.proto

package com.assetmantle.modules.orders.queries.order;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.assetmantle/orders/queries/order/servi" +
      "ce.proto\022(assetmantle.modules.orders.que" +
      "ries.order\032\034google/api/annotations.proto" +
      "\0324assetmantle/orders/queries/order/query" +
      "_request.proto\0325assetmantle/orders/queri" +
      "es/order/query_response.proto2\253\001\n\007Servic" +
      "e\022\237\001\n\006Handle\0226.assetmantle.modules.order" +
      "s.queries.order.QueryRequest\0327.assetmant" +
      "le.modules.orders.queries.order.QueryRes" +
      "ponse\"$\202\323\344\223\002\036\022\034/mantle/orders/v1beta1/or" +
      "derB\200\002\n,com.assetmantle.modules.orders.q" +
      "ueries.orderB\014ServiceProto\242\002\005AMOQO\252\002(Ass" +
      "etmantle.Modules.Orders.Queries.Order\312\002(" +
      "Assetmantle\\Modules\\Orders\\Queries\\Order" +
      "\342\0024Assetmantle\\Modules\\Orders\\Queries\\Or" +
      "der\\GPBMetadata\352\002,Assetmantle::Modules::" +
      "Orders::Queries::Orderb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.order.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.order.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.orders.queries.order.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.orders.queries.order.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
