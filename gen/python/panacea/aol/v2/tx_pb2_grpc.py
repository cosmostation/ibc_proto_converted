# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.aol.v2 import tx_pb2 as panacea_dot_aol_dot_v2_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateTopic = channel.unary_unary(
                '/panacea.aol.v2.Msg/CreateTopic',
                request_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopic.SerializeToString,
                response_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopicResponse.FromString,
                )
        self.AddWriter = channel.unary_unary(
                '/panacea.aol.v2.Msg/AddWriter',
                request_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriter.SerializeToString,
                response_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriterResponse.FromString,
                )
        self.DeleteWriter = channel.unary_unary(
                '/panacea.aol.v2.Msg/DeleteWriter',
                request_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriter.SerializeToString,
                response_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriterResponse.FromString,
                )
        self.AddRecord = channel.unary_unary(
                '/panacea.aol.v2.Msg/AddRecord',
                request_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecord.SerializeToString,
                response_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecordResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreateTopic(self, request, context):
        """CreateTopic defines a method for creating a topic.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddWriter(self, request, context):
        """AddWriter defines a method for adding a writer to the topic.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteWriter(self, request, context):
        """DeleteWriter defines a method for deleting a writer to the topic.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddRecord(self, request, context):
        """AddRecord defines a method for adding a record to the topic with the writer.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateTopic': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateTopic,
                    request_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopic.FromString,
                    response_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopicResponse.SerializeToString,
            ),
            'AddWriter': grpc.unary_unary_rpc_method_handler(
                    servicer.AddWriter,
                    request_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriter.FromString,
                    response_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriterResponse.SerializeToString,
            ),
            'DeleteWriter': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteWriter,
                    request_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriter.FromString,
                    response_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriterResponse.SerializeToString,
            ),
            'AddRecord': grpc.unary_unary_rpc_method_handler(
                    servicer.AddRecord,
                    request_deserializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecord.FromString,
                    response_serializer=panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecordResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.aol.v2.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreateTopic(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.aol.v2.Msg/CreateTopic',
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopic.SerializeToString,
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgCreateTopicResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddWriter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.aol.v2.Msg/AddWriter',
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriter.SerializeToString,
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddWriterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteWriter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.aol.v2.Msg/DeleteWriter',
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriter.SerializeToString,
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgDeleteWriterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddRecord(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.aol.v2.Msg/AddRecord',
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecord.SerializeToString,
            panacea_dot_aol_dot_v2_dot_tx__pb2.MsgAddRecordResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
