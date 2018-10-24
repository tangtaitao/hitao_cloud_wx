package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * <p>
 * 买家收藏表 服务类
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */

public interface ShopFavoritesService {
	ServerResponse addShopFavorites(ShopFavorites shopFavorites);

	ServerResponse addShopFavoritesSelective(ShopFavorites obj);

	ServerResponse deleteById(int favId);

	ServerResponse deleteByIds(String[] ids);

	ServerResponse updateById(ShopFavorites shopFavorites);

	ServerResponse updateSelectiveById(ShopFavorites shopFavorites);

	ServerResponse<List<ShopFavorites>> searchShopFavorites(Map<String, Object> map);

	/**
	 * 数据查询分页
	 * 
	 * @param page
	 * @param limit
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopFavorites>> page(int page, int limit, Map<String, Object> map);

	/**
	 * 根据编号查询数据
	 *
	 */
	ServerResponse<ShopFavorites> findOne(Integer favId);

}
