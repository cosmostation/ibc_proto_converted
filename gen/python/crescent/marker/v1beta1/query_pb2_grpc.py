# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.marker.v1beta1 import query_pb2 as crescent_dot_marker_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/crescent.marker.v1beta1.Query/Params',
                request_serializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.LastBlockTime = channel.unary_unary(
                '/crescent.marker.v1beta1.Query/LastBlockTime',
                request_serializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeRequest.SerializeToString,
                response_deserializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Params(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LastBlockTime(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'LastBlockTime': grpc.unary_unary_rpc_method_handler(
                    servicer.LastBlockTime,
                    request_deserializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeRequest.FromString,
                    response_serializer=crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.marker.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

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
        return grpc.experimental.unary_unary(request, target, '/crescent.marker.v1beta1.Query/Params',
            crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LastBlockTime(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.marker.v1beta1.Query/LastBlockTime',
            crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeRequest.SerializeToString,
            crescent_dot_marker_dot_v1beta1_dot_query__pb2.QueryLastBlockTimeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
