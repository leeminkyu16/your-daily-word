// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GregorianCalendarOptions.proto

package com.minkyu.yourdailyword.common.protos;

/**
 * Protobuf type {@code yourdailyword.GregorianCalendarOptions}
 */
public final class GregorianCalendarOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:yourdailyword.GregorianCalendarOptions)
    GregorianCalendarOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GregorianCalendarOptions.newBuilder() to construct.
  private GregorianCalendarOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GregorianCalendarOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GregorianCalendarOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsProto.internal_static_yourdailyword_GregorianCalendarOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsProto.internal_static_yourdailyword_GregorianCalendarOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.class, com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.Builder.class);
  }

  public static final int SETTING1_FIELD_NUMBER = 1;
  private boolean setting1_ = false;
  /**
   * <code>bool setting1 = 1;</code>
   * @return The setting1.
   */
  @java.lang.Override
  public boolean getSetting1() {
    return setting1_;
  }

  public static final int SETTING2_FIELD_NUMBER = 2;
  private boolean setting2_ = false;
  /**
   * <code>bool setting2 = 2;</code>
   * @return The setting2.
   */
  @java.lang.Override
  public boolean getSetting2() {
    return setting2_;
  }

  public static final int SETTING3_FIELD_NUMBER = 3;
  private boolean setting3_ = false;
  /**
   * <code>bool setting3 = 3;</code>
   * @return The setting3.
   */
  @java.lang.Override
  public boolean getSetting3() {
    return setting3_;
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
    if (setting1_ != false) {
      output.writeBool(1, setting1_);
    }
    if (setting2_ != false) {
      output.writeBool(2, setting2_);
    }
    if (setting3_ != false) {
      output.writeBool(3, setting3_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (setting1_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, setting1_);
    }
    if (setting2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, setting2_);
    }
    if (setting3_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, setting3_);
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
    if (!(obj instanceof com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions)) {
      return super.equals(obj);
    }
    com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions other = (com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions) obj;

    if (getSetting1()
        != other.getSetting1()) return false;
    if (getSetting2()
        != other.getSetting2()) return false;
    if (getSetting3()
        != other.getSetting3()) return false;
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
    hash = (37 * hash) + SETTING1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSetting1());
    hash = (37 * hash) + SETTING2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSetting2());
    hash = (37 * hash) + SETTING3_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSetting3());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions parseFrom(
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
  public static Builder newBuilder(com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions prototype) {
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
   * Protobuf type {@code yourdailyword.GregorianCalendarOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yourdailyword.GregorianCalendarOptions)
      com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsProto.internal_static_yourdailyword_GregorianCalendarOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsProto.internal_static_yourdailyword_GregorianCalendarOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.class, com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.Builder.class);
    }

    // Construct using com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.newBuilder()
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
      setting1_ = false;
      setting2_ = false;
      setting3_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptionsProto.internal_static_yourdailyword_GregorianCalendarOptions_descriptor;
    }

    @java.lang.Override
    public com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions getDefaultInstanceForType() {
      return com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions build() {
      com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions buildPartial() {
      com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions result = new com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.setting1_ = setting1_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.setting2_ = setting2_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.setting3_ = setting3_;
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
      if (other instanceof com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions) {
        return mergeFrom((com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions other) {
      if (other == com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions.getDefaultInstance()) return this;
      if (other.getSetting1() != false) {
        setSetting1(other.getSetting1());
      }
      if (other.getSetting2() != false) {
        setSetting2(other.getSetting2());
      }
      if (other.getSetting3() != false) {
        setSetting3(other.getSetting3());
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
              setting1_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              setting2_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              setting3_ = input.readBool();
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

    private boolean setting1_ ;
    /**
     * <code>bool setting1 = 1;</code>
     * @return The setting1.
     */
    @java.lang.Override
    public boolean getSetting1() {
      return setting1_;
    }
    /**
     * <code>bool setting1 = 1;</code>
     * @param value The setting1 to set.
     * @return This builder for chaining.
     */
    public Builder setSetting1(boolean value) {
      
      setting1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool setting1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSetting1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      setting1_ = false;
      onChanged();
      return this;
    }

    private boolean setting2_ ;
    /**
     * <code>bool setting2 = 2;</code>
     * @return The setting2.
     */
    @java.lang.Override
    public boolean getSetting2() {
      return setting2_;
    }
    /**
     * <code>bool setting2 = 2;</code>
     * @param value The setting2 to set.
     * @return This builder for chaining.
     */
    public Builder setSetting2(boolean value) {
      
      setting2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool setting2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSetting2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      setting2_ = false;
      onChanged();
      return this;
    }

    private boolean setting3_ ;
    /**
     * <code>bool setting3 = 3;</code>
     * @return The setting3.
     */
    @java.lang.Override
    public boolean getSetting3() {
      return setting3_;
    }
    /**
     * <code>bool setting3 = 3;</code>
     * @param value The setting3 to set.
     * @return This builder for chaining.
     */
    public Builder setSetting3(boolean value) {
      
      setting3_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool setting3 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSetting3() {
      bitField0_ = (bitField0_ & ~0x00000004);
      setting3_ = false;
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


    // @@protoc_insertion_point(builder_scope:yourdailyword.GregorianCalendarOptions)
  }

  // @@protoc_insertion_point(class_scope:yourdailyword.GregorianCalendarOptions)
  private static final com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions();
  }

  public static com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GregorianCalendarOptions>
      PARSER = new com.google.protobuf.AbstractParser<GregorianCalendarOptions>() {
    @java.lang.Override
    public GregorianCalendarOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<GregorianCalendarOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GregorianCalendarOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.minkyu.yourdailyword.common.protos.GregorianCalendarOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

