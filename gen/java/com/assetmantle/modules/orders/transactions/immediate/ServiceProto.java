// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/orders/transactions/immediate/service.proto

package com.assetmantle.modules.orders.transactions.immediate;

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
      "\n7assetmantle/orders/transactions/immedi" +
      "ate/service.proto\0221assetmantle.modules.o" +
      "rders.transactions.immediate\032\034google/api" +
      "/annotations.proto\0327assetmantle/orders/t" +
      "ransactions/immediate/message.proto\032Dass" +
      "etmantle/orders/transactions/immediate/t" +
      "ransaction_response.proto2\272\001\n\007Service\022\256\001" +
      "\n\006Handle\022:.assetmantle.modules.orders.tr" +
      "ansactions.immediate.Message\032F.assetmant" +
      "le.modules.orders.transactions.immediate" +
      ".TransactionResponse\" \202\323\344\223\002\032\"\030/mantle/or" +
      "ders/immediateB\255\002\n5com.assetmantle.modul" +
      "es.orders.transactions.immediateB\014Servic" +
      "eProto\242\002\005AMOTI\252\0021Assetmantle.Modules.Ord" +
      "ers.Transactions.Immediate\312\0021Assetmantle" +
      "\\Modules\\Orders\\Transactions\\Immediate\342\002" +
      "=Assetmantle\\Modules\\Orders\\Transactions" +
      "\\Immediate\\GPBMetadata\352\0025Assetmantle::Mo" +
      "dules::Orders::Transactions::Immediateb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.orders.transactions.immediate.MessageProto.getDescriptor(),
          com.assetmantle.modules.orders.transactions.immediate.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.orders.transactions.immediate.MessageProto.getDescriptor();
    com.assetmantle.modules.orders.transactions.immediate.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
