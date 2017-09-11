package cn.edu.gcp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.gcp.po.User;
import cn.edu.gcp.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<User> list=userService.getList();
		//System.out.println(list.size());
		model.addAttribute("list", list);
		return "list";
	}
	
	
}
