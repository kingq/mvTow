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
		System.out.println("�������꼶���");
		int gid = input.nextInt();
//		System.out.println("�������꼶����");
//		String name= input.next();
//		
//		Grade grade = new Grade(gid, name);
		
		GradeDao gradeDao = new GradeDaoImpl();
		
		Grade grade = gradeDao.getGradeByGid(gid);
		System.out.println("�꼶���\t�꼶����");
		System.out.println(grade.getGid()+"\t"+grade.getName());
		
//		List<Grade> list = gradeDao.getAllGrade();
//		System.out.println("�꼶���\t�꼶����");
//		for (Grade grade : list) {
//			System.out.println(grade.getGid()+"\t"+grade.getName());
//		}
		
//		int temp = gradeDao.updateGrade(grade);
//		int temp = gradeDao.addGrades(grade);
//		int temp = gradeDao.deleteGrade(gid);
//		if(temp>0) {
//			System.out.println("ɾ���ɹ�");
//		}else {
//			System.out.println("ɾ��ʧ��");
//		}
		
		
		
		
		//
//		SelectGrade sg = new SelectGrade();
//		ResultSet rs = sg.getAllGrade();
//		GradeDao gradeDao = new GradeDaoImpl();
//		ResultSet rs = gradeDao.getAllGrade();
//		GradeService gService = new GradeServiceImpl();
//		ResultSet rs = gService.gatAllGrade();
//		System.out.println("�꼶���\t�꼶����");
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
