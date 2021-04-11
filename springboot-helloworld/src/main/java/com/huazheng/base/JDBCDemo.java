package com.huazheng.base;

import com.huazheng.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @author zhanghuazheng
 * @title: JDBCDemo
 * @projectName springboot-study
 * @description: JDBC连接
 * @date 2021/4/11 17:45
 */

public class JDBCDemo {
    private static final Logger logger = LoggerFactory.getLogger(JDBCDemo.class);
    public static void main(String[] args) {
        User user = new User();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8",
                    "root", "123456");
            String sql = "select * from user where name =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"zhanghzi");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                user.setId(id);
                user.setName(name);
                System.out.println(user);

            }
        } catch (ClassNotFoundException e) {
            logger.error("驱动找不到",e);
        } catch (SQLException e) {
            logger.error("数据库连接不正确",e);
        }finally {

        }
    }
}
