// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface NodeMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.NodeMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.channelGrpc.DataNode dataNode = 1;</code>
   * @return Whether the dataNode field is set.
   */
  boolean hasDataNode();
  /**
   * <code>.channelGrpc.DataNode dataNode = 1;</code>
   * @return The dataNode.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.DataNode getDataNode();
  /**
   * <code>.channelGrpc.DataNode dataNode = 1;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.DataNodeOrBuilder getDataNodeOrBuilder();

  /**
   * <code>string namespace = 2;</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 2;</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>string domainId = 3;</code>
   * @return The domainId.
   */
  java.lang.String getDomainId();
  /**
   * <code>string domainId = 3;</code>
   * @return The bytes for domainId.
   */
  com.google.protobuf.ByteString
      getDomainIdBytes();

  /**
   * <code>repeated string tags = 4;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 4;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 4;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>repeated .channelGrpc.ParentScope fatherForScopes = 5;</code>
   */
  java.util.List<net.rossonet.ptalk.channel.protobuf.server.grpc.ParentScope> 
      getFatherForScopesList();
  /**
   * <code>repeated .channelGrpc.ParentScope fatherForScopes = 5;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.ParentScope getFatherForScopes(int index);
  /**
   * <code>repeated .channelGrpc.ParentScope fatherForScopes = 5;</code>
   */
  int getFatherForScopesCount();
  /**
   * <code>repeated .channelGrpc.ParentScope fatherForScopes = 5;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.channel.protobuf.server.grpc.ParentScopeOrBuilder> 
      getFatherForScopesOrBuilderList();
  /**
   * <code>repeated .channelGrpc.ParentScope fatherForScopes = 5;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.ParentScopeOrBuilder getFatherForScopesOrBuilder(
      int index);

  /**
   * <code>repeated string logs = 6;</code>
   * @return A list containing the logs.
   */
  java.util.List<java.lang.String>
      getLogsList();
  /**
   * <code>repeated string logs = 6;</code>
   * @return The count of logs.
   */
  int getLogsCount();
  /**
   * <code>repeated string logs = 6;</code>
   * @param index The index of the element to return.
   * @return The logs at the given index.
   */
  java.lang.String getLogs(int index);
  /**
   * <code>repeated string logs = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the logs at the given index.
   */
  com.google.protobuf.ByteString
      getLogsBytes(int index);
}
