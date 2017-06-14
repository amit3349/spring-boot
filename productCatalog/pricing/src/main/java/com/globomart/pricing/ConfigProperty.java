package com.globomart.pricing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class ConfigProperty {

	
	@Value("${catalog.port}")
    private int port;

    @Value("${catalog.host}")
    private String host;

	public int getPort() {
		System.out.println("port: "+port);
		return port;
	}

	public void setPort(int port) {
		System.out.println("port: "+port);
		this.port = port;
	}

	public String getHost() {
		System.out.println("host: "+host);
		return host;
	}

	public void setHost(String host) {
		System.out.println("host: "+host);
		this.host = host;
	}
    
}
 