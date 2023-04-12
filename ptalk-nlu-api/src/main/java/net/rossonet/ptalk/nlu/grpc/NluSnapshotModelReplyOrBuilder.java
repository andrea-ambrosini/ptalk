// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

public interface NluSnapshotModelReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nlu.NluSnapshotModelReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string flowReference = 1;</code>
   * @return The flowReference.
   */
  java.lang.String getFlowReference();
  /**
   * <code>string flowReference = 1;</code>
   * @return The bytes for flowReference.
   */
  com.google.protobuf.ByteString
      getFlowReferenceBytes();

  /**
   * <code>.base.StatusValue status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.base.StatusValue status = 2;</code>
   * @return The status.
   */
  net.rossonet.ptalk.base.grpc.StatusValue getStatus();

  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 3;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>repeated .base.Data modelSnapshotData = 4;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getModelSnapshotDataList();
  /**
   * <code>repeated .base.Data modelSnapshotData = 4;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getModelSnapshotData(int index);
  /**
   * <code>repeated .base.Data modelSnapshotData = 4;</code>
   */
  int getModelSnapshotDataCount();
  /**
   * <code>repeated .base.Data modelSnapshotData = 4;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getModelSnapshotDataOrBuilderList();
  /**
   * <code>repeated .base.Data modelSnapshotData = 4;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getModelSnapshotDataOrBuilder(
      int index);
}