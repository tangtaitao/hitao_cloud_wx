package com.hzitxx.hitao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.service.WXShopGoodsService;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsDetailsUtils;

/**
 * 小程序商品控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/goods")
public class ShopGoodsController {

	@Autowired
	private WXShopGoodsService service;
	/**
	 * 获取某个商品的详细信息
	 * @param goodsId
	 * @param memberId
	 * @return
	 */
	@GetMapping("/details")
	public ServerResponse<ShopGoodsDetailsUtils> details(Integer goodsId,Integer memberId){
		Map<String, Object> map=new HashMap<>();
		map.put("goodsId", goodsId);
		map.put("memberId", memberId);
		return service.details(map);
		
	}
}
