### 服务熔断
服务熔断，是provider这边管理的，在目前项目里面需要配合的Module有如下：
`springcloud-api-feign`, `springcloud-provider-hystrix-fusing-8003`, `springcloud-consumer-feign-8801`, 此时，
provider和consumer都需要引入springcloud-api-feign这个api。

### 服务降级
服务降级，是consumer这边管理的，在目前项目里面需要配合的Module有如下：
`springcloud-api-feign-hystrix`, `springcloud-provider-demote-8004`, `springcloud-consumer-feign-hystrix-8901`, 此时，
provider和consumer都需要引入springcloud-api-feign这个api。

完成情况
完成 : eureka，ribbon，feign，hystrix降级和熔断
未完成: hystrix dashboard, zuul, config