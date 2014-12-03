package com.piaoyu.pfs.fs.rpc.client;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * IPC Client
 * Created by piaoyu on 14-11-18.
 */
public class Client {

    static class ConnectionId {
        InetSocketAddress inetSocketAddress;
        int rpcTimeout;
    }

    class Connection extends Thread{
        ConnectionId remoteId;
        private InetSocketAddress server;
        Socket socket = null;

    }


}
