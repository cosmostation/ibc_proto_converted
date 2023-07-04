//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: comdex/asset/v1beta1/tx.proto
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
/// Usage: instantiate `Comdex_Asset_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Comdex_Asset_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func addAsset(
    _ request: Comdex_Asset_V1beta1_MsgAddAsset,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse>
}

extension Comdex_Asset_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "comdex.asset.v1beta1.Msg"
  }

  /// AddAsset defines a method for adding new asset in asset module
  ///
  /// - Parameters:
  ///   - request: Request to send to AddAsset.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addAsset(
    _ request: Comdex_Asset_V1beta1_MsgAddAsset,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse> {
    return self.makeUnaryCall(
      path: Comdex_Asset_V1beta1_MsgClientMetadata.Methods.addAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAssetInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Comdex_Asset_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Comdex_Asset_V1beta1_MsgNIOClient")
internal final class Comdex_Asset_V1beta1_MsgClient: Comdex_Asset_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the comdex.asset.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Comdex_Asset_V1beta1_MsgNIOClient: Comdex_Asset_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the comdex.asset.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Comdex_Asset_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeAddAssetCall(
    _ request: Comdex_Asset_V1beta1_MsgAddAsset,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Asset_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Asset_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeAddAssetCall(
    _ request: Comdex_Asset_V1beta1_MsgAddAsset,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse> {
    return self.makeAsyncUnaryCall(
      path: Comdex_Asset_V1beta1_MsgClientMetadata.Methods.addAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAssetInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Asset_V1beta1_MsgAsyncClientProtocol {
  internal func addAsset(
    _ request: Comdex_Asset_V1beta1_MsgAddAsset,
    callOptions: CallOptions? = nil
  ) async throws -> Comdex_Asset_V1beta1_MsgAddAssetResponse {
    return try await self.performAsyncUnaryCall(
      path: Comdex_Asset_V1beta1_MsgClientMetadata.Methods.addAsset.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddAssetInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Comdex_Asset_V1beta1_MsgAsyncClient: Comdex_Asset_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Comdex_Asset_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'addAsset'.
  func makeAddAssetInterceptors() -> [ClientInterceptor<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse>]
}

internal enum Comdex_Asset_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "comdex.asset.v1beta1.Msg",
    methods: [
      Comdex_Asset_V1beta1_MsgClientMetadata.Methods.addAsset,
    ]
  )

  internal enum Methods {
    internal static let addAsset = GRPCMethodDescriptor(
      name: "AddAsset",
      path: "/comdex.asset.v1beta1.Msg/AddAsset",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Comdex_Asset_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Comdex_Asset_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// AddAsset defines a method for adding new asset in asset module
  func addAsset(request: Comdex_Asset_V1beta1_MsgAddAsset, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Asset_V1beta1_MsgAddAssetResponse>
}

extension Comdex_Asset_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Comdex_Asset_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddAsset":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Asset_V1beta1_MsgAddAsset>(),
        responseSerializer: ProtobufSerializer<Comdex_Asset_V1beta1_MsgAddAssetResponse>(),
        interceptors: self.interceptors?.makeAddAssetInterceptors() ?? [],
        userFunction: self.addAsset(request:context:)
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
internal protocol Comdex_Asset_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Comdex_Asset_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// AddAsset defines a method for adding new asset in asset module
  @Sendable func addAsset(
    request: Comdex_Asset_V1beta1_MsgAddAsset,
    context: GRPCAsyncServerCallContext
  ) async throws -> Comdex_Asset_V1beta1_MsgAddAssetResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Comdex_Asset_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Comdex_Asset_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Comdex_Asset_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Comdex_Asset_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AddAsset":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Asset_V1beta1_MsgAddAsset>(),
        responseSerializer: ProtobufSerializer<Comdex_Asset_V1beta1_MsgAddAssetResponse>(),
        interceptors: self.interceptors?.makeAddAssetInterceptors() ?? [],
        wrapping: self.addAsset(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Comdex_Asset_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'addAsset'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddAssetInterceptors() -> [ServerInterceptor<Comdex_Asset_V1beta1_MsgAddAsset, Comdex_Asset_V1beta1_MsgAddAssetResponse>]
}

internal enum Comdex_Asset_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "comdex.asset.v1beta1.Msg",
    methods: [
      Comdex_Asset_V1beta1_MsgServerMetadata.Methods.addAsset,
    ]
  )

  internal enum Methods {
    internal static let addAsset = GRPCMethodDescriptor(
      name: "AddAsset",
      path: "/comdex.asset.v1beta1.Msg/AddAsset",
      type: GRPCCallType.unary
    )
  }
}