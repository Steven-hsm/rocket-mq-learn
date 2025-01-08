### 1. 下载bin文件

https://dist.apache.org/repos/dist/release/rocketmq/5.3.1/rocketmq-all-5.3.1-bin-release.zip

### 2. 配置环境变量

ROCKET_HOME rocketmq的配置路径

JAVA_HOME java的配置路径

### 3. 启动nameserver

进入 ROCKET_HOME ，输入cmd

```shell
mqnameserv
```

### 4. 启动broker

进入 ROCKET_HOME ，输入cmd

```shell
mqbroker -n localhost:9876
```

编写脚本

```shell
@echo on
cd /d E:\middle-ware\rocketmq-all-5.3.1-bin-release\bin
start /b mqnamesrv
start /b mqbroker -n localhost:9876
```

### 5. 安装rocketmq-dashboard

https://github.com/apache/rocketmq-dashboard/releases/tag/rocketmq-dashboard-2.0.0

下载代码后编译

启动应用即可

