# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from assetmantle.assets.transactions.mint import message_pb2 as assetmantle_dot_assets_dot_transactions_dot_mint_dot_message__pb2
from assetmantle.assets.transactions.mint import transaction_response_pb2 as assetmantle_dot_assets_dot_transactions_dot_mint_dot_transaction__response__pb2


class ServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Handle = channel.unary_unary(
                '/assetmantle.modules.assets.transactions.mint.Service/Handle',
                request_serializer=assetmantle_dot_assets_dot_transactions_dot_mint_dot_message__pb2.Message.SerializeToString,
                response_deserializer=assetmantle_dot_assets_dot_transactions_dot_mint_dot_transaction__response__pb2.TransactionResponse.FromString,
                )


class ServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Handle(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Handle': grpc.unary_unary_rpc_method_handler(
                    servicer.Handle,
                    request_deserializer=assetmantle_dot_assets_dot_transactions_dot_mint_dot_message__pb2.Message.FromString,
                    response_serializer=assetmantle_dot_assets_dot_transactions_dot_mint_dot_transaction__response__pb2.TransactionResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'assetmantle.modules.assets.transactions.mint.Service', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Service(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Handle(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/assetmantle.modules.assets.transactions.mint.Service/Handle',
            assetmantle_dot_assets_dot_transactions_dot_mint_dot_message__pb2.Message.SerializeToString,
            assetmantle_dot_assets_dot_transactions_dot_mint_dot_transaction__response__pb2.TransactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
