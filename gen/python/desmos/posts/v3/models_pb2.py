# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/posts/v3/models.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x64\x65smos/posts/v3/models.proto\x12\x0f\x64\x65smos.posts.v3\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xb5\x07\n\x04Post\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12#\n\x02id\x18\x03 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x45\n\x0b\x65xternal_id\x18\x04 \x01(\tB$\xe2\xde\x1f\nExternalID\xf2\xde\x1f\x12yaml:\"external_id\"R\nexternalId\x12#\n\x04text\x18\x05 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"text\"R\x04text\x12J\n\x08\x65ntities\x18\x06 \x01(\x0b\x32\x19.desmos.posts.v3.EntitiesB\x13\xf2\xde\x1f\x0fyaml:\"entities\"R\x08\x65ntities\x12#\n\x04tags\x18\x07 \x03(\tB\x0f\xf2\xde\x1f\x0byaml:\"tags\"R\x04tags\x12)\n\x06\x61uthor\x18\x08 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"author\"R\x06\x61uthor\x12U\n\x0f\x63onversation_id\x18\t \x01(\x04\x42,\xe2\xde\x1f\x0e\x43onversationID\xf2\xde\x1f\x16yaml:\"conversation_id\"R\x0e\x63onversationId\x12j\n\x10referenced_posts\x18\n \x03(\x0b\x32\x1e.desmos.posts.v3.PostReferenceB\x1f\xc8\xde\x1f\x00\xf2\xde\x1f\x17yaml:\"referenced_posts\"R\x0freferencedPosts\x12_\n\x0ereply_settings\x18\x0b \x01(\x0e\x32\x1d.desmos.posts.v3.ReplySettingB\x19\xf2\xde\x1f\x15yaml:\"reply_settings\"R\rreplySettings\x12\x61\n\rcreation_date\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"creation_date\"\x90\xdf\x1f\x01R\x0c\x63reationDate\x12\x65\n\x10last_edited_date\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1f\xf2\xde\x1f\x17yaml:\"last_edited_date\"\x90\xdf\x1f\x01R\x0elastEditedDate:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xca\x01\n\rPostReference\x12G\n\x04type\x18\x01 \x01(\x0e\x32\".desmos.posts.v3.PostReferenceTypeB\x0f\xf2\xde\x1f\x0byaml:\"type\"R\x04type\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12/\n\x08position\x18\x03 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"position\"R\x08position:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xf1\x01\n\x08\x45ntities\x12M\n\x08hashtags\x18\x01 \x03(\x0b\x32\x18.desmos.posts.v3.TextTagB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"hashtags\"R\x08hashtags\x12M\n\x08mentions\x18\x02 \x03(\x0b\x32\x18.desmos.posts.v3.TextTagB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"mentions\"R\x08mentions\x12=\n\x04urls\x18\x03 \x03(\x0b\x32\x14.desmos.posts.v3.UrlB\x13\xc8\xde\x1f\x00\xf2\xde\x1f\x0byaml:\"urls\"R\x04urls:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x7f\n\x07TextTag\x12&\n\x05start\x18\x01 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"start\"R\x05start\x12 \n\x03\x65nd\x18\x02 \x01(\x04\x42\x0e\xf2\xde\x1f\nyaml:\"end\"R\x03\x65nd\x12 \n\x03tag\x18\x03 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"tag\"R\x03tag:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xb4\x01\n\x03Url\x12&\n\x05start\x18\x01 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"start\"R\x05start\x12 \n\x03\x65nd\x18\x02 \x01(\x04\x42\x0e\xf2\xde\x1f\nyaml:\"end\"R\x03\x65nd\x12 \n\x03url\x18\x03 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"url\"R\x03url\x12\x37\n\x0b\x64isplay_url\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"display_url\"R\ndisplayUrl:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xa2\x02\n\nAttachment\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12#\n\x02id\x18\x03 \x01(\rB\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12g\n\x07\x63ontent\x18\x04 \x01(\x0b\x32\x14.google.protobuf.AnyB7\xf2\xde\x1f\x0eyaml:\"content\"\xca\xb4-!desmos.posts.v3.AttachmentContentR\x07\x63ontent:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x8b\x01\n\x05Media\x12 \n\x03uri\x18\x02 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"uri\"R\x03uri\x12\x31\n\tmime_type\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"mime_type\"R\x08mimeType:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.posts.v3.AttachmentContent\"\x83\x06\n\x04Poll\x12/\n\x08question\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"question\"R\x08question\x12p\n\x10provided_answers\x18\x02 \x03(\x0b\x32$.desmos.posts.v3.Poll.ProvidedAnswerB\x1f\xc8\xde\x1f\x00\xf2\xde\x1f\x17yaml:\"provided_answers\"R\x0fprovidedAnswers\x12R\n\x08\x65nd_date\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"end_date\"\x90\xdf\x1f\x01R\x07\x65ndDate\x12Z\n\x17\x61llows_multiple_answers\x18\x04 \x01(\x08\x42\"\xf2\xde\x1f\x1eyaml:\"allows_multiple_answers\"R\x15\x61llowsMultipleAnswers\x12O\n\x13\x61llows_answer_edits\x18\x05 \x01(\x08\x42\x1f\xf2\xde\x1f\x1byaml:\"allows_answers_edits\"R\x11\x61llowsAnswerEdits\x12q\n\x13\x66inal_tally_results\x18\x06 \x01(\x0b\x32!.desmos.posts.v3.PollTallyResultsB\x1e\xf2\xde\x1f\x1ayaml:\"final_tally_results\"R\x11\x66inalTallyResults\x1a\xb4\x01\n\x0eProvidedAnswer\x12#\n\x04text\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"text\"R\x04text\x12s\n\x0b\x61ttachments\x18\x02 \x03(\x0b\x32\x14.google.protobuf.AnyB;\xf2\xde\x1f\x12yaml:\"attachments\"\xca\xb4-!desmos.posts.v3.AttachmentContentR\x0b\x61ttachments:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.posts.v3.AttachmentContent\"\xb5\x02\n\nUserAnswer\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12\x35\n\x07poll_id\x18\x03 \x01(\rB\x1c\xe2\xde\x1f\x06PollID\xf2\xde\x1f\x0eyaml:\"poll_id\"R\x06pollId\x12\x43\n\x0f\x61nswers_indexes\x18\x04 \x03(\rB\x1a\xf2\xde\x1f\x16yaml:\"answers_indexes\"R\x0e\x61nswersIndexes\x12#\n\x04user\x18\x05 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xfc\x01\n\x10PollTallyResults\x12`\n\x07results\x18\x01 \x03(\x0b\x32..desmos.posts.v3.PollTallyResults.AnswerResultB\x16\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"results\"R\x07results\x1a|\n\x0c\x41nswerResult\x12:\n\x0c\x61nswer_index\x18\x01 \x01(\rB\x17\xf2\xde\x1f\x13yaml:\"answer_index\"R\x0b\x61nswerIndex\x12&\n\x05votes\x18\x02 \x01(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"votes\"R\x05votes:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"V\n\x06Params\x12\x42\n\x0fmax_text_length\x18\x01 \x01(\rB\x1a\xf2\xde\x1f\x16yaml:\"max_text_length\"R\rmaxTextLength:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01*\x9c\x01\n\x11PostReferenceType\x12#\n\x1fPOST_REFERENCE_TYPE_UNSPECIFIED\x10\x00\x12\x1d\n\x19POST_REFERENCE_TYPE_REPLY\x10\x01\x12\x1d\n\x19POST_REFERENCE_TYPE_QUOTE\x10\x02\x12\x1e\n\x1aPOST_REFERENCE_TYPE_REPOST\x10\x03\x1a\x04\x88\xa3\x1e\x00*\xa2\x01\n\x0cReplySetting\x12\x1d\n\x19REPLY_SETTING_UNSPECIFIED\x10\x00\x12\x1a\n\x16REPLY_SETTING_EVERYONE\x10\x01\x12\x1b\n\x17REPLY_SETTING_FOLLOWERS\x10\x02\x12\x18\n\x14REPLY_SETTING_MUTUAL\x10\x03\x12\x1a\n\x16REPLY_SETTING_MENTIONS\x10\x04\x1a\x04\x88\xa3\x1e\x00\x42\xb0\x01\n\x13\x63om.desmos.posts.v3B\x0bModelsProtoP\x01Z.github.com/desmos-labs/desmos/v5/x/posts/types\xa2\x02\x03\x44PX\xaa\x02\x0f\x44\x65smos.Posts.V3\xca\x02\x0f\x44\x65smos\\Posts\\V3\xe2\x02\x1b\x44\x65smos\\Posts\\V3\\GPBMetadata\xea\x02\x11\x44\x65smos::Posts::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.posts.v3.models_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.desmos.posts.v3B\013ModelsProtoP\001Z.github.com/desmos-labs/desmos/v5/x/posts/types\242\002\003DPX\252\002\017Desmos.Posts.V3\312\002\017Desmos\\Posts\\V3\342\002\033Desmos\\Posts\\V3\\GPBMetadata\352\002\021Desmos::Posts::V3'
  _POSTREFERENCETYPE._options = None
  _POSTREFERENCETYPE._serialized_options = b'\210\243\036\000'
  _REPLYSETTING._options = None
  _REPLYSETTING._serialized_options = b'\210\243\036\000'
  _POST.fields_by_name['subspace_id']._options = None
  _POST.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _POST.fields_by_name['section_id']._options = None
  _POST.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _POST.fields_by_name['id']._options = None
  _POST.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _POST.fields_by_name['external_id']._options = None
  _POST.fields_by_name['external_id']._serialized_options = b'\342\336\037\nExternalID\362\336\037\022yaml:\"external_id\"'
  _POST.fields_by_name['text']._options = None
  _POST.fields_by_name['text']._serialized_options = b'\362\336\037\013yaml:\"text\"'
  _POST.fields_by_name['entities']._options = None
  _POST.fields_by_name['entities']._serialized_options = b'\362\336\037\017yaml:\"entities\"'
  _POST.fields_by_name['tags']._options = None
  _POST.fields_by_name['tags']._serialized_options = b'\362\336\037\013yaml:\"tags\"'
  _POST.fields_by_name['author']._options = None
  _POST.fields_by_name['author']._serialized_options = b'\362\336\037\ryaml:\"author\"'
  _POST.fields_by_name['conversation_id']._options = None
  _POST.fields_by_name['conversation_id']._serialized_options = b'\342\336\037\016ConversationID\362\336\037\026yaml:\"conversation_id\"'
  _POST.fields_by_name['referenced_posts']._options = None
  _POST.fields_by_name['referenced_posts']._serialized_options = b'\310\336\037\000\362\336\037\027yaml:\"referenced_posts\"'
  _POST.fields_by_name['reply_settings']._options = None
  _POST.fields_by_name['reply_settings']._serialized_options = b'\362\336\037\025yaml:\"reply_settings\"'
  _POST.fields_by_name['creation_date']._options = None
  _POST.fields_by_name['creation_date']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"creation_date\"\220\337\037\001'
  _POST.fields_by_name['last_edited_date']._options = None
  _POST.fields_by_name['last_edited_date']._serialized_options = b'\362\336\037\027yaml:\"last_edited_date\"\220\337\037\001'
  _POST._options = None
  _POST._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POSTREFERENCE.fields_by_name['type']._options = None
  _POSTREFERENCE.fields_by_name['type']._serialized_options = b'\362\336\037\013yaml:\"type\"'
  _POSTREFERENCE.fields_by_name['post_id']._options = None
  _POSTREFERENCE.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _POSTREFERENCE.fields_by_name['position']._options = None
  _POSTREFERENCE.fields_by_name['position']._serialized_options = b'\362\336\037\017yaml:\"position\"'
  _POSTREFERENCE._options = None
  _POSTREFERENCE._serialized_options = b'\230\240\037\001\350\240\037\001'
  _ENTITIES.fields_by_name['hashtags']._options = None
  _ENTITIES.fields_by_name['hashtags']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"hashtags\"'
  _ENTITIES.fields_by_name['mentions']._options = None
  _ENTITIES.fields_by_name['mentions']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"mentions\"'
  _ENTITIES.fields_by_name['urls']._options = None
  _ENTITIES.fields_by_name['urls']._serialized_options = b'\310\336\037\000\362\336\037\013yaml:\"urls\"'
  _ENTITIES._options = None
  _ENTITIES._serialized_options = b'\230\240\037\001\350\240\037\001'
  _TEXTTAG.fields_by_name['start']._options = None
  _TEXTTAG.fields_by_name['start']._serialized_options = b'\362\336\037\014yaml:\"start\"'
  _TEXTTAG.fields_by_name['end']._options = None
  _TEXTTAG.fields_by_name['end']._serialized_options = b'\362\336\037\nyaml:\"end\"'
  _TEXTTAG.fields_by_name['tag']._options = None
  _TEXTTAG.fields_by_name['tag']._serialized_options = b'\362\336\037\nyaml:\"tag\"'
  _TEXTTAG._options = None
  _TEXTTAG._serialized_options = b'\230\240\037\001\350\240\037\001'
  _URL.fields_by_name['start']._options = None
  _URL.fields_by_name['start']._serialized_options = b'\362\336\037\014yaml:\"start\"'
  _URL.fields_by_name['end']._options = None
  _URL.fields_by_name['end']._serialized_options = b'\362\336\037\nyaml:\"end\"'
  _URL.fields_by_name['url']._options = None
  _URL.fields_by_name['url']._serialized_options = b'\362\336\037\nyaml:\"url\"'
  _URL.fields_by_name['display_url']._options = None
  _URL.fields_by_name['display_url']._serialized_options = b'\362\336\037\022yaml:\"display_url\"'
  _URL._options = None
  _URL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _ATTACHMENT.fields_by_name['subspace_id']._options = None
  _ATTACHMENT.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _ATTACHMENT.fields_by_name['post_id']._options = None
  _ATTACHMENT.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _ATTACHMENT.fields_by_name['id']._options = None
  _ATTACHMENT.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _ATTACHMENT.fields_by_name['content']._options = None
  _ATTACHMENT.fields_by_name['content']._serialized_options = b'\362\336\037\016yaml:\"content\"\312\264-!desmos.posts.v3.AttachmentContent'
  _ATTACHMENT._options = None
  _ATTACHMENT._serialized_options = b'\230\240\037\001\350\240\037\001'
  _MEDIA.fields_by_name['uri']._options = None
  _MEDIA.fields_by_name['uri']._serialized_options = b'\362\336\037\nyaml:\"uri\"'
  _MEDIA.fields_by_name['mime_type']._options = None
  _MEDIA.fields_by_name['mime_type']._serialized_options = b'\362\336\037\020yaml:\"mime_type\"'
  _MEDIA._options = None
  _MEDIA._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.posts.v3.AttachmentContent'
  _POLL_PROVIDEDANSWER.fields_by_name['text']._options = None
  _POLL_PROVIDEDANSWER.fields_by_name['text']._serialized_options = b'\362\336\037\013yaml:\"text\"'
  _POLL_PROVIDEDANSWER.fields_by_name['attachments']._options = None
  _POLL_PROVIDEDANSWER.fields_by_name['attachments']._serialized_options = b'\362\336\037\022yaml:\"attachments\"\312\264-!desmos.posts.v3.AttachmentContent'
  _POLL_PROVIDEDANSWER._options = None
  _POLL_PROVIDEDANSWER._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLL.fields_by_name['question']._options = None
  _POLL.fields_by_name['question']._serialized_options = b'\362\336\037\017yaml:\"question\"'
  _POLL.fields_by_name['provided_answers']._options = None
  _POLL.fields_by_name['provided_answers']._serialized_options = b'\310\336\037\000\362\336\037\027yaml:\"provided_answers\"'
  _POLL.fields_by_name['end_date']._options = None
  _POLL.fields_by_name['end_date']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"end_date\"\220\337\037\001'
  _POLL.fields_by_name['allows_multiple_answers']._options = None
  _POLL.fields_by_name['allows_multiple_answers']._serialized_options = b'\362\336\037\036yaml:\"allows_multiple_answers\"'
  _POLL.fields_by_name['allows_answer_edits']._options = None
  _POLL.fields_by_name['allows_answer_edits']._serialized_options = b'\362\336\037\033yaml:\"allows_answers_edits\"'
  _POLL.fields_by_name['final_tally_results']._options = None
  _POLL.fields_by_name['final_tally_results']._serialized_options = b'\362\336\037\032yaml:\"final_tally_results\"'
  _POLL._options = None
  _POLL._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.posts.v3.AttachmentContent'
  _USERANSWER.fields_by_name['subspace_id']._options = None
  _USERANSWER.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _USERANSWER.fields_by_name['post_id']._options = None
  _USERANSWER.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _USERANSWER.fields_by_name['poll_id']._options = None
  _USERANSWER.fields_by_name['poll_id']._serialized_options = b'\342\336\037\006PollID\362\336\037\016yaml:\"poll_id\"'
  _USERANSWER.fields_by_name['answers_indexes']._options = None
  _USERANSWER.fields_by_name['answers_indexes']._serialized_options = b'\362\336\037\026yaml:\"answers_indexes\"'
  _USERANSWER.fields_by_name['user']._options = None
  _USERANSWER.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _USERANSWER._options = None
  _USERANSWER._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLLTALLYRESULTS_ANSWERRESULT.fields_by_name['answer_index']._options = None
  _POLLTALLYRESULTS_ANSWERRESULT.fields_by_name['answer_index']._serialized_options = b'\362\336\037\023yaml:\"answer_index\"'
  _POLLTALLYRESULTS_ANSWERRESULT.fields_by_name['votes']._options = None
  _POLLTALLYRESULTS_ANSWERRESULT.fields_by_name['votes']._serialized_options = b'\362\336\037\014yaml:\"votes\"'
  _POLLTALLYRESULTS_ANSWERRESULT._options = None
  _POLLTALLYRESULTS_ANSWERRESULT._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLLTALLYRESULTS.fields_by_name['results']._options = None
  _POLLTALLYRESULTS.fields_by_name['results']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"results\"'
  _POLLTALLYRESULTS._options = None
  _POLLTALLYRESULTS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _PARAMS.fields_by_name['max_text_length']._options = None
  _PARAMS.fields_by_name['max_text_length']._serialized_options = b'\362\336\037\026yaml:\"max_text_length\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_POSTREFERENCETYPE']._serialized_start=3736
  _globals['_POSTREFERENCETYPE']._serialized_end=3892
  _globals['_REPLYSETTING']._serialized_start=3895
  _globals['_REPLYSETTING']._serialized_end=4057
  _globals['_POST']._serialized_start=159
  _globals['_POST']._serialized_end=1108
  _globals['_POSTREFERENCE']._serialized_start=1111
  _globals['_POSTREFERENCE']._serialized_end=1313
  _globals['_ENTITIES']._serialized_start=1316
  _globals['_ENTITIES']._serialized_end=1557
  _globals['_TEXTTAG']._serialized_start=1559
  _globals['_TEXTTAG']._serialized_end=1686
  _globals['_URL']._serialized_start=1689
  _globals['_URL']._serialized_end=1869
  _globals['_ATTACHMENT']._serialized_start=1872
  _globals['_ATTACHMENT']._serialized_end=2162
  _globals['_MEDIA']._serialized_start=2165
  _globals['_MEDIA']._serialized_end=2304
  _globals['_POLL']._serialized_start=2307
  _globals['_POLL']._serialized_end=3078
  _globals['_POLL_PROVIDEDANSWER']._serialized_start=2851
  _globals['_POLL_PROVIDEDANSWER']._serialized_end=3031
  _globals['_USERANSWER']._serialized_start=3081
  _globals['_USERANSWER']._serialized_end=3390
  _globals['_POLLTALLYRESULTS']._serialized_start=3393
  _globals['_POLLTALLYRESULTS']._serialized_end=3645
  _globals['_POLLTALLYRESULTS_ANSWERRESULT']._serialized_start=3511
  _globals['_POLLTALLYRESULTS_ANSWERRESULT']._serialized_end=3635
  _globals['_PARAMS']._serialized_start=3647
  _globals['_PARAMS']._serialized_end=3733
# @@protoc_insertion_point(module_scope)