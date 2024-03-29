# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/claims/v1beta1/claims.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fixo/claims/v1beta1/claims.proto\x12\x12ixo.claims.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1egoogle/protobuf/duration.proto\"\xa0\x02\n\x06Params\x12/\n\x13\x63ollection_sequence\x18\x01 \x01(\x04R\x12\x63ollectionSequence\x12\x1f\n\x0bixo_account\x18\x02 \x01(\tR\nixoAccount\x12\x64\n\x16network_fee_percentage\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x14networkFeePercentage\x12^\n\x13node_fee_percentage\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x11nodeFeePercentage\"\x8f\x04\n\nCollection\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06\x65ntity\x18\x02 \x01(\tR\x06\x65ntity\x12\x14\n\x05\x61\x64min\x18\x03 \x01(\tR\x05\x61\x64min\x12\x1a\n\x08protocol\x18\x04 \x01(\tR\x08protocol\x12?\n\nstart_date\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\tstartDate\x12;\n\x08\x65nd_date\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x07\x65ndDate\x12\x14\n\x05quota\x18\x07 \x01(\x04R\x05quota\x12\x14\n\x05\x63ount\x18\x08 \x01(\x04R\x05\x63ount\x12\x1c\n\tevaluated\x18\t \x01(\x04R\tevaluated\x12\x1a\n\x08\x61pproved\x18\n \x01(\x04R\x08\x61pproved\x12\x1a\n\x08rejected\x18\x0b \x01(\x04R\x08rejected\x12\x1a\n\x08\x64isputed\x18\x0c \x01(\x04R\x08\x64isputed\x12\x39\n\x05state\x18\r \x01(\x0e\x32#.ixo.claims.v1beta1.CollectionStateR\x05state\x12\x38\n\x08payments\x18\x0e \x01(\x0b\x32\x1c.ixo.claims.v1beta1.PaymentsR\x08payments\x12\x16\n\x06signer\x18\x0f \x01(\tR\x06signer\"\xf8\x01\n\x08Payments\x12;\n\nsubmission\x18\x01 \x01(\x0b\x32\x1b.ixo.claims.v1beta1.PaymentR\nsubmission\x12;\n\nevaluation\x18\x02 \x01(\x0b\x32\x1b.ixo.claims.v1beta1.PaymentR\nevaluation\x12\x37\n\x08\x61pproval\x18\x03 \x01(\x0b\x32\x1b.ixo.claims.v1beta1.PaymentR\x08\x61pproval\x12\x39\n\trejection\x18\x04 \x01(\x0b\x32\x1b.ixo.claims.v1beta1.PaymentR\trejection\"\xa9\x02\n\x07Payment\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12\x63\n\x06\x61mount\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12[\n\x15\x63ontract_1155_payment\x18\x03 \x01(\x0b\x32\'.ixo.claims.v1beta1.Contract1155PaymentR\x13\x63ontract1155Payment\x12\x42\n\ntimeout_ns\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\ttimeoutNs\"h\n\x13\x43ontract1155Payment\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x19\n\x08token_id\x18\x02 \x01(\tR\x07tokenId\x12\x16\n\x06\x61mount\x18\x03 \x01(\rR\x06\x61mount:\x04\xe8\xa0\x1f\x01\"\xe0\x02\n\x05\x43laim\x12#\n\rcollection_id\x18\x01 \x01(\tR\x0c\x63ollectionId\x12\x1b\n\tagent_did\x18\x02 \x01(\tR\x08\x61gentDid\x12#\n\ragent_address\x18\x03 \x01(\tR\x0c\x61gentAddress\x12I\n\x0fsubmission_date\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x0esubmissionDate\x12\x19\n\x08\x63laim_id\x18\x05 \x01(\tR\x07\x63laimId\x12>\n\nevaluation\x18\x06 \x01(\x0b\x32\x1e.ixo.claims.v1beta1.EvaluationR\nevaluation\x12J\n\x0fpayments_status\x18\x07 \x01(\x0b\x32!.ixo.claims.v1beta1.ClaimPaymentsR\x0epaymentsStatus\"\x95\x02\n\rClaimPayments\x12\x41\n\nsubmission\x18\x01 \x01(\x0e\x32!.ixo.claims.v1beta1.PaymentStatusR\nsubmission\x12\x41\n\nevaluation\x18\x02 \x01(\x0e\x32!.ixo.claims.v1beta1.PaymentStatusR\nevaluation\x12=\n\x08\x61pproval\x18\x03 \x01(\x0e\x32!.ixo.claims.v1beta1.PaymentStatusR\x08\x61pproval\x12?\n\trejection\x18\x04 \x01(\x0e\x32!.ixo.claims.v1beta1.PaymentStatusR\trejection\"\xdb\x03\n\nEvaluation\x12\x19\n\x08\x63laim_id\x18\x01 \x01(\tR\x07\x63laimId\x12#\n\rcollection_id\x18\x02 \x01(\tR\x0c\x63ollectionId\x12\x16\n\x06oracle\x18\x03 \x01(\tR\x06oracle\x12\x1b\n\tagent_did\x18\x04 \x01(\tR\x08\x61gentDid\x12#\n\ragent_address\x18\x05 \x01(\tR\x0c\x61gentAddress\x12<\n\x06status\x18\x06 \x01(\x0e\x32$.ixo.claims.v1beta1.EvaluationStatusR\x06status\x12\x16\n\x06reason\x18\x07 \x01(\rR\x06reason\x12-\n\x12verification_proof\x18\x08 \x01(\tR\x11verificationProof\x12I\n\x0f\x65valuation_date\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x0e\x65valuationDate\x12\x63\n\x06\x61mount\x18\n \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\"q\n\x07\x44ispute\x12\x1d\n\nsubject_id\x18\x01 \x01(\tR\tsubjectId\x12\x12\n\x04type\x18\x02 \x01(\x05R\x04type\x12\x33\n\x04\x64\x61ta\x18\x03 \x01(\x0b\x32\x1f.ixo.claims.v1beta1.DisputeDataR\x04\x64\x61ta\"g\n\x0b\x44isputeData\x12\x10\n\x03uri\x18\x01 \x01(\tR\x03uri\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12\x14\n\x05proof\x18\x03 \x01(\tR\x05proof\x12\x1c\n\tencrypted\x18\x04 \x01(\x08R\tencrypted*U\n\x0f\x43ollectionState\x12\x12\n\x04OPEN\x10\x00\x1a\x08\x8a\x9d \x04open\x12\x16\n\x06PAUSED\x10\x01\x1a\n\x8a\x9d \x06paused\x12\x16\n\x06\x43LOSED\x10\x02\x1a\n\x8a\x9d \x06\x63losed*\x91\x01\n\x10\x45valuationStatus\x12\x18\n\x07PENDING\x10\x00\x1a\x0b\x8a\x9d \x07pending\x12\x1a\n\x08\x41PPROVED\x10\x01\x1a\x0c\x8a\x9d \x08\x61pproved\x12\x1a\n\x08REJECTED\x10\x02\x1a\x0c\x8a\x9d \x08rejected\x12+\n\x19\x45valuationStatus_DISPUTED\x10\x03\x1a\x0c\x8a\x9d \x08\x64isputed*\x87\x01\n\x0bPaymentType\x12\x1e\n\nSUBMISSION\x10\x00\x1a\x0e\x8a\x9d \nsubmission\x12\x1a\n\x08\x41PPROVAL\x10\x01\x1a\x0c\x8a\x9d \x08\x61pproval\x12\x1e\n\nEVALUATION\x10\x02\x1a\x0e\x8a\x9d \nevaluation\x12\x1c\n\tREJECTION\x10\x03\x1a\r\x8a\x9d \trejection*\xe1\x01\n\rPaymentStatus\x12\x1e\n\nNO_PAYMENT\x10\x00\x1a\x0e\x8a\x9d \nno_payment\x12\x1a\n\x08PROMISED\x10\x01\x1a\x0c\x8a\x9d \x08promised\x12\x1e\n\nAUTHORIZED\x10\x02\x1a\x0e\x8a\x9d \nauthorized\x12\x1e\n\nGAURANTEED\x10\x03\x1a\x0e\x8a\x9d \ngauranteed\x12\x12\n\x04PAID\x10\x04\x1a\x08\x8a\x9d \x04paid\x12\x16\n\x06\x46\x41ILED\x10\x05\x1a\n\x8a\x9d \x06\x66\x61iled\x12(\n\x16PaymentStatus_DISPUTED\x10\x06\x1a\x0c\x8a\x9d \x08\x64isputedB\xc5\x01\n\x16\x63om.ixo.claims.v1beta1B\x0b\x43laimsProtoZ6github.com/ixofoundation/ixo-blockchain/x/claims/types\xa2\x02\x03ICX\xaa\x02\x12Ixo.Claims.V1beta1\xca\x02\x12Ixo\\Claims\\V1beta1\xe2\x02\x1eIxo\\Claims\\V1beta1\\GPBMetadata\xea\x02\x14Ixo::Claims::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.claims.v1beta1.claims_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.ixo.claims.v1beta1B\013ClaimsProtoZ6github.com/ixofoundation/ixo-blockchain/x/claims/types\242\002\003ICX\252\002\022Ixo.Claims.V1beta1\312\002\022Ixo\\Claims\\V1beta1\342\002\036Ixo\\Claims\\V1beta1\\GPBMetadata\352\002\024Ixo::Claims::V1beta1'
  _globals['_COLLECTIONSTATE'].values_by_name["OPEN"]._options = None
  _globals['_COLLECTIONSTATE'].values_by_name["OPEN"]._serialized_options = b'\212\235 \004open'
  _globals['_COLLECTIONSTATE'].values_by_name["PAUSED"]._options = None
  _globals['_COLLECTIONSTATE'].values_by_name["PAUSED"]._serialized_options = b'\212\235 \006paused'
  _globals['_COLLECTIONSTATE'].values_by_name["CLOSED"]._options = None
  _globals['_COLLECTIONSTATE'].values_by_name["CLOSED"]._serialized_options = b'\212\235 \006closed'
  _globals['_EVALUATIONSTATUS'].values_by_name["PENDING"]._options = None
  _globals['_EVALUATIONSTATUS'].values_by_name["PENDING"]._serialized_options = b'\212\235 \007pending'
  _globals['_EVALUATIONSTATUS'].values_by_name["APPROVED"]._options = None
  _globals['_EVALUATIONSTATUS'].values_by_name["APPROVED"]._serialized_options = b'\212\235 \010approved'
  _globals['_EVALUATIONSTATUS'].values_by_name["REJECTED"]._options = None
  _globals['_EVALUATIONSTATUS'].values_by_name["REJECTED"]._serialized_options = b'\212\235 \010rejected'
  _globals['_EVALUATIONSTATUS'].values_by_name["EvaluationStatus_DISPUTED"]._options = None
  _globals['_EVALUATIONSTATUS'].values_by_name["EvaluationStatus_DISPUTED"]._serialized_options = b'\212\235 \010disputed'
  _globals['_PAYMENTTYPE'].values_by_name["SUBMISSION"]._options = None
  _globals['_PAYMENTTYPE'].values_by_name["SUBMISSION"]._serialized_options = b'\212\235 \nsubmission'
  _globals['_PAYMENTTYPE'].values_by_name["APPROVAL"]._options = None
  _globals['_PAYMENTTYPE'].values_by_name["APPROVAL"]._serialized_options = b'\212\235 \010approval'
  _globals['_PAYMENTTYPE'].values_by_name["EVALUATION"]._options = None
  _globals['_PAYMENTTYPE'].values_by_name["EVALUATION"]._serialized_options = b'\212\235 \nevaluation'
  _globals['_PAYMENTTYPE'].values_by_name["REJECTION"]._options = None
  _globals['_PAYMENTTYPE'].values_by_name["REJECTION"]._serialized_options = b'\212\235 \trejection'
  _globals['_PAYMENTSTATUS'].values_by_name["NO_PAYMENT"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["NO_PAYMENT"]._serialized_options = b'\212\235 \nno_payment'
  _globals['_PAYMENTSTATUS'].values_by_name["PROMISED"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["PROMISED"]._serialized_options = b'\212\235 \010promised'
  _globals['_PAYMENTSTATUS'].values_by_name["AUTHORIZED"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["AUTHORIZED"]._serialized_options = b'\212\235 \nauthorized'
  _globals['_PAYMENTSTATUS'].values_by_name["GAURANTEED"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["GAURANTEED"]._serialized_options = b'\212\235 \ngauranteed'
  _globals['_PAYMENTSTATUS'].values_by_name["PAID"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["PAID"]._serialized_options = b'\212\235 \004paid'
  _globals['_PAYMENTSTATUS'].values_by_name["FAILED"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["FAILED"]._serialized_options = b'\212\235 \006failed'
  _globals['_PAYMENTSTATUS'].values_by_name["PaymentStatus_DISPUTED"]._options = None
  _globals['_PAYMENTSTATUS'].values_by_name["PaymentStatus_DISPUTED"]._serialized_options = b'\212\235 \010disputed'
  _globals['_PARAMS'].fields_by_name['network_fee_percentage']._options = None
  _globals['_PARAMS'].fields_by_name['network_fee_percentage']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS'].fields_by_name['node_fee_percentage']._options = None
  _globals['_PARAMS'].fields_by_name['node_fee_percentage']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_COLLECTION'].fields_by_name['start_date']._options = None
  _globals['_COLLECTION'].fields_by_name['start_date']._serialized_options = b'\220\337\037\001'
  _globals['_COLLECTION'].fields_by_name['end_date']._options = None
  _globals['_COLLECTION'].fields_by_name['end_date']._serialized_options = b'\220\337\037\001'
  _globals['_PAYMENT'].fields_by_name['amount']._options = None
  _globals['_PAYMENT'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_PAYMENT'].fields_by_name['timeout_ns']._options = None
  _globals['_PAYMENT'].fields_by_name['timeout_ns']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_CONTRACT1155PAYMENT']._options = None
  _globals['_CONTRACT1155PAYMENT']._serialized_options = b'\350\240\037\001'
  _globals['_CLAIM'].fields_by_name['submission_date']._options = None
  _globals['_CLAIM'].fields_by_name['submission_date']._serialized_options = b'\220\337\037\001'
  _globals['_EVALUATION'].fields_by_name['evaluation_date']._options = None
  _globals['_EVALUATION'].fields_by_name['evaluation_date']._serialized_options = b'\220\337\037\001'
  _globals['_EVALUATION'].fields_by_name['amount']._options = None
  _globals['_EVALUATION'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_COLLECTIONSTATE']._serialized_start=2985
  _globals['_COLLECTIONSTATE']._serialized_end=3070
  _globals['_EVALUATIONSTATUS']._serialized_start=3073
  _globals['_EVALUATIONSTATUS']._serialized_end=3218
  _globals['_PAYMENTTYPE']._serialized_start=3221
  _globals['_PAYMENTTYPE']._serialized_end=3356
  _globals['_PAYMENTSTATUS']._serialized_start=3359
  _globals['_PAYMENTSTATUS']._serialized_end=3584
  _globals['_PARAMS']._serialized_start=175
  _globals['_PARAMS']._serialized_end=463
  _globals['_COLLECTION']._serialized_start=466
  _globals['_COLLECTION']._serialized_end=993
  _globals['_PAYMENTS']._serialized_start=996
  _globals['_PAYMENTS']._serialized_end=1244
  _globals['_PAYMENT']._serialized_start=1247
  _globals['_PAYMENT']._serialized_end=1544
  _globals['_CONTRACT1155PAYMENT']._serialized_start=1546
  _globals['_CONTRACT1155PAYMENT']._serialized_end=1650
  _globals['_CLAIM']._serialized_start=1653
  _globals['_CLAIM']._serialized_end=2005
  _globals['_CLAIMPAYMENTS']._serialized_start=2008
  _globals['_CLAIMPAYMENTS']._serialized_end=2285
  _globals['_EVALUATION']._serialized_start=2288
  _globals['_EVALUATION']._serialized_end=2763
  _globals['_DISPUTE']._serialized_start=2765
  _globals['_DISPUTE']._serialized_end=2878
  _globals['_DISPUTEDATA']._serialized_start=2880
  _globals['_DISPUTEDATA']._serialized_end=2983
# @@protoc_insertion_point(module_scope)
