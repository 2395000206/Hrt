package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

 
import com.bean.Users;
import com.service.UsersService;

/**
* @author 作者 XU:
* @version 创建时间：2019年11月27日 下午3:39:43 
* 类说明
*/
@Controller
@SessionAttributes("user")
public class UsersControlles {
	@Resource
	private UsersService usersService;
	@RequestMapping(value = "hr/hr/login",method = RequestMethod.POST)
	public String sele(@ModelAttribute("springWeb") Users k,ModelMap mm ) {
 
	 	Users z= usersService.sele(k); 
 
		if(z!=null) {	 
			mm.addAttribute("user",z);			 
			return "/hr/hr/page/index";
			}else {
				mm.addAttribute("kk","没有该账a户");
		 
				return "/hr/hr/login";
			}
			   
		}
	 
	}
