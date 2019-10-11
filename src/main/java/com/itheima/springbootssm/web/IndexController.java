package com.itheima.springbootssm.web;

import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.pojo.Cart;
import com.itheima.springbootssm.pojo.Course;
import com.itheima.springbootssm.service.ICartService;
import com.itheima.springbootssm.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private ICourseService courseService;
    @Autowired
    private ICartService cartService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/search")
    public String search(){
        return "search";
    }
    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }

    @GetMapping("/findCourse")
    @ResponseBody
    public PageInfo<Course> findCourse(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                                       @RequestParam(value = "pageSize",defaultValue = "5") int pageSize) {
        return courseService.findCourse(pageNo,pageSize);
    }

    /**
     * 查询购物车
     */
    @GetMapping("/findCart")
    @ResponseBody
    public PageInfo<Cart> findCart(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                                   @RequestParam(value = "pageSize",defaultValue = "5") int pageSize){
        return cartService.findCart(pageNo,pageSize);
    }

    /**
     * 跳转到购物车页面
     * vue
     */
    @GetMapping("/vuecart")
    public String vuecart(){
        return "vuecart";
    }

}
