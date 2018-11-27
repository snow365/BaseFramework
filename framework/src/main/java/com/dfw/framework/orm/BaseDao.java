package com.dfw.framework.orm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	//org.mybatis.spring.support.SqlSessionDaoSupport
	//org.mybatis.spring.mapper.
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public String test2()
	{
		SqlSession ss = sqlSessionFactory.openSession();
		
		//ss.selectOne("select 1123");
		//System.out.println(sqlSessionFactory);
		return null;
		
	}
}
