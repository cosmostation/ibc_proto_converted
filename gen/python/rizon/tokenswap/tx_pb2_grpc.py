# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from rizon.tokenswap import tx_pb2 as rizon_dot_tokenswap_dot_tx__pb2


class MsgStub(object):
    """Msg defines the tokenswap Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateTokenswap = channel.unary_unary(
                '/rizonworld.rizon.tokenswap.Msg/CreateTokenswap',
                request_serializer=rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapRequest.SerializeToString,
                response_deserializer=rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the tokenswap Msg service.
    """

    def CreateTokenswap(self, request, context):
        """CreateTokenswap defines a method for creating a new tokenswap
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateTokenswap': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateTokenswap,
                    request_deserializer=rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapRequest.FromString,
                    response_serializer=rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'rizonworld.rizon.tokenswap.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the tokenswap Msg service.
    """

    @staticmethod
    def CreateTokenswap(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/rizonworld.rizon.tokenswap.Msg/CreateTokenswap',
            rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapRequest.SerializeToString,
            rizon_dot_tokenswap_dot_tx__pb2.MsgCreateTokenswapResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
