// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/assets/queries/asset/service.proto

package com.assetmantle.modules.assets.queries.asset;

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
      "\n.assetmantle/assets/queries/asset/servi" +
      "ce.proto\022(assetmantle.modules.assets.que" +
      "ries.asset\032\034google/api/annotations.proto" +
      "\0324assetmantle/assets/queries/asset/query" +
      "_request.proto\0325assetmantle/assets/queri" +
      "es/asset/query_response.proto2\253\001\n\007Servic" +
      "e\022\237\001\n\006Handle\0226.assetmantle.modules.asset" +
      "s.queries.asset.QueryRequest\0327.assetmant" +
      "le.modules.assets.queries.asset.QueryRes" +
      "ponse\"$\202\323\344\223\002\036\022\034/mantle/assets/v1beta1/as" +
      "setB\200\002\n,com.assetmantle.modules.assets.q" +
      "ueries.assetB\014ServiceProto\242\002\005AMAQA\252\002(Ass" +
      "etmantle.Modules.Assets.Queries.Asset\312\002(" +
      "Assetmantle\\Modules\\Assets\\Queries\\Asset" +
      "\342\0024Assetmantle\\Modules\\Assets\\Queries\\As" +
      "set\\GPBMetadata\352\002,Assetmantle::Modules::" +
      "Assets::Queries::Assetb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.assets.queries.asset.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.assets.queries.asset.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.assets.queries.asset.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.assets.queries.asset.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
