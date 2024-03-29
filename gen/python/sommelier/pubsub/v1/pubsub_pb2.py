# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/pubsub/v1/pubsub.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n sommelier/pubsub/v1/pubsub.proto\x12\tpubsub.v1\"V\n\tPublisher\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06\x64omain\x18\x02 \x01(\tR\x06\x64omain\x12\x17\n\x07\x63\x61_cert\x18\x03 \x01(\tR\x06\x63\x61\x43\x65rt\"W\n\nSubscriber\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06\x64omain\x18\x02 \x01(\tR\x06\x64omain\x12\x17\n\x07\x63\x61_cert\x18\x03 \x01(\tR\x06\x63\x61\x43\x65rt\"\xaf\x02\n\x0fPublisherIntent\x12\'\n\x0fsubscription_id\x18\x01 \x01(\tR\x0esubscriptionId\x12)\n\x10publisher_domain\x18\x02 \x01(\tR\x0fpublisherDomain\x12\x30\n\x06method\x18\x03 \x01(\x0e\x32\x18.pubsub.v1.PublishMethodR\x06method\x12\x19\n\x08pull_url\x18\x04 \x01(\tR\x07pullUrl\x12N\n\x13\x61llowed_subscribers\x18\x05 \x01(\x0e\x32\x1d.pubsub.v1.AllowedSubscribersR\x12\x61llowedSubscribers\x12+\n\x11\x61llowed_addresses\x18\x06 \x03(\tR\x10\x61llowedAddresses\"\xb0\x01\n\x10SubscriberIntent\x12\'\n\x0fsubscription_id\x18\x01 \x01(\tR\x0esubscriptionId\x12-\n\x12subscriber_address\x18\x02 \x01(\tR\x11subscriberAddress\x12)\n\x10publisher_domain\x18\x03 \x01(\tR\x0fpublisherDomain\x12\x19\n\x08push_url\x18\x04 \x01(\tR\x07pushUrl\"i\n\x13\x44\x65\x66\x61ultSubscription\x12\'\n\x0fsubscription_id\x18\x01 \x01(\tR\x0esubscriptionId\x12)\n\x10publisher_domain\x18\x02 \x01(\tR\x0fpublisherDomain\"\xb6\x01\n\x14\x41\x64\x64PublisherProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x16\n\x06\x64omain\x18\x03 \x01(\tR\x06\x64omain\x12\x18\n\x07\x61\x64\x64ress\x18\x04 \x01(\tR\x07\x61\x64\x64ress\x12\x1b\n\tproof_url\x18\x05 \x01(\tR\x08proofUrl\x12\x17\n\x07\x63\x61_cert\x18\x06 \x01(\tR\x06\x63\x61\x43\x65rt\"\xdb\x01\n\x1f\x41\x64\x64PublisherProposalWithDeposit\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x16\n\x06\x64omain\x18\x03 \x01(\tR\x06\x64omain\x12\x18\n\x07\x61\x64\x64ress\x18\x04 \x01(\tR\x07\x61\x64\x64ress\x12\x1b\n\tproof_url\x18\x05 \x01(\tR\x08proofUrl\x12\x17\n\x07\x63\x61_cert\x18\x06 \x01(\tR\x06\x63\x61\x43\x65rt\x12\x18\n\x07\x64\x65posit\x18\x07 \x01(\tR\x07\x64\x65posit\"i\n\x17RemovePublisherProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x16\n\x06\x64omain\x18\x03 \x01(\tR\x06\x64omain\"\x8e\x01\n\"RemovePublisherProposalWithDeposit\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x16\n\x06\x64omain\x18\x03 \x01(\tR\x06\x64omain\x12\x18\n\x07\x64\x65posit\x18\x04 \x01(\tR\x07\x64\x65posit\"\xac\x01\n\x1e\x41\x64\x64\x44\x65\x66\x61ultSubscriptionProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\'\n\x0fsubscription_id\x18\x03 \x01(\tR\x0esubscriptionId\x12)\n\x10publisher_domain\x18\x04 \x01(\tR\x0fpublisherDomain\"\xd1\x01\n)AddDefaultSubscriptionProposalWithDeposit\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\'\n\x0fsubscription_id\x18\x03 \x01(\tR\x0esubscriptionId\x12)\n\x10publisher_domain\x18\x04 \x01(\tR\x0fpublisherDomain\x12\x18\n\x07\x64\x65posit\x18\x05 \x01(\tR\x07\x64\x65posit\"\x84\x01\n!RemoveDefaultSubscriptionProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\'\n\x0fsubscription_id\x18\x03 \x01(\tR\x0esubscriptionId\"\xa9\x01\n,RemoveDefaultSubscriptionProposalWithDeposit\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\'\n\x0fsubscription_id\x18\x03 \x01(\tR\x0esubscriptionId\x12\x18\n\x07\x64\x65posit\x18\x04 \x01(\tR\x07\x64\x65posit*#\n\rPublishMethod\x12\x08\n\x04PULL\x10\x00\x12\x08\n\x04PUSH\x10\x01*7\n\x12\x41llowedSubscribers\x12\x07\n\x03\x41NY\x10\x00\x12\x0e\n\nVALIDATORS\x10\x01\x12\x08\n\x04LIST\x10\x02\x42\x8f\x01\n\rcom.pubsub.v1B\x0bPubsubProtoZ.github.com/peggyjv/sommelier/v4/x/pubsub/types\xa2\x02\x03PXX\xaa\x02\tPubsub.V1\xca\x02\tPubsub\\V1\xe2\x02\x15Pubsub\\V1\\GPBMetadata\xea\x02\nPubsub::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.pubsub.v1.pubsub_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\rcom.pubsub.v1B\013PubsubProtoZ.github.com/peggyjv/sommelier/v4/x/pubsub/types\242\002\003PXX\252\002\tPubsub.V1\312\002\tPubsub\\V1\342\002\025Pubsub\\V1\\GPBMetadata\352\002\nPubsub::V1'
  _globals['_PUBLISHMETHOD']._serialized_start=2169
  _globals['_PUBLISHMETHOD']._serialized_end=2204
  _globals['_ALLOWEDSUBSCRIBERS']._serialized_start=2206
  _globals['_ALLOWEDSUBSCRIBERS']._serialized_end=2261
  _globals['_PUBLISHER']._serialized_start=47
  _globals['_PUBLISHER']._serialized_end=133
  _globals['_SUBSCRIBER']._serialized_start=135
  _globals['_SUBSCRIBER']._serialized_end=222
  _globals['_PUBLISHERINTENT']._serialized_start=225
  _globals['_PUBLISHERINTENT']._serialized_end=528
  _globals['_SUBSCRIBERINTENT']._serialized_start=531
  _globals['_SUBSCRIBERINTENT']._serialized_end=707
  _globals['_DEFAULTSUBSCRIPTION']._serialized_start=709
  _globals['_DEFAULTSUBSCRIPTION']._serialized_end=814
  _globals['_ADDPUBLISHERPROPOSAL']._serialized_start=817
  _globals['_ADDPUBLISHERPROPOSAL']._serialized_end=999
  _globals['_ADDPUBLISHERPROPOSALWITHDEPOSIT']._serialized_start=1002
  _globals['_ADDPUBLISHERPROPOSALWITHDEPOSIT']._serialized_end=1221
  _globals['_REMOVEPUBLISHERPROPOSAL']._serialized_start=1223
  _globals['_REMOVEPUBLISHERPROPOSAL']._serialized_end=1328
  _globals['_REMOVEPUBLISHERPROPOSALWITHDEPOSIT']._serialized_start=1331
  _globals['_REMOVEPUBLISHERPROPOSALWITHDEPOSIT']._serialized_end=1473
  _globals['_ADDDEFAULTSUBSCRIPTIONPROPOSAL']._serialized_start=1476
  _globals['_ADDDEFAULTSUBSCRIPTIONPROPOSAL']._serialized_end=1648
  _globals['_ADDDEFAULTSUBSCRIPTIONPROPOSALWITHDEPOSIT']._serialized_start=1651
  _globals['_ADDDEFAULTSUBSCRIPTIONPROPOSALWITHDEPOSIT']._serialized_end=1860
  _globals['_REMOVEDEFAULTSUBSCRIPTIONPROPOSAL']._serialized_start=1863
  _globals['_REMOVEDEFAULTSUBSCRIPTIONPROPOSAL']._serialized_end=1995
  _globals['_REMOVEDEFAULTSUBSCRIPTIONPROPOSALWITHDEPOSIT']._serialized_start=1998
  _globals['_REMOVEDEFAULTSUBSCRIPTIONPROPOSALWITHDEPOSIT']._serialized_end=2167
# @@protoc_insertion_point(module_scope)
