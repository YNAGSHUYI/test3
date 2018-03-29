package com.yjs.micro.feignserver.foeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yjs.micro.feignserver.foeign.impl.SchedualServiceLoginHystric;

@FeignClient(value="service-login", fallback=SchedualServiceLoginHystric.class) //注入服务调用的接口
public interface SchedualServiceLogin {

	//需要调用的服务是哪一个，（restfeng风格）
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
