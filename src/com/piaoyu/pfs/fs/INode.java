package com.piaoyu.pfs.fs;

/**
 * PFS INode
 * Created by piaoyu on 14-11-11.
 */
public class INode {


    private String fileName;

    private byte[] bytes;

    private String userId;

    private String groudId;

    private int ctime;

    private int mtime;

    private int atime;


    public boolean isDirectory(){
        return false;
    }

}
