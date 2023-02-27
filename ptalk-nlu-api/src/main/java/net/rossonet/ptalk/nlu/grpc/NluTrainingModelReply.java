// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

/**
 * Protobuf type {@code nlu.NluTrainingModelReply}
 */
public final class NluTrainingModelReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nlu.NluTrainingModelReply)
    NluTrainingModelReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NluTrainingModelReply.newBuilder() to construct.
  private NluTrainingModelReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NluTrainingModelReply() {
    flowReference_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NluTrainingModelReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_NluTrainingModelReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_NluTrainingModelReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.class, net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.Builder.class);
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

  public static final int MODEL_FIELD_NUMBER = 2;
  private net.rossonet.ptalk.nlu.grpc.NluModel model_;
  /**
   * <code>.nlu.NluModel model = 2;</code>
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   * <code>.nlu.NluModel model = 2;</code>
   * @return The model.
   */
  @java.lang.Override
  public net.rossonet.ptalk.nlu.grpc.NluModel getModel() {
    return model_ == null ? net.rossonet.ptalk.nlu.grpc.NluModel.getDefaultInstance() : model_;
  }
  /**
   * <code>.nlu.NluModel model = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder getModelOrBuilder() {
    return getModel();
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.base.StatusValue status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.base.StatusValue status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public net.rossonet.ptalk.base.grpc.StatusValue getStatus() {
    @SuppressWarnings("deprecation")
    net.rossonet.ptalk.base.grpc.StatusValue result = net.rossonet.ptalk.base.grpc.StatusValue.valueOf(status_);
    return result == null ? net.rossonet.ptalk.base.grpc.StatusValue.UNRECOGNIZED : result;
  }

  public static final int TRAININGTIME_FIELD_NUMBER = 4;
  private long trainingTime_;
  /**
   * <code>int64 trainingTime = 4;</code>
   * @return The trainingTime.
   */
  @java.lang.Override
  public long getTrainingTime() {
    return trainingTime_;
  }

  public static final int TESTTIME_FIELD_NUMBER = 5;
  private long testTime_;
  /**
   * <code>int64 testTime = 5;</code>
   * @return The testTime.
   */
  @java.lang.Override
  public long getTestTime() {
    return testTime_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
    return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.base.Timestamp timestamp = 6;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
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
    if (model_ != null) {
      output.writeMessage(2, getModel());
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (trainingTime_ != 0L) {
      output.writeInt64(4, trainingTime_);
    }
    if (testTime_ != 0L) {
      output.writeInt64(5, testTime_);
    }
    if (timestamp_ != null) {
      output.writeMessage(6, getTimestamp());
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
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModel());
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (trainingTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, trainingTime_);
    }
    if (testTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, testTime_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getTimestamp());
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
    if (!(obj instanceof net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply other = (net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply) obj;

    if (!getFlowReference()
        .equals(other.getFlowReference())) return false;
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel()
          .equals(other.getModel())) return false;
    }
    if (status_ != other.status_) return false;
    if (getTrainingTime()
        != other.getTrainingTime()) return false;
    if (getTestTime()
        != other.getTestTime()) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + TRAININGTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrainingTime());
    hash = (37 * hash) + TESTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTestTime());
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply prototype) {
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
   * Protobuf type {@code nlu.NluTrainingModelReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nlu.NluTrainingModelReply)
      net.rossonet.ptalk.nlu.grpc.NluTrainingModelReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_NluTrainingModelReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_NluTrainingModelReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.class, net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.Builder.class);
    }

    // Construct using net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.newBuilder()
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

      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      status_ = 0;

      trainingTime_ = 0L;

      testTime_ = 0L;

      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_NluTrainingModelReply_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply getDefaultInstanceForType() {
      return net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply build() {
      net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply buildPartial() {
      net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply result = new net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply(this);
      result.flowReference_ = flowReference_;
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      result.status_ = status_;
      result.trainingTime_ = trainingTime_;
      result.testTime_ = testTime_;
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
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
      if (other instanceof net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply) {
        return mergeFrom((net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply other) {
      if (other == net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply.getDefaultInstance()) return this;
      if (!other.getFlowReference().isEmpty()) {
        flowReference_ = other.flowReference_;
        onChanged();
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getTrainingTime() != 0L) {
        setTrainingTime(other.getTrainingTime());
      }
      if (other.getTestTime() != 0L) {
        setTestTime(other.getTestTime());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
            case 18: {
              input.readMessage(
                  getModelFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              status_ = input.readEnum();

              break;
            } // case 24
            case 32: {
              trainingTime_ = input.readInt64();

              break;
            } // case 32
            case 40: {
              testTime_ = input.readInt64();

              break;
            } // case 40
            case 50: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 50
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

    private net.rossonet.ptalk.nlu.grpc.NluModel model_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.nlu.grpc.NluModel, net.rossonet.ptalk.nlu.grpc.NluModel.Builder, net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder> modelBuilder_;
    /**
     * <code>.nlu.NluModel model = 2;</code>
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     * @return The model.
     */
    public net.rossonet.ptalk.nlu.grpc.NluModel getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? net.rossonet.ptalk.nlu.grpc.NluModel.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public Builder setModel(net.rossonet.ptalk.nlu.grpc.NluModel value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public Builder setModel(
        net.rossonet.ptalk.nlu.grpc.NluModel.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public Builder mergeModel(net.rossonet.ptalk.nlu.grpc.NluModel value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
            net.rossonet.ptalk.nlu.grpc.NluModel.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public net.rossonet.ptalk.nlu.grpc.NluModel.Builder getModelBuilder() {
      
      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    public net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            net.rossonet.ptalk.nlu.grpc.NluModel.getDefaultInstance() : model_;
      }
    }
    /**
     * <code>.nlu.NluModel model = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.nlu.grpc.NluModel, net.rossonet.ptalk.nlu.grpc.NluModel.Builder, net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.nlu.grpc.NluModel, net.rossonet.ptalk.nlu.grpc.NluModel.Builder, net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.base.StatusValue status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.base.StatusValue status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.base.StatusValue status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public net.rossonet.ptalk.base.grpc.StatusValue getStatus() {
      @SuppressWarnings("deprecation")
      net.rossonet.ptalk.base.grpc.StatusValue result = net.rossonet.ptalk.base.grpc.StatusValue.valueOf(status_);
      return result == null ? net.rossonet.ptalk.base.grpc.StatusValue.UNRECOGNIZED : result;
    }
    /**
     * <code>.base.StatusValue status = 3;</code>
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
     * <code>.base.StatusValue status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private long trainingTime_ ;
    /**
     * <code>int64 trainingTime = 4;</code>
     * @return The trainingTime.
     */
    @java.lang.Override
    public long getTrainingTime() {
      return trainingTime_;
    }
    /**
     * <code>int64 trainingTime = 4;</code>
     * @param value The trainingTime to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingTime(long value) {
      
      trainingTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 trainingTime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainingTime() {
      
      trainingTime_ = 0L;
      onChanged();
      return this;
    }

    private long testTime_ ;
    /**
     * <code>int64 testTime = 5;</code>
     * @return The testTime.
     */
    @java.lang.Override
    public long getTestTime() {
      return testTime_;
    }
    /**
     * <code>int64 testTime = 5;</code>
     * @param value The testTime to set.
     * @return This builder for chaining.
     */
    public Builder setTestTime(long value) {
      
      testTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 testTime = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestTime() {
      
      testTime_ = 0L;
      onChanged();
      return this;
    }

    private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.base.Timestamp timestamp = 6;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
     */
    public net.rossonet.ptalk.base.grpc.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.Timestamp timestamp = 6;</code>
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
     * <code>.base.Timestamp timestamp = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:nlu.NluTrainingModelReply)
  }

  // @@protoc_insertion_point(class_scope:nlu.NluTrainingModelReply)
  private static final net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply();
  }

  public static net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NluTrainingModelReply>
      PARSER = new com.google.protobuf.AbstractParser<NluTrainingModelReply>() {
    @java.lang.Override
    public NluTrainingModelReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<NluTrainingModelReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NluTrainingModelReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

