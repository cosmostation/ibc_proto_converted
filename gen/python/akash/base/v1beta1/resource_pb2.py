# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/base/v1beta1/resource.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.base.v1beta1 import attribute_pb2 as akash_dot_base_dot_v1beta1_dot_attribute__pb2
from akash.base.v1beta1 import resourcevalue_pb2 as akash_dot_base_dot_v1beta1_dot_resourcevalue__pb2
from akash.base.v1beta1 import endpoint_pb2 as akash_dot_base_dot_v1beta1_dot_endpoint__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!akash/base/v1beta1/resource.proto\x12\x12\x61kash.base.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\"akash/base/v1beta1/attribute.proto\x1a&akash/base/v1beta1/resourcevalue.proto\x1a!akash/base/v1beta1/endpoint.proto\"\xbf\x01\n\x03\x43PU\x12=\n\x05units\x18\x01 \x01(\x0b\x32!.akash.base.v1beta1.ResourceValueB\x04\xc8\xde\x1f\x00R\x05units\x12s\n\nattributes\x18\x02 \x03(\x0b\x32\x1d.akash.base.v1beta1.AttributeB4\xc8\xde\x1f\x00\xea\xde\x1f\x14\x61ttributes,omitempty\xf2\xde\x1f\x14yaml:\"cpu,omitempty\"R\nattributes:\x04\xe8\xa0\x1f\x01\"\xdf\x01\n\x06Memory\x12Z\n\x08quantity\x18\x01 \x01(\x0b\x32!.akash.base.v1beta1.ResourceValueB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04size\xf2\xde\x1f\x0byaml:\"size\"R\x08quantity\x12s\n\nattributes\x18\x02 \x03(\x0b\x32\x1d.akash.base.v1beta1.AttributeB4\xc8\xde\x1f\x00\xea\xde\x1f\x14\x61ttributes,omitempty\xf2\xde\x1f\x14yaml:\"cpu,omitempty\"R\nattributes:\x04\xe8\xa0\x1f\x01\"\xe0\x01\n\x07Storage\x12Z\n\x08quantity\x18\x01 \x01(\x0b\x32!.akash.base.v1beta1.ResourceValueB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04size\xf2\xde\x1f\x0byaml:\"size\"R\x08quantity\x12s\n\nattributes\x18\x02 \x03(\x0b\x32\x1d.akash.base.v1beta1.AttributeB4\xc8\xde\x1f\x00\xea\xde\x1f\x14\x61ttributes,omitempty\xf2\xde\x1f\x14yaml:\"cpu,omitempty\"R\nattributes:\x04\xe8\xa0\x1f\x01\"\xb0\x03\n\rResourceUnits\x12_\n\x03\x63pu\x18\x01 \x01(\x0b\x32\x17.akash.base.v1beta1.CPUB4\xc8\xde\x1f\x01\xe2\xde\x1f\x03\x43PU\xea\xde\x1f\rcpu,omitempty\xf2\xde\x1f\x14yaml:\"cpu,omitempty\"R\x03\x63pu\x12g\n\x06memory\x18\x02 \x01(\x0b\x32\x1a.akash.base.v1beta1.MemoryB3\xc8\xde\x1f\x01\xea\xde\x1f\x10memory,omitempty\xf2\xde\x1f\x17yaml:\"memory,omitempty\"R\x06memory\x12l\n\x07storage\x18\x03 \x01(\x0b\x32\x1b.akash.base.v1beta1.StorageB5\xc8\xde\x1f\x01\xea\xde\x1f\x11storage,omitempty\xf2\xde\x1f\x18yaml:\"storage,omitempty\"R\x07storage\x12\x61\n\tendpoints\x18\x04 \x03(\x0b\x32\x1c.akash.base.v1beta1.EndpointB%\xc8\xde\x1f\x00\xea\xde\x1f\tendpoints\xf2\xde\x1f\x10yaml:\"endpoints\"R\tendpoints:\x04\xe8\xa0\x1f\x01\x42\xc9\x01\n\x16\x63om.akash.base.v1beta1B\rResourceProtoZ8github.com/akash-network/akash-api/go/node/types/v1beta1\xa2\x02\x03\x41\x42X\xaa\x02\x12\x41kash.Base.V1beta1\xca\x02\x12\x41kash\\Base\\V1beta1\xe2\x02\x1e\x41kash\\Base\\V1beta1\\GPBMetadata\xea\x02\x14\x41kash::Base::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.base.v1beta1.resource_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.akash.base.v1beta1B\rResourceProtoZ8github.com/akash-network/akash-api/go/node/types/v1beta1\242\002\003ABX\252\002\022Akash.Base.V1beta1\312\002\022Akash\\Base\\V1beta1\342\002\036Akash\\Base\\V1beta1\\GPBMetadata\352\002\024Akash::Base::V1beta1'
  _globals['_CPU'].fields_by_name['units']._options = None
  _globals['_CPU'].fields_by_name['units']._serialized_options = b'\310\336\037\000'
  _globals['_CPU'].fields_by_name['attributes']._options = None
  _globals['_CPU'].fields_by_name['attributes']._serialized_options = b'\310\336\037\000\352\336\037\024attributes,omitempty\362\336\037\024yaml:\"cpu,omitempty\"'
  _globals['_CPU']._options = None
  _globals['_CPU']._serialized_options = b'\350\240\037\001'
  _globals['_MEMORY'].fields_by_name['quantity']._options = None
  _globals['_MEMORY'].fields_by_name['quantity']._serialized_options = b'\310\336\037\000\352\336\037\004size\362\336\037\013yaml:\"size\"'
  _globals['_MEMORY'].fields_by_name['attributes']._options = None
  _globals['_MEMORY'].fields_by_name['attributes']._serialized_options = b'\310\336\037\000\352\336\037\024attributes,omitempty\362\336\037\024yaml:\"cpu,omitempty\"'
  _globals['_MEMORY']._options = None
  _globals['_MEMORY']._serialized_options = b'\350\240\037\001'
  _globals['_STORAGE'].fields_by_name['quantity']._options = None
  _globals['_STORAGE'].fields_by_name['quantity']._serialized_options = b'\310\336\037\000\352\336\037\004size\362\336\037\013yaml:\"size\"'
  _globals['_STORAGE'].fields_by_name['attributes']._options = None
  _globals['_STORAGE'].fields_by_name['attributes']._serialized_options = b'\310\336\037\000\352\336\037\024attributes,omitempty\362\336\037\024yaml:\"cpu,omitempty\"'
  _globals['_STORAGE']._options = None
  _globals['_STORAGE']._serialized_options = b'\350\240\037\001'
  _globals['_RESOURCEUNITS'].fields_by_name['cpu']._options = None
  _globals['_RESOURCEUNITS'].fields_by_name['cpu']._serialized_options = b'\310\336\037\001\342\336\037\003CPU\352\336\037\rcpu,omitempty\362\336\037\024yaml:\"cpu,omitempty\"'
  _globals['_RESOURCEUNITS'].fields_by_name['memory']._options = None
  _globals['_RESOURCEUNITS'].fields_by_name['memory']._serialized_options = b'\310\336\037\001\352\336\037\020memory,omitempty\362\336\037\027yaml:\"memory,omitempty\"'
  _globals['_RESOURCEUNITS'].fields_by_name['storage']._options = None
  _globals['_RESOURCEUNITS'].fields_by_name['storage']._serialized_options = b'\310\336\037\001\352\336\037\021storage,omitempty\362\336\037\030yaml:\"storage,omitempty\"'
  _globals['_RESOURCEUNITS'].fields_by_name['endpoints']._options = None
  _globals['_RESOURCEUNITS'].fields_by_name['endpoints']._serialized_options = b'\310\336\037\000\352\336\037\tendpoints\362\336\037\020yaml:\"endpoints\"'
  _globals['_RESOURCEUNITS']._options = None
  _globals['_RESOURCEUNITS']._serialized_options = b'\350\240\037\001'
  _globals['_CPU']._serialized_start=191
  _globals['_CPU']._serialized_end=382
  _globals['_MEMORY']._serialized_start=385
  _globals['_MEMORY']._serialized_end=608
  _globals['_STORAGE']._serialized_start=611
  _globals['_STORAGE']._serialized_end=835
  _globals['_RESOURCEUNITS']._serialized_start=838
  _globals['_RESOURCEUNITS']._serialized_end=1270
# @@protoc_insertion_point(module_scope)
