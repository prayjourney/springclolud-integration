服务降级的说明

### 服务降级
服务降级，是consumer这边管理的，在目前项目里面需要配合的Module有如下：
`springcloud-api-feign-hystrix`, `springcloud-provider-demote-8004`, `springcloud-consumer-feign-hystrix-8901`, 此时，
provider和consumer都需要引入springcloud-api-feign这个api。