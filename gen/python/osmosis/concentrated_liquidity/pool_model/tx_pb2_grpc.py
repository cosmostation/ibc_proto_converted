# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from osmosis.concentrated_liquidity.pool_model import tx_pb2 as osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2


class MsgCreatorStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateConcentratedPool = channel.unary_unary(
                '/osmosis.concentratedliquidity.v1beta1.model.MsgCreator/CreateConcentratedPool',
                request_serializer=osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPool.SerializeToString,
                response_deserializer=osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPoolResponse.FromString,
                )


class MsgCreatorServicer(object):
    """Missing associated documentation comment in .proto file."""

    def CreateConcentratedPool(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgCreatorServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateConcentratedPool': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateConcentratedPool,
                    request_deserializer=osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPool.FromString,
                    response_serializer=osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPoolResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'osmosis.concentratedliquidity.v1beta1.model.MsgCreator', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class MsgCreator(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def CreateConcentratedPool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/osmosis.concentratedliquidity.v1beta1.model.MsgCreator/CreateConcentratedPool',
            osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPool.SerializeToString,
            osmosis_dot_concentrated__liquidity_dot_pool__model_dot_tx__pb2.MsgCreateConcentratedPoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)