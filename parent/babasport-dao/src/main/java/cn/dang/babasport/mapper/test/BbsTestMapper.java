package cn.dang.babasport.mapper.test;

import java.util.List;

import cn.dang.babasport.pojo.test.BbsTest;

public interface BbsTestMapper {
	
	public void insertBbsTest(BbsTest bbsTest);
	
	public List<BbsTest> findBbsTestList();

}
