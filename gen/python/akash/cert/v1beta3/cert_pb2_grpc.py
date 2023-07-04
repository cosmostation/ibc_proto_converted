# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from akash.cert.v1beta3 import cert_pb2 as akash_dot_cert_dot_v1beta3_dot_cert__pb2


class MsgStub(object):
    """Msg defines the provider Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateCertificate = channel.unary_unary(
                '/akash.cert.v1beta3.Msg/CreateCertificate',
                request_serializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificate.SerializeToString,
                response_deserializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificateResponse.FromString,
                )
        self.RevokeCertificate = channel.unary_unary(
                '/akash.cert.v1beta3.Msg/RevokeCertificate',
                request_serializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificate.SerializeToString,
                response_deserializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificateResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the provider Msg service
    """

    def CreateCertificate(self, request, context):
        """CreateCertificate defines a method to create new certificate given proper inputs.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RevokeCertificate(self, request, context):
        """RevokeCertificate defines a method to revoke the certificate
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateCertificate': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateCertificate,
                    request_deserializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificate.FromString,
                    response_serializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificateResponse.SerializeToString,
            ),
            'RevokeCertificate': grpc.unary_unary_rpc_method_handler(
                    servicer.RevokeCertificate,
                    request_deserializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificate.FromString,
                    response_serializer=akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'akash.cert.v1beta3.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the provider Msg service
    """

    @staticmethod
    def CreateCertificate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/akash.cert.v1beta3.Msg/CreateCertificate',
            akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificate.SerializeToString,
            akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgCreateCertificateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RevokeCertificate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/akash.cert.v1beta3.Msg/RevokeCertificate',
            akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificate.SerializeToString,
            akash_dot_cert_dot_v1beta3_dot_cert__pb2.MsgRevokeCertificateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)