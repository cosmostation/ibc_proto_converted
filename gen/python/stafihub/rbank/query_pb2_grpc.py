# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stafihub.rbank import query_pb2 as stafihub_dot_rbank_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/stafihub.stafihub.rbank.Query/Params',
                request_serializer=stafihub_dot_rbank_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=stafihub_dot_rbank_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.AddressPrefix = channel.unary_unary(
                '/stafihub.stafihub.rbank.Query/AddressPrefix',
                request_serializer=stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixRequest.SerializeToString,
                response_deserializer=stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixResponse.FromString,
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

    def AddressPrefix(self, request, context):
        """Queries a list of AddressPrefix items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=stafihub_dot_rbank_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=stafihub_dot_rbank_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'AddressPrefix': grpc.unary_unary_rpc_method_handler(
                    servicer.AddressPrefix,
                    request_deserializer=stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixRequest.FromString,
                    response_serializer=stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stafihub.stafihub.rbank.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rbank.Query/Params',
            stafihub_dot_rbank_dot_query__pb2.QueryParamsRequest.SerializeToString,
            stafihub_dot_rbank_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddressPrefix(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rbank.Query/AddressPrefix',
            stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixRequest.SerializeToString,
            stafihub_dot_rbank_dot_query__pb2.QueryAddressPrefixResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
