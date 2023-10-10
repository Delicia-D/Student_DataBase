package com.demo.demo_project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect 
public class AspectConfig {
org.slf4j.Logger logger =LoggerFactory.getLogger(getClass());

@Before(value="execution(* com.demo.demo_project.api.*.*(..)) and args(object)")
public void beforeAdvice(JoinPoint joinpoint,Object object) {
	logger.info("Request"+object);
}

}
