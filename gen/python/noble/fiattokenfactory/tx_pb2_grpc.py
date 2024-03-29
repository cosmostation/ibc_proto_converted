# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from noble.fiattokenfactory import tx_pb2 as noble_dot_fiattokenfactory_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.UpdateMasterMinter = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/UpdateMasterMinter',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinter.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinterResponse.FromString,
                )
        self.UpdatePauser = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/UpdatePauser',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauser.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauserResponse.FromString,
                )
        self.UpdateBlacklister = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/UpdateBlacklister',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklister.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklisterResponse.FromString,
                )
        self.UpdateOwner = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/UpdateOwner',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwner.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwnerResponse.FromString,
                )
        self.AcceptOwner = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/AcceptOwner',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwner.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwnerResponse.FromString,
                )
        self.ConfigureMinter = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/ConfigureMinter',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinter.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterResponse.FromString,
                )
        self.RemoveMinter = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/RemoveMinter',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinter.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterResponse.FromString,
                )
        self.Mint = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Mint',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgMint.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgMintResponse.FromString,
                )
        self.Burn = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Burn',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurn.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurnResponse.FromString,
                )
        self.Blacklist = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Blacklist',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklist.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklistResponse.FromString,
                )
        self.Unblacklist = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Unblacklist',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklist.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklistResponse.FromString,
                )
        self.Pause = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Pause',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgPause.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgPauseResponse.FromString,
                )
        self.Unpause = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/Unpause',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpause.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpauseResponse.FromString,
                )
        self.ConfigureMinterController = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/ConfigureMinterController',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterController.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterControllerResponse.FromString,
                )
        self.RemoveMinterController = channel.unary_unary(
                '/noble.fiattokenfactory.Msg/RemoveMinterController',
                request_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterController.SerializeToString,
                response_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterControllerResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def UpdateMasterMinter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdatePauser(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateBlacklister(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateOwner(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AcceptOwner(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConfigureMinter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveMinter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Mint(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Burn(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Blacklist(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Unblacklist(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Pause(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Unpause(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConfigureMinterController(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveMinterController(self, request, context):
        """this line is used by starport scaffolding # proto/tx/rpc
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'UpdateMasterMinter': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateMasterMinter,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinter.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinterResponse.SerializeToString,
            ),
            'UpdatePauser': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdatePauser,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauser.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauserResponse.SerializeToString,
            ),
            'UpdateBlacklister': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateBlacklister,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklister.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklisterResponse.SerializeToString,
            ),
            'UpdateOwner': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateOwner,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwner.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwnerResponse.SerializeToString,
            ),
            'AcceptOwner': grpc.unary_unary_rpc_method_handler(
                    servicer.AcceptOwner,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwner.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwnerResponse.SerializeToString,
            ),
            'ConfigureMinter': grpc.unary_unary_rpc_method_handler(
                    servicer.ConfigureMinter,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinter.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterResponse.SerializeToString,
            ),
            'RemoveMinter': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveMinter,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinter.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterResponse.SerializeToString,
            ),
            'Mint': grpc.unary_unary_rpc_method_handler(
                    servicer.Mint,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgMint.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgMintResponse.SerializeToString,
            ),
            'Burn': grpc.unary_unary_rpc_method_handler(
                    servicer.Burn,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurn.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurnResponse.SerializeToString,
            ),
            'Blacklist': grpc.unary_unary_rpc_method_handler(
                    servicer.Blacklist,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklist.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklistResponse.SerializeToString,
            ),
            'Unblacklist': grpc.unary_unary_rpc_method_handler(
                    servicer.Unblacklist,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklist.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklistResponse.SerializeToString,
            ),
            'Pause': grpc.unary_unary_rpc_method_handler(
                    servicer.Pause,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgPause.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgPauseResponse.SerializeToString,
            ),
            'Unpause': grpc.unary_unary_rpc_method_handler(
                    servicer.Unpause,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpause.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpauseResponse.SerializeToString,
            ),
            'ConfigureMinterController': grpc.unary_unary_rpc_method_handler(
                    servicer.ConfigureMinterController,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterController.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterControllerResponse.SerializeToString,
            ),
            'RemoveMinterController': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveMinterController,
                    request_deserializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterController.FromString,
                    response_serializer=noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterControllerResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'noble.fiattokenfactory.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def UpdateMasterMinter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/UpdateMasterMinter',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinter.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateMasterMinterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdatePauser(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/UpdatePauser',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauser.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdatePauserResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateBlacklister(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/UpdateBlacklister',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklister.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateBlacklisterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateOwner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/UpdateOwner',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwner.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUpdateOwnerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AcceptOwner(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/AcceptOwner',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwner.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgAcceptOwnerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConfigureMinter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/ConfigureMinter',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinter.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveMinter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/RemoveMinter',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinter.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Mint(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Mint',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgMint.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgMintResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Burn(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Burn',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurn.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgBurnResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Blacklist(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Blacklist',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklist.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgBlacklistResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Unblacklist(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Unblacklist',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklist.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnblacklistResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Pause(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Pause',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgPause.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgPauseResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Unpause(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/Unpause',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpause.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgUnpauseResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ConfigureMinterController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/ConfigureMinterController',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterController.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgConfigureMinterControllerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveMinterController(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/noble.fiattokenfactory.Msg/RemoveMinterController',
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterController.SerializeToString,
            noble_dot_fiattokenfactory_dot_tx__pb2.MsgRemoveMinterControllerResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
