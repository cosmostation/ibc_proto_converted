# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from neutron.osmosis.tokenfactory.v1beta1 import query_pb2 as neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/neutron.osmosis.tokenfactory.v1beta1.Query/Params',
                request_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.DenomAuthorityMetadata = channel.unary_unary(
                '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomAuthorityMetadata',
                request_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataRequest.SerializeToString,
                response_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataResponse.FromString,
                )
        self.DenomsFromCreator = channel.unary_unary(
                '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomsFromCreator',
                request_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorRequest.SerializeToString,
                response_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params returns the total set of minting parameters.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DenomAuthorityMetadata(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DenomsFromCreator(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'DenomAuthorityMetadata': grpc.unary_unary_rpc_method_handler(
                    servicer.DenomAuthorityMetadata,
                    request_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataRequest.FromString,
                    response_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataResponse.SerializeToString,
            ),
            'DenomsFromCreator': grpc.unary_unary_rpc_method_handler(
                    servicer.DenomsFromCreator,
                    request_deserializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorRequest.FromString,
                    response_serializer=neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'neutron.osmosis.tokenfactory.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.osmosis.tokenfactory.v1beta1.Query/Params',
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DenomAuthorityMetadata(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomAuthorityMetadata',
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataRequest.SerializeToString,
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomAuthorityMetadataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DenomsFromCreator(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomsFromCreator',
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorRequest.SerializeToString,
            neutron_dot_osmosis_dot_tokenfactory_dot_v1beta1_dot_query__pb2.QueryDenomsFromCreatorResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)