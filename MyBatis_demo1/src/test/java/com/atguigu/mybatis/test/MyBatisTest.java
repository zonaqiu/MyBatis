package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zona
 * @create 2022-04-16-3:42 下午
 */
public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置 文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder= new SqlSessionFactoryBuilder();
        //获取 sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取 mapper 接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
//        int result = userMapper.insertUser();
//        System.out.println("result : "+result);
        int i = userMapper.updateUser();
        System.out.println(i);
        //提交事务
//        sqlSession.commit();
    }
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser();
        System.out.println(i);
    }
    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.deleteUser();
//        System.out.println(i);
//        User userById = mapper.getUserById();
//        System.out.println(userById);
        //查询所有用户信息
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);

    }
}
