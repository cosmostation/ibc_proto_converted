//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: ixo/claims/v1beta1/tx.proto
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


/// Msg defines the Msg service.
///
/// Usage: instantiate `Ixo_Claims_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Ixo_Claims_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createCollection(
    _ request: Ixo_Claims_V1beta1_MsgCreateCollection,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse>

  func submitClaim(
    _ request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse>

  func evaluateClaim(
    _ request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>

  func disputeClaim(
    _ request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse>

  func withdrawPayment(
    _ request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    callOptions: CallOptions?
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>
}

extension Ixo_Claims_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "ixo.claims.v1beta1.Msg"
  }

  /// Unary call to CreateCollection
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateCollection.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createCollection(
    _ request: Ixo_Claims_V1beta1_MsgCreateCollection,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse> {
    return self.makeUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.createCollection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateCollectionInterceptors() ?? []
    )
  }

  /// Unary call to SubmitClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to SubmitClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func submitClaim(
    _ request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse> {
    return self.makeUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.submitClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitClaimInterceptors() ?? []
    )
  }

  /// Unary call to EvaluateClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to EvaluateClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func evaluateClaim(
    _ request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse> {
    return self.makeUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.evaluateClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEvaluateClaimInterceptors() ?? []
    )
  }

  /// Unary call to DisputeClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to DisputeClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func disputeClaim(
    _ request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse> {
    return self.makeUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.disputeClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDisputeClaimInterceptors() ?? []
    )
  }

  /// Unary call to WithdrawPayment
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawPayment.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawPayment(
    _ request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse> {
    return self.makeUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.withdrawPayment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawPaymentInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Ixo_Claims_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Ixo_Claims_V1beta1_MsgNIOClient")
internal final class Ixo_Claims_V1beta1_MsgClient: Ixo_Claims_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the ixo.claims.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Ixo_Claims_V1beta1_MsgNIOClient: Ixo_Claims_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the ixo.claims.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ixo_Claims_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateCollectionCall(
    _ request: Ixo_Claims_V1beta1_MsgCreateCollection,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse>

  func makeSubmitClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse>

  func makeEvaluateClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>

  func makeDisputeClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse>

  func makeWithdrawPaymentCall(
    _ request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Claims_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ixo_Claims_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateCollectionCall(
    _ request: Ixo_Claims_V1beta1_MsgCreateCollection,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.createCollection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateCollectionInterceptors() ?? []
    )
  }

  internal func makeSubmitClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.submitClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitClaimInterceptors() ?? []
    )
  }

  internal func makeEvaluateClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.evaluateClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEvaluateClaimInterceptors() ?? []
    )
  }

  internal func makeDisputeClaimCall(
    _ request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.disputeClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDisputeClaimInterceptors() ?? []
    )
  }

  internal func makeWithdrawPaymentCall(
    _ request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse> {
    return self.makeAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.withdrawPayment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawPaymentInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Claims_V1beta1_MsgAsyncClientProtocol {
  internal func createCollection(
    _ request: Ixo_Claims_V1beta1_MsgCreateCollection,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Claims_V1beta1_MsgCreateCollectionResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.createCollection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateCollectionInterceptors() ?? []
    )
  }

  internal func submitClaim(
    _ request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Claims_V1beta1_MsgSubmitClaimResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.submitClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitClaimInterceptors() ?? []
    )
  }

  internal func evaluateClaim(
    _ request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Claims_V1beta1_MsgEvaluateClaimResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.evaluateClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEvaluateClaimInterceptors() ?? []
    )
  }

  internal func disputeClaim(
    _ request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Claims_V1beta1_MsgDisputeClaimResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.disputeClaim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDisputeClaimInterceptors() ?? []
    )
  }

  internal func withdrawPayment(
    _ request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    callOptions: CallOptions? = nil
  ) async throws -> Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse {
    return try await self.performAsyncUnaryCall(
      path: Ixo_Claims_V1beta1_MsgClientMetadata.Methods.withdrawPayment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawPaymentInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Ixo_Claims_V1beta1_MsgAsyncClient: Ixo_Claims_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Ixo_Claims_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createCollection'.
  func makeCreateCollectionInterceptors() -> [ClientInterceptor<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse>]

  /// - Returns: Interceptors to use when invoking 'submitClaim'.
  func makeSubmitClaimInterceptors() -> [ClientInterceptor<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'evaluateClaim'.
  func makeEvaluateClaimInterceptors() -> [ClientInterceptor<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'disputeClaim'.
  func makeDisputeClaimInterceptors() -> [ClientInterceptor<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawPayment'.
  func makeWithdrawPaymentInterceptors() -> [ClientInterceptor<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>]
}

internal enum Ixo_Claims_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ixo.claims.v1beta1.Msg",
    methods: [
      Ixo_Claims_V1beta1_MsgClientMetadata.Methods.createCollection,
      Ixo_Claims_V1beta1_MsgClientMetadata.Methods.submitClaim,
      Ixo_Claims_V1beta1_MsgClientMetadata.Methods.evaluateClaim,
      Ixo_Claims_V1beta1_MsgClientMetadata.Methods.disputeClaim,
      Ixo_Claims_V1beta1_MsgClientMetadata.Methods.withdrawPayment,
    ]
  )

  internal enum Methods {
    internal static let createCollection = GRPCMethodDescriptor(
      name: "CreateCollection",
      path: "/ixo.claims.v1beta1.Msg/CreateCollection",
      type: GRPCCallType.unary
    )

    internal static let submitClaim = GRPCMethodDescriptor(
      name: "SubmitClaim",
      path: "/ixo.claims.v1beta1.Msg/SubmitClaim",
      type: GRPCCallType.unary
    )

    internal static let evaluateClaim = GRPCMethodDescriptor(
      name: "EvaluateClaim",
      path: "/ixo.claims.v1beta1.Msg/EvaluateClaim",
      type: GRPCCallType.unary
    )

    internal static let disputeClaim = GRPCMethodDescriptor(
      name: "DisputeClaim",
      path: "/ixo.claims.v1beta1.Msg/DisputeClaim",
      type: GRPCCallType.unary
    )

    internal static let withdrawPayment = GRPCMethodDescriptor(
      name: "WithdrawPayment",
      path: "/ixo.claims.v1beta1.Msg/WithdrawPayment",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Ixo_Claims_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Ixo_Claims_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func createCollection(request: Ixo_Claims_V1beta1_MsgCreateCollection, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Claims_V1beta1_MsgCreateCollectionResponse>

  func submitClaim(request: Ixo_Claims_V1beta1_MsgSubmitClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Claims_V1beta1_MsgSubmitClaimResponse>

  func evaluateClaim(request: Ixo_Claims_V1beta1_MsgEvaluateClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>

  func disputeClaim(request: Ixo_Claims_V1beta1_MsgDisputeClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Claims_V1beta1_MsgDisputeClaimResponse>

  func withdrawPayment(request: Ixo_Claims_V1beta1_MsgWithdrawPayment, context: StatusOnlyCallContext) -> EventLoopFuture<Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>
}

extension Ixo_Claims_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Ixo_Claims_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateCollection":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgCreateCollection>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgCreateCollectionResponse>(),
        interceptors: self.interceptors?.makeCreateCollectionInterceptors() ?? [],
        userFunction: self.createCollection(request:context:)
      )

    case "SubmitClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgSubmitClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgSubmitClaimResponse>(),
        interceptors: self.interceptors?.makeSubmitClaimInterceptors() ?? [],
        userFunction: self.submitClaim(request:context:)
      )

    case "EvaluateClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgEvaluateClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>(),
        interceptors: self.interceptors?.makeEvaluateClaimInterceptors() ?? [],
        userFunction: self.evaluateClaim(request:context:)
      )

    case "DisputeClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgDisputeClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgDisputeClaimResponse>(),
        interceptors: self.interceptors?.makeDisputeClaimInterceptors() ?? [],
        userFunction: self.disputeClaim(request:context:)
      )

    case "WithdrawPayment":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgWithdrawPayment>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>(),
        interceptors: self.interceptors?.makeWithdrawPaymentInterceptors() ?? [],
        userFunction: self.withdrawPayment(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ixo_Claims_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ixo_Claims_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func createCollection(
    request: Ixo_Claims_V1beta1_MsgCreateCollection,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Claims_V1beta1_MsgCreateCollectionResponse

  @Sendable func submitClaim(
    request: Ixo_Claims_V1beta1_MsgSubmitClaim,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Claims_V1beta1_MsgSubmitClaimResponse

  @Sendable func evaluateClaim(
    request: Ixo_Claims_V1beta1_MsgEvaluateClaim,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Claims_V1beta1_MsgEvaluateClaimResponse

  @Sendable func disputeClaim(
    request: Ixo_Claims_V1beta1_MsgDisputeClaim,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Claims_V1beta1_MsgDisputeClaimResponse

  @Sendable func withdrawPayment(
    request: Ixo_Claims_V1beta1_MsgWithdrawPayment,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ixo_Claims_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ixo_Claims_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Ixo_Claims_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Ixo_Claims_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateCollection":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgCreateCollection>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgCreateCollectionResponse>(),
        interceptors: self.interceptors?.makeCreateCollectionInterceptors() ?? [],
        wrapping: self.createCollection(request:context:)
      )

    case "SubmitClaim":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgSubmitClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgSubmitClaimResponse>(),
        interceptors: self.interceptors?.makeSubmitClaimInterceptors() ?? [],
        wrapping: self.submitClaim(request:context:)
      )

    case "EvaluateClaim":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgEvaluateClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>(),
        interceptors: self.interceptors?.makeEvaluateClaimInterceptors() ?? [],
        wrapping: self.evaluateClaim(request:context:)
      )

    case "DisputeClaim":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgDisputeClaim>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgDisputeClaimResponse>(),
        interceptors: self.interceptors?.makeDisputeClaimInterceptors() ?? [],
        wrapping: self.disputeClaim(request:context:)
      )

    case "WithdrawPayment":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ixo_Claims_V1beta1_MsgWithdrawPayment>(),
        responseSerializer: ProtobufSerializer<Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>(),
        interceptors: self.interceptors?.makeWithdrawPaymentInterceptors() ?? [],
        wrapping: self.withdrawPayment(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Ixo_Claims_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createCollection'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateCollectionInterceptors() -> [ServerInterceptor<Ixo_Claims_V1beta1_MsgCreateCollection, Ixo_Claims_V1beta1_MsgCreateCollectionResponse>]

  /// - Returns: Interceptors to use when handling 'submitClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSubmitClaimInterceptors() -> [ServerInterceptor<Ixo_Claims_V1beta1_MsgSubmitClaim, Ixo_Claims_V1beta1_MsgSubmitClaimResponse>]

  /// - Returns: Interceptors to use when handling 'evaluateClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEvaluateClaimInterceptors() -> [ServerInterceptor<Ixo_Claims_V1beta1_MsgEvaluateClaim, Ixo_Claims_V1beta1_MsgEvaluateClaimResponse>]

  /// - Returns: Interceptors to use when handling 'disputeClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDisputeClaimInterceptors() -> [ServerInterceptor<Ixo_Claims_V1beta1_MsgDisputeClaim, Ixo_Claims_V1beta1_MsgDisputeClaimResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawPayment'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawPaymentInterceptors() -> [ServerInterceptor<Ixo_Claims_V1beta1_MsgWithdrawPayment, Ixo_Claims_V1beta1_MsgWithdrawPaymentResponse>]
}

internal enum Ixo_Claims_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ixo.claims.v1beta1.Msg",
    methods: [
      Ixo_Claims_V1beta1_MsgServerMetadata.Methods.createCollection,
      Ixo_Claims_V1beta1_MsgServerMetadata.Methods.submitClaim,
      Ixo_Claims_V1beta1_MsgServerMetadata.Methods.evaluateClaim,
      Ixo_Claims_V1beta1_MsgServerMetadata.Methods.disputeClaim,
      Ixo_Claims_V1beta1_MsgServerMetadata.Methods.withdrawPayment,
    ]
  )

  internal enum Methods {
    internal static let createCollection = GRPCMethodDescriptor(
      name: "CreateCollection",
      path: "/ixo.claims.v1beta1.Msg/CreateCollection",
      type: GRPCCallType.unary
    )

    internal static let submitClaim = GRPCMethodDescriptor(
      name: "SubmitClaim",
      path: "/ixo.claims.v1beta1.Msg/SubmitClaim",
      type: GRPCCallType.unary
    )

    internal static let evaluateClaim = GRPCMethodDescriptor(
      name: "EvaluateClaim",
      path: "/ixo.claims.v1beta1.Msg/EvaluateClaim",
      type: GRPCCallType.unary
    )

    internal static let disputeClaim = GRPCMethodDescriptor(
      name: "DisputeClaim",
      path: "/ixo.claims.v1beta1.Msg/DisputeClaim",
      type: GRPCCallType.unary
    )

    internal static let withdrawPayment = GRPCMethodDescriptor(
      name: "WithdrawPayment",
      path: "/ixo.claims.v1beta1.Msg/WithdrawPayment",
      type: GRPCCallType.unary
    )
  }
}
