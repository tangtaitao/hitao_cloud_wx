package com.hzitxx.hitao.mapper;

import java.util.List;

import com.hzitxx.hitao.entity.ShopGoods;

/**
 * 查询商品dao层
 * @author wujun
 *
 */
public interface FindGoodsMapper {

	/**
	 * 查询goods
	 * 
	 * @return
	 */
	public List<ShopGoods> findGoods();
}
