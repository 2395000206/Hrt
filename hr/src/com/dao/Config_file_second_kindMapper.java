package com.dao;
/**
* @author 作者 XU:
* @version 创建时间：2019年11月29日 下午11:29:35 
* 类说明
*/

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Config_file_first_kind;
import com.bean.Config_file_second_kind;
@Repository
public interface Config_file_second_kindMapper {
     List<Config_file_second_kind>selectAll();
   //查询单个
     Config_file_second_kind selectDll(Config_file_second_kind s);
   //修改
 	Integer updat(Config_file_second_kind sa);
	//删除
	Integer delet(Config_file_second_kind sa);
	//添加
	Integer addt(Config_file_second_kind s);
}
