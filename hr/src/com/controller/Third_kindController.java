package com.controller;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bean.Config_file_first_kind;
import com.bean.Config_file_second_kind;
import com.bean.Config_file_third_kind;
import com.service.Config_file_first_kindService;
import com.service.Config_file_second_kindService;
import com.service.Third_kindService;

@Controller
@SessionAttributes(value="third")
public class Third_kindController {
	@Resource
	private Third_kindService third_kindService;
	@Resource
	private Config_file_second_kindService  config_file_second_kindService;
	@Resource
	private Config_file_first_kindService config_file_first_kindService;
	@RequestMapping(value="select",method=RequestMethod.POST)
	public @ResponseBody List<Config_file_third_kind> selectAll(){
		List<Config_file_third_kind> list = third_kindService.selectAll();
		return list;
	}
	//根据ID查询
	@RequestMapping(value="third_kind_change")
	public String selectById(Map<String,Object> map,@RequestParam BigDecimal ftkId){
		//System.out.println("这是更改:"+ftkId);
		Config_file_third_kind third = third_kindService.selectById(ftkId);
		map.put("third", third);
		return "hr/hr/page/client/third_kind_change";
	}
	//根据id修改
	@RequestMapping(value="third_kind_update")
	public String updateByThird(@ModelAttribute Config_file_third_kind cftk) {
		third_kindService.updateById(cftk);
		return "hr/hr/page/client/third_kind_change_success";
	}
	//根据id进行删除
	@RequestMapping(value="third_kind_delete")
	public String deleteByThird(@RequestParam BigDecimal ftkId) {
		third_kindService.deleteByThird(ftkId);
		return "hr/hr/page/client/third_delete_success";
	}
	//构造三的添加
	@RequestMapping(value = "hr/hr/page/client/third_kind_register_successctr",method = RequestMethod.POST )
    public String addt(@ModelAttribute("SpringWeb") Config_file_third_kind u){
		//拿到一构造设置
        String ffk_id1=u.getFirstKindId();
        Config_file_first_kind cok1=new Config_file_first_kind();
        cok1.setFfk_id(Integer.parseInt(ffk_id1));
        Config_file_first_kind cok= config_file_first_kindService.selD(cok1);
        u.setFirstKindId(cok.getFirst_kind_id());
        u.setFirstKindName(cok.getFirst_kind_name());
		//拿到二构造设置
        String ffk_id2=u.getSecondKindId();
        Config_file_second_kind cok2=new Config_file_second_kind();
        cok2.setFsk_id(Integer.parseInt(ffk_id2));
        Config_file_second_kind cok22= config_file_second_kindService.selD(cok2);
        u.setSecondKindId(cok22.getSecond_kind_id());
        u.setSecondKindName(cok22.getSecond_kind_name());
		 Integer li =  third_kindService.insert(u);
	 
	 if(li>0) {
	    	return "hr/hr/page/client/third_kind_register_success";
	 }else {
		 return null;
	 }

    }
}
