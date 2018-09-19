package com.github.cherimojava.orchidae.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryService
{
    public static void main( String[] args )
    {
        SpringApplication.run( EurekaDiscoveryService.class,args );
    }
}
