package com.service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Config_file_third_kind;
import com.dao.Config_file_third_kindMapper;

@Service
//�����@Transactionalע����඼���Զ���������
@Transactional
public class Third_kindService {
	@Resource
	private Config_file_third_kindMapper config_file_third_kindMapper;
	
	//��ѯ
	public List<Config_file_third_kind> selectAll(){
		return config_file_third_kindMapper.selectAll();
	}
	//����Id��ѯ
	public Config_file_third_kind selectById(BigDecimal ftkId) {
		return config_file_third_kindMapper.selectByPrimaryKey(ftkId);
	}
	//����id�����޸�
	public int updateById(Config_file_third_kind cftk) {
		return config_file_third_kindMapper.updateByThird(cftk);
	}
	//����id����ɾ��
	public int deleteByThird(BigDecimal ftkId) {
		return config_file_third_kindMapper.deleteByThird(ftkId);
	}
	//���
	public int insert(Config_file_third_kind cftk) {
		return config_file_third_kindMapper.insert(cftk);
	}
}
