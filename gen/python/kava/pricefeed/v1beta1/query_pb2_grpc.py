# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kava.pricefeed.v1beta1 import query_pb2 as kava_dot_pricefeed_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service for pricefeed module
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/Params',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Price = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/Price',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceResponse.FromString,
                )
        self.Prices = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/Prices',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesResponse.FromString,
                )
        self.RawPrices = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/RawPrices',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesResponse.FromString,
                )
        self.Oracles = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/Oracles',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesResponse.FromString,
                )
        self.Markets = channel.unary_unary(
                '/kava.pricefeed.v1beta1.Query/Markets',
                request_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsRequest.SerializeToString,
                response_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service for pricefeed module
    """

    def Params(self, request, context):
        """Params queries all parameters of the pricefeed module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Price(self, request, context):
        """Price queries price details based on a market
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Prices(self, request, context):
        """Prices queries all prices
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RawPrices(self, request, context):
        """RawPrices queries all raw prices based on a market
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Oracles(self, request, context):
        """Oracles queries all oracles based on a market
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Markets(self, request, context):
        """Markets queries all markets
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Price': grpc.unary_unary_rpc_method_handler(
                    servicer.Price,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceResponse.SerializeToString,
            ),
            'Prices': grpc.unary_unary_rpc_method_handler(
                    servicer.Prices,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesResponse.SerializeToString,
            ),
            'RawPrices': grpc.unary_unary_rpc_method_handler(
                    servicer.RawPrices,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesResponse.SerializeToString,
            ),
            'Oracles': grpc.unary_unary_rpc_method_handler(
                    servicer.Oracles,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesResponse.SerializeToString,
            ),
            'Markets': grpc.unary_unary_rpc_method_handler(
                    servicer.Markets,
                    request_deserializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsRequest.FromString,
                    response_serializer=kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kava.pricefeed.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service for pricefeed module
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
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/Params',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Price(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/Price',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPriceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Prices(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/Prices',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryPricesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RawPrices(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/RawPrices',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryRawPricesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Oracles(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/Oracles',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryOraclesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Markets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.pricefeed.v1beta1.Query/Markets',
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsRequest.SerializeToString,
            kava_dot_pricefeed_dot_v1beta1_dot_query__pb2.QueryMarketsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)