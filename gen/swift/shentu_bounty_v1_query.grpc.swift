//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: shentu/bounty/v1/query.proto
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


/// Query defines the gRPC querier service for bounty module
///
/// Usage: instantiate `Shentu_Bounty_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Shentu_Bounty_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? { get }

  func programs(
    _ request: Shentu_Bounty_V1_QueryProgramsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse>

  func program(
    _ request: Shentu_Bounty_V1_QueryProgramRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse>

  func findings(
    _ request: Shentu_Bounty_V1_QueryFindingsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse>

  func finding(
    _ request: Shentu_Bounty_V1_QueryFindingRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse>

  func findingFingerprint(
    _ request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse>

  func programFingerprint(
    _ request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse>
}

extension Shentu_Bounty_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "shentu.bounty.v1.Query"
  }

  /// Programs queries all programs based on given status.
  ///
  /// - Parameters:
  ///   - request: Request to send to Programs.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func programs(
    _ request: Shentu_Bounty_V1_QueryProgramsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramsInterceptors() ?? []
    )
  }

  /// Program queries program details based on ProgramId.
  ///
  /// - Parameters:
  ///   - request: Request to send to Program.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func program(
    _ request: Shentu_Bounty_V1_QueryProgramRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.program.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramInterceptors() ?? []
    )
  }

  /// Findings queries findings of a given program.
  ///
  /// - Parameters:
  ///   - request: Request to send to Findings.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func findings(
    _ request: Shentu_Bounty_V1_QueryFindingsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findings.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingsInterceptors() ?? []
    )
  }

  /// Finding queries Finding information based on programID, FindingId.
  ///
  /// - Parameters:
  ///   - request: Request to send to Finding.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func finding(
    _ request: Shentu_Bounty_V1_QueryFindingRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.finding.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingInterceptors() ?? []
    )
  }

  /// FindingFingerprint queries finding fingerprint based on findingId.
  ///
  /// - Parameters:
  ///   - request: Request to send to FindingFingerprint.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func findingFingerprint(
    _ request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findingFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingFingerprintInterceptors() ?? []
    )
  }

  /// ProgramFingerprint queries program fingerprint based on programId.
  ///
  /// - Parameters:
  ///   - request: Request to send to ProgramFingerprint.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func programFingerprint(
    _ request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse> {
    return self.makeUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramFingerprintInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Shentu_Bounty_V1_QueryClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Shentu_Bounty_V1_QueryNIOClient")
internal final class Shentu_Bounty_V1_QueryClient: Shentu_Bounty_V1_QueryClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the shentu.bounty.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Shentu_Bounty_V1_QueryNIOClient: Shentu_Bounty_V1_QueryClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the shentu.bounty.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for bounty module
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Bounty_V1_QueryAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? { get }

  func makeProgramsCall(
    _ request: Shentu_Bounty_V1_QueryProgramsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse>

  func makeProgramCall(
    _ request: Shentu_Bounty_V1_QueryProgramRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse>

  func makeFindingsCall(
    _ request: Shentu_Bounty_V1_QueryFindingsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse>

  func makeFindingCall(
    _ request: Shentu_Bounty_V1_QueryFindingRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse>

  func makeFindingFingerprintCall(
    _ request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse>

  func makeProgramFingerprintCall(
    _ request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Bounty_V1_QueryAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Bounty_V1_QueryClientMetadata.serviceDescriptor
  }

  internal var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeProgramsCall(
    _ request: Shentu_Bounty_V1_QueryProgramsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramsInterceptors() ?? []
    )
  }

  internal func makeProgramCall(
    _ request: Shentu_Bounty_V1_QueryProgramRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.program.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramInterceptors() ?? []
    )
  }

  internal func makeFindingsCall(
    _ request: Shentu_Bounty_V1_QueryFindingsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findings.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingsInterceptors() ?? []
    )
  }

  internal func makeFindingCall(
    _ request: Shentu_Bounty_V1_QueryFindingRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.finding.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingInterceptors() ?? []
    )
  }

  internal func makeFindingFingerprintCall(
    _ request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findingFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingFingerprintInterceptors() ?? []
    )
  }

  internal func makeProgramFingerprintCall(
    _ request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse> {
    return self.makeAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramFingerprintInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Bounty_V1_QueryAsyncClientProtocol {
  internal func programs(
    _ request: Shentu_Bounty_V1_QueryProgramsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryProgramsResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programs.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramsInterceptors() ?? []
    )
  }

  internal func program(
    _ request: Shentu_Bounty_V1_QueryProgramRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryProgramResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.program.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramInterceptors() ?? []
    )
  }

  internal func findings(
    _ request: Shentu_Bounty_V1_QueryFindingsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryFindingsResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findings.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingsInterceptors() ?? []
    )
  }

  internal func finding(
    _ request: Shentu_Bounty_V1_QueryFindingRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryFindingResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.finding.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingInterceptors() ?? []
    )
  }

  internal func findingFingerprint(
    _ request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryFindingFingerprintResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.findingFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFindingFingerprintInterceptors() ?? []
    )
  }

  internal func programFingerprint(
    _ request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Shentu_Bounty_V1_QueryProgramFingerprintResponse {
    return try await self.performAsyncUnaryCall(
      path: Shentu_Bounty_V1_QueryClientMetadata.Methods.programFingerprint.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProgramFingerprintInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Shentu_Bounty_V1_QueryAsyncClient: Shentu_Bounty_V1_QueryAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Shentu_Bounty_V1_QueryClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'programs'.
  func makeProgramsInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse>]

  /// - Returns: Interceptors to use when invoking 'program'.
  func makeProgramInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse>]

  /// - Returns: Interceptors to use when invoking 'findings'.
  func makeFindingsInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse>]

  /// - Returns: Interceptors to use when invoking 'finding'.
  func makeFindingInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse>]

  /// - Returns: Interceptors to use when invoking 'findingFingerprint'.
  func makeFindingFingerprintInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse>]

  /// - Returns: Interceptors to use when invoking 'programFingerprint'.
  func makeProgramFingerprintInterceptors() -> [ClientInterceptor<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse>]
}

