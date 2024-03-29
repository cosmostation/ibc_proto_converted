# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from xpla.reward.v1beta1 import query_pb2 as xpla_dot_reward_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service for reward module.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/xpla.reward.v1beta1.Query/Params',
                request_serializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Pool = channel.unary_unary(
                '/xpla.reward.v1beta1.Query/Pool',
                request_serializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolRequest.SerializeToString,
                response_deserializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service for reward module.
    """

    def Params(self, request, context):
        """Params queries params of the reward module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Pool(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Pool': grpc.unary_unary_rpc_method_handler(
                    servicer.Pool,
                    request_deserializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolRequest.FromString,
                    response_serializer=xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'xpla.reward.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service for reward module.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/xpla.reward.v1beta1.Query/Params',
            xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Pool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/xpla.reward.v1beta1.Query/Pool',
            xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolRequest.SerializeToString,
            xpla_dot_reward_dot_v1beta1_dot_query__pb2.QueryPoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
