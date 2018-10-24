package com.hzitxx.hitao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.mapper.ShopFavoritesMapper;
import com.hzitxx.hitao.service.ShopFavoritesService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * <p>
 * 买家收藏表 服务实现类
 * </p>
 *
 * @author tangtaitao
 * @since 2018-10-23
 */
@Service
public class ShopFavoritesServiceImpl implements ShopFavoritesService {

    @Autowired
    private ShopFavoritesMapper mapper;

    @Override
    public ServerResponse addShopFavorites(ShopFavorites shopFavorites){
        int result =  this.mapper.addShopFavorites(shopFavorites);
        if(result != 1){
            return ServerResponse.createByErrorMessage("添加失败!");
        }
        return ServerResponse.createBySuccessMessage("添加成功!");
    }

    @Override
    public ServerResponse addShopFavoritesSelective(ShopFavorites shopFavorites){
        int result =  this.mapper.addShopFavoritesSelective(shopFavorites);
        if(result != 1){
            return ServerResponse.createByErrorMessage("添加失败!");
        }
        return ServerResponse.createBySuccessMessage("添加成功!");
    }

    @Override
    public ServerResponse deleteById(int favId){
        int result = this.mapper.deleteById(favId);
        if(result != 1){
            return ServerResponse.createByErrorMessage("删除失败!");
        }
        return ServerResponse.createBySuccessMessage("删除成功!");
    }

    @Override
    public ServerResponse deleteByIds(String[]ids){
        int result = this.mapper.deleteByIds(ids);
        if(result != 0){
            return ServerResponse.createByErrorMessage("批量删除失败!");
        }
        return ServerResponse.createBySuccessMessage("批量删除成功!");
    }

    @Override
    public  ServerResponse updateById(ShopFavorites shopFavorites){
        int result = this.mapper.updateById(shopFavorites);
        if(result != 1){
            return ServerResponse.createByErrorMessage("编辑失败!");
        }
        return ServerResponse.createBySuccessMessage("编辑成功!");
    }

    @Override
    public  ServerResponse updateSelectiveById(ShopFavorites shopFavorites){
        return ServerResponse.createBySuccess(mapper.updateSelectiveById(shopFavorites));
    }

    @Override
    public  ServerResponse<List<ShopFavorites>> searchShopFavorites(Map<String, Object> map){
        return ServerResponse.createBySuccess(this.mapper.searchShopFavorites(map));
    }

    /**
     * 数据查询分页
     * @param page
     * @param limit
     * @param map
     * @return
     */
    @Override
    public ServerResponse<LayuiEntity<ShopFavorites>> page(int page,int limit,Map<String, Object> map){
        PageHelper.startPage(page,limit);
        List<ShopFavorites>  obj=mapper.searchShopFavorites(map);
        PageInfo<ShopFavorites> pageInfo=new PageInfo<>(obj);
        LayuiEntity<ShopFavorites> layuiEntity=new LayuiEntity<>();
        layuiEntity.setCode(0);
        layuiEntity.setMsg("数据");
        layuiEntity.setCount(pageInfo.getTotal());
        layuiEntity.setData(pageInfo.getList());
        return ServerResponse.createBySuccess(layuiEntity);
    }

    /**
     * 根据id查询数据
     * @param favId
     * @return
     */
    @Override
    public ServerResponse<ShopFavorites> findOne(Integer favId){
        ShopFavorites shopFavorites = this.mapper.findOne(favId);
        if(shopFavorites == null){
            return ServerResponse.createByErrorMessage("查询失败1!");
        }
        return ServerResponse.createBySuccess(shopFavorites);
     }
}

