package com.hzitxx.hitao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.mapper.ShopAddressMapper;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopAddressServiceImpl implements ShopAddressService {
	@Autowired
	private ShopAddressMapper mapper;
	@Override
	public ServerResponse<ShopAddress> findDefault(Integer memberId) {
		ShopAddress findDefault = mapper.findDefault(memberId);
		if(findDefault!=null) {
			return ServerResponse.createBySuccessMessage("查询成功");
		}else {
			return ServerResponse.createByErrorMessage("暂无默认地址");
		}
	}

}
