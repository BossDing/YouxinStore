package com.beautifulsoup.youxin.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.beautifulsoup.youxin.dataobject.TbBrand;
import com.beautifulsoup.youxin.mapper.TbBrandMapper;
import com.beautifulsoup.youxin.sales.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAllBrands() {
		return brandMapper.selectByExample(null);
	}

}
