package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 
import com.bean.Users;
import com.dao.UsersMapper;

/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����3:53:10 
* ��˵��
*/
/* @Service("userService")ע���Ǹ���Spring����SpringҪ��
��UserServiceImpl�ĵ�ʵ��ʱ��bean�����ֱ������"userService"������
��Action��Ҫʹ��UserServiceImpl�ĵ�ʵ��ʱ,�Ϳ�����Spring�����õ�"userService"*/
@Service
//<bean id="pubService" class="com.jy.service.PubService"></bean>
//�����@Transactionalע����඼���Զ���������
@Transactional
public class UsersService {
	@Resource
    private UsersMapper usersMapper;
	public Users sele(Users lk){
		
	return usersMapper.selectAll(lk);
	 
	}
}
