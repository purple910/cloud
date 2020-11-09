## 微服务的一个重要特点是每个服务都是一个可以独立运行的项目，要是按照以前的SSM的搭建方式，无法做到服务的快速搭建和部署。
## 于是Spring Boot应运而生，它的理念就是约定大于配置，你选好模块，自动帮你搭建好环境，非常便捷。

## 接下来用Spring Boot搭建两个简单的用户微服务：user-service和user-consume，实现的功能是：user-consume使用RestTemplate调用user-service服务。