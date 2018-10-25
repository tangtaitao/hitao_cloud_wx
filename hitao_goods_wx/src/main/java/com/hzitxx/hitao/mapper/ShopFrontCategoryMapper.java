package com.hzitxx.hitao.mapper;

import com.hzitxx.hitao.entity.CategoryContent;
import com.hzitxx.hitao.entity.ShopFrontCategory;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */
public interface ShopFrontCategoryMapper {

	int addShopFrontCategory(ShopFrontCategory obj);

	int addShopFrontCategorySelective(ShopFrontCategory obj);

	int deleteById(int frontCatId);

	int deleteByIds(String[] ids);

	int updateById(ShopFrontCategory shopFrontCategory);

	int updateSelectiveById(ShopFrontCategory shopFrontCategory);

	ShopFrontCategory findOne(Integer frontCatId);

	/**
	 * 查询一，三级类目
	 * 
	 * @param map
	 * @return
	 */
	List<ShopFrontCategory> searchShopFrontCategory(Map<String, Object> map);

	/**
	 * 根据id查询二级类目
	 * 
	 * @param parentId
	 * @return
	 */
	List<CategoryContent> searchCategoryContent(Integer parentId);

	/**
	 * 查询商品总数
	 * 
	 * @return
	 */
	Integer goodsCount();
}