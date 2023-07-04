# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from bcna.bcna import tx_pb2 as bcna_dot_bcna_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateBitcannaid = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/CreateBitcannaid',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaid.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaidResponse.FromString,
                )
        self.UpdateBitcannaid = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/UpdateBitcannaid',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaid.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaidResponse.FromString,
                )
        self.DeleteBitcannaid = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/DeleteBitcannaid',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaid.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaidResponse.FromString,
                )
        self.CreateSupplychain = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/CreateSupplychain',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychain.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychainResponse.FromString,
                )
        self.UpdateSupplychain = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/UpdateSupplychain',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychain.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychainResponse.FromString,
                )
        self.DeleteSupplychain = channel.unary_unary(
                '/bitcannaglobal.bcna.bcna.Msg/DeleteSupplychain',
                request_serializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychain.SerializeToString,
                response_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychainResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreateBitcannaid(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateBitcannaid(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteBitcannaid(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateSupplychain(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateSupplychain(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteSupplychain(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateBitcannaid': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateBitcannaid,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaid.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaidResponse.SerializeToString,
            ),
            'UpdateBitcannaid': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateBitcannaid,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaid.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaidResponse.SerializeToString,
            ),
            'DeleteBitcannaid': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteBitcannaid,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaid.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaidResponse.SerializeToString,
            ),
            'CreateSupplychain': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateSupplychain,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychain.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychainResponse.SerializeToString,
            ),
            'UpdateSupplychain': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateSupplychain,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychain.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychainResponse.SerializeToString,
            ),
            'DeleteSupplychain': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteSupplychain,
                    request_deserializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychain.FromString,
                    response_serializer=bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychainResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'bitcannaglobal.bcna.bcna.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreateBitcannaid(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/CreateBitcannaid',
            bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaid.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgCreateBitcannaidResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateBitcannaid(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/UpdateBitcannaid',
            bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaid.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgUpdateBitcannaidResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteBitcannaid(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/DeleteBitcannaid',
            bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaid.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgDeleteBitcannaidResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateSupplychain(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/CreateSupplychain',
            bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychain.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgCreateSupplychainResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateSupplychain(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/UpdateSupplychain',
            bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychain.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgUpdateSupplychainResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteSupplychain(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitcannaglobal.bcna.bcna.Msg/DeleteSupplychain',
            bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychain.SerializeToString,
            bcna_dot_bcna_dot_tx__pb2.MsgDeleteSupplychainResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)