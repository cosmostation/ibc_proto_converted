# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc



class QueryStub(object):
    """Query defines the gRPC querier service.
    this line is used by starport scaffolding # 2
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """


class QueryServicer(object):
    """Query defines the gRPC querier service.
    this line is used by starport scaffolding # 2
    """


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'cudos.cudoMint.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    this line is used by starport scaffolding # 2
    """
