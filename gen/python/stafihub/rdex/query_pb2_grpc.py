# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stafihub.rdex import query_pb2 as stafihub_dot_rdex_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/Params',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.SwapPoolInfo = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/SwapPoolInfo',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoResponse.FromString,
                )
        self.SwapPoolList = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/SwapPoolList',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListResponse.FromString,
                )
        self.ProviderList = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/ProviderList',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderListRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderListResponse.FromString,
                )
        self.PoolCreatorList = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/PoolCreatorList',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListResponse.FromString,
                )
        self.ProviderSwitch = channel.unary_unary(
                '/stafihub.stafihub.rdex.Query/ProviderSwitch',
                request_serializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchRequest.SerializeToString,
                response_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchResponse.FromString,
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

    def SwapPoolInfo(self, request, context):
        """Queries a list of SwapPoolInfo items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SwapPoolList(self, request, context):
        """Queries a list of SwapPoolList items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ProviderList(self, request, context):
        """Queries a list of ProviderList items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PoolCreatorList(self, request, context):
        """Queries a list of PoolCreatorList items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ProviderSwitch(self, request, context):
        """Queries a list of ProviderSwitch items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'SwapPoolInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.SwapPoolInfo,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoResponse.SerializeToString,
            ),
            'SwapPoolList': grpc.unary_unary_rpc_method_handler(
                    servicer.SwapPoolList,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListResponse.SerializeToString,
            ),
            'ProviderList': grpc.unary_unary_rpc_method_handler(
                    servicer.ProviderList,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderListRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderListResponse.SerializeToString,
            ),
            'PoolCreatorList': grpc.unary_unary_rpc_method_handler(
                    servicer.PoolCreatorList,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListResponse.SerializeToString,
            ),
            'ProviderSwitch': grpc.unary_unary_rpc_method_handler(
                    servicer.ProviderSwitch,
                    request_deserializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchRequest.FromString,
                    response_serializer=stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stafihub.stafihub.rdex.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/Params',
            stafihub_dot_rdex_dot_query__pb2.QueryParamsRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SwapPoolInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/SwapPoolInfo',
            stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolInfoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SwapPoolList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/SwapPoolList',
            stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QuerySwapPoolListResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ProviderList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/ProviderList',
            stafihub_dot_rdex_dot_query__pb2.QueryProviderListRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QueryProviderListResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PoolCreatorList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/PoolCreatorList',
            stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QueryPoolCreatorListResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ProviderSwitch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rdex.Query/ProviderSwitch',
            stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchRequest.SerializeToString,
            stafihub_dot_rdex_dot_query__pb2.QueryProviderSwitchResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)