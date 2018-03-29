package com.yjs.micro.feignserver.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yjs.micro.feignserver.foeign.SchedualServiceLogin;

//提供的API接口
@RestController
public class APILoginControll {

	  @Autowired
	  public SchedualServiceLogin schedualServiceLogin;
	  
	  @RequestMapping(value = "/hi",method = RequestMethod.GET)
	  public String sayHi(@RequestParam String name){
		  System.out.println("11111111111111111111111111");
	      return schedualServiceLogin.sayHiFromClientOne(name);
	  }
}
