package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.utils.ShopGoods;
/**
 * 商品信息接口
 * 
 * @author wujun
 *
 */
public interface ShopGoodsMapper {
	/**
	 * 查询goods
	 * 
	 * @param map
	 * @return
	 */
	public List<ShopGoods> selectShopGoods(Map<String, Object> map);

	/**
	 * 检查库存
	 * @param goodsId
	 * @return
	 */
	int CheckOut(Integer goodsId);
}
