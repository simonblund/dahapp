package com.simonblund.dahapp.data;

import com.simonblund.dahapp.models.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * List all users in db.
     * @return List of users in db
     */
    @Select("select * from users")
    List<User> findAll();

    /**
     * Get the user with id.
     * @param id id integer
     * @return User object
     */
    @Select("select * from users where id = #{id}")
    User getUserWithId(int id);

    /**
     * Insert user into db, with all attriutes except password resettoken and oauth token.
     * @param user user object to be inserted
     */
    @Insert("insert into users(firstName, lastName, email, telephone, passwordHash, admin, enabled) " +
            "values(#{firstName},#{lastName},#{email},#{telephone},#{passwordHash},#{admin},#{enabled})")
    void insert(User user);








}
