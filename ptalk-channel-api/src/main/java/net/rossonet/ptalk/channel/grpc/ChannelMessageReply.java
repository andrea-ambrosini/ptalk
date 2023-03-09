// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-api.proto

package net.rossonet.ptalk.channel.grpc;

/**
 * Protobuf type {@code channel.ChannelMessageReply}
 */
public final class ChannelMessageReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channel.ChannelMessageReply)
    ChannelMessageReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelMessageReply.newBuilder() to construct.
  private ChannelMessageReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelMessageReply() {
    flowReference_ = "";
    status_ = 0;
    traceData_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChannelMessageReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.internal_static_channel_ChannelMessageReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.internal_static_channel_ChannelMessageReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.grpc.ChannelMessageReply.class, net.rossonet.ptalk.channel.grpc.ChannelMessageReply.Builder.class);
  }

  public static final int FLOWREFERENCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object flowReference_;
  /**
   * <code>string flowReference = 1;</code>
   * @return The flowReference.
   */
  @java.lang.Override
  public java.lang.String getFlowReference() {
    java.lang.Object ref = flowReference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flowReference_ = s;
      return s;
    }
  }
  /**
   * <code>string flowReference = 1;</code>
   * @return The bytes for flowReference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFlowReferenceBytes() {
    java.lang.Object ref = flowReference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      flowReference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>.base.StatusValue status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.base.StatusValue status = 2;</code>
   * @return The status.
   */
  @java.lang.Override public net.rossonet.ptalk.base.grpc.StatusValue getStatus() {
    @SuppressWarnings("deprecation")
    net.rossonet.ptalk.base.grpc.StatusValue result = net.rossonet.ptalk.base.grpc.StatusValue.valueOf(status_);
    return result == null ? net.rossonet.ptalk.base.grpc.StatusValue.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
    return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
  }

  public static final int TRACEDATA_FIELD_NUMBER = 4;
  private java.util.List<net.rossonet.ptalk.base.grpc.Data> traceData_;
  /**
   * <code>repeated .base.Data traceData = 4;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.base.grpc.Data> getTraceDataList() {
    return traceData_;
  }
  /**
   * <code>repeated .base.Data traceData = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getTraceDataOrBuilderList() {
    return traceData_;
  }
  /**
   * <code>repeated .base.Data traceData = 4;</code>
   */
  @java.lang.Override
  public int getTraceDataCount() {
    return traceData_.size();
  }
  /**
   * <code>repeated .base.Data traceData = 4;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Data getTraceData(int index) {
    return traceData_.get(index);
  }
  /**
   * <code>repeated .base.Data traceData = 4;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.DataOrBuilder getTraceDataOrBuilder(
      int index) {
    return traceData_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowReference_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flowReference_);
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      output.writeEnum(2, status_);
    }
    if (timestamp_ != null) {
      output.writeMessage(3, getTimestamp());
    }
    for (int i = 0; i < traceData_.size(); i++) {
      output.writeMessage(4, traceData_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowReference_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flowReference_);
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTimestamp());
    }
    for (int i = 0; i < traceData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, traceData_.get(i));
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
    if (!(obj instanceof net.rossonet.ptalk.channel.grpc.ChannelMessageReply)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.grpc.ChannelMessageReply other = (net.rossonet.ptalk.channel.grpc.ChannelMessageReply) obj;

    if (!getFlowReference()
        .equals(other.getFlowReference())) return false;
    if (status_ != other.status_) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (!getTraceDataList()
        .equals(other.getTraceDataList())) return false;
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
    hash = (37 * hash) + FLOWREFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getFlowReference().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    if (getTraceDataCount() > 0) {
      hash = (37 * hash) + TRACEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getTraceDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.grpc.ChannelMessageReply prototype) {
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
   * Protobuf type {@code channel.ChannelMessageReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channel.ChannelMessageReply)
      net.rossonet.ptalk.channel.grpc.ChannelMessageReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.internal_static_channel_ChannelMessageReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.internal_static_channel_ChannelMessageReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.grpc.ChannelMessageReply.class, net.rossonet.ptalk.channel.grpc.ChannelMessageReply.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.grpc.ChannelMessageReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      flowReference_ = "";

      status_ = 0;

      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      if (traceDataBuilder_ == null) {
        traceData_ = java.util.Collections.emptyList();
      } else {
        traceData_ = null;
        traceDataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.grpc.PtaskChannelApi.internal_static_channel_ChannelMessageReply_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.grpc.ChannelMessageReply getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.grpc.ChannelMessageReply.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.grpc.ChannelMessageReply build() {
      net.rossonet.ptalk.channel.grpc.ChannelMessageReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.grpc.ChannelMessageReply buildPartial() {
      net.rossonet.ptalk.channel.grpc.ChannelMessageReply result = new net.rossonet.ptalk.channel.grpc.ChannelMessageReply(this);
      int from_bitField0_ = bitField0_;
      result.flowReference_ = flowReference_;
      result.status_ = status_;
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
      if (traceDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          traceData_ = java.util.Collections.unmodifiableList(traceData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.traceData_ = traceData_;
      } else {
        result.traceData_ = traceDataBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof net.rossonet.ptalk.channel.grpc.ChannelMessageReply) {
        return mergeFrom((net.rossonet.ptalk.channel.grpc.ChannelMessageReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.grpc.ChannelMessageReply other) {
      if (other == net.rossonet.ptalk.channel.grpc.ChannelMessageReply.getDefaultInstance()) return this;
      if (!other.getFlowReference().isEmpty()) {
        flowReference_ = other.flowReference_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (traceDataBuilder_ == null) {
        if (!other.traceData_.isEmpty()) {
          if (traceData_.isEmpty()) {
            traceData_ = other.traceData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTraceDataIsMutable();
            traceData_.addAll(other.traceData_);
          }
          onChanged();
        }
      } else {
        if (!other.traceData_.isEmpty()) {
          if (traceDataBuilder_.isEmpty()) {
            traceDataBuilder_.dispose();
            traceDataBuilder_ = null;
            traceData_ = other.traceData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            traceDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTraceDataFieldBuilder() : null;
          } else {
            traceDataBuilder_.addAllMessages(other.traceData_);
          }
        }
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
              flowReference_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              status_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              net.rossonet.ptalk.base.grpc.Data m =
                  input.readMessage(
                      net.rossonet.ptalk.base.grpc.Data.parser(),
                      extensionRegistry);
              if (traceDataBuilder_ == null) {
                ensureTraceDataIsMutable();
                traceData_.add(m);
              } else {
                traceDataBuilder_.addMessage(m);
              }
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

    private java.lang.Object flowReference_ = "";
    /**
     * <code>string flowReference = 1;</code>
     * @return The flowReference.
     */
    public java.lang.String getFlowReference() {
      java.lang.Object ref = flowReference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flowReference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string flowReference = 1;</code>
     * @return The bytes for flowReference.
     */
    public com.google.protobuf.ByteString
        getFlowReferenceBytes() {
      java.lang.Object ref = flowReference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flowReference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string flowReference = 1;</code>
     * @param value The flowReference to set.
     * @return This builder for chaining.
     */
    public Builder setFlowReference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      flowReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string flowReference = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlowReference() {
      
      flowReference_ = getDefaultInstance().getFlowReference();
      onChanged();
      return this;
    }
    /**
     * <code>string flowReference = 1;</code>
     * @param value The bytes for flowReference to set.
     * @return This builder for chaining.
     */
    public Builder setFlowReferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      flowReference_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.base.StatusValue status = 2;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.base.StatusValue status = 2;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.base.StatusValue status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public net.rossonet.ptalk.base.grpc.StatusValue getStatus() {
      @SuppressWarnings("deprecation")
      net.rossonet.ptalk.base.grpc.StatusValue result = net.rossonet.ptalk.base.grpc.StatusValue.valueOf(status_);
      return result == null ? net.rossonet.ptalk.base.grpc.StatusValue.UNRECOGNIZED : result;
    }
    /**
     * <code>.base.StatusValue status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(net.rossonet.ptalk.base.grpc.StatusValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.base.StatusValue status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     * @return The timestamp.
     */
    public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(net.rossonet.ptalk.base.grpc.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder setTimestamp(
        net.rossonet.ptalk.base.grpc.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder mergeTimestamp(net.rossonet.ptalk.base.grpc.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (timestamp_ != null) {
          timestamp_ =
            net.rossonet.ptalk.base.grpc.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public net.rossonet.ptalk.base.grpc.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.base.Timestamp timestamp = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private java.util.List<net.rossonet.ptalk.base.grpc.Data> traceData_ =
      java.util.Collections.emptyList();
    private void ensureTraceDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        traceData_ = new java.util.ArrayList<net.rossonet.ptalk.base.grpc.Data>(traceData_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Data, net.rossonet.ptalk.base.grpc.Data.Builder, net.rossonet.ptalk.base.grpc.DataOrBuilder> traceDataBuilder_;

    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public java.util.List<net.rossonet.ptalk.base.grpc.Data> getTraceDataList() {
      if (traceDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(traceData_);
      } else {
        return traceDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public int getTraceDataCount() {
      if (traceDataBuilder_ == null) {
        return traceData_.size();
      } else {
        return traceDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.Data getTraceData(int index) {
      if (traceDataBuilder_ == null) {
        return traceData_.get(index);
      } else {
        return traceDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder setTraceData(
        int index, net.rossonet.ptalk.base.grpc.Data value) {
      if (traceDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTraceDataIsMutable();
        traceData_.set(index, value);
        onChanged();
      } else {
        traceDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder setTraceData(
        int index, net.rossonet.ptalk.base.grpc.Data.Builder builderForValue) {
      if (traceDataBuilder_ == null) {
        ensureTraceDataIsMutable();
        traceData_.set(index, builderForValue.build());
        onChanged();
      } else {
        traceDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder addTraceData(net.rossonet.ptalk.base.grpc.Data value) {
      if (traceDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTraceDataIsMutable();
        traceData_.add(value);
        onChanged();
      } else {
        traceDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder addTraceData(
        int index, net.rossonet.ptalk.base.grpc.Data value) {
      if (traceDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTraceDataIsMutable();
        traceData_.add(index, value);
        onChanged();
      } else {
        traceDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder addTraceData(
        net.rossonet.ptalk.base.grpc.Data.Builder builderForValue) {
      if (traceDataBuilder_ == null) {
        ensureTraceDataIsMutable();
        traceData_.add(builderForValue.build());
        onChanged();
      } else {
        traceDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder addTraceData(
        int index, net.rossonet.ptalk.base.grpc.Data.Builder builderForValue) {
      if (traceDataBuilder_ == null) {
        ensureTraceDataIsMutable();
        traceData_.add(index, builderForValue.build());
        onChanged();
      } else {
        traceDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder addAllTraceData(
        java.lang.Iterable<? extends net.rossonet.ptalk.base.grpc.Data> values) {
      if (traceDataBuilder_ == null) {
        ensureTraceDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, traceData_);
        onChanged();
      } else {
        traceDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder clearTraceData() {
      if (traceDataBuilder_ == null) {
        traceData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        traceDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public Builder removeTraceData(int index) {
      if (traceDataBuilder_ == null) {
        ensureTraceDataIsMutable();
        traceData_.remove(index);
        onChanged();
      } else {
        traceDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.Data.Builder getTraceDataBuilder(
        int index) {
      return getTraceDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.DataOrBuilder getTraceDataOrBuilder(
        int index) {
      if (traceDataBuilder_ == null) {
        return traceData_.get(index);  } else {
        return traceDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
         getTraceDataOrBuilderList() {
      if (traceDataBuilder_ != null) {
        return traceDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(traceData_);
      }
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.Data.Builder addTraceDataBuilder() {
      return getTraceDataFieldBuilder().addBuilder(
          net.rossonet.ptalk.base.grpc.Data.getDefaultInstance());
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.Data.Builder addTraceDataBuilder(
        int index) {
      return getTraceDataFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.base.grpc.Data.getDefaultInstance());
    }
    /**
     * <code>repeated .base.Data traceData = 4;</code>
     */
    public java.util.List<net.rossonet.ptalk.base.grpc.Data.Builder> 
         getTraceDataBuilderList() {
      return getTraceDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Data, net.rossonet.ptalk.base.grpc.Data.Builder, net.rossonet.ptalk.base.grpc.DataOrBuilder> 
        getTraceDataFieldBuilder() {
      if (traceDataBuilder_ == null) {
        traceDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.base.grpc.Data, net.rossonet.ptalk.base.grpc.Data.Builder, net.rossonet.ptalk.base.grpc.DataOrBuilder>(
                traceData_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        traceData_ = null;
      }
      return traceDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:channel.ChannelMessageReply)
  }

  // @@protoc_insertion_point(class_scope:channel.ChannelMessageReply)
  private static final net.rossonet.ptalk.channel.grpc.ChannelMessageReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.grpc.ChannelMessageReply();
  }

  public static net.rossonet.ptalk.channel.grpc.ChannelMessageReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelMessageReply>
      PARSER = new com.google.protobuf.AbstractParser<ChannelMessageReply>() {
    @java.lang.Override
    public ChannelMessageReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChannelMessageReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelMessageReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.grpc.ChannelMessageReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

