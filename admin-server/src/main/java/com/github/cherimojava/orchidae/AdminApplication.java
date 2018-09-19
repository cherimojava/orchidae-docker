package com.github.cherimojava.orchidae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class AdminApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run( AdminApplication.class,args );
    }
}
