package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * <p>
 * 买家收藏表 前端控制器
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */
@RestController
@RequestMapping("/shopFavorites")
public class ShopFavoritesController {

	@Autowired
	private ShopFavoritesService service;

	/**
	 * 获取收藏商品数据
	 */
	@GetMapping("/list")
	public ServerResponse<?> list(Integer memberId) {
		Map<String, Object> map = new HashMap<>();
		map.put("memberId", memberId);
		return service.page(0, 10, map);
	}

	/**
	 * 删除收藏的商品
	 */
	@GetMapping("/deleteShopFavorites")
	public ServerResponse<?> deleteShopFavorites(Integer favId) {
		return service.deleteById(favId);
	}
}
