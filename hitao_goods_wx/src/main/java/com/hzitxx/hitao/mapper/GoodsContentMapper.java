package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.utils.GoodsContent;

/**
 * 商品内容接口
 * @author wujun
 *
 */
public interface GoodsContentMapper {
	
	/**
	 * 查询商品内容
	 * @param map
	 * @return
	 */
	List<GoodsContent> selectGoodsContent(Map<String, Object> map);
}
