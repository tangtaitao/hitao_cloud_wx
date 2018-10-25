package com.hzitxx.hitao.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.mapper.ShopFavoritesCollectionMapper;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 添加或取消收藏商品实现层
 * 
 * @author wujun
 *
 */
@Service
public class ShopFavoritesCollectionServiceImpl implements ShopFavoritesCollectionService {

	@Autowired
	private ShopFavoritesCollectionMapper mapper;

	/**
	 * 添加或取消收藏商品
	 * 
	 * @param shopFavorites
	 * @param type
	 * @return
	 */
	public ServerResponse<?> addOrDelete(ShopFavorites shopFavorites, Integer type) {
		if (type == 0) {
			ShopGoods shopGoods = mapper.selectShopGoods(shopFavorites);
			shopFavorites.setGoodsJingle(shopGoods.getGoodsJingle());
			shopFavorites.setGoodsName(shopGoods.getGoodsName());
			shopFavorites.setMainImage(shopGoods.getMainImage());
			shopFavorites.setFavTime(new Date());
			int result = mapper.addShopFavorites(shopFavorites);
			if (result != 0) {
				return ServerResponse.createBySuccess("添加成功!", "add");
			}
			return ServerResponse.createBySuccess("添加失败!");
		} else {
			int result = mapper.deleteById(shopFavorites);
			if (result != 0) {
				return ServerResponse.createBySuccess("取消收藏成功!", "cancel");
			}
			return ServerResponse.createBySuccess("取消收藏成功!");
		}
	}
}
