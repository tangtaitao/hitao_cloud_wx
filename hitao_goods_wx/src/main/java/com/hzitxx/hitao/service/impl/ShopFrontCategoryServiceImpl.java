package com.hzitxx.hitao.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.CategoryContent;
import com.hzitxx.hitao.entity.FrontCate;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.mapper.ShopFrontCategoryMapper;
import com.hzitxx.hitao.service.ShopFrontCategoryService;
import com.hzitxx.hitao.utils.ServerResponse;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */
@Service
public class ShopFrontCategoryServiceImpl implements ShopFrontCategoryService {

	@Autowired
	private ShopFrontCategoryMapper mapper;

	/**
	 * 查询三级类目
	 */
	@Override
	public ServerResponse<?> frontCate() {
		// 创建一个存储一级类目的对象
		FrontCate frontCate = new FrontCate();
		// 查询所有的一级类目
		Map<String, Object> map = new HashMap<>();
		map.put("parentId", 0);
		List<ShopFrontCategory> list1 = mapper.searchShopFrontCategory(map);
		// 吧所有的一级类目存储到一级类目对象中
		frontCate.setCategory(list1);
		// 吧二级类目存到对象中
		frontCate.setCategoryContent(getData(list1.get(0).getFrontCatId()));
		return ServerResponse.createBySuccess("三级类目数据", frontCate);
	}

	/**
	 * 查询商品总数
	 */
	@Override
	public ServerResponse<?> goodsCount() {
		Integer count = mapper.goodsCount();
		return ServerResponse.createBySuccess("商品总数", count);
	}

	/**
	 * 根据一级id获取二三级类目数据
	 */
	@Override
	public ServerResponse<?> currentCate(Integer parentId) {
		Map<String, Object> map = new HashMap<>();
		// 根据一级类目id查询二级类目信息
		List<CategoryContent> list = getData(parentId);
		return ServerResponse.createBySuccess("二三级类目数据", list);
	}

	public List<CategoryContent> getData(Integer id) {
		Map<String, Object> map = new HashMap<>();
		// 根据一级类目id查询二级类目信息
		List<CategoryContent> list = mapper.searchCategoryContent(id);
		// 循环二级类目去存储三级类目
		for (CategoryContent cc : list) {
			// 清空map
			map.clear();
			// 存储父id
			map.put("parentId", cc.getFrontCatId());
			// 查询三级类目
			List<ShopFrontCategory> list1 = mapper.searchShopFrontCategory(map);
			// 把三级类目存在二级类目的children属性中
			cc.setChildrens(list1);
		}
		return list;
	}
}
