// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: onomyprotocol/dao/v1/params.proto

package com.onomyprotocol.dao.v1;

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
      // @@protoc_insertion_point(interface_extends:onomyprotocol.dao.v1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * the period of blocks to withdraw the dao staking reward
     * </pre>
     *
     * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
     * @return The withdrawRewardPeriod.
     */
    long getWithdrawRewardPeriod();

    /**
     * <pre>
     * the rate of total dao's staking coins to keep unstaked
     * </pre>
     *
     * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
     * @return The poolRate.
     */
    com.google.protobuf.ByteString getPoolRate();

    /**
     * <pre>
     * the max rage of total dao's staking coins to be allowed in proposals
     * </pre>
     *
     * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
     * @return The maxProposalRate.
     */
    com.google.protobuf.ByteString getMaxProposalRate();

    /**
     * <pre>
     * the max validator's commission to be staked by the dao
     * </pre>
     *
     * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
     * @return The maxValCommission.
     */
    com.google.protobuf.ByteString getMaxValCommission();
  }
  /**
   * <pre>
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code onomyprotocol.dao.v1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:onomyprotocol.dao.v1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      poolRate_ = com.google.protobuf.ByteString.EMPTY;
      maxProposalRate_ = com.google.protobuf.ByteString.EMPTY;
      maxValCommission_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.onomyprotocol.dao.v1.ParamsProto.internal_static_onomyprotocol_dao_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.onomyprotocol.dao.v1.ParamsProto.internal_static_onomyprotocol_dao_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.onomyprotocol.dao.v1.ParamsProto.Params.class, com.onomyprotocol.dao.v1.ParamsProto.Params.Builder.class);
    }

    public static final int WITHDRAW_REWARD_PERIOD_FIELD_NUMBER = 1;
    private long withdrawRewardPeriod_ = 0L;
    /**
     * <pre>
     * the period of blocks to withdraw the dao staking reward
     * </pre>
     *
     * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
     * @return The withdrawRewardPeriod.
     */
    @java.lang.Override
    public long getWithdrawRewardPeriod() {
      return withdrawRewardPeriod_;
    }

    public static final int POOL_RATE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString poolRate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * the rate of total dao's staking coins to keep unstaked
     * </pre>
     *
     * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
     * @return The poolRate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPoolRate() {
      return poolRate_;
    }

    public static final int MAX_PROPOSAL_RATE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString maxProposalRate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * the max rage of total dao's staking coins to be allowed in proposals
     * </pre>
     *
     * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
     * @return The maxProposalRate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxProposalRate() {
      return maxProposalRate_;
    }

    public static final int MAX_VAL_COMMISSION_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString maxValCommission_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * the max validator's commission to be staked by the dao
     * </pre>
     *
     * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
     * @return The maxValCommission.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxValCommission() {
      return maxValCommission_;
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
      if (withdrawRewardPeriod_ != 0L) {
        output.writeInt64(1, withdrawRewardPeriod_);
      }
      if (!poolRate_.isEmpty()) {
        output.writeBytes(2, poolRate_);
      }
      if (!maxProposalRate_.isEmpty()) {
        output.writeBytes(3, maxProposalRate_);
      }
      if (!maxValCommission_.isEmpty()) {
        output.writeBytes(4, maxValCommission_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (withdrawRewardPeriod_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, withdrawRewardPeriod_);
      }
      if (!poolRate_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, poolRate_);
      }
      if (!maxProposalRate_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, maxProposalRate_);
      }
      if (!maxValCommission_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, maxValCommission_);
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
      if (!(obj instanceof com.onomyprotocol.dao.v1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.onomyprotocol.dao.v1.ParamsProto.Params other = (com.onomyprotocol.dao.v1.ParamsProto.Params) obj;

      if (getWithdrawRewardPeriod()
          != other.getWithdrawRewardPeriod()) return false;
      if (!getPoolRate()
          .equals(other.getPoolRate())) return false;
      if (!getMaxProposalRate()
          .equals(other.getMaxProposalRate())) return false;
      if (!getMaxValCommission()
          .equals(other.getMaxValCommission())) return false;
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
      hash = (37 * hash) + WITHDRAW_REWARD_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getWithdrawRewardPeriod());
      hash = (37 * hash) + POOL_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getPoolRate().hashCode();
      hash = (37 * hash) + MAX_PROPOSAL_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxProposalRate().hashCode();
      hash = (37 * hash) + MAX_VAL_COMMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getMaxValCommission().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.onomyprotocol.dao.v1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.onomyprotocol.dao.v1.ParamsProto.Params prototype) {
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
     * Protobuf type {@code onomyprotocol.dao.v1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:onomyprotocol.dao.v1.Params)
        com.onomyprotocol.dao.v1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.onomyprotocol.dao.v1.ParamsProto.internal_static_onomyprotocol_dao_v1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.onomyprotocol.dao.v1.ParamsProto.internal_static_onomyprotocol_dao_v1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.onomyprotocol.dao.v1.ParamsProto.Params.class, com.onomyprotocol.dao.v1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.onomyprotocol.dao.v1.ParamsProto.Params.newBuilder()
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
        withdrawRewardPeriod_ = 0L;
        poolRate_ = com.google.protobuf.ByteString.EMPTY;
        maxProposalRate_ = com.google.protobuf.ByteString.EMPTY;
        maxValCommission_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.onomyprotocol.dao.v1.ParamsProto.internal_static_onomyprotocol_dao_v1_Params_descriptor;
      }

      @java.lang.Override
      public com.onomyprotocol.dao.v1.ParamsProto.Params getDefaultInstanceForType() {
        return com.onomyprotocol.dao.v1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.onomyprotocol.dao.v1.ParamsProto.Params build() {
        com.onomyprotocol.dao.v1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.onomyprotocol.dao.v1.ParamsProto.Params buildPartial() {
        com.onomyprotocol.dao.v1.ParamsProto.Params result = new com.onomyprotocol.dao.v1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.onomyprotocol.dao.v1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.withdrawRewardPeriod_ = withdrawRewardPeriod_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.poolRate_ = poolRate_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.maxProposalRate_ = maxProposalRate_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.maxValCommission_ = maxValCommission_;
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
        if (other instanceof com.onomyprotocol.dao.v1.ParamsProto.Params) {
          return mergeFrom((com.onomyprotocol.dao.v1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.onomyprotocol.dao.v1.ParamsProto.Params other) {
        if (other == com.onomyprotocol.dao.v1.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.getWithdrawRewardPeriod() != 0L) {
          setWithdrawRewardPeriod(other.getWithdrawRewardPeriod());
        }
        if (other.getPoolRate() != com.google.protobuf.ByteString.EMPTY) {
          setPoolRate(other.getPoolRate());
        }
        if (other.getMaxProposalRate() != com.google.protobuf.ByteString.EMPTY) {
          setMaxProposalRate(other.getMaxProposalRate());
        }
        if (other.getMaxValCommission() != com.google.protobuf.ByteString.EMPTY) {
          setMaxValCommission(other.getMaxValCommission());
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
                withdrawRewardPeriod_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                poolRate_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                maxProposalRate_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                maxValCommission_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private long withdrawRewardPeriod_ ;
      /**
       * <pre>
       * the period of blocks to withdraw the dao staking reward
       * </pre>
       *
       * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
       * @return The withdrawRewardPeriod.
       */
      @java.lang.Override
      public long getWithdrawRewardPeriod() {
        return withdrawRewardPeriod_;
      }
      /**
       * <pre>
       * the period of blocks to withdraw the dao staking reward
       * </pre>
       *
       * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
       * @param value The withdrawRewardPeriod to set.
       * @return This builder for chaining.
       */
      public Builder setWithdrawRewardPeriod(long value) {

        withdrawRewardPeriod_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the period of blocks to withdraw the dao staking reward
       * </pre>
       *
       * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearWithdrawRewardPeriod() {
        bitField0_ = (bitField0_ & ~0x00000001);
        withdrawRewardPeriod_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString poolRate_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * the rate of total dao's staking coins to keep unstaked
       * </pre>
       *
       * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
       * @return The poolRate.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPoolRate() {
        return poolRate_;
      }
      /**
       * <pre>
       * the rate of total dao's staking coins to keep unstaked
       * </pre>
       *
       * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
       * @param value The poolRate to set.
       * @return This builder for chaining.
       */
      public Builder setPoolRate(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        poolRate_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the rate of total dao's staking coins to keep unstaked
       * </pre>
       *
       * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolRate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        poolRate_ = getDefaultInstance().getPoolRate();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString maxProposalRate_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * the max rage of total dao's staking coins to be allowed in proposals
       * </pre>
       *
       * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
       * @return The maxProposalRate.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxProposalRate() {
        return maxProposalRate_;
      }
      /**
       * <pre>
       * the max rage of total dao's staking coins to be allowed in proposals
       * </pre>
       *
       * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
       * @param value The maxProposalRate to set.
       * @return This builder for chaining.
       */
      public Builder setMaxProposalRate(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        maxProposalRate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the max rage of total dao's staking coins to be allowed in proposals
       * </pre>
       *
       * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxProposalRate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxProposalRate_ = getDefaultInstance().getMaxProposalRate();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString maxValCommission_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * the max validator's commission to be staked by the dao
       * </pre>
       *
       * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
       * @return The maxValCommission.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxValCommission() {
        return maxValCommission_;
      }
      /**
       * <pre>
       * the max validator's commission to be staked by the dao
       * </pre>
       *
       * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
       * @param value The maxValCommission to set.
       * @return This builder for chaining.
       */
      public Builder setMaxValCommission(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        maxValCommission_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * the max validator's commission to be staked by the dao
       * </pre>
       *
       * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxValCommission() {
        bitField0_ = (bitField0_ & ~0x00000008);
        maxValCommission_ = getDefaultInstance().getMaxValCommission();
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


      // @@protoc_insertion_point(builder_scope:onomyprotocol.dao.v1.Params)
    }

    // @@protoc_insertion_point(class_scope:onomyprotocol.dao.v1.Params)
    private static final com.onomyprotocol.dao.v1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.onomyprotocol.dao.v1.ParamsProto.Params();
    }

    public static com.onomyprotocol.dao.v1.ParamsProto.Params getDefaultInstance() {
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
    public com.onomyprotocol.dao.v1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onomyprotocol_dao_v1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onomyprotocol_dao_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!onomyprotocol/dao/v1/params.proto\022\024ono" +
      "myprotocol.dao.v1\032\024gogoproto/gogo.proto\"" +
      "\273\003\n\006Params\022W\n\026withdraw_reward_period\030\001 \001" +
      "(\003B!\362\336\037\035yaml:\"withdraw_reward_period\"R\024w" +
      "ithdrawRewardPeriod\022_\n\tpool_rate\030\002 \001(\014BB" +
      "\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.Dec\362\336\037\020yaml:\"pool_rate\"R\010poolRate\022v\n\021" +
      "max_proposal_rate\030\003 \001(\014BJ\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.Dec\362\336\037\030yaml:" +
      "\"max_proposal_rate\"R\017maxProposalRate\022y\n\022" +
      "max_val_commission\030\004 \001(\014BK\310\336\037\000\332\336\037&github" +
      ".com/cosmos/cosmos-sdk/types.Dec\362\336\037\031yaml" +
      ":\"max_val_commission\"R\020maxValCommission:" +
      "\004\230\240\037\000B\303\001\n\030com.onomyprotocol.dao.v1B\013Para" +
      "msProtoZ*github.com/onomyprotocol/onomy/" +
      "x/dao/types\242\002\003ODX\252\002\024Onomyprotocol.Dao.V1" +
      "\312\002\024Onomyprotocol\\Dao\\V1\342\002 Onomyprotocol\\" +
      "Dao\\V1\\GPBMetadata\352\002\026Onomyprotocol::Dao:" +
      ":V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_onomyprotocol_dao_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_onomyprotocol_dao_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onomyprotocol_dao_v1_Params_descriptor,
        new java.lang.String[] { "WithdrawRewardPeriod", "PoolRate", "MaxProposalRate", "MaxValCommission", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}