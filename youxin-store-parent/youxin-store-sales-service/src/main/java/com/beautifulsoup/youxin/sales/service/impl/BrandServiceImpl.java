package com.beautifulsoup.youxin.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.beautifulsoup.youxin.common.entity.PageResult;
import com.beautifulsoup.youxin.dataobject.TbBrand;
import com.beautifulsoup.youxin.dataobject.TbBrandExample;
import com.beautifulsoup.youxin.dataobject.TbBrandExample.Criteria;
import com.beautifulsoup.youxin.mapper.TbBrandMapper;
import com.beautifulsoup.youxin.sales.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAllBrands() {
		return brandMapper.selectByExample(null);
	}

	@Override
	public PageResult findBrandsByPage(int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		
		Page<TbBrand> result = (Page<TbBrand>) brandMapper.selectByExample(null);
		
		return new PageResult(result.getTotal(), result.getResult());
	}

	@Override
	public void addBrand(TbBrand brand) {
		brandMapper.insert(brand);
	}

	@Override
	public TbBrand findOne(Long id) {
		return brandMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateBrand(TbBrand brand) {
		brandMapper.updateByPrimaryKey(brand);
	}

	@Override
	public void deleteBrands(Long[] ids) {
		for(Long id:ids){
			brandMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findBrandsByPageConditional(TbBrand brand, int pageNum,
			int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBrandExample example=new TbBrandExample();
		Criteria criteria = example.createCriteria();
		
		if(null!=brand){
			if(!StringUtils.isEmpty(brand.getName())){
				criteria.andNameLike("%"+brand.getName()+"%");
			}
			if(!StringUtils.isEmpty(brand.getFirstChar())){
				criteria.andFirstCharLike("%"+brand.getFirstChar()+"%");
			}
		}
		
		
		
		Page<TbBrand> page=(Page<TbBrand>) brandMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}
