package com.hzitxx.hitao.service;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopMemberService {
	/**
	 * 登录
	 * @param map
	 * @return
	 */
	public ServerResponse<Map<String, Object>> login(ShopMember shopMember);
	/**
	 * 注册
	 * @param shopMember
	 * @return
	 */
	public ServerResponse<Integer> addMember(ShopMember shopMember);

}
