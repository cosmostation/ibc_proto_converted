//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/hard/v1beta1/tx.proto
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


/// Msg defines the hard Msg service.
///
/// Usage: instantiate `Kava_Hard_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Hard_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func deposit(
    _ request: Kava_Hard_V1beta1_MsgDeposit,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse>

  func withdraw(
    _ request: Kava_Hard_V1beta1_MsgWithdraw,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse>

  func borrow(
    _ request: Kava_Hard_V1beta1_MsgBorrow,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse>

  func repay(
    _ request: Kava_Hard_V1beta1_MsgRepay,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse>

  func liquidate(
    _ request: Kava_Hard_V1beta1_MsgLiquidate,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse>
}

extension Kava_Hard_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kava.hard.v1beta1.Msg"
  }

  /// Deposit defines a method for depositing funds to hard liquidity pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to Deposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deposit(
    _ request: Kava_Hard_V1beta1_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse> {
    return self.makeUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  /// Withdraw defines a method for withdrawing funds from hard liquidity pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to Withdraw.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdraw(
    _ request: Kava_Hard_V1beta1_MsgWithdraw,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse> {
    return self.makeUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.withdraw.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawInterceptors() ?? []
    )
  }

  /// Borrow defines a method for borrowing funds from hard liquidity pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to Borrow.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func borrow(
    _ request: Kava_Hard_V1beta1_MsgBorrow,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse> {
    return self.makeUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.borrow.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBorrowInterceptors() ?? []
    )
  }

  /// Repay defines a method for repaying funds borrowed from hard liquidity pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to Repay.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func repay(
    _ request: Kava_Hard_V1beta1_MsgRepay,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse> {
    return self.makeUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.repay.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRepayInterceptors() ?? []
    )
  }

  /// Liquidate defines a method for attempting to liquidate a borrower that is over their loan-to-value.
  ///
  /// - Parameters:
  ///   - request: Request to send to Liquidate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func liquidate(
    _ request: Kava_Hard_V1beta1_MsgLiquidate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse> {
    return self.makeUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.liquidate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLiquidateInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Kava_Hard_V1beta1_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Kava_Hard_V1beta1_MsgNIOClient")
internal final class Kava_Hard_V1beta1_MsgClient: Kava_Hard_V1beta1_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the kava.hard.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Kava_Hard_V1beta1_MsgNIOClient: Kava_Hard_V1beta1_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.hard.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the hard Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kava_Hard_V1beta1_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func makeDepositCall(
    _ request: Kava_Hard_V1beta1_MsgDeposit,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse>

  func makeWithdrawCall(
    _ request: Kava_Hard_V1beta1_MsgWithdraw,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse>

  func makeBorrowCall(
    _ request: Kava_Hard_V1beta1_MsgBorrow,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse>

  func makeRepayCall(
    _ request: Kava_Hard_V1beta1_MsgRepay,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse>

  func makeLiquidateCall(
    _ request: Kava_Hard_V1beta1_MsgLiquidate,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Hard_V1beta1_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Hard_V1beta1_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeDepositCall(
    _ request: Kava_Hard_V1beta1_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  internal func makeWithdrawCall(
    _ request: Kava_Hard_V1beta1_MsgWithdraw,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.withdraw.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawInterceptors() ?? []
    )
  }

  internal func makeBorrowCall(
    _ request: Kava_Hard_V1beta1_MsgBorrow,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.borrow.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBorrowInterceptors() ?? []
    )
  }

  internal func makeRepayCall(
    _ request: Kava_Hard_V1beta1_MsgRepay,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.repay.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRepayInterceptors() ?? []
    )
  }

  internal func makeLiquidateCall(
    _ request: Kava_Hard_V1beta1_MsgLiquidate,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse> {
    return self.makeAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.liquidate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLiquidateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Hard_V1beta1_MsgAsyncClientProtocol {
  internal func deposit(
    _ request: Kava_Hard_V1beta1_MsgDeposit,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Hard_V1beta1_MsgDepositResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.deposit.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  internal func withdraw(
    _ request: Kava_Hard_V1beta1_MsgWithdraw,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Hard_V1beta1_MsgWithdrawResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.withdraw.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawInterceptors() ?? []
    )
  }

  internal func borrow(
    _ request: Kava_Hard_V1beta1_MsgBorrow,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Hard_V1beta1_MsgBorrowResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.borrow.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBorrowInterceptors() ?? []
    )
  }

  internal func repay(
    _ request: Kava_Hard_V1beta1_MsgRepay,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Hard_V1beta1_MsgRepayResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.repay.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRepayInterceptors() ?? []
    )
  }

  internal func liquidate(
    _ request: Kava_Hard_V1beta1_MsgLiquidate,
    callOptions: CallOptions? = nil
  ) async throws -> Kava_Hard_V1beta1_MsgLiquidateResponse {
    return try await self.performAsyncUnaryCall(
      path: Kava_Hard_V1beta1_MsgClientMetadata.Methods.liquidate.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLiquidateInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Kava_Hard_V1beta1_MsgAsyncClient: Kava_Hard_V1beta1_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Kava_Hard_V1beta1_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'deposit'.
  func makeDepositInterceptors() -> [ClientInterceptor<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'withdraw'.
  func makeWithdrawInterceptors() -> [ClientInterceptor<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when invoking 'borrow'.
  func makeBorrowInterceptors() -> [ClientInterceptor<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse>]

  /// - Returns: Interceptors to use when invoking 'repay'.
  func makeRepayInterceptors() -> [ClientInterceptor<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse>]

  /// - Returns: Interceptors to use when invoking 'liquidate'.
  func makeLiquidateInterceptors() -> [ClientInterceptor<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse>]
}

internal enum Kava_Hard_V1beta1_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kava.hard.v1beta1.Msg",
    methods: [
      Kava_Hard_V1beta1_MsgClientMetadata.Methods.deposit,
      Kava_Hard_V1beta1_MsgClientMetadata.Methods.withdraw,
      Kava_Hard_V1beta1_MsgClientMetadata.Methods.borrow,
      Kava_Hard_V1beta1_MsgClientMetadata.Methods.repay,
      Kava_Hard_V1beta1_MsgClientMetadata.Methods.liquidate,
    ]
  )

  internal enum Methods {
    internal static let deposit = GRPCMethodDescriptor(
      name: "Deposit",
      path: "/kava.hard.v1beta1.Msg/Deposit",
      type: GRPCCallType.unary
    )

    internal static let withdraw = GRPCMethodDescriptor(
      name: "Withdraw",
      path: "/kava.hard.v1beta1.Msg/Withdraw",
      type: GRPCCallType.unary
    )

    internal static let borrow = GRPCMethodDescriptor(
      name: "Borrow",
      path: "/kava.hard.v1beta1.Msg/Borrow",
      type: GRPCCallType.unary
    )

    internal static let repay = GRPCMethodDescriptor(
      name: "Repay",
      path: "/kava.hard.v1beta1.Msg/Repay",
      type: GRPCCallType.unary
    )

    internal static let liquidate = GRPCMethodDescriptor(
      name: "Liquidate",
      path: "/kava.hard.v1beta1.Msg/Liquidate",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the hard Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Hard_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kava_Hard_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Deposit defines a method for depositing funds to hard liquidity pool.
  func deposit(request: Kava_Hard_V1beta1_MsgDeposit, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Hard_V1beta1_MsgDepositResponse>

  /// Withdraw defines a method for withdrawing funds from hard liquidity pool.
  func withdraw(request: Kava_Hard_V1beta1_MsgWithdraw, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Hard_V1beta1_MsgWithdrawResponse>

  /// Borrow defines a method for borrowing funds from hard liquidity pool.
  func borrow(request: Kava_Hard_V1beta1_MsgBorrow, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Hard_V1beta1_MsgBorrowResponse>

  /// Repay defines a method for repaying funds borrowed from hard liquidity pool.
  func repay(request: Kava_Hard_V1beta1_MsgRepay, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Hard_V1beta1_MsgRepayResponse>

  /// Liquidate defines a method for attempting to liquidate a borrower that is over their loan-to-value.
  func liquidate(request: Kava_Hard_V1beta1_MsgLiquidate, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Hard_V1beta1_MsgLiquidateResponse>
}

extension Kava_Hard_V1beta1_MsgProvider {
  internal var serviceName: Substring {
    return Kava_Hard_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        userFunction: self.deposit(request:context:)
      )

    case "Withdraw":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgWithdraw>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgWithdrawResponse>(),
        interceptors: self.interceptors?.makeWithdrawInterceptors() ?? [],
        userFunction: self.withdraw(request:context:)
      )

    case "Borrow":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgBorrow>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgBorrowResponse>(),
        interceptors: self.interceptors?.makeBorrowInterceptors() ?? [],
        userFunction: self.borrow(request:context:)
      )

    case "Repay":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgRepay>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgRepayResponse>(),
        interceptors: self.interceptors?.makeRepayInterceptors() ?? [],
        userFunction: self.repay(request:context:)
      )

    case "Liquidate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgLiquidate>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgLiquidateResponse>(),
        interceptors: self.interceptors?.makeLiquidateInterceptors() ?? [],
        userFunction: self.liquidate(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the hard Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Kava_Hard_V1beta1_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Kava_Hard_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// Deposit defines a method for depositing funds to hard liquidity pool.
  @Sendable func deposit(
    request: Kava_Hard_V1beta1_MsgDeposit,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Hard_V1beta1_MsgDepositResponse

  /// Withdraw defines a method for withdrawing funds from hard liquidity pool.
  @Sendable func withdraw(
    request: Kava_Hard_V1beta1_MsgWithdraw,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Hard_V1beta1_MsgWithdrawResponse

  /// Borrow defines a method for borrowing funds from hard liquidity pool.
  @Sendable func borrow(
    request: Kava_Hard_V1beta1_MsgBorrow,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Hard_V1beta1_MsgBorrowResponse

  /// Repay defines a method for repaying funds borrowed from hard liquidity pool.
  @Sendable func repay(
    request: Kava_Hard_V1beta1_MsgRepay,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Hard_V1beta1_MsgRepayResponse

  /// Liquidate defines a method for attempting to liquidate a borrower that is over their loan-to-value.
  @Sendable func liquidate(
    request: Kava_Hard_V1beta1_MsgLiquidate,
    context: GRPCAsyncServerCallContext
  ) async throws -> Kava_Hard_V1beta1_MsgLiquidateResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Kava_Hard_V1beta1_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Kava_Hard_V1beta1_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Kava_Hard_V1beta1_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Kava_Hard_V1beta1_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Deposit":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        wrapping: self.deposit(request:context:)
      )

    case "Withdraw":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgWithdraw>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgWithdrawResponse>(),
        interceptors: self.interceptors?.makeWithdrawInterceptors() ?? [],
        wrapping: self.withdraw(request:context:)
      )

    case "Borrow":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgBorrow>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgBorrowResponse>(),
        interceptors: self.interceptors?.makeBorrowInterceptors() ?? [],
        wrapping: self.borrow(request:context:)
      )

    case "Repay":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgRepay>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgRepayResponse>(),
        interceptors: self.interceptors?.makeRepayInterceptors() ?? [],
        wrapping: self.repay(request:context:)
      )

    case "Liquidate":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Hard_V1beta1_MsgLiquidate>(),
        responseSerializer: ProtobufSerializer<Kava_Hard_V1beta1_MsgLiquidateResponse>(),
        interceptors: self.interceptors?.makeLiquidateInterceptors() ?? [],
        wrapping: self.liquidate(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Hard_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'deposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositInterceptors() -> [ServerInterceptor<Kava_Hard_V1beta1_MsgDeposit, Kava_Hard_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when handling 'withdraw'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawInterceptors() -> [ServerInterceptor<Kava_Hard_V1beta1_MsgWithdraw, Kava_Hard_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when handling 'borrow'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBorrowInterceptors() -> [ServerInterceptor<Kava_Hard_V1beta1_MsgBorrow, Kava_Hard_V1beta1_MsgBorrowResponse>]

  /// - Returns: Interceptors to use when handling 'repay'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRepayInterceptors() -> [ServerInterceptor<Kava_Hard_V1beta1_MsgRepay, Kava_Hard_V1beta1_MsgRepayResponse>]

  /// - Returns: Interceptors to use when handling 'liquidate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLiquidateInterceptors() -> [ServerInterceptor<Kava_Hard_V1beta1_MsgLiquidate, Kava_Hard_V1beta1_MsgLiquidateResponse>]
}

internal enum Kava_Hard_V1beta1_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "kava.hard.v1beta1.Msg",
    methods: [
      Kava_Hard_V1beta1_MsgServerMetadata.Methods.deposit,
      Kava_Hard_V1beta1_MsgServerMetadata.Methods.withdraw,
      Kava_Hard_V1beta1_MsgServerMetadata.Methods.borrow,
      Kava_Hard_V1beta1_MsgServerMetadata.Methods.repay,
      Kava_Hard_V1beta1_MsgServerMetadata.Methods.liquidate,
    ]
  )

  internal enum Methods {
    internal static let deposit = GRPCMethodDescriptor(
      name: "Deposit",
      path: "/kava.hard.v1beta1.Msg/Deposit",
      type: GRPCCallType.unary
    )

    internal static let withdraw = GRPCMethodDescriptor(
      name: "Withdraw",
      path: "/kava.hard.v1beta1.Msg/Withdraw",
      type: GRPCCallType.unary
    )

    internal static let borrow = GRPCMethodDescriptor(
      name: "Borrow",
      path: "/kava.hard.v1beta1.Msg/Borrow",
      type: GRPCCallType.unary
    )

    internal static let repay = GRPCMethodDescriptor(
      name: "Repay",
      path: "/kava.hard.v1beta1.Msg/Repay",
      type: GRPCCallType.unary
    )

    internal static let liquidate = GRPCMethodDescriptor(
      name: "Liquidate",
      path: "/kava.hard.v1beta1.Msg/Liquidate",
      type: GRPCCallType.unary
    )
  }
}
