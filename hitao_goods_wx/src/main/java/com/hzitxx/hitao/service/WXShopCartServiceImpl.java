package com.hzitxx.hitao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.mapper.ShopGoodsMapper;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 小程序商品购物车实现层
 * @author wujun
 *
 */
@Service
public class WXShopCartServiceImpl implements WXShopCartService {

	@Autowired
	private ShopGoodsMapper shopGoodsMapper;
	
	/**
	 * 检查库存是否充足
	 * @param map
	 * @return
	 */
	public ServerResponse<?> CheckOut(Integer goodsId,Integer number) {
		int goodsStorage=shopGoodsMapper.CheckOut(goodsId);
		if (goodsStorage-number>0) {
			return ServerResponse.createBySuccessMessage("库存充足！");
		} else {
			return ServerResponse.createBySuccessMessage("库存不足！");
		}
	}
}
