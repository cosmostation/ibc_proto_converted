# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.datapool.v2alpha1 import query_pb2 as panacea_dot_datapool_dot_v2alpha1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Pool = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/Pool',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolResponse.FromString,
                )
        self.DataPoolParams = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataPoolParams',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsResponse.FromString,
                )
        self.DataPoolModuleAddr = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataPoolModuleAddr',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrResponse.FromString,
                )
        self.DataCerts = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataCerts',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.FromString,
                )
        self.DataPassRedeemReceipt = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipt',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptResponse.FromString,
                )
        self.DataPassRedeemReceipts = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipts',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsResponse.FromString,
                )
        self.DataPassRedeemHistory = channel.unary_unary(
                '/panacea.datapool.v2alpha1.Query/DataPassRedeemHistory',
                request_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryRequest.SerializeToString,
                response_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Pool(self, request, context):
        """Pool returns a Pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataPoolParams(self, request, context):
        """DataPoolParams returns params of x/datapool module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataPoolModuleAddr(self, request, context):
        """DataPoolModuleAddr returns x/datapool module address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataCerts(self, request, context):
        """DataCert returns DataCerts
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataPassRedeemReceipt(self, request, context):
        """DataPassRedeemReceipt returns DataPassRedeemReceipt
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataPassRedeemReceipts(self, request, context):
        """DataPassRedeemReceipts returns DataPassRedeemReceipts
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DataPassRedeemHistory(self, request, context):
        """DataPassRedeemHistory returns a list of DataPassRedeemHistories
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Pool': grpc.unary_unary_rpc_method_handler(
                    servicer.Pool,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolResponse.SerializeToString,
            ),
            'DataPoolParams': grpc.unary_unary_rpc_method_handler(
                    servicer.DataPoolParams,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsResponse.SerializeToString,
            ),
            'DataPoolModuleAddr': grpc.unary_unary_rpc_method_handler(
                    servicer.DataPoolModuleAddr,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrResponse.SerializeToString,
            ),
            'DataCerts': grpc.unary_unary_rpc_method_handler(
                    servicer.DataCerts,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.SerializeToString,
            ),
            'DataPassRedeemReceipt': grpc.unary_unary_rpc_method_handler(
                    servicer.DataPassRedeemReceipt,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptResponse.SerializeToString,
            ),
            'DataPassRedeemReceipts': grpc.unary_unary_rpc_method_handler(
                    servicer.DataPassRedeemReceipts,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsResponse.SerializeToString,
            ),
            'DataPassRedeemHistory': grpc.unary_unary_rpc_method_handler(
                    servicer.DataPassRedeemHistory,
                    request_deserializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryRequest.FromString,
                    response_serializer=panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.datapool.v2alpha1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Pool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/Pool',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryPoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataPoolParams(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataPoolParams',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataPoolModuleAddr(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataPoolModuleAddr',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPoolModuleAddrResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataCerts',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataCertsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataPassRedeemReceipt(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipt',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataPassRedeemReceipts(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipts',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemReceiptsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DataPassRedeemHistory(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.datapool.v2alpha1.Query/DataPassRedeemHistory',
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryRequest.SerializeToString,
            panacea_dot_datapool_dot_v2alpha1_dot_query__pb2.QueryDataPassRedeemHistoryResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
