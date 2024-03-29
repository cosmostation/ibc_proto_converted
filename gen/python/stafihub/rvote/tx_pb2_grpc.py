# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stafihub.rvote import tx_pb2 as stafihub_dot_rvote_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SetProposalLife = channel.unary_unary(
                '/stafihub.stafihub.rvote.Msg/SetProposalLife',
                request_serializer=stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLife.SerializeToString,
                response_deserializer=stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLifeResponse.FromString,
                )
        self.SubmitProposal = channel.unary_unary(
                '/stafihub.stafihub.rvote.Msg/SubmitProposal',
                request_serializer=stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposal.SerializeToString,
                response_deserializer=stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposalResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def SetProposalLife(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SubmitProposal(self, request, context):
        """this line is used by starport scaffolding # proto/tx/rpc
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SetProposalLife': grpc.unary_unary_rpc_method_handler(
                    servicer.SetProposalLife,
                    request_deserializer=stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLife.FromString,
                    response_serializer=stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLifeResponse.SerializeToString,
            ),
            'SubmitProposal': grpc.unary_unary_rpc_method_handler(
                    servicer.SubmitProposal,
                    request_deserializer=stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposal.FromString,
                    response_serializer=stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposalResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stafihub.stafihub.rvote.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def SetProposalLife(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rvote.Msg/SetProposalLife',
            stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLife.SerializeToString,
            stafihub_dot_rvote_dot_tx__pb2.MsgSetProposalLifeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SubmitProposal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rvote.Msg/SubmitProposal',
            stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposal.SerializeToString,
            stafihub_dot_rvote_dot_tx__pb2.MsgSubmitProposalResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
