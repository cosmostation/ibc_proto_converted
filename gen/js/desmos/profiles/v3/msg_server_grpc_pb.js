// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var desmos_profiles_v3_msgs_profile_pb = require('../../../desmos/profiles/v3/msgs_profile_pb.js');
var desmos_profiles_v3_msgs_dtag_requests_pb = require('../../../desmos/profiles/v3/msgs_dtag_requests_pb.js');
var desmos_profiles_v3_msgs_chain_links_pb = require('../../../desmos/profiles/v3/msgs_chain_links_pb.js');
var desmos_profiles_v3_msgs_app_links_pb = require('../../../desmos/profiles/v3/msgs_app_links_pb.js');
var desmos_profiles_v3_msgs_params_pb = require('../../../desmos/profiles/v3/msgs_params_pb.js');

function serialize_desmos_profiles_v3_MsgAcceptDTagTransferRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgAcceptDTagTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgAcceptDTagTransferRequest(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgAcceptDTagTransferRequestResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequestResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgAcceptDTagTransferRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgAcceptDTagTransferRequestResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgCancelDTagTransferRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgCancelDTagTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgCancelDTagTransferRequest(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgCancelDTagTransferRequestResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequestResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgCancelDTagTransferRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgCancelDTagTransferRequestResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgDeleteProfile(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfile)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgDeleteProfile');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgDeleteProfile(buffer_arg) {
  return desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfile.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgDeleteProfileResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfileResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgDeleteProfileResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgDeleteProfileResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgLinkApplication(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplication)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgLinkApplication');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgLinkApplication(buffer_arg) {
  return desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplication.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgLinkApplicationResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplicationResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgLinkApplicationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgLinkApplicationResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplicationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgLinkChainAccount(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccount)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgLinkChainAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgLinkChainAccount(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgLinkChainAccountResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccountResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgLinkChainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgLinkChainAccountResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgRefuseDTagTransferRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgRefuseDTagTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgRefuseDTagTransferRequest(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgRefuseDTagTransferRequestResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequestResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgRefuseDTagTransferRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgRefuseDTagTransferRequestResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgRequestDTagTransfer(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransfer)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgRequestDTagTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgRequestDTagTransfer(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgRequestDTagTransferResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransferResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgRequestDTagTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgRequestDTagTransferResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgSaveProfile(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_profile_pb.MsgSaveProfile)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgSaveProfile');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgSaveProfile(buffer_arg) {
  return desmos_profiles_v3_msgs_profile_pb.MsgSaveProfile.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgSaveProfileResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_profile_pb.MsgSaveProfileResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgSaveProfileResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgSaveProfileResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_profile_pb.MsgSaveProfileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgSetDefaultExternalAddress(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddress)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgSetDefaultExternalAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgSetDefaultExternalAddress(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgSetDefaultExternalAddressResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddressResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgSetDefaultExternalAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgSetDefaultExternalAddressResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUnlinkApplication(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplication)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUnlinkApplication');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUnlinkApplication(buffer_arg) {
  return desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplication.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUnlinkApplicationResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplicationResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUnlinkApplicationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUnlinkApplicationResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplicationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUnlinkChainAccount(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccount)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUnlinkChainAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUnlinkChainAccount(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUnlinkChainAccountResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccountResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUnlinkChainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUnlinkChainAccountResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUpdateParams(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_params_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUpdateParams(buffer_arg) {
  return desmos_profiles_v3_msgs_params_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_msgs_params_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_MsgUpdateParamsResponse(buffer_arg) {
  return desmos_profiles_v3_msgs_params_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the relationships Msg service.
var MsgService = exports.MsgService = {
  // SaveProfile defines the method to save a profile
saveProfile: {
    path: '/desmos.profiles.v3.Msg/SaveProfile',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_profile_pb.MsgSaveProfile,
    responseType: desmos_profiles_v3_msgs_profile_pb.MsgSaveProfileResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgSaveProfile,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgSaveProfile,
    responseSerialize: serialize_desmos_profiles_v3_MsgSaveProfileResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgSaveProfileResponse,
  },
  // DeleteProfile defines the method to delete an existing profile
deleteProfile: {
    path: '/desmos.profiles.v3.Msg/DeleteProfile',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfile,
    responseType: desmos_profiles_v3_msgs_profile_pb.MsgDeleteProfileResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgDeleteProfile,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgDeleteProfile,
    responseSerialize: serialize_desmos_profiles_v3_MsgDeleteProfileResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgDeleteProfileResponse,
  },
  // RequestDTagTransfer defines the method to request another user to transfer
// their DTag to you
requestDTagTransfer: {
    path: '/desmos.profiles.v3.Msg/RequestDTagTransfer',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransfer,
    responseType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgRequestDTagTransferResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgRequestDTagTransfer,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgRequestDTagTransfer,
    responseSerialize: serialize_desmos_profiles_v3_MsgRequestDTagTransferResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgRequestDTagTransferResponse,
  },
  // CancelDTagTransferRequest defines the method to cancel an outgoing DTag
// transfer request
cancelDTagTransferRequest: {
    path: '/desmos.profiles.v3.Msg/CancelDTagTransferRequest',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequest,
    responseType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgCancelDTagTransferRequestResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgCancelDTagTransferRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgCancelDTagTransferRequest,
    responseSerialize: serialize_desmos_profiles_v3_MsgCancelDTagTransferRequestResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgCancelDTagTransferRequestResponse,
  },
  // AcceptDTagTransferRequest defines the method to accept an incoming DTag
// transfer request
acceptDTagTransferRequest: {
    path: '/desmos.profiles.v3.Msg/AcceptDTagTransferRequest',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequest,
    responseType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgAcceptDTagTransferRequestResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgAcceptDTagTransferRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgAcceptDTagTransferRequest,
    responseSerialize: serialize_desmos_profiles_v3_MsgAcceptDTagTransferRequestResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgAcceptDTagTransferRequestResponse,
  },
  // RefuseDTagTransferRequest defines the method to refuse an incoming DTag
// transfer request
refuseDTagTransferRequest: {
    path: '/desmos.profiles.v3.Msg/RefuseDTagTransferRequest',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequest,
    responseType: desmos_profiles_v3_msgs_dtag_requests_pb.MsgRefuseDTagTransferRequestResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgRefuseDTagTransferRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgRefuseDTagTransferRequest,
    responseSerialize: serialize_desmos_profiles_v3_MsgRefuseDTagTransferRequestResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgRefuseDTagTransferRequestResponse,
  },
  // LinkChainAccount defines a method to link an external chain account to a
// profile
linkChainAccount: {
    path: '/desmos.profiles.v3.Msg/LinkChainAccount',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccount,
    responseType: desmos_profiles_v3_msgs_chain_links_pb.MsgLinkChainAccountResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgLinkChainAccount,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgLinkChainAccount,
    responseSerialize: serialize_desmos_profiles_v3_MsgLinkChainAccountResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgLinkChainAccountResponse,
  },
  // UnlinkChainAccount defines a method to unlink an external chain account
// from a profile
unlinkChainAccount: {
    path: '/desmos.profiles.v3.Msg/UnlinkChainAccount',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccount,
    responseType: desmos_profiles_v3_msgs_chain_links_pb.MsgUnlinkChainAccountResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgUnlinkChainAccount,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgUnlinkChainAccount,
    responseSerialize: serialize_desmos_profiles_v3_MsgUnlinkChainAccountResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgUnlinkChainAccountResponse,
  },
  // SetDefaultExternalAddress allows to set a specific external address as the
// default one for a given chain
setDefaultExternalAddress: {
    path: '/desmos.profiles.v3.Msg/SetDefaultExternalAddress',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddress,
    responseType: desmos_profiles_v3_msgs_chain_links_pb.MsgSetDefaultExternalAddressResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgSetDefaultExternalAddress,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgSetDefaultExternalAddress,
    responseSerialize: serialize_desmos_profiles_v3_MsgSetDefaultExternalAddressResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgSetDefaultExternalAddressResponse,
  },
  // LinkApplication defines a method to create a centralized application
// link
linkApplication: {
    path: '/desmos.profiles.v3.Msg/LinkApplication',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplication,
    responseType: desmos_profiles_v3_msgs_app_links_pb.MsgLinkApplicationResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgLinkApplication,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgLinkApplication,
    responseSerialize: serialize_desmos_profiles_v3_MsgLinkApplicationResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgLinkApplicationResponse,
  },
  // UnlinkApplication defines a method to remove a centralized application
unlinkApplication: {
    path: '/desmos.profiles.v3.Msg/UnlinkApplication',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplication,
    responseType: desmos_profiles_v3_msgs_app_links_pb.MsgUnlinkApplicationResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgUnlinkApplication,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgUnlinkApplication,
    responseSerialize: serialize_desmos_profiles_v3_MsgUnlinkApplicationResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgUnlinkApplicationResponse,
  },
  // UpdateParams defines a (governance) operation for updating the module
// parameters.
// The authority defaults to the x/gov module account.
//
// Since: Desmos 5.0.0
updateParams: {
    path: '/desmos.profiles.v3.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_msgs_params_pb.MsgUpdateParams,
    responseType: desmos_profiles_v3_msgs_params_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_desmos_profiles_v3_MsgUpdateParams,
    requestDeserialize: deserialize_desmos_profiles_v3_MsgUpdateParams,
    responseSerialize: serialize_desmos_profiles_v3_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
