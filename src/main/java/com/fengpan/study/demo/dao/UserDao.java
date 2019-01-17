package com.fengpan.study.demo.dao;


import com.fengpan.study.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user")
    User getUser();
}
