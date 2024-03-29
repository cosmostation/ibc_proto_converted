# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from teritori.airdrop.v1beta1 import query_pb2 as teritori_dot_airdrop_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Allocation = channel.unary_unary(
                '/teritori.airdrop.v1beta1.Query/Allocation',
                request_serializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationRequest.SerializeToString,
                response_deserializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationResponse.FromString,
                )
        self.Params = channel.unary_unary(
                '/teritori.airdrop.v1beta1.Query/Params',
                request_serializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Allocation(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Params(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Allocation': grpc.unary_unary_rpc_method_handler(
                    servicer.Allocation,
                    request_deserializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationRequest.FromString,
                    response_serializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationResponse.SerializeToString,
            ),
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'teritori.airdrop.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Allocation(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/teritori.airdrop.v1beta1.Query/Allocation',
            teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationRequest.SerializeToString,
            teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryAllocationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

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
        return grpc.experimental.unary_unary(request, target, '/teritori.airdrop.v1beta1.Query/Params',
            teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            teritori_dot_airdrop_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
