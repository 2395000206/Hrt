package com.controller;
/**
* @author 作者 XU:
* @version 创建时间：2019年11月27日 下午8:21:16 
* 类说明
* 1及构造设置
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Config_file_first_kind;
import com.bean.Users;
import com.service.Config_file_first_kindService;

@Controller
public class Config_file_first_kindControlles {
	//构造一查询数据
	@Resource
	private Config_file_first_kindService config_file_first_kindService;
	@RequestMapping(value = "hr/hr/page/client/first_kindctr",method = RequestMethod.POST,
			consumes = "application/json")
    public @ResponseBody Map<String,Object>test(){
 
		List<Config_file_first_kind> list =  config_file_first_kindService.selAll();
	 
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("rows", list);
    	return map;
    }
	//构造一添加数据
	@RequestMapping(value = "hr/hr/page/client/first_kind_registerctr",method = RequestMethod.POST )
    public String addt(@ModelAttribute("SpringWeb") Config_file_first_kind u){
 
	 
		Integer li =  config_file_first_kindService.addt(u);
		System.out.println(li);
	 if(li>0) {
	    	return "hr/hr/page/client/first_kind_register_success";
	 }else {
		 return null;
	 }

    }
	//查询单个的数据
	@RequestMapping(value = "hr/hr/page/client/first_kind_changectr")
	public String sele(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {

		 
		 Config_file_first_kind  list =  config_file_first_kindService.selD(k);
         if(list!=null) {
	 
				mm.addAttribute("kindid",list);
        }
         
				return "hr/hr/page/client/first_kind_change";
		 
			   
		}
	
	//修改
	@RequestMapping(value = "hr/hr/page/client/first_kind_change_successctr")
	public String update(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {
 
 
		Integer list =  config_file_first_kindService.update(k);
         if(list!=null) {
	 
				mm.addAttribute("kin",list);
        }
         
				return "hr/hr/page/client/first_kind_change_success";
		 
			   
		}
	
	//删除
	@RequestMapping(value = "hr/hr/page/client/second_delete_successctr")
	public String delet(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {
 
 
		Integer list =  config_file_first_kindService.delet(k);
         if(list!=null) {
	 
				mm.addAttribute("kin",list);
        }
         
				return "hr/hr/page/client/first_delete_success";
		 
			   
		}
	
}
