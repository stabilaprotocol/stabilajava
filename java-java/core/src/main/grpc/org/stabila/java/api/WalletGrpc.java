package org.stabila.java.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: api/api.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionReturn> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = org.stabila.java.proto.Chain.Transaction.class,
      responseType = org.stabila.java.proto.Response.TransactionReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionReturn> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionReturn> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionReturn.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
              .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonTransaction",
      requestType = org.stabila.java.proto.Chain.Transaction.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionExtention> getCreateCommonTransactionMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;
    if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
          WalletGrpc.getCreateCommonTransactionMethod = getCreateCommonTransactionMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateCommonTransaction"))
              .build();
        }
      }
    }
    return getCreateCommonTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract,
      org.stabila.java.proto.Chain.Transaction> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = org.stabila.java.proto.Contract.AccountCreateContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract,
      org.stabila.java.proto.Chain.Transaction> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract, org.stabila.java.proto.Chain.Transaction> getCreateAccountMethod;
    if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
          WalletGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AccountCreateContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount"))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount2",
      requestType = org.stabila.java.proto.Contract.AccountCreateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateAccount2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountCreateContract, org.stabila.java.proto.Response.TransactionExtention> getCreateAccount2Method;
    if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
          WalletGrpc.getCreateAccount2Method = getCreateAccount2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AccountCreateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount2"))
              .build();
        }
      }
    }
    return getCreateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = org.stabila.java.proto.Contract.AccountUpdateContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract, org.stabila.java.proto.Chain.Transaction> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
          WalletGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AccountUpdateContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount"))
              .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount2",
      requestType = org.stabila.java.proto.Contract.AccountUpdateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateAccount2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountUpdateContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateAccount2Method;
    if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
          WalletGrpc.getUpdateAccount2Method = getUpdateAccount2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AccountUpdateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount2"))
              .build();
        }
      }
    }
    return getUpdateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.SetAccountIdContract,
      org.stabila.java.proto.Chain.Transaction> getSetAccountIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountId",
      requestType = org.stabila.java.proto.Contract.SetAccountIdContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.SetAccountIdContract,
      org.stabila.java.proto.Chain.Transaction> getSetAccountIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.SetAccountIdContract, org.stabila.java.proto.Chain.Transaction> getSetAccountIdMethod;
    if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
          WalletGrpc.getSetAccountIdMethod = getSetAccountIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.SetAccountIdContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.SetAccountIdContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SetAccountId"))
              .build();
        }
      }
    }
    return getSetAccountIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountPermissionUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPermissionUpdate",
      requestType = org.stabila.java.proto.Contract.AccountPermissionUpdateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountPermissionUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AccountPermissionUpdateContract, org.stabila.java.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod;
    if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
          WalletGrpc.getAccountPermissionUpdateMethod = getAccountPermissionUpdateMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AccountPermissionUpdateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPermissionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AccountPermissionUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AccountPermissionUpdate"))
              .build();
        }
      }
    }
    return getAccountPermissionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract,
      org.stabila.java.proto.Chain.Transaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = org.stabila.java.proto.Contract.TransferContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract,
      org.stabila.java.proto.Chain.Transaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract, org.stabila.java.proto.Chain.Transaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
          WalletGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TransferContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateTransaction2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction2",
      requestType = org.stabila.java.proto.Contract.TransferContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateTransaction2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferContract, org.stabila.java.proto.Response.TransactionExtention> getCreateTransaction2Method;
    if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
          WalletGrpc.getCreateTransaction2Method = getCreateTransaction2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TransferContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction2"))
              .build();
        }
      }
    }
    return getCreateTransaction2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract,
      org.stabila.java.proto.Chain.Transaction> getCreateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue",
      requestType = org.stabila.java.proto.Contract.AssetIssueContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract,
      org.stabila.java.proto.Chain.Transaction> getCreateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract, org.stabila.java.proto.Chain.Transaction> getCreateAssetIssueMethod;
    if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
          WalletGrpc.getCreateAssetIssueMethod = getCreateAssetIssueMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AssetIssueContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue"))
              .build();
        }
      }
    }
    return getCreateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue2",
      requestType = org.stabila.java.proto.Contract.AssetIssueContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.AssetIssueContract, org.stabila.java.proto.Response.TransactionExtention> getCreateAssetIssue2Method;
    if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
          WalletGrpc.getCreateAssetIssue2Method = getCreateAssetIssue2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.AssetIssueContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue2"))
              .build();
        }
      }
    }
    return getCreateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
      requestType = org.stabila.java.proto.Contract.UpdateAssetContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract, org.stabila.java.proto.Chain.Transaction> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
          WalletGrpc.getUpdateAssetMethod = getUpdateAssetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UpdateAssetContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset"))
              .build();
        }
      }
    }
    return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset2",
      requestType = org.stabila.java.proto.Contract.UpdateAssetContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateAsset2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateAssetContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateAsset2Method;
    if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
          WalletGrpc.getUpdateAsset2Method = getUpdateAsset2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UpdateAssetContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset2"))
              .build();
        }
      }
    }
    return getUpdateAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract,
      org.stabila.java.proto.Chain.Transaction> getTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset",
      requestType = org.stabila.java.proto.Contract.TransferAssetContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract,
      org.stabila.java.proto.Chain.Transaction> getTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract, org.stabila.java.proto.Chain.Transaction> getTransferAssetMethod;
    if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
          WalletGrpc.getTransferAssetMethod = getTransferAssetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TransferAssetContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset"))
              .build();
        }
      }
    }
    return getTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getTransferAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset2",
      requestType = org.stabila.java.proto.Contract.TransferAssetContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getTransferAsset2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TransferAssetContract, org.stabila.java.proto.Response.TransactionExtention> getTransferAsset2Method;
    if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
          WalletGrpc.getTransferAsset2Method = getTransferAsset2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TransferAssetContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset2"))
              .build();
        }
      }
    }
    return getTransferAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
      org.stabila.java.proto.Chain.Transaction> getParticipateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue",
      requestType = org.stabila.java.proto.Contract.ParticipateAssetIssueContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
      org.stabila.java.proto.Chain.Transaction> getParticipateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract, org.stabila.java.proto.Chain.Transaction> getParticipateAssetIssueMethod;
    if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
          WalletGrpc.getParticipateAssetIssueMethod = getParticipateAssetIssueMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ParticipateAssetIssueContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue"))
              .build();
        }
      }
    }
    return getParticipateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
      org.stabila.java.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue2",
      requestType = org.stabila.java.proto.Contract.ParticipateAssetIssueContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
      org.stabila.java.proto.Response.TransactionExtention> getParticipateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ParticipateAssetIssueContract, org.stabila.java.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;
    if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
          WalletGrpc.getParticipateAssetIssue2Method = getParticipateAssetIssue2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ParticipateAssetIssueContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue2"))
              .build();
        }
      }
    }
    return getParticipateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract,
      org.stabila.java.proto.Chain.Transaction> getUncdAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UncdAsset",
      requestType = org.stabila.java.proto.Contract.UncdAssetContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract,
      org.stabila.java.proto.Chain.Transaction> getUncdAssetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract, org.stabila.java.proto.Chain.Transaction> getUncdAssetMethod;
    if ((getUncdAssetMethod = WalletGrpc.getUncdAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUncdAssetMethod = WalletGrpc.getUncdAssetMethod) == null) {
          WalletGrpc.getUncdAssetMethod = getUncdAssetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UncdAssetContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UncdAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UncdAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UncdAsset"))
              .build();
        }
      }
    }
    return getUncdAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getUncdAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UncdAsset2",
      requestType = org.stabila.java.proto.Contract.UncdAssetContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getUncdAsset2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdAssetContract, org.stabila.java.proto.Response.TransactionExtention> getUncdAsset2Method;
    if ((getUncdAsset2Method = WalletGrpc.getUncdAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUncdAsset2Method = WalletGrpc.getUncdAsset2Method) == null) {
          WalletGrpc.getUncdAsset2Method = getUncdAsset2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UncdAssetContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UncdAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UncdAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UncdAsset2"))
              .build();
        }
      }
    }
    return getUncdAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract,
      org.stabila.java.proto.Chain.Transaction> getCreateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness",
      requestType = org.stabila.java.proto.Contract.WitnessCreateContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract,
      org.stabila.java.proto.Chain.Transaction> getCreateWitnessMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract, org.stabila.java.proto.Chain.Transaction> getCreateWitnessMethod;
    if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
          WalletGrpc.getCreateWitnessMethod = getCreateWitnessMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WitnessCreateContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness"))
              .build();
        }
      }
    }
    return getCreateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = org.stabila.java.proto.Contract.WitnessCreateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessCreateContract, org.stabila.java.proto.Response.TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WitnessCreateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
              .build();
        }
      }
    }
    return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness",
      requestType = org.stabila.java.proto.Contract.WitnessUpdateContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract,
      org.stabila.java.proto.Chain.Transaction> getUpdateWitnessMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract, org.stabila.java.proto.Chain.Transaction> getUpdateWitnessMethod;
    if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
          WalletGrpc.getUpdateWitnessMethod = getUpdateWitnessMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WitnessUpdateContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness"))
              .build();
        }
      }
    }
    return getUpdateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness2",
      requestType = org.stabila.java.proto.Contract.WitnessUpdateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateWitness2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WitnessUpdateContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateWitness2Method;
    if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
          WalletGrpc.getUpdateWitness2Method = getUpdateWitness2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WitnessUpdateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness2"))
              .build();
        }
      }
    }
    return getUpdateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateBrokerageContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBrokerage",
      requestType = org.stabila.java.proto.Contract.UpdateBrokerageContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateBrokerageContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateBrokerageMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateBrokerageContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateBrokerageMethod;
    if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
          WalletGrpc.getUpdateBrokerageMethod = getUpdateBrokerageMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UpdateBrokerageContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBrokerage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UpdateBrokerageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateBrokerage"))
              .build();
        }
      }
    }
    return getUpdateBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract,
      org.stabila.java.proto.Chain.Transaction> getVoteWitnessAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount",
      requestType = org.stabila.java.proto.Contract.VoteWitnessContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract,
      org.stabila.java.proto.Chain.Transaction> getVoteWitnessAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract, org.stabila.java.proto.Chain.Transaction> getVoteWitnessAccountMethod;
    if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
          WalletGrpc.getVoteWitnessAccountMethod = getVoteWitnessAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.VoteWitnessContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount"))
              .build();
        }
      }
    }
    return getVoteWitnessAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract,
      org.stabila.java.proto.Response.TransactionExtention> getVoteWitnessAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount2",
      requestType = org.stabila.java.proto.Contract.VoteWitnessContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract,
      org.stabila.java.proto.Response.TransactionExtention> getVoteWitnessAccount2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.VoteWitnessContract, org.stabila.java.proto.Response.TransactionExtention> getVoteWitnessAccount2Method;
    if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
          WalletGrpc.getVoteWitnessAccount2Method = getVoteWitnessAccount2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.VoteWitnessContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount2"))
              .build();
        }
      }
    }
    return getVoteWitnessAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getCdBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CdBalance",
      requestType = org.stabila.java.proto.Contract.CdBalanceContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getCdBalanceMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract, org.stabila.java.proto.Chain.Transaction> getCdBalanceMethod;
    if ((getCdBalanceMethod = WalletGrpc.getCdBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCdBalanceMethod = WalletGrpc.getCdBalanceMethod) == null) {
          WalletGrpc.getCdBalanceMethod = getCdBalanceMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.CdBalanceContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CdBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.CdBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CdBalance"))
              .build();
        }
      }
    }
    return getCdBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getCdBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CdBalance2",
      requestType = org.stabila.java.proto.Contract.CdBalanceContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getCdBalance2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CdBalanceContract, org.stabila.java.proto.Response.TransactionExtention> getCdBalance2Method;
    if ((getCdBalance2Method = WalletGrpc.getCdBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCdBalance2Method = WalletGrpc.getCdBalance2Method) == null) {
          WalletGrpc.getCdBalance2Method = getCdBalance2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.CdBalanceContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CdBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.CdBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CdBalance2"))
              .build();
        }
      }
    }
    return getCdBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getUncdBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UncdBalance",
      requestType = org.stabila.java.proto.Contract.UncdBalanceContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getUncdBalanceMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract, org.stabila.java.proto.Chain.Transaction> getUncdBalanceMethod;
    if ((getUncdBalanceMethod = WalletGrpc.getUncdBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUncdBalanceMethod = WalletGrpc.getUncdBalanceMethod) == null) {
          WalletGrpc.getUncdBalanceMethod = getUncdBalanceMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UncdBalanceContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UncdBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UncdBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UncdBalance"))
              .build();
        }
      }
    }
    return getUncdBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getUncdBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UncdBalance2",
      requestType = org.stabila.java.proto.Contract.UncdBalanceContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getUncdBalance2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UncdBalanceContract, org.stabila.java.proto.Response.TransactionExtention> getUncdBalance2Method;
    if ((getUncdBalance2Method = WalletGrpc.getUncdBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUncdBalance2Method = WalletGrpc.getUncdBalance2Method) == null) {
          WalletGrpc.getUncdBalance2Method = getUncdBalance2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UncdBalanceContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UncdBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UncdBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UncdBalance2"))
              .build();
        }
      }
    }
    return getUncdBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getWithdrawBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance",
      requestType = org.stabila.java.proto.Contract.WithdrawBalanceContract.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract,
      org.stabila.java.proto.Chain.Transaction> getWithdrawBalanceMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract, org.stabila.java.proto.Chain.Transaction> getWithdrawBalanceMethod;
    if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
          WalletGrpc.getWithdrawBalanceMethod = getWithdrawBalanceMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WithdrawBalanceContract, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance"))
              .build();
        }
      }
    }
    return getWithdrawBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = org.stabila.java.proto.Contract.WithdrawBalanceContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract,
      org.stabila.java.proto.Response.TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.WithdrawBalanceContract, org.stabila.java.proto.Response.TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.WithdrawBalanceContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
              .build();
        }
      }
    }
    return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalCreate",
      requestType = org.stabila.java.proto.Contract.ProposalCreateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalCreateMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalCreateContract, org.stabila.java.proto.Response.TransactionExtention> getProposalCreateMethod;
    if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
          WalletGrpc.getProposalCreateMethod = getProposalCreateMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ProposalCreateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ProposalCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalCreate"))
              .build();
        }
      }
    }
    return getProposalCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalApproveContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalApprove",
      requestType = org.stabila.java.proto.Contract.ProposalApproveContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalApproveContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalApproveMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalApproveContract, org.stabila.java.proto.Response.TransactionExtention> getProposalApproveMethod;
    if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
          WalletGrpc.getProposalApproveMethod = getProposalApproveMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ProposalApproveContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ProposalApproveContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalApprove"))
              .build();
        }
      }
    }
    return getProposalApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalDeleteContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDelete",
      requestType = org.stabila.java.proto.Contract.ProposalDeleteContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalDeleteContract,
      org.stabila.java.proto.Response.TransactionExtention> getProposalDeleteMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ProposalDeleteContract, org.stabila.java.proto.Response.TransactionExtention> getProposalDeleteMethod;
    if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
          WalletGrpc.getProposalDeleteMethod = getProposalDeleteMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ProposalDeleteContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ProposalDeleteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalDelete"))
              .build();
        }
      }
    }
    return getProposalDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CreateSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = org.stabila.java.proto.Contract.CreateSmartContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CreateSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.CreateSmartContract, org.stabila.java.proto.Response.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.CreateSmartContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateSettingContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSetting",
      requestType = org.stabila.java.proto.Contract.UpdateSettingContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateSettingContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateSettingMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateSettingContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateSettingMethod;
    if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
          WalletGrpc.getUpdateSettingMethod = getUpdateSettingMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UpdateSettingContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UpdateSettingContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateSetting"))
              .build();
        }
      }
    }
    return getUpdateSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateEnergyLimitContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnergyLimit",
      requestType = org.stabila.java.proto.Contract.UpdateEnergyLimitContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateEnergyLimitContract,
      org.stabila.java.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.UpdateEnergyLimitContract, org.stabila.java.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod;
    if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
          WalletGrpc.getUpdateEnergyLimitMethod = getUpdateEnergyLimitMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.UpdateEnergyLimitContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnergyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.UpdateEnergyLimitContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateEnergyLimit"))
              .build();
        }
      }
    }
    return getUpdateEnergyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ClearABIContract,
      org.stabila.java.proto.Response.TransactionExtention> getClearContractABIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearContractABI",
      requestType = org.stabila.java.proto.Contract.ClearABIContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ClearABIContract,
      org.stabila.java.proto.Response.TransactionExtention> getClearContractABIMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ClearABIContract, org.stabila.java.proto.Response.TransactionExtention> getClearContractABIMethod;
    if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
          WalletGrpc.getClearContractABIMethod = getClearContractABIMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ClearABIContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearContractABI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ClearABIContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ClearContractABI"))
              .build();
        }
      }
    }
    return getClearContractABIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = org.stabila.java.proto.Contract.TriggerSmartContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract, org.stabila.java.proto.Response.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TriggerSmartContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
              .build();
        }
      }
    }
    return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = org.stabila.java.proto.Contract.TriggerSmartContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract,
      org.stabila.java.proto.Response.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.TriggerSmartContract, org.stabila.java.proto.Response.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.TriggerSmartContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
              .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeCreate",
      requestType = org.stabila.java.proto.Contract.ExchangeCreateContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeCreateContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeCreateMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeCreateContract, org.stabila.java.proto.Response.TransactionExtention> getExchangeCreateMethod;
    if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
          WalletGrpc.getExchangeCreateMethod = getExchangeCreateMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ExchangeCreateContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ExchangeCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeCreate"))
              .build();
        }
      }
    }
    return getExchangeCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeInjectContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeInjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeInject",
      requestType = org.stabila.java.proto.Contract.ExchangeInjectContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeInjectContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeInjectMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeInjectContract, org.stabila.java.proto.Response.TransactionExtention> getExchangeInjectMethod;
    if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
          WalletGrpc.getExchangeInjectMethod = getExchangeInjectMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ExchangeInjectContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeInject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ExchangeInjectContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeInject"))
              .build();
        }
      }
    }
    return getExchangeInjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeWithdrawContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeWithdraw",
      requestType = org.stabila.java.proto.Contract.ExchangeWithdrawContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeWithdrawContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeWithdrawMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeWithdrawContract, org.stabila.java.proto.Response.TransactionExtention> getExchangeWithdrawMethod;
    if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
          WalletGrpc.getExchangeWithdrawMethod = getExchangeWithdrawMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ExchangeWithdrawContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ExchangeWithdrawContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeWithdraw"))
              .build();
        }
      }
    }
    return getExchangeWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeTransactionContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeTransaction",
      requestType = org.stabila.java.proto.Contract.ExchangeTransactionContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeTransactionContract,
      org.stabila.java.proto.Response.TransactionExtention> getExchangeTransactionMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.ExchangeTransactionContract, org.stabila.java.proto.Response.TransactionExtention> getExchangeTransactionMethod;
    if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
          WalletGrpc.getExchangeTransactionMethod = getExchangeTransactionMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.ExchangeTransactionContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.ExchangeTransactionContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeTransaction"))
              .build();
        }
      }
    }
    return getExchangeTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketSellAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getMarketSellAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketSellAsset",
      requestType = org.stabila.java.proto.Contract.MarketSellAssetContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketSellAssetContract,
      org.stabila.java.proto.Response.TransactionExtention> getMarketSellAssetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketSellAssetContract, org.stabila.java.proto.Response.TransactionExtention> getMarketSellAssetMethod;
    if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
          WalletGrpc.getMarketSellAssetMethod = getMarketSellAssetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.MarketSellAssetContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketSellAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.MarketSellAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketSellAsset"))
              .build();
        }
      }
    }
    return getMarketSellAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketCancelOrderContract,
      org.stabila.java.proto.Response.TransactionExtention> getMarketCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketCancelOrder",
      requestType = org.stabila.java.proto.Contract.MarketCancelOrderContract.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketCancelOrderContract,
      org.stabila.java.proto.Response.TransactionExtention> getMarketCancelOrderMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Contract.MarketCancelOrderContract, org.stabila.java.proto.Response.TransactionExtention> getMarketCancelOrderMethod;
    if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
          WalletGrpc.getMarketCancelOrderMethod = getMarketCancelOrderMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Contract.MarketCancelOrderContract, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketCancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.MarketCancelOrderContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketCancelOrder"))
              .build();
        }
      }
    }
    return getMarketCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.NodeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
              .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.ChainParameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
              .build();
        }
      }
    }
    return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
              .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
              .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = org.stabila.java.proto.Chain.Transaction.class,
      responseType = org.stabila.java.proto.Response.TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionSignWeight.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
              .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = org.stabila.java.proto.Chain.Transaction.class,
      responseType = org.stabila.java.proto.Response.TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction,
      org.stabila.java.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Chain.Transaction, org.stabila.java.proto.Response.TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionApprovedList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
              .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = org.stabila.java.api.GrpcAPI.AccountAddressMessage.class,
      responseType = org.stabila.java.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountIdMessage,
      org.stabila.java.proto.Response.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = org.stabila.java.api.GrpcAPI.AccountIdMessage.class,
      responseType = org.stabila.java.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountIdMessage,
      org.stabila.java.proto.Response.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountIdMessage, org.stabila.java.proto.Response.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.AccountIdMessage, org.stabila.java.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.AccountIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = org.stabila.java.api.GrpcAPI.AccountAddressMessage.class,
      responseType = org.stabila.java.proto.Response.AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AccountNetMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
              .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = org.stabila.java.api.GrpcAPI.AccountAddressMessage.class,
      responseType = org.stabila.java.proto.Response.AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AccountResourceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
              .build();
        }
      }
    }
    return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = org.stabila.java.api.GrpcAPI.AccountAddressMessage.class,
      responseType = org.stabila.java.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.AccountAddressMessage, org.stabila.java.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
              .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
              .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
              .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = org.stabila.java.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.stabila.java.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Chain.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Chain.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Chain.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
              .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Chain.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Chain.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Chain.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
              .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Chain.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Chain.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Chain.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
              .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit,
      org.stabila.java.proto.Response.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = org.stabila.java.api.GrpcAPI.BlockLimit.class,
      responseType = org.stabila.java.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit,
      org.stabila.java.proto.Response.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit, org.stabila.java.proto.Response.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BlockLimit, org.stabila.java.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit,
      org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = org.stabila.java.api.GrpcAPI.BlockLimit.class,
      responseType = org.stabila.java.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit,
      org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BlockLimit, org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BlockLimit, org.stabila.java.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Chain.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Chain.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Chain.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      responseType = org.stabila.java.proto.Response.TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage,
      org.stabila.java.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NumberMessage, org.stabila.java.proto.Response.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Common.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Common.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Common.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Common.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Common.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Common.SmartContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.SmartContractDataWrapper.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
              .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
              .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.DelegatedResourceMessage,
      org.stabila.java.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = org.stabila.java.proto.Response.DelegatedResourceMessage.class,
      responseType = org.stabila.java.proto.Response.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.DelegatedResourceMessage,
      org.stabila.java.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.DelegatedResourceMessage, org.stabila.java.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.DelegatedResourceMessage, org.stabila.java.proto.Response.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
              .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
              .build();
        }
      }
    }
    return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = org.stabila.java.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.stabila.java.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
              .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = org.stabila.java.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.stabila.java.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage,
      org.stabila.java.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.PaginatedMessage, org.stabila.java.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
              .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = org.stabila.java.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters, org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters, org.stabila.java.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = org.stabila.java.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters, org.stabila.java.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters, org.stabila.java.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NfTRC20Parameters,
      org.stabila.java.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = org.stabila.java.api.GrpcAPI.NfTRC20Parameters.class,
      responseType = org.stabila.java.proto.Response.NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NfTRC20Parameters,
      org.stabila.java.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.NfTRC20Parameters, org.stabila.java.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.NfTRC20Parameters, org.stabila.java.proto.Response.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
              .build();
        }
      }
    }
    return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.proto.Response.MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.proto.Response.MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.proto.Response.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
              .build();
        }
      }
    }
    return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair,
      org.stabila.java.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = org.stabila.java.proto.Response.MarketOrderPair.class,
      responseType = org.stabila.java.proto.Response.MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair,
      org.stabila.java.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair, org.stabila.java.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.MarketOrderPair, org.stabila.java.proto.Response.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
              .build();
        }
      }
    }
    return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair,
      org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = org.stabila.java.proto.Response.MarketOrderPair.class,
      responseType = org.stabila.java.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair,
      org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.MarketOrderPair, org.stabila.java.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.MarketOrderPair, org.stabila.java.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
              .build();
        }
      }
    }
    return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Chain.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
      requestType = org.stabila.java.proto.Response.TransactionSign.class,
      responseType = org.stabila.java.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Chain.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Chain.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
              .build();
        }
      }
    }
    return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Response.TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
      requestType = org.stabila.java.proto.Response.TransactionSign.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Response.TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Response.TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
              .build();
        }
      }
    }
    return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
      requestType = org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage.class,
      responseType = org.stabila.java.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage, org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage, org.stabila.java.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
              .build();
        }
      }
    }
    return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
      requestType = org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage.class,
      responseType = org.stabila.java.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage, org.stabila.java.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAssetByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
      requestType = org.stabila.java.api.GrpcAPI.EasyTransferMessage.class,
      responseType = org.stabila.java.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferMessage, org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EasyTransferMessage, org.stabila.java.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EasyTransferMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
              .build();
        }
      }
    }
    return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
      requestType = org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage.class,
      responseType = org.stabila.java.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage,
      org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage, org.stabila.java.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage, org.stabila.java.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.proto.Response.AddressPrKeyPairMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.proto.Response.AddressPrKeyPairMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.AddressPrKeyPairMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
              .build();
        }
      }
    }
    return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Response.TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSign",
      requestType = org.stabila.java.proto.Response.TransactionSign.class,
      responseType = org.stabila.java.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign,
      org.stabila.java.proto.Response.TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Response.TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.proto.Response.TransactionSign, org.stabila.java.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
              .build();
        }
      }
    }
    return getAddSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
              .build();
        }
      }
    }
    return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
              .build();
        }
      }
    }
    return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
              .build();
        }
      }
    }
    return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.BytesMessage, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
              .build();
        }
      }
    }
    return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ViewingKeyMessage,
      org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = org.stabila.java.api.GrpcAPI.ViewingKeyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ViewingKeyMessage,
      org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ViewingKeyMessage, org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.ViewingKeyMessage, org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
              .build();
        }
      }
    }
    return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.DiversifierMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
              .build();
        }
      }
    }
    return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.stabila.java.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.stabila.java.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.stabila.java.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.stabila.java.api.GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
              .build();
        }
      }
    }
    return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
              .build();
        }
      }
    }
    return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = org.stabila.java.api.GrpcAPI.EmptyMessage.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.EmptyMessage, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
              .build();
        }
      }
    }
    return getGetRcmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersWithoutAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = org.stabila.java.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.stabila.java.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.stabila.java.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod =
              io.grpc.MethodDescriptor.<org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.stabila.java.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stabila.java.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
              .build();
        }
      }
    }
    return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
        @java.lang.Override
        public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletStub(channel, callOptions);
        }
      };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
        @java.lang.Override
        public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletBlockingStub(channel, callOptions);
        }
      };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
        @java.lang.Override
        public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletFutureStub(channel, callOptions);
        }
      };
    return WalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionReturn> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommonTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createAccount(org.stabila.java.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void createAccount2(org.stabila.java.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccount2Method(), responseObserver);
    }

    /**
     */
    public void updateAccount(org.stabila.java.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateAccount2(org.stabila.java.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccount2Method(), responseObserver);
    }

    /**
     */
    public void setAccountId(org.stabila.java.proto.Contract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAccountIdMethod(), responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.stabila.java.proto.Contract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountPermissionUpdateMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(org.stabila.java.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction2(org.stabila.java.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransaction2Method(), responseObserver);
    }

    /**
     */
    public void createAssetIssue(org.stabila.java.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void createAssetIssue2(org.stabila.java.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void updateAsset(org.stabila.java.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     */
    public void updateAsset2(org.stabila.java.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAsset2Method(), responseObserver);
    }

    /**
     */
    public void transferAsset(org.stabila.java.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void transferAsset2(org.stabila.java.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferAsset2Method(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getParticipateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void uncdAsset(org.stabila.java.proto.Contract.UncdAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUncdAssetMethod(), responseObserver);
    }

    /**
     */
    public void uncdAsset2(org.stabila.java.proto.Contract.UncdAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUncdAsset2Method(), responseObserver);
    }

    /**
     */
    public void createWitness(org.stabila.java.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void createWitness2(org.stabila.java.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     */
    public void updateWitness(org.stabila.java.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void updateWitness2(org.stabila.java.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWitness2Method(), responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.stabila.java.proto.Contract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBrokerageMethod(), responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(org.stabila.java.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteWitnessAccountMethod(), responseObserver);
    }

    /**
     */
    public void voteWitnessAccount2(org.stabila.java.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteWitnessAccount2Method(), responseObserver);
    }

    /**
     */
    public void cdBalance(org.stabila.java.proto.Contract.CdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getCdBalanceMethod(), responseObserver);
    }

    /**
     */
    public void cdBalance2(org.stabila.java.proto.Contract.CdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getCdBalance2Method(), responseObserver);
    }

    /**
     */
    public void uncdBalance(org.stabila.java.proto.Contract.UncdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getUncdBalanceMethod(), responseObserver);
    }

    /**
     */
    public void uncdBalance2(org.stabila.java.proto.Contract.UncdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUncdBalance2Method(), responseObserver);
    }

    /**
     */
    public void withdrawBalance(org.stabila.java.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalanceMethod(), responseObserver);
    }

    /**
     */
    public void withdrawBalance2(org.stabila.java.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     */
    public void proposalCreate(org.stabila.java.proto.Contract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalCreateMethod(), responseObserver);
    }

    /**
     */
    public void proposalApprove(org.stabila.java.proto.Contract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalApproveMethod(), responseObserver);
    }

    /**
     */
    public void proposalDelete(org.stabila.java.proto.Contract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deployContract(org.stabila.java.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     */
    public void updateSetting(org.stabila.java.proto.Contract.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSettingMethod(), responseObserver);
    }

    /**
     */
    public void updateEnergyLimit(org.stabila.java.proto.Contract.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEnergyLimitMethod(), responseObserver);
    }

    /**
     */
    public void clearContractABI(org.stabila.java.proto.Contract.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getClearContractABIMethod(), responseObserver);
    }

    /**
     */
    public void triggerContract(org.stabila.java.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.stabila.java.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    public void exchangeCreate(org.stabila.java.proto.Contract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeCreateMethod(), responseObserver);
    }

    /**
     */
    public void exchangeInject(org.stabila.java.proto.Contract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeInjectMethod(), responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(org.stabila.java.proto.Contract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void exchangeTransaction(org.stabila.java.proto.Contract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeTransactionMethod(), responseObserver);
    }

    /**
     */
    public void marketSellAsset(org.stabila.java.proto.Contract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getMarketSellAssetMethod(), responseObserver);
    }

    /**
     */
    public void marketCancelOrder(org.stabila.java.proto.Contract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getMarketCancelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    public void listNodes(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getChainParameters(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ChainParameters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    public void totalTransaction(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionSignWeight> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionApprovedList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountById(org.stabila.java.api.GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNet(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountNetMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    public void getAccountResource(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountResourceMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock2(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByNum2(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(org.stabila.java.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(org.stabila.java.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getContract(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Common.SmartContract> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.SmartContractDataWrapper> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    public void listWitnesses(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.WitnessList> responseObserver) {
      asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.stabila.java.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    public void listProposals(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    public void getProposalById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Proposal> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    public void listExchanges(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    public void getExchangeById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Exchange> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20> responseObserver) {
      asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(org.stabila.java.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NullifierResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.stabila.java.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketPriceList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.stabila.java.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPairList(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderPairList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSign2(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     */
    public void easyTransferAsset(org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void easyTransfer(org.stabila.java.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void generateAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    public void addSign(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getAkFromAsk(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    public void getNkFromNsk(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(org.stabila.java.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getDiversifier(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    public void getRcm(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBroadcastTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Chain.Transaction,
                org.stabila.java.proto.Response.TransactionReturn>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .addMethod(
            getCreateCommonTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Chain.Transaction,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_COMMON_TRANSACTION)))
          .addMethod(
            getCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AccountCreateContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getCreateAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AccountCreateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_ACCOUNT2)))
          .addMethod(
            getUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AccountUpdateContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getUpdateAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AccountUpdateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ACCOUNT2)))
          .addMethod(
            getSetAccountIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.SetAccountIdContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_SET_ACCOUNT_ID)))
          .addMethod(
            getAccountPermissionUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AccountPermissionUpdateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_ACCOUNT_PERMISSION_UPDATE)))
          .addMethod(
            getCreateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TransferContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getCreateTransaction2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TransferContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_TRANSACTION2)))
          .addMethod(
            getCreateAssetIssueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AssetIssueContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_CREATE_ASSET_ISSUE)))
          .addMethod(
            getCreateAssetIssue2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.AssetIssueContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_ASSET_ISSUE2)))
          .addMethod(
            getUpdateAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UpdateAssetContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_ASSET)))
          .addMethod(
            getUpdateAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UpdateAssetContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ASSET2)))
          .addMethod(
            getTransferAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TransferAssetContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_TRANSFER_ASSET)))
          .addMethod(
            getTransferAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TransferAssetContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_TRANSFER_ASSET2)))
          .addMethod(
            getParticipateAssetIssueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE)))
          .addMethod(
            getParticipateAssetIssue2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ParticipateAssetIssueContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE2)))
          .addMethod(
            getUncdAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UncdAssetContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_UNCD_ASSET)))
          .addMethod(
            getUncdAsset2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UncdAssetContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UNCD_ASSET2)))
          .addMethod(
            getCreateWitnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WitnessCreateContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_CREATE_WITNESS)))
          .addMethod(
            getCreateWitness2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WitnessCreateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_WITNESS2)))
          .addMethod(
            getUpdateWitnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WitnessUpdateContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_WITNESS)))
          .addMethod(
            getUpdateWitness2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WitnessUpdateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_WITNESS2)))
          .addMethod(
            getUpdateBrokerageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UpdateBrokerageContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_BROKERAGE)))
          .addMethod(
            getVoteWitnessAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.VoteWitnessContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT)))
          .addMethod(
            getVoteWitnessAccount2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.VoteWitnessContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT2)))
          .addMethod(
            getCdBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.CdBalanceContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_CD_BALANCE)))
          .addMethod(
            getCdBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.CdBalanceContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CD_BALANCE2)))
          .addMethod(
            getUncdBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UncdBalanceContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_UNCD_BALANCE)))
          .addMethod(
            getUncdBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UncdBalanceContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UNCD_BALANCE2)))
          .addMethod(
            getWithdrawBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WithdrawBalanceContract,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_WITHDRAW_BALANCE)))
          .addMethod(
            getWithdrawBalance2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.WithdrawBalanceContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_WITHDRAW_BALANCE2)))
          .addMethod(
            getProposalCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ProposalCreateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_CREATE)))
          .addMethod(
            getProposalApproveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ProposalApproveContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_APPROVE)))
          .addMethod(
            getProposalDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ProposalDeleteContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_DELETE)))
          .addMethod(
            getDeployContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.CreateSmartContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_DEPLOY_CONTRACT)))
          .addMethod(
            getUpdateSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UpdateSettingContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_SETTING)))
          .addMethod(
            getUpdateEnergyLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.UpdateEnergyLimitContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ENERGY_LIMIT)))
          .addMethod(
            getClearContractABIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ClearABIContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_CLEAR_CONTRACT_ABI)))
          .addMethod(
            getTriggerContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TriggerSmartContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_TRIGGER_CONTRACT)))
          .addMethod(
            getTriggerConstantContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.TriggerSmartContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_TRIGGER_CONSTANT_CONTRACT)))
          .addMethod(
            getExchangeCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ExchangeCreateContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_CREATE)))
          .addMethod(
            getExchangeInjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ExchangeInjectContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_INJECT)))
          .addMethod(
            getExchangeWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ExchangeWithdrawContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_WITHDRAW)))
          .addMethod(
            getExchangeTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.ExchangeTransactionContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_TRANSACTION)))
          .addMethod(
            getMarketSellAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.MarketSellAssetContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_MARKET_SELL_ASSET)))
          .addMethod(
            getMarketCancelOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Contract.MarketCancelOrderContract,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_MARKET_CANCEL_ORDER)))
          .addMethod(
            getGetNodeInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.NodeInfo>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.NodeList>(
                  this, METHODID_LIST_NODES)))
          .addMethod(
            getGetChainParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.ChainParameters>(
                  this, METHODID_GET_CHAIN_PARAMETERS)))
          .addMethod(
            getTotalTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.NumberMessage>(
                  this, METHODID_TOTAL_TRANSACTION)))
          .addMethod(
            getGetNextMaintenanceTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_NEXT_MAINTENANCE_TIME)))
          .addMethod(
            getGetTransactionSignWeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Chain.Transaction,
                org.stabila.java.proto.Response.TransactionSignWeight>(
                  this, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
          .addMethod(
            getGetTransactionApprovedListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Chain.Transaction,
                org.stabila.java.proto.Response.TransactionApprovedList>(
                  this, METHODID_GET_TRANSACTION_APPROVED_LIST)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.AccountAddressMessage,
                org.stabila.java.proto.Response.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.AccountIdMessage,
                org.stabila.java.proto.Response.Account>(
                  this, METHODID_GET_ACCOUNT_BY_ID)))
          .addMethod(
            getGetAccountNetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.AccountAddressMessage,
                org.stabila.java.proto.Response.AccountNetMessage>(
                  this, METHODID_GET_ACCOUNT_NET)))
          .addMethod(
            getGetAccountResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.AccountAddressMessage,
                org.stabila.java.proto.Response.AccountResourceMessage>(
                  this, METHODID_GET_ACCOUNT_RESOURCE)))
          .addMethod(
            getGetAssetIssueByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.AccountAddressMessage,
                org.stabila.java.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
          .addMethod(
            getGetAssetIssueByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_NAME)))
          .addMethod(
            getGetAssetIssueListByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
          .addMethod(
            getGetAssetIssueByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ID)))
          .addMethod(
            getGetAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetPaginatedAssetIssueListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.PaginatedMessage,
                org.stabila.java.proto.Response.AssetIssueList>(
                  this, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetNowBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Chain.Block>(
                  this, METHODID_GET_NOW_BLOCK)))
          .addMethod(
            getGetNowBlock2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.BlockExtention>(
                  this, METHODID_GET_NOW_BLOCK2)))
          .addMethod(
            getGetBlockByNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.proto.Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_NUM)))
          .addMethod(
            getGetBlockByNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.proto.Response.BlockExtention>(
                  this, METHODID_GET_BLOCK_BY_NUM2)))
          .addMethod(
            getGetBlockByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_ID)))
          .addMethod(
            getGetBlockByLimitNextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BlockLimit,
                org.stabila.java.proto.Response.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
          .addMethod(
            getGetBlockByLimitNext2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BlockLimit,
                org.stabila.java.proto.Response.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
          .addMethod(
            getGetBlockByLatestNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.proto.Response.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM)))
          .addMethod(
            getGetBlockByLatestNum2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.proto.Response.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
          .addMethod(
            getGetTransactionCountByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
          .addMethod(
            getGetTransactionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_BY_ID)))
          .addMethod(
            getGetTransactionInfoByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.TransactionInfo>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_ID)))
          .addMethod(
            getGetTransactionInfoByBlockNumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NumberMessage,
                org.stabila.java.proto.Response.TransactionInfoList>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
          .addMethod(
            getGetContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Common.SmartContract>(
                  this, METHODID_GET_CONTRACT)))
          .addMethod(
            getGetContractInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.SmartContractDataWrapper>(
                  this, METHODID_GET_CONTRACT_INFO)))
          .addMethod(
            getListWitnessesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.WitnessList>(
                  this, METHODID_LIST_WITNESSES)))
          .addMethod(
            getGetBrokerageInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BROKERAGE_INFO)))
          .addMethod(
            getGetRewardInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_REWARD_INFO)))
          .addMethod(
            getGetDelegatedResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.DelegatedResourceMessage,
                org.stabila.java.proto.Response.DelegatedResourceList>(
                  this, METHODID_GET_DELEGATED_RESOURCE)))
          .addMethod(
            getGetDelegatedResourceAccountIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.DelegatedResourceAccountIndex>(
                  this, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
          .addMethod(
            getListProposalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.ProposalList>(
                  this, METHODID_LIST_PROPOSALS)))
          .addMethod(
            getGetProposalByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.Proposal>(
                  this, METHODID_GET_PROPOSAL_BY_ID)))
          .addMethod(
            getGetPaginatedProposalListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.PaginatedMessage,
                org.stabila.java.proto.Response.ProposalList>(
                  this, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
          .addMethod(
            getListExchangesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.ExchangeList>(
                  this, METHODID_LIST_EXCHANGES)))
          .addMethod(
            getGetExchangeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.Exchange>(
                  this, METHODID_GET_EXCHANGE_BY_ID)))
          .addMethod(
            getGetPaginatedExchangeListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.PaginatedMessage,
                org.stabila.java.proto.Response.ExchangeList>(
                  this, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
          .addMethod(
            getScanShieldedTRC20NotesByIvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters,
                org.stabila.java.proto.Response.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
          .addMethod(
            getScanShieldedTRC20NotesByOvkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters,
                org.stabila.java.proto.Response.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
          .addMethod(
            getIsShieldedTRC20ContractNoteSpentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.NfTRC20Parameters,
                org.stabila.java.proto.Response.NullifierResult>(
                  this, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
          .addMethod(
            getGetMarketOrderByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
          .addMethod(
            getGetMarketOrderByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.proto.Response.MarketOrder>(
                  this, METHODID_GET_MARKET_ORDER_BY_ID)))
          .addMethod(
            getGetMarketPriceByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.MarketOrderPair,
                org.stabila.java.proto.Response.MarketPriceList>(
                  this, METHODID_GET_MARKET_PRICE_BY_PAIR)))
          .addMethod(
            getGetMarketOrderListByPairMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.MarketOrderPair,
                org.stabila.java.proto.Response.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
          .addMethod(
            getGetMarketPairListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.MarketOrderPairList>(
                  this, METHODID_GET_MARKET_PAIR_LIST)))
          .addMethod(
            getGetTransactionSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.TransactionSign,
                org.stabila.java.proto.Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_SIGN)))
          .addMethod(
            getGetTransactionSign2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.TransactionSign,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_GET_TRANSACTION_SIGN2)))
          .addMethod(
            getEasyTransferAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage,
                org.stabila.java.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET)))
          .addMethod(
            getEasyTransferAssetByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
                org.stabila.java.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
          .addMethod(
            getEasyTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EasyTransferMessage,
                org.stabila.java.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER)))
          .addMethod(
            getEasyTransferByPrivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage,
                org.stabila.java.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_BY_PRIVATE)))
          .addMethod(
            getCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGenerateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.proto.Response.AddressPrKeyPairMessage>(
                  this, METHODID_GENERATE_ADDRESS)))
          .addMethod(
            getAddSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.proto.Response.TransactionSign,
                org.stabila.java.proto.Response.TransactionExtention>(
                  this, METHODID_ADD_SIGN)))
          .addMethod(
            getGetSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_SPENDING_KEY)))
          .addMethod(
            getGetExpandedSpendingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage>(
                  this, METHODID_GET_EXPANDED_SPENDING_KEY)))
          .addMethod(
            getGetAkFromAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_AK_FROM_ASK)))
          .addMethod(
            getGetNkFromNskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.BytesMessage,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_NK_FROM_NSK)))
          .addMethod(
            getGetIncomingViewingKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.ViewingKeyMessage,
                org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage>(
                  this, METHODID_GET_INCOMING_VIEWING_KEY)))
          .addMethod(
            getGetDiversifierMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.DiversifierMessage>(
                  this, METHODID_GET_DIVERSIFIER)))
          .addMethod(
            getGetZenPaymentAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
                org.stabila.java.api.GrpcAPI.PaymentAddressMessage>(
                  this, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
          .addMethod(
            getGetNewShieldedAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.ShieldedAddressInfo>(
                  this, METHODID_GET_NEW_SHIELDED_ADDRESS)))
          .addMethod(
            getGetRcmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.EmptyMessage,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_RCM)))
          .addMethod(
            getCreateShieldedContractParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters,
                org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
          .addMethod(
            getCreateShieldedContractParametersWithoutAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
                org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
          .addMethod(
            getGetTriggerInputForShieldedTRC20ContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
                org.stabila.java.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
          .build();
    }
  }

  /**
   */
  public static final class WalletStub extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionReturn> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount(org.stabila.java.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount2(org.stabila.java.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount(org.stabila.java.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount2(org.stabila.java.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccountId(org.stabila.java.proto.Contract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(org.stabila.java.proto.Contract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(org.stabila.java.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction2(org.stabila.java.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue(org.stabila.java.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue2(org.stabila.java.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset(org.stabila.java.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset2(org.stabila.java.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset(org.stabila.java.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset2(org.stabila.java.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncdAsset(org.stabila.java.proto.Contract.UncdAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUncdAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncdAsset2(org.stabila.java.proto.Contract.UncdAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUncdAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWitness(org.stabila.java.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWitness2(org.stabila.java.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWitness(org.stabila.java.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWitness2(org.stabila.java.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrokerage(org.stabila.java.proto.Contract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(org.stabila.java.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteWitnessAccount2(org.stabila.java.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cdBalance(org.stabila.java.proto.Contract.CdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCdBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cdBalance2(org.stabila.java.proto.Contract.CdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCdBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncdBalance(org.stabila.java.proto.Contract.UncdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUncdBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncdBalance2(org.stabila.java.proto.Contract.UncdBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUncdBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance(org.stabila.java.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance2(org.stabila.java.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalCreate(org.stabila.java.proto.Contract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalApprove(org.stabila.java.proto.Contract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalDelete(org.stabila.java.proto.Contract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deployContract(org.stabila.java.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSetting(org.stabila.java.proto.Contract.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnergyLimit(org.stabila.java.proto.Contract.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearContractABI(org.stabila.java.proto.Contract.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerContract(org.stabila.java.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.stabila.java.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeCreate(org.stabila.java.proto.Contract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeInject(org.stabila.java.proto.Contract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(org.stabila.java.proto.Contract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeTransaction(org.stabila.java.proto.Contract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketSellAsset(org.stabila.java.proto.Contract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketCancelOrder(org.stabila.java.proto.Contract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ChainParameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionSignWeight> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.stabila.java.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionApprovedList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(org.stabila.java.api.GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountNetMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountResourceMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock2(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNum2(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(org.stabila.java.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(org.stabila.java.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Common.SmartContract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.SmartContractDataWrapper> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.WitnessList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.stabila.java.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Proposal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Exchange> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(org.stabila.java.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(org.stabila.java.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NullifierResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.stabila.java.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketPriceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.stabila.java.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderPairList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSign2(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAsset(org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransfer(org.stabila.java.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(org.stabila.java.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(org.stabila.java.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(org.stabila.java.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.DiversifierMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(org.stabila.java.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public org.stabila.java.proto.Response.TransactionReturn broadcastTransaction(org.stabila.java.proto.Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention createCommonTransaction(org.stabila.java.proto.Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommonTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction createAccount(org.stabila.java.proto.Contract.AccountCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention createAccount2(org.stabila.java.proto.Contract.AccountCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction updateAccount(org.stabila.java.proto.Contract.AccountUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateAccount2(org.stabila.java.proto.Contract.AccountUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction setAccountId(org.stabila.java.proto.Contract.SetAccountIdContract request) {
      return blockingUnaryCall(
          getChannel(), getSetAccountIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention accountPermissionUpdate(org.stabila.java.proto.Contract.AccountPermissionUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getAccountPermissionUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction createTransaction(org.stabila.java.proto.Contract.TransferContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention createTransaction2(org.stabila.java.proto.Contract.TransferContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransaction2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction createAssetIssue(org.stabila.java.proto.Contract.AssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention createAssetIssue2(org.stabila.java.proto.Contract.AssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction updateAsset(org.stabila.java.proto.Contract.UpdateAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateAsset2(org.stabila.java.proto.Contract.UpdateAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction transferAsset(org.stabila.java.proto.Contract.TransferAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention transferAsset2(org.stabila.java.proto.Contract.TransferAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getTransferAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction participateAssetIssue(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getParticipateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention participateAssetIssue2(org.stabila.java.proto.Contract.ParticipateAssetIssueContract request) {
      return blockingUnaryCall(
          getChannel(), getParticipateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction uncdAsset(org.stabila.java.proto.Contract.UncdAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUncdAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention uncdAsset2(org.stabila.java.proto.Contract.UncdAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getUncdAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction createWitness(org.stabila.java.proto.Contract.WitnessCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention createWitness2(org.stabila.java.proto.Contract.WitnessCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction updateWitness(org.stabila.java.proto.Contract.WitnessUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateWitness2(org.stabila.java.proto.Contract.WitnessUpdateContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateBrokerage(org.stabila.java.proto.Contract.UpdateBrokerageContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBrokerageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction voteWitnessAccount(org.stabila.java.proto.Contract.VoteWitnessContract request) {
      return blockingUnaryCall(
          getChannel(), getVoteWitnessAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention voteWitnessAccount2(org.stabila.java.proto.Contract.VoteWitnessContract request) {
      return blockingUnaryCall(
          getChannel(), getVoteWitnessAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction cdBalance(org.stabila.java.proto.Contract.CdBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getCdBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention cdBalance2(org.stabila.java.proto.Contract.CdBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getCdBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction uncdBalance(org.stabila.java.proto.Contract.UncdBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getUncdBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention uncdBalance2(org.stabila.java.proto.Contract.UncdBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getUncdBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction withdrawBalance(org.stabila.java.proto.Contract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention withdrawBalance2(org.stabila.java.proto.Contract.WithdrawBalanceContract request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention proposalCreate(org.stabila.java.proto.Contract.ProposalCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention proposalApprove(org.stabila.java.proto.Contract.ProposalApproveContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention proposalDelete(org.stabila.java.proto.Contract.ProposalDeleteContract request) {
      return blockingUnaryCall(
          getChannel(), getProposalDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention deployContract(org.stabila.java.proto.Contract.CreateSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateSetting(org.stabila.java.proto.Contract.UpdateSettingContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention updateEnergyLimit(org.stabila.java.proto.Contract.UpdateEnergyLimitContract request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEnergyLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention clearContractABI(org.stabila.java.proto.Contract.ClearABIContract request) {
      return blockingUnaryCall(
          getChannel(), getClearContractABIMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention triggerContract(org.stabila.java.proto.Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention triggerConstantContract(org.stabila.java.proto.Contract.TriggerSmartContract request) {
      return blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention exchangeCreate(org.stabila.java.proto.Contract.ExchangeCreateContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention exchangeInject(org.stabila.java.proto.Contract.ExchangeInjectContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeInjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention exchangeWithdraw(org.stabila.java.proto.Contract.ExchangeWithdrawContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention exchangeTransaction(org.stabila.java.proto.Contract.ExchangeTransactionContract request) {
      return blockingUnaryCall(
          getChannel(), getExchangeTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention marketSellAsset(org.stabila.java.proto.Contract.MarketSellAssetContract request) {
      return blockingUnaryCall(
          getChannel(), getMarketSellAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention marketCancelOrder(org.stabila.java.proto.Contract.MarketCancelOrderContract request) {
      return blockingUnaryCall(
          getChannel(), getMarketCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public org.stabila.java.proto.Response.NodeInfo getNodeInfo(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.NodeList listNodes(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.ChainParameters getChainParameters(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.NumberMessage totalTransaction(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.NumberMessage getNextMaintenanceTime(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionSignWeight getTransactionSignWeight(org.stabila.java.proto.Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionApprovedList getTransactionApprovedList(org.stabila.java.proto.Chain.Transaction request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public org.stabila.java.proto.Response.Account getAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.Account getAccountById(org.stabila.java.api.GrpcAPI.AccountIdMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AccountNetMessage getAccountNet(org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AccountResourceMessage getAccountResource(org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AssetIssueList getAssetIssueByAccount(org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Contract.AssetIssueContract getAssetIssueByName(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AssetIssueList getAssetIssueListByName(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Contract.AssetIssueContract getAssetIssueById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AssetIssueList getAssetIssueList(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AssetIssueList getPaginatedAssetIssueList(org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Block getNowBlock(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockExtention getNowBlock2(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Block getBlockByNum(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockExtention getBlockByNum2(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public org.stabila.java.proto.Chain.Block getBlockById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockList getBlockByLimitNext(org.stabila.java.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockListExtention getBlockByLimitNext2(org.stabila.java.api.GrpcAPI.BlockLimit request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockList getBlockByLatestNum(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.BlockListExtention getBlockByLatestNum2(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.NumberMessage getTransactionCountByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Chain.Transaction getTransactionById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionInfo getTransactionInfoById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionInfoList getTransactionInfoByBlockNum(org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Common.SmartContract getContract(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public org.stabila.java.proto.Response.SmartContractDataWrapper getContractInfo(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.WitnessList listWitnesses(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.NumberMessage getBrokerageInfo(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.NumberMessage getRewardInfo(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.DelegatedResourceList getDelegatedResource(org.stabila.java.proto.Response.DelegatedResourceMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.ProposalList listProposals(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.Proposal getProposalById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.ProposalList getPaginatedProposalList(org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.ExchangeList listExchanges(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.Exchange getExchangeById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.ExchangeList getPaginatedExchangeList(org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public org.stabila.java.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.NullifierResult isShieldedTRC20ContractNoteSpent(org.stabila.java.api.GrpcAPI.NfTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public org.stabila.java.proto.Response.MarketOrderList getMarketOrderByAccount(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.MarketOrder getMarketOrderById(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.MarketPriceList getMarketPriceByPair(org.stabila.java.proto.Response.MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.MarketOrderList getMarketOrderListByPair(org.stabila.java.proto.Response.MarketOrderPair request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.MarketOrderPairList getMarketPairList(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public org.stabila.java.proto.Chain.Transaction getTransactionSign(org.stabila.java.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention getTransactionSign2(org.stabila.java.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.EasyTransferResponse easyTransferAsset(org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.EasyTransferResponse easyTransferAssetByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.EasyTransferResponse easyTransfer(org.stabila.java.api.GrpcAPI.EasyTransferMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.EasyTransferResponse easyTransferByPrivate(org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return blockingUnaryCall(
          getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage createAddress(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.AddressPrKeyPairMessage generateAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.proto.Response.TransactionExtention addSign(org.stabila.java.proto.Response.TransactionSign request) {
      return blockingUnaryCall(
          getChannel(), getAddSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage getSpendingKey(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage getAkFromAsk(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage getNkFromNsk(org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(org.stabila.java.api.GrpcAPI.ViewingKeyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.DiversifierMessage getDiversifier(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.PaymentAddressMessage getZenPaymentAddress(org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage getRcm(org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stabila.java.api.GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionReturn> broadcastTransaction(
        org.stabila.java.proto.Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> createCommonTransaction(
        org.stabila.java.proto.Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> createAccount(
        org.stabila.java.proto.Contract.AccountCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> createAccount2(
        org.stabila.java.proto.Contract.AccountCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> updateAccount(
        org.stabila.java.proto.Contract.AccountUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateAccount2(
        org.stabila.java.proto.Contract.AccountUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> setAccountId(
        org.stabila.java.proto.Contract.SetAccountIdContract request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> accountPermissionUpdate(
        org.stabila.java.proto.Contract.AccountPermissionUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> createTransaction(
        org.stabila.java.proto.Contract.TransferContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> createTransaction2(
        org.stabila.java.proto.Contract.TransferContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> createAssetIssue(
        org.stabila.java.proto.Contract.AssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> createAssetIssue2(
        org.stabila.java.proto.Contract.AssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> updateAsset(
        org.stabila.java.proto.Contract.UpdateAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateAsset2(
        org.stabila.java.proto.Contract.UpdateAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> transferAsset(
        org.stabila.java.proto.Contract.TransferAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> transferAsset2(
        org.stabila.java.proto.Contract.TransferAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> participateAssetIssue(
        org.stabila.java.proto.Contract.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> participateAssetIssue2(
        org.stabila.java.proto.Contract.ParticipateAssetIssueContract request) {
      return futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> uncdAsset(
        org.stabila.java.proto.Contract.UncdAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUncdAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> uncdAsset2(
        org.stabila.java.proto.Contract.UncdAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUncdAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> createWitness(
        org.stabila.java.proto.Contract.WitnessCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> createWitness2(
        org.stabila.java.proto.Contract.WitnessCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> updateWitness(
        org.stabila.java.proto.Contract.WitnessUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateWitness2(
        org.stabila.java.proto.Contract.WitnessUpdateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateBrokerage(
        org.stabila.java.proto.Contract.UpdateBrokerageContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> voteWitnessAccount(
        org.stabila.java.proto.Contract.VoteWitnessContract request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> voteWitnessAccount2(
        org.stabila.java.proto.Contract.VoteWitnessContract request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> cdBalance(
        org.stabila.java.proto.Contract.CdBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCdBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> cdBalance2(
        org.stabila.java.proto.Contract.CdBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getCdBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> uncdBalance(
        org.stabila.java.proto.Contract.UncdBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUncdBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> uncdBalance2(
        org.stabila.java.proto.Contract.UncdBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUncdBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> withdrawBalance(
        org.stabila.java.proto.Contract.WithdrawBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> withdrawBalance2(
        org.stabila.java.proto.Contract.WithdrawBalanceContract request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> proposalCreate(
        org.stabila.java.proto.Contract.ProposalCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> proposalApprove(
        org.stabila.java.proto.Contract.ProposalApproveContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> proposalDelete(
        org.stabila.java.proto.Contract.ProposalDeleteContract request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> deployContract(
        org.stabila.java.proto.Contract.CreateSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateSetting(
        org.stabila.java.proto.Contract.UpdateSettingContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> updateEnergyLimit(
        org.stabila.java.proto.Contract.UpdateEnergyLimitContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> clearContractABI(
        org.stabila.java.proto.Contract.ClearABIContract request) {
      return futureUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> triggerContract(
        org.stabila.java.proto.Contract.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> triggerConstantContract(
        org.stabila.java.proto.Contract.TriggerSmartContract request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> exchangeCreate(
        org.stabila.java.proto.Contract.ExchangeCreateContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> exchangeInject(
        org.stabila.java.proto.Contract.ExchangeInjectContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> exchangeWithdraw(
        org.stabila.java.proto.Contract.ExchangeWithdrawContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> exchangeTransaction(
        org.stabila.java.proto.Contract.ExchangeTransactionContract request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> marketSellAsset(
        org.stabila.java.proto.Contract.MarketSellAssetContract request) {
      return futureUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> marketCancelOrder(
        org.stabila.java.proto.Contract.MarketCancelOrderContract request) {
      return futureUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.NodeInfo> getNodeInfo(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.NodeList> listNodes(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.ChainParameters> getChainParameters(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.NumberMessage> totalTransaction(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.NumberMessage> getNextMaintenanceTime(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionSignWeight> getTransactionSignWeight(
        org.stabila.java.proto.Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionApprovedList> getTransactionApprovedList(
        org.stabila.java.proto.Chain.Transaction request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.Account> getAccount(
        org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.Account> getAccountById(
        org.stabila.java.api.GrpcAPI.AccountIdMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AccountNetMessage> getAccountNet(
        org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AccountResourceMessage> getAccountResource(
        org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AssetIssueList> getAssetIssueByAccount(
        org.stabila.java.api.GrpcAPI.AccountAddressMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Contract.AssetIssueContract> getAssetIssueByName(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AssetIssueList> getAssetIssueListByName(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Contract.AssetIssueContract> getAssetIssueById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AssetIssueList> getAssetIssueList(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AssetIssueList> getPaginatedAssetIssueList(
        org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Block> getNowBlock(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockExtention> getNowBlock2(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Block> getBlockByNum(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockExtention> getBlockByNum2(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Block> getBlockById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockList> getBlockByLimitNext(
        org.stabila.java.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockListExtention> getBlockByLimitNext2(
        org.stabila.java.api.GrpcAPI.BlockLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockList> getBlockByLatestNum(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.BlockListExtention> getBlockByLatestNum2(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> getTransactionById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionInfo> getTransactionInfoById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionInfoList> getTransactionInfoByBlockNum(
        org.stabila.java.api.GrpcAPI.NumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Common.SmartContract> getContract(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.SmartContractDataWrapper> getContractInfo(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.WitnessList> listWitnesses(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.NumberMessage> getBrokerageInfo(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.NumberMessage> getRewardInfo(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.DelegatedResourceList> getDelegatedResource(
        org.stabila.java.proto.Response.DelegatedResourceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.ProposalList> listProposals(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.Proposal> getProposalById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.ProposalList> getPaginatedProposalList(
        org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.ExchangeList> listExchanges(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.Exchange> getExchangeById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.ExchangeList> getPaginatedExchangeList(
        org.stabila.java.api.GrpcAPI.PaginatedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.NullifierResult> isShieldedTRC20ContractNoteSpent(
        org.stabila.java.api.GrpcAPI.NfTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.MarketOrderList> getMarketOrderByAccount(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.MarketOrder> getMarketOrderById(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.MarketPriceList> getMarketPriceByPair(
        org.stabila.java.proto.Response.MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.MarketOrderList> getMarketOrderListByPair(
        org.stabila.java.proto.Response.MarketOrderPair request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.MarketOrderPairList> getMarketPairList(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Chain.Transaction> getTransactionSign(
        org.stabila.java.proto.Response.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> getTransactionSign2(
        org.stabila.java.proto.Response.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.EasyTransferResponse> easyTransferAsset(
        org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.EasyTransferResponse> easyTransferAssetByPrivate(
        org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.EasyTransferResponse> easyTransfer(
        org.stabila.java.api.GrpcAPI.EasyTransferMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.EasyTransferResponse> easyTransferByPrivate(
        org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> createAddress(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.AddressPrKeyPairMessage> generateAddress(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.proto.Response.TransactionExtention> addSign(
        org.stabila.java.proto.Response.TransactionSign request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> getSpendingKey(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> getAkFromAsk(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> getNkFromNsk(
        org.stabila.java.api.GrpcAPI.BytesMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        org.stabila.java.api.GrpcAPI.ViewingKeyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.DiversifierMessage> getDiversifier(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> getRcm(
        org.stabila.java.api.GrpcAPI.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stabila.java.api.GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BROADCAST_TRANSACTION = 0;
  private static final int METHODID_CREATE_COMMON_TRANSACTION = 1;
  private static final int METHODID_CREATE_ACCOUNT = 2;
  private static final int METHODID_CREATE_ACCOUNT2 = 3;
  private static final int METHODID_UPDATE_ACCOUNT = 4;
  private static final int METHODID_UPDATE_ACCOUNT2 = 5;
  private static final int METHODID_SET_ACCOUNT_ID = 6;
  private static final int METHODID_ACCOUNT_PERMISSION_UPDATE = 7;
  private static final int METHODID_CREATE_TRANSACTION = 8;
  private static final int METHODID_CREATE_TRANSACTION2 = 9;
  private static final int METHODID_CREATE_ASSET_ISSUE = 10;
  private static final int METHODID_CREATE_ASSET_ISSUE2 = 11;
  private static final int METHODID_UPDATE_ASSET = 12;
  private static final int METHODID_UPDATE_ASSET2 = 13;
  private static final int METHODID_TRANSFER_ASSET = 14;
  private static final int METHODID_TRANSFER_ASSET2 = 15;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE = 16;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE2 = 17;
  private static final int METHODID_UNCD_ASSET = 18;
  private static final int METHODID_UNCD_ASSET2 = 19;
  private static final int METHODID_CREATE_WITNESS = 20;
  private static final int METHODID_CREATE_WITNESS2 = 21;
  private static final int METHODID_UPDATE_WITNESS = 22;
  private static final int METHODID_UPDATE_WITNESS2 = 23;
  private static final int METHODID_UPDATE_BROKERAGE = 24;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT = 25;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT2 = 26;
  private static final int METHODID_CD_BALANCE = 27;
  private static final int METHODID_CD_BALANCE2 = 28;
  private static final int METHODID_UNCD_BALANCE = 29;
  private static final int METHODID_UNCD_BALANCE2 = 30;
  private static final int METHODID_WITHDRAW_BALANCE = 31;
  private static final int METHODID_WITHDRAW_BALANCE2 = 32;
  private static final int METHODID_PROPOSAL_CREATE = 33;
  private static final int METHODID_PROPOSAL_APPROVE = 34;
  private static final int METHODID_PROPOSAL_DELETE = 35;
  private static final int METHODID_DEPLOY_CONTRACT = 36;
  private static final int METHODID_UPDATE_SETTING = 37;
  private static final int METHODID_UPDATE_ENERGY_LIMIT = 38;
  private static final int METHODID_CLEAR_CONTRACT_ABI = 39;
  private static final int METHODID_TRIGGER_CONTRACT = 40;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 41;
  private static final int METHODID_EXCHANGE_CREATE = 42;
  private static final int METHODID_EXCHANGE_INJECT = 43;
  private static final int METHODID_EXCHANGE_WITHDRAW = 44;
  private static final int METHODID_EXCHANGE_TRANSACTION = 45;
  private static final int METHODID_MARKET_SELL_ASSET = 46;
  private static final int METHODID_MARKET_CANCEL_ORDER = 47;
  private static final int METHODID_GET_NODE_INFO = 48;
  private static final int METHODID_LIST_NODES = 49;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 50;
  private static final int METHODID_TOTAL_TRANSACTION = 51;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 52;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 53;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 54;
  private static final int METHODID_GET_ACCOUNT = 55;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 56;
  private static final int METHODID_GET_ACCOUNT_NET = 57;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 58;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 59;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 60;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 61;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 62;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 63;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 64;
  private static final int METHODID_GET_NOW_BLOCK = 65;
  private static final int METHODID_GET_NOW_BLOCK2 = 66;
  private static final int METHODID_GET_BLOCK_BY_NUM = 67;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 68;
  private static final int METHODID_GET_BLOCK_BY_ID = 69;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 70;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 71;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 72;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 73;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 74;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 75;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 76;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 77;
  private static final int METHODID_GET_CONTRACT = 78;
  private static final int METHODID_GET_CONTRACT_INFO = 79;
  private static final int METHODID_LIST_WITNESSES = 80;
  private static final int METHODID_GET_BROKERAGE_INFO = 81;
  private static final int METHODID_GET_REWARD_INFO = 82;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 83;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 84;
  private static final int METHODID_LIST_PROPOSALS = 85;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 86;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 87;
  private static final int METHODID_LIST_EXCHANGES = 88;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 89;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 90;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 91;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 92;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 93;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 94;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 95;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 96;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 97;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 98;
  private static final int METHODID_GET_TRANSACTION_SIGN = 99;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 100;
  private static final int METHODID_EASY_TRANSFER_ASSET = 101;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 102;
  private static final int METHODID_EASY_TRANSFER = 103;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 104;
  private static final int METHODID_CREATE_ADDRESS = 105;
  private static final int METHODID_GENERATE_ADDRESS = 106;
  private static final int METHODID_ADD_SIGN = 107;
  private static final int METHODID_GET_SPENDING_KEY = 108;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 109;
  private static final int METHODID_GET_AK_FROM_ASK = 110;
  private static final int METHODID_GET_NK_FROM_NSK = 111;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 112;
  private static final int METHODID_GET_DIVERSIFIER = 113;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 114;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 115;
  private static final int METHODID_GET_RCM = 116;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 117;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 118;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 119;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.stabila.java.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionReturn>) responseObserver);
          break;
        case METHODID_CREATE_COMMON_TRANSACTION:
          serviceImpl.createCommonTransaction((org.stabila.java.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((org.stabila.java.proto.Contract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT2:
          serviceImpl.createAccount2((org.stabila.java.proto.Contract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((org.stabila.java.proto.Contract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT2:
          serviceImpl.updateAccount2((org.stabila.java.proto.Contract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_ID:
          serviceImpl.setAccountId((org.stabila.java.proto.Contract.SetAccountIdContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_ACCOUNT_PERMISSION_UPDATE:
          serviceImpl.accountPermissionUpdate((org.stabila.java.proto.Contract.AccountPermissionUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((org.stabila.java.proto.Contract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION2:
          serviceImpl.createTransaction2((org.stabila.java.proto.Contract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE:
          serviceImpl.createAssetIssue((org.stabila.java.proto.Contract.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE2:
          serviceImpl.createAssetIssue2((org.stabila.java.proto.Contract.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((org.stabila.java.proto.Contract.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET2:
          serviceImpl.updateAsset2((org.stabila.java.proto.Contract.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET:
          serviceImpl.transferAsset((org.stabila.java.proto.Contract.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET2:
          serviceImpl.transferAsset2((org.stabila.java.proto.Contract.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE:
          serviceImpl.participateAssetIssue((org.stabila.java.proto.Contract.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE2:
          serviceImpl.participateAssetIssue2((org.stabila.java.proto.Contract.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNCD_ASSET:
          serviceImpl.uncdAsset((org.stabila.java.proto.Contract.UncdAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UNCD_ASSET2:
          serviceImpl.uncdAsset2((org.stabila.java.proto.Contract.UncdAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS:
          serviceImpl.createWitness((org.stabila.java.proto.Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((org.stabila.java.proto.Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS:
          serviceImpl.updateWitness((org.stabila.java.proto.Contract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS2:
          serviceImpl.updateWitness2((org.stabila.java.proto.Contract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_BROKERAGE:
          serviceImpl.updateBrokerage((org.stabila.java.proto.Contract.UpdateBrokerageContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT:
          serviceImpl.voteWitnessAccount((org.stabila.java.proto.Contract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT2:
          serviceImpl.voteWitnessAccount2((org.stabila.java.proto.Contract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CD_BALANCE:
          serviceImpl.cdBalance((org.stabila.java.proto.Contract.CdBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CD_BALANCE2:
          serviceImpl.cdBalance2((org.stabila.java.proto.Contract.CdBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNCD_BALANCE:
          serviceImpl.uncdBalance((org.stabila.java.proto.Contract.UncdBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UNCD_BALANCE2:
          serviceImpl.uncdBalance2((org.stabila.java.proto.Contract.UncdBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE:
          serviceImpl.withdrawBalance((org.stabila.java.proto.Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((org.stabila.java.proto.Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_CREATE:
          serviceImpl.proposalCreate((org.stabila.java.proto.Contract.ProposalCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_APPROVE:
          serviceImpl.proposalApprove((org.stabila.java.proto.Contract.ProposalApproveContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_DELETE:
          serviceImpl.proposalDelete((org.stabila.java.proto.Contract.ProposalDeleteContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.stabila.java.proto.Contract.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_SETTING:
          serviceImpl.updateSetting((org.stabila.java.proto.Contract.UpdateSettingContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ENERGY_LIMIT:
          serviceImpl.updateEnergyLimit((org.stabila.java.proto.Contract.UpdateEnergyLimitContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CLEAR_CONTRACT_ABI:
          serviceImpl.clearContractABI((org.stabila.java.proto.Contract.ClearABIContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((org.stabila.java.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.stabila.java.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_CREATE:
          serviceImpl.exchangeCreate((org.stabila.java.proto.Contract.ExchangeCreateContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_INJECT:
          serviceImpl.exchangeInject((org.stabila.java.proto.Contract.ExchangeInjectContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_WITHDRAW:
          serviceImpl.exchangeWithdraw((org.stabila.java.proto.Contract.ExchangeWithdrawContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_TRANSACTION:
          serviceImpl.exchangeTransaction((org.stabila.java.proto.Contract.ExchangeTransactionContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_SELL_ASSET:
          serviceImpl.marketSellAsset((org.stabila.java.proto.Contract.MarketSellAssetContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_CANCEL_ORDER:
          serviceImpl.marketCancelOrder((org.stabila.java.proto.Contract.MarketCancelOrderContract) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeInfo>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NodeList>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ChainParameters>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((org.stabila.java.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((org.stabila.java.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.stabila.java.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((org.stabila.java.api.GrpcAPI.AccountIdMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((org.stabila.java.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((org.stabila.java.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((org.stabila.java.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((org.stabila.java.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((org.stabila.java.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((org.stabila.java.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((org.stabila.java.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Common.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.WitnessList>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((org.stabila.java.proto.Response.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Proposal>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((org.stabila.java.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.Exchange>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((org.stabila.java.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((org.stabila.java.api.GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((org.stabila.java.api.GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((org.stabila.java.api.GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.NullifierResult>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((org.stabila.java.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((org.stabila.java.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.MarketOrderPairList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((org.stabila.java.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((org.stabila.java.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((org.stabila.java.api.GrpcAPI.EasyTransferAssetMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((org.stabila.java.api.GrpcAPI.EasyTransferAssetByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((org.stabila.java.api.GrpcAPI.EasyTransferMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((org.stabila.java.api.GrpcAPI.EasyTransferByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((org.stabila.java.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((org.stabila.java.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((org.stabila.java.api.GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((org.stabila.java.api.GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((org.stabila.java.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((org.stabila.java.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((org.stabila.java.api.GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<org.stabila.java.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stabila.java.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getCreateCommonTransactionMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getCreateAccount2Method())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getUpdateAccount2Method())
              .addMethod(getSetAccountIdMethod())
              .addMethod(getAccountPermissionUpdateMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateTransaction2Method())
              .addMethod(getCreateAssetIssueMethod())
              .addMethod(getCreateAssetIssue2Method())
              .addMethod(getUpdateAssetMethod())
              .addMethod(getUpdateAsset2Method())
              .addMethod(getTransferAssetMethod())
              .addMethod(getTransferAsset2Method())
              .addMethod(getParticipateAssetIssueMethod())
              .addMethod(getParticipateAssetIssue2Method())
              .addMethod(getUncdAssetMethod())
              .addMethod(getUncdAsset2Method())
              .addMethod(getCreateWitnessMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getUpdateWitnessMethod())
              .addMethod(getUpdateWitness2Method())
              .addMethod(getUpdateBrokerageMethod())
              .addMethod(getVoteWitnessAccountMethod())
              .addMethod(getVoteWitnessAccount2Method())
              .addMethod(getCdBalanceMethod())
              .addMethod(getCdBalance2Method())
              .addMethod(getUncdBalanceMethod())
              .addMethod(getUncdBalance2Method())
              .addMethod(getWithdrawBalanceMethod())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getProposalCreateMethod())
              .addMethod(getProposalApproveMethod())
              .addMethod(getProposalDeleteMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getUpdateSettingMethod())
              .addMethod(getUpdateEnergyLimitMethod())
              .addMethod(getClearContractABIMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getExchangeCreateMethod())
              .addMethod(getExchangeInjectMethod())
              .addMethod(getExchangeWithdrawMethod())
              .addMethod(getExchangeTransactionMethod())
              .addMethod(getMarketSellAssetMethod())
              .addMethod(getMarketCancelOrderMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getGetTransactionSignMethod())
              .addMethod(getGetTransactionSign2Method())
              .addMethod(getEasyTransferAssetMethod())
              .addMethod(getEasyTransferAssetByPrivateMethod())
              .addMethod(getEasyTransferMethod())
              .addMethod(getEasyTransferByPrivateMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGenerateAddressMethod())
              .addMethod(getAddSignMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}