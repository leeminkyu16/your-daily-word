// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Quote.proto

package com.minkyu.yourdailyword.common.protos;

public final class QuoteProtos {
  private QuoteProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yourdailyword_Quote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yourdailyword_Quote_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Quote.proto\022\ryourdailyword\032\030Multilingu" +
      "alString.proto\032#QuoteGregorianCalendarOp" +
      "tions.proto\032\037QuoteLunarCalendarOptions.p" +
      "roto\032 QuoteHebrewCalendarOptions.proto\"\276" +
      "\003\n\005Quote\022\013\n\003uid\030\001 \001(\005\0220\n\005value\030\002 \001(\0132!.y" +
      "ourdailyword.MultilingualString\022\027\n\017assoc" +
      "iatedMonth\030\003 \001(\005\022\034\n\024associatedDayOfMonth" +
      "\030\004 \001(\005\022S\n\030gregorianCalendarOptions\030\005 \001(\013" +
      "2,.yourdailyword.QuoteGregorianCalendarO" +
      "ptionsH\000\210\001\001\022K\n\024lunarCalendarOptions\030\006 \001(" +
      "\0132(.yourdailyword.QuoteLunarCalendarOpti" +
      "onsH\001\210\001\001\022M\n\025hebrewCalendarOptions\030\007 \001(\0132" +
      ").yourdailyword.QuoteHebrewCalendarOptio" +
      "nsH\002\210\001\001B\033\n\031_gregorianCalendarOptionsB\027\n\025" +
      "_lunarCalendarOptionsB\030\n\026_hebrewCalendar" +
      "OptionsB7\n&com.minkyu.yourdailyword.comm" +
      "on.protosB\013QuoteProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.minkyu.yourdailyword.common.protos.MultilingualStringProto.getDescriptor(),
          com.minkyu.yourdailyword.common.protos.QuoteGregorianCalendarOptionsProto.getDescriptor(),
          com.minkyu.yourdailyword.common.protos.QuoteLunarCalendarOptionsProto.getDescriptor(),
          com.minkyu.yourdailyword.common.protos.QuoteHebrewCalendarOptionsProto.getDescriptor(),
        });
    internal_static_yourdailyword_Quote_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yourdailyword_Quote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yourdailyword_Quote_descriptor,
        new java.lang.String[] { "Uid", "Value", "AssociatedMonth", "AssociatedDayOfMonth", "GregorianCalendarOptions", "LunarCalendarOptions", "HebrewCalendarOptions", "GregorianCalendarOptions", "LunarCalendarOptions", "HebrewCalendarOptions", });
    com.minkyu.yourdailyword.common.protos.MultilingualStringProto.getDescriptor();
    com.minkyu.yourdailyword.common.protos.QuoteGregorianCalendarOptionsProto.getDescriptor();
    com.minkyu.yourdailyword.common.protos.QuoteLunarCalendarOptionsProto.getDescriptor();
    com.minkyu.yourdailyword.common.protos.QuoteHebrewCalendarOptionsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
