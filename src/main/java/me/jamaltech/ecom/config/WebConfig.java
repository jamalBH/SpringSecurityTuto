package me.jamaltech.ecom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "me.jamaltech.ecom.controllers" })
public class WebConfig extends WebMvcConfigurerAdapter {
   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
      registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
   }
}