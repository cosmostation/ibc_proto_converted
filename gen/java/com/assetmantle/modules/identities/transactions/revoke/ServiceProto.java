// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/revoke/service.proto

package com.assetmantle.modules.identities.transactions.revoke;

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
      "\n8assetmantle/identities/transactions/re" +
      "voke/service.proto\0222assetmantle.modules." +
      "identities.transactions.revoke\032\034google/a" +
      "pi/annotations.proto\0328assetmantle/identi" +
      "ties/transactions/revoke/message.proto\032E" +
      "assetmantle/identities/transactions/revo" +
      "ke/transaction_response.proto2\275\001\n\007Servic" +
      "e\022\261\001\n\006Handle\022;.assetmantle.modules.ident" +
      "ities.transactions.revoke.Message\032G.asse" +
      "tmantle.modules.identities.transactions." +
      "revoke.TransactionResponse\"!\202\323\344\223\002\033\"\031/man" +
      "tle/identities/revokeB\262\002\n6com.assetmantl" +
      "e.modules.identities.transactions.revoke" +
      "B\014ServiceProto\242\002\005AMITR\252\0022Assetmantle.Mod" +
      "ules.Identities.Transactions.Revoke\312\0022As" +
      "setmantle\\Modules\\Identities\\Transaction" +
      "s\\Revoke\342\002>Assetmantle\\Modules\\Identitie" +
      "s\\Transactions\\Revoke\\GPBMetadata\352\0026Asse" +
      "tmantle::Modules::Identities::Transactio" +
      "ns::Revokeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.revoke.MessageProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.revoke.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.revoke.MessageProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.revoke.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
