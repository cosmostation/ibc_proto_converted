//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cryptoorg/nft/v1/query.proto
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


/// Query defines the gRPC querier service for NFT module
///
/// Usage: instantiate `Chainmain_Nft_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Chainmain_Nft_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? { get }

  func supply(
    _ request: Chainmain_Nft_V1_QuerySupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse>

  func owner(
    _ request: Chainmain_Nft_V1_QueryOwnerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse>

  func collection(
    _ request: Chainmain_Nft_V1_QueryCollectionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse>

  func denom(
    _ request: Chainmain_Nft_V1_QueryDenomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse>

  func denomByName(
    _ request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse>

  func denoms(
    _ request: Chainmain_Nft_V1_QueryDenomsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse>

  func nFT(
    _ request: Chainmain_Nft_V1_QueryNFTRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse>
}

extension Chainmain_Nft_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "chainmain.nft.v1.Query"
  }

  /// Supply queries the total supply of a given denom or owner
  ///
  /// - Parameters:
  ///   - request: Request to send to Supply.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func supply(
    _ request: Chainmain_Nft_V1_QuerySupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.supply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplyInterceptors() ?? []
    )
  }

  /// Owner queries the NFTs of the specified owner
  ///
  /// - Parameters:
  ///   - request: Request to send to Owner.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func owner(
    _ request: Chainmain_Nft_V1_QueryOwnerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.owner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOwnerInterceptors() ?? []
    )
  }

  /// Collection queries the NFTs of the specified denom
  ///
  /// - Parameters:
  ///   - request: Request to send to Collection.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func collection(
    _ request: Chainmain_Nft_V1_QueryCollectionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.collection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCollectionInterceptors() ?? []
    )
  }

  /// Denom queries the definition of a given denom
  ///
  /// - Parameters:
  ///   - request: Request to send to Denom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denom(
    _ request: Chainmain_Nft_V1_QueryDenomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomInterceptors() ?? []
    )
  }

  /// DenomByName queries the definition of a given denom by name
  ///
  /// - Parameters:
  ///   - request: Request to send to DenomByName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denomByName(
    _ request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denomByName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? []
    )
  }

  /// Denoms queries all the denoms
  ///
  /// - Parameters:
  ///   - request: Request to send to Denoms.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denoms(
    _ request: Chainmain_Nft_V1_QueryDenomsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsInterceptors() ?? []
    )
  }

  /// NFT queries the NFT for the given denom and token ID
  ///
  /// - Parameters:
  ///   - request: Request to send to NFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func nFT(
    _ request: Chainmain_Nft_V1_QueryNFTRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse> {
    return self.makeUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.nFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Chainmain_Nft_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Chainmain_Nft_V1_QueryNIOClient")
internal final class Chainmain_Nft_V1_QueryClient: Chainmain_Nft_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the chainmain.nft.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Chainmain_Nft_V1_QueryNIOClient: Chainmain_Nft_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the chainmain.nft.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for NFT module
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Chainmain_Nft_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeSupplyCall(
    _ request: Chainmain_Nft_V1_QuerySupplyRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse>

  func makeOwnerCall(
    _ request: Chainmain_Nft_V1_QueryOwnerRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse>

  func makeCollectionCall(
    _ request: Chainmain_Nft_V1_QueryCollectionRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse>

  func makeDenomCall(
    _ request: Chainmain_Nft_V1_QueryDenomRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse>

  func makeDenomByNameCall(
    _ request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse>

  func makeDenomsCall(
    _ request: Chainmain_Nft_V1_QueryDenomsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse>

  func makeNftCall(
    _ request: Chainmain_Nft_V1_QueryNFTRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Nft_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Chainmain_Nft_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeSupplyCall(
    _ request: Chainmain_Nft_V1_QuerySupplyRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.supply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplyInterceptors() ?? []
    )
  }

  internal func makeOwnerCall(
    _ request: Chainmain_Nft_V1_QueryOwnerRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.owner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOwnerInterceptors() ?? []
    )
  }

  internal func makeCollectionCall(
    _ request: Chainmain_Nft_V1_QueryCollectionRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.collection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCollectionInterceptors() ?? []
    )
  }

  internal func makeDenomCall(
    _ request: Chainmain_Nft_V1_QueryDenomRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomInterceptors() ?? []
    )
  }

  internal func makeDenomByNameCall(
    _ request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denomByName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? []
    )
  }

  internal func makeDenomsCall(
    _ request: Chainmain_Nft_V1_QueryDenomsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsInterceptors() ?? []
    )
  }

  internal func makeNftCall(
    _ request: Chainmain_Nft_V1_QueryNFTRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse> {
    return self.makeAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.nFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Nft_V1_QueryAsyncClientProtocol {
  internal func supply(
    _ request: Chainmain_Nft_V1_QuerySupplyRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QuerySupplyResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.supply.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplyInterceptors() ?? []
    )
  }

  internal func owner(
    _ request: Chainmain_Nft_V1_QueryOwnerRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryOwnerResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.owner.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOwnerInterceptors() ?? []
    )
  }

  internal func collection(
    _ request: Chainmain_Nft_V1_QueryCollectionRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryCollectionResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.collection.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCollectionInterceptors() ?? []
    )
  }

  internal func denom(
    _ request: Chainmain_Nft_V1_QueryDenomRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryDenomResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomInterceptors() ?? []
    )
  }

  internal func denomByName(
    _ request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryDenomByNameResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denomByName.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? []
    )
  }

  internal func denoms(
    _ request: Chainmain_Nft_V1_QueryDenomsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryDenomsResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.denoms.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsInterceptors() ?? []
    )
  }

  internal func nFT(
    _ request: Chainmain_Nft_V1_QueryNFTRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Chainmain_Nft_V1_QueryNFTResponse {
    return try await self.performAsyncUnaryCall(
      path: Chainmain_Nft_V1_QueryClientMetadata.Methods.nFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Chainmain_Nft_V1_QueryAsyncClient: Chainmain_Nft_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Chainmain_Nft_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'supply'.
  func makeSupplyInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'owner'.
  func makeOwnerInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when invoking 'collection'.
  func makeCollectionInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse>]

  /// - Returns: Interceptors to use when invoking 'denom'.
  func makeDenomInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'denomByName'.
  func makeDenomByNameInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse>]

  /// - Returns: Interceptors to use when invoking 'denoms'.
  func makeDenomsInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse>]

  /// - Returns: Interceptors to use when invoking 'nFT'.
  func makeNFTInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse>]
}

