# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from sentinel.node.v2 import msg_pb2 as sentinel_dot_node_dot_v2_dot_msg__pb2


class MsgServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.MsgRegister = channel.unary_unary(
                '/sentinel.node.v2.MsgService/MsgRegister',
                request_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterRequest.SerializeToString,
                response_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterResponse.FromString,
                )
        self.MsgUpdateDetails = channel.unary_unary(
                '/sentinel.node.v2.MsgService/MsgUpdateDetails',
                request_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsRequest.SerializeToString,
                response_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsResponse.FromString,
                )
        self.MsgUpdateStatus = channel.unary_unary(
                '/sentinel.node.v2.MsgService/MsgUpdateStatus',
                request_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusRequest.SerializeToString,
                response_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusResponse.FromString,
                )
        self.MsgSubscribe = channel.unary_unary(
                '/sentinel.node.v2.MsgService/MsgSubscribe',
                request_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeRequest.SerializeToString,
                response_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeResponse.FromString,
                )


class MsgServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def MsgRegister(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MsgUpdateDetails(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MsgUpdateStatus(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MsgSubscribe(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'MsgRegister': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgRegister,
                    request_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterRequest.FromString,
                    response_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterResponse.SerializeToString,
            ),
            'MsgUpdateDetails': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgUpdateDetails,
                    request_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsRequest.FromString,
                    response_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsResponse.SerializeToString,
            ),
            'MsgUpdateStatus': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgUpdateStatus,
                    request_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusRequest.FromString,
                    response_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusResponse.SerializeToString,
            ),
            'MsgSubscribe': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgSubscribe,
                    request_deserializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeRequest.FromString,
                    response_serializer=sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'sentinel.node.v2.MsgService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class MsgService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def MsgRegister(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.node.v2.MsgService/MsgRegister',
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterRequest.SerializeToString,
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgRegisterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MsgUpdateDetails(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.node.v2.MsgService/MsgUpdateDetails',
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsRequest.SerializeToString,
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateDetailsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MsgUpdateStatus(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.node.v2.MsgService/MsgUpdateStatus',
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusRequest.SerializeToString,
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgUpdateStatusResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MsgSubscribe(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.node.v2.MsgService/MsgSubscribe',
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeRequest.SerializeToString,
            sentinel_dot_node_dot_v2_dot_msg__pb2.MsgSubscribeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
