// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zrchain/validation/asset_data.proto

package com.zrchain.validation;

public final class AssetDataProto {
  private AssetDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Asset is an enum that represents the assets we store pricing for
   * </pre>
   *
   * Protobuf enum {@code zrchain.validation.Asset}
   */
  public enum Asset
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <code>ROCK = 1;</code>
     */
    ROCK(1),
    /**
     * <code>zenBTC = 2;</code>
     */
    zenBTC(2),
    /**
     * <code>stETH = 3;</code>
     */
    stETH(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <code>ROCK = 1;</code>
     */
    public static final int ROCK_VALUE = 1;
    /**
     * <code>zenBTC = 2;</code>
     */
    public static final int zenBTC_VALUE = 2;
    /**
     * <code>stETH = 3;</code>
     */
    public static final int stETH_VALUE = 3;


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
    public static Asset valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Asset forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return ROCK;
        case 2: return zenBTC;
        case 3: return stETH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Asset>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Asset> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Asset>() {
            public Asset findValueByNumber(int number) {
              return Asset.forNumber(number);
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
      return com.zrchain.validation.AssetDataProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Asset[] VALUES = values();

    public static Asset valueOf(
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

    private Asset(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:zrchain.validation.Asset)
  }

  public interface AssetDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:zrchain.validation.AssetData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
     * @return The enum numeric value on the wire for asset.
     */
    int getAssetValue();
    /**
     * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
     * @return The asset.
     */
    com.zrchain.validation.AssetDataProto.Asset getAsset();

    /**
     * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The priceUSD.
     */
    java.lang.String getPriceUSD();
    /**
     * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for priceUSD.
     */
    com.google.protobuf.ByteString
        getPriceUSDBytes();

    /**
     * <code>uint32 precision = 3 [json_name = "precision"];</code>
     * @return The precision.
     */
    int getPrecision();
  }
  /**
   * <pre>
   * AssetData is a struct that contains the price in USD + decimals of precision of an asset
   * </pre>
   *
   * Protobuf type {@code zrchain.validation.AssetData}
   */
  public static final class AssetData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:zrchain.validation.AssetData)
      AssetDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AssetData.newBuilder() to construct.
    private AssetData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AssetData() {
      asset_ = 0;
      priceUSD_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AssetData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zrchain.validation.AssetDataProto.internal_static_zrchain_validation_AssetData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zrchain.validation.AssetDataProto.internal_static_zrchain_validation_AssetData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zrchain.validation.AssetDataProto.AssetData.class, com.zrchain.validation.AssetDataProto.AssetData.Builder.class);
    }

    public static final int ASSET_FIELD_NUMBER = 1;
    private int asset_ = 0;
    /**
     * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
     * @return The enum numeric value on the wire for asset.
     */
    @java.lang.Override public int getAssetValue() {
      return asset_;
    }
    /**
     * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
     * @return The asset.
     */
    @java.lang.Override public com.zrchain.validation.AssetDataProto.Asset getAsset() {
      com.zrchain.validation.AssetDataProto.Asset result = com.zrchain.validation.AssetDataProto.Asset.forNumber(asset_);
      return result == null ? com.zrchain.validation.AssetDataProto.Asset.UNRECOGNIZED : result;
    }

