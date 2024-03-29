# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from quicksilver.interchainquery.v1 import query_pb2 as quicksilver_dot_interchainquery_dot_v1_dot_query__pb2


class QuerySrvrStub(object):
    """Query provides defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Queries = channel.unary_unary(
                '/quicksilver.interchainquery.v1.QuerySrvr/Queries',
                request_serializer=quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsRequest.SerializeToString,
                response_deserializer=quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsResponse.FromString,
                )


class QuerySrvrServicer(object):
    """Query provides defines the gRPC querier service.
    """

    def Queries(self, request, context):
        """Params returns the total set of minting parameters.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QuerySrvrServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Queries': grpc.unary_unary_rpc_method_handler(
                    servicer.Queries,
                    request_deserializer=quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsRequest.FromString,
                    response_serializer=quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'quicksilver.interchainquery.v1.QuerySrvr', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class QuerySrvr(object):
    """Query provides defines the gRPC querier service.
    """

    @staticmethod
    def Queries(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.interchainquery.v1.QuerySrvr/Queries',
            quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsRequest.SerializeToString,
            quicksilver_dot_interchainquery_dot_v1_dot_query__pb2.QueryRequestsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
