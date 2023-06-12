// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var iov_starname_v1beta1_tx_pb = require('../../../iov/starname/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var iov_starname_v1beta1_types_pb = require('../../../iov/starname/v1beta1/types_pb.js');

function serialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificate(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgAddAccountCertificate)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgAddAccountCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificate(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgAddAccountCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificateResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgAddAccountCertificateResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgAddAccountCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificateResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgAddAccountCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteAccount(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteAccount)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccount(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificate(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificate)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteAccountCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificate(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificateResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificateResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteAccountCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificateResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteAccountResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteDomain(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteDomain)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteDomain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteDomain(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteDomain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgDeleteDomainResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgDeleteDomainResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgDeleteDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgDeleteDomainResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgDeleteDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRegisterAccount(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRegisterAccount)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRegisterAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRegisterAccount(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRegisterAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRegisterAccountResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRegisterAccountResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRegisterAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRegisterAccountResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRegisterAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRegisterDomain(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRegisterDomain)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRegisterDomain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRegisterDomain(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRegisterDomain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRegisterDomainResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRegisterDomainResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRegisterDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRegisterDomainResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRegisterDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRenewAccount(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRenewAccount)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRenewAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRenewAccount(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRenewAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRenewAccountResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRenewAccountResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRenewAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRenewAccountResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRenewAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRenewDomain(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRenewDomain)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRenewDomain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRenewDomain(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRenewDomain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgRenewDomainResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgRenewDomainResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgRenewDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgRenewDomainResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgRenewDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadata(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadata)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgReplaceAccountMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadata(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadataResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadataResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgReplaceAccountMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadataResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResources(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgReplaceAccountResources)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgReplaceAccountResources');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResources(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgReplaceAccountResources.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResourcesResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgReplaceAccountResourcesResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgReplaceAccountResourcesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResourcesResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgReplaceAccountResourcesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgTransferAccount(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgTransferAccount)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgTransferAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgTransferAccount(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgTransferAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgTransferAccountResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgTransferAccountResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgTransferAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgTransferAccountResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgTransferAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgTransferDomain(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgTransferDomain)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgTransferDomain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgTransferDomain(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgTransferDomain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_MsgTransferDomainResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_tx_pb.MsgTransferDomainResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.MsgTransferDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_MsgTransferDomainResponse(buffer_arg) {
  return iov_starname_v1beta1_tx_pb.MsgTransferDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the starname Msg service.
var MsgService = exports.MsgService = {
  // AddAccountCertificate adds a certificate to an Account
addAccountCertificate: {
    path: '/starnamed.x.starname.v1beta1.Msg/AddAccountCertificate',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgAddAccountCertificate,
    responseType: iov_starname_v1beta1_tx_pb.MsgAddAccountCertificateResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificate,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificate,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificateResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgAddAccountCertificateResponse,
  },
  // DeleteAccount registers a Domain
deleteAccount: {
    path: '/starnamed.x.starname.v1beta1.Msg/DeleteAccount',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgDeleteAccount,
    responseType: iov_starname_v1beta1_tx_pb.MsgDeleteAccountResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteAccount,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccount,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountResponse,
  },
  // DeleteAccountCertificate deletes a certificate from an account
deleteAccountCertificate: {
    path: '/starnamed.x.starname.v1beta1.Msg/DeleteAccountCertificate',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificate,
    responseType: iov_starname_v1beta1_tx_pb.MsgDeleteAccountCertificateResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificate,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificate,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificateResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteAccountCertificateResponse,
  },
  // DeleteDomain registers a Domain
deleteDomain: {
    path: '/starnamed.x.starname.v1beta1.Msg/DeleteDomain',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgDeleteDomain,
    responseType: iov_starname_v1beta1_tx_pb.MsgDeleteDomainResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteDomain,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteDomain,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgDeleteDomainResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgDeleteDomainResponse,
  },
  // RegisterAccount registers an Account
registerAccount: {
    path: '/starnamed.x.starname.v1beta1.Msg/RegisterAccount',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgRegisterAccount,
    responseType: iov_starname_v1beta1_tx_pb.MsgRegisterAccountResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgRegisterAccount,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRegisterAccount,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgRegisterAccountResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRegisterAccountResponse,
  },
  // RegisterDomain registers a Domain
registerDomain: {
    path: '/starnamed.x.starname.v1beta1.Msg/RegisterDomain',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgRegisterDomain,
    responseType: iov_starname_v1beta1_tx_pb.MsgRegisterDomainResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgRegisterDomain,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRegisterDomain,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgRegisterDomainResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRegisterDomainResponse,
  },
  // RenewAccount registers a Domain
renewAccount: {
    path: '/starnamed.x.starname.v1beta1.Msg/RenewAccount',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgRenewAccount,
    responseType: iov_starname_v1beta1_tx_pb.MsgRenewAccountResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgRenewAccount,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRenewAccount,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgRenewAccountResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRenewAccountResponse,
  },
  // RenewDomain registers a Domain
renewDomain: {
    path: '/starnamed.x.starname.v1beta1.Msg/RenewDomain',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgRenewDomain,
    responseType: iov_starname_v1beta1_tx_pb.MsgRenewDomainResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgRenewDomain,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRenewDomain,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgRenewDomainResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgRenewDomainResponse,
  },
  // ReplaceAccountMetadata registers a Domain
replaceAccountMetadata: {
    path: '/starnamed.x.starname.v1beta1.Msg/ReplaceAccountMetadata',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadata,
    responseType: iov_starname_v1beta1_tx_pb.MsgReplaceAccountMetadataResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadata,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadata,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadataResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountMetadataResponse,
  },
  // ReplaceAccountResources registers a Domain
replaceAccountResources: {
    path: '/starnamed.x.starname.v1beta1.Msg/ReplaceAccountResources',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgReplaceAccountResources,
    responseType: iov_starname_v1beta1_tx_pb.MsgReplaceAccountResourcesResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResources,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResources,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResourcesResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgReplaceAccountResourcesResponse,
  },
  // TransferAccount registers a Domain
transferAccount: {
    path: '/starnamed.x.starname.v1beta1.Msg/TransferAccount',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgTransferAccount,
    responseType: iov_starname_v1beta1_tx_pb.MsgTransferAccountResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgTransferAccount,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgTransferAccount,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgTransferAccountResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgTransferAccountResponse,
  },
  // TransferDomain registers a Domain
transferDomain: {
    path: '/starnamed.x.starname.v1beta1.Msg/TransferDomain',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_tx_pb.MsgTransferDomain,
    responseType: iov_starname_v1beta1_tx_pb.MsgTransferDomainResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_MsgTransferDomain,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgTransferDomain,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_MsgTransferDomainResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_MsgTransferDomainResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
