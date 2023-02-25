// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.ChatMessage}
 */
public final class ChatMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.ChatMessage)
    ChatMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatMessage.newBuilder() to construct.
  private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatMessage() {
    messageTxt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ChatMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ChatMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.Builder.class);
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

  public static final int AGENTDESTINATION_FIELD_NUMBER = 2;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentDestination_;
  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   * @return Whether the agentDestination field is set.
   */
  @java.lang.Override
  public boolean hasAgentDestination() {
    return agentDestination_ != null;
  }
  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   * @return The agentDestination.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentDestination() {
    return agentDestination_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentDestination_;
  }
  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentDestinationOrBuilder() {
    return getAgentDestination();
  }

  public static final int MESSAGETXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object messageTxt_;
  /**
   * <code>string messageTxt = 3;</code>
   * @return The messageTxt.
   */
  @java.lang.Override
  public java.lang.String getMessageTxt() {
    java.lang.Object ref = messageTxt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageTxt_ = s;
      return s;
    }
  }
  /**
   * <code>string messageTxt = 3;</code>
   * @return The bytes for messageTxt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageTxtBytes() {
    java.lang.Object ref = messageTxt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageTxt_ = b;
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
    if (agentDestination_ != null) {
      output.writeMessage(2, getAgentDestination());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageTxt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageTxt_);
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
    if (agentDestination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgentDestination());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageTxt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageTxt_);
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage other = (net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage) obj;

    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (hasAgentDestination() != other.hasAgentDestination()) return false;
    if (hasAgentDestination()) {
      if (!getAgentDestination()
          .equals(other.getAgentDestination())) return false;
    }
    if (!getMessageTxt()
        .equals(other.getMessageTxt())) return false;
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
    if (hasAgentDestination()) {
      hash = (37 * hash) + AGENTDESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getAgentDestination().hashCode();
    }
    hash = (37 * hash) + MESSAGETXT_FIELD_NUMBER;
    hash = (53 * hash) + getMessageTxt().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage prototype) {
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
   * Protobuf type {@code channelGrpc.ChatMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.ChatMessage)
      net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ChatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.newBuilder()
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
      if (agentDestinationBuilder_ == null) {
        agentDestination_ = null;
      } else {
        agentDestination_ = null;
        agentDestinationBuilder_ = null;
      }
      messageTxt_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ChatMessage_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage result = new net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage(this);
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      if (agentDestinationBuilder_ == null) {
        result.agentDestination_ = agentDestination_;
      } else {
        result.agentDestination_ = agentDestinationBuilder_.build();
      }
      result.messageTxt_ = messageTxt_;
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage.getDefaultInstance()) return this;
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (other.hasAgentDestination()) {
        mergeAgentDestination(other.getAgentDestination());
      }
      if (!other.getMessageTxt().isEmpty()) {
        messageTxt_ = other.messageTxt_;
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
              input.readMessage(
                  getAgentDestinationFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              messageTxt_ = input.readStringRequireUtf8();

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

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> agentDestinationBuilder_;
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     * @return Whether the agentDestination field is set.
     */
    public boolean hasAgentDestination() {
      return agentDestinationBuilder_ != null || agentDestination_ != null;
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     * @return The agentDestination.
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentDestination() {
      if (agentDestinationBuilder_ == null) {
        return agentDestination_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentDestination_;
      } else {
        return agentDestinationBuilder_.getMessage();
      }
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public Builder setAgentDestination(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentDestination_ = value;
        onChanged();
      } else {
        agentDestinationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public Builder setAgentDestination(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder builderForValue) {
      if (agentDestinationBuilder_ == null) {
        agentDestination_ = builderForValue.build();
        onChanged();
      } else {
        agentDestinationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public Builder mergeAgentDestination(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentDestinationBuilder_ == null) {
        if (agentDestination_ != null) {
          agentDestination_ =
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.newBuilder(agentDestination_).mergeFrom(value).buildPartial();
        } else {
          agentDestination_ = value;
        }
        onChanged();
      } else {
        agentDestinationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public Builder clearAgentDestination() {
      if (agentDestinationBuilder_ == null) {
        agentDestination_ = null;
        onChanged();
      } else {
        agentDestination_ = null;
        agentDestinationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder getAgentDestinationBuilder() {
      
      onChanged();
      return getAgentDestinationFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentDestinationOrBuilder() {
      if (agentDestinationBuilder_ != null) {
        return agentDestinationBuilder_.getMessageOrBuilder();
      } else {
        return agentDestination_ == null ?
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentDestination_;
      }
    }
    /**
     * <code>.channelGrpc.Agent agentDestination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> 
        getAgentDestinationFieldBuilder() {
      if (agentDestinationBuilder_ == null) {
        agentDestinationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder>(
                getAgentDestination(),
                getParentForChildren(),
                isClean());
        agentDestination_ = null;
      }
      return agentDestinationBuilder_;
    }

    private java.lang.Object messageTxt_ = "";
    /**
     * <code>string messageTxt = 3;</code>
     * @return The messageTxt.
     */
    public java.lang.String getMessageTxt() {
      java.lang.Object ref = messageTxt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageTxt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string messageTxt = 3;</code>
     * @return The bytes for messageTxt.
     */
    public com.google.protobuf.ByteString
        getMessageTxtBytes() {
      java.lang.Object ref = messageTxt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageTxt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string messageTxt = 3;</code>
     * @param value The messageTxt to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTxt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageTxt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string messageTxt = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageTxt() {
      
      messageTxt_ = getDefaultInstance().getMessageTxt();
      onChanged();
      return this;
    }
    /**
     * <code>string messageTxt = 3;</code>
     * @param value The bytes for messageTxt to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTxtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageTxt_ = value;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.ChatMessage)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.ChatMessage)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatMessage>
      PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
    @java.lang.Override
    public ChatMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChatMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.ChatMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

