package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 配置spring和Junit整合，Junit启动时加载springIOC容器
 * @author WenRun  2018年7月17日下午9:39:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉Junit spring配置文件的位置
@ContextConfiguration({ "classpath:spring/spring-dao.xml" ,"classpath:spring/spring-service.xml"})
public class BaseTest {

}
