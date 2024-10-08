// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/downtimedetector/v1beta1/downtime_duration.proto

package com.osmosis.downtimedetector.v1beta1;

public final class DowntimeDurationProto {
  private DowntimeDurationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code osmosis.downtimedetector.v1beta1.Downtime}
   */
  public enum Downtime
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DURATION_30S = 0;</code>
     */
    DURATION_30S(0),
    /**
     * <code>DURATION_1M = 1;</code>
     */
    DURATION_1M(1),
    /**
     * <code>DURATION_2M = 2;</code>
     */
    DURATION_2M(2),
    /**
     * <code>DURATION_3M = 3;</code>
     */
    DURATION_3M(3),
    /**
     * <code>DURATION_4M = 4;</code>
     */
    DURATION_4M(4),
    /**
     * <code>DURATION_5M = 5;</code>
     */
    DURATION_5M(5),
    /**
     * <code>DURATION_10M = 6;</code>
     */
    DURATION_10M(6),
    /**
     * <code>DURATION_20M = 7;</code>
     */
    DURATION_20M(7),
    /**
     * <code>DURATION_30M = 8;</code>
     */
    DURATION_30M(8),
    /**
     * <code>DURATION_40M = 9;</code>
     */
    DURATION_40M(9),
    /**
     * <code>DURATION_50M = 10;</code>
     */
    DURATION_50M(10),
    /**
     * <code>DURATION_1H = 11;</code>
     */
    DURATION_1H(11),
    /**
     * <code>DURATION_1_5H = 12;</code>
     */
    DURATION_1_5H(12),
    /**
     * <code>DURATION_2H = 13;</code>
     */
    DURATION_2H(13),
    /**
     * <code>DURATION_2_5H = 14;</code>
     */
    DURATION_2_5H(14),
    /**
     * <code>DURATION_3H = 15;</code>
     */
    DURATION_3H(15),
    /**
     * <code>DURATION_4H = 16;</code>
     */
    DURATION_4H(16),
    /**
     * <code>DURATION_5H = 17;</code>
     */
    DURATION_5H(17),
    /**
     * <code>DURATION_6H = 18;</code>
     */
    DURATION_6H(18),
    /**
     * <code>DURATION_9H = 19;</code>
     */
    DURATION_9H(19),
    /**
     * <code>DURATION_12H = 20;</code>
     */
    DURATION_12H(20),
    /**
     * <code>DURATION_18H = 21;</code>
     */
    DURATION_18H(21),
    /**
     * <code>DURATION_24H = 22;</code>
     */
    DURATION_24H(22),
    /**
     * <code>DURATION_36H = 23;</code>
     */
    DURATION_36H(23),
    /**
     * <code>DURATION_48H = 24;</code>
     */
    DURATION_48H(24),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DURATION_30S = 0;</code>
     */
    public static final int DURATION_30S_VALUE = 0;
    /**
     * <code>DURATION_1M = 1;</code>
     */
    public static final int DURATION_1M_VALUE = 1;
    /**
     * <code>DURATION_2M = 2;</code>
     */
    public static final int DURATION_2M_VALUE = 2;
    /**
     * <code>DURATION_3M = 3;</code>
     */
    public static final int DURATION_3M_VALUE = 3;
    /**
     * <code>DURATION_4M = 4;</code>
     */
    public static final int DURATION_4M_VALUE = 4;
    /**
     * <code>DURATION_5M = 5;</code>
     */
    public static final int DURATION_5M_VALUE = 5;
    /**
     * <code>DURATION_10M = 6;</code>
     */
    public static final int DURATION_10M_VALUE = 6;
    /**
     * <code>DURATION_20M = 7;</code>
     */
    public static final int DURATION_20M_VALUE = 7;
    /**
     * <code>DURATION_30M = 8;</code>
     */
    public static final int DURATION_30M_VALUE = 8;
    /**
     * <code>DURATION_40M = 9;</code>
     */
    public static final int DURATION_40M_VALUE = 9;
    /**
     * <code>DURATION_50M = 10;</code>
     */
    public static final int DURATION_50M_VALUE = 10;
    /**
     * <code>DURATION_1H = 11;</code>
     */
    public static final int DURATION_1H_VALUE = 11;
    /**
     * <code>DURATION_1_5H = 12;</code>
     */
    public static final int DURATION_1_5H_VALUE = 12;
    /**
     * <code>DURATION_2H = 13;</code>
     */
    public static final int DURATION_2H_VALUE = 13;
    /**
     * <code>DURATION_2_5H = 14;</code>
     */
    public static final int DURATION_2_5H_VALUE = 14;
    /**
     * <code>DURATION_3H = 15;</code>
     */
    public static final int DURATION_3H_VALUE = 15;
    /**
     * <code>DURATION_4H = 16;</code>
     */
    public static final int DURATION_4H_VALUE = 16;
    /**
     * <code>DURATION_5H = 17;</code>
     */
    public static final int DURATION_5H_VALUE = 17;
    /**
     * <code>DURATION_6H = 18;</code>
     */
    public static final int DURATION_6H_VALUE = 18;
    /**
     * <code>DURATION_9H = 19;</code>
     */
    public static final int DURATION_9H_VALUE = 19;
    /**
     * <code>DURATION_12H = 20;</code>
     */
    public static final int DURATION_12H_VALUE = 20;
    /**
     * <code>DURATION_18H = 21;</code>
     */
    public static final int DURATION_18H_VALUE = 21;
    /**
     * <code>DURATION_24H = 22;</code>
     */
    public static final int DURATION_24H_VALUE = 22;
    /**
     * <code>DURATION_36H = 23;</code>
     */
    public static final int DURATION_36H_VALUE = 23;
    /**
     * <code>DURATION_48H = 24;</code>
     */
    public static final int DURATION_48H_VALUE = 24;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Downtime valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Downtime forNumber(int value) {
      switch (value) {
        case 0: return DURATION_30S;
        case 1: return DURATION_1M;
        case 2: return DURATION_2M;
        case 3: return DURATION_3M;
        case 4: return DURATION_4M;
        case 5: return DURATION_5M;
        case 6: return DURATION_10M;
        case 7: return DURATION_20M;
        case 8: return DURATION_30M;
        case 9: return DURATION_40M;
        case 10: return DURATION_50M;
        case 11: return DURATION_1H;
        case 12: return DURATION_1_5H;
        case 13: return DURATION_2H;
        case 14: return DURATION_2_5H;
        case 15: return DURATION_3H;
        case 16: return DURATION_4H;
        case 17: return DURATION_5H;
        case 18: return DURATION_6H;
        case 19: return DURATION_9H;
        case 20: return DURATION_12H;
        case 21: return DURATION_18H;
        case 22: return DURATION_24H;
        case 23: return DURATION_36H;
        case 24: return DURATION_48H;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Downtime>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Downtime> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Downtime>() {
            public Downtime findValueByNumber(int number) {
              return Downtime.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.osmosis.downtimedetector.v1beta1.DowntimeDurationProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Downtime[] VALUES = values();

    public static Downtime valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Downtime(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:osmosis.downtimedetector.v1beta1.Downtime)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8osmosis/downtimedetector/v1beta1/downt" +
      "ime_duration.proto\022 osmosis.downtimedete" +
      "ctor.v1beta1*\302\003\n\010Downtime\022\020\n\014DURATION_30" +
      "S\020\000\022\017\n\013DURATION_1M\020\001\022\017\n\013DURATION_2M\020\002\022\017\n" +
      "\013DURATION_3M\020\003\022\017\n\013DURATION_4M\020\004\022\017\n\013DURAT" +
      "ION_5M\020\005\022\020\n\014DURATION_10M\020\006\022\020\n\014DURATION_2" +
      "0M\020\007\022\020\n\014DURATION_30M\020\010\022\020\n\014DURATION_40M\020\t" +
      "\022\020\n\014DURATION_50M\020\n\022\017\n\013DURATION_1H\020\013\022\021\n\rD" +
      "URATION_1_5H\020\014\022\017\n\013DURATION_2H\020\r\022\021\n\rDURAT" +
      "ION_2_5H\020\016\022\017\n\013DURATION_3H\020\017\022\017\n\013DURATION_" +
      "4H\020\020\022\017\n\013DURATION_5H\020\021\022\017\n\013DURATION_6H\020\022\022\017" +
      "\n\013DURATION_9H\020\023\022\020\n\014DURATION_12H\020\024\022\020\n\014DUR" +
      "ATION_18H\020\025\022\020\n\014DURATION_24H\020\026\022\020\n\014DURATIO" +
      "N_36H\020\027\022\020\n\014DURATION_48H\020\030B\234\002\n$com.osmosi" +
      "s.downtimedetector.v1beta1B\025DowntimeDura" +
      "tionProtoZ=github.com/osmosis-labs/osmos" +
      "is/v26/x/downtime-detector/types\242\002\003ODX\252\002" +
      " Osmosis.Downtimedetector.V1beta1\312\002 Osmo" +
      "sis\\Downtimedetector\\V1beta1\342\002,Osmosis\\D" +
      "owntimedetector\\V1beta1\\GPBMetadata\352\002\"Os" +
      "mosis::Downtimedetector::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
