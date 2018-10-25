package com.hzitxx.hitao.service;

import java.util.Map;

import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsDetailsUtils;

/**
 * 查询某个商品的详细信息接口层
 * @author wujun
 *
 */
public interface WXShopGoodsService {

	/**
	 * 条件查询某个商品的详细信息
	 * @param map
	 * @return
	 */
	ServerResponse<ShopGoodsDetailsUtils> details(Map<String, Object> map);

}
