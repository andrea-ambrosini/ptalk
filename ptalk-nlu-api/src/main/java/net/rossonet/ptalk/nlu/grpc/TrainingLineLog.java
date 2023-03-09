// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

/**
 * Protobuf type {@code nlu.TrainingLineLog}
 */
public final class TrainingLineLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nlu.TrainingLineLog)
    TrainingLineLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrainingLineLog.newBuilder() to construct.
  private TrainingLineLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrainingLineLog() {
    logLevel_ = "";
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrainingLineLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_TrainingLineLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_TrainingLineLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.nlu.grpc.TrainingLineLog.class, net.rossonet.ptalk.nlu.grpc.TrainingLineLog.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
    return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.base.Timestamp timestamp = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
  }

  public static final int LOGLEVEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object logLevel_;
  /**
   * <code>string logLevel = 2;</code>
   * @return The logLevel.
   */
  @java.lang.Override
  public java.lang.String getLogLevel() {
    java.lang.Object ref = logLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logLevel_ = s;
      return s;
    }
  }
  /**
   * <code>string logLevel = 2;</code>
   * @return The bytes for logLevel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogLevelBytes() {
    java.lang.Object ref = logLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logLevel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (timestamp_ != null) {
      output.writeMessage(1, getTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logLevel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, logLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logLevel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, logLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
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
    if (!(obj instanceof net.rossonet.ptalk.nlu.grpc.TrainingLineLog)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.nlu.grpc.TrainingLineLog other = (net.rossonet.ptalk.nlu.grpc.TrainingLineLog) obj;

    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (!getLogLevel()
        .equals(other.getLogLevel())) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (37 * hash) + LOGLEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLogLevel().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.nlu.grpc.TrainingLineLog prototype) {
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
   * Protobuf type {@code nlu.TrainingLineLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nlu.TrainingLineLog)
      net.rossonet.ptalk.nlu.grpc.TrainingLineLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_TrainingLineLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_TrainingLineLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.nlu.grpc.TrainingLineLog.class, net.rossonet.ptalk.nlu.grpc.TrainingLineLog.Builder.class);
    }

    // Construct using net.rossonet.ptalk.nlu.grpc.TrainingLineLog.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      logLevel_ = "";

      message_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.nlu.grpc.PtalkNluApi.internal_static_nlu_TrainingLineLog_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.TrainingLineLog getDefaultInstanceForType() {
      return net.rossonet.ptalk.nlu.grpc.TrainingLineLog.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.TrainingLineLog build() {
      net.rossonet.ptalk.nlu.grpc.TrainingLineLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.nlu.grpc.TrainingLineLog buildPartial() {
      net.rossonet.ptalk.nlu.grpc.TrainingLineLog result = new net.rossonet.ptalk.nlu.grpc.TrainingLineLog(this);
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
      result.logLevel_ = logLevel_;
      result.message_ = message_;
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
      if (other instanceof net.rossonet.ptalk.nlu.grpc.TrainingLineLog) {
        return mergeFrom((net.rossonet.ptalk.nlu.grpc.TrainingLineLog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.nlu.grpc.TrainingLineLog other) {
      if (other == net.rossonet.ptalk.nlu.grpc.TrainingLineLog.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (!other.getLogLevel().isEmpty()) {
        logLevel_ = other.logLevel_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              logLevel_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.base.Timestamp timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
     */
    public net.rossonet.ptalk.base.grpc.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.Timestamp timestamp = 1;</code>
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
     * <code>.base.Timestamp timestamp = 1;</code>
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

    private java.lang.Object logLevel_ = "";
    /**
     * <code>string logLevel = 2;</code>
     * @return The logLevel.
     */
    public java.lang.String getLogLevel() {
      java.lang.Object ref = logLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logLevel = 2;</code>
     * @return The bytes for logLevel.
     */
    public com.google.protobuf.ByteString
        getLogLevelBytes() {
      java.lang.Object ref = logLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logLevel = 2;</code>
     * @param value The logLevel to set.
     * @return This builder for chaining.
     */
    public Builder setLogLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logLevel = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogLevel() {
      
      logLevel_ = getDefaultInstance().getLogLevel();
      onChanged();
      return this;
    }
    /**
     * <code>string logLevel = 2;</code>
     * @param value The bytes for logLevel to set.
     * @return This builder for chaining.
     */
    public Builder setLogLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logLevel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 3;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:nlu.TrainingLineLog)
  }

  // @@protoc_insertion_point(class_scope:nlu.TrainingLineLog)
  private static final net.rossonet.ptalk.nlu.grpc.TrainingLineLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.nlu.grpc.TrainingLineLog();
  }

  public static net.rossonet.ptalk.nlu.grpc.TrainingLineLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrainingLineLog>
      PARSER = new com.google.protobuf.AbstractParser<TrainingLineLog>() {
    @java.lang.Override
    public TrainingLineLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrainingLineLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrainingLineLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.nlu.grpc.TrainingLineLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

