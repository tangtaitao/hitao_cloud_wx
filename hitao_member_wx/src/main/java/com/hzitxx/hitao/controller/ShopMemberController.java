package com.hzitxx.hitao.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.service.ShopMemberService;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
public class ShopMemberController {
	@Autowired
	private ShopMemberService service;
	
	@PostMapping("/login")
	@ResponseBody
	public ServerResponse<Map<String,Object>> login(@RequestBody ShopMember shopMember){
		return service.login(shopMember);
	}
}
