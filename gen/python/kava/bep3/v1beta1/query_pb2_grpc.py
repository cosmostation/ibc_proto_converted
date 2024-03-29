# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kava.bep3.v1beta1 import query_pb2 as kava_dot_bep3_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service for bep3 module
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/kava.bep3.v1beta1.Query/Params',
                request_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.AssetSupply = channel.unary_unary(
                '/kava.bep3.v1beta1.Query/AssetSupply',
                request_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyRequest.SerializeToString,
                response_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyResponse.FromString,
                )
        self.AssetSupplies = channel.unary_unary(
                '/kava.bep3.v1beta1.Query/AssetSupplies',
                request_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesRequest.SerializeToString,
                response_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesResponse.FromString,
                )
        self.AtomicSwap = channel.unary_unary(
                '/kava.bep3.v1beta1.Query/AtomicSwap',
                request_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapRequest.SerializeToString,
                response_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapResponse.FromString,
                )
        self.AtomicSwaps = channel.unary_unary(
                '/kava.bep3.v1beta1.Query/AtomicSwaps',
                request_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsRequest.SerializeToString,
                response_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service for bep3 module
    """

    def Params(self, request, context):
        """Params queries module params
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AssetSupply(self, request, context):
        """AssetSupply queries info about an asset's supply
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AssetSupplies(self, request, context):
        """AssetSupplies queries a list of asset supplies
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AtomicSwap(self, request, context):
        """AtomicSwap queries info about an atomic swap
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AtomicSwaps(self, request, context):
        """AtomicSwaps queries a list of atomic swaps
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'AssetSupply': grpc.unary_unary_rpc_method_handler(
                    servicer.AssetSupply,
                    request_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyRequest.FromString,
                    response_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyResponse.SerializeToString,
            ),
            'AssetSupplies': grpc.unary_unary_rpc_method_handler(
                    servicer.AssetSupplies,
                    request_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesRequest.FromString,
                    response_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesResponse.SerializeToString,
            ),
            'AtomicSwap': grpc.unary_unary_rpc_method_handler(
                    servicer.AtomicSwap,
                    request_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapRequest.FromString,
                    response_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapResponse.SerializeToString,
            ),
            'AtomicSwaps': grpc.unary_unary_rpc_method_handler(
                    servicer.AtomicSwaps,
                    request_deserializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsRequest.FromString,
                    response_serializer=kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kava.bep3.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service for bep3 module
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
        return grpc.experimental.unary_unary(request, target, '/kava.bep3.v1beta1.Query/Params',
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AssetSupply(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.bep3.v1beta1.Query/AssetSupply',
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyRequest.SerializeToString,
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSupplyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AssetSupplies(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.bep3.v1beta1.Query/AssetSupplies',
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesRequest.SerializeToString,
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAssetSuppliesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AtomicSwap(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.bep3.v1beta1.Query/AtomicSwap',
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapRequest.SerializeToString,
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AtomicSwaps(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.bep3.v1beta1.Query/AtomicSwaps',
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsRequest.SerializeToString,
            kava_dot_bep3_dot_v1beta1_dot_query__pb2.QueryAtomicSwapsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
