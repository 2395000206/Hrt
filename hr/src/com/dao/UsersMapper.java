package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.Users;

/**
* @author 作者 XU:
* @version 创建时间：2019年11月27日 下午3:51:02 
* 类说明
*/
//这个注解表示你在springmvc配置文件中创建了一个id为"UseraMapper"的bean
//<bean id="UseraMapper" class="com.jy.dao.UseraMapper">
@Repository
public interface UsersMapper {
  Users selectAll(Users l);
}
