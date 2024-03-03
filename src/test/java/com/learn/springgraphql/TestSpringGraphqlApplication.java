package com.learn.springgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringGraphqlApplication::main).with(TestSpringGraphqlApplication.class).run(args);
	}

}
