# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from likechain.likenft.v1 import tx_pb2 as likechain_dot_likenft_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.NewClass = channel.unary_unary(
                '/likechain.likenft.v1.Msg/NewClass',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClass.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClassResponse.FromString,
                )
        self.UpdateClass = channel.unary_unary(
                '/likechain.likenft.v1.Msg/UpdateClass',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClass.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClassResponse.FromString,
                )
        self.MintNFT = channel.unary_unary(
                '/likechain.likenft.v1.Msg/MintNFT',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFT.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFTResponse.FromString,
                )
        self.BurnNFT = channel.unary_unary(
                '/likechain.likenft.v1.Msg/BurnNFT',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFT.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFTResponse.FromString,
                )
        self.CreateBlindBoxContent = channel.unary_unary(
                '/likechain.likenft.v1.Msg/CreateBlindBoxContent',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContent.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContentResponse.FromString,
                )
        self.UpdateBlindBoxContent = channel.unary_unary(
                '/likechain.likenft.v1.Msg/UpdateBlindBoxContent',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContent.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContentResponse.FromString,
                )
        self.DeleteBlindBoxContent = channel.unary_unary(
                '/likechain.likenft.v1.Msg/DeleteBlindBoxContent',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContent.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContentResponse.FromString,
                )
        self.CreateOffer = channel.unary_unary(
                '/likechain.likenft.v1.Msg/CreateOffer',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOffer.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOfferResponse.FromString,
                )
        self.UpdateOffer = channel.unary_unary(
                '/likechain.likenft.v1.Msg/UpdateOffer',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOffer.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOfferResponse.FromString,
                )
        self.DeleteOffer = channel.unary_unary(
                '/likechain.likenft.v1.Msg/DeleteOffer',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOffer.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOfferResponse.FromString,
                )
        self.CreateListing = channel.unary_unary(
                '/likechain.likenft.v1.Msg/CreateListing',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListing.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListingResponse.FromString,
                )
        self.UpdateListing = channel.unary_unary(
                '/likechain.likenft.v1.Msg/UpdateListing',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListing.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListingResponse.FromString,
                )
        self.DeleteListing = channel.unary_unary(
                '/likechain.likenft.v1.Msg/DeleteListing',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListing.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListingResponse.FromString,
                )
        self.SellNFT = channel.unary_unary(
                '/likechain.likenft.v1.Msg/SellNFT',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFT.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFTResponse.FromString,
                )
        self.BuyNFT = channel.unary_unary(
                '/likechain.likenft.v1.Msg/BuyNFT',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFT.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFTResponse.FromString,
                )
        self.CreateRoyaltyConfig = channel.unary_unary(
                '/likechain.likenft.v1.Msg/CreateRoyaltyConfig',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfig.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfigResponse.FromString,
                )
        self.UpdateRoyaltyConfig = channel.unary_unary(
                '/likechain.likenft.v1.Msg/UpdateRoyaltyConfig',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfig.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfigResponse.FromString,
                )
        self.DeleteRoyaltyConfig = channel.unary_unary(
                '/likechain.likenft.v1.Msg/DeleteRoyaltyConfig',
                request_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfig.SerializeToString,
                response_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfigResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def NewClass(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateClass(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MintNFT(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BurnNFT(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateBlindBoxContent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateBlindBoxContent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteBlindBoxContent(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateOffer(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateOffer(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteOffer(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateListing(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateListing(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteListing(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SellNFT(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BuyNFT(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateRoyaltyConfig(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateRoyaltyConfig(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteRoyaltyConfig(self, request, context):
        """this line is used by starport scaffolding # proto/tx/rpc
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'NewClass': grpc.unary_unary_rpc_method_handler(
                    servicer.NewClass,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClass.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClassResponse.SerializeToString,
            ),
            'UpdateClass': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateClass,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClass.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClassResponse.SerializeToString,
            ),
            'MintNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.MintNFT,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFT.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFTResponse.SerializeToString,
            ),
            'BurnNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.BurnNFT,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFT.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFTResponse.SerializeToString,
            ),
            'CreateBlindBoxContent': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateBlindBoxContent,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContent.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContentResponse.SerializeToString,
            ),
            'UpdateBlindBoxContent': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateBlindBoxContent,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContent.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContentResponse.SerializeToString,
            ),
            'DeleteBlindBoxContent': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteBlindBoxContent,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContent.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContentResponse.SerializeToString,
            ),
            'CreateOffer': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateOffer,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOffer.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOfferResponse.SerializeToString,
            ),
            'UpdateOffer': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateOffer,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOffer.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOfferResponse.SerializeToString,
            ),
            'DeleteOffer': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteOffer,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOffer.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOfferResponse.SerializeToString,
            ),
            'CreateListing': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateListing,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListing.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListingResponse.SerializeToString,
            ),
            'UpdateListing': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateListing,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListing.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListingResponse.SerializeToString,
            ),
            'DeleteListing': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteListing,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListing.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListingResponse.SerializeToString,
            ),
            'SellNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.SellNFT,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFT.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFTResponse.SerializeToString,
            ),
            'BuyNFT': grpc.unary_unary_rpc_method_handler(
                    servicer.BuyNFT,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFT.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFTResponse.SerializeToString,
            ),
            'CreateRoyaltyConfig': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateRoyaltyConfig,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfig.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfigResponse.SerializeToString,
            ),
            'UpdateRoyaltyConfig': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateRoyaltyConfig,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfig.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfigResponse.SerializeToString,
            ),
            'DeleteRoyaltyConfig': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteRoyaltyConfig,
                    request_deserializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfig.FromString,
                    response_serializer=likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfigResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'likechain.likenft.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def NewClass(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/NewClass',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClass.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgNewClassResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateClass(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/UpdateClass',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClass.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateClassResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MintNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/MintNFT',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFT.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgMintNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BurnNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/BurnNFT',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFT.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBurnNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateBlindBoxContent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/CreateBlindBoxContent',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContent.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateBlindBoxContentResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateBlindBoxContent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/UpdateBlindBoxContent',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContent.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateBlindBoxContentResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteBlindBoxContent(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/DeleteBlindBoxContent',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContent.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteBlindBoxContentResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateOffer(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/CreateOffer',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOffer.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateOfferResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateOffer(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/UpdateOffer',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOffer.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateOfferResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteOffer(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/DeleteOffer',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOffer.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteOfferResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateListing(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/CreateListing',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListing.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateListingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateListing(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/UpdateListing',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListing.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateListingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteListing(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/DeleteListing',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListing.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteListingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SellNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/SellNFT',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFT.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgSellNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BuyNFT(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/BuyNFT',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFT.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgBuyNFTResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateRoyaltyConfig(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/CreateRoyaltyConfig',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfig.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgCreateRoyaltyConfigResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateRoyaltyConfig(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/UpdateRoyaltyConfig',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfig.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgUpdateRoyaltyConfigResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteRoyaltyConfig(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/likechain.likenft.v1.Msg/DeleteRoyaltyConfig',
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfig.SerializeToString,
            likechain_dot_likenft_dot_v1_dot_tx__pb2.MsgDeleteRoyaltyConfigResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
