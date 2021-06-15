package com.itheima.jdbc;

import java.sql.*;

/**
 * @program: day01_eesy_01jdbc
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 08:37
 **/
public class JdbcDemo1 {
    /**
     * 程序的耦合
     *        耦合:程序间的依赖关系
     *              包括：
     *                  类之间的依赖
     *                  方法间的依赖
     *        解耦：
     *             降低程序间的依赖关系
     *        实际开发中:
     *             应该做到编译时不依赖，运行时才依赖
     *        解耦的思路:
     *              第一步：使用反射来创建对象，避免使用new
     *              第二步：通过读取配置文件来获取要创建的对象全限定类名
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8","root","sr198064");
        //获取操作数据库的预处理对象
        PreparedStatement pstm = coon.prepareStatement("select * from account");
        //执行sql，得到结果集
        ResultSet rs = pstm.executeQuery();
        //遍历（封装）结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //关闭资源
        rs.close();
        pstm.close();
        coon.close();
    }
}
