# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from cryptoorg.nft_transfer.v1 import query_pb2 as cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query provides defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ClassTrace = channel.unary_unary(
                '/chainmain.nft_transfer.v1.Query/ClassTrace',
                request_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceResponse.FromString,
                )
        self.ClassTraces = channel.unary_unary(
                '/chainmain.nft_transfer.v1.Query/ClassTraces',
                request_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesResponse.FromString,
                )
        self.ClassHash = channel.unary_unary(
                '/chainmain.nft_transfer.v1.Query/ClassHash',
                request_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashResponse.FromString,
                )
        self.EscrowAddress = channel.unary_unary(
                '/chainmain.nft_transfer.v1.Query/EscrowAddress',
                request_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressRequest.SerializeToString,
                response_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressResponse.FromString,
                )


class QueryServicer(object):
    """Query provides defines the gRPC querier service.
    """

    def ClassTrace(self, request, context):
        """ClassTrace queries a class trace information.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClassTraces(self, request, context):
        """ClassTraces queries all class traces.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClassHash(self, request, context):
        """ClassHash queries a class hash information.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EscrowAddress(self, request, context):
        """EscrowAddress returns the escrow address for a particular port and channel id.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ClassTrace': grpc.unary_unary_rpc_method_handler(
                    servicer.ClassTrace,
                    request_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceRequest.FromString,
                    response_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceResponse.SerializeToString,
            ),
            'ClassTraces': grpc.unary_unary_rpc_method_handler(
                    servicer.ClassTraces,
                    request_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesRequest.FromString,
                    response_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesResponse.SerializeToString,
            ),
            'ClassHash': grpc.unary_unary_rpc_method_handler(
                    servicer.ClassHash,
                    request_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashRequest.FromString,
                    response_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashResponse.SerializeToString,
            ),
            'EscrowAddress': grpc.unary_unary_rpc_method_handler(
                    servicer.EscrowAddress,
                    request_deserializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressRequest.FromString,
                    response_serializer=cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'chainmain.nft_transfer.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query provides defines the gRPC querier service.
    """

    @staticmethod
    def ClassTrace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.nft_transfer.v1.Query/ClassTrace',
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceRequest.SerializeToString,
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTraceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClassTraces(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.nft_transfer.v1.Query/ClassTraces',
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesRequest.SerializeToString,
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassTracesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClassHash(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.nft_transfer.v1.Query/ClassHash',
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashRequest.SerializeToString,
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryClassHashResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EscrowAddress(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/chainmain.nft_transfer.v1.Query/EscrowAddress',
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressRequest.SerializeToString,
            cryptoorg_dot_nft__transfer_dot_v1_dot_query__pb2.QueryEscrowAddressResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
