package com.dao;
/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��29�� ����11:29:35 
* ��˵��
*/

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Config_file_first_kind;
import com.bean.Config_file_second_kind;
@Repository
public interface Config_file_second_kindMapper {
     List<Config_file_second_kind>selectAll();
   //��ѯ����
     Config_file_second_kind selectDll(Config_file_second_kind s);
   //�޸�
 	Integer updat(Config_file_second_kind sa);
	//ɾ��
	Integer delet(Config_file_second_kind sa);
	//���
	Integer addt(Config_file_second_kind s);
}
