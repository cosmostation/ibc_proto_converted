//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stafihub/rvote/query.proto
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


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Stafihub_Stafihub_Rvote_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Stafihub_Stafihub_Rvote_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? { get }

  func getProposal(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse>

  func getProposalLife(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>
}

extension Stafihub_Stafihub_Rvote_QueryClientProtocol {
  internal var serviceName: String {
    return "stafihub.stafihub.rvote.Query"
  }

  /// Queries a list of getProposal items.
  ///
  /// - Parameters:
  ///   - request: Request to send to GetProposal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getProposal(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalInterceptors() ?? []
    )
  }

  /// Queries a list of getProposalLife items.
  ///
  /// - Parameters:
  ///   - request: Request to send to GetProposalLife.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getProposalLife(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse> {
    return self.makeUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposalLife.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalLifeInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Stafihub_Stafihub_Rvote_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stafihub_Stafihub_Rvote_QueryNIOClient")
internal final class Stafihub_Stafihub_Rvote_QueryClient: Stafihub_Stafihub_Rvote_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stafihub.stafihub.rvote.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stafihub_Stafihub_Rvote_QueryNIOClient: Stafihub_Stafihub_Rvote_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the stafihub.stafihub.rvote.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rvote_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? { get }

  func makeGetProposalCall(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse>

  func makeGetProposalLifeCall(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvote_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rvote_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeGetProposalCall(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalInterceptors() ?? []
    )
  }

  internal func makeGetProposalLifeCall(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse> {
    return self.makeAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposalLife.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalLifeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvote_QueryAsyncClientProtocol {
  internal func getProposal(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvote_QueryGetProposalResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalInterceptors() ?? []
    )
  }

  internal func getProposalLife(
    _ request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse {
    return try await self.performAsyncUnaryCall(
      path: Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposalLife.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetProposalLifeInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stafihub_Stafihub_Rvote_QueryAsyncClient: Stafihub_Stafihub_Rvote_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stafihub_Stafihub_Rvote_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'getProposal'.
  func makeGetProposalInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse>]

  /// - Returns: Interceptors to use when invoking 'getProposalLife'.
  func makeGetProposalLifeInterceptors() -> [ClientInterceptor<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>]
}

internal enum Stafihub_Stafihub_Rvote_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rvote.Query",
    methods: [
      Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposal,
      Stafihub_Stafihub_Rvote_QueryClientMetadata.Methods.getProposalLife,
    ]
  )

  internal enum Methods {
    internal static let getProposal = GRPCMethodDescriptor(
      name: "GetProposal",
      path: "/stafihub.stafihub.rvote.Query/GetProposal",
      type: GRPCCallType.unary
    )

    internal static let getProposalLife = GRPCMethodDescriptor(
      name: "GetProposalLife",
      path: "/stafihub.stafihub.rvote.Query/GetProposalLife",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stafihub_Stafihub_Rvote_QueryProvider: CallHandlerProvider {
  var interceptors: Stafihub_Stafihub_Rvote_QueryServerInterceptorFactoryProtocol? { get }

  /// Queries a list of getProposal items.
  func getProposal(request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvote_QueryGetProposalResponse>

  /// Queries a list of getProposalLife items.
  func getProposalLife(request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>
}

extension Stafihub_Stafihub_Rvote_QueryProvider {
  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rvote_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "GetProposal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvote_QueryGetProposalRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvote_QueryGetProposalResponse>(),
        interceptors: self.interceptors?.makeGetProposalInterceptors() ?? [],
        userFunction: self.getProposal(request:context:)
      )

    case "GetProposalLife":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>(),
        interceptors: self.interceptors?.makeGetProposalLifeInterceptors() ?? [],
        userFunction: self.getProposalLife(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stafihub_Stafihub_Rvote_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stafihub_Stafihub_Rvote_QueryServerInterceptorFactoryProtocol? { get }

  /// Queries a list of getProposal items.
  @Sendable func getProposal(
    request: Stafihub_Stafihub_Rvote_QueryGetProposalRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvote_QueryGetProposalResponse

  /// Queries a list of getProposalLife items.
  @Sendable func getProposalLife(
    request: Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stafihub_Stafihub_Rvote_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stafihub_Stafihub_Rvote_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stafihub_Stafihub_Rvote_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stafihub_Stafihub_Rvote_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "GetProposal":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvote_QueryGetProposalRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvote_QueryGetProposalResponse>(),
        interceptors: self.interceptors?.makeGetProposalInterceptors() ?? [],
        wrapping: self.getProposal(request:context:)
      )

    case "GetProposalLife":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest>(),
        responseSerializer: ProtobufSerializer<Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>(),
        interceptors: self.interceptors?.makeGetProposalLifeInterceptors() ?? [],
        wrapping: self.getProposalLife(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Stafihub_Stafihub_Rvote_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'getProposal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetProposalInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvote_QueryGetProposalRequest, Stafihub_Stafihub_Rvote_QueryGetProposalResponse>]

  /// - Returns: Interceptors to use when handling 'getProposalLife'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetProposalLifeInterceptors() -> [ServerInterceptor<Stafihub_Stafihub_Rvote_QueryGetProposalLifeRequest, Stafihub_Stafihub_Rvote_QueryGetProposalLifeResponse>]
}

internal enum Stafihub_Stafihub_Rvote_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "stafihub.stafihub.rvote.Query",
    methods: [
      Stafihub_Stafihub_Rvote_QueryServerMetadata.Methods.getProposal,
      Stafihub_Stafihub_Rvote_QueryServerMetadata.Methods.getProposalLife,
    ]
  )

  internal enum Methods {
    internal static let getProposal = GRPCMethodDescriptor(
      name: "GetProposal",
      path: "/stafihub.stafihub.rvote.Query/GetProposal",
      type: GRPCCallType.unary
    )

    internal static let getProposalLife = GRPCMethodDescriptor(
      name: "GetProposalLife",
      path: "/stafihub.stafihub.rvote.Query/GetProposalLife",
      type: GRPCCallType.unary
    )
  }
}