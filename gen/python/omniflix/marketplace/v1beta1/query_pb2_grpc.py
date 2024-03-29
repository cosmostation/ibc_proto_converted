# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from OmniFlix.marketplace.v1beta1 import query_pb2 as OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Params',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.Listings = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Listings',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsResponse.FromString,
                )
        self.Listing = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Listing',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.FromString,
                )
        self.ListingsByOwner = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/ListingsByOwner',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerResponse.FromString,
                )
        self.ListingsByPriceDenom = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/ListingsByPriceDenom',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomResponse.FromString,
                )
        self.ListingByNftId = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/ListingByNftId',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingByNFTIDRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.FromString,
                )
        self.Auctions = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Auctions',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
                )
        self.Auction = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Auction',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.FromString,
                )
        self.AuctionsByOwner = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/AuctionsByOwner',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByOwnerRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
                )
        self.AuctionsByPriceDenom = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/AuctionsByPriceDenom',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByPriceDenomRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
                )
        self.AuctionByNftId = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/AuctionByNftId',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionByNFTIDRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.FromString,
                )
        self.Bids = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Bids',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsResponse.FromString,
                )
        self.Bid = channel.unary_unary(
                '/OmniFlix.marketplace.v1beta1.Query/Bid',
                request_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidRequest.SerializeToString,
                response_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidResponse.FromString,
                )


class QueryServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Params(self, request, context):
        """Params queries params of the marketplace module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Listings(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Listing(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListingsByOwner(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListingsByPriceDenom(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListingByNftId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Auctions(self, request, context):
        """auction queries
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Auction(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AuctionsByOwner(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AuctionsByPriceDenom(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AuctionByNftId(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Bids(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Bid(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'Listings': grpc.unary_unary_rpc_method_handler(
                    servicer.Listings,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsResponse.SerializeToString,
            ),
            'Listing': grpc.unary_unary_rpc_method_handler(
                    servicer.Listing,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.SerializeToString,
            ),
            'ListingsByOwner': grpc.unary_unary_rpc_method_handler(
                    servicer.ListingsByOwner,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerResponse.SerializeToString,
            ),
            'ListingsByPriceDenom': grpc.unary_unary_rpc_method_handler(
                    servicer.ListingsByPriceDenom,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomResponse.SerializeToString,
            ),
            'ListingByNftId': grpc.unary_unary_rpc_method_handler(
                    servicer.ListingByNftId,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingByNFTIDRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.SerializeToString,
            ),
            'Auctions': grpc.unary_unary_rpc_method_handler(
                    servicer.Auctions,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.SerializeToString,
            ),
            'Auction': grpc.unary_unary_rpc_method_handler(
                    servicer.Auction,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.SerializeToString,
            ),
            'AuctionsByOwner': grpc.unary_unary_rpc_method_handler(
                    servicer.AuctionsByOwner,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByOwnerRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.SerializeToString,
            ),
            'AuctionsByPriceDenom': grpc.unary_unary_rpc_method_handler(
                    servicer.AuctionsByPriceDenom,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByPriceDenomRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.SerializeToString,
            ),
            'AuctionByNftId': grpc.unary_unary_rpc_method_handler(
                    servicer.AuctionByNftId,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionByNFTIDRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.SerializeToString,
            ),
            'Bids': grpc.unary_unary_rpc_method_handler(
                    servicer.Bids,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsResponse.SerializeToString,
            ),
            'Bid': grpc.unary_unary_rpc_method_handler(
                    servicer.Bid,
                    request_deserializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidRequest.FromString,
                    response_serializer=OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'OmniFlix.marketplace.v1beta1.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Params',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Listings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Listings',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Listing(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Listing',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListingsByOwner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/ListingsByOwner',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByOwnerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListingsByPriceDenom(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/ListingsByPriceDenom',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingsByPriceDenomResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ListingByNftId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/ListingByNftId',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingByNFTIDRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryListingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Auctions(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Auctions',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Auction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Auction',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AuctionsByOwner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/AuctionsByOwner',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByOwnerRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AuctionsByPriceDenom(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/AuctionsByPriceDenom',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsByPriceDenomRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AuctionByNftId(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/AuctionByNftId',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionByNFTIDRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryAuctionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Bids(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Bids',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Bid(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/OmniFlix.marketplace.v1beta1.Query/Bid',
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidRequest.SerializeToString,
            OmniFlix_dot_marketplace_dot_v1beta1_dot_query__pb2.QueryBidResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
