## EurekaServer：注册中心，可以是多个Eureka的集群，对外暴露自己的地址。
## 服务提供者：启动后在注册中心中注册，成功后定期使用http方法向注册中心发送心跳包，表明自己还活着。
## 客户端消费者：向注册中心订阅服务。注册中心会向消费者发送合适的服务提供者列表，并且定期更新。需要使用某个服务时，可以从列表中找到并调用。

```
user-eureka:注册中心(eureka-server)(只要一个Eureka Server即可)
user-service:服务端提供者(eureka-client)
user-consume:客户端消费者(eureka-client)
```
