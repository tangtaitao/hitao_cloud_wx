package com.hzitxx.hitao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.mapper.FindGoodsMapper;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 查询商品实现层
 * @author wujun
 *
 */
@Service
public class WXSFindGoodsServiceImpl implements WXSFindGoodsService {

	@Autowired
	private FindGoodsMapper mapper;
	
	/**
	 * 查询goods
	 * 
	 * @return
	 */
	public ServerResponse<List<ShopGoods>>  findGoods() {
		List<ShopGoods> shopGoods = mapper.findGoods();
		return ServerResponse.createBySuccess(shopGoods);
	}
}
