//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/attribute/v1/query.proto
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


/// Query defines the gRPC querier service for attribute module.
///
/// Usage: instantiate `Provenance_Attribute_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Attribute_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Provenance_Attribute_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse>

  func attribute(
    _ request: Provenance_Attribute_V1_QueryAttributeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse>

  func attributes(
    _ request: Provenance_Attribute_V1_QueryAttributesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse>

  func scan(
    _ request: Provenance_Attribute_V1_QueryScanRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse>

  func attributeAccounts(
    _ request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse>

  func accountData(
    _ request: Provenance_Attribute_V1_QueryAccountDataRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse>
}

extension Provenance_Attribute_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "provenance.attribute.v1.Query"
  }

  /// Params queries params of the attribute module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Provenance_Attribute_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Attribute queries attributes on a given account (address) for one (or more) with the given name
  ///
  /// - Parameters:
  ///   - request: Request to send to Attribute.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func attribute(
    _ request: Provenance_Attribute_V1_QueryAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeInterceptors() ?? []
    )
  }

  /// Attributes queries attributes on a given account (address) for any defined attributes
  ///
  /// - Parameters:
  ///   - request: Request to send to Attributes.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func attributes(
    _ request: Provenance_Attribute_V1_QueryAttributesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributesInterceptors() ?? []
    )
  }

  /// Scan queries attributes on a given account (address) for any that match the provided suffix
  ///
  /// - Parameters:
  ///   - request: Request to send to Scan.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func scan(
    _ request: Provenance_Attribute_V1_QueryScanRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.scan.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeScanInterceptors() ?? []
    )
  }

  /// AttributeAccounts queries accounts on a given attribute name
  ///
  /// - Parameters:
  ///   - request: Request to send to AttributeAccounts.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func attributeAccounts(
    _ request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributeAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeAccountsInterceptors() ?? []
    )
  }

  /// AccountData returns the accountdata for a specified account.
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountData.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountData(
    _ request: Provenance_Attribute_V1_QueryAccountDataRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse> {
    return self.makeUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.accountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountDataInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Attribute_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Attribute_V1_QueryNIOClient")
internal final class Provenance_Attribute_V1_QueryClient: Provenance_Attribute_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.attribute.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Attribute_V1_QueryNIOClient: Provenance_Attribute_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.attribute.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for attribute module.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Attribute_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeParamsCall(
    _ request: Provenance_Attribute_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse>

  func makeAttributeCall(
    _ request: Provenance_Attribute_V1_QueryAttributeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse>

  func makeAttributesCall(
    _ request: Provenance_Attribute_V1_QueryAttributesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse>

  func makeScanCall(
    _ request: Provenance_Attribute_V1_QueryScanRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse>

  func makeAttributeAccountsCall(
    _ request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse>

  func makeAccountDataCall(
    _ request: Provenance_Attribute_V1_QueryAccountDataRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Attribute_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeParamsCall(
    _ request: Provenance_Attribute_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func makeAttributeCall(
    _ request: Provenance_Attribute_V1_QueryAttributeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeInterceptors() ?? []
    )
  }

  internal func makeAttributesCall(
    _ request: Provenance_Attribute_V1_QueryAttributesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributesInterceptors() ?? []
    )
  }

  internal func makeScanCall(
    _ request: Provenance_Attribute_V1_QueryScanRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.scan.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeScanInterceptors() ?? []
    )
  }

  internal func makeAttributeAccountsCall(
    _ request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributeAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeAccountsInterceptors() ?? []
    )
  }

  internal func makeAccountDataCall(
    _ request: Provenance_Attribute_V1_QueryAccountDataRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.accountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_QueryAsyncClientProtocol {
  internal func params(
    _ request: Provenance_Attribute_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  internal func attribute(
    _ request: Provenance_Attribute_V1_QueryAttributeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryAttributeResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attribute.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeInterceptors() ?? []
    )
  }

  internal func attributes(
    _ request: Provenance_Attribute_V1_QueryAttributesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryAttributesResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributes.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributesInterceptors() ?? []
    )
  }

  internal func scan(
    _ request: Provenance_Attribute_V1_QueryScanRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryScanResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.scan.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeScanInterceptors() ?? []
    )
  }

  internal func attributeAccounts(
    _ request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryAttributeAccountsResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.attributeAccounts.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAttributeAccountsInterceptors() ?? []
    )
  }

  internal func accountData(
    _ request: Provenance_Attribute_V1_QueryAccountDataRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Attribute_V1_QueryAccountDataResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Attribute_V1_QueryClientMetadata.Methods.accountData.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountDataInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Attribute_V1_QueryAsyncClient: Provenance_Attribute_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Attribute_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'attribute'.
  func makeAttributeInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse>]

  /// - Returns: Interceptors to use when invoking 'attributes'.
  func makeAttributesInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse>]

  /// - Returns: Interceptors to use when invoking 'scan'.
  func makeScanInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse>]

  /// - Returns: Interceptors to use when invoking 'attributeAccounts'.
  func makeAttributeAccountsInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse>]

  /// - Returns: Interceptors to use when invoking 'accountData'.
  func makeAccountDataInterceptors() -> [ClientInterceptor<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse>]
}

