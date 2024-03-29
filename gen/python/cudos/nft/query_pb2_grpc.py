# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from cudos.nft import query_pb2 as cudos_dot_nft_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service for NFT module
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Supply = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/Supply',
                request_serializer=cudos_dot_nft_dot_query__pb2.QuerySupplyRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QuerySupplyResponse.FromString,
                )
        self.Owner = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/Owner',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryOwnerRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryOwnerResponse.FromString,
                )
        self.Collection = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/Collection',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryCollectionRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryCollectionResponse.FromString,
                )
        self.CollectionsByDenomIds = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/CollectionsByDenomIds',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryCollectionsByIdsRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryCollectionByIdsResponse.FromString,
                )
        self.Denom = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/Denom',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomResponse.FromString,
                )
        self.DenomByName = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/DenomByName',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomByNameRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomByNameResponse.FromString,
                )
        self.DenomBySymbol = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/DenomBySymbol',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolResponse.FromString,
                )
        self.Denoms = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/Denoms',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomsRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomsResponse.FromString,
                )
        self.NFT = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/NFT',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryNFTRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryNFTResponse.FromString,
                )
        self.GetApprovalsNFT = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/GetApprovalsNFT',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTResponse.FromString,
                )
        self.QueryApprovalsIsApprovedForAll = channel.unary_unary(
                '/cudosnode.cudosnode.nft.Query/QueryApprovalsIsApprovedForAll',
                request_serializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllRequest.SerializeToString,
                response_deserializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service for NFT module
    """

    def Supply(self, request, context):
        """Supply queries the total supply of a given denom or owner
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Owner(self, request, context):
        """Owner queries the NFTs of the specified owner
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Collection(self, request, context):
        """Collection queries the NFTs of the specified denom
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CollectionsByDenomIds(self, request, context):
        """Collection queries the NFTs of the specified denom
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Denom(self, request, context):
        """Denom queries the definition of a given denom
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DenomByName(self, request, context):
        """DenomByName queries the definition of a given denom by name
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DenomBySymbol(self, request, context):
        """DenomByName queries the definition of a given denom by name
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Denoms(self, request, context):
        """Denoms queries all the denoms
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def NFT(self, request, context):
        """NFT queries the NFT for the given denom and token ID
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetApprovalsNFT(self, request, context):
        """NFT queries the NFT for the given denom and token ID
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def QueryApprovalsIsApprovedForAll(self, request, context):
        """NFT queries the NFT for the given denom and token ID
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Supply': grpc.unary_unary_rpc_method_handler(
                    servicer.Supply,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QuerySupplyRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QuerySupplyResponse.SerializeToString,
            ),
            'Owner': grpc.unary_unary_rpc_method_handler(
                    servicer.Owner,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryOwnerRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryOwnerResponse.SerializeToString,
            ),
            'Collection': grpc.unary_unary_rpc_method_handler(
                    servicer.Collection,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryCollectionRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryCollectionResponse.SerializeToString,
            ),
            'CollectionsByDenomIds': grpc.unary_unary_rpc_method_handler(
                    servicer.CollectionsByDenomIds,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryCollectionsByIdsRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryCollectionByIdsResponse.SerializeToString,
            ),
            'Denom': grpc.unary_unary_rpc_method_handler(
                    servicer.Denom,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomResponse.SerializeToString,
            ),
            'DenomByName': grpc.unary_unary_rpc_method_handler(
                    servicer.DenomByName,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomByNameRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomByNameResponse.SerializeToString,
            ),
            'DenomBySymbol': grpc.unary_unary_rpc_method_handler(
                    servicer.DenomBySymbol,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolResponse.SerializeToString,
            ),
            'Denoms': grpc.unary_unary_rpc_method_handler(
                    servicer.Denoms,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryDenomsRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryDenomsResponse.SerializeToString,
            ),
            'NFT': grpc.unary_unary_rpc_method_handler(
                    servicer.NFT,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryNFTRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryNFTResponse.SerializeToString,
            ),
            'GetApprovalsNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.GetApprovalsNFT,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTResponse.SerializeToString,
            ),
            'QueryApprovalsIsApprovedForAll': grpc.unary_unary_rpc_method_handler(
                    servicer.QueryApprovalsIsApprovedForAll,
                    request_deserializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllRequest.FromString,
                    response_serializer=cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'cudosnode.cudosnode.nft.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service for NFT module
    """

    @staticmethod
    def Supply(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/Supply',
            cudos_dot_nft_dot_query__pb2.QuerySupplyRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QuerySupplyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Owner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/Owner',
            cudos_dot_nft_dot_query__pb2.QueryOwnerRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryOwnerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Collection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/Collection',
            cudos_dot_nft_dot_query__pb2.QueryCollectionRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryCollectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CollectionsByDenomIds(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/CollectionsByDenomIds',
            cudos_dot_nft_dot_query__pb2.QueryCollectionsByIdsRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryCollectionByIdsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Denom(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/Denom',
            cudos_dot_nft_dot_query__pb2.QueryDenomRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryDenomResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DenomByName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/DenomByName',
            cudos_dot_nft_dot_query__pb2.QueryDenomByNameRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryDenomByNameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DenomBySymbol(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/DenomBySymbol',
            cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryDenomBySymbolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Denoms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/Denoms',
            cudos_dot_nft_dot_query__pb2.QueryDenomsRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryDenomsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def NFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/NFT',
            cudos_dot_nft_dot_query__pb2.QueryNFTRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetApprovalsNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/GetApprovalsNFT',
            cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryApprovalsNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def QueryApprovalsIsApprovedForAll(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cudosnode.cudosnode.nft.Query/QueryApprovalsIsApprovedForAll',
            cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllRequest.SerializeToString,
            cudos_dot_nft_dot_query__pb2.QueryApprovalsIsApprovedForAllResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
