# dubbo_yll
dubbo入门框架搭建

#<dubbo:registry address="zookeeper://localhost:2181"/>
端口需要根据安装zookeeper后conf配置文件中的端口对应

#<!-- 用dubbo协议在20880端口暴露服务 -->
<dubbo:protocol name="dubbo" port="20880" />
20880为暴露服务的端口

#springboot整合dubbo开发工程中遇到的坑
1.dubbo中一个服务既是生产者又是消费者的时候，xml配置可以写在同一个配置文件中，因为一个dubbo服务的dubbo:application只能有一个，否则项目启动会报错。
2.修改了yml中的dubbo服务启动端口，但是服务启动后总是在20880端口启动，最后发现是在xml配置中注册服务的时候多加了一个protoco="dubbo"，所以每次启动默认启动了20880的端口
