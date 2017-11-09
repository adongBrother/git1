package cn.dang.babasport.service.impl.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dang.babasport.mapper.test.BbsTestMapper;
import cn.dang.babasport.pojo.test.BbsTest;
import cn.dang.babasport.service.test.BbsTestService;

@Service("bbsTestService")
public class BbsTestServiceImpl implements BbsTestService {

	@Resource
	private BbsTestMapper bbsTestMapper;
	
	@Transactional	//事务注解
	@Override
	public void insertBbsTest(BbsTest bbsTest) {
		bbsTestMapper.insertBbsTest(bbsTest);
		//System.out.println(7/0);
	}

	@Override
	public List<BbsTest> findBbsTestList() {
		return bbsTestMapper.findBbsTestList();
	}

}
