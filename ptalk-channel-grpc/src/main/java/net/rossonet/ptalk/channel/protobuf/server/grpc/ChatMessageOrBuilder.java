// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface ChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.ChatMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return Whether the agentSender field is set.
   */
  boolean hasAgentSender();
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   * @return The agentSender.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentSender();
  /**
   * <code>.channelGrpc.Agent agentSender = 1;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentSenderOrBuilder();

  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   * @return Whether the agentDestination field is set.
   */
  boolean hasAgentDestination();
  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   * @return The agentDestination.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentDestination();
  /**
   * <code>.channelGrpc.Agent agentDestination = 2;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentDestinationOrBuilder();

  /**
   * <code>string messageTxt = 3;</code>
   * @return The messageTxt.
   */
  java.lang.String getMessageTxt();
  /**
   * <code>string messageTxt = 3;</code>
   * @return The bytes for messageTxt.
   */
  com.google.protobuf.ByteString
      getMessageTxtBytes();
}