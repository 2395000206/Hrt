package com.controller;
/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����8:21:16 
* ��˵��
* 1����������
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
	//����һ��ѯ����
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
	//����һ�������
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
	//��ѯ����������
	@RequestMapping(value = "hr/hr/page/client/first_kind_changectr")
	public String sele(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {

		 
		 Config_file_first_kind  list =  config_file_first_kindService.selD(k);
         if(list!=null) {
	 
				mm.addAttribute("kindid",list);
        }
         
				return "hr/hr/page/client/first_kind_change";
		 
			   
		}
	
	//�޸�
	@RequestMapping(value = "hr/hr/page/client/first_kind_change_successctr")
	public String update(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {
 
 
		Integer list =  config_file_first_kindService.update(k);
         if(list!=null) {
	 
				mm.addAttribute("kin",list);
        }
         
				return "hr/hr/page/client/first_kind_change_success";
		 
			   
		}
	
	//ɾ��
	@RequestMapping(value = "hr/hr/page/client/second_delete_successctr")
	public String delet(@ModelAttribute("springWeb") Config_file_first_kind k,ModelMap mm ) {
 
 
		Integer list =  config_file_first_kindService.delet(k);
         if(list!=null) {
	 
				mm.addAttribute("kin",list);
        }
         
				return "hr/hr/page/client/first_delete_success";
		 
			   
		}
	
}
