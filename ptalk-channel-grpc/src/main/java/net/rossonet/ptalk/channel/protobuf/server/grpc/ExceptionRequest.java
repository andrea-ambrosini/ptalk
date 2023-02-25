// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.ExceptionRequest}
 */
public final class ExceptionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.ExceptionRequest)
    ExceptionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExceptionRequest.newBuilder() to construct.
  private ExceptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExceptionRequest() {
    messageException_ = "";
    stackTraceException_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExceptionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ExceptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ExceptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.Builder.class);
  }

  public static final int AGENTSENDER_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return Whether the agentSender field is set.
   */
  @java.lang.Override
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return The agentSender.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender() {
    return agentSender_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
    return getAgentSender();
  }

  public static final int MESSAGEEXCEPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object messageException_;
  /**
   * <code>string messageException = 2;</code>
   * @return The messageException.
   */
  @java.lang.Override
  public java.lang.String getMessageException() {
    java.lang.Object ref = messageException_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageException_ = s;
      return s;
    }
  }
  /**
   * <code>string messageException = 2;</code>
   * @return The bytes for messageException.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageExceptionBytes() {
    java.lang.Object ref = messageException_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageException_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STACKTRACEEXCEPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object stackTraceException_;
  /**
   * <code>string stackTraceException = 3;</code>
   * @return The stackTraceException.
   */
  @java.lang.Override
  public java.lang.String getStackTraceException() {
    java.lang.Object ref = stackTraceException_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stackTraceException_ = s;
      return s;
    }
  }
  /**
   * <code>string stackTraceException = 3;</code>
   * @return The bytes for stackTraceException.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStackTraceExceptionBytes() {
    java.lang.Object ref = stackTraceException_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stackTraceException_ = b;
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
    if (agentSender_ != null) {
      output.writeMessage(1, getAgentSender());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageException_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, messageException_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stackTraceException_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stackTraceException_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentSender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentSender());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageException_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, messageException_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stackTraceException_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stackTraceException_);
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest other = (net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (!getMessageException()
        .equals(other.getMessageException())) return false;
    if (!getStackTraceException()
        .equals(other.getStackTraceException())) return false;
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
    if (hasAgentSender()) {
      hash = (37 * hash) + AGENTSENDER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentSender().hashCode();
    }
    hash = (37 * hash) + MESSAGEEXCEPTION_FIELD_NUMBER;
    hash = (53 * hash) + getMessageException().hashCode();
    hash = (37 * hash) + STACKTRACEEXCEPTION_FIELD_NUMBER;
    hash = (53 * hash) + getStackTraceException().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest prototype) {
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
   * Protobuf type {@code channelGrpc.ExceptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.ExceptionRequest)
      net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ExceptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ExceptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }
      messageException_ = "";

      stackTraceException_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ExceptionRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest result = new net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest(this);
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      result.messageException_ = messageException_;
      result.stackTraceException_ = stackTraceException_;
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (!other.getMessageException().isEmpty()) {
        messageException_ = other.messageException_;
        onChanged();
      }
      if (!other.getStackTraceException().isEmpty()) {
        stackTraceException_ = other.stackTraceException_;
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
                  getAgentSenderFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              messageException_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              stackTraceException_ = input.readStringRequireUtf8();

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

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     * @return Whether the agentSender field is set.
     */
    public boolean hasAgentSender() {
      return agentSenderBuilder_ != null || agentSender_ != null;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     * @return The agentSender.
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender() {
      if (agentSenderBuilder_ == null) {
        return agentSender_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
      } else {
        return agentSenderBuilder_.getMessage();
      }
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentSender_ = value;
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder setAgentSender(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder builderForValue) {
      if (agentSenderBuilder_ == null) {
        agentSender_ = builderForValue.build();
        onChanged();
      } else {
        agentSenderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder mergeAgentSender(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentSenderBuilder_ == null) {
        if (agentSender_ != null) {
          agentSender_ =
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.newBuilder(agentSender_).mergeFrom(value).buildPartial();
        } else {
          agentSender_ = value;
        }
        onChanged();
      } else {
        agentSenderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public Builder clearAgentSender() {
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
        onChanged();
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder getAgentSenderBuilder() {
      
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
      if (agentSenderBuilder_ != null) {
        return agentSenderBuilder_.getMessageOrBuilder();
      } else {
        return agentSender_ == null ?
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
      }
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> 
        getAgentSenderFieldBuilder() {
      if (agentSenderBuilder_ == null) {
        agentSenderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder>(
                getAgentSender(),
                getParentForChildren(),
                isClean());
        agentSender_ = null;
      }
      return agentSenderBuilder_;
    }

    private java.lang.Object messageException_ = "";
    /**
     * <code>string messageException = 2;</code>
     * @return The messageException.
     */
    public java.lang.String getMessageException() {
      java.lang.Object ref = messageException_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageException_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string messageException = 2;</code>
     * @return The bytes for messageException.
     */
    public com.google.protobuf.ByteString
        getMessageExceptionBytes() {
      java.lang.Object ref = messageException_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageException_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string messageException = 2;</code>
     * @param value The messageException to set.
     * @return This builder for chaining.
     */
    public Builder setMessageException(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageException_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string messageException = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageException() {
      
      messageException_ = getDefaultInstance().getMessageException();
      onChanged();
      return this;
    }
    /**
     * <code>string messageException = 2;</code>
     * @param value The bytes for messageException to set.
     * @return This builder for chaining.
     */
    public Builder setMessageExceptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageException_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stackTraceException_ = "";
    /**
     * <code>string stackTraceException = 3;</code>
     * @return The stackTraceException.
     */
    public java.lang.String getStackTraceException() {
      java.lang.Object ref = stackTraceException_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stackTraceException_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stackTraceException = 3;</code>
     * @return The bytes for stackTraceException.
     */
    public com.google.protobuf.ByteString
        getStackTraceExceptionBytes() {
      java.lang.Object ref = stackTraceException_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stackTraceException_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stackTraceException = 3;</code>
     * @param value The stackTraceException to set.
     * @return This builder for chaining.
     */
    public Builder setStackTraceException(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stackTraceException_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stackTraceException = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStackTraceException() {
      
      stackTraceException_ = getDefaultInstance().getStackTraceException();
      onChanged();
      return this;
    }
    /**
     * <code>string stackTraceException = 3;</code>
     * @param value The bytes for stackTraceException to set.
     * @return This builder for chaining.
     */
    public Builder setStackTraceExceptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stackTraceException_ = value;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.ExceptionRequest)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.ExceptionRequest)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExceptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExceptionRequest>() {
    @java.lang.Override
    public ExceptionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExceptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExceptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.ExceptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

