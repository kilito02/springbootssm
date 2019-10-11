package com.itheima.springbootssm.dao;

import com.itheima.springbootssm.pojo.Cart;
import com.itheima.springbootssm.pojo.ShopCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ShopCartDao {
    /**
     * 查询所有购物车信息
     */
    public List<ShopCart> findShopCart();
    /**
     * 添加购物车商品
     */
    public int saveShopCart(ShopCart shopCart);
}