internal enum Provenance_Attribute_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.attribute.v1.Query",
    methods: [
      Provenance_Attribute_V1_QueryClientMetadata.Methods.params,
      Provenance_Attribute_V1_QueryClientMetadata.Methods.attribute,
      Provenance_Attribute_V1_QueryClientMetadata.Methods.attributes,
      Provenance_Attribute_V1_QueryClientMetadata.Methods.scan,
      Provenance_Attribute_V1_QueryClientMetadata.Methods.attributeAccounts,
      Provenance_Attribute_V1_QueryClientMetadata.Methods.accountData,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/provenance.attribute.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let attribute = GRPCMethodDescriptor(
      name: "Attribute",
      path: "/provenance.attribute.v1.Query/Attribute",
      type: GRPCCallType.unary
    )

    internal static let attributes = GRPCMethodDescriptor(
      name: "Attributes",
      path: "/provenance.attribute.v1.Query/Attributes",
      type: GRPCCallType.unary
    )

    internal static let scan = GRPCMethodDescriptor(
      name: "Scan",
      path: "/provenance.attribute.v1.Query/Scan",
      type: GRPCCallType.unary
    )

    internal static let attributeAccounts = GRPCMethodDescriptor(
      name: "AttributeAccounts",
      path: "/provenance.attribute.v1.Query/AttributeAccounts",
      type: GRPCCallType.unary
    )

    internal static let accountData = GRPCMethodDescriptor(
      name: "AccountData",
      path: "/provenance.attribute.v1.Query/AccountData",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for attribute module.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Attribute_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Provenance_Attribute_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries params of the attribute module.
  func params(request: Provenance_Attribute_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryParamsResponse>

  /// Attribute queries attributes on a given account (address) for one (or more) with the given name
  func attribute(request: Provenance_Attribute_V1_QueryAttributeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryAttributeResponse>

  /// Attributes queries attributes on a given account (address) for any defined attributes
  func attributes(request: Provenance_Attribute_V1_QueryAttributesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryAttributesResponse>

  /// Scan queries attributes on a given account (address) for any that match the provided suffix
  func scan(request: Provenance_Attribute_V1_QueryScanRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryScanResponse>

  /// AttributeAccounts queries accounts on a given attribute name
  func attributeAccounts(request: Provenance_Attribute_V1_QueryAttributeAccountsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryAttributeAccountsResponse>

  /// AccountData returns the accountdata for a specified account.
  func accountData(request: Provenance_Attribute_V1_QueryAccountDataRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Attribute_V1_QueryAccountDataResponse>
}

extension Provenance_Attribute_V1_QueryProvider {
  internal var serviceName: Substring {
    return Provenance_Attribute_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Attribute":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributeResponse>(),
        interceptors: self.interceptors?.makeAttributeInterceptors() ?? [],
        userFunction: self.attribute(request:context:)
      )

    case "Attributes":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributesRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributesResponse>(),
        interceptors: self.interceptors?.makeAttributesInterceptors() ?? [],
        userFunction: self.attributes(request:context:)
      )

    case "Scan":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryScanRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryScanResponse>(),
        interceptors: self.interceptors?.makeScanInterceptors() ?? [],
        userFunction: self.scan(request:context:)
      )

    case "AttributeAccounts":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributeAccountsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributeAccountsResponse>(),
        interceptors: self.interceptors?.makeAttributeAccountsInterceptors() ?? [],
        userFunction: self.attributeAccounts(request:context:)
      )

    case "AccountData":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAccountDataRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAccountDataResponse>(),
        interceptors: self.interceptors?.makeAccountDataInterceptors() ?? [],
        userFunction: self.accountData(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for attribute module.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Attribute_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Attribute_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries params of the attribute module.
  @Sendable func params(
    request: Provenance_Attribute_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryParamsResponse

  /// Attribute queries attributes on a given account (address) for one (or more) with the given name
  @Sendable func attribute(
    request: Provenance_Attribute_V1_QueryAttributeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryAttributeResponse

  /// Attributes queries attributes on a given account (address) for any defined attributes
  @Sendable func attributes(
    request: Provenance_Attribute_V1_QueryAttributesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryAttributesResponse

  /// Scan queries attributes on a given account (address) for any that match the provided suffix
  @Sendable func scan(
    request: Provenance_Attribute_V1_QueryScanRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryScanResponse

  /// AttributeAccounts queries accounts on a given attribute name
  @Sendable func attributeAccounts(
    request: Provenance_Attribute_V1_QueryAttributeAccountsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryAttributeAccountsResponse

  /// AccountData returns the accountdata for a specified account.
  @Sendable func accountData(
    request: Provenance_Attribute_V1_QueryAccountDataRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Attribute_V1_QueryAccountDataResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Attribute_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Attribute_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Attribute_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Attribute_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    case "Attribute":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributeRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributeResponse>(),
        interceptors: self.interceptors?.makeAttributeInterceptors() ?? [],
        wrapping: self.attribute(request:context:)
      )

    case "Attributes":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributesRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributesResponse>(),
        interceptors: self.interceptors?.makeAttributesInterceptors() ?? [],
        wrapping: self.attributes(request:context:)
      )

    case "Scan":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryScanRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryScanResponse>(),
        interceptors: self.interceptors?.makeScanInterceptors() ?? [],
        wrapping: self.scan(request:context:)
      )

    case "AttributeAccounts":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAttributeAccountsRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAttributeAccountsResponse>(),
        interceptors: self.interceptors?.makeAttributeAccountsInterceptors() ?? [],
        wrapping: self.attributeAccounts(request:context:)
      )

    case "AccountData":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Attribute_V1_QueryAccountDataRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Attribute_V1_QueryAccountDataResponse>(),
        interceptors: self.interceptors?.makeAccountDataInterceptors() ?? [],
        wrapping: self.accountData(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Attribute_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryParamsRequest, Provenance_Attribute_V1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'attribute'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAttributeInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryAttributeRequest, Provenance_Attribute_V1_QueryAttributeResponse>]

  /// - Returns: Interceptors to use when handling 'attributes'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAttributesInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryAttributesRequest, Provenance_Attribute_V1_QueryAttributesResponse>]

  /// - Returns: Interceptors to use when handling 'scan'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeScanInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryScanRequest, Provenance_Attribute_V1_QueryScanResponse>]

  /// - Returns: Interceptors to use when handling 'attributeAccounts'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAttributeAccountsInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryAttributeAccountsRequest, Provenance_Attribute_V1_QueryAttributeAccountsResponse>]

  /// - Returns: Interceptors to use when handling 'accountData'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountDataInterceptors() -> [ServerInterceptor<Provenance_Attribute_V1_QueryAccountDataRequest, Provenance_Attribute_V1_QueryAccountDataResponse>]
}

internal enum Provenance_Attribute_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "provenance.attribute.v1.Query",
    methods: [
      Provenance_Attribute_V1_QueryServerMetadata.Methods.params,
      Provenance_Attribute_V1_QueryServerMetadata.Methods.attribute,
      Provenance_Attribute_V1_QueryServerMetadata.Methods.attributes,
      Provenance_Attribute_V1_QueryServerMetadata.Methods.scan,
      Provenance_Attribute_V1_QueryServerMetadata.Methods.attributeAccounts,
      Provenance_Attribute_V1_QueryServerMetadata.Methods.accountData,
    ]
  )

  internal enum Methods {
    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/provenance.attribute.v1.Query/Params",
      type: GRPCCallType.unary
    )

    internal static let attribute = GRPCMethodDescriptor(
      name: "Attribute",
      path: "/provenance.attribute.v1.Query/Attribute",
      type: GRPCCallType.unary
    )

    internal static let attributes = GRPCMethodDescriptor(
      name: "Attributes",
      path: "/provenance.attribute.v1.Query/Attributes",
      type: GRPCCallType.unary
    )

    internal static let scan = GRPCMethodDescriptor(
      name: "Scan",
      path: "/provenance.attribute.v1.Query/Scan",
      type: GRPCCallType.unary
    )

    internal static let attributeAccounts = GRPCMethodDescriptor(
      name: "AttributeAccounts",
      path: "/provenance.attribute.v1.Query/AttributeAccounts",
      type: GRPCCallType.unary
    )

    internal static let accountData = GRPCMethodDescriptor(
      name: "AccountData",
      path: "/provenance.attribute.v1.Query/AccountData",
      type: GRPCCallType.unary
    )
  }
}
