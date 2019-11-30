package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 
import com.bean.Users;
import com.dao.UsersMapper;

/**
* @author 作者 XU:
* @version 创建时间：2019年11月27日 下午3:53:10 
* 类说明
*/
/* @Service("userService")注解是告诉Spring，当Spring要创
建UserServiceImpl的的实例时，bean的名字必须叫做"userService"，这样
当Action需要使用UserServiceImpl的的实例时,就可以由Spring创建好的"userService"*/
@Service
//<bean id="pubService" class="com.jy.service.PubService"></bean>
//添加了@Transactional注解的类都会自动开启事务
@Transactional
public class UsersService {
	@Resource
    private UsersMapper usersMapper;
	public Users sele(Users lk){
		
	return usersMapper.selectAll(lk);
	 
	}
}
