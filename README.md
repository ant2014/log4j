# LOG4J使用示例

> 自己平时使用的LOG4J的配置与工具类

## 说明

### 一、log4j.properties

> 设定了三个logger

#### TEST

用于开发环境，日志输出在控制台，内容不会出现在rootLogger中

#### SYSTEM

用于生产环境，日志输出在logs/system.log中，内容不会出现在rootLogger中

#### OTHER

默认的rootLogger日志输出，日志输出在logs/other.log中

### 二、LogWriter.java

>log4j的工具类，使用方法

每个LOGGER都有四个使用方法，分别是：Debug、Info、Error、Error

```
LogWriter.testDebug("用于测试环境的日志输出");
LogWriter.sysDebug("用于生产环境的日志输出");
```


