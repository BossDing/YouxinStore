package com.beautifulsoup.youxin.common.entity;

import java.util.List;

import com.beautifulsoup.youxin.dataobject.TbSpecification;
import com.beautifulsoup.youxin.dataobject.TbSpecificationOption;

/**
 * @Name: Specification
 * @Description: 规格组合实体类,包含规格本身和规格选项
 * @Author: BeautifulSoup
 * @Date: 2019年1月21日 下午8:53:36
 */
public class Specification {
	private TbSpecification specification;
	private List<TbSpecificationOption> specificationOptionList;
	public TbSpecification getSpecification() {
		return specification;
	}
	public void setSpecification(TbSpecification specification) {
		this.specification = specification;
	}
	public List<TbSpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
	}
	public void setSpecificationOptionList(
			List<TbSpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
	}
}
