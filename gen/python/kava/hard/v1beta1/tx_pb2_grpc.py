# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kava.hard.v1beta1 import tx_pb2 as kava_dot_hard_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the hard Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Deposit = channel.unary_unary(
                '/kava.hard.v1beta1.Msg/Deposit',
                request_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDeposit.SerializeToString,
                response_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.FromString,
                )
        self.Withdraw = channel.unary_unary(
                '/kava.hard.v1beta1.Msg/Withdraw',
                request_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdraw.SerializeToString,
                response_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.FromString,
                )
        self.Borrow = channel.unary_unary(
                '/kava.hard.v1beta1.Msg/Borrow',
                request_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrow.SerializeToString,
                response_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrowResponse.FromString,
                )
        self.Repay = channel.unary_unary(
                '/kava.hard.v1beta1.Msg/Repay',
                request_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepay.SerializeToString,
                response_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepayResponse.FromString,
                )
        self.Liquidate = channel.unary_unary(
                '/kava.hard.v1beta1.Msg/Liquidate',
                request_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidate.SerializeToString,
                response_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidateResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the hard Msg service.
    """

    def Deposit(self, request, context):
        """Deposit defines a method for depositing funds to hard liquidity pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Withdraw(self, request, context):
        """Withdraw defines a method for withdrawing funds from hard liquidity pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Borrow(self, request, context):
        """Borrow defines a method for borrowing funds from hard liquidity pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Repay(self, request, context):
        """Repay defines a method for repaying funds borrowed from hard liquidity pool.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Liquidate(self, request, context):
        """Liquidate defines a method for attempting to liquidate a borrower that is over their loan-to-value.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Deposit': grpc.unary_unary_rpc_method_handler(
                    servicer.Deposit,
                    request_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDeposit.FromString,
                    response_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.SerializeToString,
            ),
            'Withdraw': grpc.unary_unary_rpc_method_handler(
                    servicer.Withdraw,
                    request_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdraw.FromString,
                    response_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.SerializeToString,
            ),
            'Borrow': grpc.unary_unary_rpc_method_handler(
                    servicer.Borrow,
                    request_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrow.FromString,
                    response_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrowResponse.SerializeToString,
            ),
            'Repay': grpc.unary_unary_rpc_method_handler(
                    servicer.Repay,
                    request_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepay.FromString,
                    response_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepayResponse.SerializeToString,
            ),
            'Liquidate': grpc.unary_unary_rpc_method_handler(
                    servicer.Liquidate,
                    request_deserializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidate.FromString,
                    response_serializer=kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kava.hard.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the hard Msg service.
    """

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
        return grpc.experimental.unary_unary(request, target, '/kava.hard.v1beta1.Msg/Deposit',
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDeposit.SerializeToString,
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgDepositResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/kava.hard.v1beta1.Msg/Withdraw',
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdraw.SerializeToString,
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgWithdrawResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Borrow(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.hard.v1beta1.Msg/Borrow',
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrow.SerializeToString,
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgBorrowResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Repay(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.hard.v1beta1.Msg/Repay',
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepay.SerializeToString,
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgRepayResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Liquidate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.hard.v1beta1.Msg/Liquidate',
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidate.SerializeToString,
            kava_dot_hard_dot_v1beta1_dot_tx__pb2.MsgLiquidateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
