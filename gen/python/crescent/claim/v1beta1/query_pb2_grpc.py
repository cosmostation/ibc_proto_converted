# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.claim.v1beta1 import query_pb2 as crescent_dot_claim_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Airdrops = channel.unary_unary(
                '/crescent.claim.v1beta1.Query/Airdrops',
                request_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsRequest.SerializeToString,
                response_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsResponse.FromString,
                )
        self.Airdrop = channel.unary_unary(
                '/crescent.claim.v1beta1.Query/Airdrop',
                request_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropRequest.SerializeToString,
                response_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropResponse.FromString,
                )
        self.ClaimRecord = channel.unary_unary(
                '/crescent.claim.v1beta1.Query/ClaimRecord',
                request_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordRequest.SerializeToString,
                response_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Airdrops(self, request, context):
        """Airdrops returns all airdrops.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Airdrop(self, request, context):
        """Airdrop returns the specific airdrop.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimRecord(self, request, context):
        """ClaimRecord returns the claim record for the recipient address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Airdrops': grpc.unary_unary_rpc_method_handler(
                    servicer.Airdrops,
                    request_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsRequest.FromString,
                    response_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsResponse.SerializeToString,
            ),
            'Airdrop': grpc.unary_unary_rpc_method_handler(
                    servicer.Airdrop,
                    request_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropRequest.FromString,
                    response_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropResponse.SerializeToString,
            ),
            'ClaimRecord': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimRecord,
                    request_deserializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordRequest.FromString,
                    response_serializer=crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.claim.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Airdrops(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.claim.v1beta1.Query/Airdrops',
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsRequest.SerializeToString,
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Airdrop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.claim.v1beta1.Query/Airdrop',
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropRequest.SerializeToString,
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryAirdropResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/crescent.claim.v1beta1.Query/ClaimRecord',
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordRequest.SerializeToString,
            crescent_dot_claim_dot_v1beta1_dot_query__pb2.QueryClaimRecordResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)