### 情况说明
##### 这个是熔断，在服务提供者provider端
##### 熔断需要使用到的方法，放在service层吧，在controller层不好使啊！

### hystrix服务熔断的相关module
#### `springcloud-api-feign`基础的api, `springcloud-provider-hystrix-fusing-8003`服务端功能，准备熔断方法，开启了熔断，然后运行之后，
#### 提供了springcloud-provider服务，然后让`springcloud-consumer-feign-8801`等使用了feign的消费者来消费，然后就可以触发
#### springcloud-provider服务的熔断了