# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.liquidstaking.v1beta1 import query_pb2 as crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC query service for the liquidstaking module.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Query/Params',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.LiquidValidators = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Query/LiquidValidators',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsResponse.FromString,
                )
        self.VotingPower = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Query/VotingPower',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerResponse.FromString,
                )
        self.States = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Query/States',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesRequest.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC query service for the liquidstaking module.
    """

    def Params(self, request, context):
        """Params returns parameters of the liquidstaking module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LiquidValidators(self, request, context):
        """LiquidValidators returns liquid validators with states of the liquidstaking module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def VotingPower(self, request, context):
        """VotingPower returns voting power of staking and liquid staking module's of the voter that can be exercised.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def States(self, request, context):
        """States returns states of the liquidstaking module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'LiquidValidators': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidValidators,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsRequest.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsResponse.SerializeToString,
            ),
            'VotingPower': grpc.unary_unary_rpc_method_handler(
                    servicer.VotingPower,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerRequest.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerResponse.SerializeToString,
            ),
            'States': grpc.unary_unary_rpc_method_handler(
                    servicer.States,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesRequest.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.liquidstaking.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC query service for the liquidstaking module.
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
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Query/Params',
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LiquidValidators(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Query/LiquidValidators',
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsRequest.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryLiquidValidatorsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def VotingPower(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Query/VotingPower',
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerRequest.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryVotingPowerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def States(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Query/States',
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesRequest.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_query__pb2.QueryStatesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
