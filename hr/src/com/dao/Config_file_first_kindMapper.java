package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Config_file_first_kind;

/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����8:32:34 
* ��˵��
*/
@Repository
public interface Config_file_first_kindMapper {
	List<Config_file_first_kind> selectAll();
	//һ�����
	Integer addt(Config_file_first_kind s);
	//һ����ѯ����
	Config_file_first_kind selectDll(Config_file_first_kind s);
	//�޸�
	Integer updat(Config_file_first_kind sa);
	//ɾ��
	Integer delet(Config_file_first_kind sa);
	
}
