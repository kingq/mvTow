package com.huizhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectGrade {
	//���ݿ��Ʋ�Dao����ѯgrade����������
	public ResultSet getAllGrade() {
		//��ѯgrade���sql���
		String sql = "select * from grade";
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ���Ӷ���
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dt72", "root", "123456");
			//��ȡִ�ж���
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
