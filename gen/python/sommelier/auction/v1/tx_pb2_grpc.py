# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from sommelier.auction.v1 import tx_pb2 as sommelier_dot_auction_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SubmitBid = channel.unary_unary(
                '/auction.v1.Msg/SubmitBid',
                request_serializer=sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidRequest.SerializeToString,
                response_deserializer=sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidResponse.FromString,
                )


class MsgServicer(object):
    """Missing associated documentation comment in .proto file."""

    def SubmitBid(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SubmitBid': grpc.unary_unary_rpc_method_handler(
                    servicer.SubmitBid,
                    request_deserializer=sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidRequest.FromString,
                    response_serializer=sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'auction.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def SubmitBid(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/auction.v1.Msg/SubmitBid',
            sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidRequest.SerializeToString,
            sommelier_dot_auction_dot_v1_dot_tx__pb2.MsgSubmitBidResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)