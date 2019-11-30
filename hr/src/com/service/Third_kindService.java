package com.service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Config_file_third_kind;
import com.dao.Config_file_third_kindMapper;

@Service
//添加了@Transactional注解的类都会自动开启事务
@Transactional
public class Third_kindService {
	@Resource
	private Config_file_third_kindMapper config_file_third_kindMapper;
	
	//查询
	public List<Config_file_third_kind> selectAll(){
		return config_file_third_kindMapper.selectAll();
	}
	//根据Id查询
	public Config_file_third_kind selectById(BigDecimal ftkId) {
		return config_file_third_kindMapper.selectByPrimaryKey(ftkId);
	}
	//根据id进行修改
	public int updateById(Config_file_third_kind cftk) {
		return config_file_third_kindMapper.updateByThird(cftk);
	}
	//根据id进行删除
	public int deleteByThird(BigDecimal ftkId) {
		return config_file_third_kindMapper.deleteByThird(ftkId);
	}
	//添加
	public int insert(Config_file_third_kind cftk) {
		return config_file_third_kindMapper.insert(cftk);
	}
}
