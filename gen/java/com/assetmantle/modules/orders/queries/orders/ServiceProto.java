// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/orders/queries/orders/service.proto

package com.assetmantle.modules.orders.queries.orders;

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
      "\n/assetmantle/orders/queries/orders/serv" +
      "ice.proto\022)assetmantle.modules.orders.qu" +
      "eries.orders\032\034google/api/annotations.pro" +
      "to\0325assetmantle/orders/queries/orders/qu" +
      "ery_request.proto\0326assetmantle/orders/qu" +
      "eries/orders/query_response.proto2\256\001\n\007Se" +
      "rvice\022\242\001\n\006Handle\0227.assetmantle.modules.o" +
      "rders.queries.orders.QueryRequest\0328.asse" +
      "tmantle.modules.orders.queries.orders.Qu" +
      "eryResponse\"%\202\323\344\223\002\037\022\035/mantle/orders/v1be" +
      "ta1/ordersB\205\002\n-com.assetmantle.modules.o" +
      "rders.queries.ordersB\014ServiceProto\242\002\005AMO" +
      "QO\252\002)Assetmantle.Modules.Orders.Queries." +
      "Orders\312\002)Assetmantle\\Modules\\Orders\\Quer" +
      "ies\\Orders\342\0025Assetmantle\\Modules\\Orders\\" +
      "Queries\\Orders\\GPBMetadata\352\002-Assetmantle" +
      "::Modules::Orders::Queries::Ordersb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.orders.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.orders.queries.orders.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.orders.queries.orders.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.orders.queries.orders.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
