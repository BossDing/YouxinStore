package com.beautifulsoup.youxin.manager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beautifulsoup.youxin.dataobject.TbBrand;
import com.beautifulsoup.youxin.sales.service.BrandService;

@Controller
@RequestMapping("/brand")
public class BrandController {
	
	@Reference
	private BrandService brandService;

	@RequestMapping("/list")
	@ResponseBody
	public List<TbBrand> findAllBrands(){
		return brandService.findAllBrands();
	}
}
