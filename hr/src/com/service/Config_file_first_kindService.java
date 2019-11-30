package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Config_file_first_kind;
import com.dao.Config_file_first_kindMapper;

/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����8:53:35 
* ��˵��
*/
@Service
//<bean id="pubService" class="com.jy.service.PubService"></bean>
//�����@Transactionalע����඼���Զ���������
@Transactional
public class Config_file_first_kindService {
	@Resource
    private Config_file_first_kindMapper config_file_first_kindMapper;
	public List<Config_file_first_kind> selAll(){
		return config_file_first_kindMapper.selectAll();
	}
	public Integer addt(Config_file_first_kind sa) {
		return config_file_first_kindMapper.addt(sa);
	}
	
	public  Config_file_first_kind selD(Config_file_first_kind sa) {
		return config_file_first_kindMapper.selectDll(sa);
	}
	public  Integer update(Config_file_first_kind sa) {
		return config_file_first_kindMapper.updat(sa);
	}
	public  Integer delet(Config_file_first_kind sa) {
		return config_file_first_kindMapper.delet(sa);
	}
}
