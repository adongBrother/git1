package cn.dang.babasport.controller.frame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台系统top页之间的切换
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/frame")
public class FrameController {
	
	/**
	 * 后台系统商品的页面
	 * @return
	 */
	@RequestMapping(value="/product_main.do")
	public String product_main(){
		return "frame/product_main";
	}
	
	/**
	 * 后台系统商品的product_left
	 * @return
	 */
	@RequestMapping(value="/product_left.do")
	public String product_left(){
		return "frame/product_left";
	}
	
	

}
