package com.zbf.server;

import service.DefaultApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("defaultService")
public class DefaultServiceImpl implements DefaultApiService{

	@Value("${server.port}")
	private String port;

	public String defaultMethod(String str) {
		return "hello "+str+port;
	}
}
