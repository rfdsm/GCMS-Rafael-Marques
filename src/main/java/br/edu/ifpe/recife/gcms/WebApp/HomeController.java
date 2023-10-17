package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {

		return "Hello, World";
	}
	
	@RequestMapping("/rafael")
	public @ResponseBody String greetingRafael() {
	return "Hello, Rafael Marques!";
	}
}