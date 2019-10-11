package com.itheima.springbootssm.service;

import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.pojo.Cart;

public interface ICartService {
    public PageInfo<Cart> findCart(int pageNo, int pageSize);
}
