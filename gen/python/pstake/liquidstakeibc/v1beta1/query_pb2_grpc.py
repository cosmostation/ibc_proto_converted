# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from pstake.liquidstakeibc.v1beta1 import query_pb2 as pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/Params',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.HostChain = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/HostChain',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainResponse.FromString,
                )
        self.HostChains = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/HostChains',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsResponse.FromString,
                )
        self.Deposits = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/Deposits',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsResponse.FromString,
                )
        self.LSMDeposits = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/LSMDeposits',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsResponse.FromString,
                )
        self.Unbondings = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/Unbondings',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsResponse.FromString,
                )
        self.Unbonding = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/Unbonding',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingResponse.FromString,
                )
        self.UserUnbondings = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/UserUnbondings',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsResponse.FromString,
                )
        self.ValidatorUnbondings = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/ValidatorUnbondings',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingResponse.FromString,
                )
        self.DepositAccountBalance = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/DepositAccountBalance',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceResponse.FromString,
                )
        self.ExchangeRate = channel.unary_unary(
                '/pstake.liquidstakeibc.v1beta1.Query/ExchangeRate',
                request_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.SerializeToString,
                response_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def HostChain(self, request, context):
        """Queries a HostChain by id.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def HostChains(self, request, context):
        """Queries for all the HostChains.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Deposits(self, request, context):
        """Queries for all the deposits for a host chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LSMDeposits(self, request, context):
        """Queries for all the deposits for a host chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Unbondings(self, request, context):
        """Queries all unbondings for a host chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Unbonding(self, request, context):
        """Queries an unbonding for a host chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserUnbondings(self, request, context):
        """Queries all unbondings for a delegator address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ValidatorUnbondings(self, request, context):
        """Queries all validator unbondings for a host chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DepositAccountBalance(self, request, context):
        """Queries for a host chain deposit account balance.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ExchangeRate(self, request, context):
        """Queries for a host chain exchange rate between the host token and the stk token.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'HostChain': grpc.unary_unary_rpc_method_handler(
                    servicer.HostChain,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainResponse.SerializeToString,
            ),
            'HostChains': grpc.unary_unary_rpc_method_handler(
                    servicer.HostChains,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsResponse.SerializeToString,
            ),
            'Deposits': grpc.unary_unary_rpc_method_handler(
                    servicer.Deposits,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsResponse.SerializeToString,
            ),
            'LSMDeposits': grpc.unary_unary_rpc_method_handler(
                    servicer.LSMDeposits,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsResponse.SerializeToString,
            ),
            'Unbondings': grpc.unary_unary_rpc_method_handler(
                    servicer.Unbondings,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsResponse.SerializeToString,
            ),
            'Unbonding': grpc.unary_unary_rpc_method_handler(
                    servicer.Unbonding,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingResponse.SerializeToString,
            ),
            'UserUnbondings': grpc.unary_unary_rpc_method_handler(
                    servicer.UserUnbondings,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsResponse.SerializeToString,
            ),
            'ValidatorUnbondings': grpc.unary_unary_rpc_method_handler(
                    servicer.ValidatorUnbondings,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingResponse.SerializeToString,
            ),
            'DepositAccountBalance': grpc.unary_unary_rpc_method_handler(
                    servicer.DepositAccountBalance,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceResponse.SerializeToString,
            ),
            'ExchangeRate': grpc.unary_unary_rpc_method_handler(
                    servicer.ExchangeRate,
                    request_deserializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.FromString,
                    response_serializer=pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'pstake.liquidstakeibc.v1beta1.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/Params',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def HostChain(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/HostChain',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def HostChains(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/HostChains',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryHostChainsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Deposits(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/Deposits',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LSMDeposits(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/LSMDeposits',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryLSMDepositsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Unbondings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/Unbondings',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Unbonding(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/Unbonding',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUnbondingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserUnbondings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/UserUnbondings',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryUserUnbondingsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ValidatorUnbondings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/ValidatorUnbondings',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryValidatorUnbondingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DepositAccountBalance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/DepositAccountBalance',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryDepositAccountBalanceResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/pstake.liquidstakeibc.v1beta1.Query/ExchangeRate',
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateRequest.SerializeToString,
            pstake_dot_liquidstakeibc_dot_v1beta1_dot_query__pb2.QueryExchangeRateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
