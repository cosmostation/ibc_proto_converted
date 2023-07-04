# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from cryptoorg.supply.v1 import query_pb2 as cryptoorg_dot_supply_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.TotalSupply = channel.unary_unary(
                '/chainmain.supply.v1.Query/TotalSupply',
                request_serializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.FromString,
                )
        self.LiquidSupply = channel.unary_unary(
                '/chainmain.supply.v1.Query/LiquidSupply',
                request_serializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def TotalSupply(self, request, context):
        """TotalSupply queries the total supply of all coins.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LiquidSupply(self, request, context):
        """LiquidSupply queries the liquid supply of all coins.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'TotalSupply': grpc.unary_unary_rpc_method_handler(
                    servicer.TotalSupply,
                    request_deserializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.FromString,
                    response_serializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.SerializeToString,
            ),
            'LiquidSupply': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidSupply,
                    request_deserializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.FromString,
                    response_serializer=cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'chainmain.supply.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def TotalSupply(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.supply.v1.Query/TotalSupply',
            cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.SerializeToString,
            cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LiquidSupply(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.supply.v1.Query/LiquidSupply',
            cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyRequest.SerializeToString,
            cryptoorg_dot_supply_dot_v1_dot_query__pb2.SupplyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)