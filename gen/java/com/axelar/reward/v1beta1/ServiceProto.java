// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/reward/v1beta1/service.proto

package com.axelar.reward.v1beta1;

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
      "\n#axelar/reward/v1beta1/service.proto\022\025a" +
      "xelar.reward.v1beta1\032\024gogoproto/gogo.pro" +
      "to\032\034google/api/annotations.proto\032\036axelar" +
      "/reward/v1beta1/tx.proto\032!axelar/reward/" +
      "v1beta1/query.proto2\227\001\n\nMsgService\022\210\001\n\tR" +
      "efundMsg\022\'.axelar.reward.v1beta1.RefundM" +
      "sgRequest\032(.axelar.reward.v1beta1.Refund" +
      "MsgResponse\"(\202\323\344\223\002\"\"\035/axelar/reward/refu" +
      "nd_message:\001*2\250\002\n\014QueryService\022\231\001\n\rInfla" +
      "tionRate\022+.axelar.reward.v1beta1.Inflati" +
      "onRateRequest\032,.axelar.reward.v1beta1.In" +
      "flationRateResponse\"-\202\323\344\223\002\'\022%/axelar/rew" +
      "ard/v1beta1/inflation_rate\022|\n\006Params\022$.a" +
      "xelar.reward.v1beta1.ParamsRequest\032%.axe" +
      "lar.reward.v1beta1.ParamsResponse\"%\202\323\344\223\002" +
      "\037\022\035/axelar/reward/v1beta1/paramsB\326\001\n\031com" +
      ".axelar.reward.v1beta1B\014ServiceProtoZ3gi" +
      "thub.com/axelarnetwork/axelar-core/x/rew" +
      "ard/types\242\002\003ARX\252\002\025Axelar.Reward.V1beta1\312" +
      "\002\025Axelar\\Reward\\V1beta1\342\002!Axelar\\Reward\\" +
      "V1beta1\\GPBMetadata\352\002\027Axelar::Reward::V1" +
      "beta1\300\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.axelar.reward.v1beta1.TxProto.getDescriptor(),
          com.axelar.reward.v1beta1.QueryProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoRegistration);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.axelar.reward.v1beta1.TxProto.getDescriptor();
    com.axelar.reward.v1beta1.QueryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
