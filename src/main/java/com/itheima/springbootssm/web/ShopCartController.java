package com.itheima.springbootssm.web;

import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.pojo.ShopCart;
import com.itheima.springbootssm.service.IShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopCartController {
    @Autowired
    private IShopCartService shopCartService;

    /**
     * 查看购物车
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("/findShopCart")
    public PageInfo<ShopCart> findShopCart(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                                           @RequestParam(value = "pageSize",defaultValue = "5") int pageSize){
        return shopCartService.findShopCart(pageNo,pageSize);
    }
    /**
     * 添加购物车
     */
    @PostMapping("/saveShopCart")
    public int saveShopCart(@RequestBody ShopCart shopCart){
        return shopCartService.saveShopCart(shopCart);
    }
}
