// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf type {@code channelGrpc.ListCommandsReply}
 */
public final class ListCommandsReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:channelGrpc.ListCommandsReply)
    ListCommandsReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCommandsReply.newBuilder() to construct.
  private ListCommandsReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCommandsReply() {
    commands_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCommandsReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListCommandsReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListCommandsReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.Builder.class);
  }

  public static final int COMMANDS_FIELD_NUMBER = 1;
  private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.Command> commands_;
  /**
   * <code>repeated .channelGrpc.Command commands = 1;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.Command> getCommandsList() {
    return commands_;
  }
  /**
   * <code>repeated .channelGrpc.Command commands = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder> 
      getCommandsOrBuilderList() {
    return commands_;
  }
  /**
   * <code>repeated .channelGrpc.Command commands = 1;</code>
   */
  @java.lang.Override
  public int getCommandsCount() {
    return commands_.size();
  }
  /**
   * <code>repeated .channelGrpc.Command commands = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.Command getCommands(int index) {
    return commands_.get(index);
  }
  /**
   * <code>repeated .channelGrpc.Command commands = 1;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder getCommandsOrBuilder(
      int index) {
    return commands_.get(index);
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
    for (int i = 0; i < commands_.size(); i++) {
      output.writeMessage(1, commands_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < commands_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, commands_.get(i));
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
    if (!(obj instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply other = (net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply) obj;

    if (!getCommandsList()
        .equals(other.getCommandsList())) return false;
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
    if (getCommandsCount() > 0) {
      hash = (37 * hash) + COMMANDS_FIELD_NUMBER;
      hash = (53 * hash) + getCommandsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply prototype) {
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
   * Protobuf type {@code channelGrpc.ListCommandsReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:channelGrpc.ListCommandsReply)
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListCommandsReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListCommandsReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.class, net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.Builder.class);
    }

    // Construct using net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commandsBuilder_ == null) {
        commands_ = java.util.Collections.emptyList();
      } else {
        commands_ = null;
        commandsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.internal_static_channelGrpc_ListCommandsReply_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply getDefaultInstanceForType() {
      return net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply build() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply buildPartial() {
      net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply result = new net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply(this);
      int from_bitField0_ = bitField0_;
      if (commandsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          commands_ = java.util.Collections.unmodifiableList(commands_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.commands_ = commands_;
      } else {
        result.commands_ = commandsBuilder_.build();
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
      if (other instanceof net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply) {
        return mergeFrom((net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply other) {
      if (other == net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply.getDefaultInstance()) return this;
      if (commandsBuilder_ == null) {
        if (!other.commands_.isEmpty()) {
          if (commands_.isEmpty()) {
            commands_ = other.commands_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommandsIsMutable();
            commands_.addAll(other.commands_);
          }
          onChanged();
        }
      } else {
        if (!other.commands_.isEmpty()) {
          if (commandsBuilder_.isEmpty()) {
            commandsBuilder_.dispose();
            commandsBuilder_ = null;
            commands_ = other.commands_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commandsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommandsFieldBuilder() : null;
          } else {
            commandsBuilder_.addAllMessages(other.commands_);
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
              net.rossonet.ptalk.channel.protobuf.server.grpc.Command m =
                  input.readMessage(
                      net.rossonet.ptalk.channel.protobuf.server.grpc.Command.parser(),
                      extensionRegistry);
              if (commandsBuilder_ == null) {
                ensureCommandsIsMutable();
                commands_.add(m);
              } else {
                commandsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.Command> commands_ =
      java.util.Collections.emptyList();
    private void ensureCommandsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        commands_ = new java.util.ArrayList<net.rossonet.ptalk.channel.protobuf.server.grpc.Command>(commands_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Command, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder> commandsBuilder_;

    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.Command> getCommandsList() {
      if (commandsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commands_);
      } else {
        return commandsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public int getCommandsCount() {
      if (commandsBuilder_ == null) {
        return commands_.size();
      } else {
        return commandsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Command getCommands(int index) {
      if (commandsBuilder_ == null) {
        return commands_.get(index);
      } else {
        return commandsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder setCommands(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.Command value) {
      if (commandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommandsIsMutable();
        commands_.set(index, value);
        onChanged();
      } else {
        commandsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder setCommands(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder builderForValue) {
      if (commandsBuilder_ == null) {
        ensureCommandsIsMutable();
        commands_.set(index, builderForValue.build());
        onChanged();
      } else {
        commandsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder addCommands(net.rossonet.ptalk.channel.protobuf.server.grpc.Command value) {
      if (commandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommandsIsMutable();
        commands_.add(value);
        onChanged();
      } else {
        commandsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder addCommands(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.Command value) {
      if (commandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommandsIsMutable();
        commands_.add(index, value);
        onChanged();
      } else {
        commandsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder addCommands(
        net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder builderForValue) {
      if (commandsBuilder_ == null) {
        ensureCommandsIsMutable();
        commands_.add(builderForValue.build());
        onChanged();
      } else {
        commandsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder addCommands(
        int index, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder builderForValue) {
      if (commandsBuilder_ == null) {
        ensureCommandsIsMutable();
        commands_.add(index, builderForValue.build());
        onChanged();
      } else {
        commandsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder addAllCommands(
        java.lang.Iterable<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.Command> values) {
      if (commandsBuilder_ == null) {
        ensureCommandsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commands_);
        onChanged();
      } else {
        commandsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder clearCommands() {
      if (commandsBuilder_ == null) {
        commands_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commandsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public Builder removeCommands(int index) {
      if (commandsBuilder_ == null) {
        ensureCommandsIsMutable();
        commands_.remove(index);
        onChanged();
      } else {
        commandsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder getCommandsBuilder(
        int index) {
      return getCommandsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder getCommandsOrBuilder(
        int index) {
      if (commandsBuilder_ == null) {
        return commands_.get(index);  } else {
        return commandsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder> 
         getCommandsOrBuilderList() {
      if (commandsBuilder_ != null) {
        return commandsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commands_);
      }
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder addCommandsBuilder() {
      return getCommandsFieldBuilder().addBuilder(
          net.rossonet.ptalk.channel.protobuf.server.grpc.Command.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder addCommandsBuilder(
        int index) {
      return getCommandsFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.getDefaultInstance());
    }
    /**
     * <code>repeated .channelGrpc.Command commands = 1;</code>
     */
    public java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder> 
         getCommandsBuilderList() {
      return getCommandsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.channel.protobuf.server.grpc.Command, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder> 
        getCommandsFieldBuilder() {
      if (commandsBuilder_ == null) {
        commandsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.channel.protobuf.server.grpc.Command, net.rossonet.ptalk.channel.protobuf.server.grpc.Command.Builder, net.rossonet.ptalk.channel.protobuf.server.grpc.CommandOrBuilder>(
                commands_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        commands_ = null;
      }
      return commandsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:channelGrpc.ListCommandsReply)
  }

  // @@protoc_insertion_point(class_scope:channelGrpc.ListCommandsReply)
  private static final net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply();
  }

  public static net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCommandsReply>
      PARSER = new com.google.protobuf.AbstractParser<ListCommandsReply>() {
    @java.lang.Override
    public ListCommandsReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCommandsReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCommandsReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.channel.protobuf.server.grpc.ListCommandsReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

