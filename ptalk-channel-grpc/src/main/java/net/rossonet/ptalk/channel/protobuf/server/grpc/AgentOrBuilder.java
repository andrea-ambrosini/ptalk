// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface AgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.Agent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string agentUniqueName = 1;</code>
   * @return The agentUniqueName.
   */
  java.lang.String getAgentUniqueName();
  /**
   * <code>string agentUniqueName = 1;</code>
   * @return The bytes for agentUniqueName.
   */
  com.google.protobuf.ByteString
      getAgentUniqueNameBytes();

  /**
   * <code>string shortDescription = 2;</code>
   * @return The shortDescription.
   */
  java.lang.String getShortDescription();
  /**
   * <code>string shortDescription = 2;</code>
   * @return The bytes for shortDescription.
   */
  com.google.protobuf.ByteString
      getShortDescriptionBytes();

  /**
   * <code>.channelGrpc.RegisterReply registerData = 3;</code>
   * @return Whether the registerData field is set.
   */
  boolean hasRegisterData();
  /**
   * <code>.channelGrpc.RegisterReply registerData = 3;</code>
   * @return The registerData.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReply getRegisterData();
  /**
   * <code>.channelGrpc.RegisterReply registerData = 3;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.RegisterReplyOrBuilder getRegisterDataOrBuilder();

  /**
   * <code>string jsonHardwareInfo = 4;</code>
   * @return The jsonHardwareInfo.
   */
  java.lang.String getJsonHardwareInfo();
  /**
   * <code>string jsonHardwareInfo = 4;</code>
   * @return The bytes for jsonHardwareInfo.
   */
  com.google.protobuf.ByteString
      getJsonHardwareInfoBytes();

  /**
   * <code>.channelGrpc.Timestamp lastContact = 5;</code>
   * @return Whether the lastContact field is set.
   */
  boolean hasLastContact();
  /**
   * <code>.channelGrpc.Timestamp lastContact = 5;</code>
   * @return The lastContact.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Timestamp getLastContact();
  /**
   * <code>.channelGrpc.Timestamp lastContact = 5;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.TimestampOrBuilder getLastContactOrBuilder();
}
