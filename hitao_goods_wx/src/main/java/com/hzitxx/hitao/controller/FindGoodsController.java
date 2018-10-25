package com.hzitxx.hitao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.service.WXSFindGoodsService;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 查询商品控制层
 * @author wujun
 *
 */
@Controller
@RestController
public class FindGoodsController {

	@Autowired
	private WXSFindGoodsService service;
	
	
	@GetMapping("/findGoods")
	@ResponseBody
	public ServerResponse<List<ShopGoods>> findGoods(){
		return service.findGoods();
	}
}
