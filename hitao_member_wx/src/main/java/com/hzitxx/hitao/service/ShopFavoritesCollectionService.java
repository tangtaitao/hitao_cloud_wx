package com.hzitxx.hitao.service;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 添加或取消收藏商品接口层
 * @author wujun
 *
 */
public interface ShopFavoritesCollectionService {

	/**
	 * 添加或取消收藏商品
	 * @param shopFavorites
	 * @param type
	 * @return
	 */
	ServerResponse<?> addOrDelete(ShopFavorites shopFavorites,Integer type);
}
