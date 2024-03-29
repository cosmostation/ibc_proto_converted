# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.datadeal.v2alpha1 import query_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Deal = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Query/Deal',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealResponse.FromString,
                )
        self.Deals = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Query/Deals',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsResponse.FromString,
                )
        self.DataCert = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Query/DataCert',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertResponse.FromString,
                )
        self.DataCerts = channel.unary_unary(
                '/panacea.datadeal.v2alpha1.Query/DataCerts',
                request_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.SerializeToString,
                response_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Deal(self, request, context):
        """Deal returns a Deal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Deals(self, request, context):
        """Deals returns multiple deals
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataCert(self, request, context):
        """DataCert returns a DataCert.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataCerts(self, request, context):
        """DataCerts return DataCerts.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Deal': grpc.unary_unary_rpc_method_handler(
                    servicer.Deal,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealResponse.SerializeToString,
            ),
            'Deals': grpc.unary_unary_rpc_method_handler(
                    servicer.Deals,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsResponse.SerializeToString,
            ),
            'DataCert': grpc.unary_unary_rpc_method_handler(
                    servicer.DataCert,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertResponse.SerializeToString,
            ),
            'DataCerts': grpc.unary_unary_rpc_method_handler(
                    servicer.DataCerts,
                    request_deserializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.FromString,
                    response_serializer=panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.datadeal.v2alpha1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Deal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Query/Deal',
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Deals(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Query/Deals',
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDealsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataCert(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Query/DataCert',
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataCerts(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datadeal.v2alpha1.Query/DataCerts',
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.SerializeToString,
            panacea_dot_datadeal_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
