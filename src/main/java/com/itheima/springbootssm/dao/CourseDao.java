package com.itheima.springbootssm.dao;

import com.itheima.springbootssm.pojo.Cart;
import com.itheima.springbootssm.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {

    public List<Course> findCourse();

}
