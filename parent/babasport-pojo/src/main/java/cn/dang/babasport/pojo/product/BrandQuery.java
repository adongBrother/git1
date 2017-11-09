package cn.dang.babasport.pojo.product;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BrandQuery implements Serializable{
	
	
	//查询条件
	private String name; // 品牌名称
	private Integer isDisplay; // 是否可用 0 不可用 1 可用
	
	//分页属性
	private Integer startRow; 		//起始行
	private Integer pageNo;			//当前页码
	private Integer pageSize =4;	//每页显示条数

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.startRow=(pageNo-1)*pageSize;
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.startRow=(pageNo-1)*pageSize;
		this.pageSize = pageSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	

}
