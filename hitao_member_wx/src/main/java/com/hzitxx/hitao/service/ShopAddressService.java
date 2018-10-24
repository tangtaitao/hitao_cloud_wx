package com.hzitxx.hitao.service;

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAddressService {
	/**
	 * 查询默认收货地址
	 * @param memberId
	 * @return
	 */
	public ServerResponse<ShopAddress> findDefault(Integer memberId);
}
