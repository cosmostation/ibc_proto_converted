# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/rvalidator/proposal.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from stafihub.rvalidator import genesis_pb2 as stafihub_dot_rvalidator_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"stafihub/rvalidator/proposal.proto\x12\x1cstafihub.stafihub.rvalidator\x1a\x14gogoproto/gogo.proto\x1a!stafihub/rvalidator/genesis.proto\"\xff\x01\n\x18UpdateRValidatorProposal\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12 \n\x0bpoolAddress\x18\x03 \x01(\tR\x0bpoolAddress\x12\x1e\n\noldAddress\x18\x04 \x01(\tR\noldAddress\x12\x1e\n\nnewAddress\x18\x05 \x01(\tR\nnewAddress\x12\x16\n\x06propId\x18\x06 \x01(\tR\x06propId\x12\x39\n\x05\x63ycle\x18\x07 \x01(\x0b\x32#.stafihub.stafihub.rvalidator.CycleR\x05\x63ycle\"\x93\x02\n\x1eUpdateRValidatorReportProposal\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12 \n\x0bpoolAddress\x18\x03 \x01(\tR\x0bpoolAddress\x12\x16\n\x06propId\x18\x04 \x01(\tR\x06propId\x12\x39\n\x05\x63ycle\x18\x05 \x01(\x0b\x32#.stafihub.stafihub.rvalidator.CycleR\x05\x63ycle\x12L\n\x06status\x18\x06 \x01(\x0e\x32\x34.stafihub.stafihub.rvalidator.UpdateRValidatorStatusR\x06status*\xff\x01\n\x16UpdateRValidatorStatus\x12O\n$UPDATE_RVALIDATOR_STATUS_UNSPECIFIED\x10\x00\x1a%\x8a\x9d !UpdateRValidatorStatusUnspecified\x12G\n UPDATE_RVALIDATOR_STATUS_SUCCESS\x10\x01\x1a!\x8a\x9d \x1dUpdateRValidatorStatusSuccess\x12\x45\n\x1fUPDATE_RVALIDATOR_STATUS_FAILED\x10\x02\x1a \x8a\x9d \x1cUpdateRValidatorStatusFailed\x1a\x04\x88\xa3\x1e\x00\x42\xf4\x01\n com.stafihub.stafihub.rvalidatorB\rProposalProtoP\x01Z/github.com/stafihub/stafihub/x/rvalidator/types\xa2\x02\x03SSR\xaa\x02\x1cStafihub.Stafihub.Rvalidator\xca\x02\x1cStafihub\\Stafihub\\Rvalidator\xe2\x02(Stafihub\\Stafihub\\Rvalidator\\GPBMetadata\xea\x02\x1eStafihub::Stafihub::Rvalidatorb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.rvalidator.proposal_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.stafihub.stafihub.rvalidatorB\rProposalProtoP\001Z/github.com/stafihub/stafihub/x/rvalidator/types\242\002\003SSR\252\002\034Stafihub.Stafihub.Rvalidator\312\002\034Stafihub\\Stafihub\\Rvalidator\342\002(Stafihub\\Stafihub\\Rvalidator\\GPBMetadata\352\002\036Stafihub::Stafihub::Rvalidator'
  _UPDATERVALIDATORSTATUS._options = None
  _UPDATERVALIDATORSTATUS._serialized_options = b'\210\243\036\000'
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_UNSPECIFIED"]._options = None
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 !UpdateRValidatorStatusUnspecified'
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_SUCCESS"]._options = None
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_SUCCESS"]._serialized_options = b'\212\235 \035UpdateRValidatorStatusSuccess'
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_FAILED"]._options = None
  _UPDATERVALIDATORSTATUS.values_by_name["UPDATE_RVALIDATOR_STATUS_FAILED"]._serialized_options = b'\212\235 \034UpdateRValidatorStatusFailed'
  _globals['_UPDATERVALIDATORSTATUS']._serialized_start=662
  _globals['_UPDATERVALIDATORSTATUS']._serialized_end=917
  _globals['_UPDATERVALIDATORPROPOSAL']._serialized_start=126
  _globals['_UPDATERVALIDATORPROPOSAL']._serialized_end=381
  _globals['_UPDATERVALIDATORREPORTPROPOSAL']._serialized_start=384
  _globals['_UPDATERVALIDATORREPORTPROPOSAL']._serialized_end=659
# @@protoc_insertion_point(module_scope)