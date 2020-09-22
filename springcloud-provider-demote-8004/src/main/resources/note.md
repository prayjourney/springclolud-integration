服务降级的说明

使用了springcloud-api-feign-hystrix提供的接口service-api
降级功能配合了feign，虽然服务端`provider`引用了这个接口，但是服务的降级，是在`consumer`上面控制的