package com.hzitxx.hitao.mapper;

import static org.mockito.Matchers.longThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopFrontCategory;

/**
 * 测试ShopFrontCategoryMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopFrontCategoryMapperTest {

	@Autowired
	private ShopFrontCategoryMapper mapper;

	/**
	 * 测试查询数据
	 */
	@Test
	public void TestSearchShopFrontCategory() {
		Map<String, Object> map = new HashMap<>();
		map.put("parentId", 0);
		List<ShopFrontCategory> list = mapper.searchShopFrontCategory(map);
		System.out.println(list);
	}

}
