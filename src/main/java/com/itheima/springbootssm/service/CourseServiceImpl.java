package com.itheima.springbootssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.springbootssm.dao.CourseDao;
import com.itheima.springbootssm.pojo.Cart;
import com.itheima.springbootssm.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements  ICourseService {

    @Autowired
    private CourseDao courseDao;

    public PageInfo<Course> findCourse(int pageNo,int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<Course>(courseDao.findCourse());
    }

}
