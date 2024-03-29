# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from secret.emergencybutton.v1beta1 import tx_pb2 as secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the bank Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ToggleIbcSwitch = channel.unary_unary(
                '/secret.emergencybutton.v1beta1.Msg/ToggleIbcSwitch',
                request_serializer=secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitch.SerializeToString,
                response_deserializer=secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitchResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the bank Msg service.
    """

    def ToggleIbcSwitch(self, request, context):
        """ToggleIbcSwitch defines a method for toggling the status of the emergencybutton.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ToggleIbcSwitch': grpc.unary_unary_rpc_method_handler(
                    servicer.ToggleIbcSwitch,
                    request_deserializer=secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitch.FromString,
                    response_serializer=secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitchResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'secret.emergencybutton.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the bank Msg service.
    """

    @staticmethod
    def ToggleIbcSwitch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/secret.emergencybutton.v1beta1.Msg/ToggleIbcSwitch',
            secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitch.SerializeToString,
            secret_dot_emergencybutton_dot_v1beta1_dot_tx__pb2.MsgToggleIbcSwitchResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
