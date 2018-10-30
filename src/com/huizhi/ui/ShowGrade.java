package com.huizhi.ui;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.huizhi.dao.GradeDao;

import com.huizhi.daoimpl.GradeDaoImpl;
import com.huizhi.service.GradeService;
import com.huizhi.serviceimpl.GradeServiceImpl;

public class ShowGrade {
	public static void main(String[] args) {
		//
//		SelectGrade sg = new SelectGrade();
//		ResultSet rs = sg.getAllGrade();
//		GradeDao gradeDao = new GradeDaoImpl();
//		ResultSet rs = gradeDao.getAllGrade();
		GradeService gService = new GradeServiceImpl();
		ResultSet rs = gService.gatAllGrade();
		System.out.println("年级编号\t年级名称");
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
