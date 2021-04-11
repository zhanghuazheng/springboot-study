package com.huazheng;

import com.huazheng.pojo.User;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.sql.*;

/**
 * @author zhanghuazheng
 * @title: JDBCConfig
 * @projectName springboot-study
 * @description: JDBC测试
 * @date 2021/4/11 18:15
 */
public class JDBCConfig {
    private static final Logger logger = LoggerFactory.getLogger(JDBCConfig.class);

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";

    public static void main(String[] args) {
        User user = new User();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, "root", "123456");
            String sql = "select * from user where name =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "zhanghzi");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                System.out.println(user);
            }
        } catch (ClassNotFoundException e) {
            logger.error("驱动找不到", e);
        } catch (SQLException e) {
            logger.error("数据库连接不正确", e);
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
