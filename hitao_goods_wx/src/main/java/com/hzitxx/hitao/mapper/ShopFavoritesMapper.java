package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopFavorites;

/**
 * 查询会员喜欢物品信息
 * 
 * @author wujun
 *
 */
public interface ShopFavoritesMapper {

	/**
	 * 条件查询会员喜欢物品信息
	 * 
	 * @param map
	 * @return
	 */
	List<ShopFavorites> selectShopFavorites(Map<String, Object> map);
}
