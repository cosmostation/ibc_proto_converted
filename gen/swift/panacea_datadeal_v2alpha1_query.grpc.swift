//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: panacea/datadeal/v2alpha1/query.proto
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
/// Usage: instantiate `Panacea_Datadeal_V2alpha1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Panacea_Datadeal_V2alpha1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func deal(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse>

  func deals(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse>

  func dataCert(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse>

  func dataCerts(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>
}

extension Panacea_Datadeal_V2alpha1_QueryClientProtocol {
  internal var serviceName: String {
    return "panacea.datadeal.v2alpha1.Query"
  }

  /// Deal returns a Deal.
  ///
  /// - Parameters:
  ///   - request: Request to send to Deal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deal(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealInterceptors() ?? []
    )
  }

  /// Deals returns multiple deals
  ///
  /// - Parameters:
  ///   - request: Request to send to Deals.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deals(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deals.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealsInterceptors() ?? []
    )
  }

  /// DataCert returns a DataCert.
  ///
  /// - Parameters:
  ///   - request: Request to send to DataCert.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func dataCert(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCert.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertInterceptors() ?? []
    )
  }

  /// DataCerts return DataCerts.
  ///
  /// - Parameters:
  ///   - request: Request to send to DataCerts.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func dataCerts(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse> {
    return self.makeUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCerts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Panacea_Datadeal_V2alpha1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Panacea_Datadeal_V2alpha1_QueryNIOClient")
internal final class Panacea_Datadeal_V2alpha1_QueryClient: Panacea_Datadeal_V2alpha1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the panacea.datadeal.v2alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Panacea_Datadeal_V2alpha1_QueryNIOClient: Panacea_Datadeal_V2alpha1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the panacea.datadeal.v2alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Panacea_Datadeal_V2alpha1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func makeDealCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse>

  func makeDealsCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse>

  func makeDataCertCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse>

  func makeDataCertsCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Datadeal_V2alpha1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeDealCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealInterceptors() ?? []
    )
  }

  internal func makeDealsCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deals.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealsInterceptors() ?? []
    )
  }

  internal func makeDataCertCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCert.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertInterceptors() ?? []
    )
  }

  internal func makeDataCertsCall(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCerts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha1_QueryAsyncClientProtocol {
  internal func deal(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDealResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deal.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealInterceptors() ?? []
    )
  }

  internal func deals(
    _ request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDealsResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deals.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDealsInterceptors() ?? []
    )
  }

  internal func dataCert(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDataCertResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCert.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertInterceptors() ?? []
    )
  }

  internal func dataCerts(
    _ request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDataCertsResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCerts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDataCertsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Panacea_Datadeal_V2alpha1_QueryAsyncClient: Panacea_Datadeal_V2alpha1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Panacea_Datadeal_V2alpha1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'deal'.
  func makeDealInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse>]

  /// - Returns: Interceptors to use when invoking 'deals'.
  func makeDealsInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse>]

  /// - Returns: Interceptors to use when invoking 'dataCert'.
  func makeDataCertInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse>]

  /// - Returns: Interceptors to use when invoking 'dataCerts'.
  func makeDataCertsInterceptors() -> [ClientInterceptor<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>]
}

