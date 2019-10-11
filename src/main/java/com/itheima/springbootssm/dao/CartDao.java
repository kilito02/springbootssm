package com.itheima.springbootssm.dao;

import com.itheima.springbootssm.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDao {
    /**
     * 查询所有购物车信息
     */
    public List<Cart> findCart();
}