    public static final int PRICEUSD_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object priceUSD_ = "";
    /**
     * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The priceUSD.
     */
    @java.lang.Override
    public java.lang.String getPriceUSD() {
      java.lang.Object ref = priceUSD_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        priceUSD_ = s;
        return s;
      }
    }
    /**
     * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for priceUSD.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPriceUSDBytes() {
      java.lang.Object ref = priceUSD_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceUSD_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRECISION_FIELD_NUMBER = 3;
    private int precision_ = 0;
    /**
     * <code>uint32 precision = 3 [json_name = "precision"];</code>
     * @return The precision.
     */
    @java.lang.Override
    public int getPrecision() {
      return precision_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (asset_ != com.zrchain.validation.AssetDataProto.Asset.UNSPECIFIED.getNumber()) {
        output.writeEnum(1, asset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceUSD_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, priceUSD_);
      }
      if (precision_ != 0) {
        output.writeUInt32(3, precision_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (asset_ != com.zrchain.validation.AssetDataProto.Asset.UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, asset_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceUSD_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, priceUSD_);
      }
      if (precision_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, precision_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.zrchain.validation.AssetDataProto.AssetData)) {
        return super.equals(obj);
      }
      com.zrchain.validation.AssetDataProto.AssetData other = (com.zrchain.validation.AssetDataProto.AssetData) obj;

      if (asset_ != other.asset_) return false;
      if (!getPriceUSD()
          .equals(other.getPriceUSD())) return false;
      if (getPrecision()
          != other.getPrecision()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + asset_;
      hash = (37 * hash) + PRICEUSD_FIELD_NUMBER;
      hash = (53 * hash) + getPriceUSD().hashCode();
      hash = (37 * hash) + PRECISION_FIELD_NUMBER;
      hash = (53 * hash) + getPrecision();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.zrchain.validation.AssetDataProto.AssetData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.zrchain.validation.AssetDataProto.AssetData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.validation.AssetDataProto.AssetData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.zrchain.validation.AssetDataProto.AssetData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * AssetData is a struct that contains the price in USD + decimals of precision of an asset
     * </pre>
     *
     * Protobuf type {@code zrchain.validation.AssetData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:zrchain.validation.AssetData)
        com.zrchain.validation.AssetDataProto.AssetDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zrchain.validation.AssetDataProto.internal_static_zrchain_validation_AssetData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zrchain.validation.AssetDataProto.internal_static_zrchain_validation_AssetData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zrchain.validation.AssetDataProto.AssetData.class, com.zrchain.validation.AssetDataProto.AssetData.Builder.class);
      }

      // Construct using com.zrchain.validation.AssetDataProto.AssetData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        asset_ = 0;
        priceUSD_ = "";
        precision_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zrchain.validation.AssetDataProto.internal_static_zrchain_validation_AssetData_descriptor;
      }

      @java.lang.Override
      public com.zrchain.validation.AssetDataProto.AssetData getDefaultInstanceForType() {
        return com.zrchain.validation.AssetDataProto.AssetData.getDefaultInstance();
      }

      @java.lang.Override
      public com.zrchain.validation.AssetDataProto.AssetData build() {
        com.zrchain.validation.AssetDataProto.AssetData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.zrchain.validation.AssetDataProto.AssetData buildPartial() {
        com.zrchain.validation.AssetDataProto.AssetData result = new com.zrchain.validation.AssetDataProto.AssetData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.zrchain.validation.AssetDataProto.AssetData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.asset_ = asset_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.priceUSD_ = priceUSD_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.precision_ = precision_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zrchain.validation.AssetDataProto.AssetData) {
          return mergeFrom((com.zrchain.validation.AssetDataProto.AssetData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zrchain.validation.AssetDataProto.AssetData other) {
        if (other == com.zrchain.validation.AssetDataProto.AssetData.getDefaultInstance()) return this;
        if (other.asset_ != 0) {
          setAssetValue(other.getAssetValue());
        }
        if (!other.getPriceUSD().isEmpty()) {
          priceUSD_ = other.priceUSD_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getPrecision() != 0) {
          setPrecision(other.getPrecision());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                asset_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                priceUSD_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                precision_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int asset_ = 0;
      /**
       * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
       * @return The enum numeric value on the wire for asset.
       */
      @java.lang.Override public int getAssetValue() {
        return asset_;
      }
      /**
       * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
       * @param value The enum numeric value on the wire for asset to set.
       * @return This builder for chaining.
       */
      public Builder setAssetValue(int value) {
        asset_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
       * @return The asset.
       */
      @java.lang.Override
      public com.zrchain.validation.AssetDataProto.Asset getAsset() {
        com.zrchain.validation.AssetDataProto.Asset result = com.zrchain.validation.AssetDataProto.Asset.forNumber(asset_);
        return result == null ? com.zrchain.validation.AssetDataProto.Asset.UNRECOGNIZED : result;
      }
      /**
       * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
       * @param value The asset to set.
       * @return This builder for chaining.
       */
      public Builder setAsset(com.zrchain.validation.AssetDataProto.Asset value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        asset_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.zrchain.validation.Asset asset = 1 [json_name = "asset"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAsset() {
        bitField0_ = (bitField0_ & ~0x00000001);
        asset_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object priceUSD_ = "";
      /**
       * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
       * @return The priceUSD.
       */
      public java.lang.String getPriceUSD() {
        java.lang.Object ref = priceUSD_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          priceUSD_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
       * @return The bytes for priceUSD.
       */
      public com.google.protobuf.ByteString
          getPriceUSDBytes() {
        java.lang.Object ref = priceUSD_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          priceUSD_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
       * @param value The priceUSD to set.
       * @return This builder for chaining.
       */
      public Builder setPriceUSD(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        priceUSD_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceUSD() {
        priceUSD_ = getDefaultInstance().getPriceUSD();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string priceUSD = 2 [json_name = "priceUSD", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "cosmossdk.io/math.LegacyDec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
       * @param value The bytes for priceUSD to set.
       * @return This builder for chaining.
       */
      public Builder setPriceUSDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        priceUSD_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int precision_ ;
      /**
       * <code>uint32 precision = 3 [json_name = "precision"];</code>
       * @return The precision.
       */
      @java.lang.Override
      public int getPrecision() {
        return precision_;
      }
      /**
       * <code>uint32 precision = 3 [json_name = "precision"];</code>
       * @param value The precision to set.
       * @return This builder for chaining.
       */
      public Builder setPrecision(int value) {

        precision_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 precision = 3 [json_name = "precision"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPrecision() {
        bitField0_ = (bitField0_ & ~0x00000004);
        precision_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:zrchain.validation.AssetData)
    }

    // @@protoc_insertion_point(class_scope:zrchain.validation.AssetData)
    private static final com.zrchain.validation.AssetDataProto.AssetData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zrchain.validation.AssetDataProto.AssetData();
    }

    public static com.zrchain.validation.AssetDataProto.AssetData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AssetData>
        PARSER = new com.google.protobuf.AbstractParser<AssetData>() {
      @java.lang.Override
      public AssetData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AssetData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AssetData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.zrchain.validation.AssetDataProto.AssetData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zrchain_validation_AssetData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zrchain_validation_AssetData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#zrchain/validation/asset_data.proto\022\022z" +
      "rchain.validation\032\031cosmos_proto/cosmos.p" +
      "roto\032\024gogoproto/gogo.proto\"\251\001\n\tAssetData" +
      "\022/\n\005asset\030\001 \001(\0162\031.zrchain.validation.Ass" +
      "etR\005asset\022M\n\010priceUSD\030\002 \001(\tB1\310\336\037\000\332\336\037\033cos" +
      "mossdk.io/math.LegacyDec\322\264-\ncosmos.DecR\010" +
      "priceUSD\022\034\n\tprecision\030\003 \001(\rR\tprecision*9" +
      "\n\005Asset\022\017\n\013UNSPECIFIED\020\000\022\010\n\004ROCK\020\001\022\n\n\006ze" +
      "nBTC\020\002\022\t\n\005stETH\020\003B\314\001\n\026com.zrchain.valida" +
      "tionB\016AssetDataProtoZ;github.com/Zenrock" +
      "-Foundation/zrchain/v5/x/validation/type" +
      "s\242\002\003ZVX\252\002\022Zrchain.Validation\312\002\022Zrchain\\V" +
      "alidation\342\002\036Zrchain\\Validation\\GPBMetada" +
      "ta\352\002\023Zrchain::Validationb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_zrchain_validation_AssetData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zrchain_validation_AssetData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zrchain_validation_AssetData_descriptor,
        new java.lang.String[] { "Asset", "PriceUSD", "Precision", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
