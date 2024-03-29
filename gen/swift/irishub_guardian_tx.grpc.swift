//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: irishub/guardian/tx.proto
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


/// Msg defines the guardian Msg service
///
/// Usage: instantiate `Irishub_Guardian_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Irishub_Guardian_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? { get }

  func addSuper(
    _ request: Irishub_Guardian_MsgAddSuper,
    callOptions: CallOptions?
  ) -> UnaryCall<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse>

  func deleteSuper(
    _ request: Irishub_Guardian_MsgDeleteSuper,
    callOptions: CallOptions?
  ) -> UnaryCall<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse>
}

extension Irishub_Guardian_MsgClientProtocol {
  internal var serviceName: String {
    return "irishub.guardian.Msg"
  }

  /// AddSuper defines a method for adding a super account
  ///
  /// - Parameters:
  ///   - request: Request to send to AddSuper.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addSuper(
    _ request: Irishub_Guardian_MsgAddSuper,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse> {
    return self.makeUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.addSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddSuperInterceptors() ?? []
    )
  }

  /// DeleteSuper defines a method for deleting a super account
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteSuper.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteSuper(
    _ request: Irishub_Guardian_MsgDeleteSuper,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse> {
    return self.makeUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.deleteSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteSuperInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Irishub_Guardian_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Irishub_Guardian_MsgNIOClient")
internal final class Irishub_Guardian_MsgClient: Irishub_Guardian_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the irishub.guardian.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Irishub_Guardian_MsgNIOClient: Irishub_Guardian_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the irishub.guardian.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the guardian Msg service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irishub_Guardian_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? { get }

  func makeAddSuperCall(
    _ request: Irishub_Guardian_MsgAddSuper,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse>

  func makeDeleteSuperCall(
    _ request: Irishub_Guardian_MsgDeleteSuper,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irishub_Guardian_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irishub_Guardian_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAddSuperCall(
    _ request: Irishub_Guardian_MsgAddSuper,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse> {
    return self.makeAsyncUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.addSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddSuperInterceptors() ?? []
    )
  }

  internal func makeDeleteSuperCall(
    _ request: Irishub_Guardian_MsgDeleteSuper,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse> {
    return self.makeAsyncUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.deleteSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteSuperInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irishub_Guardian_MsgAsyncClientProtocol {
  internal func addSuper(
    _ request: Irishub_Guardian_MsgAddSuper,
    callOptions: CallOptions? = nil
  ) async throws -> Irishub_Guardian_MsgAddSuperResponse {
    return try await self.performAsyncUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.addSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddSuperInterceptors() ?? []
    )
  }

  internal func deleteSuper(
    _ request: Irishub_Guardian_MsgDeleteSuper,
    callOptions: CallOptions? = nil
  ) async throws -> Irishub_Guardian_MsgDeleteSuperResponse {
    return try await self.performAsyncUnaryCall(
      path: Irishub_Guardian_MsgClientMetadata.Methods.deleteSuper.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteSuperInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Irishub_Guardian_MsgAsyncClient: Irishub_Guardian_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irishub_Guardian_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Irishub_Guardian_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'addSuper'.
  func makeAddSuperInterceptors() -> [ClientInterceptor<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteSuper'.
  func makeDeleteSuperInterceptors() -> [ClientInterceptor<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse>]
}

internal enum Irishub_Guardian_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irishub.guardian.Msg",
    methods: [
      Irishub_Guardian_MsgClientMetadata.Methods.addSuper,
      Irishub_Guardian_MsgClientMetadata.Methods.deleteSuper,
    ]
  )

  internal enum Methods {
    internal static let addSuper = GRPCMethodDescriptor(
      name: "AddSuper",
      path: "/irishub.guardian.Msg/AddSuper",
      type: GRPCCallType.unary
    )

    internal static let deleteSuper = GRPCMethodDescriptor(
      name: "DeleteSuper",
      path: "/irishub.guardian.Msg/DeleteSuper",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the guardian Msg service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irishub_Guardian_MsgProvider: CallHandlerProvider {
  var interceptors: Irishub_Guardian_MsgServerInterceptorFactoryProtocol? { get }

  /// AddSuper defines a method for adding a super account
  func addSuper(request: Irishub_Guardian_MsgAddSuper, context: StatusOnlyCallContext) -> EventLoopFuture<Irishub_Guardian_MsgAddSuperResponse>

  /// DeleteSuper defines a method for deleting a super account
  func deleteSuper(request: Irishub_Guardian_MsgDeleteSuper, context: StatusOnlyCallContext) -> EventLoopFuture<Irishub_Guardian_MsgDeleteSuperResponse>
}

extension Irishub_Guardian_MsgProvider {
  internal var serviceName: Substring {
    return Irishub_Guardian_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddSuper":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irishub_Guardian_MsgAddSuper>(),
        responseSerializer: ProtobufSerializer<Irishub_Guardian_MsgAddSuperResponse>(),
        interceptors: self.interceptors?.makeAddSuperInterceptors() ?? [],
        userFunction: self.addSuper(request:context:)
      )

    case "DeleteSuper":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irishub_Guardian_MsgDeleteSuper>(),
        responseSerializer: ProtobufSerializer<Irishub_Guardian_MsgDeleteSuperResponse>(),
        interceptors: self.interceptors?.makeDeleteSuperInterceptors() ?? [],
        userFunction: self.deleteSuper(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the guardian Msg service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irishub_Guardian_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irishub_Guardian_MsgServerInterceptorFactoryProtocol? { get }

  /// AddSuper defines a method for adding a super account
  @Sendable func addSuper(
    request: Irishub_Guardian_MsgAddSuper,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irishub_Guardian_MsgAddSuperResponse

  /// DeleteSuper defines a method for deleting a super account
  @Sendable func deleteSuper(
    request: Irishub_Guardian_MsgDeleteSuper,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irishub_Guardian_MsgDeleteSuperResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irishub_Guardian_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irishub_Guardian_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Irishub_Guardian_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Irishub_Guardian_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddSuper":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irishub_Guardian_MsgAddSuper>(),
        responseSerializer: ProtobufSerializer<Irishub_Guardian_MsgAddSuperResponse>(),
        interceptors: self.interceptors?.makeAddSuperInterceptors() ?? [],
        wrapping: self.addSuper(request:context:)
      )

    case "DeleteSuper":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irishub_Guardian_MsgDeleteSuper>(),
        responseSerializer: ProtobufSerializer<Irishub_Guardian_MsgDeleteSuperResponse>(),
        interceptors: self.interceptors?.makeDeleteSuperInterceptors() ?? [],
        wrapping: self.deleteSuper(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irishub_Guardian_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'addSuper'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddSuperInterceptors() -> [ServerInterceptor<Irishub_Guardian_MsgAddSuper, Irishub_Guardian_MsgAddSuperResponse>]

  /// - Returns: Interceptors to use when handling 'deleteSuper'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteSuperInterceptors() -> [ServerInterceptor<Irishub_Guardian_MsgDeleteSuper, Irishub_Guardian_MsgDeleteSuperResponse>]
}

internal enum Irishub_Guardian_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irishub.guardian.Msg",
    methods: [
      Irishub_Guardian_MsgServerMetadata.Methods.addSuper,
      Irishub_Guardian_MsgServerMetadata.Methods.deleteSuper,
    ]
  )

  internal enum Methods {
    internal static let addSuper = GRPCMethodDescriptor(
      name: "AddSuper",
      path: "/irishub.guardian.Msg/AddSuper",
      type: GRPCCallType.unary
    )

    internal static let deleteSuper = GRPCMethodDescriptor(
      name: "DeleteSuper",
      path: "/irishub.guardian.Msg/DeleteSuper",
      type: GRPCCallType.unary
    )
  }
}
