# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from band.bandchain.v1.oracle import proof_pb2 as band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2


class ServiceStub(object):
    """Service defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Proof = channel.unary_unary(
                '/bandchain.v1.oracle.Service/Proof',
                request_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofRequest.SerializeToString,
                response_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofResponse.FromString,
                )
        self.MultiProof = channel.unary_unary(
                '/bandchain.v1.oracle.Service/MultiProof',
                request_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofRequest.SerializeToString,
                response_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofResponse.FromString,
                )
        self.RequestCountProof = channel.unary_unary(
                '/bandchain.v1.oracle.Service/RequestCountProof',
                request_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofRequest.SerializeToString,
                response_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofResponse.FromString,
                )


class ServiceServicer(object):
    """Service defines the gRPC querier service.
    """

    def Proof(self, request, context):
        """Proof queries the proof for given request ID
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MultiProof(self, request, context):
        """MultiProof queries multiple proofs for given list of request IDs
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RequestCountProof(self, request, context):
        """RequestCountProof queries the count proof
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Proof': grpc.unary_unary_rpc_method_handler(
                    servicer.Proof,
                    request_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofRequest.FromString,
                    response_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofResponse.SerializeToString,
            ),
            'MultiProof': grpc.unary_unary_rpc_method_handler(
                    servicer.MultiProof,
                    request_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofRequest.FromString,
                    response_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofResponse.SerializeToString,
            ),
            'RequestCountProof': grpc.unary_unary_rpc_method_handler(
                    servicer.RequestCountProof,
                    request_deserializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofRequest.FromString,
                    response_serializer=band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'bandchain.v1.oracle.Service', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Service(object):
    """Service defines the gRPC querier service.
    """

    @staticmethod
    def Proof(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bandchain.v1.oracle.Service/Proof',
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofRequest.SerializeToString,
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryProofResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MultiProof(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bandchain.v1.oracle.Service/MultiProof',
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofRequest.SerializeToString,
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryMultiProofResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RequestCountProof(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bandchain.v1.oracle.Service/RequestCountProof',
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofRequest.SerializeToString,
            band_dot_bandchain_dot_v1_dot_oracle_dot_proof__pb2.QueryRequestCountProofResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
