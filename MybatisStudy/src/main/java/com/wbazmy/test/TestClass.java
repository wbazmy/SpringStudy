package com.wbazmy.test;

import com.wbazmy.Dao.UserInterface;
import com.wbazmy.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/25 - 18:36
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //session工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //session会话对象
        SqlSession sqlSession = factory.openSession();
        //执行操作
        List<User> users = sqlSession.selectList("userMap.findAll");
        for (User u : users)
            System.out.println(u.toString());
        sqlSession.close();
    }

    @Test
//    插入操作
    public void test1() throws IOException {
        //获取核心配置文件
        User user = new User();
        user.setAccount("qwer");
        user.setPassword("123");
        user.setName("curry");
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //session工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //session会话对象，默认开启事务且不自动提交，
        SqlSession sqlSession = factory.openSession();
        //执行操作
        sqlSession.insert("userMap.add", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //session工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //session会话对象，默认开启事务且不自动提交，
        SqlSession sqlSession = factory.openSession();
        UserInterface mapper = sqlSession.getMapper(UserInterface.class);
        List<User> users = mapper.findAll();
        for (User u : users)
            System.out.println(u.toString());
        sqlSession.close();
    }
}
