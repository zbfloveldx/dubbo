package com.zbf.server;

import service.DefaultApiService;
import org.springframework.stereotype.Service;

@Service("defaultService2")
public class DefaultServiceImpl2 implements DefaultApiService{

	public String defaultMethod(String str) {
		return "hello  2.0 "+str;
	}
}
