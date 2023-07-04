//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: shentu/cvm/v1alpha1/query.proto
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


/// Usage: instantiate `Shentu_Cvm_V1alpha1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Shentu_Cvm_V1alpha1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func code(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>

  func abi(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>

  func storage(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>

  func addressMeta(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>

  func meta(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>

  func account(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>

  func view(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>
}

extension Shentu_Cvm_V1alpha1_QueryClientProtocol {
  internal var serviceName: String {
    return "shentu.cvm.v1alpha1.Query"
  }

  /// Unary call to Code
  ///
  /// - Parameters:
  ///   - request: Request to send to Code.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func code(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.code.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodeInterceptors() ?? []
    )
  }

  /// Unary call to Abi
  ///
  /// - Parameters:
  ///   - request: Request to send to Abi.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func abi(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.abi.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAbiInterceptors() ?? []
    )
  }

  /// Unary call to Storage
  ///
  /// - Parameters:
  ///   - request: Request to send to Storage.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func storage(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.storage.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStorageInterceptors() ?? []
    )
  }

  /// Unary call to AddressMeta
  ///
  /// - Parameters:
  ///   - request: Request to send to AddressMeta.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addressMeta(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.addressMeta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? []
    )
  }

  /// Unary call to Meta
  ///
  /// - Parameters:
  ///   - request: Request to send to Meta.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func meta(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.meta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMetaInterceptors() ?? []
    )
  }

  /// Unary call to Account
  ///
  /// - Parameters:
  ///   - request: Request to send to Account.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func account(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.account.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountInterceptors() ?? []
    )
  }

  /// Unary call to View
  ///
  /// - Parameters:
  ///   - request: Request to send to View.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func view(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse> {
    return self.makeUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.view.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeViewInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Shentu_Cvm_V1alpha1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Shentu_Cvm_V1alpha1_QueryNIOClient")
internal final class Shentu_Cvm_V1alpha1_QueryClient: Shentu_Cvm_V1alpha1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the shentu.cvm.v1alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Shentu_Cvm_V1alpha1_QueryNIOClient: Shentu_Cvm_V1alpha1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the shentu.cvm.v1alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Cvm_V1alpha1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func makeCodeCall(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>

  func makeAbiCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>

  func makeStorageCall(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>

  func makeAddressMetaCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>

  func makeMetaCall(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>

  func makeAccountCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>

  func makeViewCall(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Cvm_V1alpha1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCodeCall(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.code.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodeInterceptors() ?? []
    )
  }

  internal func makeAbiCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.abi.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAbiInterceptors() ?? []
    )
  }

  internal func makeStorageCall(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.storage.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStorageInterceptors() ?? []
    )
  }

  internal func makeAddressMetaCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.addressMeta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? []
    )
  }

  internal func makeMetaCall(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.meta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMetaInterceptors() ?? []
    )
  }

  internal func makeAccountCall(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.account.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountInterceptors() ?? []
    )
  }

  internal func makeViewCall(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.view.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeViewInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_QueryAsyncClientProtocol {
  internal func code(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryCodeResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.code.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodeInterceptors() ?? []
    )
  }

  internal func abi(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryAbiResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.abi.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAbiInterceptors() ?? []
    )
  }

  internal func storage(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryStorageResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.storage.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStorageInterceptors() ?? []
    )
  }

  internal func addressMeta(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryAddressMetaResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.addressMeta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? []
    )
  }

  internal func meta(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryMetaResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.meta.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMetaInterceptors() ?? []
    )
  }

  internal func account(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Acm_Account {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.account.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountInterceptors() ?? []
    )
  }

  internal func view(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Cvm_V1alpha1_QueryViewResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.view.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeViewInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Shentu_Cvm_V1alpha1_QueryAsyncClient: Shentu_Cvm_V1alpha1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'code'.
  func makeCodeInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when invoking 'abi'.
  func makeAbiInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>]

  /// - Returns: Interceptors to use when invoking 'storage'.
  func makeStorageInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>]

  /// - Returns: Interceptors to use when invoking 'addressMeta'.
  func makeAddressMetaInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>]

  /// - Returns: Interceptors to use when invoking 'meta'.
  func makeMetaInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>]

  /// - Returns: Interceptors to use when invoking 'account'.
  func makeAccountInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>]

  /// - Returns: Interceptors to use when invoking 'view'.
  func makeViewInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>]
}

