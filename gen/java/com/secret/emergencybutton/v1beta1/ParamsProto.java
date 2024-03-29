// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/emergencybutton/v1beta1/params.proto

package com.secret.emergencybutton.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:secret.emergencybutton.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
     * @return The switchStatus.
     */
    java.lang.String getSwitchStatus();
    /**
     * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
     * @return The bytes for switchStatus.
     */
    com.google.protobuf.ByteString
        getSwitchStatusBytes();

    /**
     * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
     * @return The pauserAddress.
     */
    java.lang.String getPauserAddress();
    /**
     * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
     * @return The bytes for pauserAddress.
     */
    com.google.protobuf.ByteString
        getPauserAddressBytes();
  }
  /**
   * <pre>
   * Params defines the parameters for the ibc-rate-limit module.
   * </pre>
   *
   * Protobuf type {@code secret.emergencybutton.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:secret.emergencybutton.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      switchStatus_ = "";
      pauserAddress_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.secret.emergencybutton.v1beta1.ParamsProto.internal_static_secret_emergencybutton_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.secret.emergencybutton.v1beta1.ParamsProto.internal_static_secret_emergencybutton_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.secret.emergencybutton.v1beta1.ParamsProto.Params.class, com.secret.emergencybutton.v1beta1.ParamsProto.Params.Builder.class);
    }

    public static final int SWITCH_STATUS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object switchStatus_ = "";
    /**
     * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
     * @return The switchStatus.
     */
    @java.lang.Override
    public java.lang.String getSwitchStatus() {
      java.lang.Object ref = switchStatus_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        switchStatus_ = s;
        return s;
      }
    }
    /**
     * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
     * @return The bytes for switchStatus.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSwitchStatusBytes() {
      java.lang.Object ref = switchStatus_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        switchStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAUSER_ADDRESS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object pauserAddress_ = "";
    /**
     * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
     * @return The pauserAddress.
     */
    @java.lang.Override
    public java.lang.String getPauserAddress() {
      java.lang.Object ref = pauserAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pauserAddress_ = s;
        return s;
      }
    }
    /**
     * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
     * @return The bytes for pauserAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPauserAddressBytes() {
      java.lang.Object ref = pauserAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pauserAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(switchStatus_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, switchStatus_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pauserAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pauserAddress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(switchStatus_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, switchStatus_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pauserAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pauserAddress_);
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
      if (!(obj instanceof com.secret.emergencybutton.v1beta1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.secret.emergencybutton.v1beta1.ParamsProto.Params other = (com.secret.emergencybutton.v1beta1.ParamsProto.Params) obj;

      if (!getSwitchStatus()
          .equals(other.getSwitchStatus())) return false;
      if (!getPauserAddress()
          .equals(other.getPauserAddress())) return false;
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
      hash = (37 * hash) + SWITCH_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getSwitchStatus().hashCode();
      hash = (37 * hash) + PAUSER_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getPauserAddress().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.secret.emergencybutton.v1beta1.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the ibc-rate-limit module.
     * </pre>
     *
     * Protobuf type {@code secret.emergencybutton.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:secret.emergencybutton.v1beta1.Params)
        com.secret.emergencybutton.v1beta1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.secret.emergencybutton.v1beta1.ParamsProto.internal_static_secret_emergencybutton_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.secret.emergencybutton.v1beta1.ParamsProto.internal_static_secret_emergencybutton_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.secret.emergencybutton.v1beta1.ParamsProto.Params.class, com.secret.emergencybutton.v1beta1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.secret.emergencybutton.v1beta1.ParamsProto.Params.newBuilder()
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
        switchStatus_ = "";
        pauserAddress_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.secret.emergencybutton.v1beta1.ParamsProto.internal_static_secret_emergencybutton_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public com.secret.emergencybutton.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
        return com.secret.emergencybutton.v1beta1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.secret.emergencybutton.v1beta1.ParamsProto.Params build() {
        com.secret.emergencybutton.v1beta1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.secret.emergencybutton.v1beta1.ParamsProto.Params buildPartial() {
        com.secret.emergencybutton.v1beta1.ParamsProto.Params result = new com.secret.emergencybutton.v1beta1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.secret.emergencybutton.v1beta1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.switchStatus_ = switchStatus_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pauserAddress_ = pauserAddress_;
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
        if (other instanceof com.secret.emergencybutton.v1beta1.ParamsProto.Params) {
          return mergeFrom((com.secret.emergencybutton.v1beta1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.secret.emergencybutton.v1beta1.ParamsProto.Params other) {
        if (other == com.secret.emergencybutton.v1beta1.ParamsProto.Params.getDefaultInstance()) return this;
        if (!other.getSwitchStatus().isEmpty()) {
          switchStatus_ = other.switchStatus_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getPauserAddress().isEmpty()) {
          pauserAddress_ = other.pauserAddress_;
          bitField0_ |= 0x00000002;
          onChanged();
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
              case 10: {
                switchStatus_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                pauserAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private java.lang.Object switchStatus_ = "";
      /**
       * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
       * @return The switchStatus.
       */
      public java.lang.String getSwitchStatus() {
        java.lang.Object ref = switchStatus_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          switchStatus_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
       * @return The bytes for switchStatus.
       */
      public com.google.protobuf.ByteString
          getSwitchStatusBytes() {
        java.lang.Object ref = switchStatus_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          switchStatus_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
       * @param value The switchStatus to set.
       * @return This builder for chaining.
       */
      public Builder setSwitchStatus(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        switchStatus_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSwitchStatus() {
        switchStatus_ = getDefaultInstance().getSwitchStatus();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string switch_status = 1 [json_name = "switchStatus", (.gogoproto.jsontag) = "switch_status,omitempty"];</code>
       * @param value The bytes for switchStatus to set.
       * @return This builder for chaining.
       */
      public Builder setSwitchStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        switchStatus_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object pauserAddress_ = "";
      /**
       * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
       * @return The pauserAddress.
       */
      public java.lang.String getPauserAddress() {
        java.lang.Object ref = pauserAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          pauserAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
       * @return The bytes for pauserAddress.
       */
      public com.google.protobuf.ByteString
          getPauserAddressBytes() {
        java.lang.Object ref = pauserAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pauserAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
       * @param value The pauserAddress to set.
       * @return This builder for chaining.
       */
      public Builder setPauserAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        pauserAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPauserAddress() {
        pauserAddress_ = getDefaultInstance().getPauserAddress();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string pauser_address = 2 [json_name = "pauserAddress", (.gogoproto.jsontag) = "pauser_address,omitempty"];</code>
       * @param value The bytes for pauserAddress to set.
       * @return This builder for chaining.
       */
      public Builder setPauserAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        pauserAddress_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:secret.emergencybutton.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:secret.emergencybutton.v1beta1.Params)
    private static final com.secret.emergencybutton.v1beta1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.secret.emergencybutton.v1beta1.ParamsProto.Params();
    }

    public static com.secret.emergencybutton.v1beta1.ParamsProto.Params getDefaultInstance() {
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
    public com.secret.emergencybutton.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_secret_emergencybutton_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_secret_emergencybutton_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+secret/emergencybutton/v1beta1/params." +
      "proto\022\036secret.emergencybutton.v1beta1\032\024g" +
      "ogoproto/gogo.proto\"\217\001\n\006Params\022@\n\rswitch" +
      "_status\030\001 \001(\tB\033\352\336\037\027switch_status,omitemp" +
      "tyR\014switchStatus\022C\n\016pauser_address\030\002 \001(\t" +
      "B\034\352\336\037\030pauser_address,omitemptyR\rpauserAd" +
      "dressB\204\002\n\"com.secret.emergencybutton.v1b" +
      "eta1B\013ParamsProtoZ9github.com/scrtlabs/S" +
      "ecretNetwork/x/emergencybutton/types\242\002\003S" +
      "EX\252\002\036Secret.Emergencybutton.V1beta1\312\002\036Se" +
      "cret\\Emergencybutton\\V1beta1\342\002*Secret\\Em" +
      "ergencybutton\\V1beta1\\GPBMetadata\352\002 Secr" +
      "et::Emergencybutton::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_secret_emergencybutton_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_secret_emergencybutton_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_secret_emergencybutton_v1beta1_Params_descriptor,
        new java.lang.String[] { "SwitchStatus", "PauserAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
