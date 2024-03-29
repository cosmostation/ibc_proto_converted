//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmos/reflection/v1/reflection.proto
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


/// Package cosmos.reflection.v1 provides support for inspecting protobuf
/// file descriptors.
///
/// Usage: instantiate `Cosmos_Reflection_V1_ReflectionServiceClient`, then call methods of this protocol to make API calls.
internal protocol Cosmos_Reflection_V1_ReflectionServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? { get }

  func fileDescriptors(
    _ request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse>
}

extension Cosmos_Reflection_V1_ReflectionServiceClientProtocol {
  internal var serviceName: String {
    return "cosmos.reflection.v1.ReflectionService"
  }

  /// FileDescriptors queries all the file descriptors in the app in order
  /// to enable easier generation of dynamic clients.
  ///
  /// - Parameters:
  ///   - request: Request to send to FileDescriptors.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func fileDescriptors(
    _ request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse> {
    return self.makeUnaryCall(
      path: Cosmos_Reflection_V1_ReflectionServiceClientMetadata.Methods.fileDescriptors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFileDescriptorsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Cosmos_Reflection_V1_ReflectionServiceClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Cosmos_Reflection_V1_ReflectionServiceNIOClient")
internal final class Cosmos_Reflection_V1_ReflectionServiceClient: Cosmos_Reflection_V1_ReflectionServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the cosmos.reflection.v1.ReflectionService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Cosmos_Reflection_V1_ReflectionServiceNIOClient: Cosmos_Reflection_V1_ReflectionServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmos.reflection.v1.ReflectionService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Package cosmos.reflection.v1 provides support for inspecting protobuf
/// file descriptors.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Reflection_V1_ReflectionServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? { get }

  func makeFileDescriptorsCall(
    _ request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Reflection_V1_ReflectionServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Reflection_V1_ReflectionServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeFileDescriptorsCall(
    _ request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse> {
    return self.makeAsyncUnaryCall(
      path: Cosmos_Reflection_V1_ReflectionServiceClientMetadata.Methods.fileDescriptors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFileDescriptorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Reflection_V1_ReflectionServiceAsyncClientProtocol {
  internal func fileDescriptors(
    _ request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Cosmos_Reflection_V1_FileDescriptorsResponse {
    return try await self.performAsyncUnaryCall(
      path: Cosmos_Reflection_V1_ReflectionServiceClientMetadata.Methods.fileDescriptors.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFileDescriptorsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Cosmos_Reflection_V1_ReflectionServiceAsyncClient: Cosmos_Reflection_V1_ReflectionServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Cosmos_Reflection_V1_ReflectionServiceClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'fileDescriptors'.
  func makeFileDescriptorsInterceptors() -> [ClientInterceptor<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse>]
}

internal enum Cosmos_Reflection_V1_ReflectionServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "ReflectionService",
    fullName: "cosmos.reflection.v1.ReflectionService",
    methods: [
      Cosmos_Reflection_V1_ReflectionServiceClientMetadata.Methods.fileDescriptors,
    ]
  )

  internal enum Methods {
    internal static let fileDescriptors = GRPCMethodDescriptor(
      name: "FileDescriptors",
      path: "/cosmos.reflection.v1.ReflectionService/FileDescriptors",
      type: GRPCCallType.unary
    )
  }
}

/// Package cosmos.reflection.v1 provides support for inspecting protobuf
/// file descriptors.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmos_Reflection_V1_ReflectionServiceProvider: CallHandlerProvider {
  var interceptors: Cosmos_Reflection_V1_ReflectionServiceServerInterceptorFactoryProtocol? { get }

  /// FileDescriptors queries all the file descriptors in the app in order
  /// to enable easier generation of dynamic clients.
  func fileDescriptors(request: Cosmos_Reflection_V1_FileDescriptorsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Reflection_V1_FileDescriptorsResponse>
}

extension Cosmos_Reflection_V1_ReflectionServiceProvider {
  internal var serviceName: Substring {
    return Cosmos_Reflection_V1_ReflectionServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "FileDescriptors":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Reflection_V1_FileDescriptorsRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Reflection_V1_FileDescriptorsResponse>(),
        interceptors: self.interceptors?.makeFileDescriptorsInterceptors() ?? [],
        userFunction: self.fileDescriptors(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Package cosmos.reflection.v1 provides support for inspecting protobuf
/// file descriptors.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Cosmos_Reflection_V1_ReflectionServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Cosmos_Reflection_V1_ReflectionServiceServerInterceptorFactoryProtocol? { get }

  /// FileDescriptors queries all the file descriptors in the app in order
  /// to enable easier generation of dynamic clients.
  @Sendable func fileDescriptors(
    request: Cosmos_Reflection_V1_FileDescriptorsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Cosmos_Reflection_V1_FileDescriptorsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Cosmos_Reflection_V1_ReflectionServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Cosmos_Reflection_V1_ReflectionServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Cosmos_Reflection_V1_ReflectionServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Cosmos_Reflection_V1_ReflectionServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "FileDescriptors":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Reflection_V1_FileDescriptorsRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Reflection_V1_FileDescriptorsResponse>(),
        interceptors: self.interceptors?.makeFileDescriptorsInterceptors() ?? [],
        wrapping: self.fileDescriptors(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmos_Reflection_V1_ReflectionServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'fileDescriptors'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFileDescriptorsInterceptors() -> [ServerInterceptor<Cosmos_Reflection_V1_FileDescriptorsRequest, Cosmos_Reflection_V1_FileDescriptorsResponse>]
}

internal enum Cosmos_Reflection_V1_ReflectionServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "ReflectionService",
    fullName: "cosmos.reflection.v1.ReflectionService",
    methods: [
      Cosmos_Reflection_V1_ReflectionServiceServerMetadata.Methods.fileDescriptors,
    ]
  )

  internal enum Methods {
    internal static let fileDescriptors = GRPCMethodDescriptor(
      name: "FileDescriptors",
      path: "/cosmos.reflection.v1.ReflectionService/FileDescriptors",
      type: GRPCCallType.unary
    )
  }
}
