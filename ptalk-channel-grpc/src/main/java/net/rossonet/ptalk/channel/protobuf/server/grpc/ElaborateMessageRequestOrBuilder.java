// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface ElaborateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.ElaborateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   * @return Whether the agentTarget field is set.
   */
  boolean hasAgentTarget();
  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   * @return The agentTarget.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentTarget();
  /**
   * <code>.channelGrpc.Agent agentTarget = 1;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentTargetOrBuilder();

  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   * @return Whether the agentSender field is set.
   */
  boolean hasAgentSender();
  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   * @return The agentSender.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender();
  /**
   * <code>.channelGrpc.Agent agentSender = 2;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder();

  /**
   * <code>string commandMessage = 3;</code>
   * @return The commandMessage.
   */
  java.lang.String getCommandMessage();
  /**
   * <code>string commandMessage = 3;</code>
   * @return The bytes for commandMessage.
   */
  com.google.protobuf.ByteString
      getCommandMessageBytes();

  /**
   * <code>string otp = 4;</code>
   * @return The otp.
   */
  java.lang.String getOtp();
  /**
   * <code>string otp = 4;</code>
   * @return The bytes for otp.
   */
  com.google.protobuf.ByteString
      getOtpBytes();
}
