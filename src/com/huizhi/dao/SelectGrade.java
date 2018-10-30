package com.huizhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectGrade {
	//数据控制层Dao、查询grade表所有数据
	public ResultSet getAllGrade() {
		//查询grade表的sql语句
		String sql = "select * from grade";
		try {
			//连接驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接对象
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dt72", "root", "123456");
			//获取执行对象
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet  rs = ps.executeQuery(sql);
			return rs;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
