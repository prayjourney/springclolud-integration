`springcloud-config-consumer-ribbon-8991`这个是以consumer为对象，然后配置采用了springcloud的远程配置方式获取，相关的module有：
`springcloud-config-server-3344`这个是config server, 一般而言一个分布式项目之中，需要一个就差不多了
`springcloud-config-consumer-ribbon-8991`这个是config的 client， 从config server之中获取配置信息，本身的角色是一个消费者额
`springcloud-provider-8001`这个是服务提供者， 本身也可以使用config进行配置，此处没有做修改。

`springcloud-config-server-3344`可以注册到eureka, `springcloud-provider-8001`也可以注册到eureka, 使用ribbon和feign就可以使用服务名访问，
面向接口编程，并且有负载均衡的能力。当然这个和上面的关系不大。

主要就是要说，config是C-S架构，对于consumer消费者和provider服务提供者而言，他们都是C，client，从S, config的server之中获取配置，而
server是从远程git仓库之中获取配置，这个仓库之中可以有多个配置文件，不同项目的都可以，只需要使用xxx.yml或者xxx.properties来区分就行了。


`springcloud-config-consumer-ribbon-8991`模块启动演示需要同时启动的module：
`springcloud-eureka-7001`, `springcloud-eureka-7002`, `springcloud-eureka-7003`, `springcloud-config-server-3344`以及
`springcloud-provider-8001`(生产者) 和 `springcloud-config-consumer-ribbon-8991`(需要测试的消费者本身)。生产者有多个选择，可以开启多个
或者`springcloud-provider-8002`, `springcloud-provider-hystrix-fusing-8003`都可以, `springcloud-provider-demote-8004`使用了
`springcloud-api-feign-hystrix`这个api, 不匹配，所以不能配合使用，其他没有注意事项。

bootstrap.yml或者bootstrap.properties是系统级别的配置，application.yml或者application..properties是用户级别的配置，
使用了config配置的client端，都需要bootstrap.yml的配置文件。