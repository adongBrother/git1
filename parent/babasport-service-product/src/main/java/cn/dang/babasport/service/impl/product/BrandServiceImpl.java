package cn.dang.babasport.service.impl.product;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dang.babasport.mapper.product.BrandMapper;
import cn.dang.babasport.pojo.page.Pagination;
import cn.dang.babasport.pojo.product.Brand;
import cn.dang.babasport.pojo.product.BrandQuery;
import cn.dang.babasport.service.product.BrandService;

@Service("brandService")
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandMapper brandMapper;
	
	@Override
	public List<Brand> findBrandsNoPage(String name, Integer isDisplay) {
		BrandQuery brandQuery = new BrandQuery();
		if(name !=null && !"".equals(name)){
			brandQuery.setName(name);
		}
		if(isDisplay !=null){
			brandQuery.setIsDisplay(isDisplay);
		}
		List<Brand> brands = brandMapper.findBrandsNoPage(brandQuery);
		return brands;
	}

	@Override
	public Pagination findBrandHavePage(String name, Integer isDisplay, Integer pageNo) {
		//1.创建BrandQuery对象并且封装查询条件
		BrandQuery brandQuery = new BrandQuery();
		StringBuilder params = new StringBuilder();
		if(name !=null && !"".equals(name)){
			brandQuery.setName(name);
			params.append("name=").append(name);	//url?name=tom&isDi
		}
		if(isDisplay !=null){
			brandQuery.setIsDisplay(isDisplay);
			params.append("&isDisplay=").append(isDisplay);	//url?&isDisplay=1 没有问题
		}
		brandQuery.setPageNo(Pagination.cpn(pageNo));	//调用对象方法判断第几页
		//brandQuery.setPageSize(5);	还可以设置当前页几条数据
		//2.根据条件查询
		List<Brand> brands = brandMapper.findBrandsHavePage(brandQuery);
		int count = brandMapper.findCountBrand(brandQuery);
		//3.创建Pagination分页对象并且将数据填充到分页对象中
		Pagination pagination = new Pagination(brandQuery.getPageNo(), brandQuery.getPageSize(), count, brands);
		//4.构建分页工具栏
		String url="/brand/list.do";
		pagination.pageView(url, params.toString());
		return pagination;
	}


}
