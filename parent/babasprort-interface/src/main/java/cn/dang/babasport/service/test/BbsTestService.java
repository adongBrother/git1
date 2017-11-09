package cn.dang.babasport.service.test;

import java.util.List;

import cn.dang.babasport.pojo.test.BbsTest;

public interface BbsTestService {
	
	public void insertBbsTest(BbsTest bbsTest);
	
	public List<BbsTest> findBbsTestList();

}
