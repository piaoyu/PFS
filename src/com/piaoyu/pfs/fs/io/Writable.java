package com.piaoyu.pfs.fs.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * 序列化
 * Created by piaoyu on 14-11-18.
 */
public abstract class Writable {

    abstract void write(DataOutput out) throws IOException;

    abstract Writable read(DataInput in) throws IOException;
}
