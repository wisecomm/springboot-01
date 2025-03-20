package com.example.demo.mapper;

import com.example.demo.model.dto.UserDto;
import com.example.demo.model.dto.UserDto2;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper2 {

//    @Select("SELECT * FROM users WHERE user_id = #{userId}")
    @Select("SELECT * FROM test_scma.tb_user WHERE user_id = #{userId}")
    UserDto2 selectUserById(String userId);

    @Select("SELECT * FROM users")
    List<UserDto2> selectAllUsers();

    @Insert("INSERT INTO users(user_id, user_pw, user_nm) VALUES(#{userId}, #{userPw}, #{userNm})")
    void insertUser(UserDto2 user);

    @Update("UPDATE users SET user_pw = #{userPw}, user_nm = #{userNm} WHERE user_id = #{userId}")
    void updateUser(UserDto2 user);

    @Delete("DELETE FROM users WHERE user_id = #{userId}")
    void deleteUser(String userId);
}