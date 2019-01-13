package com.singplayground;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@PropertySource("classpath:ui.properties")



@RestController
public class RestExampleController {

	
	@Value("${test.ui}")
	private String ui;
	
	
	@RequestMapping("example1")
	String home() {
		String prefix = System.getenv().getOrDefault("SPECIAL_LEVEL_KEY", "Hi");
		return "Hello World! this is 2" + ui + " " + prefix;
	}

	@RequestMapping(value = "example2", method = RequestMethod.GET)
	public @ResponseBody HashMap example2Controller() throws Exception {
		HashMap hm = new HashMap();
		hm.put("name", "john");
		return hm;
	}

}