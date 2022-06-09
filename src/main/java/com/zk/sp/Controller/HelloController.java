package com.zk.sp.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hornsey
 * @create 2022/6/9 15:40
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/name")
	public String hello(String name){
		log.info("[info]name name={}",name);
		return "hello! "+name;
	}
}
