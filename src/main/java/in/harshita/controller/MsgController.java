package in.harshita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","welcome to Harshita's Project");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greeting")
	public ModelAndView getGreeting() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Greetings from Harshita's Project");
		mav.setViewName("message");
		return mav;
	}

}
