package com.hzitxx.hitao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.service.WXShopCartService;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 小程序商品购物车控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/cart")
public class ShopCartController {
	@Autowired
	private WXShopCartService service;
	

	/**
	 * 检查库存
	 * @param goodsId
	 * @param number
	 * @return
	 */
	@GetMapping("/checkout")
	public ServerResponse<?> checkout(Integer goodsId,Integer number){
		return service.CheckOut(goodsId, number);
	}
}
