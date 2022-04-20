package com.wbazmy.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.wbazmy.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/17 - 21:54
 */
public class JdbcTest {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/study?serverTimezone=GMT%2b8";
        String username = "root";
        String pwd = "123456";
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(pwd);
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        template.update("insert into user values(?,?,?)", "root", "123456", "bob");
    }

    @Test
    public void testUpdate() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate) app.getBean("template");
        template.update("insert into user values(?,?,?)", "aab", "345", "jack");
    }

    @Test
    public void testQueryAll() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate) app.getBean("template");
        List<User> userList = template.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(userList);
    }

    @Test
    public void testQueryOne() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate) app.getBean("template");
        User user = template.queryForObject("select * from user where account=?", new BeanPropertyRowMapper<User>(User.class), "wbazmy");
        System.out.println(user);
    }

    @Test
    public void testQueryCount() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate) app.getBean("template");
        Integer num = template.queryForObject("select count(*) from user", Integer.class);  //将查询结果转换为整数类
        System.out.println(num);
    }
}
