//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: band/bandchain/v1/oracle/proof.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


/// Service defines the gRPC querier service.
///
/// Usage: instantiate `Bandchain_V1_Oracle_ServiceClient`, then call methods of this protocol to make API calls.
internal protocol Bandchain_V1_Oracle_ServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? { get }

  func proof(
    _ request: Bandchain_V1_Oracle_QueryProofRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse>

  func multiProof(
    _ request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse>

  func requestCountProof(
    _ request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse>
}

extension Bandchain_V1_Oracle_ServiceClientProtocol {
  internal var serviceName: String {
    return "bandchain.v1.oracle.Service"
  }

  /// Proof queries the proof for given request ID
  ///
  /// - Parameters:
  ///   - request: Request to send to Proof.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func proof(
    _ request: Bandchain_V1_Oracle_QueryProofRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse> {
    return self.makeUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.proof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProofInterceptors() ?? []
    )
  }

  /// MultiProof queries multiple proofs for given list of request IDs
  ///
  /// - Parameters:
  ///   - request: Request to send to MultiProof.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func multiProof(
    _ request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse> {
    return self.makeUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.multiProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiProofInterceptors() ?? []
    )
  }

  /// RequestCountProof queries the count proof
  ///
  /// - Parameters:
  ///   - request: Request to send to RequestCountProof.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requestCountProof(
    _ request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse> {
    return self.makeUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.requestCountProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestCountProofInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Bandchain_V1_Oracle_ServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Bandchain_V1_Oracle_ServiceNIOClient")
internal final class Bandchain_V1_Oracle_ServiceClient: Bandchain_V1_Oracle_ServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the bandchain.v1.oracle.Service service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Bandchain_V1_Oracle_ServiceNIOClient: Bandchain_V1_Oracle_ServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the bandchain.v1.oracle.Service service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Service defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Bandchain_V1_Oracle_ServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? { get }

  func makeProofCall(
    _ request: Bandchain_V1_Oracle_QueryProofRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse>

  func makeMultiProofCall(
    _ request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse>

  func makeRequestCountProofCall(
    _ request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bandchain_V1_Oracle_ServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bandchain_V1_Oracle_ServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeProofCall(
    _ request: Bandchain_V1_Oracle_QueryProofRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse> {
    return self.makeAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.proof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProofInterceptors() ?? []
    )
  }

  internal func makeMultiProofCall(
    _ request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse> {
    return self.makeAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.multiProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiProofInterceptors() ?? []
    )
  }

  internal func makeRequestCountProofCall(
    _ request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse> {
    return self.makeAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.requestCountProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestCountProofInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bandchain_V1_Oracle_ServiceAsyncClientProtocol {
  internal func proof(
    _ request: Bandchain_V1_Oracle_QueryProofRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bandchain_V1_Oracle_QueryProofResponse {
    return try await self.performAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.proof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProofInterceptors() ?? []
    )
  }

  internal func multiProof(
    _ request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bandchain_V1_Oracle_QueryMultiProofResponse {
    return try await self.performAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.multiProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMultiProofInterceptors() ?? []
    )
  }

  internal func requestCountProof(
    _ request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Bandchain_V1_Oracle_QueryRequestCountProofResponse {
    return try await self.performAsyncUnaryCall(
      path: Bandchain_V1_Oracle_ServiceClientMetadata.Methods.requestCountProof.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestCountProofInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Bandchain_V1_Oracle_ServiceAsyncClient: Bandchain_V1_Oracle_ServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Bandchain_V1_Oracle_ServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'proof'.
  func makeProofInterceptors() -> [ClientInterceptor<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse>]

  /// - Returns: Interceptors to use when invoking 'multiProof'.
  func makeMultiProofInterceptors() -> [ClientInterceptor<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse>]

  /// - Returns: Interceptors to use when invoking 'requestCountProof'.
  func makeRequestCountProofInterceptors() -> [ClientInterceptor<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse>]
}

internal enum Bandchain_V1_Oracle_ServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Service",
    fullName: "bandchain.v1.oracle.Service",
    methods: [
      Bandchain_V1_Oracle_ServiceClientMetadata.Methods.proof,
      Bandchain_V1_Oracle_ServiceClientMetadata.Methods.multiProof,
      Bandchain_V1_Oracle_ServiceClientMetadata.Methods.requestCountProof,
    ]
  )

  internal enum Methods {
    internal static let proof = GRPCMethodDescriptor(
      name: "Proof",
      path: "/bandchain.v1.oracle.Service/Proof",
      type: GRPCCallType.unary
    )

    internal static let multiProof = GRPCMethodDescriptor(
      name: "MultiProof",
      path: "/bandchain.v1.oracle.Service/MultiProof",
      type: GRPCCallType.unary
    )

    internal static let requestCountProof = GRPCMethodDescriptor(
      name: "RequestCountProof",
      path: "/bandchain.v1.oracle.Service/RequestCountProof",
      type: GRPCCallType.unary
    )
  }
}

/// Service defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Bandchain_V1_Oracle_ServiceProvider: CallHandlerProvider {
  var interceptors: Bandchain_V1_Oracle_ServiceServerInterceptorFactoryProtocol? { get }

  /// Proof queries the proof for given request ID
  func proof(request: Bandchain_V1_Oracle_QueryProofRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bandchain_V1_Oracle_QueryProofResponse>

  /// MultiProof queries multiple proofs for given list of request IDs
  func multiProof(request: Bandchain_V1_Oracle_QueryMultiProofRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bandchain_V1_Oracle_QueryMultiProofResponse>

  /// RequestCountProof queries the count proof
  func requestCountProof(request: Bandchain_V1_Oracle_QueryRequestCountProofRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bandchain_V1_Oracle_QueryRequestCountProofResponse>
}

extension Bandchain_V1_Oracle_ServiceProvider {
  internal var serviceName: Substring {
    return Bandchain_V1_Oracle_ServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Proof":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryProofResponse>(),
        interceptors: self.interceptors?.makeProofInterceptors() ?? [],
        userFunction: self.proof(request:context:)
      )

    case "MultiProof":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryMultiProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryMultiProofResponse>(),
        interceptors: self.interceptors?.makeMultiProofInterceptors() ?? [],
        userFunction: self.multiProof(request:context:)
      )

    case "RequestCountProof":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryRequestCountProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryRequestCountProofResponse>(),
        interceptors: self.interceptors?.makeRequestCountProofInterceptors() ?? [],
        userFunction: self.requestCountProof(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Service defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Bandchain_V1_Oracle_ServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bandchain_V1_Oracle_ServiceServerInterceptorFactoryProtocol? { get }

  /// Proof queries the proof for given request ID
  @Sendable func proof(
    request: Bandchain_V1_Oracle_QueryProofRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bandchain_V1_Oracle_QueryProofResponse

  /// MultiProof queries multiple proofs for given list of request IDs
  @Sendable func multiProof(
    request: Bandchain_V1_Oracle_QueryMultiProofRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bandchain_V1_Oracle_QueryMultiProofResponse

  /// RequestCountProof queries the count proof
  @Sendable func requestCountProof(
    request: Bandchain_V1_Oracle_QueryRequestCountProofRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bandchain_V1_Oracle_QueryRequestCountProofResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bandchain_V1_Oracle_ServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bandchain_V1_Oracle_ServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Bandchain_V1_Oracle_ServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Bandchain_V1_Oracle_ServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Proof":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryProofResponse>(),
        interceptors: self.interceptors?.makeProofInterceptors() ?? [],
        wrapping: self.proof(request:context:)
      )

    case "MultiProof":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryMultiProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryMultiProofResponse>(),
        interceptors: self.interceptors?.makeMultiProofInterceptors() ?? [],
        wrapping: self.multiProof(request:context:)
      )

    case "RequestCountProof":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bandchain_V1_Oracle_QueryRequestCountProofRequest>(),
        responseSerializer: ProtobufSerializer<Bandchain_V1_Oracle_QueryRequestCountProofResponse>(),
        interceptors: self.interceptors?.makeRequestCountProofInterceptors() ?? [],
        wrapping: self.requestCountProof(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Bandchain_V1_Oracle_ServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'proof'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProofInterceptors() -> [ServerInterceptor<Bandchain_V1_Oracle_QueryProofRequest, Bandchain_V1_Oracle_QueryProofResponse>]

  /// - Returns: Interceptors to use when handling 'multiProof'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMultiProofInterceptors() -> [ServerInterceptor<Bandchain_V1_Oracle_QueryMultiProofRequest, Bandchain_V1_Oracle_QueryMultiProofResponse>]

  /// - Returns: Interceptors to use when handling 'requestCountProof'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestCountProofInterceptors() -> [ServerInterceptor<Bandchain_V1_Oracle_QueryRequestCountProofRequest, Bandchain_V1_Oracle_QueryRequestCountProofResponse>]
}

internal enum Bandchain_V1_Oracle_ServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Service",
    fullName: "bandchain.v1.oracle.Service",
    methods: [
      Bandchain_V1_Oracle_ServiceServerMetadata.Methods.proof,
      Bandchain_V1_Oracle_ServiceServerMetadata.Methods.multiProof,
      Bandchain_V1_Oracle_ServiceServerMetadata.Methods.requestCountProof,
    ]
  )

  internal enum Methods {
    internal static let proof = GRPCMethodDescriptor(
      name: "Proof",
      path: "/bandchain.v1.oracle.Service/Proof",
      type: GRPCCallType.unary
    )

    internal static let multiProof = GRPCMethodDescriptor(
      name: "MultiProof",
      path: "/bandchain.v1.oracle.Service/MultiProof",
      type: GRPCCallType.unary
    )

    internal static let requestCountProof = GRPCMethodDescriptor(
      name: "RequestCountProof",
      path: "/bandchain.v1.oracle.Service/RequestCountProof",
      type: GRPCCallType.unary
    )
  }
}
