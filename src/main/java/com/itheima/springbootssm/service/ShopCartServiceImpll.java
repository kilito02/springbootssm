package com.itheima.springbootssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.dao.ShopCartDao;
import com.itheima.springbootssm.pojo.ShopCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCartServiceImpll implements IShopCartService {
    @Autowired
    private ShopCartDao shopCartDao;
    /**
     * 查询所有购物车数据
     */
    public PageInfo<ShopCart> findShopCart(int pageNo, int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<>(shopCartDao.findShopCart());
    }

    /**
     * 添加购物车
     *
     * @param shopCart
     */
    @Override
    public int saveShopCart(ShopCart shopCart) {
        return shopCartDao.saveShopCart(shopCart);
    }
}