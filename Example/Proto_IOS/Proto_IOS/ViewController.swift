//
//  ViewController.swift
//  Proto_IOS
//
//  Created by yongjoo jung on 2023/05/26.
//

import UIKit
import GRPC
import NIO

class ViewController: UIViewController {

    let URL_GRPC = "grpc-cosmos.cosmostation.io"
    let PORT_GRPC = 443
    
    var grpcChannel: GRPCChannel?
    var clientConnection: ClientConnection?

    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    
    @IBAction func onClickCall(_ sender: UIButton) {
        callNodeInfo()
        callAuth("cosmos1c4k24jzduc365kywrsvf5ujz4ya6mwymy8vq4q")
    }
    
    func getChannel() -> ClientConnection! {
        if (clientConnection != nil) {
            return clientConnection
        } else {
            let group = MultiThreadedEventLoopGroup(numberOfThreads: 3)
            clientConnection = ClientConnection.usingTLSBackedByNIOSSL(on: group).connect(host: self.URL_GRPC, port: self.PORT_GRPC)
            return clientConnection
        }
    }
    
    func callNodeInfo() {
        let request = Cosmos_Base_Tendermint_V1beta1_GetNodeInfoRequest()
        if let response = try? Cosmos_Base_Tendermint_V1beta1_ServiceNIOClient(channel: getChannel()).getNodeInfo(request).response.wait() {
            print("callNodeInfo ", response.defaultNodeInfo)
        }
    }
    
    func callAuth(_ address: String) {
        let request = Cosmos_Auth_V1beta1_QueryAccountRequest.with { $0.address = address }
        if let response = try? Cosmos_Auth_V1beta1_QueryNIOClient(channel: getChannel()).account(request).response.wait() {
            print("callAuth ", response.account)
        }
    }
}

