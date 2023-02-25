// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface CommandReplyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.CommandReplyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uniqueIdRequest = 1;</code>
   * @return The uniqueIdRequest.
   */
  java.lang.String getUniqueIdRequest();
  /**
   * <code>string uniqueIdRequest = 1;</code>
   * @return The bytes for uniqueIdRequest.
   */
  com.google.protobuf.ByteString
      getUniqueIdRequestBytes();

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
   * <code>.channelGrpc.Agent agentDestination = 3;</code>
   * @return Whether the agentDestination field is set.
   */
  boolean hasAgentDestination();
  /**
   * <code>.channelGrpc.Agent agentDestination = 3;</code>
   * @return The agentDestination.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Agent getAgentDestination();
  /**
   * <code>.channelGrpc.Agent agentDestination = 3;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.AgentOrBuilder getAgentDestinationOrBuilder();

  /**
   * <code>repeated string replies = 4;</code>
   * @return A list containing the replies.
   */
  java.util.List<java.lang.String>
      getRepliesList();
  /**
   * <code>repeated string replies = 4;</code>
   * @return The count of replies.
   */
  int getRepliesCount();
  /**
   * <code>repeated string replies = 4;</code>
   * @param index The index of the element to return.
   * @return The replies at the given index.
   */
  java.lang.String getReplies(int index);
  /**
   * <code>repeated string replies = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the replies at the given index.
   */
  com.google.protobuf.ByteString
      getRepliesBytes(int index);

  /**
   * <code>repeated string errors = 5;</code>
   * @return A list containing the errors.
   */
  java.util.List<java.lang.String>
      getErrorsList();
  /**
   * <code>repeated string errors = 5;</code>
   * @return The count of errors.
   */
  int getErrorsCount();
  /**
   * <code>repeated string errors = 5;</code>
   * @param index The index of the element to return.
   * @return The errors at the given index.
   */
  java.lang.String getErrors(int index);
  /**
   * <code>repeated string errors = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the errors at the given index.
   */
  com.google.protobuf.ByteString
      getErrorsBytes(int index);

  /**
   * <code>.channelGrpc.ResponseNetworkChannel tunnelReply = 6;</code>
   * @return Whether the tunnelReply field is set.
   */
  boolean hasTunnelReply();
  /**
   * <code>.channelGrpc.ResponseNetworkChannel tunnelReply = 6;</code>
   * @return The tunnelReply.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannel getTunnelReply();
  /**
   * <code>.channelGrpc.ResponseNetworkChannel tunnelReply = 6;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.ResponseNetworkChannelOrBuilder getTunnelReplyOrBuilder();

  /**
   * <code>string base64Config = 7;</code>
   * @return The base64Config.
   */
  java.lang.String getBase64Config();
  /**
   * <code>string base64Config = 7;</code>
   * @return The bytes for base64Config.
   */
  com.google.protobuf.ByteString
      getBase64ConfigBytes();

  /**
   * <code>int64 restartAt = 8;</code>
   * @return The restartAt.
   */
  long getRestartAt();
}
