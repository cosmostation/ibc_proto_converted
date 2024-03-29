//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stride/vesting/tx.proto
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
/// Usage: instantiate `Stride_Vesting_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Stride_Vesting_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? { get }
}

extension Stride_Vesting_MsgClientProtocol {
  internal var serviceName: String {
    return "stride.vesting.Msg"
  }
}

@available(*, deprecated)
extension Stride_Vesting_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Stride_Vesting_MsgNIOClient")
internal final class Stride_Vesting_MsgClient: Stride_Vesting_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the stride.vesting.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Stride_Vesting_MsgNIOClient: Stride_Vesting_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the stride.vesting.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the bank Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Vesting_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Vesting_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Vesting_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? {
    return nil
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Vesting_MsgAsyncClientProtocol {
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Stride_Vesting_MsgAsyncClient: Stride_Vesting_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Stride_Vesting_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Stride_Vesting_MsgClientInterceptorFactoryProtocol: Sendable {
}

internal enum Stride_Vesting_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stride.vesting.Msg",
    methods: [
    ]
  )

  internal enum Methods {
  }
}

/// Msg defines the bank Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Stride_Vesting_MsgProvider: CallHandlerProvider {
  var interceptors: Stride_Vesting_MsgServerInterceptorFactoryProtocol? { get }
}

extension Stride_Vesting_MsgProvider {
  internal var serviceName: Substring {
    return Stride_Vesting_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    default:
      return nil
    }
  }
}

/// Msg defines the bank Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Stride_Vesting_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Stride_Vesting_MsgServerInterceptorFactoryProtocol? { get }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Stride_Vesting_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Stride_Vesting_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Stride_Vesting_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Stride_Vesting_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    default:
      return nil
    }
  }
}

internal protocol Stride_Vesting_MsgServerInterceptorFactoryProtocol {
}

internal enum Stride_Vesting_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "stride.vesting.Msg",
    methods: [
    ]
  )

  internal enum Methods {
  }
}
