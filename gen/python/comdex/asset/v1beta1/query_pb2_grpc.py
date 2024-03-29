# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from comdex.asset.v1beta1 import query_pb2 as comdex_dot_asset_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/Params',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.QueryAssets = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAssets',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsResponse.FromString,
                )
        self.QueryAsset = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAsset',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetResponse.FromString,
                )
        self.QueryAssetPairs = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAssetPairs',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsResponse.FromString,
                )
        self.QueryAssetPair = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAssetPair',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairResponse.FromString,
                )
        self.QueryApps = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryApps',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsResponse.FromString,
                )
        self.QueryApp = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryApp',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppResponse.FromString,
                )
        self.QueryExtendedPairVault = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryExtendedPairVault',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultResponse.FromString,
                )
        self.QueryAllExtendedPairVaults = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaults',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsResponse.FromString,
                )
        self.QueryAllExtendedPairVaultsByApp = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaultsByApp',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppResponse.FromString,
                )
        self.QueryAllExtendedPairStableVaultsIDByApp = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsIDByApp',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppResponse.FromString,
                )
        self.QueryGovTokenByApp = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryGovTokenByApp',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppResponse.FromString,
                )
        self.QueryAllExtendedPairStableVaultsByApp = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsByApp',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppResponse.FromString,
                )
        self.QueryExtendedPairVaultsByAppWithoutStable = channel.unary_unary(
                '/comdex.asset.v1beta1.Query/QueryExtendedPairVaultsByAppWithoutStable',
                request_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableRequest.SerializeToString,
                response_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Params(self, request, context):
        """Params returns parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAssets(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAsset(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAssetPairs(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAssetPair(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryApps(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryExtendedPairVault(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAllExtendedPairVaults(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAllExtendedPairVaultsByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAllExtendedPairStableVaultsIDByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryGovTokenByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryAllExtendedPairStableVaultsByApp(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryExtendedPairVaultsByAppWithoutStable(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'QueryAssets': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAssets,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsResponse.SerializeToString,
            ),
            'QueryAsset': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAsset,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetResponse.SerializeToString,
            ),
            'QueryAssetPairs': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAssetPairs,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsResponse.SerializeToString,
            ),
            'QueryAssetPair': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAssetPair,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairResponse.SerializeToString,
            ),
            'QueryApps': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryApps,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsResponse.SerializeToString,
            ),
            'QueryApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryApp,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppResponse.SerializeToString,
            ),
            'QueryExtendedPairVault': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryExtendedPairVault,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultResponse.SerializeToString,
            ),
            'QueryAllExtendedPairVaults': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAllExtendedPairVaults,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsResponse.SerializeToString,
            ),
            'QueryAllExtendedPairVaultsByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAllExtendedPairVaultsByApp,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppResponse.SerializeToString,
            ),
            'QueryAllExtendedPairStableVaultsIDByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAllExtendedPairStableVaultsIDByApp,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppResponse.SerializeToString,
            ),
            'QueryGovTokenByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryGovTokenByApp,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppResponse.SerializeToString,
            ),
            'QueryAllExtendedPairStableVaultsByApp': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryAllExtendedPairStableVaultsByApp,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppResponse.SerializeToString,
            ),
            'QueryExtendedPairVaultsByAppWithoutStable': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryExtendedPairVaultsByAppWithoutStable,
                    request_deserializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableRequest.FromString,
                    response_serializer=comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'comdex.asset.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Missing associated documentation comment in .proto file."""

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
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/Params',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAssets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAssets',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAsset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAsset',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAssetPairs(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAssetPairs',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAssetPair(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAssetPair',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAssetPairResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryApps(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryApps',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryApp',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryExtendedPairVault(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryExtendedPairVault',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAllExtendedPairVaults(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaults',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAllExtendedPairVaultsByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaultsByApp',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairVaultsByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAllExtendedPairStableVaultsIDByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsIDByApp',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsIDByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryGovTokenByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryGovTokenByApp',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryGovTokenByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryAllExtendedPairStableVaultsByApp(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsByApp',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryAllExtendedPairStableVaultsByAppResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryExtendedPairVaultsByAppWithoutStable(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/comdex.asset.v1beta1.Query/QueryExtendedPairVaultsByAppWithoutStable',
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableRequest.SerializeToString,
            comdex_dot_asset_dot_v1beta1_dot_query__pb2.QueryExtendedPairVaultsByAppWithoutStableResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
