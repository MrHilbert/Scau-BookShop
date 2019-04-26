package com.example.library.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.library.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 查询账户对应的密码
     * @param account
     * @return
     */
   String checkLogin(@Param(value="account") String account);
    
    /**
     * 查询所有的用户
     * @return
     */
    List<User> selectAllUser();
    
}