# dubbo_yll
dubbo入门框架搭建

#<dubbo:registry address="zookeeper://localhost:2181"/>
端口需要根据安装zookeeper后conf配置文件中的端口对应

#<!-- 用dubbo协议在20880端口暴露服务 -->
<dubbo:protocol name="dubbo" port="20880" />
20880为暴露服务的端口