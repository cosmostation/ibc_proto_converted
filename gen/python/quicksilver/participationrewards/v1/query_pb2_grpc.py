# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from quicksilver.participationrewards.v1 import query_pb2 as quicksilver_dot_participationrewards_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query provides defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/quicksilver.participationrewards.v1.Query/Params',
                request_serializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.ProtocolData = channel.unary_unary(
                '/quicksilver.participationrewards.v1.Query/ProtocolData',
                request_serializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataRequest.SerializeToString,
                response_deserializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataResponse.FromString,
                )


class QueryServicer(object):
    """Query provides defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params returns the total set of participation rewards parameters.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ProtocolData(self, request, context):
        """ProtocolData returns the requested protocol data.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'ProtocolData': grpc.unary_unary_rpc_method_handler(
                    servicer.ProtocolData,
                    request_deserializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataRequest.FromString,
                    response_serializer=quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'quicksilver.participationrewards.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query provides defines the gRPC querier service.
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
        return grpc.experimental.unary_unary(request, target, '/quicksilver.participationrewards.v1.Query/Params',
            quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ProtocolData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.participationrewards.v1.Query/ProtocolData',
            quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataRequest.SerializeToString,
            quicksilver_dot_participationrewards_dot_v1_dot_query__pb2.QueryProtocolDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
