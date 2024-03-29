// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/cellarfees/v1/params.proto

package com.cellarfees.v1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cellarfees.v1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The number of fee accruals after which an auction should be started
     * </pre>
     *
     * <code>uint64 fee_accrual_auction_threshold = 1 [json_name = "feeAccrualAuctionThreshold"];</code>
     * @return The feeAccrualAuctionThreshold.
     */
    long getFeeAccrualAuctionThreshold();

    /**
     * <pre>
     * Emission rate factor. Specifically, the number of blocks over which to distribute
     * some amount of staking rewards.
     * </pre>
     *
     * <code>uint64 reward_emission_period = 2 [json_name = "rewardEmissionPeriod"];</code>
     * @return The rewardEmissionPeriod.
     */
    long getRewardEmissionPeriod();

    /**
     * <pre>
     * The initial rate at which auctions should decrease their denom's price in SOMM
     * </pre>
     *
     * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The initialPriceDecreaseRate.
     */
    java.lang.String getInitialPriceDecreaseRate();
    /**
     * <pre>
     * The initial rate at which auctions should decrease their denom's price in SOMM
     * </pre>
     *
     * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for initialPriceDecreaseRate.
     */
    com.google.protobuf.ByteString
        getInitialPriceDecreaseRateBytes();

    /**
     * <pre>
     * Number of blocks between auction price decreases
     * </pre>
     *
     * <code>uint64 price_decrease_block_interval = 4 [json_name = "priceDecreaseBlockInterval"];</code>
     * @return The priceDecreaseBlockInterval.
     */
    long getPriceDecreaseBlockInterval();
  }
  /**
   * <pre>
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code cellarfees.v1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cellarfees.v1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      initialPriceDecreaseRate_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cellarfees.v1.ParamsProto.internal_static_cellarfees_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cellarfees.v1.ParamsProto.internal_static_cellarfees_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cellarfees.v1.ParamsProto.Params.class, com.cellarfees.v1.ParamsProto.Params.Builder.class);
    }

    public static final int FEE_ACCRUAL_AUCTION_THRESHOLD_FIELD_NUMBER = 1;
    private long feeAccrualAuctionThreshold_ = 0L;
    /**
     * <pre>
     * The number of fee accruals after which an auction should be started
     * </pre>
     *
     * <code>uint64 fee_accrual_auction_threshold = 1 [json_name = "feeAccrualAuctionThreshold"];</code>
     * @return The feeAccrualAuctionThreshold.
     */
    @java.lang.Override
    public long getFeeAccrualAuctionThreshold() {
      return feeAccrualAuctionThreshold_;
    }

    public static final int REWARD_EMISSION_PERIOD_FIELD_NUMBER = 2;
    private long rewardEmissionPeriod_ = 0L;
    /**
     * <pre>
     * Emission rate factor. Specifically, the number of blocks over which to distribute
     * some amount of staking rewards.
     * </pre>
     *
     * <code>uint64 reward_emission_period = 2 [json_name = "rewardEmissionPeriod"];</code>
     * @return The rewardEmissionPeriod.
     */
    @java.lang.Override
    public long getRewardEmissionPeriod() {
      return rewardEmissionPeriod_;
    }

    public static final int INITIAL_PRICE_DECREASE_RATE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object initialPriceDecreaseRate_ = "";
    /**
     * <pre>
     * The initial rate at which auctions should decrease their denom's price in SOMM
     * </pre>
     *
     * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The initialPriceDecreaseRate.
     */
    @java.lang.Override
    public java.lang.String getInitialPriceDecreaseRate() {
      java.lang.Object ref = initialPriceDecreaseRate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        initialPriceDecreaseRate_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The initial rate at which auctions should decrease their denom's price in SOMM
     * </pre>
     *
     * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for initialPriceDecreaseRate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInitialPriceDecreaseRateBytes() {
      java.lang.Object ref = initialPriceDecreaseRate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initialPriceDecreaseRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_DECREASE_BLOCK_INTERVAL_FIELD_NUMBER = 4;
    private long priceDecreaseBlockInterval_ = 0L;
    /**
     * <pre>
     * Number of blocks between auction price decreases
     * </pre>
     *
     * <code>uint64 price_decrease_block_interval = 4 [json_name = "priceDecreaseBlockInterval"];</code>
     * @return The priceDecreaseBlockInterval.
     */
    @java.lang.Override
    public long getPriceDecreaseBlockInterval() {
      return priceDecreaseBlockInterval_;
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
      if (feeAccrualAuctionThreshold_ != 0L) {
        output.writeUInt64(1, feeAccrualAuctionThreshold_);
      }
      if (rewardEmissionPeriod_ != 0L) {
        output.writeUInt64(2, rewardEmissionPeriod_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(initialPriceDecreaseRate_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, initialPriceDecreaseRate_);
      }
      if (priceDecreaseBlockInterval_ != 0L) {
        output.writeUInt64(4, priceDecreaseBlockInterval_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (feeAccrualAuctionThreshold_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, feeAccrualAuctionThreshold_);
      }
      if (rewardEmissionPeriod_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, rewardEmissionPeriod_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(initialPriceDecreaseRate_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, initialPriceDecreaseRate_);
      }
      if (priceDecreaseBlockInterval_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, priceDecreaseBlockInterval_);
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
      if (!(obj instanceof com.cellarfees.v1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.cellarfees.v1.ParamsProto.Params other = (com.cellarfees.v1.ParamsProto.Params) obj;

      if (getFeeAccrualAuctionThreshold()
          != other.getFeeAccrualAuctionThreshold()) return false;
      if (getRewardEmissionPeriod()
          != other.getRewardEmissionPeriod()) return false;
      if (!getInitialPriceDecreaseRate()
          .equals(other.getInitialPriceDecreaseRate())) return false;
      if (getPriceDecreaseBlockInterval()
          != other.getPriceDecreaseBlockInterval()) return false;
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
      hash = (37 * hash) + FEE_ACCRUAL_AUCTION_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFeeAccrualAuctionThreshold());
      hash = (37 * hash) + REWARD_EMISSION_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRewardEmissionPeriod());
      hash = (37 * hash) + INITIAL_PRICE_DECREASE_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getInitialPriceDecreaseRate().hashCode();
      hash = (37 * hash) + PRICE_DECREASE_BLOCK_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPriceDecreaseBlockInterval());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.cellarfees.v1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.cellarfees.v1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cellarfees.v1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.cellarfees.v1.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the module.
     * </pre>
     *
     * Protobuf type {@code cellarfees.v1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cellarfees.v1.Params)
        com.cellarfees.v1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cellarfees.v1.ParamsProto.internal_static_cellarfees_v1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cellarfees.v1.ParamsProto.internal_static_cellarfees_v1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cellarfees.v1.ParamsProto.Params.class, com.cellarfees.v1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.cellarfees.v1.ParamsProto.Params.newBuilder()
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
        feeAccrualAuctionThreshold_ = 0L;
        rewardEmissionPeriod_ = 0L;
        initialPriceDecreaseRate_ = "";
        priceDecreaseBlockInterval_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cellarfees.v1.ParamsProto.internal_static_cellarfees_v1_Params_descriptor;
      }

      @java.lang.Override
      public com.cellarfees.v1.ParamsProto.Params getDefaultInstanceForType() {
        return com.cellarfees.v1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.cellarfees.v1.ParamsProto.Params build() {
        com.cellarfees.v1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cellarfees.v1.ParamsProto.Params buildPartial() {
        com.cellarfees.v1.ParamsProto.Params result = new com.cellarfees.v1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.cellarfees.v1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.feeAccrualAuctionThreshold_ = feeAccrualAuctionThreshold_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.rewardEmissionPeriod_ = rewardEmissionPeriod_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.initialPriceDecreaseRate_ = initialPriceDecreaseRate_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.priceDecreaseBlockInterval_ = priceDecreaseBlockInterval_;
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
        if (other instanceof com.cellarfees.v1.ParamsProto.Params) {
          return mergeFrom((com.cellarfees.v1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cellarfees.v1.ParamsProto.Params other) {
        if (other == com.cellarfees.v1.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.getFeeAccrualAuctionThreshold() != 0L) {
          setFeeAccrualAuctionThreshold(other.getFeeAccrualAuctionThreshold());
        }
        if (other.getRewardEmissionPeriod() != 0L) {
          setRewardEmissionPeriod(other.getRewardEmissionPeriod());
        }
        if (!other.getInitialPriceDecreaseRate().isEmpty()) {
          initialPriceDecreaseRate_ = other.initialPriceDecreaseRate_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.getPriceDecreaseBlockInterval() != 0L) {
          setPriceDecreaseBlockInterval(other.getPriceDecreaseBlockInterval());
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
                feeAccrualAuctionThreshold_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                rewardEmissionPeriod_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                initialPriceDecreaseRate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                priceDecreaseBlockInterval_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private long feeAccrualAuctionThreshold_ ;
      /**
       * <pre>
       * The number of fee accruals after which an auction should be started
       * </pre>
       *
       * <code>uint64 fee_accrual_auction_threshold = 1 [json_name = "feeAccrualAuctionThreshold"];</code>
       * @return The feeAccrualAuctionThreshold.
       */
      @java.lang.Override
      public long getFeeAccrualAuctionThreshold() {
        return feeAccrualAuctionThreshold_;
      }
      /**
       * <pre>
       * The number of fee accruals after which an auction should be started
       * </pre>
       *
       * <code>uint64 fee_accrual_auction_threshold = 1 [json_name = "feeAccrualAuctionThreshold"];</code>
       * @param value The feeAccrualAuctionThreshold to set.
       * @return This builder for chaining.
       */
      public Builder setFeeAccrualAuctionThreshold(long value) {

        feeAccrualAuctionThreshold_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The number of fee accruals after which an auction should be started
       * </pre>
       *
       * <code>uint64 fee_accrual_auction_threshold = 1 [json_name = "feeAccrualAuctionThreshold"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFeeAccrualAuctionThreshold() {
        bitField0_ = (bitField0_ & ~0x00000001);
        feeAccrualAuctionThreshold_ = 0L;
        onChanged();
        return this;
      }

      private long rewardEmissionPeriod_ ;
      /**
       * <pre>
       * Emission rate factor. Specifically, the number of blocks over which to distribute
       * some amount of staking rewards.
       * </pre>
       *
       * <code>uint64 reward_emission_period = 2 [json_name = "rewardEmissionPeriod"];</code>
       * @return The rewardEmissionPeriod.
       */
      @java.lang.Override
      public long getRewardEmissionPeriod() {
        return rewardEmissionPeriod_;
      }
      /**
       * <pre>
       * Emission rate factor. Specifically, the number of blocks over which to distribute
       * some amount of staking rewards.
       * </pre>
       *
       * <code>uint64 reward_emission_period = 2 [json_name = "rewardEmissionPeriod"];</code>
       * @param value The rewardEmissionPeriod to set.
       * @return This builder for chaining.
       */
      public Builder setRewardEmissionPeriod(long value) {

        rewardEmissionPeriod_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Emission rate factor. Specifically, the number of blocks over which to distribute
       * some amount of staking rewards.
       * </pre>
       *
       * <code>uint64 reward_emission_period = 2 [json_name = "rewardEmissionPeriod"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardEmissionPeriod() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rewardEmissionPeriod_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object initialPriceDecreaseRate_ = "";
      /**
       * <pre>
       * The initial rate at which auctions should decrease their denom's price in SOMM
       * </pre>
       *
       * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The initialPriceDecreaseRate.
       */
      public java.lang.String getInitialPriceDecreaseRate() {
        java.lang.Object ref = initialPriceDecreaseRate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          initialPriceDecreaseRate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The initial rate at which auctions should decrease their denom's price in SOMM
       * </pre>
       *
       * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The bytes for initialPriceDecreaseRate.
       */
      public com.google.protobuf.ByteString
          getInitialPriceDecreaseRateBytes() {
        java.lang.Object ref = initialPriceDecreaseRate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          initialPriceDecreaseRate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The initial rate at which auctions should decrease their denom's price in SOMM
       * </pre>
       *
       * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The initialPriceDecreaseRate to set.
       * @return This builder for chaining.
       */
      public Builder setInitialPriceDecreaseRate(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        initialPriceDecreaseRate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The initial rate at which auctions should decrease their denom's price in SOMM
       * </pre>
       *
       * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return This builder for chaining.
       */
      public Builder clearInitialPriceDecreaseRate() {
        initialPriceDecreaseRate_ = getDefaultInstance().getInitialPriceDecreaseRate();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The initial rate at which auctions should decrease their denom's price in SOMM
       * </pre>
       *
       * <code>string initial_price_decrease_rate = 3 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The bytes for initialPriceDecreaseRate to set.
       * @return This builder for chaining.
       */
      public Builder setInitialPriceDecreaseRateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        initialPriceDecreaseRate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private long priceDecreaseBlockInterval_ ;
      /**
       * <pre>
       * Number of blocks between auction price decreases
       * </pre>
       *
       * <code>uint64 price_decrease_block_interval = 4 [json_name = "priceDecreaseBlockInterval"];</code>
       * @return The priceDecreaseBlockInterval.
       */
      @java.lang.Override
      public long getPriceDecreaseBlockInterval() {
        return priceDecreaseBlockInterval_;
      }
      /**
       * <pre>
       * Number of blocks between auction price decreases
       * </pre>
       *
       * <code>uint64 price_decrease_block_interval = 4 [json_name = "priceDecreaseBlockInterval"];</code>
       * @param value The priceDecreaseBlockInterval to set.
       * @return This builder for chaining.
       */
      public Builder setPriceDecreaseBlockInterval(long value) {

        priceDecreaseBlockInterval_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Number of blocks between auction price decreases
       * </pre>
       *
       * <code>uint64 price_decrease_block_interval = 4 [json_name = "priceDecreaseBlockInterval"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceDecreaseBlockInterval() {
        bitField0_ = (bitField0_ & ~0x00000008);
        priceDecreaseBlockInterval_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:cellarfees.v1.Params)
    }

    // @@protoc_insertion_point(class_scope:cellarfees.v1.Params)
    private static final com.cellarfees.v1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cellarfees.v1.ParamsProto.Params();
    }

    public static com.cellarfees.v1.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cellarfees.v1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cellarfees_v1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cellarfees_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$sommelier/cellarfees/v1/params.proto\022\r" +
      "cellarfees.v1\032\024gogoproto/gogo.proto\"\271\002\n\006" +
      "Params\022A\n\035fee_accrual_auction_threshold\030" +
      "\001 \001(\004R\032feeAccrualAuctionThreshold\0224\n\026rew" +
      "ard_emission_period\030\002 \001(\004R\024rewardEmissio" +
      "nPeriod\022m\n\033initial_price_decrease_rate\030\003" +
      " \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.DecR\030initialPriceDecreaseRate\022A" +
      "\n\035price_decrease_block_interval\030\004 \001(\004R\032p" +
      "riceDecreaseBlockInterval:\004\230\240\037\000B\247\001\n\021com." +
      "cellarfees.v1B\013ParamsProtoZ2github.com/p" +
      "eggyjv/sommelier/v4/x/cellarfees/types\242\002" +
      "\003CXX\252\002\rCellarfees.V1\312\002\rCellarfees\\V1\342\002\031C" +
      "ellarfees\\V1\\GPBMetadata\352\002\016Cellarfees::V" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cellarfees_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cellarfees_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cellarfees_v1_Params_descriptor,
        new java.lang.String[] { "FeeAccrualAuctionThreshold", "RewardEmissionPeriod", "InitialPriceDecreaseRate", "PriceDecreaseBlockInterval", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
