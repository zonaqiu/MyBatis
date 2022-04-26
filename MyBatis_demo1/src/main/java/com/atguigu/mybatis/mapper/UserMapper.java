package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @author zona
 * @create 2022-04-14-5:12 下午
 */
public interface UserMapper {

    /**
     * MyBatis 面向接口编程的两个一致：
     * 1.映射文件的 namespace 要和 mapper 接口的全类名保持一致
     * 2.映射文件中 SQL 语句的 id 要和 mapper 接口中的方法名一致
     *
     *
     * 表---实体类---mapper 接口---映射文件
     */

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    int updateUser();

    /**
     * 删除用户信息
     */
    int deleteUser();

    /**
     * 根据 id 查询用户信息
     */
    User getUserById();

    /**
     * 查询所有用户的信息
     */
    List<User> getAllUser();
}
