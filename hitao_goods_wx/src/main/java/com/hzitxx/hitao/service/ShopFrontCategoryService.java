package com.hzitxx.hitao.service;

import com.hzitxx.hitao.utils.ServerResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */

public interface ShopFrontCategoryService {
	/**
	 * 展示一级类目一级对应的二三级类目
	 */
	ServerResponse<?> frontCate();

	/**
	 * 查询商品总数
	 */
	ServerResponse<?> goodsCount();

	/**
	 * 根据一级id获取二三级类目数据
	 */
	ServerResponse<?> currentCate(Integer parentId);
}
