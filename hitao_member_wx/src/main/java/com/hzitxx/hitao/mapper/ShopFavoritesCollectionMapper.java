package com.hzitxx.hitao.mapper;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.entity.ShopGoods;

/**
 * 添加或取消收藏商品dao层
 * @author wujun
 *
 */
public interface ShopFavoritesCollectionMapper {
	/**
	 * 增加收藏商品
	 * @return
	 */
	int addShopFavorites(ShopFavorites shopFavorites);
	
	/**
	 * 取消收藏商品
	 * @return
	 */
	int deleteById(ShopFavorites shopFavorites);
	
	/**
	 * 查询商品部分信息
	 * @param shopFavorites
	 * @return
	 */
	ShopGoods selectShopGoods(ShopFavorites shopFavorites);
}
