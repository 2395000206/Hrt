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
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����3:39:43 
* ��˵��
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
				mm.addAttribute("kk","û�и���a��");
		 
				return "/hr/hr/login";
			}
			   
		}
	 
	}
