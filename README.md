# springclolud-integration
### 本项目以springboot2.x为基础，整合springcloud的五大组件, `eureka`,`ribbon`,`hystrix`,`zuul`,`config`以及`Feign`。
在eureka配置集群，如果在本地，需要在hosts之中加入如下映射：
```xml
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com
127.0.0.1 eureka7003.com
```
