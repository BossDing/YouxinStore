package com.beautifulsoup.youxin.manager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beautifulsoup.youxin.common.entity.PageResult;
import com.beautifulsoup.youxin.common.entity.ResponseResult;
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
	
	@RequestMapping("/list/page")
	@ResponseBody
	public PageResult findAllBrandsByPage(@RequestParam(value="num")Integer pageNum,@RequestParam(value="size")Integer pageSize){
		return brandService.findBrandsByPage(pageNum, pageSize);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult addBrand(@RequestBody TbBrand brand){
		try {
			brandService.addBrand(brand);
			return new ResponseResult(true,"新增成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseResult(false,"新增失败");
		}
	}
	
	@RequestMapping("/findone")
	@ResponseBody
	public TbBrand findOne(Long id){
		return brandService.findOne(id);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResponseResult updateBrand(@RequestBody TbBrand brand){
		try {
			brandService.updateBrand(brand);
			return new ResponseResult(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseResult(false, "更新失败");
		}
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseResult deleteBrands(Long[] ids){
		try {
			brandService.deleteBrands(ids);
			return new ResponseResult(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseResult(false, "删除失败");
		}
	}
	
	@RequestMapping("/list/page/conditional")
	@ResponseBody
	public PageResult findAllBrandsByPageConditional(@RequestBody TbBrand brand,
			@RequestParam(value="num")Integer pageNum,@RequestParam(value="size")Integer pageSize){
		return brandService.findBrandsByPageConditional(brand, pageNum, pageSize);
	}
}
