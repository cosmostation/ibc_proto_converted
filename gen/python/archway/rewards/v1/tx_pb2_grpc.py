# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from archway.rewards.v1 import tx_pb2 as archway_dot_rewards_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the module messaging service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SetContractMetadata = channel.unary_unary(
                '/archway.rewards.v1.Msg/SetContractMetadata',
                request_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadata.SerializeToString,
                response_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadataResponse.FromString,
                )
        self.WithdrawRewards = channel.unary_unary(
                '/archway.rewards.v1.Msg/WithdrawRewards',
                request_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewards.SerializeToString,
                response_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewardsResponse.FromString,
                )
        self.SetFlatFee = channel.unary_unary(
                '/archway.rewards.v1.Msg/SetFlatFee',
                request_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFee.SerializeToString,
                response_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFeeResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the module messaging service.
    """

    def SetContractMetadata(self, request, context):
        """SetContractMetadata creates or updates an existing contract metadata.
        Method is authorized to the contract owner (admin if no metadata exists).
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def WithdrawRewards(self, request, context):
        """WithdrawRewards performs collected rewards distribution.
        Rewards might be credited from multiple contracts (rewards_address must be
        set in the corresponding contract metadata).
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetFlatFee(self, request, context):
        """SetFlatFee sets or updates or removes the flat fee to interact with the
        contract Method is authorized to the contract owner.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SetContractMetadata': grpc.unary_unary_rpc_method_handler(
                    servicer.SetContractMetadata,
                    request_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadata.FromString,
                    response_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadataResponse.SerializeToString,
            ),
            'WithdrawRewards': grpc.unary_unary_rpc_method_handler(
                    servicer.WithdrawRewards,
                    request_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewards.FromString,
                    response_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewardsResponse.SerializeToString,
            ),
            'SetFlatFee': grpc.unary_unary_rpc_method_handler(
                    servicer.SetFlatFee,
                    request_deserializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFee.FromString,
                    response_serializer=archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFeeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'archway.rewards.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the module messaging service.
    """

    @staticmethod
    def SetContractMetadata(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/archway.rewards.v1.Msg/SetContractMetadata',
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadata.SerializeToString,
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetContractMetadataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def WithdrawRewards(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/archway.rewards.v1.Msg/WithdrawRewards',
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewards.SerializeToString,
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgWithdrawRewardsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetFlatFee(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/archway.rewards.v1.Msg/SetFlatFee',
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFee.SerializeToString,
            archway_dot_rewards_dot_v1_dot_tx__pb2.MsgSetFlatFeeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
