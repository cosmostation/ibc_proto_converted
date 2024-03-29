//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/posts/v3/msgs.proto
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


/// Msg defines the posts Msg service.
///
/// Usage: instantiate `Desmos_Posts_V3_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Posts_V3_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? { get }

  func createPost(
    _ request: Desmos_Posts_V3_MsgCreatePost,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse>

  func editPost(
    _ request: Desmos_Posts_V3_MsgEditPost,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse>

  func deletePost(
    _ request: Desmos_Posts_V3_MsgDeletePost,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse>

  func addPostAttachment(
    _ request: Desmos_Posts_V3_MsgAddPostAttachment,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse>

  func removePostAttachment(
    _ request: Desmos_Posts_V3_MsgRemovePostAttachment,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse>

  func answerPoll(
    _ request: Desmos_Posts_V3_MsgAnswerPoll,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse>

  func updateParams(
    _ request: Desmos_Posts_V3_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse>
}

extension Desmos_Posts_V3_MsgClientProtocol {
  internal var serviceName: String {
    return "desmos.posts.v3.Msg"
  }

  /// CreatePost allows to create a new post
  ///
  /// - Parameters:
  ///   - request: Request to send to CreatePost.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createPost(
    _ request: Desmos_Posts_V3_MsgCreatePost,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.createPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePostInterceptors() ?? []
    )
  }

  /// EditPost allows to edit an existing post
  ///
  /// - Parameters:
  ///   - request: Request to send to EditPost.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func editPost(
    _ request: Desmos_Posts_V3_MsgEditPost,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.editPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditPostInterceptors() ?? []
    )
  }

  /// DeletePost allows to delete an existing post
  ///
  /// - Parameters:
  ///   - request: Request to send to DeletePost.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deletePost(
    _ request: Desmos_Posts_V3_MsgDeletePost,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.deletePost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeletePostInterceptors() ?? []
    )
  }

  /// AddPostAttachment allows to add a new attachment to a post
  ///
  /// - Parameters:
  ///   - request: Request to send to AddPostAttachment.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addPostAttachment(
    _ request: Desmos_Posts_V3_MsgAddPostAttachment,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.addPostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddPostAttachmentInterceptors() ?? []
    )
  }

  /// RemovePostAttachment allows to remove an attachment from a post
  ///
  /// - Parameters:
  ///   - request: Request to send to RemovePostAttachment.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func removePostAttachment(
    _ request: Desmos_Posts_V3_MsgRemovePostAttachment,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.removePostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemovePostAttachmentInterceptors() ?? []
    )
  }

  /// AnswerPoll allows to answer a post poll
  ///
  /// - Parameters:
  ///   - request: Request to send to AnswerPoll.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func answerPoll(
    _ request: Desmos_Posts_V3_MsgAnswerPoll,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.answerPoll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnswerPollInterceptors() ?? []
    )
  }

  /// UpdateParams defines a (governance) operation for updating the module
  /// parameters.
  /// The authority defaults to the x/gov module account.
  ///
  /// Since: Desmos 5.0.0
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateParams(
    _ request: Desmos_Posts_V3_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse> {
    return self.makeUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(*, deprecated)
extension Desmos_Posts_V3_MsgClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "Desmos_Posts_V3_MsgNIOClient")
internal final class Desmos_Posts_V3_MsgClient: Desmos_Posts_V3_MsgClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the desmos.posts.v3.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Desmos_Posts_V3_MsgNIOClient: Desmos_Posts_V3_MsgClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.posts.v3.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the posts Msg service.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Desmos_Posts_V3_MsgAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? { get }

  func makeCreatePostCall(
    _ request: Desmos_Posts_V3_MsgCreatePost,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse>

  func makeEditPostCall(
    _ request: Desmos_Posts_V3_MsgEditPost,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse>

  func makeDeletePostCall(
    _ request: Desmos_Posts_V3_MsgDeletePost,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse>

  func makeAddPostAttachmentCall(
    _ request: Desmos_Posts_V3_MsgAddPostAttachment,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse>

  func makeRemovePostAttachmentCall(
    _ request: Desmos_Posts_V3_MsgRemovePostAttachment,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse>

  func makeAnswerPollCall(
    _ request: Desmos_Posts_V3_MsgAnswerPoll,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse>

  func makeUpdateParamsCall(
    _ request: Desmos_Posts_V3_MsgUpdateParams,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Posts_V3_MsgAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Posts_V3_MsgClientMetadata.serviceDescriptor
  }

  internal var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreatePostCall(
    _ request: Desmos_Posts_V3_MsgCreatePost,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.createPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePostInterceptors() ?? []
    )
  }

  internal func makeEditPostCall(
    _ request: Desmos_Posts_V3_MsgEditPost,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.editPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditPostInterceptors() ?? []
    )
  }

  internal func makeDeletePostCall(
    _ request: Desmos_Posts_V3_MsgDeletePost,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.deletePost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeletePostInterceptors() ?? []
    )
  }

  internal func makeAddPostAttachmentCall(
    _ request: Desmos_Posts_V3_MsgAddPostAttachment,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.addPostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddPostAttachmentInterceptors() ?? []
    )
  }

  internal func makeRemovePostAttachmentCall(
    _ request: Desmos_Posts_V3_MsgRemovePostAttachment,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.removePostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemovePostAttachmentInterceptors() ?? []
    )
  }

  internal func makeAnswerPollCall(
    _ request: Desmos_Posts_V3_MsgAnswerPoll,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.answerPoll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnswerPollInterceptors() ?? []
    )
  }

  internal func makeUpdateParamsCall(
    _ request: Desmos_Posts_V3_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse> {
    return self.makeAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Posts_V3_MsgAsyncClientProtocol {
  internal func createPost(
    _ request: Desmos_Posts_V3_MsgCreatePost,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgCreatePostResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.createPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePostInterceptors() ?? []
    )
  }

  internal func editPost(
    _ request: Desmos_Posts_V3_MsgEditPost,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgEditPostResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.editPost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditPostInterceptors() ?? []
    )
  }

  internal func deletePost(
    _ request: Desmos_Posts_V3_MsgDeletePost,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgDeletePostResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.deletePost.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeletePostInterceptors() ?? []
    )
  }

  internal func addPostAttachment(
    _ request: Desmos_Posts_V3_MsgAddPostAttachment,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgAddPostAttachmentResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.addPostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddPostAttachmentInterceptors() ?? []
    )
  }

  internal func removePostAttachment(
    _ request: Desmos_Posts_V3_MsgRemovePostAttachment,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgRemovePostAttachmentResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.removePostAttachment.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemovePostAttachmentInterceptors() ?? []
    )
  }

  internal func answerPoll(
    _ request: Desmos_Posts_V3_MsgAnswerPoll,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgAnswerPollResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.answerPoll.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAnswerPollInterceptors() ?? []
    )
  }

  internal func updateParams(
    _ request: Desmos_Posts_V3_MsgUpdateParams,
    callOptions: CallOptions? = nil
  ) async throws -> Desmos_Posts_V3_MsgUpdateParamsResponse {
    return try await self.performAsyncUnaryCall(
      path: Desmos_Posts_V3_MsgClientMetadata.Methods.updateParams.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Desmos_Posts_V3_MsgAsyncClient: Desmos_Posts_V3_MsgAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol Desmos_Posts_V3_MsgClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'createPost'.
  func makeCreatePostInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse>]

  /// - Returns: Interceptors to use when invoking 'editPost'.
  func makeEditPostInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse>]

  /// - Returns: Interceptors to use when invoking 'deletePost'.
  func makeDeletePostInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse>]

  /// - Returns: Interceptors to use when invoking 'addPostAttachment'.
  func makeAddPostAttachmentInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse>]

  /// - Returns: Interceptors to use when invoking 'removePostAttachment'.
  func makeRemovePostAttachmentInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse>]

  /// - Returns: Interceptors to use when invoking 'answerPoll'.
  func makeAnswerPollInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse>]

  /// - Returns: Interceptors to use when invoking 'updateParams'.
  func makeUpdateParamsInterceptors() -> [ClientInterceptor<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse>]
}

