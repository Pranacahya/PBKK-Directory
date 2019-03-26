package com.prana.spy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpyController {
	
	public String ShowForm()
	{
		return "spyController";	
	}
}
