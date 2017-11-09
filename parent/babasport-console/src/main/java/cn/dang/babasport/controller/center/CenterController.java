package cn.dang.babasport.controller.center;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台系统控制中心
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/center")
public class CenterController {

	
	/**
	 * 后台系统主页
	 * @return
	 */
	@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}
	
	/**
	 * 跳转到top页面
	 * @return
	 */
	@RequestMapping(value="/top.do")
	public String top(){
		return "top";
	}
	
	/**
	 * 跳转到main页面
	 * @return
	 */
	@RequestMapping(value="/main.do")
	public String main(){
		return "main";
	}
	
	/**
	 * 跳转到left页面
	 * @return
	 */
	@RequestMapping(value="/left.do")
	public String left(){
		return "left";
	}
	
	/**
	 * 跳转到right页面
	 * @return
	 */
	@RequestMapping(value="/right.do")
	public String right(){
		return "right";
	}

}
