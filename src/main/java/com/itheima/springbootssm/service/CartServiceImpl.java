package com.itheima.springbootssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.dao.CartDao;
import com.itheima.springbootssm.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements ICartService {
    @Autowired
    private CartDao cartDao;
    @Override
    public PageInfo<Cart> findCart(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<Cart>(cartDao.findCart());
    }
}
