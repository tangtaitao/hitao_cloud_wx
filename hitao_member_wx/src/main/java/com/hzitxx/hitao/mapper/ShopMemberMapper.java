package com.hzitxx.hitao.mapper;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;

public interface ShopMemberMapper {
	/**
	 * 登录
	 * @param map
	 * @return
	 */
	public ShopMember login(Map<String, Object> map);
	/**
	 * 注册
	 * @param shopMember
	 * @return
	 */
	public int addMember(ShopMember shopMember);
	/**
	 * 注册时判断用户名是否存在
	 * @param memberName
	 * @return
	 */
	public int findmemberName(String memberName);
}
