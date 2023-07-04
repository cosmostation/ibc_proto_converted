// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/permission/v1beta1/types.proto

package com.axelar.permission.v1beta1;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GovAccountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.permission.v1beta1.GovAccount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes address = 1 [json_name = "address", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The address.
     */
    com.google.protobuf.ByteString getAddress();

    /**
     * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
     * @return The enum numeric value on the wire for role.
     */
    int getRoleValue();
    /**
     * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
     * @return The role.
     */
    com.axelar.permission.exported.v1beta1.TypesProto.Role getRole();
  }
  /**
   * Protobuf type {@code axelar.permission.v1beta1.GovAccount}
   */
  public static final class GovAccount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.permission.v1beta1.GovAccount)
      GovAccountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GovAccount.newBuilder() to construct.
    private GovAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GovAccount() {
      address_ = com.google.protobuf.ByteString.EMPTY;
      role_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GovAccount();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.permission.v1beta1.TypesProto.internal_static_axelar_permission_v1beta1_GovAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.permission.v1beta1.TypesProto.internal_static_axelar_permission_v1beta1_GovAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.permission.v1beta1.TypesProto.GovAccount.class, com.axelar.permission.v1beta1.TypesProto.GovAccount.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes address = 1 [json_name = "address", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }

    public static final int ROLE_FIELD_NUMBER = 2;
    private int role_ = 0;
    /**
     * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
     * @return The role.
     */
    @java.lang.Override public com.axelar.permission.exported.v1beta1.TypesProto.Role getRole() {
      com.axelar.permission.exported.v1beta1.TypesProto.Role result = com.axelar.permission.exported.v1beta1.TypesProto.Role.forNumber(role_);
      return result == null ? com.axelar.permission.exported.v1beta1.TypesProto.Role.UNRECOGNIZED : result;
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
      if (!address_.isEmpty()) {
        output.writeBytes(1, address_);
      }
      if (role_ != com.axelar.permission.exported.v1beta1.TypesProto.Role.ROLE_UNSPECIFIED.getNumber()) {
        output.writeEnum(2, role_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!address_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, address_);
      }
      if (role_ != com.axelar.permission.exported.v1beta1.TypesProto.Role.ROLE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, role_);
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
      if (!(obj instanceof com.axelar.permission.v1beta1.TypesProto.GovAccount)) {
        return super.equals(obj);
      }
      com.axelar.permission.v1beta1.TypesProto.GovAccount other = (com.axelar.permission.v1beta1.TypesProto.GovAccount) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (role_ != other.role_) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + ROLE_FIELD_NUMBER;
      hash = (53 * hash) + role_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.axelar.permission.v1beta1.TypesProto.GovAccount parseFrom(
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
    public static Builder newBuilder(com.axelar.permission.v1beta1.TypesProto.GovAccount prototype) {
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
     * Protobuf type {@code axelar.permission.v1beta1.GovAccount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.permission.v1beta1.GovAccount)
        com.axelar.permission.v1beta1.TypesProto.GovAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.axelar.permission.v1beta1.TypesProto.internal_static_axelar_permission_v1beta1_GovAccount_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.axelar.permission.v1beta1.TypesProto.internal_static_axelar_permission_v1beta1_GovAccount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.axelar.permission.v1beta1.TypesProto.GovAccount.class, com.axelar.permission.v1beta1.TypesProto.GovAccount.Builder.class);
      }

      // Construct using com.axelar.permission.v1beta1.TypesProto.GovAccount.newBuilder()
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
        address_ = com.google.protobuf.ByteString.EMPTY;
        role_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.axelar.permission.v1beta1.TypesProto.internal_static_axelar_permission_v1beta1_GovAccount_descriptor;
      }

      @java.lang.Override
      public com.axelar.permission.v1beta1.TypesProto.GovAccount getDefaultInstanceForType() {
        return com.axelar.permission.v1beta1.TypesProto.GovAccount.getDefaultInstance();
      }

      @java.lang.Override
      public com.axelar.permission.v1beta1.TypesProto.GovAccount build() {
        com.axelar.permission.v1beta1.TypesProto.GovAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.axelar.permission.v1beta1.TypesProto.GovAccount buildPartial() {
        com.axelar.permission.v1beta1.TypesProto.GovAccount result = new com.axelar.permission.v1beta1.TypesProto.GovAccount(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.axelar.permission.v1beta1.TypesProto.GovAccount result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.role_ = role_;
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
        if (other instanceof com.axelar.permission.v1beta1.TypesProto.GovAccount) {
          return mergeFrom((com.axelar.permission.v1beta1.TypesProto.GovAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.axelar.permission.v1beta1.TypesProto.GovAccount other) {
        if (other == com.axelar.permission.v1beta1.TypesProto.GovAccount.getDefaultInstance()) return this;
        if (other.getAddress() != com.google.protobuf.ByteString.EMPTY) {
          setAddress(other.getAddress());
        }
        if (other.role_ != 0) {
          setRoleValue(other.getRoleValue());
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
                address_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                role_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes address = 1 [json_name = "address", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return The address.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getAddress() {
        return address_;
      }
      /**
       * <code>bytes address = 1 [json_name = "address", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        address_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes address = 1 [json_name = "address", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }

      private int role_ = 0;
      /**
       * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
       * @return The enum numeric value on the wire for role.
       */
      @java.lang.Override public int getRoleValue() {
        return role_;
      }
      /**
       * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
       * @param value The enum numeric value on the wire for role to set.
       * @return This builder for chaining.
       */
      public Builder setRoleValue(int value) {
        role_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
       * @return The role.
       */
      @java.lang.Override
      public com.axelar.permission.exported.v1beta1.TypesProto.Role getRole() {
        com.axelar.permission.exported.v1beta1.TypesProto.Role result = com.axelar.permission.exported.v1beta1.TypesProto.Role.forNumber(role_);
        return result == null ? com.axelar.permission.exported.v1beta1.TypesProto.Role.UNRECOGNIZED : result;
      }
      /**
       * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
       * @param value The role to set.
       * @return This builder for chaining.
       */
      public Builder setRole(com.axelar.permission.exported.v1beta1.TypesProto.Role value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        role_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.axelar.permission.exported.v1beta1.Role role = 2 [json_name = "role"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRole() {
        bitField0_ = (bitField0_ & ~0x00000002);
        role_ = 0;
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


      // @@protoc_insertion_point(builder_scope:axelar.permission.v1beta1.GovAccount)
    }

    // @@protoc_insertion_point(class_scope:axelar.permission.v1beta1.GovAccount)
    private static final com.axelar.permission.v1beta1.TypesProto.GovAccount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.axelar.permission.v1beta1.TypesProto.GovAccount();
    }

    public static com.axelar.permission.v1beta1.TypesProto.GovAccount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GovAccount>
        PARSER = new com.google.protobuf.AbstractParser<GovAccount>() {
      @java.lang.Override
      public GovAccount parsePartialFrom(
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

    public static com.google.protobuf.Parser<GovAccount> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GovAccount> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.axelar.permission.v1beta1.TypesProto.GovAccount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_permission_v1beta1_GovAccount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_permission_v1beta1_GovAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%axelar/permission/v1beta1/types.proto\022" +
      "\031axelar.permission.v1beta1\032\024gogoproto/go" +
      "go.proto\032.axelar/permission/exported/v1b" +
      "eta1/types.proto\"\227\001\n\nGovAccount\022K\n\007addre" +
      "ss\030\001 \001(\014B1\372\336\037-github.com/cosmos/cosmos-s" +
      "dk/types.AccAddressR\007address\022<\n\004role\030\002 \001" +
      "(\0162(.axelar.permission.exported.v1beta1." +
      "RoleR\004roleB\354\001\n\035com.axelar.permission.v1b" +
      "eta1B\nTypesProtoZ7github.com/axelarnetwo" +
      "rk/axelar-core/x/permission/types\242\002\003APX\252" +
      "\002\031Axelar.Permission.V1beta1\312\002\031Axelar\\Per" +
      "mission\\V1beta1\342\002%Axelar\\Permission\\V1be" +
      "ta1\\GPBMetadata\352\002\033Axelar::Permission::V1" +
      "beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.axelar.permission.exported.v1beta1.TypesProto.getDescriptor(),
        });
    internal_static_axelar_permission_v1beta1_GovAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_permission_v1beta1_GovAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_permission_v1beta1_GovAccount_descriptor,
        new java.lang.String[] { "Address", "Role", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.axelar.permission.exported.v1beta1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}