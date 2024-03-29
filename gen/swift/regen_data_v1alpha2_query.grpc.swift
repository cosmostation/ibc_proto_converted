//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: regen/data/v1alpha2/query.proto
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


/// Query is the regen.data.v1alpha2 Query service
///
/// Usage: instantiate `Regen_Data_V1alpha2_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Regen_Data_V1alpha2_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? { get }

  func byIRI(
    _ request: Regen_Data_V1alpha2_QueryByIRIRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse>

  func bySigner(
    _ request: Regen_Data_V1alpha2_QueryBySignerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse>

  func signers(
    _ request: Regen_Data_V1alpha2_QuerySignersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse>
}

extension Regen_Data_V1alpha2_QueryClientProtocol {
  internal var serviceName: String {
    return "regen.data.v1alpha2.Query"
  }

  /// ByHash queries data based on its ContentHash.
  ///
  /// - Parameters:
  ///   - request: Request to send to ByIRI.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func byIRI(
    _ request: Regen_Data_V1alpha2_QueryByIRIRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse> {
    return self.makeUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.byIRI.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeByIRIInterceptors() ?? []
    )
  }

  /// BySigner queries data based on signers.
  ///
  /// - Parameters:
  ///   - request: Request to send to BySigner.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bySigner(
    _ request: Regen_Data_V1alpha2_QueryBySignerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse> {
    return self.makeUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.bySigner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBySignerInterceptors() ?? []
    )
  }

  /// Signers queries signers based on IRI.
  ///
  /// - Parameters:
  ///   - request: Request to send to Signers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func signers(
    _ request: Regen_Data_V1alpha2_QuerySignersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse> {
    return self.makeUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.signers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSignersInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Regen_Data_V1alpha2_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Regen_Data_V1alpha2_QueryNIOClient")
internal final class Regen_Data_V1alpha2_QueryClient: Regen_Data_V1alpha2_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the regen.data.v1alpha2.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Regen_Data_V1alpha2_QueryNIOClient: Regen_Data_V1alpha2_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the regen.data.v1alpha2.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query is the regen.data.v1alpha2 Query service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Regen_Data_V1alpha2_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? { get }

  func makeByIriCall(
    _ request: Regen_Data_V1alpha2_QueryByIRIRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse>

  func makeBySignerCall(
    _ request: Regen_Data_V1alpha2_QueryBySignerRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse>

  func makeSignersCall(
    _ request: Regen_Data_V1alpha2_QuerySignersRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Regen_Data_V1alpha2_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Regen_Data_V1alpha2_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeByIriCall(
    _ request: Regen_Data_V1alpha2_QueryByIRIRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse> {
    return self.makeAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.byIRI.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeByIRIInterceptors() ?? []
    )
  }

  internal func makeBySignerCall(
    _ request: Regen_Data_V1alpha2_QueryBySignerRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse> {
    return self.makeAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.bySigner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBySignerInterceptors() ?? []
    )
  }

  internal func makeSignersCall(
    _ request: Regen_Data_V1alpha2_QuerySignersRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse> {
    return self.makeAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.signers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSignersInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Regen_Data_V1alpha2_QueryAsyncClientProtocol {
  internal func byIRI(
    _ request: Regen_Data_V1alpha2_QueryByIRIRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Regen_Data_V1alpha2_QueryByIRIResponse {
    return try await self.performAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.byIRI.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeByIRIInterceptors() ?? []
    )
  }

  internal func bySigner(
    _ request: Regen_Data_V1alpha2_QueryBySignerRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Regen_Data_V1alpha2_QueryBySignerResponse {
    return try await self.performAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.bySigner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBySignerInterceptors() ?? []
    )
  }

  internal func signers(
    _ request: Regen_Data_V1alpha2_QuerySignersRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Regen_Data_V1alpha2_QuerySignersResponse {
    return try await self.performAsyncUnaryCall(
      path: Regen_Data_V1alpha2_QueryClientMetadata.Methods.signers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSignersInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Regen_Data_V1alpha2_QueryAsyncClient: Regen_Data_V1alpha2_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Regen_Data_V1alpha2_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'byIRI'.
  func makeByIRIInterceptors() -> [ClientInterceptor<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse>]

  /// - Returns: Interceptors to use when invoking 'bySigner'.
  func makeBySignerInterceptors() -> [ClientInterceptor<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse>]

  /// - Returns: Interceptors to use when invoking 'signers'.
  func makeSignersInterceptors() -> [ClientInterceptor<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse>]
}

internal enum Regen_Data_V1alpha2_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "regen.data.v1alpha2.Query",
    methods: [
      Regen_Data_V1alpha2_QueryClientMetadata.Methods.byIRI,
      Regen_Data_V1alpha2_QueryClientMetadata.Methods.bySigner,
      Regen_Data_V1alpha2_QueryClientMetadata.Methods.signers,
    ]
  )

  internal enum Methods {
    internal static let byIRI = GRPCMethodDescriptor(
      name: "ByIRI",
      path: "/regen.data.v1alpha2.Query/ByIRI",
      type: GRPCCallType.unary
    )

    internal static let bySigner = GRPCMethodDescriptor(
      name: "BySigner",
      path: "/regen.data.v1alpha2.Query/BySigner",
      type: GRPCCallType.unary
    )

    internal static let signers = GRPCMethodDescriptor(
      name: "Signers",
      path: "/regen.data.v1alpha2.Query/Signers",
      type: GRPCCallType.unary
    )
  }
}

/// Query is the regen.data.v1alpha2 Query service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Regen_Data_V1alpha2_QueryProvider: CallHandlerProvider {
  var interceptors: Regen_Data_V1alpha2_QueryServerInterceptorFactoryProtocol? { get }

  /// ByHash queries data based on its ContentHash.
  func byIRI(request: Regen_Data_V1alpha2_QueryByIRIRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Data_V1alpha2_QueryByIRIResponse>

  /// BySigner queries data based on signers.
  func bySigner(request: Regen_Data_V1alpha2_QueryBySignerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Data_V1alpha2_QueryBySignerResponse>

  /// Signers queries signers based on IRI.
  func signers(request: Regen_Data_V1alpha2_QuerySignersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Data_V1alpha2_QuerySignersResponse>
}

extension Regen_Data_V1alpha2_QueryProvider {
  internal var serviceName: Substring {
    return Regen_Data_V1alpha2_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ByIRI":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QueryByIRIRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QueryByIRIResponse>(),
        interceptors: self.interceptors?.makeByIRIInterceptors() ?? [],
        userFunction: self.byIRI(request:context:)
      )

    case "BySigner":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QueryBySignerRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QueryBySignerResponse>(),
        interceptors: self.interceptors?.makeBySignerInterceptors() ?? [],
        userFunction: self.bySigner(request:context:)
      )

    case "Signers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QuerySignersRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QuerySignersResponse>(),
        interceptors: self.interceptors?.makeSignersInterceptors() ?? [],
        userFunction: self.signers(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query is the regen.data.v1alpha2 Query service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Regen_Data_V1alpha2_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Regen_Data_V1alpha2_QueryServerInterceptorFactoryProtocol? { get }

  /// ByHash queries data based on its ContentHash.
  @Sendable func byIRI(
    request: Regen_Data_V1alpha2_QueryByIRIRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Regen_Data_V1alpha2_QueryByIRIResponse

  /// BySigner queries data based on signers.
  @Sendable func bySigner(
    request: Regen_Data_V1alpha2_QueryBySignerRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Regen_Data_V1alpha2_QueryBySignerResponse

  /// Signers queries signers based on IRI.
  @Sendable func signers(
    request: Regen_Data_V1alpha2_QuerySignersRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Regen_Data_V1alpha2_QuerySignersResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Regen_Data_V1alpha2_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Regen_Data_V1alpha2_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Regen_Data_V1alpha2_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Regen_Data_V1alpha2_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ByIRI":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QueryByIRIRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QueryByIRIResponse>(),
        interceptors: self.interceptors?.makeByIRIInterceptors() ?? [],
        wrapping: self.byIRI(request:context:)
      )

    case "BySigner":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QueryBySignerRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QueryBySignerResponse>(),
        interceptors: self.interceptors?.makeBySignerInterceptors() ?? [],
        wrapping: self.bySigner(request:context:)
      )

    case "Signers":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Data_V1alpha2_QuerySignersRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Data_V1alpha2_QuerySignersResponse>(),
        interceptors: self.interceptors?.makeSignersInterceptors() ?? [],
        wrapping: self.signers(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Regen_Data_V1alpha2_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'byIRI'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeByIRIInterceptors() -> [ServerInterceptor<Regen_Data_V1alpha2_QueryByIRIRequest, Regen_Data_V1alpha2_QueryByIRIResponse>]

  /// - Returns: Interceptors to use when handling 'bySigner'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBySignerInterceptors() -> [ServerInterceptor<Regen_Data_V1alpha2_QueryBySignerRequest, Regen_Data_V1alpha2_QueryBySignerResponse>]

  /// - Returns: Interceptors to use when handling 'signers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSignersInterceptors() -> [ServerInterceptor<Regen_Data_V1alpha2_QuerySignersRequest, Regen_Data_V1alpha2_QuerySignersResponse>]
}

internal enum Regen_Data_V1alpha2_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "regen.data.v1alpha2.Query",
    methods: [
      Regen_Data_V1alpha2_QueryServerMetadata.Methods.byIRI,
      Regen_Data_V1alpha2_QueryServerMetadata.Methods.bySigner,
      Regen_Data_V1alpha2_QueryServerMetadata.Methods.signers,
    ]
  )

  internal enum Methods {
    internal static let byIRI = GRPCMethodDescriptor(
      name: "ByIRI",
      path: "/regen.data.v1alpha2.Query/ByIRI",
      type: GRPCCallType.unary
    )

    internal static let bySigner = GRPCMethodDescriptor(
      name: "BySigner",
      path: "/regen.data.v1alpha2.Query/BySigner",
      type: GRPCCallType.unary
    )

    internal static let signers = GRPCMethodDescriptor(
      name: "Signers",
      path: "/regen.data.v1alpha2.Query/Signers",
      type: GRPCCallType.unary
    )
  }
}
