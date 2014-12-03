package com.piaoyu.pfs.fs.common;

import com.sun.management.OperatingSystemMXBean;
import sun.management.ManagementFactory;

/**
 * 操作系统环境工具类
 * Created by piaoyu on 14-10-23.
 */
public class OSUtil {

    static OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory
            .getOperatingSystemMXBean();

    /**
     * 获取操作系统的名称
     *
     * @return
     */
    public static String getOSName() {
        return System.getProperty("os.name");
    }

    /**
     * 获取操作系统的架构
     *
     * @return
     */
    public static String getOSArch() {
        return System.getProperty("os.arch");
    }

    /**
     * 获取操作系统的版本
     *
     * @return
     */
    public static String getOSVersion() {
        return System.getProperty("os.version");
    }


    /**
     * 获取用户名
     *
     * @return
     */
    public static String getUserName() {
        return System.getProperty("user.name");
    }

    /**
     * 获取用户的当前工作目录
     *
     * @return
     */
    public static String getUserDir() {
        return System.getProperty("user.dir");
    }


    /**
     * 获取CPU核数
     *
     * @return
     */
    public static int getCPUCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    /**
     * 获取JVM可使用内存
     *
     * @return
     */
    public static long getTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    /**
     * 获取JVM剩余内存
     *
     * @return
     */
    public static long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    /**
     * 获取JVM最大可使用内存
     *
     * @return
     */
    public static long getMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    /**
     * 获取总的物理内存
     *
     * @return
     */
    public static long getTotalPhysicalMemorySize() {
        return osmxb.getTotalPhysicalMemorySize();
    }

    /**
     * 获取剩余的物理内存
     *
     * @return
     */
    public static long getFreePhysicalMemorySize() {
        return osmxb.getFreePhysicalMemorySize();
    }

    /**
     * 获取已使用的物理内存
     *
     * @return
     */
    public static long getUsedMemory() {
        return osmxb.getTotalPhysicalMemorySize() - osmxb
                .getFreePhysicalMemorySize();
    }


    /**
     * 获取文件的分割符
     *
     * @return
     */
    public static String getFileSep() {
        return System.getProperty("file.separator");
    }

    /**
     * 获取路径分隔符
     *
     * @return
     */
    public static String getPathSep() {
        return System.getProperty("path.separator");
    }

    /**
     * 获取行分割符
     *
     * @return
     */
    public static String getLineSep() {
        return System.getProperty("line.separator");
    }
}
