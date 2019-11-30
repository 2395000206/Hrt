package com.controller;

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
import com.bean.Config_file_second_kind;
import com.dao.Config_file_second_kindMapper;
import com.service.Config_file_first_kindService;
import com.service.Config_file_second_kindService;

/**
* @author 作者 XU:
* @version 创建时间：2019年11月29日 下午11:33:54 
* 类说明
* 2及机构
*/
@Controller
public class Config_file_second_kindControlles {
	@Resource
	private Config_file_second_kindService  config_file_second_kindService;
	@Resource
	private Config_file_first_kindService config_file_first_kindService;
	@RequestMapping(value = "hr/hr/page/client/second_kindstr",method = RequestMethod.POST,
			consumes = "application/json")
    public @ResponseBody Map<String,Object>test(){
 
		List<Config_file_second_kind> list =  config_file_second_kindService.selAll();
 
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("rows", list);
    	return map;
    }
	//查询单个的数据
	@RequestMapping(value = "hr/hr/page/client/second_kind_changectr")
	public String sele(@ModelAttribute("springWeb") Config_file_second_kind k,ModelMap mm ) {
 
		Config_file_second_kind  list =  config_file_second_kindService.selD(k);
         if(list!=null) {
	 
				mm.addAttribute("kindid",list);
        }
         
				return "hr/hr/page/client/second_kind_change";
		 
			   
		}
	//修改
		@RequestMapping(value = "hr/hr/page/client/second_kind_change_successctr")
		public String update(@ModelAttribute("springWeb") Config_file_second_kind k,ModelMap mm ) {
 
	 
			Integer list =  config_file_second_kindService.update(k);
	         if(list!=null) {
		 
					mm.addAttribute("kin",list);
	        }
	         
					return "hr/hr/page/client/second_kind_change_success";
			 
				   
			}

		//删除
		@RequestMapping(value = "hr/hr/page/client/second_delete_successctr2")
		public String delet(@ModelAttribute("springWeb") Config_file_second_kind k,ModelMap mm ) {
	 
	 
			Integer list =  config_file_second_kindService.delet(k);
	         if(list!=null) {
		 
					mm.addAttribute("kin",list);
	        }
	         
					return "hr/hr/page/client/second_delete_success";
			 
				   
			}
		//构造二添加数据
		@RequestMapping(value = "hr/hr/page/client/second_kind_register_successctr",method = RequestMethod.POST )
	    public String addt(@ModelAttribute("SpringWeb") Config_file_second_kind u){
	        String ffk_id=u.getFirst_kind_id();
	        Config_file_first_kind cok1=new Config_file_first_kind();
	        cok1.setFfk_id(Integer.parseInt(ffk_id));
	       Config_file_first_kind cok= config_file_first_kindService.selD(cok1);
	       
	       u.setFirst_kind_id(cok.getFirst_kind_id());
	       u.setFirst_kind_name(cok.getFirst_kind_name());
			Integer li =  config_file_second_kindService.addt(u);
		 
		 if(li>0) {
		    	return "hr/hr/page/client/second_kind_register_success";
		 }else {
			 return null;
		 }

	    }
 
}
