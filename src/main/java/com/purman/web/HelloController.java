package com.purman.web;

import org.springframework.web.bind.annotation.*;

/*
* @Description:
* @author quintin.zhang quintin.zhang@yoho.cn 
* @date 2017/8/2 15:33
*/
@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/boot", method = RequestMethod.GET)
	@ResponseBody
	public String hello(@RequestParam String name) throws InterruptedException {
		return "Hello " + name;
	}

}
