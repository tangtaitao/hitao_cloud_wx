package com.hzitxx.hitao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.service.ShopFavoritesCollectionService;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 添加或取消收藏商品控制层
 * 
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopFavoritesCollection")
public class ShopFavoritesCollectionController {

	@Autowired
	private ShopFavoritesCollectionService service;

	/**
	 * 添加或取消收藏商品
	 * @param shopFavorites
	 * @param type
	 * @return
	 */
	@PostMapping("/addOrDelete")
	public ServerResponse<?> addOrDelete(@RequestBody ShopFavorites shopFavorites, Integer type) {
		return service.addOrDelete(shopFavorites, type);

	}
}
