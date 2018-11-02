package com.huizhi.dao;

import java.util.List;

import com.huizhi.entity.Students;

public interface StudentsDao {
	/*
	 * 1.实现删除单条
	 2.实现查询单条
	 3.输入学生地址，返回学生信息 
	 */
	
	/**
	 * 使用学生对象，添加学生信息
	 * @param students  学生信息对象 
	 * @return  添加学生信息成功  返回整型数据 1
	 */
	public int addStudents(Students students);
	
	
	/**
	 * 根据学生对象的学号xh 修改学生对象的信息 
	 * @param students  修改学生对象的xh  和要修改的内容
	 * @return  修改成功  返回整型数据 1
	 */
	public int updateStudentsByXh(Students students);
	
	/**
	 * 根据学号  删除学生信息
	 * @param xh  学生学号
	 * @return  修改成功  返回int 1
	 */
	public int deleteStudentByXh(int xh);
	
	
	/**
	 * 根据学号xh  查看学生的信息
	 * @param xh  学生学号
	 * @return  返回学生对象 Students
	 */
	public Students infoStudnetsByXh(int xh);
	
	/**
	 * 根据地址  模糊查询学生信息
	 * @param addrsee  地址
	 * @return  返回List<Students> 集合
	 */
	public List<Students> infoStudentsByAdd(String addrsee);
}
