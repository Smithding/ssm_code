package com.itheima.ssm.service;
import com.itheima.ssm.entity.SCust;
import com.itheima.ssm.entity.SUser;

import java.util.List;

public interface SUserService{

	/**
	 * 获得一个SUser对象,以参数SUser对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SUser selectSUserByObj(SUser obj);

	List<SCust> getCustList();

	void delectCust(String id);
}