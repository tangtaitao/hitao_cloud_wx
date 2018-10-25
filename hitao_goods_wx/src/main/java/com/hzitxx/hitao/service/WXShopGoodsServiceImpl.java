package com.hzitxx.hitao.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.utils.ShopGoods;
import com.hzitxx.hitao.mapper.ShopFavoritesMapper;
import com.hzitxx.hitao.mapper.GoodsContentMapper;
import com.hzitxx.hitao.mapper.ShopGoodsMapper;
import com.hzitxx.hitao.utils.GoodsContent;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsDetailsUtils;

/**
 * 查询某个商品的详细信息实现层
 * @author wujun
 *
 */
@Service
public class WXShopGoodsServiceImpl implements WXShopGoodsService {

	@Autowired
	private ShopGoodsMapper shopGoodsMapper;
	@Autowired
	private GoodsContentMapper shopGoodsContentMapper;
	@Autowired
	private ShopFavoritesMapper shopFavoritesMapper;
	
	/**
	 * 条件查询某个商品的详细信息
	 * @param map
	 * @return
	 */
	public ServerResponse<ShopGoodsDetailsUtils> details(Map<String, Object> map) {
		//查询商品信息
		List<ShopGoods> shopGoods=shopGoodsMapper.selectShopGoods(map);
		ShopGoodsDetailsUtils shopGoodsDetailsUtils=new ShopGoodsDetailsUtils();
		shopGoodsDetailsUtils.setShopGoods(shopGoods.get(0));
		//查询商品内容
		List<GoodsContent> goodsContents=shopGoodsContentMapper.selectGoodsContent(map);
		shopGoodsDetailsUtils.setGoodsContent(goodsContents.get(0));
		//查询是否喜欢商品
		List<ShopFavorites> shopFavorites=shopFavoritesMapper.selectShopFavorites(map);
		if (shopFavorites!=null) {
			shopGoodsDetailsUtils.setIsFavorites(1);
		}
		return ServerResponse.createBySuccess(shopGoodsDetailsUtils);
	}
}