internal enum Panacea_Datadeal_V2alpha1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "panacea.datadeal.v2alpha1.Query",
    methods: [
      Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deal,
      Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.deals,
      Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCert,
      Panacea_Datadeal_V2alpha1_QueryClientMetadata.Methods.dataCerts,
    ]
  )

  internal enum Methods {
    internal static let deal = GRPCMethodDescriptor(
      name: "Deal",
      path: "/panacea.datadeal.v2alpha1.Query/Deal",
      type: GRPCCallType.unary
    )

    internal static let deals = GRPCMethodDescriptor(
      name: "Deals",
      path: "/panacea.datadeal.v2alpha1.Query/Deals",
      type: GRPCCallType.unary
    )

    internal static let dataCert = GRPCMethodDescriptor(
      name: "DataCert",
      path: "/panacea.datadeal.v2alpha1.Query/DataCert",
      type: GRPCCallType.unary
    )

    internal static let dataCerts = GRPCMethodDescriptor(
      name: "DataCerts",
      path: "/panacea.datadeal.v2alpha1.Query/DataCerts",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Panacea_Datadeal_V2alpha1_QueryProvider: CallHandlerProvider {
  var interceptors: Panacea_Datadeal_V2alpha1_QueryServerInterceptorFactoryProtocol? { get }

  /// Deal returns a Deal.
  func deal(request: Panacea_Datadeal_V2alpha1_QueryDealRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha1_QueryDealResponse>

  /// Deals returns multiple deals
  func deals(request: Panacea_Datadeal_V2alpha1_QueryDealsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha1_QueryDealsResponse>

  /// DataCert returns a DataCert.
  func dataCert(request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha1_QueryDataCertResponse>

  /// DataCerts return DataCerts.
  func dataCerts(request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>
}

extension Panacea_Datadeal_V2alpha1_QueryProvider {
  internal var serviceName: Substring {
    return Panacea_Datadeal_V2alpha1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDealRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDealResponse>(),
        interceptors: self.interceptors?.makeDealInterceptors() ?? [],
        userFunction: self.deal(request:context:)
      )

    case "Deals":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDealsRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDealsResponse>(),
        interceptors: self.interceptors?.makeDealsInterceptors() ?? [],
        userFunction: self.deals(request:context:)
      )

    case "DataCert":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDataCertRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDataCertResponse>(),
        interceptors: self.interceptors?.makeDataCertInterceptors() ?? [],
        userFunction: self.dataCert(request:context:)
      )

    case "DataCerts":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>(),
        interceptors: self.interceptors?.makeDataCertsInterceptors() ?? [],
        userFunction: self.dataCerts(request:context:)
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
internal protocol Panacea_Datadeal_V2alpha1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Datadeal_V2alpha1_QueryServerInterceptorFactoryProtocol? { get }

  /// Deal returns a Deal.
  @Sendable func deal(
    request: Panacea_Datadeal_V2alpha1_QueryDealRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDealResponse

  /// Deals returns multiple deals
  @Sendable func deals(
    request: Panacea_Datadeal_V2alpha1_QueryDealsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDealsResponse

  /// DataCert returns a DataCert.
  @Sendable func dataCert(
    request: Panacea_Datadeal_V2alpha1_QueryDataCertRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDataCertResponse

  /// DataCerts return DataCerts.
  @Sendable func dataCerts(
    request: Panacea_Datadeal_V2alpha1_QueryDataCertsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Datadeal_V2alpha1_QueryDataCertsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Datadeal_V2alpha1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Datadeal_V2alpha1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Panacea_Datadeal_V2alpha1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Panacea_Datadeal_V2alpha1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deal":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDealRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDealResponse>(),
        interceptors: self.interceptors?.makeDealInterceptors() ?? [],
        wrapping: self.deal(request:context:)
      )

    case "Deals":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDealsRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDealsResponse>(),
        interceptors: self.interceptors?.makeDealsInterceptors() ?? [],
        wrapping: self.deals(request:context:)
      )

    case "DataCert":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDataCertRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDataCertResponse>(),
        interceptors: self.interceptors?.makeDataCertInterceptors() ?? [],
        wrapping: self.dataCert(request:context:)
      )

    case "DataCerts":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest>(),
        responseSerializer: ProtobufSerializer<Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>(),
        interceptors: self.interceptors?.makeDataCertsInterceptors() ?? [],
        wrapping: self.dataCerts(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Panacea_Datadeal_V2alpha1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'deal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDealInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha1_QueryDealRequest, Panacea_Datadeal_V2alpha1_QueryDealResponse>]

  /// - Returns: Interceptors to use when handling 'deals'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDealsInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha1_QueryDealsRequest, Panacea_Datadeal_V2alpha1_QueryDealsResponse>]

  /// - Returns: Interceptors to use when handling 'dataCert'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDataCertInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha1_QueryDataCertRequest, Panacea_Datadeal_V2alpha1_QueryDataCertResponse>]

  /// - Returns: Interceptors to use when handling 'dataCerts'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDataCertsInterceptors() -> [ServerInterceptor<Panacea_Datadeal_V2alpha1_QueryDataCertsRequest, Panacea_Datadeal_V2alpha1_QueryDataCertsResponse>]
}

internal enum Panacea_Datadeal_V2alpha1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "panacea.datadeal.v2alpha1.Query",
    methods: [
      Panacea_Datadeal_V2alpha1_QueryServerMetadata.Methods.deal,
      Panacea_Datadeal_V2alpha1_QueryServerMetadata.Methods.deals,
      Panacea_Datadeal_V2alpha1_QueryServerMetadata.Methods.dataCert,
      Panacea_Datadeal_V2alpha1_QueryServerMetadata.Methods.dataCerts,
    ]
  )

  internal enum Methods {
    internal static let deal = GRPCMethodDescriptor(
      name: "Deal",
      path: "/panacea.datadeal.v2alpha1.Query/Deal",
      type: GRPCCallType.unary
    )

    internal static let deals = GRPCMethodDescriptor(
      name: "Deals",
      path: "/panacea.datadeal.v2alpha1.Query/Deals",
      type: GRPCCallType.unary
    )

    internal static let dataCert = GRPCMethodDescriptor(
      name: "DataCert",
      path: "/panacea.datadeal.v2alpha1.Query/DataCert",
      type: GRPCCallType.unary
    )

    internal static let dataCerts = GRPCMethodDescriptor(
      name: "DataCerts",
      path: "/panacea.datadeal.v2alpha1.Query/DataCerts",
      type: GRPCCallType.unary
    )
  }
}
