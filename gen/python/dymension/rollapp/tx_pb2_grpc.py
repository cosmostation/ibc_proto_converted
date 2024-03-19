# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from dymension.rollapp import tx_pb2 as dymension_dot_rollapp_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateRollapp = channel.unary_unary(
                '/dymensionxyz.dymension.rollapp.Msg/CreateRollapp',
                request_serializer=dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollapp.SerializeToString,
                response_deserializer=dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollappResponse.FromString,
                )
        self.UpdateState = channel.unary_unary(
                '/dymensionxyz.dymension.rollapp.Msg/UpdateState',
                request_serializer=dymension_dot_rollapp_dot_tx__pb2.MsgUpdateState.SerializeToString,
                response_deserializer=dymension_dot_rollapp_dot_tx__pb2.MsgUpdateStateResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreateRollapp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateState(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateRollapp': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateRollapp,
                    request_deserializer=dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollapp.FromString,
                    response_serializer=dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollappResponse.SerializeToString,
            ),
            'UpdateState': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateState,
                    request_deserializer=dymension_dot_rollapp_dot_tx__pb2.MsgUpdateState.FromString,
                    response_serializer=dymension_dot_rollapp_dot_tx__pb2.MsgUpdateStateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'dymensionxyz.dymension.rollapp.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreateRollapp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/dymensionxyz.dymension.rollapp.Msg/CreateRollapp',
            dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollapp.SerializeToString,
            dymension_dot_rollapp_dot_tx__pb2.MsgCreateRollappResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateState(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/dymensionxyz.dymension.rollapp.Msg/UpdateState',
            dymension_dot_rollapp_dot_tx__pb2.MsgUpdateState.SerializeToString,
            dymension_dot_rollapp_dot_tx__pb2.MsgUpdateStateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)