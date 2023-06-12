package com.desmos.profiles.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: desmos/profiles/v3/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.profiles.v3.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryProfileRequest,
      com.desmos.profiles.v3.QueryProfileResponse> getProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Profile",
      requestType = com.desmos.profiles.v3.QueryProfileRequest.class,
      responseType = com.desmos.profiles.v3.QueryProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryProfileRequest,
      com.desmos.profiles.v3.QueryProfileResponse> getProfileMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryProfileRequest, com.desmos.profiles.v3.QueryProfileResponse> getProfileMethod;
    if ((getProfileMethod = QueryGrpc.getProfileMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProfileMethod = QueryGrpc.getProfileMethod) == null) {
          QueryGrpc.getProfileMethod = getProfileMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryProfileRequest, com.desmos.profiles.v3.QueryProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Profile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Profile"))
              .build();
        }
      }
    }
    return getProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest,
      com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> getIncomingDTagTransferRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncomingDTagTransferRequests",
      requestType = com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest.class,
      responseType = com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest,
      com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> getIncomingDTagTransferRequestsMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest, com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> getIncomingDTagTransferRequestsMethod;
    if ((getIncomingDTagTransferRequestsMethod = QueryGrpc.getIncomingDTagTransferRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncomingDTagTransferRequestsMethod = QueryGrpc.getIncomingDTagTransferRequestsMethod) == null) {
          QueryGrpc.getIncomingDTagTransferRequestsMethod = getIncomingDTagTransferRequestsMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest, com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncomingDTagTransferRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncomingDTagTransferRequests"))
              .build();
        }
      }
    }
    return getIncomingDTagTransferRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinksRequest,
      com.desmos.profiles.v3.QueryChainLinksResponse> getChainLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainLinks",
      requestType = com.desmos.profiles.v3.QueryChainLinksRequest.class,
      responseType = com.desmos.profiles.v3.QueryChainLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinksRequest,
      com.desmos.profiles.v3.QueryChainLinksResponse> getChainLinksMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinksRequest, com.desmos.profiles.v3.QueryChainLinksResponse> getChainLinksMethod;
    if ((getChainLinksMethod = QueryGrpc.getChainLinksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChainLinksMethod = QueryGrpc.getChainLinksMethod) == null) {
          QueryGrpc.getChainLinksMethod = getChainLinksMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryChainLinksRequest, com.desmos.profiles.v3.QueryChainLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryChainLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryChainLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChainLinks"))
              .build();
        }
      }
    }
    return getChainLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinkOwnersRequest,
      com.desmos.profiles.v3.QueryChainLinkOwnersResponse> getChainLinkOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainLinkOwners",
      requestType = com.desmos.profiles.v3.QueryChainLinkOwnersRequest.class,
      responseType = com.desmos.profiles.v3.QueryChainLinkOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinkOwnersRequest,
      com.desmos.profiles.v3.QueryChainLinkOwnersResponse> getChainLinkOwnersMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryChainLinkOwnersRequest, com.desmos.profiles.v3.QueryChainLinkOwnersResponse> getChainLinkOwnersMethod;
    if ((getChainLinkOwnersMethod = QueryGrpc.getChainLinkOwnersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChainLinkOwnersMethod = QueryGrpc.getChainLinkOwnersMethod) == null) {
          QueryGrpc.getChainLinkOwnersMethod = getChainLinkOwnersMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryChainLinkOwnersRequest, com.desmos.profiles.v3.QueryChainLinkOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainLinkOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryChainLinkOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryChainLinkOwnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChainLinkOwners"))
              .build();
        }
      }
    }
    return getChainLinkOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest,
      com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> getDefaultExternalAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefaultExternalAddresses",
      requestType = com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest.class,
      responseType = com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest,
      com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> getDefaultExternalAddressesMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest, com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> getDefaultExternalAddressesMethod;
    if ((getDefaultExternalAddressesMethod = QueryGrpc.getDefaultExternalAddressesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDefaultExternalAddressesMethod = QueryGrpc.getDefaultExternalAddressesMethod) == null) {
          QueryGrpc.getDefaultExternalAddressesMethod = getDefaultExternalAddressesMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest, com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefaultExternalAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DefaultExternalAddresses"))
              .build();
        }
      }
    }
    return getDefaultExternalAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinksRequest,
      com.desmos.profiles.v3.QueryApplicationLinksResponse> getApplicationLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplicationLinks",
      requestType = com.desmos.profiles.v3.QueryApplicationLinksRequest.class,
      responseType = com.desmos.profiles.v3.QueryApplicationLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinksRequest,
      com.desmos.profiles.v3.QueryApplicationLinksResponse> getApplicationLinksMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinksRequest, com.desmos.profiles.v3.QueryApplicationLinksResponse> getApplicationLinksMethod;
    if ((getApplicationLinksMethod = QueryGrpc.getApplicationLinksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getApplicationLinksMethod = QueryGrpc.getApplicationLinksMethod) == null) {
          QueryGrpc.getApplicationLinksMethod = getApplicationLinksMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryApplicationLinksRequest, com.desmos.profiles.v3.QueryApplicationLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplicationLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ApplicationLinks"))
              .build();
        }
      }
    }
    return getApplicationLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest,
      com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> getApplicationLinkByClientIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplicationLinkByClientID",
      requestType = com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest.class,
      responseType = com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest,
      com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> getApplicationLinkByClientIDMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest, com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> getApplicationLinkByClientIDMethod;
    if ((getApplicationLinkByClientIDMethod = QueryGrpc.getApplicationLinkByClientIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getApplicationLinkByClientIDMethod = QueryGrpc.getApplicationLinkByClientIDMethod) == null) {
          QueryGrpc.getApplicationLinkByClientIDMethod = getApplicationLinkByClientIDMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest, com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplicationLinkByClientID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ApplicationLinkByClientID"))
              .build();
        }
      }
    }
    return getApplicationLinkByClientIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest,
      com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> getApplicationLinkOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplicationLinkOwners",
      requestType = com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.class,
      responseType = com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest,
      com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> getApplicationLinkOwnersMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest, com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> getApplicationLinkOwnersMethod;
    if ((getApplicationLinkOwnersMethod = QueryGrpc.getApplicationLinkOwnersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getApplicationLinkOwnersMethod = QueryGrpc.getApplicationLinkOwnersMethod) == null) {
          QueryGrpc.getApplicationLinkOwnersMethod = getApplicationLinkOwnersMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest, com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplicationLinkOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ApplicationLinkOwners"))
              .build();
        }
      }
    }
    return getApplicationLinkOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryParamsRequest,
      com.desmos.profiles.v3.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.desmos.profiles.v3.QueryParamsRequest.class,
      responseType = com.desmos.profiles.v3.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryParamsRequest,
      com.desmos.profiles.v3.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.desmos.profiles.v3.QueryParamsRequest, com.desmos.profiles.v3.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.desmos.profiles.v3.QueryParamsRequest, com.desmos.profiles.v3.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.profiles.v3.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Profile queries the profile of a specific user given their DTag or address.
     * If the queried user does not have a profile, the returned response will
     * contain a null profile.
     * </pre>
     */
    default void profile(com.desmos.profiles.v3.QueryProfileRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncomingDTagTransferRequests queries all the DTag transfers requests that
     * have been made towards the user with the given address
     * </pre>
     */
    default void incomingDTagTransferRequests(com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncomingDTagTransferRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChainLinks queries the chain links associated to the given user, if
     * provided. Otherwise it queries all the chain links stored.
     * </pre>
     */
    default void chainLinks(com.desmos.profiles.v3.QueryChainLinksRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChainLinkOwners queries for the owners of chain links, optionally searching
     * for a specific chain name and external address
     * </pre>
     */
    default void chainLinkOwners(com.desmos.profiles.v3.QueryChainLinkOwnersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinkOwnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainLinkOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * DefaultExternalAddresses queries the default addresses associated to the
     * given user and (optionally) chain name
     * </pre>
     */
    default void defaultExternalAddresses(com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefaultExternalAddressesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinks queries the applications links associated to the given
     * user, if provided. Otherwise, it queries all the application links stored.
     * </pre>
     */
    default void applicationLinks(com.desmos.profiles.v3.QueryApplicationLinksRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplicationLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinkByClientID queries a single application link for a given
     * client id.
     * </pre>
     */
    default void applicationLinkByClientID(com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplicationLinkByClientIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinkOwners queries for the owners of applications links,
     * optionally searching for a specific application and username.
     * </pre>
     */
    default void applicationLinkOwners(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplicationLinkOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the profiles module params
     * </pre>
     */
    default void params(com.desmos.profiles.v3.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     * Profile queries the profile of a specific user given their DTag or address.
     * If the queried user does not have a profile, the returned response will
     * contain a null profile.
     * </pre>
     */
    public void profile(com.desmos.profiles.v3.QueryProfileRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncomingDTagTransferRequests queries all the DTag transfers requests that
     * have been made towards the user with the given address
     * </pre>
     */
    public void incomingDTagTransferRequests(com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncomingDTagTransferRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChainLinks queries the chain links associated to the given user, if
     * provided. Otherwise it queries all the chain links stored.
     * </pre>
     */
    public void chainLinks(com.desmos.profiles.v3.QueryChainLinksRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChainLinkOwners queries for the owners of chain links, optionally searching
     * for a specific chain name and external address
     * </pre>
     */
    public void chainLinkOwners(com.desmos.profiles.v3.QueryChainLinkOwnersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinkOwnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainLinkOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DefaultExternalAddresses queries the default addresses associated to the
     * given user and (optionally) chain name
     * </pre>
     */
    public void defaultExternalAddresses(com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefaultExternalAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinks queries the applications links associated to the given
     * user, if provided. Otherwise, it queries all the application links stored.
     * </pre>
     */
    public void applicationLinks(com.desmos.profiles.v3.QueryApplicationLinksRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplicationLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinkByClientID queries a single application link for a given
     * client id.
     * </pre>
     */
    public void applicationLinkByClientID(com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplicationLinkByClientIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApplicationLinkOwners queries for the owners of applications links,
     * optionally searching for a specific application and username.
     * </pre>
     */
    public void applicationLinkOwners(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplicationLinkOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the profiles module params
     * </pre>
     */
    public void params(com.desmos.profiles.v3.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Profile queries the profile of a specific user given their DTag or address.
     * If the queried user does not have a profile, the returned response will
     * contain a null profile.
     * </pre>
     */
    public com.desmos.profiles.v3.QueryProfileResponse profile(com.desmos.profiles.v3.QueryProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncomingDTagTransferRequests queries all the DTag transfers requests that
     * have been made towards the user with the given address
     * </pre>
     */
    public com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse incomingDTagTransferRequests(com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncomingDTagTransferRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChainLinks queries the chain links associated to the given user, if
     * provided. Otherwise it queries all the chain links stored.
     * </pre>
     */
    public com.desmos.profiles.v3.QueryChainLinksResponse chainLinks(com.desmos.profiles.v3.QueryChainLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChainLinkOwners queries for the owners of chain links, optionally searching
     * for a specific chain name and external address
     * </pre>
     */
    public com.desmos.profiles.v3.QueryChainLinkOwnersResponse chainLinkOwners(com.desmos.profiles.v3.QueryChainLinkOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainLinkOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DefaultExternalAddresses queries the default addresses associated to the
     * given user and (optionally) chain name
     * </pre>
     */
    public com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse defaultExternalAddresses(com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefaultExternalAddressesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApplicationLinks queries the applications links associated to the given
     * user, if provided. Otherwise, it queries all the application links stored.
     * </pre>
     */
    public com.desmos.profiles.v3.QueryApplicationLinksResponse applicationLinks(com.desmos.profiles.v3.QueryApplicationLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplicationLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApplicationLinkByClientID queries a single application link for a given
     * client id.
     * </pre>
     */
    public com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse applicationLinkByClientID(com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplicationLinkByClientIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApplicationLinkOwners queries for the owners of applications links,
     * optionally searching for a specific application and username.
     * </pre>
     */
    public com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse applicationLinkOwners(com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplicationLinkOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the profiles module params
     * </pre>
     */
    public com.desmos.profiles.v3.QueryParamsResponse params(com.desmos.profiles.v3.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Profile queries the profile of a specific user given their DTag or address.
     * If the queried user does not have a profile, the returned response will
     * contain a null profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryProfileResponse> profile(
        com.desmos.profiles.v3.QueryProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncomingDTagTransferRequests queries all the DTag transfers requests that
     * have been made towards the user with the given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse> incomingDTagTransferRequests(
        com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncomingDTagTransferRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChainLinks queries the chain links associated to the given user, if
     * provided. Otherwise it queries all the chain links stored.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryChainLinksResponse> chainLinks(
        com.desmos.profiles.v3.QueryChainLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChainLinkOwners queries for the owners of chain links, optionally searching
     * for a specific chain name and external address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryChainLinkOwnersResponse> chainLinkOwners(
        com.desmos.profiles.v3.QueryChainLinkOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainLinkOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DefaultExternalAddresses queries the default addresses associated to the
     * given user and (optionally) chain name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse> defaultExternalAddresses(
        com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefaultExternalAddressesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApplicationLinks queries the applications links associated to the given
     * user, if provided. Otherwise, it queries all the application links stored.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryApplicationLinksResponse> applicationLinks(
        com.desmos.profiles.v3.QueryApplicationLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplicationLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApplicationLinkByClientID queries a single application link for a given
     * client id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse> applicationLinkByClientID(
        com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplicationLinkByClientIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApplicationLinkOwners queries for the owners of applications links,
     * optionally searching for a specific application and username.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse> applicationLinkOwners(
        com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplicationLinkOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the profiles module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.profiles.v3.QueryParamsResponse> params(
        com.desmos.profiles.v3.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROFILE = 0;
  private static final int METHODID_INCOMING_DTAG_TRANSFER_REQUESTS = 1;
  private static final int METHODID_CHAIN_LINKS = 2;
  private static final int METHODID_CHAIN_LINK_OWNERS = 3;
  private static final int METHODID_DEFAULT_EXTERNAL_ADDRESSES = 4;
  private static final int METHODID_APPLICATION_LINKS = 5;
  private static final int METHODID_APPLICATION_LINK_BY_CLIENT_ID = 6;
  private static final int METHODID_APPLICATION_LINK_OWNERS = 7;
  private static final int METHODID_PARAMS = 8;

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
        case METHODID_PROFILE:
          serviceImpl.profile((com.desmos.profiles.v3.QueryProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryProfileResponse>) responseObserver);
          break;
        case METHODID_INCOMING_DTAG_TRANSFER_REQUESTS:
          serviceImpl.incomingDTagTransferRequests((com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse>) responseObserver);
          break;
        case METHODID_CHAIN_LINKS:
          serviceImpl.chainLinks((com.desmos.profiles.v3.QueryChainLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinksResponse>) responseObserver);
          break;
        case METHODID_CHAIN_LINK_OWNERS:
          serviceImpl.chainLinkOwners((com.desmos.profiles.v3.QueryChainLinkOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryChainLinkOwnersResponse>) responseObserver);
          break;
        case METHODID_DEFAULT_EXTERNAL_ADDRESSES:
          serviceImpl.defaultExternalAddresses((com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse>) responseObserver);
          break;
        case METHODID_APPLICATION_LINKS:
          serviceImpl.applicationLinks((com.desmos.profiles.v3.QueryApplicationLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinksResponse>) responseObserver);
          break;
        case METHODID_APPLICATION_LINK_BY_CLIENT_ID:
          serviceImpl.applicationLinkByClientID((com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse>) responseObserver);
          break;
        case METHODID_APPLICATION_LINK_OWNERS:
          serviceImpl.applicationLinkOwners((com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.desmos.profiles.v3.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.profiles.v3.QueryParamsResponse>) responseObserver);
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
          getProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryProfileRequest,
              com.desmos.profiles.v3.QueryProfileResponse>(
                service, METHODID_PROFILE)))
        .addMethod(
          getIncomingDTagTransferRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest,
              com.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse>(
                service, METHODID_INCOMING_DTAG_TRANSFER_REQUESTS)))
        .addMethod(
          getChainLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryChainLinksRequest,
              com.desmos.profiles.v3.QueryChainLinksResponse>(
                service, METHODID_CHAIN_LINKS)))
        .addMethod(
          getChainLinkOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryChainLinkOwnersRequest,
              com.desmos.profiles.v3.QueryChainLinkOwnersResponse>(
                service, METHODID_CHAIN_LINK_OWNERS)))
        .addMethod(
          getDefaultExternalAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryDefaultExternalAddressesRequest,
              com.desmos.profiles.v3.QueryDefaultExternalAddressesResponse>(
                service, METHODID_DEFAULT_EXTERNAL_ADDRESSES)))
        .addMethod(
          getApplicationLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryApplicationLinksRequest,
              com.desmos.profiles.v3.QueryApplicationLinksResponse>(
                service, METHODID_APPLICATION_LINKS)))
        .addMethod(
          getApplicationLinkByClientIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryApplicationLinkByClientIDRequest,
              com.desmos.profiles.v3.QueryApplicationLinkByClientIDResponse>(
                service, METHODID_APPLICATION_LINK_BY_CLIENT_ID)))
        .addMethod(
          getApplicationLinkOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryApplicationLinkOwnersRequest,
              com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse>(
                service, METHODID_APPLICATION_LINK_OWNERS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.profiles.v3.QueryParamsRequest,
              com.desmos.profiles.v3.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.desmos.profiles.v3.QueryProto.getDescriptor();
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
              .addMethod(getProfileMethod())
              .addMethod(getIncomingDTagTransferRequestsMethod())
              .addMethod(getChainLinksMethod())
              .addMethod(getChainLinkOwnersMethod())
              .addMethod(getDefaultExternalAddressesMethod())
              .addMethod(getApplicationLinksMethod())
              .addMethod(getApplicationLinkByClientIDMethod())
              .addMethod(getApplicationLinkOwnersMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
