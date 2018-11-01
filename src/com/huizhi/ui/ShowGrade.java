package com.huizhi.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.huizhi.dao.GradeDao;

import com.huizhi.daoimpl.GradeDaoImpl;
import com.huizhi.entity.Grade;
import com.huizhi.service.GradeService;
import com.huizhi.serviceimpl.GradeServiceImpl;

public class ShowGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年级编号");
		int gid = input.nextInt();
//		System.out.println("请输入年级名称");
//		String name= input.next();
//		
//		Grade grade = new Grade(gid, name);
		
		GradeDao gradeDao = new GradeDaoImpl();
		
		Grade grade = gradeDao.getGradeByGid(gid);
		System.out.println("年级编号\t年级名称");
		System.out.println(grade.getGid()+"\t"+grade.getName());
		
//		List<Grade> list = gradeDao.getAllGrade();
//		System.out.println("年级编号\t年级名称");
//		for (Grade grade : list) {
//			System.out.println(grade.getGid()+"\t"+grade.getName());
//		}
		
//		int temp = gradeDao.updateGrade(grade);
//		int temp = gradeDao.addGrades(grade);
//		int temp = gradeDao.deleteGrade(gid);
//		if(temp>0) {
//			System.out.println("删除成功");
//		}else {
//			System.out.println("删除失败");
//		}
		
		
		
		
		//
//		SelectGrade sg = new SelectGrade();
//		ResultSet rs = sg.getAllGrade();
//		GradeDao gradeDao = new GradeDaoImpl();
//		ResultSet rs = gradeDao.getAllGrade();
//		GradeService gService = new GradeServiceImpl();
//		ResultSet rs = gService.gatAllGrade();
//		System.out.println("年级编号\t年级名称");
//		try {
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
