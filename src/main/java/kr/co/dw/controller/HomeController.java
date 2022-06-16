package kr.co.dw.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.dw.coffee.utils.CoffeeUtils;

@Controller
public class HomeController {
	
	//private String uploadPath = "C:"+File.separator+"coffeeupload";
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home() {
    return "home";
  }
  
  @RequestMapping(value = "/makefolder", method = RequestMethod.GET)
  public String makeFolder(Model model) {
	  
	  String uploadPath = CoffeeUtils.makeFolder("C:"+File.separator+"coffeeupload");
	  System.out.println(uploadPath);
			  
	  return "redirect:/";
  }
}