internal enum Shentu_Cvm_V1alpha1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "shentu.cvm.v1alpha1.Query",
    methods: [
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.code,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.abi,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.storage,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.addressMeta,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.meta,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.account,
      Shentu_Cvm_V1alpha1_QueryClientMetadata.Methods.view,
    ]
  )

  internal enum Methods {
    internal static let code = GRPCMethodDescriptor(
      name: "Code",
      path: "/shentu.cvm.v1alpha1.Query/Code",
      type: GRPCCallType.unary
    )

    internal static let abi = GRPCMethodDescriptor(
      name: "Abi",
      path: "/shentu.cvm.v1alpha1.Query/Abi",
      type: GRPCCallType.unary
    )

    internal static let storage = GRPCMethodDescriptor(
      name: "Storage",
      path: "/shentu.cvm.v1alpha1.Query/Storage",
      type: GRPCCallType.unary
    )

    internal static let addressMeta = GRPCMethodDescriptor(
      name: "AddressMeta",
      path: "/shentu.cvm.v1alpha1.Query/AddressMeta",
      type: GRPCCallType.unary
    )

    internal static let meta = GRPCMethodDescriptor(
      name: "Meta",
      path: "/shentu.cvm.v1alpha1.Query/Meta",
      type: GRPCCallType.unary
    )

    internal static let account = GRPCMethodDescriptor(
      name: "Account",
      path: "/shentu.cvm.v1alpha1.Query/Account",
      type: GRPCCallType.unary
    )

    internal static let view = GRPCMethodDescriptor(
      name: "View",
      path: "/shentu.cvm.v1alpha1.Query/View",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Shentu_Cvm_V1alpha1_QueryProvider: CallHandlerProvider {
  var interceptors: Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol? { get }

  func code(request: Shentu_Cvm_V1alpha1_QueryCodeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryCodeResponse>

  func abi(request: Shentu_Cvm_V1alpha1_QueryAbiRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryAbiResponse>

  func storage(request: Shentu_Cvm_V1alpha1_QueryStorageRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryStorageResponse>

  func addressMeta(request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>

  func meta(request: Shentu_Cvm_V1alpha1_QueryMetaRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryMetaResponse>

  func account(request: Shentu_Cvm_V1alpha1_QueryAccountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Acm_Account>

  func view(request: Shentu_Cvm_V1alpha1_QueryViewRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryViewResponse>
}

extension Shentu_Cvm_V1alpha1_QueryProvider {
  internal var serviceName: Substring {
    return Shentu_Cvm_V1alpha1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Code":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryCodeRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryCodeResponse>(),
        interceptors: self.interceptors?.makeCodeInterceptors() ?? [],
        userFunction: self.code(request:context:)
      )

    case "Abi":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAbiRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAbiResponse>(),
        interceptors: self.interceptors?.makeAbiInterceptors() ?? [],
        userFunction: self.abi(request:context:)
      )

    case "Storage":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryStorageRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryStorageResponse>(),
        interceptors: self.interceptors?.makeStorageInterceptors() ?? [],
        userFunction: self.storage(request:context:)
      )

    case "AddressMeta":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>(),
        interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? [],
        userFunction: self.addressMeta(request:context:)
      )

    case "Meta":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryMetaResponse>(),
        interceptors: self.interceptors?.makeMetaInterceptors() ?? [],
        userFunction: self.meta(request:context:)
      )

    case "Account":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAccountRequest>(),
        responseSerializer: ProtobufSerializer<Acm_Account>(),
        interceptors: self.interceptors?.makeAccountInterceptors() ?? [],
        userFunction: self.account(request:context:)
      )

    case "View":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryViewRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryViewResponse>(),
        interceptors: self.interceptors?.makeViewInterceptors() ?? [],
        userFunction: self.view(request:context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Cvm_V1alpha1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol? { get }

  @Sendable func code(
    request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryCodeResponse

  @Sendable func abi(
    request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryAbiResponse

  @Sendable func storage(
    request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryStorageResponse

  @Sendable func addressMeta(
    request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryAddressMetaResponse

  @Sendable func meta(
    request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryMetaResponse

  @Sendable func account(
    request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Acm_Account

  @Sendable func view(
    request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Cvm_V1alpha1_QueryViewResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Cvm_V1alpha1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Cvm_V1alpha1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Shentu_Cvm_V1alpha1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Code":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryCodeRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryCodeResponse>(),
        interceptors: self.interceptors?.makeCodeInterceptors() ?? [],
        wrapping: self.code(request:context:)
      )

    case "Abi":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAbiRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAbiResponse>(),
        interceptors: self.interceptors?.makeAbiInterceptors() ?? [],
        wrapping: self.abi(request:context:)
      )

    case "Storage":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryStorageRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryStorageResponse>(),
        interceptors: self.interceptors?.makeStorageInterceptors() ?? [],
        wrapping: self.storage(request:context:)
      )

    case "AddressMeta":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>(),
        interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? [],
        wrapping: self.addressMeta(request:context:)
      )

    case "Meta":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryMetaResponse>(),
        interceptors: self.interceptors?.makeMetaInterceptors() ?? [],
        wrapping: self.meta(request:context:)
      )

    case "Account":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAccountRequest>(),
        responseSerializer: ProtobufSerializer<Acm_Account>(),
        interceptors: self.interceptors?.makeAccountInterceptors() ?? [],
        wrapping: self.account(request:context:)
      )

    case "View":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryViewRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryViewResponse>(),
        interceptors: self.interceptors?.makeViewInterceptors() ?? [],
        wrapping: self.view(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'code'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCodeInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when handling 'abi'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAbiInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>]

  /// - Returns: Interceptors to use when handling 'storage'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStorageInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>]

  /// - Returns: Interceptors to use when handling 'addressMeta'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddressMetaInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>]

  /// - Returns: Interceptors to use when handling 'meta'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMetaInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>]

  /// - Returns: Interceptors to use when handling 'account'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>]

  /// - Returns: Interceptors to use when handling 'view'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeViewInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>]
}

internal enum Shentu_Cvm_V1alpha1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "shentu.cvm.v1alpha1.Query",
    methods: [
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.code,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.abi,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.storage,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.addressMeta,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.meta,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.account,
      Shentu_Cvm_V1alpha1_QueryServerMetadata.Methods.view,
    ]
  )

  internal enum Methods {
    internal static let code = GRPCMethodDescriptor(
      name: "Code",
      path: "/shentu.cvm.v1alpha1.Query/Code",
      type: GRPCCallType.unary
    )

    internal static let abi = GRPCMethodDescriptor(
      name: "Abi",
      path: "/shentu.cvm.v1alpha1.Query/Abi",
      type: GRPCCallType.unary
    )

    internal static let storage = GRPCMethodDescriptor(
      name: "Storage",
      path: "/shentu.cvm.v1alpha1.Query/Storage",
      type: GRPCCallType.unary
    )

    internal static let addressMeta = GRPCMethodDescriptor(
      name: "AddressMeta",
      path: "/shentu.cvm.v1alpha1.Query/AddressMeta",
      type: GRPCCallType.unary
    )

    internal static let meta = GRPCMethodDescriptor(
      name: "Meta",
      path: "/shentu.cvm.v1alpha1.Query/Meta",
      type: GRPCCallType.unary
    )

    internal static let account = GRPCMethodDescriptor(
      name: "Account",
      path: "/shentu.cvm.v1alpha1.Query/Account",
      type: GRPCCallType.unary
    )

    internal static let view = GRPCMethodDescriptor(
      name: "View",
      path: "/shentu.cvm.v1alpha1.Query/View",
      type: GRPCCallType.unary
    )
  }
}