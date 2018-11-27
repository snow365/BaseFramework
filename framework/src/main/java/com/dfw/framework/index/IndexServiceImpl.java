package com.dfw.framework.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfw.framework.orm.BaseDao;

@Service
public class IndexServiceImpl implements IndexService{

	@Autowired
	BaseDao baseDao;
	public String test2() {
		baseDao.test2();
		return null;
	}

}
