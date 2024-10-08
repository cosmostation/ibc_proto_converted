//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: ibc/applications/perm/v1/tx.proto
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


/// Msg defines the ibc/perm Msg service
///
/// Usage: instantiate `Ibc_Applications_Perm_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Ibc_Applications_Perm_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? { get }

  func setPermissionedRelayers(
    _ request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    callOptions: CallOptions?
  ) -> UnaryCall<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>
}

extension Ibc_Applications_Perm_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "ibc.applications.perm.v1.Msg"
  }

  /// SetPermissionedRelayers defines a rpc handler method for MsgSetPermissionedRelayers.
  ///
  /// - Parameters:
  ///   - request: Request to send to SetPermissionedRelayers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setPermissionedRelayers(
    _ request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse> {
    return self.makeUnaryCall(
      path: Ibc_Applications_Perm_V1_MsgClientMetadata.Methods.setPermissionedRelayers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPermissionedRelayersInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Ibc_Applications_Perm_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Ibc_Applications_Perm_V1_MsgNIOClient")
internal final class Ibc_Applications_Perm_V1_MsgClient: Ibc_Applications_Perm_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the ibc.applications.perm.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Ibc_Applications_Perm_V1_MsgNIOClient: Ibc_Applications_Perm_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the ibc.applications.perm.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the ibc/perm Msg service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ibc_Applications_Perm_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeSetPermissionedRelayersCall(
    _ request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_Perm_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ibc_Applications_Perm_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSetPermissionedRelayersCall(
    _ request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse> {
    return self.makeAsyncUnaryCall(
      path: Ibc_Applications_Perm_V1_MsgClientMetadata.Methods.setPermissionedRelayers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPermissionedRelayersInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_Perm_V1_MsgAsyncClientProtocol {
  internal func setPermissionedRelayers(
    _ request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    callOptions: CallOptions? = nil
  ) async throws -> Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse {
    return try await self.performAsyncUnaryCall(
      path: Ibc_Applications_Perm_V1_MsgClientMetadata.Methods.setPermissionedRelayers.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPermissionedRelayersInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Ibc_Applications_Perm_V1_MsgAsyncClient: Ibc_Applications_Perm_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Ibc_Applications_Perm_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'setPermissionedRelayers'.
  func makeSetPermissionedRelayersInterceptors() -> [ClientInterceptor<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>]
}

internal enum Ibc_Applications_Perm_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ibc.applications.perm.v1.Msg",
    methods: [
      Ibc_Applications_Perm_V1_MsgClientMetadata.Methods.setPermissionedRelayers,
    ]
  )

  internal enum Methods {
    internal static let setPermissionedRelayers = GRPCMethodDescriptor(
      name: "SetPermissionedRelayers",
      path: "/ibc.applications.perm.v1.Msg/SetPermissionedRelayers",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the ibc/perm Msg service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Ibc_Applications_Perm_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Ibc_Applications_Perm_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetPermissionedRelayers defines a rpc handler method for MsgSetPermissionedRelayers.
  func setPermissionedRelayers(request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, context: StatusOnlyCallContext) -> EventLoopFuture<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>
}

extension Ibc_Applications_Perm_V1_MsgProvider {
  internal var serviceName: Substring {
    return Ibc_Applications_Perm_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetPermissionedRelayers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>(),
        interceptors: self.interceptors?.makeSetPermissionedRelayersInterceptors() ?? [],
        userFunction: self.setPermissionedRelayers(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the ibc/perm Msg service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Ibc_Applications_Perm_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Ibc_Applications_Perm_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetPermissionedRelayers defines a rpc handler method for MsgSetPermissionedRelayers.
  @Sendable func setPermissionedRelayers(
    request: Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers,
    context: GRPCAsyncServerCallContext
  ) async throws -> Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Ibc_Applications_Perm_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Ibc_Applications_Perm_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Ibc_Applications_Perm_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Ibc_Applications_Perm_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetPermissionedRelayers":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers>(),
        responseSerializer: ProtobufSerializer<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>(),
        interceptors: self.interceptors?.makeSetPermissionedRelayersInterceptors() ?? [],
        wrapping: self.setPermissionedRelayers(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Ibc_Applications_Perm_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setPermissionedRelayers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetPermissionedRelayersInterceptors() -> [ServerInterceptor<Ibc_Applications_Perm_V1_MsgSetPermissionedRelayers, Ibc_Applications_Perm_V1_MsgSetPermissionedRelayersResponse>]
}

internal enum Ibc_Applications_Perm_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "ibc.applications.perm.v1.Msg",
    methods: [
      Ibc_Applications_Perm_V1_MsgServerMetadata.Methods.setPermissionedRelayers,
    ]
  )

  internal enum Methods {
    internal static let setPermissionedRelayers = GRPCMethodDescriptor(
      name: "SetPermissionedRelayers",
      path: "/ibc.applications.perm.v1.Msg/SetPermissionedRelayers",
      type: GRPCCallType.unary
    )
  }
}
