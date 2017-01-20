package com.uip.panel.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/BOOT-INF/static/");


        registry.viewResolver(viewResolver);
    }


    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        configurer.setUseSuffixPatternMatch(false);
    }
}
