package cn.dang.babasport.service.product;

import java.util.List;

import cn.dang.babasport.pojo.page.Pagination;
import cn.dang.babasport.pojo.product.Brand;

public interface BrandService {
	
	//条件查询品牌列表不分页
	public List<Brand> findBrandsNoPage(String name,Integer isDisplay);
	
	////条件查询品牌列表分页
	public Pagination findBrandHavePage(String name,Integer isDisplay,Integer pageNo);
	

}
