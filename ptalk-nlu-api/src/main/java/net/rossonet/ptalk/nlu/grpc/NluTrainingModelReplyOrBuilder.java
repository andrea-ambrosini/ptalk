// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

public interface NluTrainingModelReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nlu.NluTrainingModelReply)
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
   * <code>.nlu.NluModel model = 2;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.nlu.NluModel model = 2;</code>
   * @return The model.
   */
  net.rossonet.ptalk.nlu.grpc.NluModel getModel();
  /**
   * <code>.nlu.NluModel model = 2;</code>
   */
  net.rossonet.ptalk.nlu.grpc.NluModelOrBuilder getModelOrBuilder();

  /**
   * <code>.base.StatusValue status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.base.StatusValue status = 3;</code>
   * @return The status.
   */
  net.rossonet.ptalk.base.grpc.StatusValue getStatus();

  /**
   * <code>int64 trainingTime = 4;</code>
   * @return The trainingTime.
   */
  long getTrainingTime();

  /**
   * <code>int64 testTime = 5;</code>
   * @return The testTime.
   */
  long getTestTime();

  /**
   * <code>repeated .nlu.TrainingLineLog trainingLog = 6;</code>
   */
  java.util.List<net.rossonet.ptalk.nlu.grpc.TrainingLineLog> 
      getTrainingLogList();
  /**
   * <code>repeated .nlu.TrainingLineLog trainingLog = 6;</code>
   */
  net.rossonet.ptalk.nlu.grpc.TrainingLineLog getTrainingLog(int index);
  /**
   * <code>repeated .nlu.TrainingLineLog trainingLog = 6;</code>
   */
  int getTrainingLogCount();
  /**
   * <code>repeated .nlu.TrainingLineLog trainingLog = 6;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.nlu.grpc.TrainingLineLogOrBuilder> 
      getTrainingLogOrBuilderList();
  /**
   * <code>repeated .nlu.TrainingLineLog trainingLog = 6;</code>
   */
  net.rossonet.ptalk.nlu.grpc.TrainingLineLogOrBuilder getTrainingLogOrBuilder(
      int index);

  /**
   * <code>repeated .nlu.TrainingLineLog testLog = 7;</code>
   */
  java.util.List<net.rossonet.ptalk.nlu.grpc.TrainingLineLog> 
      getTestLogList();
  /**
   * <code>repeated .nlu.TrainingLineLog testLog = 7;</code>
   */
  net.rossonet.ptalk.nlu.grpc.TrainingLineLog getTestLog(int index);
  /**
   * <code>repeated .nlu.TrainingLineLog testLog = 7;</code>
   */
  int getTestLogCount();
  /**
   * <code>repeated .nlu.TrainingLineLog testLog = 7;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.nlu.grpc.TrainingLineLogOrBuilder> 
      getTestLogOrBuilderList();
  /**
   * <code>repeated .nlu.TrainingLineLog testLog = 7;</code>
   */
  net.rossonet.ptalk.nlu.grpc.TrainingLineLogOrBuilder getTestLogOrBuilder(
      int index);

  /**
   * <code>.base.Timestamp timestamp = 8;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 8;</code>
   * @return The timestamp.
   */
  net.rossonet.ptalk.base.grpc.Timestamp getTimestamp();
  /**
   * <code>.base.Timestamp timestamp = 8;</code>
   */
  net.rossonet.ptalk.base.grpc.TimestampOrBuilder getTimestampOrBuilder();
}
