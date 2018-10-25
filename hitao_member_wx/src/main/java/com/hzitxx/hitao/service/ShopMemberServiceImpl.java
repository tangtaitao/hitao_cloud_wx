package com.hzitxx.hitao.service;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.mapper.ShopAddressMapper;
import com.hzitxx.hitao.mapper.ShopMemberMapper;
import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopMemberServiceImpl implements ShopMemberService {
	@Autowired
	private ShopMemberMapper mapper;

	
	@Autowired
	private ShopAddressMapper mapper2;
	/**
	 * 注册并判断用户名是否存在
	 */
	@Override
	public ServerResponse<Integer> addMember(ShopMember shopMember) {
		int addMember = mapper.addMember(shopMember);
		String memberName = shopMember.getMemberName();
		int findmemberName = mapper.findmemberName(memberName);
		if(findmemberName>0) {
			return ServerResponse.createByErrorMessage("用户名已经存在！");
		}else {
			if(addMember==1) {
				return ServerResponse.createBySuccessMessage("注册成功");
			}else {
				return ServerResponse.createByErrorMessage("注册失败");
			}
		}
	}
	/**
	 * 登录
	 */
	@Override
	public ServerResponse<Map<String, Object>> login(ShopMember shopMember) {
		Map<String, Object> map=new HashMap<>();
		map.put("memberName", shopMember.getMemberName());
		map.put("memberPassword", shopMember.getMemberPassword());
		ShopMember login = mapper.login(map);
		Integer memberId = login.getMemberId();
		ShopAddress findDefault = mapper2.findDefault(memberId);
		if(login!=null) {
			Map<String,Object> map2=new HashMap<>();
			try {
				String token=JwtTokenUtil.createToken(login.getMemberName(), login.getMemberId().toString());
				map2.put("cartCount", 1);
				map2.put("shopMember", login);
				map2.put("token", token);
				map2.put("defaultAddress", findDefault);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ServerResponse.createBySuccess("登录成功", map2);
		}else {
			return ServerResponse.createByErrorMessage("登录失败，账号或密码错误！");
		}
		
	}

}
