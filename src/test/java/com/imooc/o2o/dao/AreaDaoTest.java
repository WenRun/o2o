package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

/**
 * AreaDao测试类
 * @author WenRun  2018年7月17日下午9:40:26
 */
public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;

	@Test
	public void testQueryArea(){
		List<Area> areaList = areaDao.queryArea();
		assertEquals(1,areaList.size());
	}

}
