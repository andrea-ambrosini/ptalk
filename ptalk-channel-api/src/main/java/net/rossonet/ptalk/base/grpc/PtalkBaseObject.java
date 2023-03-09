// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-base-api.proto

package net.rossonet.ptalk.base.grpc;

public final class PtalkBaseObject {
  private PtalkBaseObject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_Timestamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_Timestamp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_GenericMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_GenericMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_GenericMessageReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_GenericMessageReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_RegisterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_RegisterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_RegisterReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_RegisterReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_HealthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_HealthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_StackTraceLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_StackTraceLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_base_LogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_base_LogRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ptalk-base-api.proto\022\004base\"\007\n\005Empty\"0\n" +
      "\tTimestamp\022\024\n\014milliSeconds\030\001 \001(\003\022\r\n\005nano" +
      "s\030\002 \001(\005\"+\n\006Status\022!\n\006status\030\001 \001(\0162\021.base" +
      ".StatusValue\"\356\001\n\004Data\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t\022 \n\010typeData\030\003 \001(\0162\016.base.DataT" +
      "ype\022\"\n\ttimestamp\030\004 \001(\0132\017.base.Timestamp\022" +
      "\023\n\013displayName\030\005 \001(\t\022\030\n\020shortDescription" +
      "\030\006 \001(\t\022\023\n\013description\030\007 \001(\t\022\036\n\007quality\030\010" +
      " \001(\0162\r.base.Quality\022\020\n\010priority\030\t \001(\005\022\016\n" +
      "\006weight\030\n \001(\003\"i\n\003Tag\022\013\n\003tag\030\001 \001(\t\022\023\n\013dis" +
      "playName\030\002 \001(\t\022\030\n\020shortDescription\030\003 \001(\t" +
      "\022\023\n\013description\030\004 \001(\t\022\021\n\ttagFather\030\005 \001(\t" +
      "\"\252\001\n\025GenericMessageRequest\022\025\n\rflowRefere" +
      "nce\030\001 \001(\t\022\030\n\020messageReference\030\002 \001(\t\022#\n\017a" +
      "dditionalDatas\030\003 \003(\0132\n.base.Data\022\027\n\004tags" +
      "\030\004 \003(\0132\t.base.Tag\022\"\n\ttimestamp\030\005 \001(\0132\017.b" +
      "ase.Timestamp\"\322\001\n\023GenericMessageReply\022\025\n" +
      "\rflowReference\030\001 \001(\t\022\030\n\020messageReference" +
      "\030\002 \001(\t\022(\n\rgeneralStatus\030\003 \001(\0162\021.base.Sta" +
      "tusValue\022#\n\017additionalDatas\030\004 \003(\0132\n.base" +
      ".Data\022\027\n\004tags\030\005 \003(\0132\t.base.Tag\022\"\n\ttimest" +
      "amp\030\006 \001(\0132\017.base.Timestamp\"\355\002\n\017RegisterR" +
      "equest\022\026\n\016unitUniqueName\030\001 \001(\t\022 \n\010unitTy" +
      "pe\030\002 \001(\0162\016.base.UnitType\022\023\n\013displayName\030" +
      "\003 \001(\t\022\014\n\004host\030\004 \001(\t\022\014\n\004port\030\005 \001(\005\022\030\n\020sho" +
      "rtDescription\030\006 \001(\t\022\023\n\013description\030\007 \001(\t" +
      "\022\022\n\njsonHealth\030\010 \001(\t\022\026\n\016certificateCrt\030\t" +
      " \001(\t\022\024\n\014capabilities\030\n \003(\t\022#\n\017additional" +
      "Datas\030\013 \003(\0132\n.base.Data\022\027\n\004tags\030\014 \003(\0132\t." +
      "base.Tag\022\034\n\024selfSuperAbilityCode\030\r \001(\t\022\"" +
      "\n\ttimestamp\030\016 \001(\0132\017.base.Timestamp\"\322\002\n\rR" +
      "egisterReply\022\026\n\016unitUniqueName\030\001 \001(\t\022\033\n\023" +
      "monitoringFrequency\030\002 \001(\005\022\030\n\020globalJsonC" +
      "onfig\030\003 \001(\t\022\023\n\013certificate\030\004 \001(\t\022\034\n\024cert" +
      "ificateFullChain\030\005 \001(\t\022-\n\022statusRegistra" +
      "tion\030\006 \001(\0162\021.base.StatusValue\022\035\n\025timesta" +
      "mpRegistration\030\007 \001(\003\022\017\n\007otpSeed\030\010 \001(\t\022#\n" +
      "\017additionalDatas\030\t \003(\0132\n.base.Data\022\027\n\004ta" +
      "gs\030\n \003(\0132\t.base.Tag\022\"\n\ttimestamp\030\013 \001(\0132\017" +
      ".base.Timestamp\"\317\001\n\rHealthRequest\022\025\n\rflo" +
      "wReference\030\001 \001(\t\022\026\n\016unitUniqueName\030\002 \001(\t" +
      "\022\030\n\020jsonHardwareInfo\030\003 \001(\t\022!\n\006status\030\004 \001" +
      "(\0162\021.base.StatusValue\022.\n\017lifecycleStatus" +
      "\030\005 \001(\0162\025.base.LifecycleStatus\022\"\n\ttimesta" +
      "mp\030\006 \001(\0132\017.base.Timestamp\"d\n\016StackTraceL" +
      "ine\022\017\n\007message\030\001 \001(\t\022\026\n\016exceptionClass\030\002" +
      " \001(\t\022\r\n\005class\030\003 \001(\t\022\014\n\004file\030\004 \001(\t\022\014\n\004lin" +
      "e\030\005 \001(\005\"\254\002\n\nLogRequest\022\025\n\rflowReference\030" +
      "\001 \001(\t\022\026\n\016unitUniqueName\030\002 \001(\t\022#\n\010severit" +
      "y\030\003 \001(\0162\021.base.LogSeverity\022\017\n\007logLine\030\004 " +
      "\001(\t\022\030\n\020messageReference\030\006 \001(\t\022(\n\nstacktr" +
      "ace\030\007 \003(\0132\024.base.StackTraceLine\022!\n\006statu" +
      "s\030\010 \001(\0162\021.base.StatusValue\022.\n\017lifecycleS" +
      "tatus\030\t \001(\0162\025.base.LifecycleStatus\022\"\n\tti" +
      "mestamp\030\n \001(\0132\017.base.Timestamp*p\n\013Status" +
      "Value\022\017\n\013STATUS_GOOD\020\000\022\016\n\nSTATUS_BAD\020\001\022\020" +
      "\n\014STATUS_FAULT\020\002\022\025\n\021STATUS_WAIT_HUMAN\020\003\022" +
      "\027\n\023STATUS_NOT_APPROVED\020\004*^\n\017LifecycleSta" +
      "tus\022\010\n\004INIT\020\000\022\016\n\nCONFIGURED\020\002\022\013\n\007RUNNING" +
      "\020\003\022\n\n\006KILLED\020\004\022\013\n\007FAULTED\020\005\022\013\n\007STOPPED\020\006" +
      "*\202\001\n\013LogSeverity\022\013\n\007DEFAULT\020\000\022\t\n\005DEBUG\020d" +
      "\022\t\n\004INFO\020\310\001\022\013\n\006NOTICE\020\254\002\022\014\n\007WARNING\020\220\003\022\n" +
      "\n\005ERROR\020\364\003\022\r\n\010CRITICAL\020\330\004\022\n\n\005ALERT\020\274\005\022\016\n" +
      "\tEMERGENCY\020\240\006*\224\001\n\010DataType\022\n\n\006STRING\020\000\022\010" +
      "\n\004CHAR\020\001\022\t\n\005INT32\020\002\022\t\n\005INT64\020\003\022\t\n\005FLOAT\020" +
      "\004\022\n\n\006DOUBLE\020\005\022\013\n\007BOOLEAN\020\006\022\r\n\tTIMESTAMP\020" +
      "\007\022\013\n\007UNKNOWN\020\010\022\014\n\010JSONDATA\020\t\022\016\n\nBASE64DA" +
      "TA\020\n*@\n\007Quality\022\023\n\017QUALITY_UNKNOWN\020\000\022\t\n\004" +
      "GOOD\020\310\001\022\010\n\003BAD\020\220\003\022\013\n\006CACHED\020\350\007*7\n\010UnitTy" +
      "pe\022\013\n\007ABILITY\020\000\022\013\n\007CHANNEL\020\024\022\007\n\003NLU\020(\022\010\n" +
      "\004SELF\020P2\342\001\n\tRpcCoreV1\0228\n\010Register\022\025.base" +
      ".RegisterRequest\032\023.base.RegisterReply\"\000\022" +
      "\'\n\003Log\022\020.base.LogRequest\032\014.base.Status\"\000" +
      "\022-\n\006Health\022\023.base.HealthRequest\032\014.base.S" +
      "tatus\"\000\022C\n\007Message\022\033.base.GenericMessage" +
      "Request\032\031.base.GenericMessageReply\"\0002U\n\016" +
      "RpcSlaveUnitV1\022C\n\007Message\022\033.base.Generic" +
      "MessageRequest\032\031.base.GenericMessageRepl" +
      "y\"\000B1\n\034net.rossonet.ptalk.base.grpcB\017Pta" +
      "lkBaseObjectP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_base_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_base_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_base_Timestamp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_base_Timestamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_Timestamp_descriptor,
        new java.lang.String[] { "MilliSeconds", "Nanos", });
    internal_static_base_Status_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_base_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_Status_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_base_Data_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_base_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_Data_descriptor,
        new java.lang.String[] { "Key", "Value", "TypeData", "Timestamp", "DisplayName", "ShortDescription", "Description", "Quality", "Priority", "Weight", });
    internal_static_base_Tag_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_base_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_Tag_descriptor,
        new java.lang.String[] { "Tag", "DisplayName", "ShortDescription", "Description", "TagFather", });
    internal_static_base_GenericMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_base_GenericMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_GenericMessageRequest_descriptor,
        new java.lang.String[] { "FlowReference", "MessageReference", "AdditionalDatas", "Tags", "Timestamp", });
    internal_static_base_GenericMessageReply_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_base_GenericMessageReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_GenericMessageReply_descriptor,
        new java.lang.String[] { "FlowReference", "MessageReference", "GeneralStatus", "AdditionalDatas", "Tags", "Timestamp", });
    internal_static_base_RegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_base_RegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_RegisterRequest_descriptor,
        new java.lang.String[] { "UnitUniqueName", "UnitType", "DisplayName", "Host", "Port", "ShortDescription", "Description", "JsonHealth", "CertificateCrt", "Capabilities", "AdditionalDatas", "Tags", "SelfSuperAbilityCode", "Timestamp", });
    internal_static_base_RegisterReply_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_base_RegisterReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_RegisterReply_descriptor,
        new java.lang.String[] { "UnitUniqueName", "MonitoringFrequency", "GlobalJsonConfig", "Certificate", "CertificateFullChain", "StatusRegistration", "TimestampRegistration", "OtpSeed", "AdditionalDatas", "Tags", "Timestamp", });
    internal_static_base_HealthRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_base_HealthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_HealthRequest_descriptor,
        new java.lang.String[] { "FlowReference", "UnitUniqueName", "JsonHardwareInfo", "Status", "LifecycleStatus", "Timestamp", });
    internal_static_base_StackTraceLine_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_base_StackTraceLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_StackTraceLine_descriptor,
        new java.lang.String[] { "Message", "ExceptionClass", "Class_", "File", "Line", });
    internal_static_base_LogRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_base_LogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_base_LogRequest_descriptor,
        new java.lang.String[] { "FlowReference", "UnitUniqueName", "Severity", "LogLine", "MessageReference", "Stacktrace", "Status", "LifecycleStatus", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
