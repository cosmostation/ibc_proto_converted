//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/reports/v1/query.proto
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
/// Usage: instantiate `Desmos_Reports_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Reports_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? { get }

  func reports(
    _ request: Desmos_Reports_V1_QueryReportsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse>

  func report(
    _ request: Desmos_Reports_V1_QueryReportRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse>

  func reasons(
    _ request: Desmos_Reports_V1_QueryReasonsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse>

  func reason(
    _ request: Desmos_Reports_V1_QueryReasonRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse>

  func params(
    _ request: Desmos_Reports_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse>
}

extension Desmos_Reports_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "desmos.reports.v1.Query"
  }

  /// Reports allows to query the reports for a specific target
  ///
  /// - Parameters:
  ///   - request: Request to send to Reports.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reports(
    _ request: Desmos_Reports_V1_QueryReportsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reports.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportsInterceptors() ?? []
    )
  }

  /// Report allows to query the report having the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to Report.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func report(
    _ request: Desmos_Reports_V1_QueryReportRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.report.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportInterceptors() ?? []
    )
  }

  /// Reasons allows to query the supported reporting reasons for a subspace
  ///
  /// - Parameters:
  ///   - request: Request to send to Reasons.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reasons(
    _ request: Desmos_Reports_V1_QueryReasonsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reasons.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonsInterceptors() ?? []
    )
  }

  /// Reason allows to query the reason having the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to Reason.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reason(
    _ request: Desmos_Reports_V1_QueryReasonRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reason.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonInterceptors() ?? []
    )
  }

  /// Params allows to query the module parameters
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Desmos_Reports_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Desmos_Reports_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Desmos_Reports_V1_QueryNIOClient")
internal final class Desmos_Reports_V1_QueryClient: Desmos_Reports_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the desmos.reports.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Desmos_Reports_V1_QueryNIOClient: Desmos_Reports_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.reports.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Desmos_Reports_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeReportsCall(
    _ request: Desmos_Reports_V1_QueryReportsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse>

  func makeReportCall(
    _ request: Desmos_Reports_V1_QueryReportRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse>

  func makeReasonsCall(
    _ request: Desmos_Reports_V1_QueryReasonsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse>

  func makeReasonCall(
    _ request: Desmos_Reports_V1_QueryReasonRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse>

  func makeParamsCall(
    _ request: Desmos_Reports_V1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reports_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Reports_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeReportsCall(
    _ request: Desmos_Reports_V1_QueryReportsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reports.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportsInterceptors() ?? []
    )
  }

  internal func makeReportCall(
    _ request: Desmos_Reports_V1_QueryReportRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.report.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportInterceptors() ?? []
    )
  }

  internal func makeReasonsCall(
    _ request: Desmos_Reports_V1_QueryReasonsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reasons.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonsInterceptors() ?? []
    )
  }

  internal func makeReasonCall(
    _ request: Desmos_Reports_V1_QueryReasonRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reason.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonInterceptors() ?? []
    )
  }

  internal func makeParamsCall(
    _ request: Desmos_Reports_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reports_V1_QueryAsyncClientProtocol {
  internal func reports(
    _ request: Desmos_Reports_V1_QueryReportsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reports_V1_QueryReportsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reports.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportsInterceptors() ?? []
    )
  }

  internal func report(
    _ request: Desmos_Reports_V1_QueryReportRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reports_V1_QueryReportResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.report.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportInterceptors() ?? []
    )
  }

  internal func reasons(
    _ request: Desmos_Reports_V1_QueryReasonsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reports_V1_QueryReasonsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reasons.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonsInterceptors() ?? []
    )
  }

  internal func reason(
    _ request: Desmos_Reports_V1_QueryReasonRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reports_V1_QueryReasonResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.reason.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReasonInterceptors() ?? []
    )
  }

  internal func params(
    _ request: Desmos_Reports_V1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Reports_V1_QueryParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Reports_V1_QueryClientMetadata.Methods.params.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Desmos_Reports_V1_QueryAsyncClient: Desmos_Reports_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Desmos_Reports_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'reports'.
  func makeReportsInterceptors() -> [ClientInterceptor<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse>]

  /// - Returns: Interceptors to use when invoking 'report'.
  func makeReportInterceptors() -> [ClientInterceptor<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse>]

  /// - Returns: Interceptors to use when invoking 'reasons'.
  func makeReasonsInterceptors() -> [ClientInterceptor<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse>]

  /// - Returns: Interceptors to use when invoking 'reason'.
  func makeReasonInterceptors() -> [ClientInterceptor<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse>]
}

