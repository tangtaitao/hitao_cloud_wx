package com.hzitxx.hitao.mapper;

import com.hzitxx.hitao.entity.ShopAddress;

public interface ShopAddressMapper {
	/**
	 * 查询默认收货地址
	 * @param memberId
	 * @return
	 */
	public ShopAddress findDefault(Integer memberId);
}
