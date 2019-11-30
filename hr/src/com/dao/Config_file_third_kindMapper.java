package com.dao;


import com.bean.Config_file_third_kind;
import java.math.BigDecimal;
import java.util.List;

public interface Config_file_third_kindMapper {
	//²éÑ¯ËùÓÐ
	List<Config_file_third_kind> selectAll();
    int deleteByThird(BigDecimal ftkId);

    int insert(Config_file_third_kind record);

   

    Config_file_third_kind selectByPrimaryKey(BigDecimal ftkId);

    //int updateByPrimaryKeySelective(Config_file_third_kind record);

    int updateByThird(Config_file_third_kind record);
}