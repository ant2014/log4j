package org.jiaozhu.log4j;

import org.apache.log4j.Logger;
import org.jiaozhu.log4j.util.LogWriter;

/**
 * Author: jiaozhu
 * Email: gitview(at)gmail.com
 * Time: 14/11/28
 * Description: log4j使用
 */
public class Log4jDemo {

    private static Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        logger.debug("没有配置logger的日志输出");
        LogWriter.testDebug("用于测试环境的日志输出");
        LogWriter.sysDebug("用于生产环境的日志输出");
    }
}
