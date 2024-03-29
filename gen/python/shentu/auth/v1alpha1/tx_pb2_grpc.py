# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from shentu.auth.v1alpha1 import tx_pb2 as shentu_dot_auth_dot_v1alpha1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the auth Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Unlock = channel.unary_unary(
                '/shentu.auth.v1alpha1.Msg/Unlock',
                request_serializer=shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlock.SerializeToString,
                response_deserializer=shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlockResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the auth Msg service.
    """

    def Unlock(self, request, context):
        """Unlock defines a method for unlocking coins from a manual vesting
        account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Unlock': grpc.unary_unary_rpc_method_handler(
                    servicer.Unlock,
                    request_deserializer=shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlock.FromString,
                    response_serializer=shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlockResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'shentu.auth.v1alpha1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the auth Msg service.
    """

    @staticmethod
    def Unlock(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/shentu.auth.v1alpha1.Msg/Unlock',
            shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlock.SerializeToString,
            shentu_dot_auth_dot_v1alpha1_dot_tx__pb2.MsgUnlockResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
