package cn.edu.gcp.web;

import java.util.List;

import org.junit.runners.Parameterized.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.gcp.po.User;
import cn.edu.gcp.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<User> list=userService.getList();
		logger.info("info========to===================呵呵呵呵呵呵呵呵");
		logger.debug("list.size==========to==================" ,list.size());
		//System.out.println(list.size());
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("detail/{id}")
	public String edit(@PathVariable("id")int id,Model model) {
		//System.out.println(id);
		logger.info("user id= "+id+"  in detail");
		model.addAttribute("user",userService.getById(id));
		return "detail";
	}
	
	@RequestMapping("edit/{id}")
	public String editUserNameById(@PathVariable("id")int id,String name,Model model) {
		logger.info("user id= "+id + "  name= "+name+"  in edit");
		model.addAttribute("result",userService.editUserNameById(id, name));
		return "edit";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteUserById(@PathVariable("id")int id) {
		logger.info("user id= "+id + "  to delete");
		int i=userService.deleteUserById(id);
		return "redirect:/user/list";
	}
}
