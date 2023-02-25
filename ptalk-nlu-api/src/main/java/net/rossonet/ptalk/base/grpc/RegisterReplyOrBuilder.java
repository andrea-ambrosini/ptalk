// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-base-api.proto

package net.rossonet.ptalk.base.grpc;

public interface RegisterReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.RegisterReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string unitUniqueName = 1;</code>
   * @return The unitUniqueName.
   */
  java.lang.String getUnitUniqueName();
  /**
   * <code>string unitUniqueName = 1;</code>
   * @return The bytes for unitUniqueName.
   */
  com.google.protobuf.ByteString
      getUnitUniqueNameBytes();

  /**
   * <code>int32 monitoringFrequency = 2;</code>
   * @return The monitoringFrequency.
   */
  int getMonitoringFrequency();

  /**
   * <code>string globalJsonConfig = 3;</code>
   * @return The globalJsonConfig.
   */
  java.lang.String getGlobalJsonConfig();
  /**
   * <code>string globalJsonConfig = 3;</code>
   * @return The bytes for globalJsonConfig.
   */
  com.google.protobuf.ByteString
      getGlobalJsonConfigBytes();

  /**
   * <code>string certificate = 4;</code>
   * @return The certificate.
   */
  java.lang.String getCertificate();
  /**
   * <code>string certificate = 4;</code>
   * @return The bytes for certificate.
   */
  com.google.protobuf.ByteString
      getCertificateBytes();

  /**
   * <code>string certificateFullChain = 5;</code>
   * @return The certificateFullChain.
   */
  java.lang.String getCertificateFullChain();
  /**
   * <code>string certificateFullChain = 5;</code>
   * @return The bytes for certificateFullChain.
   */
  com.google.protobuf.ByteString
      getCertificateFullChainBytes();

  /**
   * <code>.base.StatusValue statusRegistration = 6;</code>
   * @return The enum numeric value on the wire for statusRegistration.
   */
  int getStatusRegistrationValue();
  /**
   * <code>.base.StatusValue statusRegistration = 6;</code>
   * @return The statusRegistration.
   */
  net.rossonet.ptalk.base.grpc.StatusValue getStatusRegistration();

  /**
   * <code>int64 timestampRegistration = 7;</code>
   * @return The timestampRegistration.
   */
  long getTimestampRegistration();

  /**
   * <code>string otpSeed = 8;</code>
   * @return The otpSeed.
   */
  java.lang.String getOtpSeed();
  /**
   * <code>string otpSeed = 8;</code>
   * @return The bytes for otpSeed.
   */
  com.google.protobuf.ByteString
      getOtpSeedBytes();

  /**
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Data> 
      getAdditionalDatasList();
  /**
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.Data getAdditionalDatas(int index);
  /**
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  int getAdditionalDatasCount();
  /**
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.DataOrBuilder> 
      getAdditionalDatasOrBuilderList();
  /**
   * <code>repeated .base.Data additionalDatas = 9;</code>
   */
  net.rossonet.ptalk.base.grpc.DataOrBuilder getAdditionalDatasOrBuilder(
      int index);

  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  java.util.List<net.rossonet.ptalk.base.grpc.Tag> 
      getTagsList();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  net.rossonet.ptalk.base.grpc.Tag getTags(int index);
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  java.util.List<? extends net.rossonet.ptalk.base.grpc.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .base.Tag tags = 10;</code>
   */
  net.rossonet.ptalk.base.grpc.TagOrBuilder getTagsOrBuilder(
      int index);
}
