// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/unprovision/service.proto

package com.assetmantle.modules.identities.transactions.unprovision;

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
      "\n=assetmantle/identities/transactions/un" +
      "provision/service.proto\0227assetmantle.mod" +
      "ules.identities.transactions.unprovision" +
      "\032\034google/api/annotations.proto\032=assetman" +
      "tle/identities/transactions/unprovision/" +
      "message.proto\032Jassetmantle/identities/tr" +
      "ansactions/unprovision/transaction_respo" +
      "nse.proto2\314\001\n\007Service\022\300\001\n\006Handle\022@.asset" +
      "mantle.modules.identities.transactions.u" +
      "nprovision.Message\032L.assetmantle.modules" +
      ".identities.transactions.unprovision.Tra" +
      "nsactionResponse\"&\202\323\344\223\002 \"\036/mantle/identi" +
      "ties/unprovisionB\313\002\n;com.assetmantle.mod" +
      "ules.identities.transactions.unprovision" +
      "B\014ServiceProto\242\002\005AMITU\252\0027Assetmantle.Mod" +
      "ules.Identities.Transactions.Unprovision" +
      "\312\0027Assetmantle\\Modules\\Identities\\Transa" +
      "ctions\\Unprovision\342\002CAssetmantle\\Modules" +
      "\\Identities\\Transactions\\Unprovision\\GPB" +
      "Metadata\352\002;Assetmantle::Modules::Identit" +
      "ies::Transactions::Unprovisionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.unprovision.MessageProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.unprovision.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.unprovision.MessageProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.unprovision.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}