package com.dfw.framework.orm;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.dfw.framework.index.UserModel;

@Repository
public class BaseDao {
	//org.mybatis.spring.support.SqlSessionDaoSupport
	//org.mybatis.spring.mapper.
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public String test2()
	{
		SqlSession ss = sqlSessionFactory.openSession();
		
		List<UserModel> list = ss.selectList("getUsers");
		System.out.println(JSON.toJSONString(list));
		//System.out.println(sqlSessionFactory);
		return null;
		
	}
}
