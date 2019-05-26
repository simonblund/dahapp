package com.simonblund.dahapp.data;

import com.simonblund.dahapp.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    ArrayList<User> findAll();

}
