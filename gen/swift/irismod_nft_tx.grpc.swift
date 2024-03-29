//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: irismod/nft/tx.proto
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


/// Msg defines the nft Msg service.
///
/// Usage: instantiate `Irismod_Nft_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Irismod_Nft_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? { get }

  func issueDenom(
    _ request: Irismod_Nft_MsgIssueDenom,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse>

  func mintNFT(
    _ request: Irismod_Nft_MsgMintNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse>

  func editNFT(
    _ request: Irismod_Nft_MsgEditNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse>

  func transferNFT(
    _ request: Irismod_Nft_MsgTransferNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse>

  func burnNFT(
    _ request: Irismod_Nft_MsgBurnNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse>

  func transferDenom(
    _ request: Irismod_Nft_MsgTransferDenom,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse>
}

extension Irismod_Nft_MsgClientProtocol {
  internal var serviceName: String {
    return "irismod.nft.Msg"
  }

  /// IssueDenom defines a method for issue a denom.
  ///
  /// - Parameters:
  ///   - request: Request to send to IssueDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func issueDenom(
    _ request: Irismod_Nft_MsgIssueDenom,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.issueDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? []
    )
  }

  /// MintNFT defines a method for mint a new nft
  ///
  /// - Parameters:
  ///   - request: Request to send to MintNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func mintNFT(
    _ request: Irismod_Nft_MsgMintNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.mintNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintNFTInterceptors() ?? []
    )
  }

  /// RefundHTLC defines a method for editing a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to EditNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func editNFT(
    _ request: Irismod_Nft_MsgEditNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.editNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditNFTInterceptors() ?? []
    )
  }

  /// TransferNFT defines a method for transferring a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to TransferNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func transferNFT(
    _ request: Irismod_Nft_MsgTransferNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? []
    )
  }

  /// BurnNFT defines a method for burning a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to BurnNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func burnNFT(
    _ request: Irismod_Nft_MsgBurnNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.burnNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? []
    )
  }

  /// TransferDenom defines a method for transferring a denom.
  ///
  /// - Parameters:
  ///   - request: Request to send to TransferDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func transferDenom(
    _ request: Irismod_Nft_MsgTransferDenom,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse> {
    return self.makeUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferDenomInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Irismod_Nft_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Irismod_Nft_MsgNIOClient")
internal final class Irismod_Nft_MsgClient: Irismod_Nft_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the irismod.nft.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Irismod_Nft_MsgNIOClient: Irismod_Nft_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the irismod.nft.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the nft Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Nft_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? { get }

  func makeIssueDenomCall(
    _ request: Irismod_Nft_MsgIssueDenom,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse>

  func makeMintNftCall(
    _ request: Irismod_Nft_MsgMintNFT,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse>

  func makeEditNftCall(
    _ request: Irismod_Nft_MsgEditNFT,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse>

  func makeTransferNftCall(
    _ request: Irismod_Nft_MsgTransferNFT,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse>

  func makeBurnNftCall(
    _ request: Irismod_Nft_MsgBurnNFT,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse>

  func makeTransferDenomCall(
    _ request: Irismod_Nft_MsgTransferDenom,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Nft_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Nft_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeIssueDenomCall(
    _ request: Irismod_Nft_MsgIssueDenom,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.issueDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? []
    )
  }

  internal func makeMintNftCall(
    _ request: Irismod_Nft_MsgMintNFT,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.mintNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintNFTInterceptors() ?? []
    )
  }

  internal func makeEditNftCall(
    _ request: Irismod_Nft_MsgEditNFT,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.editNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditNFTInterceptors() ?? []
    )
  }

  internal func makeTransferNftCall(
    _ request: Irismod_Nft_MsgTransferNFT,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? []
    )
  }

  internal func makeBurnNftCall(
    _ request: Irismod_Nft_MsgBurnNFT,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.burnNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? []
    )
  }

  internal func makeTransferDenomCall(
    _ request: Irismod_Nft_MsgTransferDenom,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse> {
    return self.makeAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferDenomInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Nft_MsgAsyncClientProtocol {
  internal func issueDenom(
    _ request: Irismod_Nft_MsgIssueDenom,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgIssueDenomResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.issueDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? []
    )
  }

  internal func mintNFT(
    _ request: Irismod_Nft_MsgMintNFT,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgMintNFTResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.mintNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintNFTInterceptors() ?? []
    )
  }

  internal func editNFT(
    _ request: Irismod_Nft_MsgEditNFT,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgEditNFTResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.editNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditNFTInterceptors() ?? []
    )
  }

  internal func transferNFT(
    _ request: Irismod_Nft_MsgTransferNFT,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgTransferNFTResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? []
    )
  }

  internal func burnNFT(
    _ request: Irismod_Nft_MsgBurnNFT,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgBurnNFTResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.burnNFT.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? []
    )
  }

  internal func transferDenom(
    _ request: Irismod_Nft_MsgTransferDenom,
    callOptions: CallOptions? = nil
  ) async throws -> Irismod_Nft_MsgTransferDenomResponse {
    return try await self.performAsyncUnaryCall(
      path: Irismod_Nft_MsgClientMetadata.Methods.transferDenom.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferDenomInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Irismod_Nft_MsgAsyncClient: Irismod_Nft_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Nft_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Irismod_Nft_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'issueDenom'.
  func makeIssueDenomInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'mintNFT'.
  func makeMintNFTInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'editNFT'.
  func makeEditNFTInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'transferNFT'.
  func makeTransferNFTInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'burnNFT'.
  func makeBurnNFTInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'transferDenom'.
  func makeTransferDenomInterceptors() -> [ClientInterceptor<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse>]
}

internal enum Irismod_Nft_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irismod.nft.Msg",
    methods: [
      Irismod_Nft_MsgClientMetadata.Methods.issueDenom,
      Irismod_Nft_MsgClientMetadata.Methods.mintNFT,
      Irismod_Nft_MsgClientMetadata.Methods.editNFT,
      Irismod_Nft_MsgClientMetadata.Methods.transferNFT,
      Irismod_Nft_MsgClientMetadata.Methods.burnNFT,
      Irismod_Nft_MsgClientMetadata.Methods.transferDenom,
    ]
  )

  internal enum Methods {
    internal static let issueDenom = GRPCMethodDescriptor(
      name: "IssueDenom",
      path: "/irismod.nft.Msg/IssueDenom",
      type: GRPCCallType.unary
    )

    internal static let mintNFT = GRPCMethodDescriptor(
      name: "MintNFT",
      path: "/irismod.nft.Msg/MintNFT",
      type: GRPCCallType.unary
    )

    internal static let editNFT = GRPCMethodDescriptor(
      name: "EditNFT",
      path: "/irismod.nft.Msg/EditNFT",
      type: GRPCCallType.unary
    )

    internal static let transferNFT = GRPCMethodDescriptor(
      name: "TransferNFT",
      path: "/irismod.nft.Msg/TransferNFT",
      type: GRPCCallType.unary
    )

    internal static let burnNFT = GRPCMethodDescriptor(
      name: "BurnNFT",
      path: "/irismod.nft.Msg/BurnNFT",
      type: GRPCCallType.unary
    )

    internal static let transferDenom = GRPCMethodDescriptor(
      name: "TransferDenom",
      path: "/irismod.nft.Msg/TransferDenom",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the nft Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irismod_Nft_MsgProvider: CallHandlerProvider {
  var interceptors: Irismod_Nft_MsgServerInterceptorFactoryProtocol? { get }

  /// IssueDenom defines a method for issue a denom.
  func issueDenom(request: Irismod_Nft_MsgIssueDenom, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgIssueDenomResponse>

  /// MintNFT defines a method for mint a new nft
  func mintNFT(request: Irismod_Nft_MsgMintNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgMintNFTResponse>

  /// RefundHTLC defines a method for editing a nft.
  func editNFT(request: Irismod_Nft_MsgEditNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgEditNFTResponse>

  /// TransferNFT defines a method for transferring a nft.
  func transferNFT(request: Irismod_Nft_MsgTransferNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgTransferNFTResponse>

  /// BurnNFT defines a method for burning a nft.
  func burnNFT(request: Irismod_Nft_MsgBurnNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgBurnNFTResponse>

  /// TransferDenom defines a method for transferring a denom.
  func transferDenom(request: Irismod_Nft_MsgTransferDenom, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Nft_MsgTransferDenomResponse>
}

extension Irismod_Nft_MsgProvider {
  internal var serviceName: Substring {
    return Irismod_Nft_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "IssueDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgIssueDenom>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgIssueDenomResponse>(),
        interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? [],
        userFunction: self.issueDenom(request:context:)
      )

    case "MintNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgMintNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgMintNFTResponse>(),
        interceptors: self.interceptors?.makeMintNFTInterceptors() ?? [],
        userFunction: self.mintNFT(request:context:)
      )

    case "EditNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgEditNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgEditNFTResponse>(),
        interceptors: self.interceptors?.makeEditNFTInterceptors() ?? [],
        userFunction: self.editNFT(request:context:)
      )

    case "TransferNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgTransferNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgTransferNFTResponse>(),
        interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? [],
        userFunction: self.transferNFT(request:context:)
      )

    case "BurnNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgBurnNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgBurnNFTResponse>(),
        interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? [],
        userFunction: self.burnNFT(request:context:)
      )

    case "TransferDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgTransferDenom>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgTransferDenomResponse>(),
        interceptors: self.interceptors?.makeTransferDenomInterceptors() ?? [],
        userFunction: self.transferDenom(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the nft Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Irismod_Nft_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Irismod_Nft_MsgServerInterceptorFactoryProtocol? { get }

  /// IssueDenom defines a method for issue a denom.
  @Sendable func issueDenom(
    request: Irismod_Nft_MsgIssueDenom,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgIssueDenomResponse

  /// MintNFT defines a method for mint a new nft
  @Sendable func mintNFT(
    request: Irismod_Nft_MsgMintNFT,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgMintNFTResponse

  /// RefundHTLC defines a method for editing a nft.
  @Sendable func editNFT(
    request: Irismod_Nft_MsgEditNFT,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgEditNFTResponse

  /// TransferNFT defines a method for transferring a nft.
  @Sendable func transferNFT(
    request: Irismod_Nft_MsgTransferNFT,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgTransferNFTResponse

  /// BurnNFT defines a method for burning a nft.
  @Sendable func burnNFT(
    request: Irismod_Nft_MsgBurnNFT,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgBurnNFTResponse

  /// TransferDenom defines a method for transferring a denom.
  @Sendable func transferDenom(
    request: Irismod_Nft_MsgTransferDenom,
    context: GRPCAsyncServerCallContext
  ) async throws -> Irismod_Nft_MsgTransferDenomResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Irismod_Nft_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Irismod_Nft_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Irismod_Nft_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Irismod_Nft_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "IssueDenom":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgIssueDenom>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgIssueDenomResponse>(),
        interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? [],
        wrapping: self.issueDenom(request:context:)
      )

    case "MintNFT":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgMintNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgMintNFTResponse>(),
        interceptors: self.interceptors?.makeMintNFTInterceptors() ?? [],
        wrapping: self.mintNFT(request:context:)
      )

    case "EditNFT":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgEditNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgEditNFTResponse>(),
        interceptors: self.interceptors?.makeEditNFTInterceptors() ?? [],
        wrapping: self.editNFT(request:context:)
      )

    case "TransferNFT":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgTransferNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgTransferNFTResponse>(),
        interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? [],
        wrapping: self.transferNFT(request:context:)
      )

    case "BurnNFT":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgBurnNFT>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgBurnNFTResponse>(),
        interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? [],
        wrapping: self.burnNFT(request:context:)
      )

    case "TransferDenom":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Nft_MsgTransferDenom>(),
        responseSerializer: ProtobufSerializer<Irismod_Nft_MsgTransferDenomResponse>(),
        interceptors: self.interceptors?.makeTransferDenomInterceptors() ?? [],
        wrapping: self.transferDenom(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irismod_Nft_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'issueDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIssueDenomInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgIssueDenom, Irismod_Nft_MsgIssueDenomResponse>]

  /// - Returns: Interceptors to use when handling 'mintNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMintNFTInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgMintNFT, Irismod_Nft_MsgMintNFTResponse>]

  /// - Returns: Interceptors to use when handling 'editNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEditNFTInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgEditNFT, Irismod_Nft_MsgEditNFTResponse>]

  /// - Returns: Interceptors to use when handling 'transferNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTransferNFTInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgTransferNFT, Irismod_Nft_MsgTransferNFTResponse>]

  /// - Returns: Interceptors to use when handling 'burnNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBurnNFTInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgBurnNFT, Irismod_Nft_MsgBurnNFTResponse>]

  /// - Returns: Interceptors to use when handling 'transferDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTransferDenomInterceptors() -> [ServerInterceptor<Irismod_Nft_MsgTransferDenom, Irismod_Nft_MsgTransferDenomResponse>]
}

internal enum Irismod_Nft_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "irismod.nft.Msg",
    methods: [
      Irismod_Nft_MsgServerMetadata.Methods.issueDenom,
      Irismod_Nft_MsgServerMetadata.Methods.mintNFT,
      Irismod_Nft_MsgServerMetadata.Methods.editNFT,
      Irismod_Nft_MsgServerMetadata.Methods.transferNFT,
      Irismod_Nft_MsgServerMetadata.Methods.burnNFT,
      Irismod_Nft_MsgServerMetadata.Methods.transferDenom,
    ]
  )

  internal enum Methods {
    internal static let issueDenom = GRPCMethodDescriptor(
      name: "IssueDenom",
      path: "/irismod.nft.Msg/IssueDenom",
      type: GRPCCallType.unary
    )

    internal static let mintNFT = GRPCMethodDescriptor(
      name: "MintNFT",
      path: "/irismod.nft.Msg/MintNFT",
      type: GRPCCallType.unary
    )

    internal static let editNFT = GRPCMethodDescriptor(
      name: "EditNFT",
      path: "/irismod.nft.Msg/EditNFT",
      type: GRPCCallType.unary
    )

    internal static let transferNFT = GRPCMethodDescriptor(
      name: "TransferNFT",
      path: "/irismod.nft.Msg/TransferNFT",
      type: GRPCCallType.unary
    )

    internal static let burnNFT = GRPCMethodDescriptor(
      name: "BurnNFT",
      path: "/irismod.nft.Msg/BurnNFT",
      type: GRPCCallType.unary
    )

    internal static let transferDenom = GRPCMethodDescriptor(
      name: "TransferDenom",
      path: "/irismod.nft.Msg/TransferDenom",
      type: GRPCCallType.unary
    )
  }
}