internal enum Chainmain_Nft_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "chainmain.nft.v1.Query",
    methods: [
      Chainmain_Nft_V1_QueryClientMetadata.Methods.supply,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.owner,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.collection,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.denom,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.denomByName,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.denoms,
      Chainmain_Nft_V1_QueryClientMetadata.Methods.nFT,
    ]
  )

  internal enum Methods {
    internal static let supply = GRPCMethodDescriptor(
      name: "Supply",
      path: "/chainmain.nft.v1.Query/Supply",
      type: GRPCCallType.unary
    )

    internal static let owner = GRPCMethodDescriptor(
      name: "Owner",
      path: "/chainmain.nft.v1.Query/Owner",
      type: GRPCCallType.unary
    )

    internal static let collection = GRPCMethodDescriptor(
      name: "Collection",
      path: "/chainmain.nft.v1.Query/Collection",
      type: GRPCCallType.unary
    )

    internal static let denom = GRPCMethodDescriptor(
      name: "Denom",
      path: "/chainmain.nft.v1.Query/Denom",
      type: GRPCCallType.unary
    )

    internal static let denomByName = GRPCMethodDescriptor(
      name: "DenomByName",
      path: "/chainmain.nft.v1.Query/DenomByName",
      type: GRPCCallType.unary
    )

    internal static let denoms = GRPCMethodDescriptor(
      name: "Denoms",
      path: "/chainmain.nft.v1.Query/Denoms",
      type: GRPCCallType.unary
    )

    internal static let nFT = GRPCMethodDescriptor(
      name: "NFT",
      path: "/chainmain.nft.v1.Query/NFT",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for NFT module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Chainmain_Nft_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Chainmain_Nft_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Supply queries the total supply of a given denom or owner
  func supply(request: Chainmain_Nft_V1_QuerySupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QuerySupplyResponse>

  /// Owner queries the NFTs of the specified owner
  func owner(request: Chainmain_Nft_V1_QueryOwnerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryOwnerResponse>

  /// Collection queries the NFTs of the specified denom
  func collection(request: Chainmain_Nft_V1_QueryCollectionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryCollectionResponse>

  /// Denom queries the definition of a given denom
  func denom(request: Chainmain_Nft_V1_QueryDenomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryDenomResponse>

  /// DenomByName queries the definition of a given denom by name
  func denomByName(request: Chainmain_Nft_V1_QueryDenomByNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryDenomByNameResponse>

  /// Denoms queries all the denoms
  func denoms(request: Chainmain_Nft_V1_QueryDenomsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryDenomsResponse>

  /// NFT queries the NFT for the given denom and token ID
  func nFT(request: Chainmain_Nft_V1_QueryNFTRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_QueryNFTResponse>
}

extension Chainmain_Nft_V1_QueryProvider {
  internal var serviceName: Substring {
    return Chainmain_Nft_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Supply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QuerySupplyRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QuerySupplyResponse>(),
        interceptors: self.interceptors?.makeSupplyInterceptors() ?? [],
        userFunction: self.supply(request:context:)
      )

    case "Owner":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryOwnerRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryOwnerResponse>(),
        interceptors: self.interceptors?.makeOwnerInterceptors() ?? [],
        userFunction: self.owner(request:context:)
      )

    case "Collection":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryCollectionRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryCollectionResponse>(),
        interceptors: self.interceptors?.makeCollectionInterceptors() ?? [],
        userFunction: self.collection(request:context:)
      )

    case "Denom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomResponse>(),
        interceptors: self.interceptors?.makeDenomInterceptors() ?? [],
        userFunction: self.denom(request:context:)
      )

    case "DenomByName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomByNameRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomByNameResponse>(),
        interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? [],
        userFunction: self.denomByName(request:context:)
      )

    case "Denoms":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomsRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomsResponse>(),
        interceptors: self.interceptors?.makeDenomsInterceptors() ?? [],
        userFunction: self.denoms(request:context:)
      )

    case "NFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryNFTRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryNFTResponse>(),
        interceptors: self.interceptors?.makeNFTInterceptors() ?? [],
        userFunction: self.nFT(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for NFT module
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Chainmain_Nft_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Chainmain_Nft_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Supply queries the total supply of a given denom or owner
  @Sendable func supply(
    request: Chainmain_Nft_V1_QuerySupplyRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QuerySupplyResponse

  /// Owner queries the NFTs of the specified owner
  @Sendable func owner(
    request: Chainmain_Nft_V1_QueryOwnerRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryOwnerResponse

  /// Collection queries the NFTs of the specified denom
  @Sendable func collection(
    request: Chainmain_Nft_V1_QueryCollectionRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryCollectionResponse

  /// Denom queries the definition of a given denom
  @Sendable func denom(
    request: Chainmain_Nft_V1_QueryDenomRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryDenomResponse

  /// DenomByName queries the definition of a given denom by name
  @Sendable func denomByName(
    request: Chainmain_Nft_V1_QueryDenomByNameRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryDenomByNameResponse

  /// Denoms queries all the denoms
  @Sendable func denoms(
    request: Chainmain_Nft_V1_QueryDenomsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryDenomsResponse

  /// NFT queries the NFT for the given denom and token ID
  @Sendable func nFT(
    request: Chainmain_Nft_V1_QueryNFTRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Chainmain_Nft_V1_QueryNFTResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Chainmain_Nft_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Chainmain_Nft_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Chainmain_Nft_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Chainmain_Nft_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Supply":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QuerySupplyRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QuerySupplyResponse>(),
        interceptors: self.interceptors?.makeSupplyInterceptors() ?? [],
        wrapping: self.supply(request:context:)
      )

    case "Owner":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryOwnerRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryOwnerResponse>(),
        interceptors: self.interceptors?.makeOwnerInterceptors() ?? [],
        wrapping: self.owner(request:context:)
      )

    case "Collection":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryCollectionRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryCollectionResponse>(),
        interceptors: self.interceptors?.makeCollectionInterceptors() ?? [],
        wrapping: self.collection(request:context:)
      )

    case "Denom":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomResponse>(),
        interceptors: self.interceptors?.makeDenomInterceptors() ?? [],
        wrapping: self.denom(request:context:)
      )

    case "DenomByName":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomByNameRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomByNameResponse>(),
        interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? [],
        wrapping: self.denomByName(request:context:)
      )

    case "Denoms":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryDenomsRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryDenomsResponse>(),
        interceptors: self.interceptors?.makeDenomsInterceptors() ?? [],
        wrapping: self.denoms(request:context:)
      )

    case "NFT":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_QueryNFTRequest>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_QueryNFTResponse>(),
        interceptors: self.interceptors?.makeNFTInterceptors() ?? [],
        wrapping: self.nFT(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Chainmain_Nft_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'supply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSupplyInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QuerySupplyRequest, Chainmain_Nft_V1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when handling 'owner'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeOwnerInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryOwnerRequest, Chainmain_Nft_V1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when handling 'collection'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCollectionInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryCollectionRequest, Chainmain_Nft_V1_QueryCollectionResponse>]

  /// - Returns: Interceptors to use when handling 'denom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryDenomRequest, Chainmain_Nft_V1_QueryDenomResponse>]

  /// - Returns: Interceptors to use when handling 'denomByName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomByNameInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryDenomByNameRequest, Chainmain_Nft_V1_QueryDenomByNameResponse>]

  /// - Returns: Interceptors to use when handling 'denoms'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomsInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryDenomsRequest, Chainmain_Nft_V1_QueryDenomsResponse>]

  /// - Returns: Interceptors to use when handling 'nFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNFTInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_QueryNFTRequest, Chainmain_Nft_V1_QueryNFTResponse>]
}

internal enum Chainmain_Nft_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "chainmain.nft.v1.Query",
    methods: [
      Chainmain_Nft_V1_QueryServerMetadata.Methods.supply,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.owner,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.collection,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.denom,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.denomByName,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.denoms,
      Chainmain_Nft_V1_QueryServerMetadata.Methods.nFT,
    ]
  )

  internal enum Methods {
    internal static let supply = GRPCMethodDescriptor(
      name: "Supply",
      path: "/chainmain.nft.v1.Query/Supply",
      type: GRPCCallType.unary
    )

    internal static let owner = GRPCMethodDescriptor(
      name: "Owner",
      path: "/chainmain.nft.v1.Query/Owner",
      type: GRPCCallType.unary
    )

    internal static let collection = GRPCMethodDescriptor(
      name: "Collection",
      path: "/chainmain.nft.v1.Query/Collection",
      type: GRPCCallType.unary
    )

    internal static let denom = GRPCMethodDescriptor(
      name: "Denom",
      path: "/chainmain.nft.v1.Query/Denom",
      type: GRPCCallType.unary
    )

    internal static let denomByName = GRPCMethodDescriptor(
      name: "DenomByName",
      path: "/chainmain.nft.v1.Query/DenomByName",
      type: GRPCCallType.unary
    )

    internal static let denoms = GRPCMethodDescriptor(
      name: "Denoms",
      path: "/chainmain.nft.v1.Query/Denoms",
      type: GRPCCallType.unary
    )

    internal static let nFT = GRPCMethodDescriptor(
      name: "NFT",
      path: "/chainmain.nft.v1.Query/NFT",
      type: GRPCCallType.unary
    )
  }
}
