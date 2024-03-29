# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from osmosis.protorev.v1beta1 import tx_pb2 as osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SetHotRoutes = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetHotRoutes',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutes.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutesResponse.FromString,
                )
        self.SetDeveloperAccount = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetDeveloperAccount',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccount.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccountResponse.FromString,
                )
        self.SetMaxPoolPointsPerTx = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerTx',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTx.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTxResponse.FromString,
                )
        self.SetMaxPoolPointsPerBlock = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerBlock',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlock.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlockResponse.FromString,
                )
        self.SetPoolWeights = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetPoolWeights',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeights.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeightsResponse.FromString,
                )
        self.SetBaseDenoms = channel.unary_unary(
                '/osmosis.protorev.v1beta1.Msg/SetBaseDenoms',
                request_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenoms.SerializeToString,
                response_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenomsResponse.FromString,
                )


class MsgServicer(object):
    """Missing associated documentation comment in .proto file."""

    def SetHotRoutes(self, request, context):
        """SetHotRoutes sets the hot routes that will be explored when creating
        cyclic arbitrage routes. Can only be called by the admin account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetDeveloperAccount(self, request, context):
        """SetDeveloperAccount sets the account that can withdraw a portion of the
        profits from the protorev module. This will be Skip's address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetMaxPoolPointsPerTx(self, request, context):
        """SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
        consumed per transaction. Can only be called by the admin account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetMaxPoolPointsPerBlock(self, request, context):
        """SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
        consumed per block. Can only be called by the admin account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetPoolWeights(self, request, context):
        """SetPoolWeights sets the weights of each pool type in the store. Can only be
        called by the admin account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetBaseDenoms(self, request, context):
        """SetBaseDenoms sets the base denoms that will be used to create cyclic
        arbitrage routes. Can only be called by the admin account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SetHotRoutes': grpc.unary_unary_rpc_method_handler(
                    servicer.SetHotRoutes,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutes.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutesResponse.SerializeToString,
            ),
            'SetDeveloperAccount': grpc.unary_unary_rpc_method_handler(
                    servicer.SetDeveloperAccount,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccount.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccountResponse.SerializeToString,
            ),
            'SetMaxPoolPointsPerTx': grpc.unary_unary_rpc_method_handler(
                    servicer.SetMaxPoolPointsPerTx,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTx.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTxResponse.SerializeToString,
            ),
            'SetMaxPoolPointsPerBlock': grpc.unary_unary_rpc_method_handler(
                    servicer.SetMaxPoolPointsPerBlock,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlock.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlockResponse.SerializeToString,
            ),
            'SetPoolWeights': grpc.unary_unary_rpc_method_handler(
                    servicer.SetPoolWeights,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeights.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeightsResponse.SerializeToString,
            ),
            'SetBaseDenoms': grpc.unary_unary_rpc_method_handler(
                    servicer.SetBaseDenoms,
                    request_deserializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenoms.FromString,
                    response_serializer=osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenomsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'osmosis.protorev.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def SetHotRoutes(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetHotRoutes',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutes.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetHotRoutesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetDeveloperAccount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetDeveloperAccount',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccount.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetDeveloperAccountResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetMaxPoolPointsPerTx(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerTx',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTx.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerTxResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetMaxPoolPointsPerBlock(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerBlock',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlock.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetMaxPoolPointsPerBlockResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetPoolWeights(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetPoolWeights',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeights.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetPoolWeightsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetBaseDenoms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.protorev.v1beta1.Msg/SetBaseDenoms',
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenoms.SerializeToString,
            osmosis_dot_protorev_dot_v1beta1_dot_tx__pb2.MsgSetBaseDenomsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
