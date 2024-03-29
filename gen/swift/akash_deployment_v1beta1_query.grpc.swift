//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: akash/deployment/v1beta1/query.proto
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


/// Query defines the gRPC querier service
///
/// Usage: instantiate `Akash_Deployment_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Akash_Deployment_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func deployments(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse>

  func deployment(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse>

  func group(
    _ request: Akash_Deployment_V1beta1_QueryGroupRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse>
}

extension Akash_Deployment_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "akash.deployment.v1beta1.Query"
  }

  /// Deployments queries deployments
  ///
  /// - Parameters:
  ///   - request: Request to send to Deployments.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deployments(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse> {
    return self.makeUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployments.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentsInterceptors() ?? []
    )
  }

  /// Deployment queries deployment details
  ///
  /// - Parameters:
  ///   - request: Request to send to Deployment.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deployment(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse> {
    return self.makeUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentInterceptors() ?? []
    )
  }

  /// Group queries group details
  ///
  /// - Parameters:
  ///   - request: Request to send to Group.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func group(
    _ request: Akash_Deployment_V1beta1_QueryGroupRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse> {
    return self.makeUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.group.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Akash_Deployment_V1beta1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Akash_Deployment_V1beta1_QueryNIOClient")
internal final class Akash_Deployment_V1beta1_QueryClient: Akash_Deployment_V1beta1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the akash.deployment.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Akash_Deployment_V1beta1_QueryNIOClient: Akash_Deployment_V1beta1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the akash.deployment.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Akash_Deployment_V1beta1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func makeDeploymentsCall(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse>

  func makeDeploymentCall(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse>

  func makeGroupCall(
    _ request: Akash_Deployment_V1beta1_QueryGroupRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Deployment_V1beta1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Akash_Deployment_V1beta1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeDeploymentsCall(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse> {
    return self.makeAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployments.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentsInterceptors() ?? []
    )
  }

  internal func makeDeploymentCall(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse> {
    return self.makeAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentInterceptors() ?? []
    )
  }

  internal func makeGroupCall(
    _ request: Akash_Deployment_V1beta1_QueryGroupRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse> {
    return self.makeAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.group.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Deployment_V1beta1_QueryAsyncClientProtocol {
  internal func deployments(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Akash_Deployment_V1beta1_QueryDeploymentsResponse {
    return try await self.performAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployments.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentsInterceptors() ?? []
    )
  }

  internal func deployment(
    _ request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Akash_Deployment_V1beta1_QueryDeploymentResponse {
    return try await self.performAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeploymentInterceptors() ?? []
    )
  }

  internal func group(
    _ request: Akash_Deployment_V1beta1_QueryGroupRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Akash_Deployment_V1beta1_QueryGroupResponse {
    return try await self.performAsyncUnaryCall(
      path: Akash_Deployment_V1beta1_QueryClientMetadata.Methods.group.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Akash_Deployment_V1beta1_QueryAsyncClient: Akash_Deployment_V1beta1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Akash_Deployment_V1beta1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'deployments'.
  func makeDeploymentsInterceptors() -> [ClientInterceptor<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse>]

  /// - Returns: Interceptors to use when invoking 'deployment'.
  func makeDeploymentInterceptors() -> [ClientInterceptor<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse>]

  /// - Returns: Interceptors to use when invoking 'group'.
  func makeGroupInterceptors() -> [ClientInterceptor<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse>]
}

internal enum Akash_Deployment_V1beta1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "akash.deployment.v1beta1.Query",
    methods: [
      Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployments,
      Akash_Deployment_V1beta1_QueryClientMetadata.Methods.deployment,
      Akash_Deployment_V1beta1_QueryClientMetadata.Methods.group,
    ]
  )

  internal enum Methods {
    internal static let deployments = GRPCMethodDescriptor(
      name: "Deployments",
      path: "/akash.deployment.v1beta1.Query/Deployments",
      type: GRPCCallType.unary
    )

    internal static let deployment = GRPCMethodDescriptor(
      name: "Deployment",
      path: "/akash.deployment.v1beta1.Query/Deployment",
      type: GRPCCallType.unary
    )

    internal static let group = GRPCMethodDescriptor(
      name: "Group",
      path: "/akash.deployment.v1beta1.Query/Group",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Akash_Deployment_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Akash_Deployment_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Deployments queries deployments
  func deployments(request: Akash_Deployment_V1beta1_QueryDeploymentsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Akash_Deployment_V1beta1_QueryDeploymentsResponse>

  /// Deployment queries deployment details
  func deployment(request: Akash_Deployment_V1beta1_QueryDeploymentRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Akash_Deployment_V1beta1_QueryDeploymentResponse>

  /// Group queries group details
  func group(request: Akash_Deployment_V1beta1_QueryGroupRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Akash_Deployment_V1beta1_QueryGroupResponse>
}

extension Akash_Deployment_V1beta1_QueryProvider {
  internal var serviceName: Substring {
    return Akash_Deployment_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deployments":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryDeploymentsRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryDeploymentsResponse>(),
        interceptors: self.interceptors?.makeDeploymentsInterceptors() ?? [],
        userFunction: self.deployments(request:context:)
      )

    case "Deployment":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryDeploymentRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryDeploymentResponse>(),
        interceptors: self.interceptors?.makeDeploymentInterceptors() ?? [],
        userFunction: self.deployment(request:context:)
      )

    case "Group":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryGroupRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryGroupResponse>(),
        interceptors: self.interceptors?.makeGroupInterceptors() ?? [],
        userFunction: self.group(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Akash_Deployment_V1beta1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Akash_Deployment_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Deployments queries deployments
  @Sendable func deployments(
    request: Akash_Deployment_V1beta1_QueryDeploymentsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Akash_Deployment_V1beta1_QueryDeploymentsResponse

  /// Deployment queries deployment details
  @Sendable func deployment(
    request: Akash_Deployment_V1beta1_QueryDeploymentRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Akash_Deployment_V1beta1_QueryDeploymentResponse

  /// Group queries group details
  @Sendable func group(
    request: Akash_Deployment_V1beta1_QueryGroupRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Akash_Deployment_V1beta1_QueryGroupResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Akash_Deployment_V1beta1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Akash_Deployment_V1beta1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Akash_Deployment_V1beta1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Akash_Deployment_V1beta1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deployments":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryDeploymentsRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryDeploymentsResponse>(),
        interceptors: self.interceptors?.makeDeploymentsInterceptors() ?? [],
        wrapping: self.deployments(request:context:)
      )

    case "Deployment":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryDeploymentRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryDeploymentResponse>(),
        interceptors: self.interceptors?.makeDeploymentInterceptors() ?? [],
        wrapping: self.deployment(request:context:)
      )

    case "Group":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Akash_Deployment_V1beta1_QueryGroupRequest>(),
        responseSerializer: ProtobufSerializer<Akash_Deployment_V1beta1_QueryGroupResponse>(),
        interceptors: self.interceptors?.makeGroupInterceptors() ?? [],
        wrapping: self.group(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Akash_Deployment_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'deployments'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeploymentsInterceptors() -> [ServerInterceptor<Akash_Deployment_V1beta1_QueryDeploymentsRequest, Akash_Deployment_V1beta1_QueryDeploymentsResponse>]

  /// - Returns: Interceptors to use when handling 'deployment'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeploymentInterceptors() -> [ServerInterceptor<Akash_Deployment_V1beta1_QueryDeploymentRequest, Akash_Deployment_V1beta1_QueryDeploymentResponse>]

  /// - Returns: Interceptors to use when handling 'group'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupInterceptors() -> [ServerInterceptor<Akash_Deployment_V1beta1_QueryGroupRequest, Akash_Deployment_V1beta1_QueryGroupResponse>]
}

internal enum Akash_Deployment_V1beta1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "akash.deployment.v1beta1.Query",
    methods: [
      Akash_Deployment_V1beta1_QueryServerMetadata.Methods.deployments,
      Akash_Deployment_V1beta1_QueryServerMetadata.Methods.deployment,
      Akash_Deployment_V1beta1_QueryServerMetadata.Methods.group,
    ]
  )

  internal enum Methods {
    internal static let deployments = GRPCMethodDescriptor(
      name: "Deployments",
      path: "/akash.deployment.v1beta1.Query/Deployments",
      type: GRPCCallType.unary
    )

    internal static let deployment = GRPCMethodDescriptor(
      name: "Deployment",
      path: "/akash.deployment.v1beta1.Query/Deployment",
      type: GRPCCallType.unary
    )

    internal static let group = GRPCMethodDescriptor(
      name: "Group",
      path: "/akash.deployment.v1beta1.Query/Group",
      type: GRPCCallType.unary
    )
  }
}
