package com.piaoyu.pfs.fs.storage;

/**
 * PFS INode
 * Created by piaoyu on 14-11-11.
 */
public abstract class INode {

    private long fileSize;

    private int blocks;

    private byte[] bytes;

    private String userId;

    private String groudId;

    private int Links;

    private int ctime;

    private int mtime;

    private int atime;

    public boolean isDirectory(){
        return false;
    }

}
