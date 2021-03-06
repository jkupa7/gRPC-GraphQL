// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphqlService.proto

package com.personal.models;

public final class GraphQLServiceProto {
  private GraphQLServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GraphQLRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GraphQLRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GraphQLResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GraphQLResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WiringInstruction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WiringInstruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Bank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Bank_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024graphqlService.proto\"\037\n\016GraphQLRequest" +
      "\022\r\n\005query\030\001 \001(\t\"+\n\017GraphQLResponse\022\030\n\004da" +
      "ta\030\001 \001(\0132\n.QueryType\"t\n\tQueryType\0222\n\026get" +
      "_wiring_instruction\030\001 \001(\0132\022.WiringInstru" +
      "ction\0223\n\027get_wiring_instructions\030\002 \003(\0132\022" +
      ".WiringInstruction\"\220\002\n\021WiringInstruction" +
      "\022\014\n\004name\030\001 \001(\t\022\021\n\tbank_name\030\002 \001(\t\022\n\n\002id\030" +
      "\003 \001(\003\022\022\n\naba_number\030\004 \001(\003\022\r\n\005swift\030\005 \001(\t" +
      "\022\026\n\016for_account_of\030\006 \001(\t\022\026\n\016account_numb" +
      "er\030\007 \001(\t\022\024\n\014in_favour_of\030\010 \001(\t\022#\n\033in_fav" +
      "our_of_account_number\030\t \001(\t\022\017\n\007bank_id\030\n" +
      " \001(\003\022\023\n\004bank\030\013 \001(\0132\005.Bank\022\032\n\010products\030\014 " +
      "\003(\0132\010.Product\"\'\n\004Bank\022\n\n\002id\030\001 \001(\003\022\023\n\013com" +
      "mon_name\030\002 \001(\t\"9\n\007Product\022\n\n\002id\030\001 \001(\003\022\023\n" +
      "\013description\030\002 \001(\t\022\r\n\005value\030\003 \001(\t2H\n\024Qua" +
      "sarGraphQLService\0220\n\007Execute\022\017.GraphQLRe" +
      "quest\032\020.GraphQLResponse\"\0000\0012I\n\025AladdinGr" +
      "aphQLService\0220\n\007Execute\022\017.GraphQLRequest" +
      "\032\020.GraphQLResponse\"\0000\001B4\n\033com.bfm.altern" +
      "atives.modelsB\023GraphQLServiceProtoP\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GraphQLRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GraphQLRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GraphQLRequest_descriptor,
        new java.lang.String[] { "Query", });
    internal_static_GraphQLResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GraphQLResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GraphQLResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_QueryType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_QueryType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryType_descriptor,
        new java.lang.String[] { "GetWiringInstruction", "GetWiringInstructions", });
    internal_static_WiringInstruction_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_WiringInstruction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WiringInstruction_descriptor,
        new java.lang.String[] { "Name", "BankName", "Id", "AbaNumber", "Swift", "ForAccountOf", "AccountNumber", "InFavourOf", "InFavourOfAccountNumber", "BankId", "Bank", "Products", });
    internal_static_Bank_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Bank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Bank_descriptor,
        new java.lang.String[] { "Id", "CommonName", });
    internal_static_Product_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Product_descriptor,
        new java.lang.String[] { "Id", "Description", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
