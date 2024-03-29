# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.liquidity.v1beta1 import tx_pb2 as crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreatePair = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/CreatePair',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePair.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePairResponse.FromString,
                )
        self.CreatePool = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/CreatePool',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePool.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePoolResponse.FromString,
                )
        self.CreateRangedPool = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/CreateRangedPool',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPool.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPoolResponse.FromString,
                )
        self.Deposit = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/Deposit',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDeposit.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.FromString,
                )
        self.Withdraw = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/Withdraw',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdraw.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.FromString,
                )
        self.LimitOrder = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/LimitOrder',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrder.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrderResponse.FromString,
                )
        self.MarketOrder = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/MarketOrder',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrder.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrderResponse.FromString,
                )
        self.MMOrder = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/MMOrder',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrder.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrderResponse.FromString,
                )
        self.CancelOrder = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/CancelOrder',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrder.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrderResponse.FromString,
                )
        self.CancelAllOrders = channel.unary_unary(
                '/crescent.liquidity.v1beta1.Msg/CancelAllOrders',
                request_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrders.SerializeToString,
                response_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrdersResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreatePair(self, request, context):
        """CreatePair defines a method for creating a pair
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreatePool(self, request, context):
        """CreatePool defines a method for creating a pool
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateRangedPool(self, request, context):
        """CreateRangePool defines a method for creating a ranged pool
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Deposit(self, request, context):
        """Deposit defines a method for depositing coins to the pool
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Withdraw(self, request, context):
        """Withdraw defines a method for withdrawing pool coin from the pool
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LimitOrder(self, request, context):
        """LimitOrder defines a method for making a limit order
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MarketOrder(self, request, context):
        """MarketOrder defines a method for making a market order
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MMOrder(self, request, context):
        """MsgMMOrder defines a method for making a MM(market making) order
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CancelOrder(self, request, context):
        """CancelOrder defines a method for cancelling an order
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CancelAllOrders(self, request, context):
        """CancelAllOrders defines a method for cancelling all orders
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreatePair': grpc.unary_unary_rpc_method_handler(
                    servicer.CreatePair,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePair.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePairResponse.SerializeToString,
            ),
            'CreatePool': grpc.unary_unary_rpc_method_handler(
                    servicer.CreatePool,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePool.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePoolResponse.SerializeToString,
            ),
            'CreateRangedPool': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateRangedPool,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPool.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPoolResponse.SerializeToString,
            ),
            'Deposit': grpc.unary_unary_rpc_method_handler(
                    servicer.Deposit,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDeposit.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.SerializeToString,
            ),
            'Withdraw': grpc.unary_unary_rpc_method_handler(
                    servicer.Withdraw,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdraw.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.SerializeToString,
            ),
            'LimitOrder': grpc.unary_unary_rpc_method_handler(
                    servicer.LimitOrder,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrder.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrderResponse.SerializeToString,
            ),
            'MarketOrder': grpc.unary_unary_rpc_method_handler(
                    servicer.MarketOrder,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrder.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrderResponse.SerializeToString,
            ),
            'MMOrder': grpc.unary_unary_rpc_method_handler(
                    servicer.MMOrder,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrder.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrderResponse.SerializeToString,
            ),
            'CancelOrder': grpc.unary_unary_rpc_method_handler(
                    servicer.CancelOrder,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrder.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrderResponse.SerializeToString,
            ),
            'CancelAllOrders': grpc.unary_unary_rpc_method_handler(
                    servicer.CancelAllOrders,
                    request_deserializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrders.FromString,
                    response_serializer=crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrdersResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.liquidity.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreatePair(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/CreatePair',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePair.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePairResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreatePool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/CreatePool',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePool.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreatePoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateRangedPool(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/CreateRangedPool',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPool.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCreateRangedPoolResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Deposit(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/Deposit',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDeposit.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Withdraw(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/Withdraw',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdraw.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LimitOrder(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/LimitOrder',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrder.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgLimitOrderResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MarketOrder(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/MarketOrder',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrder.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMarketOrderResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MMOrder(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/MMOrder',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrder.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgMMOrderResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CancelOrder(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/CancelOrder',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrder.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelOrderResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CancelAllOrders(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidity.v1beta1.Msg/CancelAllOrders',
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrders.SerializeToString,
            crescent_dot_liquidity_dot_v1beta1_dot_tx__pb2.MsgCancelAllOrdersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
