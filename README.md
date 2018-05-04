# microservice-poc
A simple microservice poc for the beginners. 

We are using eureka discovery server for the perpose of registration of services.
There are three projects here.

1.microservice-server : Used to create a server using eureka discovery server.

2.microservice-producer : Used as a web service provider, we are using jersey for that.

3.microservice-consumer : Used as a web part which will consume the services provided by producer, we are using spring-mvc for that.

4.micorservice-consumer-zuul : zull client which will request to zull-gatewayproxy for the service.

5.zull-gatewayproxy :  zull server for the purpose of routing.

6.ribbon-client : load balancing using ribbon.
 
