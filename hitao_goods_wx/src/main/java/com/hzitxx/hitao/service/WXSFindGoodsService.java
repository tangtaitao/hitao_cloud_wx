package com.hzitxx.hitao.service;

import java.util.List;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 查询商品接口层
 * @author wujun
 *
 */
public interface WXSFindGoodsService {
	/**
	 * 查询goods
	 * 
	 * @return
	 */
	ServerResponse<List<ShopGoods>>  findGoods();
}
