# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.liquidfarming.v1beta1 import query_pb2 as crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/Params',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.LiquidFarms = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/LiquidFarms',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsResponse.FromString,
                )
        self.LiquidFarm = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/LiquidFarm',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmResponse.FromString,
                )
        self.RewardsAuctions = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/RewardsAuctions',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsResponse.FromString,
                )
        self.RewardsAuction = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/RewardsAuction',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionResponse.FromString,
                )
        self.Bids = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/Bids',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsResponse.FromString,
                )
        self.Rewards = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/Rewards',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsResponse.FromString,
                )
        self.ExchangeRate = channel.unary_unary(
                '/crescent.liquidfarming.v1beta1.Query/ExchangeRate',
                request_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params returns parameters of the module
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LiquidFarms(self, request, context):
        """LiquidFarms returns all liquid farms registered in params
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LiquidFarm(self, request, context):
        """LiquidFarm returns the specific liquid farm
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RewardsAuctions(self, request, context):
        """RewardsAuctions returns all rewards auctions that correspond to the given pool id
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RewardsAuction(self, request, context):
        """RewardsAuction returns the specific rewards auction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Bids(self, request, context):
        """Bids returns all bids for the liquid farm
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Rewards(self, request, context):
        """Rewards returns all accumulated farming rewards for the liquid farm
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ExchangeRate(self, request, context):
        """ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'LiquidFarms': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidFarms,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsResponse.SerializeToString,
            ),
            'LiquidFarm': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidFarm,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmResponse.SerializeToString,
            ),
            'RewardsAuctions': grpc.unary_unary_rpc_method_handler(
                    servicer.RewardsAuctions,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsResponse.SerializeToString,
            ),
            'RewardsAuction': grpc.unary_unary_rpc_method_handler(
                    servicer.RewardsAuction,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionResponse.SerializeToString,
            ),
            'Bids': grpc.unary_unary_rpc_method_handler(
                    servicer.Bids,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsResponse.SerializeToString,
            ),
            'Rewards': grpc.unary_unary_rpc_method_handler(
                    servicer.Rewards,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsResponse.SerializeToString,
            ),
            'ExchangeRate': grpc.unary_unary_rpc_method_handler(
                    servicer.ExchangeRate,
                    request_deserializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.FromString,
                    response_serializer=crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.liquidfarming.v1beta1.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/Params',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LiquidFarms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/LiquidFarms',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LiquidFarm(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/LiquidFarm',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryLiquidFarmResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RewardsAuctions(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/RewardsAuctions',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RewardsAuction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/RewardsAuction',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsAuctionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Bids(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/Bids',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryBidsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Rewards(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/Rewards',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryRewardsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ExchangeRate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidfarming.v1beta1.Query/ExchangeRate',
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.SerializeToString,
            crescent_dot_liquidfarming_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