internal enum Shentu_Bounty_V1_QueryClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "shentu.bounty.v1.Query",
    methods: [
      Shentu_Bounty_V1_QueryClientMetadata.Methods.programs,
      Shentu_Bounty_V1_QueryClientMetadata.Methods.program,
      Shentu_Bounty_V1_QueryClientMetadata.Methods.findings,
      Shentu_Bounty_V1_QueryClientMetadata.Methods.finding,
      Shentu_Bounty_V1_QueryClientMetadata.Methods.findingFingerprint,
      Shentu_Bounty_V1_QueryClientMetadata.Methods.programFingerprint,
    ]
  )

  internal enum Methods {
    internal static let programs = GRPCMethodDescriptor(
      name: "Programs",
      path: "/shentu.bounty.v1.Query/Programs",
      type: GRPCCallType.unary
    )

    internal static let program = GRPCMethodDescriptor(
      name: "Program",
      path: "/shentu.bounty.v1.Query/Program",
      type: GRPCCallType.unary
    )

    internal static let findings = GRPCMethodDescriptor(
      name: "Findings",
      path: "/shentu.bounty.v1.Query/Findings",
      type: GRPCCallType.unary
    )

    internal static let finding = GRPCMethodDescriptor(
      name: "Finding",
      path: "/shentu.bounty.v1.Query/Finding",
      type: GRPCCallType.unary
    )

    internal static let findingFingerprint = GRPCMethodDescriptor(
      name: "FindingFingerprint",
      path: "/shentu.bounty.v1.Query/FindingFingerprint",
      type: GRPCCallType.unary
    )

    internal static let programFingerprint = GRPCMethodDescriptor(
      name: "ProgramFingerprint",
      path: "/shentu.bounty.v1.Query/ProgramFingerprint",
      type: GRPCCallType.unary
    )
  }
}

