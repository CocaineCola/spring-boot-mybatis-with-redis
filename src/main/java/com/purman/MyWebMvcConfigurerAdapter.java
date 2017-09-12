package com.purman;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
* @Description:
* @author quintin.zhang quintin.zhang@yoho.cn 
* @date 2017/8/1 19:12
*/
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

	/**
	 * 配置可访问路径
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/upload/**");
		registry.addResourceHandler("/web/**");
		super.addResourceHandlers(registry);
	}
}
