package com.dfw.framework.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.dfw.framework.orm.BaseDao;

@Service
public class IndexServiceImpl implements IndexService{

	@Autowired
	BaseDao baseDao;
	public String test2() {
		if(!TransactionSynchronizationManager.isSynchronizationActive())
		{
			System.err.println("事务未开启。");
			/***
			 * 使用SpringBeanUtil获取service或dao bean在执行更新操作时没有事务。而直接注入的有事务。
			 */
		}
		baseDao.test2();
		return null;
	}

}
