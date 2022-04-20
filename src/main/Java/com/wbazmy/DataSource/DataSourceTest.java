package com.wbazmy.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/10 - 22:58
 */
public class DataSourceTest {
    public static void main(String[] args) throws SQLException {
        ResourceBundle resourceBundle=ResourceBundle.getBundle("jdbc");
        String driver=resourceBundle.getString("jdbc.driver");
        String url=resourceBundle.getString("jdbc.url");
        String username=resourceBundle.getString("jdbc.username");
        String pwd=resourceBundle.getString("jdbc.password");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(pwd);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
