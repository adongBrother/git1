package cn.dang.babasport.controller.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.dang.babasport.pojo.test.BbsTest;
import cn.dang.babasport.service.test.BbsTestService;

@Controller
public class BbsTestController {
	
	@Resource
	private BbsTestService bbsTestService;
	
	@RequestMapping(value="/test.do")
	public String test(){
		List<BbsTest> bbsTestList = bbsTestService.findBbsTestList();
		System.out.println("bbsTestList size:"+bbsTestList.size());
		return "test";
	}
	
	

}
