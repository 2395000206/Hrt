package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.Users;

/**
* @author ���� XU:
* @version ����ʱ�䣺2019��11��27�� ����3:51:02 
* ��˵��
*/
//���ע���ʾ����springmvc�����ļ��д�����һ��idΪ"UseraMapper"��bean
//<bean id="UseraMapper" class="com.jy.dao.UseraMapper">
@Repository
public interface UsersMapper {
  Users selectAll(Users l);
}
