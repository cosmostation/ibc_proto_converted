package com.secret.compute.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: secret/compute/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "secret.compute.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryContractInfoResponse> getContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractInfo",
      requestType = com.secret.compute.v1beta1.QueryByContractAddressRequest.class,
      responseType = com.secret.compute.v1beta1.QueryContractInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryContractInfoResponse> getContractInfoMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryContractInfoResponse> getContractInfoMethod;
    if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
          QueryGrpc.getContractInfoMethod = getContractInfoMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryContractInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByContractAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryContractInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractInfo"))
              .build();
        }
      }
    }
    return getContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> getContractsByCodeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByCodeId",
      requestType = com.secret.compute.v1beta1.QueryByCodeIdRequest.class,
      responseType = com.secret.compute.v1beta1.QueryContractsByCodeIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> getContractsByCodeIdMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> getContractsByCodeIdMethod;
    if ((getContractsByCodeIdMethod = QueryGrpc.getContractsByCodeIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByCodeIdMethod = QueryGrpc.getContractsByCodeIdMethod) == null) {
          QueryGrpc.getContractsByCodeIdMethod = getContractsByCodeIdMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryContractsByCodeIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractsByCodeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByCodeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryContractsByCodeIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByCodeId"))
              .build();
        }
      }
    }
    return getContractsByCodeIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QuerySecretContractRequest,
      com.secret.compute.v1beta1.QuerySecretContractResponse> getQuerySecretContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySecretContract",
      requestType = com.secret.compute.v1beta1.QuerySecretContractRequest.class,
      responseType = com.secret.compute.v1beta1.QuerySecretContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QuerySecretContractRequest,
      com.secret.compute.v1beta1.QuerySecretContractResponse> getQuerySecretContractMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QuerySecretContractRequest, com.secret.compute.v1beta1.QuerySecretContractResponse> getQuerySecretContractMethod;
    if ((getQuerySecretContractMethod = QueryGrpc.getQuerySecretContractMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySecretContractMethod = QueryGrpc.getQuerySecretContractMethod) == null) {
          QueryGrpc.getQuerySecretContractMethod = getQuerySecretContractMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QuerySecretContractRequest, com.secret.compute.v1beta1.QuerySecretContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySecretContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QuerySecretContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QuerySecretContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySecretContract"))
              .build();
        }
      }
    }
    return getQuerySecretContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = com.secret.compute.v1beta1.QueryByCodeIdRequest.class,
      responseType = com.secret.compute.v1beta1.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByCodeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
              .build();
        }
      }
    }
    return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.secret.compute.v1beta1.QueryCodesResponse> getCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Codes",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.secret.compute.v1beta1.QueryCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.secret.compute.v1beta1.QueryCodesResponse> getCodesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.secret.compute.v1beta1.QueryCodesResponse> getCodesMethod;
    if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
          QueryGrpc.getCodesMethod = getCodesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.secret.compute.v1beta1.QueryCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Codes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Codes"))
              .build();
        }
      }
    }
    return getCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByContractAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CodeHashByContractAddress",
      requestType = com.secret.compute.v1beta1.QueryByContractAddressRequest.class,
      responseType = com.secret.compute.v1beta1.QueryCodeHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByContractAddressMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByContractAddressMethod;
    if ((getCodeHashByContractAddressMethod = QueryGrpc.getCodeHashByContractAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeHashByContractAddressMethod = QueryGrpc.getCodeHashByContractAddressMethod) == null) {
          QueryGrpc.getCodeHashByContractAddressMethod = getCodeHashByContractAddressMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryCodeHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CodeHashByContractAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByContractAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryCodeHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CodeHashByContractAddress"))
              .build();
        }
      }
    }
    return getCodeHashByContractAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByCodeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CodeHashByCodeId",
      requestType = com.secret.compute.v1beta1.QueryByCodeIdRequest.class,
      responseType = com.secret.compute.v1beta1.QueryCodeHashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest,
      com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByCodeIdMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryCodeHashResponse> getCodeHashByCodeIdMethod;
    if ((getCodeHashByCodeIdMethod = QueryGrpc.getCodeHashByCodeIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeHashByCodeIdMethod = QueryGrpc.getCodeHashByCodeIdMethod) == null) {
          QueryGrpc.getCodeHashByCodeIdMethod = getCodeHashByCodeIdMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByCodeIdRequest, com.secret.compute.v1beta1.QueryCodeHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CodeHashByCodeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByCodeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryCodeHashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CodeHashByCodeId"))
              .build();
        }
      }
    }
    return getCodeHashByCodeIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryContractLabelResponse> getLabelByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LabelByAddress",
      requestType = com.secret.compute.v1beta1.QueryByContractAddressRequest.class,
      responseType = com.secret.compute.v1beta1.QueryContractLabelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest,
      com.secret.compute.v1beta1.QueryContractLabelResponse> getLabelByAddressMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryContractLabelResponse> getLabelByAddressMethod;
    if ((getLabelByAddressMethod = QueryGrpc.getLabelByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLabelByAddressMethod = QueryGrpc.getLabelByAddressMethod) == null) {
          QueryGrpc.getLabelByAddressMethod = getLabelByAddressMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByContractAddressRequest, com.secret.compute.v1beta1.QueryContractLabelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LabelByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByContractAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryContractLabelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LabelByAddress"))
              .build();
        }
      }
    }
    return getLabelByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByLabelRequest,
      com.secret.compute.v1beta1.QueryContractAddressResponse> getAddressByLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressByLabel",
      requestType = com.secret.compute.v1beta1.QueryByLabelRequest.class,
      responseType = com.secret.compute.v1beta1.QueryContractAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByLabelRequest,
      com.secret.compute.v1beta1.QueryContractAddressResponse> getAddressByLabelMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.QueryByLabelRequest, com.secret.compute.v1beta1.QueryContractAddressResponse> getAddressByLabelMethod;
    if ((getAddressByLabelMethod = QueryGrpc.getAddressByLabelMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressByLabelMethod = QueryGrpc.getAddressByLabelMethod) == null) {
          QueryGrpc.getAddressByLabelMethod = getAddressByLabelMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.QueryByLabelRequest, com.secret.compute.v1beta1.QueryContractAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressByLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryByLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.QueryContractAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressByLabel"))
              .build();
        }
      }
    }
    return getAddressByLabelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Query contract info by address
     * </pre>
     */
    default void contractInfo(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query code info by id
     * </pre>
     */
    default void contractsByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractsByCodeIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query secret contract
     * </pre>
     */
    default void querySecretContract(com.secret.compute.v1beta1.QuerySecretContractRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QuerySecretContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySecretContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query a specific contract code by id
     * </pre>
     */
    default void code(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all contract codes on-chain
     * </pre>
     */
    default void codes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query code hash by contract address
     * </pre>
     */
    default void codeHashByContractAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeHashByContractAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query code hash by code id
     * </pre>
     */
    default void codeHashByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeHashByCodeIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query contract label by address
     * </pre>
     */
    default void labelByAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractLabelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLabelByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query contract address by label
     * </pre>
     */
    default void addressByLabel(com.secret.compute.v1beta1.QueryByLabelRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressByLabelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query contract info by address
     * </pre>
     */
    public void contractInfo(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query code info by id
     * </pre>
     */
    public void contractsByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractsByCodeIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query secret contract
     * </pre>
     */
    public void querySecretContract(com.secret.compute.v1beta1.QuerySecretContractRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QuerySecretContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySecretContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query a specific contract code by id
     * </pre>
     */
    public void code(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all contract codes on-chain
     * </pre>
     */
    public void codes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query code hash by contract address
     * </pre>
     */
    public void codeHashByContractAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeHashByContractAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query code hash by code id
     * </pre>
     */
    public void codeHashByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeHashByCodeIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query contract label by address
     * </pre>
     */
    public void labelByAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractLabelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLabelByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query contract address by label
     * </pre>
     */
    public void addressByLabel(com.secret.compute.v1beta1.QueryByLabelRequest request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressByLabelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query contract info by address
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryContractInfoResponse contractInfo(com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query code info by id
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryContractsByCodeIdResponse contractsByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractsByCodeIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query secret contract
     * </pre>
     */
    public com.secret.compute.v1beta1.QuerySecretContractResponse querySecretContract(com.secret.compute.v1beta1.QuerySecretContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySecretContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query a specific contract code by id
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryCodeResponse code(com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all contract codes on-chain
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryCodesResponse codes(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query code hash by contract address
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryCodeHashResponse codeHashByContractAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeHashByContractAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query code hash by code id
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryCodeHashResponse codeHashByCodeId(com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeHashByCodeIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query contract label by address
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryContractLabelResponse labelByAddress(com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLabelByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query contract address by label
     * </pre>
     */
    public com.secret.compute.v1beta1.QueryContractAddressResponse addressByLabel(com.secret.compute.v1beta1.QueryByLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressByLabelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query contract info by address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryContractInfoResponse> contractInfo(
        com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query code info by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryContractsByCodeIdResponse> contractsByCodeId(
        com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractsByCodeIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query secret contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QuerySecretContractResponse> querySecretContract(
        com.secret.compute.v1beta1.QuerySecretContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySecretContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query a specific contract code by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryCodeResponse> code(
        com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all contract codes on-chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryCodesResponse> codes(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query code hash by contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryCodeHashResponse> codeHashByContractAddress(
        com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeHashByContractAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query code hash by code id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryCodeHashResponse> codeHashByCodeId(
        com.secret.compute.v1beta1.QueryByCodeIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeHashByCodeIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query contract label by address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryContractLabelResponse> labelByAddress(
        com.secret.compute.v1beta1.QueryByContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLabelByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query contract address by label
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.QueryContractAddressResponse> addressByLabel(
        com.secret.compute.v1beta1.QueryByLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressByLabelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTRACT_INFO = 0;
  private static final int METHODID_CONTRACTS_BY_CODE_ID = 1;
  private static final int METHODID_QUERY_SECRET_CONTRACT = 2;
  private static final int METHODID_CODE = 3;
  private static final int METHODID_CODES = 4;
  private static final int METHODID_CODE_HASH_BY_CONTRACT_ADDRESS = 5;
  private static final int METHODID_CODE_HASH_BY_CODE_ID = 6;
  private static final int METHODID_LABEL_BY_ADDRESS = 7;
  private static final int METHODID_ADDRESS_BY_LABEL = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTRACT_INFO:
          serviceImpl.contractInfo((com.secret.compute.v1beta1.QueryByContractAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractInfoResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_CODE_ID:
          serviceImpl.contractsByCodeId((com.secret.compute.v1beta1.QueryByCodeIdRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractsByCodeIdResponse>) responseObserver);
          break;
        case METHODID_QUERY_SECRET_CONTRACT:
          serviceImpl.querySecretContract((com.secret.compute.v1beta1.QuerySecretContractRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QuerySecretContractResponse>) responseObserver);
          break;
        case METHODID_CODE:
          serviceImpl.code((com.secret.compute.v1beta1.QueryByCodeIdRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_CODES:
          serviceImpl.codes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodesResponse>) responseObserver);
          break;
        case METHODID_CODE_HASH_BY_CONTRACT_ADDRESS:
          serviceImpl.codeHashByContractAddress((com.secret.compute.v1beta1.QueryByContractAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse>) responseObserver);
          break;
        case METHODID_CODE_HASH_BY_CODE_ID:
          serviceImpl.codeHashByCodeId((com.secret.compute.v1beta1.QueryByCodeIdRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryCodeHashResponse>) responseObserver);
          break;
        case METHODID_LABEL_BY_ADDRESS:
          serviceImpl.labelByAddress((com.secret.compute.v1beta1.QueryByContractAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractLabelResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_BY_LABEL:
          serviceImpl.addressByLabel((com.secret.compute.v1beta1.QueryByLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.QueryContractAddressResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getContractInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByContractAddressRequest,
              com.secret.compute.v1beta1.QueryContractInfoResponse>(
                service, METHODID_CONTRACT_INFO)))
        .addMethod(
          getContractsByCodeIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByCodeIdRequest,
              com.secret.compute.v1beta1.QueryContractsByCodeIdResponse>(
                service, METHODID_CONTRACTS_BY_CODE_ID)))
        .addMethod(
          getQuerySecretContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QuerySecretContractRequest,
              com.secret.compute.v1beta1.QuerySecretContractResponse>(
                service, METHODID_QUERY_SECRET_CONTRACT)))
        .addMethod(
          getCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByCodeIdRequest,
              com.secret.compute.v1beta1.QueryCodeResponse>(
                service, METHODID_CODE)))
        .addMethod(
          getCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.secret.compute.v1beta1.QueryCodesResponse>(
                service, METHODID_CODES)))
        .addMethod(
          getCodeHashByContractAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByContractAddressRequest,
              com.secret.compute.v1beta1.QueryCodeHashResponse>(
                service, METHODID_CODE_HASH_BY_CONTRACT_ADDRESS)))
        .addMethod(
          getCodeHashByCodeIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByCodeIdRequest,
              com.secret.compute.v1beta1.QueryCodeHashResponse>(
                service, METHODID_CODE_HASH_BY_CODE_ID)))
        .addMethod(
          getLabelByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByContractAddressRequest,
              com.secret.compute.v1beta1.QueryContractLabelResponse>(
                service, METHODID_LABEL_BY_ADDRESS)))
        .addMethod(
          getAddressByLabelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.QueryByLabelRequest,
              com.secret.compute.v1beta1.QueryContractAddressResponse>(
                service, METHODID_ADDRESS_BY_LABEL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.secret.compute.v1beta1.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getContractInfoMethod())
              .addMethod(getContractsByCodeIdMethod())
              .addMethod(getQuerySecretContractMethod())
              .addMethod(getCodeMethod())
              .addMethod(getCodesMethod())
              .addMethod(getCodeHashByContractAddressMethod())
              .addMethod(getCodeHashByCodeIdMethod())
              .addMethod(getLabelByAddressMethod())
              .addMethod(getAddressByLabelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
