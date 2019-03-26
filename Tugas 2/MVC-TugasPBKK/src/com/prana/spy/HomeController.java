package com.prana.spy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMenu()
	{
		return "form";
	}

	
	@RequestMapping("/form")
	public String showForm()
	{
		return "form";
	}
	
	@RequestMapping("/Data")
	public String requestData(HttpServletRequest request, Model model)
	{
		String name = request.getParameter("spyName");
		String types = null;
		String type = request.getParameter("assassin");
		String type2 = request.getParameter("whistle");
		String type3 = request.getParameter("eaves");
		int stat = 0;
		int stat2 = 0;
		int stat3 = 0;
		if(type!=null)
			if(type.equals("1"))
			{
				types = "Assassin";
				stat = 1;
			}
				
				
		if(type2!=null)
			if(type2.equals("1"))
			{
				types = types + ", Whistle Blower";
				stat2 = 1;
			}
				
		if(type3!=null)
			if(type3.equals("1"))
			{
				types = types + ", EavesDropper";
				stat3 = 1;
			}
				
		if(types == null)
		{
			types = "The Noobs";
		}
		
		model.addAttribute("spyName",name);
		model.addAttribute("types", types);
		model.addAttribute("jobs1",stat);
		model.addAttribute("jobs2",stat2);
		model.addAttribute("jobs3",stat3);
		return "index";
	}
}
