package com.hzitxx.hitao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.service.ShopFrontCategoryService;
import com.hzitxx.hitao.utils.ServerResponse;
import com.netflix.discovery.converters.Auto;

/**
 * 类目controller层
 * 
 * @author Administrator
 *
 */
@RestController
public class ShopFrontCategoryController {
	// 自动注入service对象
	@Autowired
	private ShopFrontCategoryService service;

	/**
	 * 获取三级类目数据
	 */
	@GetMapping("/frontCate")
	public ServerResponse<?> frontCate() {
		return service.frontCate();
	}

	/**
	 * 获取商品总数
	 */
	@GetMapping("/goodsCount")
	public ServerResponse<?> goodsCount() {
		return service.goodsCount();
	}

	/**
	 * 根据传来的一级类目id获取二三级类目
	 */
	@GetMapping("/currentCate")
	public ServerResponse<?> currentCate(Integer frontCatId) {
		return service.currentCate(frontCatId);
	}
}
