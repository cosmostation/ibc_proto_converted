# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from band.oracle.v1 import tx_pb2 as band_dot_oracle_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the oracle Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.RequestData = channel.unary_unary(
                '/oracle.v1.Msg/RequestData',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestData.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestDataResponse.FromString,
                )
        self.ReportData = channel.unary_unary(
                '/oracle.v1.Msg/ReportData',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportData.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportDataResponse.FromString,
                )
        self.CreateDataSource = channel.unary_unary(
                '/oracle.v1.Msg/CreateDataSource',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSource.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSourceResponse.FromString,
                )
        self.EditDataSource = channel.unary_unary(
                '/oracle.v1.Msg/EditDataSource',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSource.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSourceResponse.FromString,
                )
        self.CreateOracleScript = channel.unary_unary(
                '/oracle.v1.Msg/CreateOracleScript',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScript.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScriptResponse.FromString,
                )
        self.EditOracleScript = channel.unary_unary(
                '/oracle.v1.Msg/EditOracleScript',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScript.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScriptResponse.FromString,
                )
        self.Activate = channel.unary_unary(
                '/oracle.v1.Msg/Activate',
                request_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivate.SerializeToString,
                response_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivateResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the oracle Msg service.
    """

    def RequestData(self, request, context):
        """RequestData defines a method for submitting a new request.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ReportData(self, request, context):
        """ReportData defines a method for reporting a data to resolve the request.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateDataSource(self, request, context):
        """CreateDataSource defines a method for creating a new data source.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditDataSource(self, request, context):
        """EditDataSource defines a method for editing an existing data source.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateOracleScript(self, request, context):
        """CreateOracleScript defines a method for creating a new oracle script.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditOracleScript(self, request, context):
        """EditOracleScript defines a method for editing an existing oracle script.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Activate(self, request, context):
        """Activate defines a method for applying to be an oracle validator.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'RequestData': grpc.unary_unary_rpc_method_handler(
                    servicer.RequestData,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestData.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestDataResponse.SerializeToString,
            ),
            'ReportData': grpc.unary_unary_rpc_method_handler(
                    servicer.ReportData,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportData.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportDataResponse.SerializeToString,
            ),
            'CreateDataSource': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateDataSource,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSource.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSourceResponse.SerializeToString,
            ),
            'EditDataSource': grpc.unary_unary_rpc_method_handler(
                    servicer.EditDataSource,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSource.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSourceResponse.SerializeToString,
            ),
            'CreateOracleScript': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateOracleScript,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScript.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScriptResponse.SerializeToString,
            ),
            'EditOracleScript': grpc.unary_unary_rpc_method_handler(
                    servicer.EditOracleScript,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScript.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScriptResponse.SerializeToString,
            ),
            'Activate': grpc.unary_unary_rpc_method_handler(
                    servicer.Activate,
                    request_deserializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivate.FromString,
                    response_serializer=band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'oracle.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the oracle Msg service.
    """

    @staticmethod
    def RequestData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/RequestData',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestData.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgRequestDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ReportData(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/ReportData',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportData.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgReportDataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateDataSource(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/CreateDataSource',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSource.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateDataSourceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditDataSource(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/EditDataSource',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSource.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditDataSourceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateOracleScript(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/CreateOracleScript',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScript.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgCreateOracleScriptResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditOracleScript(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/EditOracleScript',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScript.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgEditOracleScriptResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Activate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/oracle.v1.Msg/Activate',
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivate.SerializeToString,
            band_dot_oracle_dot_v1_dot_tx__pb2.MsgActivateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
