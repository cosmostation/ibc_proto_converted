# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stargaze.globalfee.v1 import query_pb2 as stargaze_dot_globalfee_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CodeAuthorization = channel.unary_unary(
                '/publicawesome.stargaze.globalfee.v1.Query/CodeAuthorization',
                request_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationRequest.SerializeToString,
                response_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationResponse.FromString,
                )
        self.ContractAuthorization = channel.unary_unary(
                '/publicawesome.stargaze.globalfee.v1.Query/ContractAuthorization',
                request_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationRequest.SerializeToString,
                response_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationResponse.FromString,
                )
        self.Params = channel.unary_unary(
                '/publicawesome.stargaze.globalfee.v1.Query/Params',
                request_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Authorizations = channel.unary_unary(
                '/publicawesome.stargaze.globalfee.v1.Query/Authorizations',
                request_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsRequest.SerializeToString,
                response_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def CodeAuthorization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ContractAuthorization(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Params(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Authorizations(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CodeAuthorization': grpc.unary_unary_rpc_method_handler(
                    servicer.CodeAuthorization,
                    request_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationRequest.FromString,
                    response_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationResponse.SerializeToString,
            ),
            'ContractAuthorization': grpc.unary_unary_rpc_method_handler(
                    servicer.ContractAuthorization,
                    request_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationRequest.FromString,
                    response_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationResponse.SerializeToString,
            ),
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Authorizations': grpc.unary_unary_rpc_method_handler(
                    servicer.Authorizations,
                    request_deserializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsRequest.FromString,
                    response_serializer=stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'publicawesome.stargaze.globalfee.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def CodeAuthorization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/publicawesome.stargaze.globalfee.v1.Query/CodeAuthorization',
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationRequest.SerializeToString,
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryCodeAuthorizationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ContractAuthorization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/publicawesome.stargaze.globalfee.v1.Query/ContractAuthorization',
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationRequest.SerializeToString,
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryContractAuthorizationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

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
        return grpc.experimental.unary_unary(request, target, '/publicawesome.stargaze.globalfee.v1.Query/Params',
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Authorizations(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/publicawesome.stargaze.globalfee.v1.Query/Authorizations',
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsRequest.SerializeToString,
            stargaze_dot_globalfee_dot_v1_dot_query__pb2.QueryAuthorizationsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
