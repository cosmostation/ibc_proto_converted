# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from desmos.profiles.v3 import query_app_links_pb2 as desmos_dot_profiles_dot_v3_dot_query__app__links__pb2
from desmos.profiles.v3 import query_chain_links_pb2 as desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2
from desmos.profiles.v3 import query_dtag_requests_pb2 as desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2
from desmos.profiles.v3 import query_params_pb2 as desmos_dot_profiles_dot_v3_dot_query__params__pb2
from desmos.profiles.v3 import query_profile_pb2 as desmos_dot_profiles_dot_v3_dot_query__profile__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Profile = channel.unary_unary(
                '/desmos.profiles.v3.Query/Profile',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileResponse.FromString,
                )
        self.IncomingDTagTransferRequests = channel.unary_unary(
                '/desmos.profiles.v3.Query/IncomingDTagTransferRequests',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsResponse.FromString,
                )
        self.ChainLinks = channel.unary_unary(
                '/desmos.profiles.v3.Query/ChainLinks',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksResponse.FromString,
                )
        self.ChainLinkOwners = channel.unary_unary(
                '/desmos.profiles.v3.Query/ChainLinkOwners',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersResponse.FromString,
                )
        self.DefaultExternalAddresses = channel.unary_unary(
                '/desmos.profiles.v3.Query/DefaultExternalAddresses',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesResponse.FromString,
                )
        self.ApplicationLinks = channel.unary_unary(
                '/desmos.profiles.v3.Query/ApplicationLinks',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksResponse.FromString,
                )
        self.ApplicationLinkByClientID = channel.unary_unary(
                '/desmos.profiles.v3.Query/ApplicationLinkByClientID',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDResponse.FromString,
                )
        self.ApplicationLinkOwners = channel.unary_unary(
                '/desmos.profiles.v3.Query/ApplicationLinkOwners',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersResponse.FromString,
                )
        self.Params = channel.unary_unary(
                '/desmos.profiles.v3.Query/Params',
                request_serializer=desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Profile(self, request, context):
        """Profile queries the profile of a specific user given their DTag or address.
        If the queried user does not have a profile, the returned response will
        contain a null profile.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def IncomingDTagTransferRequests(self, request, context):
        """IncomingDTagTransferRequests queries all the DTag transfers requests that
        have been made towards the user with the given address
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ChainLinks(self, request, context):
        """ChainLinks queries the chain links associated to the given user, if
        provided. Otherwise it queries all the chain links stored.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ChainLinkOwners(self, request, context):
        """ChainLinkOwners queries for the owners of chain links, optionally searching
        for a specific chain name and external address
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DefaultExternalAddresses(self, request, context):
        """DefaultExternalAddresses queries the default addresses associated to the
        given user and (optionally) chain name
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ApplicationLinks(self, request, context):
        """ApplicationLinks queries the applications links associated to the given
        user, if provided. Otherwise, it queries all the application links stored.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ApplicationLinkByClientID(self, request, context):
        """ApplicationLinkByClientID queries a single application link for a given
        client id.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ApplicationLinkOwners(self, request, context):
        """ApplicationLinkOwners queries for the owners of applications links,
        optionally searching for a specific application and username.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Params(self, request, context):
        """Params queries the profiles module params
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Profile': grpc.unary_unary_rpc_method_handler(
                    servicer.Profile,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileResponse.SerializeToString,
            ),
            'IncomingDTagTransferRequests': grpc.unary_unary_rpc_method_handler(
                    servicer.IncomingDTagTransferRequests,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsResponse.SerializeToString,
            ),
            'ChainLinks': grpc.unary_unary_rpc_method_handler(
                    servicer.ChainLinks,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksResponse.SerializeToString,
            ),
            'ChainLinkOwners': grpc.unary_unary_rpc_method_handler(
                    servicer.ChainLinkOwners,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersResponse.SerializeToString,
            ),
            'DefaultExternalAddresses': grpc.unary_unary_rpc_method_handler(
                    servicer.DefaultExternalAddresses,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesResponse.SerializeToString,
            ),
            'ApplicationLinks': grpc.unary_unary_rpc_method_handler(
                    servicer.ApplicationLinks,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksResponse.SerializeToString,
            ),
            'ApplicationLinkByClientID': grpc.unary_unary_rpc_method_handler(
                    servicer.ApplicationLinkByClientID,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDResponse.SerializeToString,
            ),
            'ApplicationLinkOwners': grpc.unary_unary_rpc_method_handler(
                    servicer.ApplicationLinkOwners,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersResponse.SerializeToString,
            ),
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsRequest.FromString,
                    response_serializer=desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'desmos.profiles.v3.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Profile(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/Profile',
            desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__profile__pb2.QueryProfileResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def IncomingDTagTransferRequests(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/IncomingDTagTransferRequests',
            desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__dtag__requests__pb2.QueryIncomingDTagTransferRequestsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ChainLinks(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/ChainLinks',
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinksResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ChainLinkOwners(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/ChainLinkOwners',
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryChainLinkOwnersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DefaultExternalAddresses(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/DefaultExternalAddresses',
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__chain__links__pb2.QueryDefaultExternalAddressesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ApplicationLinks(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/ApplicationLinks',
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinksResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ApplicationLinkByClientID(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/ApplicationLinkByClientID',
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkByClientIDResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ApplicationLinkOwners(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/ApplicationLinkOwners',
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__app__links__pb2.QueryApplicationLinkOwnersResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/desmos.profiles.v3.Query/Params',
            desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsRequest.SerializeToString,
            desmos_dot_profiles_dot_v3_dot_query__params__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
