package me.jiaozhu.log4j.util;

import org.apache.log4j.Logger;

/**
 * Author: jiaozhu
 * Email: gitview(at)gmail.com
 * Time: 14/11/28
 * Description: 日志记录工具类
 */
public class LogWriter {
    private static Logger testLogger = Logger.getLogger("test");
    private static Logger systemLogger = Logger.getLogger("system");

    public static void testDebug(String message){
        testLogger.debug(message);
    }

    public static void testInfo(String message){
        testLogger.info(message);
    }

    public static void testError(String message){
        testLogger.error(message);
    }

    public static void testError(String message,Throwable exception){
        testLogger.error(message,exception);
    }

    public static void sysDebug(String message){
        systemLogger.debug(message);
    }

    public static void sysInfo(String message){
        systemLogger.info(message);
    }

    public static void sysError(String message){
        systemLogger.error(message);
    }

    public static void sysError(String message,Throwable exception){
        systemLogger.error(message,exception);
    }

}
