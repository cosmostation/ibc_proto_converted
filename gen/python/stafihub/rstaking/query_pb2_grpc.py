# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stafihub.rstaking import query_pb2 as stafihub_dot_rstaking_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/Params',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.InflationBase = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/InflationBase',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseResponse.FromString,
                )
        self.ValidatorWhitelist = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/ValidatorWhitelist',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistResponse.FromString,
                )
        self.ValidatorWhitelistSwitch = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/ValidatorWhitelistSwitch',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchResponse.FromString,
                )
        self.DelegatorWhitelist = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/DelegatorWhitelist',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistResponse.FromString,
                )
        self.DelegatorWhitelistSwitch = channel.unary_unary(
                '/stafihub.stafihub.rstaking.Query/DelegatorWhitelistSwitch',
                request_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchRequest.SerializeToString,
                response_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Parameters queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def InflationBase(self, request, context):
        """Queries a list of InflationBase items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ValidatorWhitelist(self, request, context):
        """Queries a list of ValidatorWhitelist items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ValidatorWhitelistSwitch(self, request, context):
        """Queries a list of WhitelistSwitch items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DelegatorWhitelist(self, request, context):
        """Queries a list of DelegatorWhitelist items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DelegatorWhitelistSwitch(self, request, context):
        """Queries a list of DelegatorWhitelistSwitch items.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'InflationBase': grpc.unary_unary_rpc_method_handler(
                    servicer.InflationBase,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseResponse.SerializeToString,
            ),
            'ValidatorWhitelist': grpc.unary_unary_rpc_method_handler(
                    servicer.ValidatorWhitelist,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistResponse.SerializeToString,
            ),
            'ValidatorWhitelistSwitch': grpc.unary_unary_rpc_method_handler(
                    servicer.ValidatorWhitelistSwitch,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchResponse.SerializeToString,
            ),
            'DelegatorWhitelist': grpc.unary_unary_rpc_method_handler(
                    servicer.DelegatorWhitelist,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistResponse.SerializeToString,
            ),
            'DelegatorWhitelistSwitch': grpc.unary_unary_rpc_method_handler(
                    servicer.DelegatorWhitelistSwitch,
                    request_deserializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchRequest.FromString,
                    response_serializer=stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stafihub.stafihub.rstaking.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/Params',
            stafihub_dot_rstaking_dot_query__pb2.QueryParamsRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def InflationBase(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/InflationBase',
            stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryInflationBaseResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ValidatorWhitelist(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/ValidatorWhitelist',
            stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ValidatorWhitelistSwitch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/ValidatorWhitelistSwitch',
            stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryValidatorWhitelistSwitchResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DelegatorWhitelist(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/DelegatorWhitelist',
            stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DelegatorWhitelistSwitch(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.rstaking.Query/DelegatorWhitelistSwitch',
            stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchRequest.SerializeToString,
            stafihub_dot_rstaking_dot_query__pb2.QueryDelegatorWhitelistSwitchResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)