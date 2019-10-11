package com.itheima.springbootssm.service;

import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.pojo.Cart;
import com.itheima.springbootssm.pojo.Course;

public interface ICourseService {

    public PageInfo<Course> findCourse(int pageNo, int pageSize);

}
