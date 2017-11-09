package cn.dang.babasport.controller.brand;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.dang.babasport.pojo.page.Pagination;
import cn.dang.babasport.pojo.product.Brand;
import cn.dang.babasport.service.product.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandController {
	
	@Resource
	private BrandService brandService;
	
	@RequestMapping(value="/list.do")
	public String list(String name,@RequestParam(defaultValue="1") Integer isDisplay,Integer pageNo,Model model){
/*		if(isDisplay == null){	//默认查询可用品牌
			isDisplay=1;
		}*/
		//List<Brand> brands = brandService.findBrandsNoPage(name, isDisplay);
		Pagination pagination = brandService.findBrandHavePage(name, isDisplay, pageNo);
		model.addAttribute("pagination", pagination);
		
		model.addAttribute("name", name);
		model.addAttribute("isDisplay", isDisplay);
		return "brand/list";
	}
}
