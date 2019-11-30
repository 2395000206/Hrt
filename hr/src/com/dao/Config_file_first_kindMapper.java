package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Config_file_first_kind;

/**
* @author 作者 XU:
* @version 创建时间：2019年11月27日 下午8:32:34 
* 类说明
*/
@Repository
public interface Config_file_first_kindMapper {
	List<Config_file_first_kind> selectAll();
	//一级添加
	Integer addt(Config_file_first_kind s);
	//一级查询单个
	Config_file_first_kind selectDll(Config_file_first_kind s);
	//修改
	Integer updat(Config_file_first_kind sa);
	//删除
	Integer delet(Config_file_first_kind sa);
	
}
