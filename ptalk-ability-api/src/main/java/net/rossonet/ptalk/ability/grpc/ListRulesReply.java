// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-ability-api.proto

package net.rossonet.ptalk.ability.grpc;

/**
 * Protobuf type {@code ability.ListRulesReply}
 */
public final class ListRulesReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ability.ListRulesReply)
    ListRulesReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRulesReply.newBuilder() to construct.
  private ListRulesReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRulesReply() {
    flowReference_ = "";
    rule_ = java.util.Collections.emptyList();
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRulesReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rossonet.ptalk.ability.grpc.ListRulesReply.class, net.rossonet.ptalk.ability.grpc.ListRulesReply.Builder.class);
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

  public static final int RULE_FIELD_NUMBER = 2;
  private java.util.List<net.rossonet.ptalk.ability.grpc.Rule> rule_;
  /**
   * <code>repeated .ability.Rule rule = 2;</code>
   */
  @java.lang.Override
  public java.util.List<net.rossonet.ptalk.ability.grpc.Rule> getRuleList() {
    return rule_;
  }
  /**
   * <code>repeated .ability.Rule rule = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rossonet.ptalk.ability.grpc.RuleOrBuilder> 
      getRuleOrBuilderList() {
    return rule_;
  }
  /**
   * <code>repeated .ability.Rule rule = 2;</code>
   */
  @java.lang.Override
  public int getRuleCount() {
    return rule_.size();
  }
  /**
   * <code>repeated .ability.Rule rule = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.ability.grpc.Rule getRule(int index) {
    return rule_.get(index);
  }
  /**
   * <code>repeated .ability.Rule rule = 2;</code>
   */
  @java.lang.Override
  public net.rossonet.ptalk.ability.grpc.RuleOrBuilder getRuleOrBuilder(
      int index) {
    return rule_.get(index);
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

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
  /**
   * <code>.base.Timestamp timestamp = 4;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.base.Timestamp timestamp = 4;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public net.rossonet.ptalk.base.grpc.Timestamp getTimestamp() {
    return timestamp_ == null ? net.rossonet.ptalk.base.grpc.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.base.Timestamp timestamp = 4;</code>
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
    for (int i = 0; i < rule_.size(); i++) {
      output.writeMessage(2, rule_.get(i));
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (timestamp_ != null) {
      output.writeMessage(4, getTimestamp());
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
    for (int i = 0; i < rule_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, rule_.get(i));
    }
    if (status_ != net.rossonet.ptalk.base.grpc.StatusValue.STATUS_GOOD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTimestamp());
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
    if (!(obj instanceof net.rossonet.ptalk.ability.grpc.ListRulesReply)) {
      return super.equals(obj);
    }
    net.rossonet.ptalk.ability.grpc.ListRulesReply other = (net.rossonet.ptalk.ability.grpc.ListRulesReply) obj;

    if (!getFlowReference()
        .equals(other.getFlowReference())) return false;
    if (!getRuleList()
        .equals(other.getRuleList())) return false;
    if (status_ != other.status_) return false;
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
    if (getRuleCount() > 0) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRuleList().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rossonet.ptalk.ability.grpc.ListRulesReply parseFrom(
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
  public static Builder newBuilder(net.rossonet.ptalk.ability.grpc.ListRulesReply prototype) {
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
   * Protobuf type {@code ability.ListRulesReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ability.ListRulesReply)
      net.rossonet.ptalk.ability.grpc.ListRulesReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rossonet.ptalk.ability.grpc.ListRulesReply.class, net.rossonet.ptalk.ability.grpc.ListRulesReply.Builder.class);
    }

    // Construct using net.rossonet.ptalk.ability.grpc.ListRulesReply.newBuilder()
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

      if (ruleBuilder_ == null) {
        rule_ = java.util.Collections.emptyList();
      } else {
        rule_ = null;
        ruleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;

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
      return net.rossonet.ptalk.ability.grpc.PtaskAbilityApi.internal_static_ability_ListRulesReply_descriptor;
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesReply getDefaultInstanceForType() {
      return net.rossonet.ptalk.ability.grpc.ListRulesReply.getDefaultInstance();
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesReply build() {
      net.rossonet.ptalk.ability.grpc.ListRulesReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rossonet.ptalk.ability.grpc.ListRulesReply buildPartial() {
      net.rossonet.ptalk.ability.grpc.ListRulesReply result = new net.rossonet.ptalk.ability.grpc.ListRulesReply(this);
      int from_bitField0_ = bitField0_;
      result.flowReference_ = flowReference_;
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rule_ = java.util.Collections.unmodifiableList(rule_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rule_ = rule_;
      } else {
        result.rule_ = ruleBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof net.rossonet.ptalk.ability.grpc.ListRulesReply) {
        return mergeFrom((net.rossonet.ptalk.ability.grpc.ListRulesReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rossonet.ptalk.ability.grpc.ListRulesReply other) {
      if (other == net.rossonet.ptalk.ability.grpc.ListRulesReply.getDefaultInstance()) return this;
      if (!other.getFlowReference().isEmpty()) {
        flowReference_ = other.flowReference_;
        onChanged();
      }
      if (ruleBuilder_ == null) {
        if (!other.rule_.isEmpty()) {
          if (rule_.isEmpty()) {
            rule_ = other.rule_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuleIsMutable();
            rule_.addAll(other.rule_);
          }
          onChanged();
        }
      } else {
        if (!other.rule_.isEmpty()) {
          if (ruleBuilder_.isEmpty()) {
            ruleBuilder_.dispose();
            ruleBuilder_ = null;
            rule_ = other.rule_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ruleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRuleFieldBuilder() : null;
          } else {
            ruleBuilder_.addAllMessages(other.rule_);
          }
        }
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              net.rossonet.ptalk.ability.grpc.Rule m =
                  input.readMessage(
                      net.rossonet.ptalk.ability.grpc.Rule.parser(),
                      extensionRegistry);
              if (ruleBuilder_ == null) {
                ensureRuleIsMutable();
                rule_.add(m);
              } else {
                ruleBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              status_ = input.readEnum();

              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.util.List<net.rossonet.ptalk.ability.grpc.Rule> rule_ =
      java.util.Collections.emptyList();
    private void ensureRuleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rule_ = new java.util.ArrayList<net.rossonet.ptalk.ability.grpc.Rule>(rule_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.ability.grpc.Rule, net.rossonet.ptalk.ability.grpc.Rule.Builder, net.rossonet.ptalk.ability.grpc.RuleOrBuilder> ruleBuilder_;

    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.ability.grpc.Rule> getRuleList() {
      if (ruleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rule_);
      } else {
        return ruleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public int getRuleCount() {
      if (ruleBuilder_ == null) {
        return rule_.size();
      } else {
        return ruleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public net.rossonet.ptalk.ability.grpc.Rule getRule(int index) {
      if (ruleBuilder_ == null) {
        return rule_.get(index);
      } else {
        return ruleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder setRule(
        int index, net.rossonet.ptalk.ability.grpc.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleIsMutable();
        rule_.set(index, value);
        onChanged();
      } else {
        ruleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder setRule(
        int index, net.rossonet.ptalk.ability.grpc.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        ensureRuleIsMutable();
        rule_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder addRule(net.rossonet.ptalk.ability.grpc.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleIsMutable();
        rule_.add(value);
        onChanged();
      } else {
        ruleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder addRule(
        int index, net.rossonet.ptalk.ability.grpc.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleIsMutable();
        rule_.add(index, value);
        onChanged();
      } else {
        ruleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder addRule(
        net.rossonet.ptalk.ability.grpc.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        ensureRuleIsMutable();
        rule_.add(builderForValue.build());
        onChanged();
      } else {
        ruleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder addRule(
        int index, net.rossonet.ptalk.ability.grpc.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        ensureRuleIsMutable();
        rule_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder addAllRule(
        java.lang.Iterable<? extends net.rossonet.ptalk.ability.grpc.Rule> values) {
      if (ruleBuilder_ == null) {
        ensureRuleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rule_);
        onChanged();
      } else {
        ruleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder clearRule() {
      if (ruleBuilder_ == null) {
        rule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ruleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public Builder removeRule(int index) {
      if (ruleBuilder_ == null) {
        ensureRuleIsMutable();
        rule_.remove(index);
        onChanged();
      } else {
        ruleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public net.rossonet.ptalk.ability.grpc.Rule.Builder getRuleBuilder(
        int index) {
      return getRuleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public net.rossonet.ptalk.ability.grpc.RuleOrBuilder getRuleOrBuilder(
        int index) {
      if (ruleBuilder_ == null) {
        return rule_.get(index);  } else {
        return ruleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public java.util.List<? extends net.rossonet.ptalk.ability.grpc.RuleOrBuilder> 
         getRuleOrBuilderList() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rule_);
      }
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public net.rossonet.ptalk.ability.grpc.Rule.Builder addRuleBuilder() {
      return getRuleFieldBuilder().addBuilder(
          net.rossonet.ptalk.ability.grpc.Rule.getDefaultInstance());
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public net.rossonet.ptalk.ability.grpc.Rule.Builder addRuleBuilder(
        int index) {
      return getRuleFieldBuilder().addBuilder(
          index, net.rossonet.ptalk.ability.grpc.Rule.getDefaultInstance());
    }
    /**
     * <code>repeated .ability.Rule rule = 2;</code>
     */
    public java.util.List<net.rossonet.ptalk.ability.grpc.Rule.Builder> 
         getRuleBuilderList() {
      return getRuleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rossonet.ptalk.ability.grpc.Rule, net.rossonet.ptalk.ability.grpc.Rule.Builder, net.rossonet.ptalk.ability.grpc.RuleOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rossonet.ptalk.ability.grpc.Rule, net.rossonet.ptalk.ability.grpc.Rule.Builder, net.rossonet.ptalk.ability.grpc.RuleOrBuilder>(
                rule_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
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

    private net.rossonet.ptalk.base.grpc.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rossonet.ptalk.base.grpc.Timestamp, net.rossonet.ptalk.base.grpc.Timestamp.Builder, net.rossonet.ptalk.base.grpc.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.base.Timestamp timestamp = 4;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
     */
    public net.rossonet.ptalk.base.grpc.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.Timestamp timestamp = 4;</code>
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
     * <code>.base.Timestamp timestamp = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:ability.ListRulesReply)
  }

  // @@protoc_insertion_point(class_scope:ability.ListRulesReply)
  private static final net.rossonet.ptalk.ability.grpc.ListRulesReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rossonet.ptalk.ability.grpc.ListRulesReply();
  }

  public static net.rossonet.ptalk.ability.grpc.ListRulesReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRulesReply>
      PARSER = new com.google.protobuf.AbstractParser<ListRulesReply>() {
    @java.lang.Override
    public ListRulesReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRulesReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRulesReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rossonet.ptalk.ability.grpc.ListRulesReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

