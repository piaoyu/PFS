package com.piaoyu.pfs.fs.common;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络工具类
 * Created by piaoyu on 14-11-21.
 */
public class NetUtil {

    /**
     * 获取本机的HostName
     * @return
     * @throws UnknownHostException
     */
    static String getHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

}
