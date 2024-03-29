# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from neutron.interchainqueries import query_pb2 as neutron_dot_interchainqueries_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/neutron.interchainqueries.Query/Params',
                request_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.RegisteredQueries = channel.unary_unary(
                '/neutron.interchainqueries.Query/RegisteredQueries',
                request_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesRequest.SerializeToString,
                response_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesResponse.FromString,
                )
        self.RegisteredQuery = channel.unary_unary(
                '/neutron.interchainqueries.Query/RegisteredQuery',
                request_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryRequest.SerializeToString,
                response_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResponse.FromString,
                )
        self.QueryResult = channel.unary_unary(
                '/neutron.interchainqueries.Query/QueryResult',
                request_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultRequest.SerializeToString,
                response_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultResponse.FromString,
                )
        self.LastRemoteHeight = channel.unary_unary(
                '/neutron.interchainqueries.Query/LastRemoteHeight',
                request_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeight.SerializeToString,
                response_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeightResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Parameters queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RegisteredQueries(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RegisteredQuery(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryResult(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LastRemoteHeight(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'RegisteredQueries': grpc.unary_unary_rpc_method_handler(
                    servicer.RegisteredQueries,
                    request_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesRequest.FromString,
                    response_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesResponse.SerializeToString,
            ),
            'RegisteredQuery': grpc.unary_unary_rpc_method_handler(
                    servicer.RegisteredQuery,
                    request_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryRequest.FromString,
                    response_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResponse.SerializeToString,
            ),
            'QueryResult': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryResult,
                    request_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultRequest.FromString,
                    response_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultResponse.SerializeToString,
            ),
            'LastRemoteHeight': grpc.unary_unary_rpc_method_handler(
                    servicer.LastRemoteHeight,
                    request_deserializer=neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeight.FromString,
                    response_serializer=neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeightResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'neutron.interchainqueries.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
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
        return grpc.experimental.unary_unary(request, target, '/neutron.interchainqueries.Query/Params',
            neutron_dot_interchainqueries_dot_query__pb2.QueryParamsRequest.SerializeToString,
            neutron_dot_interchainqueries_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RegisteredQueries(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.interchainqueries.Query/RegisteredQueries',
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesRequest.SerializeToString,
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueriesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RegisteredQuery(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.interchainqueries.Query/RegisteredQuery',
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryRequest.SerializeToString,
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryResult(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.interchainqueries.Query/QueryResult',
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultRequest.SerializeToString,
            neutron_dot_interchainqueries_dot_query__pb2.QueryRegisteredQueryResultResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LastRemoteHeight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.interchainqueries.Query/LastRemoteHeight',
            neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeight.SerializeToString,
            neutron_dot_interchainqueries_dot_query__pb2.QueryLastRemoteHeightResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
