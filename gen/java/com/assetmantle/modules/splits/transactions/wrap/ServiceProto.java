// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/splits/transactions/wrap/service.proto

package com.assetmantle.modules.splits.transactions.wrap;

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
      "\n2assetmantle/splits/transactions/wrap/s" +
      "ervice.proto\022,assetmantle.modules.splits" +
      ".transactions.wrap\032\034google/api/annotatio" +
      "ns.proto\0322assetmantle/splits/transaction" +
      "s/wrap/message.proto\032?assetmantle/splits" +
      "/transactions/wrap/transaction_response." +
      "proto2\253\001\n\007Service\022\237\001\n\006Handle\0225.assetmant" +
      "le.modules.splits.transactions.wrap.Mess" +
      "age\032A.assetmantle.modules.splits.transac" +
      "tions.wrap.TransactionResponse\"\033\202\323\344\223\002\025\"\023" +
      "/mantle/splits/wrapB\224\002\n0com.assetmantle." +
      "modules.splits.transactions.wrapB\014Servic" +
      "eProto\242\002\005AMSTW\252\002,Assetmantle.Modules.Spl" +
      "its.Transactions.Wrap\312\002,Assetmantle\\Modu" +
      "les\\Splits\\Transactions\\Wrap\342\0028Assetmant" +
      "le\\Modules\\Splits\\Transactions\\Wrap\\GPBM" +
      "etadata\352\0020Assetmantle::Modules::Splits::" +
      "Transactions::Wrapb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.splits.transactions.wrap.MessageProto.getDescriptor(),
          com.assetmantle.modules.splits.transactions.wrap.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.splits.transactions.wrap.MessageProto.getDescriptor();
    com.assetmantle.modules.splits.transactions.wrap.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
