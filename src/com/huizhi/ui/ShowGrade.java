package com.huizhi.ui;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.huizhi.dao.GradeDao;
import com.huizhi.dao.SelectGrade;
import com.huizhi.daoimpl.GradeDaoImpl;

public class ShowGrade {
	public static void main(String[] args) {
		//
//		SelectGrade sg = new SelectGrade();
//		ResultSet rs = sg.getAllGrade();
		GradeDao gradeDao = new GradeDaoImpl();
		ResultSet rs = gradeDao.getAllGrade();
		System.out.println("�꼶���\t�꼶����");
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
