@echo on
cd /d E:\middle-ware\rocketmq-all-5.3.1-bin-release\bin
start /b mqnamesrv
start /b mqbroker -n localhost:9876