internal enum Desmos_Posts_V3_MsgClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "desmos.posts.v3.Msg",
    methods: [
      Desmos_Posts_V3_MsgClientMetadata.Methods.createPost,
      Desmos_Posts_V3_MsgClientMetadata.Methods.editPost,
      Desmos_Posts_V3_MsgClientMetadata.Methods.deletePost,
      Desmos_Posts_V3_MsgClientMetadata.Methods.addPostAttachment,
      Desmos_Posts_V3_MsgClientMetadata.Methods.removePostAttachment,
      Desmos_Posts_V3_MsgClientMetadata.Methods.answerPoll,
      Desmos_Posts_V3_MsgClientMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let createPost = GRPCMethodDescriptor(
      name: "CreatePost",
      path: "/desmos.posts.v3.Msg/CreatePost",
      type: GRPCCallType.unary
    )

    internal static let editPost = GRPCMethodDescriptor(
      name: "EditPost",
      path: "/desmos.posts.v3.Msg/EditPost",
      type: GRPCCallType.unary
    )

    internal static let deletePost = GRPCMethodDescriptor(
      name: "DeletePost",
      path: "/desmos.posts.v3.Msg/DeletePost",
      type: GRPCCallType.unary
    )

    internal static let addPostAttachment = GRPCMethodDescriptor(
      name: "AddPostAttachment",
      path: "/desmos.posts.v3.Msg/AddPostAttachment",
      type: GRPCCallType.unary
    )

    internal static let removePostAttachment = GRPCMethodDescriptor(
      name: "RemovePostAttachment",
      path: "/desmos.posts.v3.Msg/RemovePostAttachment",
      type: GRPCCallType.unary
    )

    internal static let answerPoll = GRPCMethodDescriptor(
      name: "AnswerPoll",
      path: "/desmos.posts.v3.Msg/AnswerPoll",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/desmos.posts.v3.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}

/// Msg defines the posts Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Posts_V3_MsgProvider: CallHandlerProvider {
  var interceptors: Desmos_Posts_V3_MsgServerInterceptorFactoryProtocol? { get }

  /// CreatePost allows to create a new post
  func createPost(request: Desmos_Posts_V3_MsgCreatePost, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgCreatePostResponse>

  /// EditPost allows to edit an existing post
  func editPost(request: Desmos_Posts_V3_MsgEditPost, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgEditPostResponse>

  /// DeletePost allows to delete an existing post
  func deletePost(request: Desmos_Posts_V3_MsgDeletePost, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgDeletePostResponse>

  /// AddPostAttachment allows to add a new attachment to a post
  func addPostAttachment(request: Desmos_Posts_V3_MsgAddPostAttachment, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgAddPostAttachmentResponse>

  /// RemovePostAttachment allows to remove an attachment from a post
  func removePostAttachment(request: Desmos_Posts_V3_MsgRemovePostAttachment, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgRemovePostAttachmentResponse>

  /// AnswerPoll allows to answer a post poll
  func answerPoll(request: Desmos_Posts_V3_MsgAnswerPoll, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgAnswerPollResponse>

  /// UpdateParams defines a (governance) operation for updating the module
  /// parameters.
  /// The authority defaults to the x/gov module account.
  ///
  /// Since: Desmos 5.0.0
  func updateParams(request: Desmos_Posts_V3_MsgUpdateParams, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V3_MsgUpdateParamsResponse>
}

extension Desmos_Posts_V3_MsgProvider {
  internal var serviceName: Substring {
    return Desmos_Posts_V3_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreatePost":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgCreatePost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgCreatePostResponse>(),
        interceptors: self.interceptors?.makeCreatePostInterceptors() ?? [],
        userFunction: self.createPost(request:context:)
      )

    case "EditPost":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgEditPost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgEditPostResponse>(),
        interceptors: self.interceptors?.makeEditPostInterceptors() ?? [],
        userFunction: self.editPost(request:context:)
      )

    case "DeletePost":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgDeletePost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgDeletePostResponse>(),
        interceptors: self.interceptors?.makeDeletePostInterceptors() ?? [],
        userFunction: self.deletePost(request:context:)
      )

    case "AddPostAttachment":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgAddPostAttachment>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgAddPostAttachmentResponse>(),
        interceptors: self.interceptors?.makeAddPostAttachmentInterceptors() ?? [],
        userFunction: self.addPostAttachment(request:context:)
      )

    case "RemovePostAttachment":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgRemovePostAttachment>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgRemovePostAttachmentResponse>(),
        interceptors: self.interceptors?.makeRemovePostAttachmentInterceptors() ?? [],
        userFunction: self.removePostAttachment(request:context:)
      )

    case "AnswerPoll":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgAnswerPoll>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgAnswerPollResponse>(),
        interceptors: self.interceptors?.makeAnswerPollInterceptors() ?? [],
        userFunction: self.answerPoll(request:context:)
      )

    case "UpdateParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        userFunction: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

/// Msg defines the posts Msg service.
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Desmos_Posts_V3_MsgAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Desmos_Posts_V3_MsgServerInterceptorFactoryProtocol? { get }

  /// CreatePost allows to create a new post
  @Sendable func createPost(
    request: Desmos_Posts_V3_MsgCreatePost,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgCreatePostResponse

  /// EditPost allows to edit an existing post
  @Sendable func editPost(
    request: Desmos_Posts_V3_MsgEditPost,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgEditPostResponse

  /// DeletePost allows to delete an existing post
  @Sendable func deletePost(
    request: Desmos_Posts_V3_MsgDeletePost,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgDeletePostResponse

  /// AddPostAttachment allows to add a new attachment to a post
  @Sendable func addPostAttachment(
    request: Desmos_Posts_V3_MsgAddPostAttachment,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgAddPostAttachmentResponse

  /// RemovePostAttachment allows to remove an attachment from a post
  @Sendable func removePostAttachment(
    request: Desmos_Posts_V3_MsgRemovePostAttachment,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgRemovePostAttachmentResponse

  /// AnswerPoll allows to answer a post poll
  @Sendable func answerPoll(
    request: Desmos_Posts_V3_MsgAnswerPoll,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgAnswerPollResponse

  /// UpdateParams defines a (governance) operation for updating the module
  /// parameters.
  /// The authority defaults to the x/gov module account.
  ///
  /// Since: Desmos 5.0.0
  @Sendable func updateParams(
    request: Desmos_Posts_V3_MsgUpdateParams,
    context: GRPCAsyncServerCallContext
  ) async throws -> Desmos_Posts_V3_MsgUpdateParamsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Desmos_Posts_V3_MsgAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Desmos_Posts_V3_MsgServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Desmos_Posts_V3_MsgServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Desmos_Posts_V3_MsgServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreatePost":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgCreatePost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgCreatePostResponse>(),
        interceptors: self.interceptors?.makeCreatePostInterceptors() ?? [],
        wrapping: self.createPost(request:context:)
      )

    case "EditPost":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgEditPost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgEditPostResponse>(),
        interceptors: self.interceptors?.makeEditPostInterceptors() ?? [],
        wrapping: self.editPost(request:context:)
      )

    case "DeletePost":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgDeletePost>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgDeletePostResponse>(),
        interceptors: self.interceptors?.makeDeletePostInterceptors() ?? [],
        wrapping: self.deletePost(request:context:)
      )

    case "AddPostAttachment":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgAddPostAttachment>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgAddPostAttachmentResponse>(),
        interceptors: self.interceptors?.makeAddPostAttachmentInterceptors() ?? [],
        wrapping: self.addPostAttachment(request:context:)
      )

    case "RemovePostAttachment":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgRemovePostAttachment>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgRemovePostAttachmentResponse>(),
        interceptors: self.interceptors?.makeRemovePostAttachmentInterceptors() ?? [],
        wrapping: self.removePostAttachment(request:context:)
      )

    case "AnswerPoll":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgAnswerPoll>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgAnswerPollResponse>(),
        interceptors: self.interceptors?.makeAnswerPollInterceptors() ?? [],
        wrapping: self.answerPoll(request:context:)
      )

    case "UpdateParams":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V3_MsgUpdateParams>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V3_MsgUpdateParamsResponse>(),
        interceptors: self.interceptors?.makeUpdateParamsInterceptors() ?? [],
        wrapping: self.updateParams(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Posts_V3_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createPost'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreatePostInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgCreatePost, Desmos_Posts_V3_MsgCreatePostResponse>]

  /// - Returns: Interceptors to use when handling 'editPost'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEditPostInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgEditPost, Desmos_Posts_V3_MsgEditPostResponse>]

  /// - Returns: Interceptors to use when handling 'deletePost'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeletePostInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgDeletePost, Desmos_Posts_V3_MsgDeletePostResponse>]

  /// - Returns: Interceptors to use when handling 'addPostAttachment'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddPostAttachmentInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgAddPostAttachment, Desmos_Posts_V3_MsgAddPostAttachmentResponse>]

  /// - Returns: Interceptors to use when handling 'removePostAttachment'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRemovePostAttachmentInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgRemovePostAttachment, Desmos_Posts_V3_MsgRemovePostAttachmentResponse>]

  /// - Returns: Interceptors to use when handling 'answerPoll'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAnswerPollInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgAnswerPoll, Desmos_Posts_V3_MsgAnswerPollResponse>]

  /// - Returns: Interceptors to use when handling 'updateParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateParamsInterceptors() -> [ServerInterceptor<Desmos_Posts_V3_MsgUpdateParams, Desmos_Posts_V3_MsgUpdateParamsResponse>]
}

internal enum Desmos_Posts_V3_MsgServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Msg",
    fullName: "desmos.posts.v3.Msg",
    methods: [
      Desmos_Posts_V3_MsgServerMetadata.Methods.createPost,
      Desmos_Posts_V3_MsgServerMetadata.Methods.editPost,
      Desmos_Posts_V3_MsgServerMetadata.Methods.deletePost,
      Desmos_Posts_V3_MsgServerMetadata.Methods.addPostAttachment,
      Desmos_Posts_V3_MsgServerMetadata.Methods.removePostAttachment,
      Desmos_Posts_V3_MsgServerMetadata.Methods.answerPoll,
      Desmos_Posts_V3_MsgServerMetadata.Methods.updateParams,
    ]
  )

  internal enum Methods {
    internal static let createPost = GRPCMethodDescriptor(
      name: "CreatePost",
      path: "/desmos.posts.v3.Msg/CreatePost",
      type: GRPCCallType.unary
    )

    internal static let editPost = GRPCMethodDescriptor(
      name: "EditPost",
      path: "/desmos.posts.v3.Msg/EditPost",
      type: GRPCCallType.unary
    )

    internal static let deletePost = GRPCMethodDescriptor(
      name: "DeletePost",
      path: "/desmos.posts.v3.Msg/DeletePost",
      type: GRPCCallType.unary
    )

    internal static let addPostAttachment = GRPCMethodDescriptor(
      name: "AddPostAttachment",
      path: "/desmos.posts.v3.Msg/AddPostAttachment",
      type: GRPCCallType.unary
    )

    internal static let removePostAttachment = GRPCMethodDescriptor(
      name: "RemovePostAttachment",
      path: "/desmos.posts.v3.Msg/RemovePostAttachment",
      type: GRPCCallType.unary
    )

    internal static let answerPoll = GRPCMethodDescriptor(
      name: "AnswerPoll",
      path: "/desmos.posts.v3.Msg/AnswerPoll",
      type: GRPCCallType.unary
    )

    internal static let updateParams = GRPCMethodDescriptor(
      name: "UpdateParams",
      path: "/desmos.posts.v3.Msg/UpdateParams",
      type: GRPCCallType.unary
    )
  }
}
