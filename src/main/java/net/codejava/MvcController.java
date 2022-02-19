package net.codejava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

	@RequestMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("name", "Iqra Shah");
		model.addAttribute("id", 1601);
		List<String> friends = new ArrayList<String>();
		friends.add("Kiran");
		friends.add("Haya");
		friends.add("faryal");
		
		model.addAttribute("f", friends);
		System.out.println("Model Example");
		
		
		return "home";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("called by about Controller");
		return "/about";
	}
	@RequestMapping("/service")
	public String service() {
		System.out.println("Call from Service Page");
		return "/service";
	}
	@RequestMapping("/help")
	public String help() {
		return "/help";
	}
}
