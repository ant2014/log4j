# LOG4J使用示例

> 自己平时使用的LOG4J的配置与工具类

## 说明

### log4j.properties

设定了三个logger

* test ：用于开发环境
* system ：用于生产环境
* other ：用于默认没有使用logger的日志输出，及其它使用Logger.getLogger(A1.Class)的调用

### LogWrite

log4j的工具类，使用方法

```
LogWriter.testDebug("用于测试环境的日志输出");
LogWriter.sysDebug("用于生产环境的日志输出");
```


