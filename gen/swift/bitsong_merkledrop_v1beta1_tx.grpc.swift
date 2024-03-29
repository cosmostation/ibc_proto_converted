//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: bitsong/merkledrop/v1beta1/tx.proto
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


/// Usage: instantiate `Bitsong_Merkledrop_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Bitsong_Merkledrop_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func create(
    _ request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse>

  func claim(
    _ request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse>
}

extension Bitsong_Merkledrop_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "bitsong.merkledrop.v1beta1.Msg"
  }

  /// Unary call to Create
  ///
  /// - Parameters:
  ///   - request: Request to send to Create.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func create(
    _ request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse> {
    return self.makeUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  /// Unary call to Claim
  ///
  /// - Parameters:
  ///   - request: Request to send to Claim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claim(
    _ request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse> {
    return self.makeUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Bitsong_Merkledrop_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Bitsong_Merkledrop_V1beta1_MsgNIOClient")
internal final class Bitsong_Merkledrop_V1beta1_MsgClient: Bitsong_Merkledrop_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the bitsong.merkledrop.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Bitsong_Merkledrop_V1beta1_MsgNIOClient: Bitsong_Merkledrop_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the bitsong.merkledrop.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Bitsong_Merkledrop_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreateCall(
    _ request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse>

  func makeClaimCall(
    _ request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitsong_Merkledrop_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bitsong_Merkledrop_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateCall(
    _ request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  internal func makeClaimCall(
    _ request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse> {
    return self.makeAsyncUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitsong_Merkledrop_V1beta1_MsgAsyncClientProtocol {
  internal func create(
    _ request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    callOptions: CallOptions? = nil
  ) async throws -> Bitsong_Merkledrop_V1beta1_MsgCreateResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  internal func claim(
    _ request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    callOptions: CallOptions? = nil
  ) async throws -> Bitsong_Merkledrop_V1beta1_MsgClaimResponse {
    return try await self.performAsyncUnaryCall(
      path: Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.claim.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Bitsong_Merkledrop_V1beta1_MsgAsyncClient: Bitsong_Merkledrop_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Bitsong_Merkledrop_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'create'.
  func makeCreateInterceptors() -> [ClientInterceptor<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse>]

  /// - Returns: Interceptors to use when invoking 'claim'.
  func makeClaimInterceptors() -> [ClientInterceptor<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse>]
}

internal enum Bitsong_Merkledrop_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "bitsong.merkledrop.v1beta1.Msg",
    methods: [
      Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.create,
      Bitsong_Merkledrop_V1beta1_MsgClientMetadata.Methods.claim,
    ]
  )

  internal enum Methods {
    internal static let create = GRPCMethodDescriptor(
      name: "Create",
      path: "/bitsong.merkledrop.v1beta1.Msg/Create",
      type: GRPCCallType.unary
    )

    internal static let claim = GRPCMethodDescriptor(
      name: "Claim",
      path: "/bitsong.merkledrop.v1beta1.Msg/Claim",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Bitsong_Merkledrop_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Bitsong_Merkledrop_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func create(request: Bitsong_Merkledrop_V1beta1_MsgCreate, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Merkledrop_V1beta1_MsgCreateResponse>

  func claim(request: Bitsong_Merkledrop_V1beta1_MsgClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Merkledrop_V1beta1_MsgClaimResponse>
}

extension Bitsong_Merkledrop_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Bitsong_Merkledrop_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Create":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Merkledrop_V1beta1_MsgCreate>(),
        responseSerializer: ProtobufSerializer<Bitsong_Merkledrop_V1beta1_MsgCreateResponse>(),
        interceptors: self.interceptors?.makeCreateInterceptors() ?? [],
        userFunction: self.create(request:context:)
      )

    case "Claim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Merkledrop_V1beta1_MsgClaim>(),
        responseSerializer: ProtobufSerializer<Bitsong_Merkledrop_V1beta1_MsgClaimResponse>(),
        interceptors: self.interceptors?.makeClaimInterceptors() ?? [],
        userFunction: self.claim(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Bitsong_Merkledrop_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Bitsong_Merkledrop_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  @Sendable func create(
    request: Bitsong_Merkledrop_V1beta1_MsgCreate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitsong_Merkledrop_V1beta1_MsgCreateResponse

  @Sendable func claim(
    request: Bitsong_Merkledrop_V1beta1_MsgClaim,
    context: GRPCAsyncServerCallContext
  ) async throws -> Bitsong_Merkledrop_V1beta1_MsgClaimResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Bitsong_Merkledrop_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Bitsong_Merkledrop_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Bitsong_Merkledrop_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Bitsong_Merkledrop_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Create":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Merkledrop_V1beta1_MsgCreate>(),
        responseSerializer: ProtobufSerializer<Bitsong_Merkledrop_V1beta1_MsgCreateResponse>(),
        interceptors: self.interceptors?.makeCreateInterceptors() ?? [],
        wrapping: self.create(request:context:)
      )

    case "Claim":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Merkledrop_V1beta1_MsgClaim>(),
        responseSerializer: ProtobufSerializer<Bitsong_Merkledrop_V1beta1_MsgClaimResponse>(),
        interceptors: self.interceptors?.makeClaimInterceptors() ?? [],
        wrapping: self.claim(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Bitsong_Merkledrop_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'create'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateInterceptors() -> [ServerInterceptor<Bitsong_Merkledrop_V1beta1_MsgCreate, Bitsong_Merkledrop_V1beta1_MsgCreateResponse>]

  /// - Returns: Interceptors to use when handling 'claim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimInterceptors() -> [ServerInterceptor<Bitsong_Merkledrop_V1beta1_MsgClaim, Bitsong_Merkledrop_V1beta1_MsgClaimResponse>]
}

internal enum Bitsong_Merkledrop_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "bitsong.merkledrop.v1beta1.Msg",
    methods: [
      Bitsong_Merkledrop_V1beta1_MsgServerMetadata.Methods.create,
      Bitsong_Merkledrop_V1beta1_MsgServerMetadata.Methods.claim,
    ]
  )

  internal enum Methods {
    internal static let create = GRPCMethodDescriptor(
      name: "Create",
      path: "/bitsong.merkledrop.v1beta1.Msg/Create",
      type: GRPCCallType.unary
    )

    internal static let claim = GRPCMethodDescriptor(
      name: "Claim",
      path: "/bitsong.merkledrop.v1beta1.Msg/Claim",
      type: GRPCCallType.unary
    )
  }
}