internal enum Desmos_Reports_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "desmos.reports.v1.Query",
    methods: [
      Desmos_Reports_V1_QueryClientMetadata.Methods.reports,
      Desmos_Reports_V1_QueryClientMetadata.Methods.report,
      Desmos_Reports_V1_QueryClientMetadata.Methods.reasons,
      Desmos_Reports_V1_QueryClientMetadata.Methods.reason,
      Desmos_Reports_V1_QueryClientMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let reports = GRPCMethodDescriptor(
      name: "Reports",
      path: "/desmos.reports.v1.Query/Reports",
      type: GRPCCallType.unary
    )

    internal static let report = GRPCMethodDescriptor(
      name: "Report",
      path: "/desmos.reports.v1.Query/Report",
      type: GRPCCallType.unary
    )

    internal static let reasons = GRPCMethodDescriptor(
      name: "Reasons",
      path: "/desmos.reports.v1.Query/Reasons",
      type: GRPCCallType.unary
    )

    internal static let reason = GRPCMethodDescriptor(
      name: "Reason",
      path: "/desmos.reports.v1.Query/Reason",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/desmos.reports.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Reports_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Desmos_Reports_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Reports allows to query the reports for a specific target
  func reports(request: Desmos_Reports_V1_QueryReportsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reports_V1_QueryReportsResponse>

  /// Report allows to query the report having the given id
  func report(request: Desmos_Reports_V1_QueryReportRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reports_V1_QueryReportResponse>

  /// Reasons allows to query the supported reporting reasons for a subspace
  func reasons(request: Desmos_Reports_V1_QueryReasonsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reports_V1_QueryReasonsResponse>

  /// Reason allows to query the reason having the given id
  func reason(request: Desmos_Reports_V1_QueryReasonRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reports_V1_QueryReasonResponse>

  /// Params allows to query the module parameters
  func params(request: Desmos_Reports_V1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Reports_V1_QueryParamsResponse>
}

extension Desmos_Reports_V1_QueryProvider {
  internal var serviceName: Substring {
    return Desmos_Reports_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Reports":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReportsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReportsResponse>(),
        interceptors: self.interceptors?.makeReportsInterceptors() ?? [],
        userFunction: self.reports(request:context:)
      )

    case "Report":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReportRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReportResponse>(),
        interceptors: self.interceptors?.makeReportInterceptors() ?? [],
        userFunction: self.report(request:context:)
      )

    case "Reasons":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReasonsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReasonsResponse>(),
        interceptors: self.interceptors?.makeReasonsInterceptors() ?? [],
        userFunction: self.reasons(request:context:)
      )

    case "Reason":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReasonRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReasonResponse>(),
        interceptors: self.interceptors?.makeReasonInterceptors() ?? [],
        userFunction: self.reason(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
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
internal protocol Desmos_Reports_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Reports_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Reports allows to query the reports for a specific target
  @Sendable func reports(
    request: Desmos_Reports_V1_QueryReportsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reports_V1_QueryReportsResponse

  /// Report allows to query the report having the given id
  @Sendable func report(
    request: Desmos_Reports_V1_QueryReportRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reports_V1_QueryReportResponse

  /// Reasons allows to query the supported reporting reasons for a subspace
  @Sendable func reasons(
    request: Desmos_Reports_V1_QueryReasonsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reports_V1_QueryReasonsResponse

  /// Reason allows to query the reason having the given id
  @Sendable func reason(
    request: Desmos_Reports_V1_QueryReasonRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reports_V1_QueryReasonResponse

  /// Params allows to query the module parameters
  @Sendable func params(
    request: Desmos_Reports_V1_QueryParamsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Reports_V1_QueryParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Reports_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Reports_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Desmos_Reports_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Desmos_Reports_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Reports":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReportsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReportsResponse>(),
        interceptors: self.interceptors?.makeReportsInterceptors() ?? [],
        wrapping: self.reports(request:context:)
      )

    case "Report":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReportRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReportResponse>(),
        interceptors: self.interceptors?.makeReportInterceptors() ?? [],
        wrapping: self.report(request:context:)
      )

    case "Reasons":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReasonsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReasonsResponse>(),
        interceptors: self.interceptors?.makeReasonsInterceptors() ?? [],
        wrapping: self.reasons(request:context:)
      )

    case "Reason":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryReasonRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryReasonResponse>(),
        interceptors: self.interceptors?.makeReasonInterceptors() ?? [],
        wrapping: self.reason(request:context:)
      )

    case "Params":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Reports_V1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Reports_V1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        wrapping: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Reports_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'reports'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReportsInterceptors() -> [ServerInterceptor<Desmos_Reports_V1_QueryReportsRequest, Desmos_Reports_V1_QueryReportsResponse>]

  /// - Returns: Interceptors to use when handling 'report'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReportInterceptors() -> [ServerInterceptor<Desmos_Reports_V1_QueryReportRequest, Desmos_Reports_V1_QueryReportResponse>]

  /// - Returns: Interceptors to use when handling 'reasons'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReasonsInterceptors() -> [ServerInterceptor<Desmos_Reports_V1_QueryReasonsRequest, Desmos_Reports_V1_QueryReasonsResponse>]

  /// - Returns: Interceptors to use when handling 'reason'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReasonInterceptors() -> [ServerInterceptor<Desmos_Reports_V1_QueryReasonRequest, Desmos_Reports_V1_QueryReasonResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Desmos_Reports_V1_QueryParamsRequest, Desmos_Reports_V1_QueryParamsResponse>]
}

internal enum Desmos_Reports_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "desmos.reports.v1.Query",
    methods: [
      Desmos_Reports_V1_QueryServerMetadata.Methods.reports,
      Desmos_Reports_V1_QueryServerMetadata.Methods.report,
      Desmos_Reports_V1_QueryServerMetadata.Methods.reasons,
      Desmos_Reports_V1_QueryServerMetadata.Methods.reason,
      Desmos_Reports_V1_QueryServerMetadata.Methods.params,
    ]
  )

  internal enum Methods {
    internal static let reports = GRPCMethodDescriptor(
      name: "Reports",
      path: "/desmos.reports.v1.Query/Reports",
      type: GRPCCallType.unary
    )

    internal static let report = GRPCMethodDescriptor(
      name: "Report",
      path: "/desmos.reports.v1.Query/Report",
      type: GRPCCallType.unary
    )

    internal static let reasons = GRPCMethodDescriptor(
      name: "Reasons",
      path: "/desmos.reports.v1.Query/Reasons",
      type: GRPCCallType.unary
    )

    internal static let reason = GRPCMethodDescriptor(
      name: "Reason",
      path: "/desmos.reports.v1.Query/Reason",
      type: GRPCCallType.unary
    )

    internal static let params = GRPCMethodDescriptor(
      name: "Params",
      path: "/desmos.reports.v1.Query/Params",
      type: GRPCCallType.unary
    )
  }
}
