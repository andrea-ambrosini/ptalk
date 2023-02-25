// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.ListAgentsRequestReply}
 */
public final class ListAgentsRequestReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.ListAgentsRequestReply)
    ListAgentsRequestReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAgentsRequestReply.newBuilder() to construct.
  private ListAgentsRequestReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAgentsRequestReply() {
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAgentsRequestReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListAgentsRequestReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListAgentsRequestReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Status result_;
  /**
   * <code>.channelGrpc.Status result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.channelGrpc.Status result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Status getResult() {
    return result_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance() : result_;
  }
  /**
   * <code>.channelGrpc.Status result = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int REQUESTS_FIELD_NUMBER = 2;
  private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest> requests_;
  /**
   * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest> getRequestsList() {
    return requests_;
  }
  /**
   * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder> 
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply other = (net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (!getRequestsList()
        .equals(other.getRequestsList())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply prototype) {
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
   * Protobuf type {@code channelGrpc.ListAgentsRequestReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.ListAgentsRequestReply)
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListAgentsRequestReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListAgentsRequestReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
      } else {
        requests_ = null;
        requestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListAgentsRequestReply_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply result = new net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply(this);
      int from_bitField0_ = bitField0_;
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequestsFieldBuilder() : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
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
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest m =
                  input.readMessage(
                      net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.parser(),
                      extensionRegistry);
              if (requestsBuilder_ == null) {
                ensureRequestsIsMutable();
                requests_.add(m);
              } else {
                requestsBuilder_.addMessage(m);
              }
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

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Status result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Status, net.rossonet.ptalk.channel.protobuf.server.grpc.Status.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder> resultBuilder_;
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     * @return The result.
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public Builder setResult(net.rossonet.ptalk.channel.protobuf.server.grpc.Status value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public Builder setResult(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Status.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public Builder mergeResult(net.rossonet.ptalk.channel.protobuf.server.grpc.Status value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            net.rossonet.ptalk.channel.protobuf.server.grpc.Status.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Status.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            net.rossonet.ptalk.channel.protobuf.server.grpc.Status.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.channelGrpc.Status result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Status, net.rossonet.ptalk.channel.protobuf.server.grpc.Status.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Status, net.rossonet.ptalk.channel.protobuf.server.grpc.Status.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest> requests_ =
      java.util.Collections.emptyList();
    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requests_ = new java.util.ArrayList<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest>(requests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder> requestsBuilder_;

    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest> getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder addRequests(net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder addRequests(
        net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest> values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);  } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder> 
         getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder().addBuilder(
          net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.AgentRequest requests = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder> 
         getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequest.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentRequestOrBuilder>(
                requests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.ListAgentsRequestReply)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.ListAgentsRequestReply)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAgentsRequestReply>
      PARSER = new com.google.protobuf.AbstractParser<ListAgentsRequestReply>() {
    @java.lang.Override
    public ListAgentsRequestReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAgentsRequestReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAgentsRequestReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.ListAgentsRequestReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

