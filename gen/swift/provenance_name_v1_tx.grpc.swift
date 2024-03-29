//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: provenance/name/v1/tx.proto
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


/// Msg defines the bank Msg service.
///
/// Usage: instantiate `Provenance_Name_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Provenance_Name_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? { get }

  func bindName(
    _ request: Provenance_Name_V1_MsgBindNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse>

  func deleteName(
    _ request: Provenance_Name_V1_MsgDeleteNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse>

  func modifyName(
    _ request: Provenance_Name_V1_MsgModifyNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse>

  func createRootName(
    _ request: Provenance_Name_V1_MsgCreateRootNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse>
}

extension Provenance_Name_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "provenance.name.v1.Msg"
  }

  /// BindName binds a name to an address under a root name.
  ///
  /// - Parameters:
  ///   - request: Request to send to BindName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bindName(
    _ request: Provenance_Name_V1_MsgBindNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.bindName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBindNameInterceptors() ?? []
    )
  }

  /// DeleteName defines a method to verify a particular invariance.
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteName(
    _ request: Provenance_Name_V1_MsgDeleteNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.deleteName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteNameInterceptors() ?? []
    )
  }

  /// ModifyName defines a method to modify the attributes of an existing name.
  ///
  /// - Parameters:
  ///   - request: Request to send to ModifyName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func modifyName(
    _ request: Provenance_Name_V1_MsgModifyNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.modifyName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModifyNameInterceptors() ?? []
    )
  }

  /// CreateRootName defines a governance method for creating a root name.
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateRootName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createRootName(
    _ request: Provenance_Name_V1_MsgCreateRootNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse> {
    return self.makeUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.createRootName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRootNameInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Provenance_Name_V1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Provenance_Name_V1_MsgNIOClient")
internal final class Provenance_Name_V1_MsgClient: Provenance_Name_V1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the provenance.name.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Provenance_Name_V1_MsgNIOClient: Provenance_Name_V1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the provenance.name.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the bank Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Name_V1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? { get }

  func makeBindNameCall(
    _ request: Provenance_Name_V1_MsgBindNameRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse>

  func makeDeleteNameCall(
    _ request: Provenance_Name_V1_MsgDeleteNameRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse>

  func makeModifyNameCall(
    _ request: Provenance_Name_V1_MsgModifyNameRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse>

  func makeCreateRootNameCall(
    _ request: Provenance_Name_V1_MsgCreateRootNameRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Name_V1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeBindNameCall(
    _ request: Provenance_Name_V1_MsgBindNameRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.bindName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBindNameInterceptors() ?? []
    )
  }

  internal func makeDeleteNameCall(
    _ request: Provenance_Name_V1_MsgDeleteNameRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.deleteName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteNameInterceptors() ?? []
    )
  }

  internal func makeModifyNameCall(
    _ request: Provenance_Name_V1_MsgModifyNameRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.modifyName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModifyNameInterceptors() ?? []
    )
  }

  internal func makeCreateRootNameCall(
    _ request: Provenance_Name_V1_MsgCreateRootNameRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse> {
    return self.makeAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.createRootName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRootNameInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_MsgAsyncClientProtocol {
  internal func bindName(
    _ request: Provenance_Name_V1_MsgBindNameRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_MsgBindNameResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.bindName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBindNameInterceptors() ?? []
    )
  }

  internal func deleteName(
    _ request: Provenance_Name_V1_MsgDeleteNameRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_MsgDeleteNameResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.deleteName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteNameInterceptors() ?? []
    )
  }

  internal func modifyName(
    _ request: Provenance_Name_V1_MsgModifyNameRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_MsgModifyNameResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.modifyName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModifyNameInterceptors() ?? []
    )
  }

  internal func createRootName(
    _ request: Provenance_Name_V1_MsgCreateRootNameRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Provenance_Name_V1_MsgCreateRootNameResponse {
    return try await self.performAsyncUnaryCall(
      path: Provenance_Name_V1_MsgClientMetadata.Methods.createRootName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRootNameInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Provenance_Name_V1_MsgAsyncClient: Provenance_Name_V1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Provenance_Name_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Provenance_Name_V1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'bindName'.
  func makeBindNameInterceptors() -> [ClientInterceptor<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteName'.
  func makeDeleteNameInterceptors() -> [ClientInterceptor<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse>]

  /// - Returns: Interceptors to use when invoking 'modifyName'.
  func makeModifyNameInterceptors() -> [ClientInterceptor<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse>]

  /// - Returns: Interceptors to use when invoking 'createRootName'.
  func makeCreateRootNameInterceptors() -> [ClientInterceptor<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse>]
}

internal enum Provenance_Name_V1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.name.v1.Msg",
    methods: [
      Provenance_Name_V1_MsgClientMetadata.Methods.bindName,
      Provenance_Name_V1_MsgClientMetadata.Methods.deleteName,
      Provenance_Name_V1_MsgClientMetadata.Methods.modifyName,
      Provenance_Name_V1_MsgClientMetadata.Methods.createRootName,
    ]
  )

  internal enum Methods {
    internal static let bindName = GRPCMethodDescriptor(
      name: "BindName",
      path: "/provenance.name.v1.Msg/BindName",
      type: GRPCCallType.unary
    )

    internal static let deleteName = GRPCMethodDescriptor(
      name: "DeleteName",
      path: "/provenance.name.v1.Msg/DeleteName",
      type: GRPCCallType.unary
    )

    internal static let modifyName = GRPCMethodDescriptor(
      name: "ModifyName",
      path: "/provenance.name.v1.Msg/ModifyName",
      type: GRPCCallType.unary
    )

    internal static let createRootName = GRPCMethodDescriptor(
      name: "CreateRootName",
      path: "/provenance.name.v1.Msg/CreateRootName",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the bank Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Provenance_Name_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Provenance_Name_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// BindName binds a name to an address under a root name.
  func bindName(request: Provenance_Name_V1_MsgBindNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_MsgBindNameResponse>

  /// DeleteName defines a method to verify a particular invariance.
  func deleteName(request: Provenance_Name_V1_MsgDeleteNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_MsgDeleteNameResponse>

  /// ModifyName defines a method to modify the attributes of an existing name.
  func modifyName(request: Provenance_Name_V1_MsgModifyNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_MsgModifyNameResponse>

  /// CreateRootName defines a governance method for creating a root name.
  func createRootName(request: Provenance_Name_V1_MsgCreateRootNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Provenance_Name_V1_MsgCreateRootNameResponse>
}

extension Provenance_Name_V1_MsgProvider {
  internal var serviceName: Substring {
    return Provenance_Name_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "BindName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgBindNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgBindNameResponse>(),
        interceptors: self.interceptors?.makeBindNameInterceptors() ?? [],
        userFunction: self.bindName(request:context:)
      )

    case "DeleteName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgDeleteNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgDeleteNameResponse>(),
        interceptors: self.interceptors?.makeDeleteNameInterceptors() ?? [],
        userFunction: self.deleteName(request:context:)
      )

    case "ModifyName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgModifyNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgModifyNameResponse>(),
        interceptors: self.interceptors?.makeModifyNameInterceptors() ?? [],
        userFunction: self.modifyName(request:context:)
      )

    case "CreateRootName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgCreateRootNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgCreateRootNameResponse>(),
        interceptors: self.interceptors?.makeCreateRootNameInterceptors() ?? [],
        userFunction: self.createRootName(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the bank Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Provenance_Name_V1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Provenance_Name_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// BindName binds a name to an address under a root name.
  @Sendable func bindName(
    request: Provenance_Name_V1_MsgBindNameRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_MsgBindNameResponse

  /// DeleteName defines a method to verify a particular invariance.
  @Sendable func deleteName(
    request: Provenance_Name_V1_MsgDeleteNameRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_MsgDeleteNameResponse

  /// ModifyName defines a method to modify the attributes of an existing name.
  @Sendable func modifyName(
    request: Provenance_Name_V1_MsgModifyNameRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_MsgModifyNameResponse

  /// CreateRootName defines a governance method for creating a root name.
  @Sendable func createRootName(
    request: Provenance_Name_V1_MsgCreateRootNameRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Provenance_Name_V1_MsgCreateRootNameResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Provenance_Name_V1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Provenance_Name_V1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Provenance_Name_V1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Provenance_Name_V1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "BindName":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgBindNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgBindNameResponse>(),
        interceptors: self.interceptors?.makeBindNameInterceptors() ?? [],
        wrapping: self.bindName(request:context:)
      )

    case "DeleteName":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgDeleteNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgDeleteNameResponse>(),
        interceptors: self.interceptors?.makeDeleteNameInterceptors() ?? [],
        wrapping: self.deleteName(request:context:)
      )

    case "ModifyName":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgModifyNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgModifyNameResponse>(),
        interceptors: self.interceptors?.makeModifyNameInterceptors() ?? [],
        wrapping: self.modifyName(request:context:)
      )

    case "CreateRootName":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Provenance_Name_V1_MsgCreateRootNameRequest>(),
        responseSerializer: ProtobufSerializer<Provenance_Name_V1_MsgCreateRootNameResponse>(),
        interceptors: self.interceptors?.makeCreateRootNameInterceptors() ?? [],
        wrapping: self.createRootName(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Provenance_Name_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'bindName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBindNameInterceptors() -> [ServerInterceptor<Provenance_Name_V1_MsgBindNameRequest, Provenance_Name_V1_MsgBindNameResponse>]

  /// - Returns: Interceptors to use when handling 'deleteName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteNameInterceptors() -> [ServerInterceptor<Provenance_Name_V1_MsgDeleteNameRequest, Provenance_Name_V1_MsgDeleteNameResponse>]

  /// - Returns: Interceptors to use when handling 'modifyName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeModifyNameInterceptors() -> [ServerInterceptor<Provenance_Name_V1_MsgModifyNameRequest, Provenance_Name_V1_MsgModifyNameResponse>]

  /// - Returns: Interceptors to use when handling 'createRootName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateRootNameInterceptors() -> [ServerInterceptor<Provenance_Name_V1_MsgCreateRootNameRequest, Provenance_Name_V1_MsgCreateRootNameResponse>]
}

internal enum Provenance_Name_V1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "provenance.name.v1.Msg",
    methods: [
      Provenance_Name_V1_MsgServerMetadata.Methods.bindName,
      Provenance_Name_V1_MsgServerMetadata.Methods.deleteName,
      Provenance_Name_V1_MsgServerMetadata.Methods.modifyName,
      Provenance_Name_V1_MsgServerMetadata.Methods.createRootName,
    ]
  )

  internal enum Methods {
    internal static let bindName = GRPCMethodDescriptor(
      name: "BindName",
      path: "/provenance.name.v1.Msg/BindName",
      type: GRPCCallType.unary
    )

    internal static let deleteName = GRPCMethodDescriptor(
      name: "DeleteName",
      path: "/provenance.name.v1.Msg/DeleteName",
      type: GRPCCallType.unary
    )

    internal static let modifyName = GRPCMethodDescriptor(
      name: "ModifyName",
      path: "/provenance.name.v1.Msg/ModifyName",
      type: GRPCCallType.unary
    )

    internal static let createRootName = GRPCMethodDescriptor(
      name: "CreateRootName",
      path: "/provenance.name.v1.Msg/CreateRootName",
      type: GRPCCallType.unary
    )
  }
}
