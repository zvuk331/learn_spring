package org.example.lesson2.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.lesson2")
@EnableAspectJAutoProxy
public class MyConfig {
}
