package com.beautifulsoup.youxin.sales.service;

import java.util.List;

import com.beautifulsoup.youxin.dataobject.TbBrand;

/**
 * @Name: BrandService
 * @Description: 品牌接口
 * @Author: BeautifulSoup
 * @Date: 2019年1月15日 下午9:16:28
 */
public interface BrandService {
	List<TbBrand> findAllBrands();
}
