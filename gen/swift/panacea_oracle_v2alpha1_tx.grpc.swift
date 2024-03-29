//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: panacea/oracle/v2alpha1/tx.proto
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
/// Usage: instantiate `Panacea_Oracle_V2alpha1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Panacea_Oracle_V2alpha1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? { get }

  func registerOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>

  func updateOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>
}

extension Panacea_Oracle_V2alpha1_MsgClientProtocol {
  internal var serviceName: String {
    return "panacea.oracle.v2alpha1.Msg"
  }

  /// RegisterOracle defines a method for registration of oracle.
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterOracle.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse> {
    return self.makeUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.registerOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterOracleInterceptors() ?? []
    )
  }

  /// UpdateOracle defines a method for updating of oracle.
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateOracle.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse> {
    return self.makeUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.updateOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateOracleInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Panacea_Oracle_V2alpha1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Panacea_Oracle_V2alpha1_MsgNIOClient")
internal final class Panacea_Oracle_V2alpha1_MsgClient: Panacea_Oracle_V2alpha1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the panacea.oracle.v2alpha1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Panacea_Oracle_V2alpha1_MsgNIOClient: Panacea_Oracle_V2alpha1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the panacea.oracle.v2alpha1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Panacea_Oracle_V2alpha1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? { get }

  func makeRegisterOracleCall(
    _ request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>

  func makeUpdateOracleCall(
    _ request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Oracle_V2alpha1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Oracle_V2alpha1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeRegisterOracleCall(
    _ request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.registerOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterOracleInterceptors() ?? []
    )
  }

  internal func makeUpdateOracleCall(
    _ request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse> {
    return self.makeAsyncUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.updateOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateOracleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Oracle_V2alpha1_MsgAsyncClientProtocol {
  internal func registerOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.registerOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterOracleInterceptors() ?? []
    )
  }

  internal func updateOracle(
    _ request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    callOptions: CallOptions? = nil
  ) async throws -> Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse {
    return try await self.performAsyncUnaryCall(
      path: Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.updateOracle.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateOracleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Panacea_Oracle_V2alpha1_MsgAsyncClient: Panacea_Oracle_V2alpha1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Panacea_Oracle_V2alpha1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'registerOracle'.
  func makeRegisterOracleInterceptors() -> [ClientInterceptor<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>]

  /// - Returns: Interceptors to use when invoking 'updateOracle'.
  func makeUpdateOracleInterceptors() -> [ClientInterceptor<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>]
}

internal enum Panacea_Oracle_V2alpha1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "panacea.oracle.v2alpha1.Msg",
    methods: [
      Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.registerOracle,
      Panacea_Oracle_V2alpha1_MsgClientMetadata.Methods.updateOracle,
    ]
  )

  internal enum Methods {
    internal static let registerOracle = GRPCMethodDescriptor(
      name: "RegisterOracle",
      path: "/panacea.oracle.v2alpha1.Msg/RegisterOracle",
      type: GRPCCallType.unary
    )

    internal static let updateOracle = GRPCMethodDescriptor(
      name: "UpdateOracle",
      path: "/panacea.oracle.v2alpha1.Msg/UpdateOracle",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Panacea_Oracle_V2alpha1_MsgProvider: CallHandlerProvider {
  var interceptors: Panacea_Oracle_V2alpha1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterOracle defines a method for registration of oracle.
  func registerOracle(request: Panacea_Oracle_V2alpha1_MsgRegisterOracle, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>

  /// UpdateOracle defines a method for updating of oracle.
  func updateOracle(request: Panacea_Oracle_V2alpha1_MsgUpdateOracle, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>
}

extension Panacea_Oracle_V2alpha1_MsgProvider {
  internal var serviceName: Substring {
    return Panacea_Oracle_V2alpha1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterOracle":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Oracle_V2alpha1_MsgRegisterOracle>(),
        responseSerializer: ProtobufSerializer<Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>(),
        interceptors: self.interceptors?.makeRegisterOracleInterceptors() ?? [],
        userFunction: self.registerOracle(request:context:)
      )

    case "UpdateOracle":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Oracle_V2alpha1_MsgUpdateOracle>(),
        responseSerializer: ProtobufSerializer<Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>(),
        interceptors: self.interceptors?.makeUpdateOracleInterceptors() ?? [],
        userFunction: self.updateOracle(request:context:)
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
internal protocol Panacea_Oracle_V2alpha1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Panacea_Oracle_V2alpha1_MsgServerInterceptorFactoryProtocol? { get }

  /// RegisterOracle defines a method for registration of oracle.
  @Sendable func registerOracle(
    request: Panacea_Oracle_V2alpha1_MsgRegisterOracle,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse

  /// UpdateOracle defines a method for updating of oracle.
  @Sendable func updateOracle(
    request: Panacea_Oracle_V2alpha1_MsgUpdateOracle,
    context: GRPCAsyncServerCallContext
  ) async throws -> Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Panacea_Oracle_V2alpha1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Panacea_Oracle_V2alpha1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Panacea_Oracle_V2alpha1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Panacea_Oracle_V2alpha1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "RegisterOracle":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Oracle_V2alpha1_MsgRegisterOracle>(),
        responseSerializer: ProtobufSerializer<Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>(),
        interceptors: self.interceptors?.makeRegisterOracleInterceptors() ?? [],
        wrapping: self.registerOracle(request:context:)
      )

    case "UpdateOracle":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Oracle_V2alpha1_MsgUpdateOracle>(),
        responseSerializer: ProtobufSerializer<Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>(),
        interceptors: self.interceptors?.makeUpdateOracleInterceptors() ?? [],
        wrapping: self.updateOracle(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Panacea_Oracle_V2alpha1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'registerOracle'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterOracleInterceptors() -> [ServerInterceptor<Panacea_Oracle_V2alpha1_MsgRegisterOracle, Panacea_Oracle_V2alpha1_MsgRegisterOracleResponse>]

  /// - Returns: Interceptors to use when handling 'updateOracle'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateOracleInterceptors() -> [ServerInterceptor<Panacea_Oracle_V2alpha1_MsgUpdateOracle, Panacea_Oracle_V2alpha1_MsgUpdateOracleResponse>]
}

internal enum Panacea_Oracle_V2alpha1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "panacea.oracle.v2alpha1.Msg",
    methods: [
      Panacea_Oracle_V2alpha1_MsgServerMetadata.Methods.registerOracle,
      Panacea_Oracle_V2alpha1_MsgServerMetadata.Methods.updateOracle,
    ]
  )

  internal enum Methods {
    internal static let registerOracle = GRPCMethodDescriptor(
      name: "RegisterOracle",
      path: "/panacea.oracle.v2alpha1.Msg/RegisterOracle",
      type: GRPCCallType.unary
    )

    internal static let updateOracle = GRPCMethodDescriptor(
      name: "UpdateOracle",
      path: "/panacea.oracle.v2alpha1.Msg/UpdateOracle",
      type: GRPCCallType.unary
    )
  }
}
