package net.codejava;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView help() {
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data 
		modelAndView.addObject("name", "Iqra Shah");
		modelAndView.addObject("Rollnumber" , 26);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.addObject("Teacher", "Maryam");
		
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(66);
		list.add(29);
		
		modelAndView.addObject("marks" , list);
		
		
		//setting the view name
		modelAndView.setViewName("help");
		
		
		
		
		
		
		
		
		return modelAndView;
	}
}
