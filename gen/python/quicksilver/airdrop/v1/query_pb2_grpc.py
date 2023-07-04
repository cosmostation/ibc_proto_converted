# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from quicksilver.airdrop.v1 import query_pb2 as quicksilver_dot_airdrop_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query provides defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/Params',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.ZoneDrop = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/ZoneDrop',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropResponse.FromString,
                )
        self.AccountBalance = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/AccountBalance',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceResponse.FromString,
                )
        self.ZoneDrops = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/ZoneDrops',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsResponse.FromString,
                )
        self.ClaimRecord = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/ClaimRecord',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordResponse.FromString,
                )
        self.ClaimRecords = channel.unary_unary(
                '/quicksilver.airdrop.v1.Query/ClaimRecords',
                request_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsRequest.SerializeToString,
                response_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsResponse.FromString,
                )


class QueryServicer(object):
    """Query provides defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params returns the total set of airdrop parameters.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ZoneDrop(self, request, context):
        """ZoneDrop returns the details of the specified zone airdrop.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountBalance(self, request, context):
        """AccountBalance returns the module account balance of the specified zone.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ZoneDrops(self, request, context):
        """ZoneDrops returns all zone airdrops of the specified status.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimRecord(self, request, context):
        """ClaimRecord returns the claim record that corresponds to the given zone and
        address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimRecords(self, request, context):
        """ClaimRecords returns all the claim records of the given zone.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'ZoneDrop': grpc.unary_unary_rpc_method_handler(
                    servicer.ZoneDrop,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropResponse.SerializeToString,
            ),
            'AccountBalance': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountBalance,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceResponse.SerializeToString,
            ),
            'ZoneDrops': grpc.unary_unary_rpc_method_handler(
                    servicer.ZoneDrops,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsResponse.SerializeToString,
            ),
            'ClaimRecord': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimRecord,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordResponse.SerializeToString,
            ),
            'ClaimRecords': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimRecords,
                    request_deserializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsRequest.FromString,
                    response_serializer=quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'quicksilver.airdrop.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query provides defines the gRPC querier service.
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
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/Params',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ZoneDrop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/ZoneDrop',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountBalance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/AccountBalance',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryAccountBalanceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ZoneDrops(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/ZoneDrops',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryZoneDropsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClaimRecord(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/ClaimRecord',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClaimRecords(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.airdrop.v1.Query/ClaimRecords',
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsRequest.SerializeToString,
            quicksilver_dot_airdrop_dot_v1_dot_query__pb2.QueryClaimRecordsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)