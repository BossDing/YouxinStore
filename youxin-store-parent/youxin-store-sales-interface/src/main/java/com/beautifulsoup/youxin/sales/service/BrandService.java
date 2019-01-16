package com.beautifulsoup.youxin.sales.service;

import java.util.List;

import com.beautifulsoup.youxin.common.entity.PageResult;
import com.beautifulsoup.youxin.dataobject.TbBrand;

/**
 * @Name: BrandService
 * @Description: 品牌接口
 * @Author: BeautifulSoup
 * @Date: 2019年1月15日 下午9:16:28
 */
public interface BrandService {
	/**
	 * findAllBrands
	 * @Description: 返回所有品牌记录
	 * @return: List<TbBrand>
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 上午11:55:19
	 */
	List<TbBrand> findAllBrands();
	
	
	/**
	 * findBrandsByPage pageNum:当前页码,pageSize:每一页的记录数
	 * @Description: 分页返回所有品牌记录
	 * @return: PageResult
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 上午11:55:33
	 */
	PageResult findBrandsByPage(int pageNum,int pageSize);
	
	
	/**
	 * addBrand
	 * @Description: 增加品牌
	 * @return: void
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 下午12:22:22
	 */
	void addBrand(TbBrand brand);
	
	/**
	 * findOne
	 * @Description: 根据id查询品牌信息
	 * @return: TbBrand
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 下午12:37:08
	 */
	TbBrand findOne(Long id);
	
	/**
	 * updateBrand
	 * @Description: 修改品牌信息
	 * @return: void
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 下午12:37:47
	 */
	void updateBrand(TbBrand brand);
	
	/**
	 * deleteBrands
	 * @Description: 批量删除品牌
	 * @return: void
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 下午12:45:42
	 */
	void deleteBrands(Long[] ids);
	
	
	
	/**
	 * findBrandsByPageConditional
	 * @Description: 分页条件查询
	 * @return: PageResult
	 * @Author: BeautifulSoup
	 * @Date: 2019年1月16日 下午12:50:25
	 */
	PageResult findBrandsByPageConditional(TbBrand brand,int pageNum,int pageSize);

}
