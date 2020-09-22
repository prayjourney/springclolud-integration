### 情况说明
##### 这个是熔断，在服务提供者provider端
##### 熔断需要使用到的方法，放在service层吧，在controller层不好使啊！

### 服务熔断
服务熔断，是provider这边管理的，在目前项目里面需要配合的Module有如下：
`springcloud-api-feign`, `springcloud-provider-hystrix-fusing-8003`, `springcloud-consumer-feign-8801`, 此时，
provider和consumer都需要引入springcloud-api-feign这个api。