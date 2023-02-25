// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.CompleteCommandRequest}
 */
public final class CompleteCommandRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.CompleteCommandRequest)
    CompleteCommandRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteCommandRequest.newBuilder() to construct.
  private CompleteCommandRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteCommandRequest() {
    words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteCommandRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_CompleteCommandRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_CompleteCommandRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.Builder.class);
  }

  public static final int AGENTTARGET_FIELD_NUMBER = 1;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentTarget_;
  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   * @return Whether the agentTarget field is set.
   */
  @java.lang.Override
  public boolean hasAgentTarget() {
    return agentTarget_ != null;
  }
  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   * @return The agentTarget.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentTarget() {
    return agentTarget_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentTarget_;
  }
  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentTargetOrBuilder() {
    return getAgentTarget();
  }

  public static final int AGENTSENDER_FIELD_NUMBER = 2;
  private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   * @return Whether the agentSender field is set.
   */
  @java.lang.Override
  public boolean hasAgentSender() {
    return agentSender_ != null;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   * @return The agentSender.
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender() {
    return agentSender_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentSender_;
  }
  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder() {
    return getAgentSender();
  }

  public static final int WORDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList words_;
  /**
   * <code>repeated string words = 3;</code>
   * @return A list containing the words.
   */
  public com.google.protobuf.ProtocolStringList
      getWordsList() {
    return words_;
  }
  /**
   * <code>repeated string words = 3;</code>
   * @return The count of words.
   */
  public int getWordsCount() {
    return words_.size();
  }
  /**
   * <code>repeated string words = 3;</code>
   * @param index The index of the element to return.
   * @return The words at the given index.
   */
  public java.lang.String getWords(int index) {
    return words_.get(index);
  }
  /**
   * <code>repeated string words = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the words at the given index.
   */
  public com.google.protobuf.ByteString
      getWordsBytes(int index) {
    return words_.getByteString(index);
  }

  public static final int WORDINDEX_FIELD_NUMBER = 4;
  private int wordIndex_;
  /**
   * <code>int32 wordIndex = 4;</code>
   * @return The wordIndex.
   */
  @java.lang.Override
  public int getWordIndex() {
    return wordIndex_;
  }

  public static final int POSITION_FIELD_NUMBER = 5;
  private int position_;
  /**
   * <code>int32 position = 5;</code>
   * @return The position.
   */
  @java.lang.Override
  public int getPosition() {
    return position_;
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
    if (agentTarget_ != null) {
      output.writeMessage(1, getAgentTarget());
    }
    if (agentSender_ != null) {
      output.writeMessage(2, getAgentSender());
    }
    for (int i = 0; i < words_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, words_.getRaw(i));
    }
    if (wordIndex_ != 0) {
      output.writeInt32(4, wordIndex_);
    }
    if (position_ != 0) {
      output.writeInt32(5, position_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentTarget_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentTarget());
    }
    if (agentSender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgentSender());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < words_.size(); i++) {
        dataSize += computeStringSizeNoTag(words_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWordsList().size();
    }
    if (wordIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, wordIndex_);
    }
    if (position_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, position_);
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest other = (net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest) obj;

    if (hasAgentTarget() != other.hasAgentTarget()) return false;
    if (hasAgentTarget()) {
      if (!getAgentTarget()
          .equals(other.getAgentTarget())) return false;
    }
    if (hasAgentSender() != other.hasAgentSender()) return false;
    if (hasAgentSender()) {
      if (!getAgentSender()
          .equals(other.getAgentSender())) return false;
    }
    if (!getWordsList()
        .equals(other.getWordsList())) return false;
    if (getWordIndex()
        != other.getWordIndex()) return false;
    if (getPosition()
        != other.getPosition()) return false;
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
    if (hasAgentTarget()) {
      hash = (37 * hash) + AGENTTARGET_FIELD_NUMBER;
      hash = (53 * hash) + getAgentTarget().hashCode();
    }
    if (hasAgentSender()) {
      hash = (37 * hash) + AGENTSENDER_FIELD_NUMBER;
      hash = (53 * hash) + getAgentSender().hashCode();
    }
    if (getWordsCount() > 0) {
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWordsList().hashCode();
    }
    hash = (37 * hash) + WORDINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getWordIndex();
    hash = (37 * hash) + POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getPosition();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest prototype) {
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
   * Protobuf type {@code channelGrpc.CompleteCommandRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.CompleteCommandRequest)
      net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_CompleteCommandRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_CompleteCommandRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.class, net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (agentTargetBuilder_ == null) {
        agentTarget_ = null;
      } else {
        agentTarget_ = null;
        agentTargetBuilder_ = null;
      }
      if (agentSenderBuilder_ == null) {
        agentSender_ = null;
      } else {
        agentSender_ = null;
        agentSenderBuilder_ = null;
      }
      words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      wordIndex_ = 0;

      position_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_CompleteCommandRequest_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest result = new net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest(this);
      int from_bitField0_ = bitField0_;
      if (agentTargetBuilder_ == null) {
        result.agentTarget_ = agentTarget_;
      } else {
        result.agentTarget_ = agentTargetBuilder_.build();
      }
      if (agentSenderBuilder_ == null) {
        result.agentSender_ = agentSender_;
      } else {
        result.agentSender_ = agentSenderBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        words_ = words_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.words_ = words_;
      result.wordIndex_ = wordIndex_;
      result.position_ = position_;
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest.getDefaultInstance()) return this;
      if (other.hasAgentTarget()) {
        mergeAgentTarget(other.getAgentTarget());
      }
      if (other.hasAgentSender()) {
        mergeAgentSender(other.getAgentSender());
      }
      if (!other.words_.isEmpty()) {
        if (words_.isEmpty()) {
          words_ = other.words_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWordsIsMutable();
          words_.addAll(other.words_);
        }
        onChanged();
      }
      if (other.getWordIndex() != 0) {
        setWordIndex(other.getWordIndex());
      }
      if (other.getPosition() != 0) {
        setPosition(other.getPosition());
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
                  getAgentTargetFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAgentSenderFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureWordsIsMutable();
              words_.add(s);
              break;
            } // case 26
            case 32: {
              wordIndex_ = input.readInt32();

              break;
            } // case 32
            case 40: {
              position_ = input.readInt32();

              break;
            } // case 40
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

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentTarget_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> agentTargetBuilder_;
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     * @return Whether the agentTarget field is set.
     */
    public boolean hasAgentTarget() {
      return agentTargetBuilder_ != null || agentTarget_ != null;
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     * @return The agentTarget.
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentTarget() {
      if (agentTargetBuilder_ == null) {
        return agentTarget_ == null ? net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentTarget_;
      } else {
        return agentTargetBuilder_.getMessage();
      }
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public Builder setAgentTarget(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentTargetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentTarget_ = value;
        onChanged();
      } else {
        agentTargetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public Builder setAgentTarget(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder builderForValue) {
      if (agentTargetBuilder_ == null) {
        agentTarget_ = builderForValue.build();
        onChanged();
      } else {
        agentTargetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public Builder mergeAgentTarget(net.rossonet.ptalk.channel.protobuf.server.grpc.Agent value) {
      if (agentTargetBuilder_ == null) {
        if (agentTarget_ != null) {
          agentTarget_ =
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.newBuilder(agentTarget_).mergeFrom(value).buildPartial();
        } else {
          agentTarget_ = value;
        }
        onChanged();
      } else {
        agentTargetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public Builder clearAgentTarget() {
      if (agentTargetBuilder_ == null) {
        agentTarget_ = null;
        onChanged();
      } else {
        agentTarget_ = null;
        agentTargetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder getAgentTargetBuilder() {
      
      onChanged();
      return getAgentTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentTargetOrBuilder() {
      if (agentTargetBuilder_ != null) {
        return agentTargetBuilder_.getMessageOrBuilder();
      } else {
        return agentTarget_ == null ?
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.getDefaultInstance() : agentTarget_;
      }
    }
    /**
     * <code>.channelGrpc.Agent agentTarget = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> 
        getAgentTargetFieldBuilder() {
      if (agentTargetBuilder_ == null) {
        agentTargetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder>(
                getAgentTarget(),
                getParentForChildren(),
                isClean());
        agentTarget_ = null;
      }
      return agentTargetBuilder_;
    }

    private net.rossonet.ptalk.channel.protobuf.server.grpc.Agent agentSender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Agent, net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder> agentSenderBuilder_;
    /**
     * <code>.channelGrpc.Agent agentSender = 2;</code>
     * @return Whether the agentSender field is set.
     */
    public boolean hasAgentSender() {
      return agentSenderBuilder_ != null || agentSender_ != null;
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Agent.Builder getAgentSenderBuilder() {
      
      onChanged();
      return getAgentSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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
     * <code>.channelGrpc.Agent agentSender = 2;</code>
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

    private com.google.protobuf.LazyStringList words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        words_ = new com.google.protobuf.LazyStringArrayList(words_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string words = 3;</code>
     * @return A list containing the words.
     */
    public com.google.protobuf.ProtocolStringList
        getWordsList() {
      return words_.getUnmodifiableView();
    }
    /**
     * <code>repeated string words = 3;</code>
     * @return The count of words.
     */
    public int getWordsCount() {
      return words_.size();
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param index The index of the element to return.
     * @return The words at the given index.
     */
    public java.lang.String getWords(int index) {
      return words_.get(index);
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the words at the given index.
     */
    public com.google.protobuf.ByteString
        getWordsBytes(int index) {
      return words_.getByteString(index);
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param index The index to set the value at.
     * @param value The words to set.
     * @return This builder for chaining.
     */
    public Builder setWords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWordsIsMutable();
      words_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param value The words to add.
     * @return This builder for chaining.
     */
    public Builder addWords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWordsIsMutable();
      words_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param values The words to add.
     * @return This builder for chaining.
     */
    public Builder addAllWords(
        java.lang.Iterable<java.lang.String> values) {
      ensureWordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, words_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string words = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWords() {
      words_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string words = 3;</code>
     * @param value The bytes of the words to add.
     * @return This builder for chaining.
     */
    public Builder addWordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWordsIsMutable();
      words_.add(value);
      onChanged();
      return this;
    }

    private int wordIndex_ ;
    /**
     * <code>int32 wordIndex = 4;</code>
     * @return The wordIndex.
     */
    @java.lang.Override
    public int getWordIndex() {
      return wordIndex_;
    }
    /**
     * <code>int32 wordIndex = 4;</code>
     * @param value The wordIndex to set.
     * @return This builder for chaining.
     */
    public Builder setWordIndex(int value) {
      
      wordIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 wordIndex = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWordIndex() {
      
      wordIndex_ = 0;
      onChanged();
      return this;
    }

    private int position_ ;
    /**
     * <code>int32 position = 5;</code>
     * @return The position.
     */
    @java.lang.Override
    public int getPosition() {
      return position_;
    }
    /**
     * <code>int32 position = 5;</code>
     * @param value The position to set.
     * @return This builder for chaining.
     */
    public Builder setPosition(int value) {
      
      position_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 position = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPosition() {
      
      position_ = 0;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.CompleteCommandRequest)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.CompleteCommandRequest)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteCommandRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompleteCommandRequest>() {
    @java.lang.Override
    public CompleteCommandRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompleteCommandRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteCommandRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.CompleteCommandRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

