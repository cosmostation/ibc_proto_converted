// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/metas/queries/meta/service.proto

package com.assetmantle.modules.metas.queries.meta;

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
      "\n,assetmantle/metas/queries/meta/service" +
      ".proto\022&assetmantle.modules.metas.querie" +
      "s.meta\032\034google/api/annotations.proto\0322as" +
      "setmantle/metas/queries/meta/query_reque" +
      "st.proto\0323assetmantle/metas/queries/meta" +
      "/query_response.proto2\245\001\n\007Service\022\231\001\n\006Ha" +
      "ndle\0224.assetmantle.modules.metas.queries" +
      ".meta.QueryRequest\0325.assetmantle.modules" +
      ".metas.queries.meta.QueryResponse\"\"\202\323\344\223\002" +
      "\034\022\032/mantle/metas/v1beta1/metaB\366\001\n*com.as" +
      "setmantle.modules.metas.queries.metaB\014Se" +
      "rviceProto\242\002\005AMMQM\252\002&Assetmantle.Modules" +
      ".Metas.Queries.Meta\312\002&Assetmantle\\Module" +
      "s\\Metas\\Queries\\Meta\342\0022Assetmantle\\Modul" +
      "es\\Metas\\Queries\\Meta\\GPBMetadata\352\002*Asse" +
      "tmantle::Modules::Metas::Queries::Metab\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.metas.queries.meta.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.metas.queries.meta.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.metas.queries.meta.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.metas.queries.meta.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
