package com.piaoyu.pfs.fs.rpc;


import com.piaoyu.pfs.fs.io.Writable;

/**
 * RPC Call
 * Created by piaoyu on 14-11-21.
 */
public class Call {

    int id;
    int retry;
    Writable rpcRequest;
    Writable rpcResponse;
    boolean done;
}
