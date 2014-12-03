package com.piaoyu.pfs.fs.common;

/**
 * Java环境工具类
 * Created by piaoyu on 14-10-23.
 */
public class JavaUtil {

    /**
     * 获取Java 版本
     *
     * @return
     */
    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    /**
     * 获取Java 安装路径
     *
     * @return
     */
    public static String getJavaHome() {
        return System.getProperty("java.home");
    }

    /**
     * 获取 Java 类路径
     *
     * @return
     */
    public static String getJavaClassPath() {
        return System.getProperty("java.class.path");
    }

    /**
     * 获取默认的临时文件路径
     *
     * @return
     */
    public static String getIOTempDir() {
        return System.getProperty("java.io.tmpdir");
    }
}
