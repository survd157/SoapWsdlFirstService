package com.wsdlfirst.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wsdlfirst.EmpDataWsImpl;

import jakarta.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint endpoint1() {
		EndpointImpl endpoint = new EndpointImpl(bus, new EmpDataWsImpl());
		endpoint.publish("/empDataService");
		return endpoint;

	}

}
