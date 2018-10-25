package com.hzitxx.hitao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopFrontCategoryService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopFrontCategoryServiceTest {

	@Autowired
	private ShopFrontCategoryService service;

	/**
	 * 测试查询三级类目数据
	 */
	@Test
	public void testFrontCate() {
		ServerResponse<?> serverResponse = service.frontCate();
		System.out.println(serverResponse.getMsg() + serverResponse.getStatus() + serverResponse.getData());
	}
	/**
	 * 测试商品总数
	 */
	@Test
	public void testGoodsCount() {
		ServerResponse<?> serverResponse = service.goodsCount();
		System.out.println(serverResponse.getMsg() + serverResponse.getStatus() + serverResponse.getData());
	}
	/**
	 * 测试根据一级id查询二三级类目数据
	 */
	@Test
	public void test() {
		ServerResponse<?> serverResponse = service.currentCate(3);
		System.out.println(serverResponse.getMsg() + serverResponse.getStatus() + serverResponse.getData());
	}
}
