package com.itheima.springbootssm.service;

import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.pojo.ShopCart;

public interface IShopCartService {
    /**
     * 查询所有购物车数据
     */
    public PageInfo<ShopCart> findShopCart(int pageNo, int pageSize);
    /**
     * 添加购物车
     */
    public int saveShopCart(ShopCart shopCart);
}