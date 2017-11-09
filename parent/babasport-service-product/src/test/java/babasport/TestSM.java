package babasport;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.dang.babasport.mapper.test.BbsTestMapper;
import cn.dang.babasport.pojo.test.BbsTest;
import cn.dang.babasport.service.test.BbsTestService;
/**
 * 使用单元测试SM整合
 * @author Administrator
 *
 */

@ContextConfiguration(locations={"classpath:spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSM {
	
	@Resource
	private BbsTestMapper bbsTestMapper;
	
	@Resource
	private BbsTestService bbsTestService;

	@Test
	public void testMybatis(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("lili");
		bbsTest.setBirthday(new Date());
		bbsTestMapper.insertBbsTest(bbsTest);
	}
	
	@Test
	public void testSpring(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("haha2");
		bbsTest.setBirthday(new Date());
		bbsTestService.insertBbsTest(bbsTest);
	}
}
