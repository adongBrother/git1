package cn.dang.babasport.mapper.product;

import java.util.List;

import cn.dang.babasport.pojo.product.Brand;
import cn.dang.babasport.pojo.product.BrandQuery;

public interface BrandMapper {
	
	/**
	 * 查询品牌列表不分页
	 * @author Administrator
	 *
	 */
	public List<Brand> findBrandsNoPage(BrandQuery brandQuery);
	
	
	/**
	 * 查询品牌列表分页
	 * 
	 * 结果集
	 * @author Administrator
	 *
	 */
	public List<Brand> findBrandsHavePage(BrandQuery brandQuery);
	
	
	/**
	 * 总条数
	 */
	public int findCountBrand(BrandQuery brandQuery);

}
