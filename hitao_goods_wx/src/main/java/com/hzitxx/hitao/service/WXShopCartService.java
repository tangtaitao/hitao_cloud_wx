package com.hzitxx.hitao.service;

import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 小程序商品购物车接口层
 * @author wujun
 *
 */
public interface WXShopCartService {

	/**
	 * 检查库存是否充足
	 * @param map
	 * @return
	 */
	ServerResponse<?> CheckOut(Integer goodsId,Integer number);
}
