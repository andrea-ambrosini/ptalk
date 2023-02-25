// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-channel-grpc.proto

package net.rossonet.ptalk.channel.protobuf.server.grpc;

/**
 * Protobuf enum {@code channelGrpc.LogSeverity}
 */
public enum LogSeverity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <code>DEBUG = 100;</code>
   */
  DEBUG(100),
  /**
   * <code>INFO = 200;</code>
   */
  INFO(200),
  /**
   * <code>NOTICE = 300;</code>
   */
  NOTICE(300),
  /**
   * <code>WARNING = 400;</code>
   */
  WARNING(400),
  /**
   * <code>ERROR = 500;</code>
   */
  ERROR(500),
  /**
   * <code>CRITICAL = 600;</code>
   */
  CRITICAL(600),
  /**
   * <code>ALERT = 700;</code>
   */
  ALERT(700),
  /**
   * <code>EMERGENCY = 800;</code>
   */
  EMERGENCY(800),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <code>DEBUG = 100;</code>
   */
  public static final int DEBUG_VALUE = 100;
  /**
   * <code>INFO = 200;</code>
   */
  public static final int INFO_VALUE = 200;
  /**
   * <code>NOTICE = 300;</code>
   */
  public static final int NOTICE_VALUE = 300;
  /**
   * <code>WARNING = 400;</code>
   */
  public static final int WARNING_VALUE = 400;
  /**
   * <code>ERROR = 500;</code>
   */
  public static final int ERROR_VALUE = 500;
  /**
   * <code>CRITICAL = 600;</code>
   */
  public static final int CRITICAL_VALUE = 600;
  /**
   * <code>ALERT = 700;</code>
   */
  public static final int ALERT_VALUE = 700;
  /**
   * <code>EMERGENCY = 800;</code>
   */
  public static final int EMERGENCY_VALUE = 800;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LogSeverity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LogSeverity forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 100: return DEBUG;
      case 200: return INFO;
      case 300: return NOTICE;
      case 400: return WARNING;
      case 500: return ERROR;
      case 600: return CRITICAL;
      case 700: return ALERT;
      case 800: return EMERGENCY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LogSeverity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LogSeverity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogSeverity>() {
          public LogSeverity findValueByNumber(int number) {
            return LogSeverity.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.rossonet.ptalk.channel.protobuf.server.grpc.PtalkChannelGrpcServerGrpc.getDescriptor().getEnumTypes().get(3);
  }

  private static final LogSeverity[] VALUES = values();

  public static LogSeverity valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LogSeverity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:channelGrpc.LogSeverity)
}

