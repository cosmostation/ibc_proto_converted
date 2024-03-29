# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kyve.query.v1beta1 import account_pb2 as kyve_dot_query_dot_v1beta1_dot_account__pb2


class QueryAccountStub(object):
    """QueryDelegation contains all rpc requests related to direct delegation data
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AccountAssets = channel.unary_unary(
                '/kyve.query.v1beta1.QueryAccount/AccountAssets',
                request_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsRequest.SerializeToString,
                response_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsResponse.FromString,
                )
        self.AccountDelegationUnbondings = channel.unary_unary(
                '/kyve.query.v1beta1.QueryAccount/AccountDelegationUnbondings',
                request_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsRequest.SerializeToString,
                response_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsResponse.FromString,
                )
        self.AccountFundedList = channel.unary_unary(
                '/kyve.query.v1beta1.QueryAccount/AccountFundedList',
                request_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListRequest.SerializeToString,
                response_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListResponse.FromString,
                )
        self.AccountRedelegation = channel.unary_unary(
                '/kyve.query.v1beta1.QueryAccount/AccountRedelegation',
                request_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationRequest.SerializeToString,
                response_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationResponse.FromString,
                )


class QueryAccountServicer(object):
    """QueryDelegation contains all rpc requests related to direct delegation data
    """

    def AccountAssets(self, request, context):
        """AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountDelegationUnbondings(self, request, context):
        """AccountDelegationUnbondings ...
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountFundedList(self, request, context):
        """AccountFundedList returns all pools the given user has funded into.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountRedelegation(self, request, context):
        """AccountRedelegation ...
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryAccountServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AccountAssets': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountAssets,
                    request_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsRequest.FromString,
                    response_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsResponse.SerializeToString,
            ),
            'AccountDelegationUnbondings': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountDelegationUnbondings,
                    request_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsRequest.FromString,
                    response_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsResponse.SerializeToString,
            ),
            'AccountFundedList': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountFundedList,
                    request_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListRequest.FromString,
                    response_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListResponse.SerializeToString,
            ),
            'AccountRedelegation': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountRedelegation,
                    request_deserializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationRequest.FromString,
                    response_serializer=kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kyve.query.v1beta1.QueryAccount', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class QueryAccount(object):
    """QueryDelegation contains all rpc requests related to direct delegation data
    """

    @staticmethod
    def AccountAssets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kyve.query.v1beta1.QueryAccount/AccountAssets',
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsRequest.SerializeToString,
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountAssetsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountDelegationUnbondings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kyve.query.v1beta1.QueryAccount/AccountDelegationUnbondings',
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsRequest.SerializeToString,
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountDelegationUnbondingsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountFundedList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kyve.query.v1beta1.QueryAccount/AccountFundedList',
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListRequest.SerializeToString,
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountFundedListResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountRedelegation(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kyve.query.v1beta1.QueryAccount/AccountRedelegation',
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationRequest.SerializeToString,
            kyve_dot_query_dot_v1beta1_dot_account__pb2.QueryAccountRedelegationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