/// Query defines the gRPC querier service for bounty module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Shentu_Bounty_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Shentu_Bounty_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Programs queries all programs based on given status.
  func programs(request: Shentu_Bounty_V1_QueryProgramsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryProgramsResponse>

  /// Program queries program details based on ProgramId.
  func program(request: Shentu_Bounty_V1_QueryProgramRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryProgramResponse>

  /// Findings queries findings of a given program.
  func findings(request: Shentu_Bounty_V1_QueryFindingsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryFindingsResponse>

  /// Finding queries Finding information based on programID, FindingId.
  func finding(request: Shentu_Bounty_V1_QueryFindingRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryFindingResponse>

  /// FindingFingerprint queries finding fingerprint based on findingId.
  func findingFingerprint(request: Shentu_Bounty_V1_QueryFindingFingerprintRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryFindingFingerprintResponse>

  /// ProgramFingerprint queries program fingerprint based on programId.
  func programFingerprint(request: Shentu_Bounty_V1_QueryProgramFingerprintRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Bounty_V1_QueryProgramFingerprintResponse>
}

extension Shentu_Bounty_V1_QueryProvider {
  internal var serviceName: Substring {
    return Shentu_Bounty_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Programs":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramsRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramsResponse>(),
        interceptors: self.interceptors?.makeProgramsInterceptors() ?? [],
        userFunction: self.programs(request:context:)
      )

    case "Program":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramResponse>(),
        interceptors: self.interceptors?.makeProgramInterceptors() ?? [],
        userFunction: self.program(request:context:)
      )

    case "Findings":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingsRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingsResponse>(),
        interceptors: self.interceptors?.makeFindingsInterceptors() ?? [],
        userFunction: self.findings(request:context:)
      )

    case "Finding":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingResponse>(),
        interceptors: self.interceptors?.makeFindingInterceptors() ?? [],
        userFunction: self.finding(request:context:)
      )

    case "FindingFingerprint":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingFingerprintRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingFingerprintResponse>(),
        interceptors: self.interceptors?.makeFindingFingerprintInterceptors() ?? [],
        userFunction: self.findingFingerprint(request:context:)
      )

    case "ProgramFingerprint":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramFingerprintRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramFingerprintResponse>(),
        interceptors: self.interceptors?.makeProgramFingerprintInterceptors() ?? [],
        userFunction: self.programFingerprint(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Query defines the gRPC querier service for bounty module
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Shentu_Bounty_V1_QueryAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Shentu_Bounty_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// Programs queries all programs based on given status.
  @Sendable func programs(
    request: Shentu_Bounty_V1_QueryProgramsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryProgramsResponse

  /// Program queries program details based on ProgramId.
  @Sendable func program(
    request: Shentu_Bounty_V1_QueryProgramRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryProgramResponse

  /// Findings queries findings of a given program.
  @Sendable func findings(
    request: Shentu_Bounty_V1_QueryFindingsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryFindingsResponse

  /// Finding queries Finding information based on programID, FindingId.
  @Sendable func finding(
    request: Shentu_Bounty_V1_QueryFindingRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryFindingResponse

  /// FindingFingerprint queries finding fingerprint based on findingId.
  @Sendable func findingFingerprint(
    request: Shentu_Bounty_V1_QueryFindingFingerprintRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryFindingFingerprintResponse

  /// ProgramFingerprint queries program fingerprint based on programId.
  @Sendable func programFingerprint(
    request: Shentu_Bounty_V1_QueryProgramFingerprintRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Shentu_Bounty_V1_QueryProgramFingerprintResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Shentu_Bounty_V1_QueryAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Shentu_Bounty_V1_QueryServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Shentu_Bounty_V1_QueryServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Shentu_Bounty_V1_QueryServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Programs":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramsRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramsResponse>(),
        interceptors: self.interceptors?.makeProgramsInterceptors() ?? [],
        wrapping: self.programs(request:context:)
      )

    case "Program":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramResponse>(),
        interceptors: self.interceptors?.makeProgramInterceptors() ?? [],
        wrapping: self.program(request:context:)
      )

    case "Findings":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingsRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingsResponse>(),
        interceptors: self.interceptors?.makeFindingsInterceptors() ?? [],
        wrapping: self.findings(request:context:)
      )

    case "Finding":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingResponse>(),
        interceptors: self.interceptors?.makeFindingInterceptors() ?? [],
        wrapping: self.finding(request:context:)
      )

    case "FindingFingerprint":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryFindingFingerprintRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryFindingFingerprintResponse>(),
        interceptors: self.interceptors?.makeFindingFingerprintInterceptors() ?? [],
        wrapping: self.findingFingerprint(request:context:)
      )

    case "ProgramFingerprint":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Bounty_V1_QueryProgramFingerprintRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Bounty_V1_QueryProgramFingerprintResponse>(),
        interceptors: self.interceptors?.makeProgramFingerprintInterceptors() ?? [],
        wrapping: self.programFingerprint(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Shentu_Bounty_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'programs'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProgramsInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryProgramsRequest, Shentu_Bounty_V1_QueryProgramsResponse>]

  /// - Returns: Interceptors to use when handling 'program'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProgramInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryProgramRequest, Shentu_Bounty_V1_QueryProgramResponse>]

  /// - Returns: Interceptors to use when handling 'findings'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFindingsInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryFindingsRequest, Shentu_Bounty_V1_QueryFindingsResponse>]

  /// - Returns: Interceptors to use when handling 'finding'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFindingInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryFindingRequest, Shentu_Bounty_V1_QueryFindingResponse>]

  /// - Returns: Interceptors to use when handling 'findingFingerprint'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFindingFingerprintInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryFindingFingerprintRequest, Shentu_Bounty_V1_QueryFindingFingerprintResponse>]

  /// - Returns: Interceptors to use when handling 'programFingerprint'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProgramFingerprintInterceptors() -> [ServerInterceptor<Shentu_Bounty_V1_QueryProgramFingerprintRequest, Shentu_Bounty_V1_QueryProgramFingerprintResponse>]
}

internal enum Shentu_Bounty_V1_QueryServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Query",
    fullName: "shentu.bounty.v1.Query",
    methods: [
      Shentu_Bounty_V1_QueryServerMetadata.Methods.programs,
      Shentu_Bounty_V1_QueryServerMetadata.Methods.program,
      Shentu_Bounty_V1_QueryServerMetadata.Methods.findings,
      Shentu_Bounty_V1_QueryServerMetadata.Methods.finding,
      Shentu_Bounty_V1_QueryServerMetadata.Methods.findingFingerprint,
      Shentu_Bounty_V1_QueryServerMetadata.Methods.programFingerprint,
    ]
  )

  internal enum Methods {
    internal static let programs = GRPCMethodDescriptor(
      name: "Programs",
      path: "/shentu.bounty.v1.Query/Programs",
      type: GRPCCallType.unary
    )

    internal static let program = GRPCMethodDescriptor(
      name: "Program",
      path: "/shentu.bounty.v1.Query/Program",
      type: GRPCCallType.unary
    )

    internal static let findings = GRPCMethodDescriptor(
      name: "Findings",
      path: "/shentu.bounty.v1.Query/Findings",
      type: GRPCCallType.unary
    )

    internal static let finding = GRPCMethodDescriptor(
      name: "Finding",
      path: "/shentu.bounty.v1.Query/Finding",
      type: GRPCCallType.unary
    )

    internal static let findingFingerprint = GRPCMethodDescriptor(
      name: "FindingFingerprint",
      path: "/shentu.bounty.v1.Query/FindingFingerprint",
      type: GRPCCallType.unary
    )

    internal static let programFingerprint = GRPCMethodDescriptor(
      name: "ProgramFingerprint",
      path: "/shentu.bounty.v1.Query/ProgramFingerprint",
      type: GRPCCallType.unary
    )
  }
}