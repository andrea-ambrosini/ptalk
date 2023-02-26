// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

public interface RegisterReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:channelGrpc.RegisterReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string registerCode = 1;</code>
   * @return The registerCode.
   */
  java.lang.String getRegisterCode();
  /**
   * <code>string registerCode = 1;</code>
   * @return The bytes for registerCode.
   */
  com.google.protobuf.ByteString
      getRegisterCodeBytes();

  /**
   * <code>int32 monitoringFrequency = 2;</code>
   * @return The monitoringFrequency.
   */
  int getMonitoringFrequency();

  /**
   * <code>string cert = 3;</code>
   * @return The cert.
   */
  java.lang.String getCert();
  /**
   * <code>string cert = 3;</code>
   * @return The bytes for cert.
   */
  com.google.protobuf.ByteString
      getCertBytes();

  /**
   * <code>string ca = 4;</code>
   * @return The ca.
   */
  java.lang.String getCa();
  /**
   * <code>string ca = 4;</code>
   * @return The bytes for ca.
   */
  com.google.protobuf.ByteString
      getCaBytes();

  /**
   * <code>.channelGrpc.Status statusRegistration = 5;</code>
   * @return Whether the statusRegistration field is set.
   */
  boolean hasStatusRegistration();
  /**
   * <code>.channelGrpc.Status statusRegistration = 5;</code>
   * @return The statusRegistration.
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.Status getStatusRegistration();
  /**
   * <code>.channelGrpc.Status statusRegistration = 5;</code>
   */
  net.rossonet.ptalk.channel.protobuf.server.grpc.StatusOrBuilder getStatusRegistrationOrBuilder();

  /**
   * <code>int64 timestampRegistration = 6;</code>
   * @return The timestampRegistration.
   */
  long getTimestampRegistration();

  /**
   * <code>string otpSeed = 7;</code>
   * @return The otpSeed.
   */
  java.lang.String getOtpSeed();
  /**
   * <code>string otpSeed = 7;</code>
   * @return The bytes for otpSeed.
   */
  com.google.protobuf.ByteString
      getOtpSeedBytes();
}