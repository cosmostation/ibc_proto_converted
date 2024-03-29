# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stride.claim import tx_pb2 as stride_dot_claim_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SetAirdropAllocations = channel.unary_unary(
                '/stride.claim.Msg/SetAirdropAllocations',
                request_serializer=stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocations.SerializeToString,
                response_deserializer=stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocationsResponse.FromString,
                )
        self.ClaimFreeAmount = channel.unary_unary(
                '/stride.claim.Msg/ClaimFreeAmount',
                request_serializer=stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmount.SerializeToString,
                response_deserializer=stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmountResponse.FromString,
                )
        self.CreateAirdrop = channel.unary_unary(
                '/stride.claim.Msg/CreateAirdrop',
                request_serializer=stride_dot_claim_dot_tx__pb2.MsgCreateAirdrop.SerializeToString,
                response_deserializer=stride_dot_claim_dot_tx__pb2.MsgCreateAirdropResponse.FromString,
                )
        self.DeleteAirdrop = channel.unary_unary(
                '/stride.claim.Msg/DeleteAirdrop',
                request_serializer=stride_dot_claim_dot_tx__pb2.MsgDeleteAirdrop.SerializeToString,
                response_deserializer=stride_dot_claim_dot_tx__pb2.MsgDeleteAirdropResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def SetAirdropAllocations(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimFreeAmount(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateAirdrop(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteAirdrop(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SetAirdropAllocations': grpc.unary_unary_rpc_method_handler(
                    servicer.SetAirdropAllocations,
                    request_deserializer=stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocations.FromString,
                    response_serializer=stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocationsResponse.SerializeToString,
            ),
            'ClaimFreeAmount': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimFreeAmount,
                    request_deserializer=stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmount.FromString,
                    response_serializer=stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmountResponse.SerializeToString,
            ),
            'CreateAirdrop': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateAirdrop,
                    request_deserializer=stride_dot_claim_dot_tx__pb2.MsgCreateAirdrop.FromString,
                    response_serializer=stride_dot_claim_dot_tx__pb2.MsgCreateAirdropResponse.SerializeToString,
            ),
            'DeleteAirdrop': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteAirdrop,
                    request_deserializer=stride_dot_claim_dot_tx__pb2.MsgDeleteAirdrop.FromString,
                    response_serializer=stride_dot_claim_dot_tx__pb2.MsgDeleteAirdropResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stride.claim.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def SetAirdropAllocations(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.claim.Msg/SetAirdropAllocations',
            stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocations.SerializeToString,
            stride_dot_claim_dot_tx__pb2.MsgSetAirdropAllocationsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClaimFreeAmount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.claim.Msg/ClaimFreeAmount',
            stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmount.SerializeToString,
            stride_dot_claim_dot_tx__pb2.MsgClaimFreeAmountResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateAirdrop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.claim.Msg/CreateAirdrop',
            stride_dot_claim_dot_tx__pb2.MsgCreateAirdrop.SerializeToString,
            stride_dot_claim_dot_tx__pb2.MsgCreateAirdropResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteAirdrop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.claim.Msg/DeleteAirdrop',
            stride_dot_claim_dot_tx__pb2.MsgDeleteAirdrop.SerializeToString,
            stride_dot_claim_dot_tx__pb2.MsgDeleteAirdropResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
