package com.yjs.micro.feignserver.foeign.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yjs.micro.feignserver.foeign.SchedualServiceLogin;


@Service  //将这请求是被的要执行的bean注入到IOC的容器中
public class SchedualServiceLoginHystric implements SchedualServiceLogin{
	
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return  "sorry "+name;
	}

	

}
