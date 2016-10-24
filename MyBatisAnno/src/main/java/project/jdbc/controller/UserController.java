package project.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.jdbc.service.UserService;

@Controller
@RequestMapping("bat")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("users", userService.findAll());
		return "bat/index";
	}
	@RequestMapping(value = "detail/{id}", method=RequestMethod.GET)
	public String detail(@PathVariable("id") Integer id, ModelMap modelMap) {
		modelMap.put("user", userService.findUserById(id));
		return "bat/detail";
	}
}
