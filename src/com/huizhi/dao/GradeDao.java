package com.huizhi.dao;

import java.sql.ResultSet;
import java.util.List;

import com.huizhi.entity.Grade;

public interface GradeDao {
	public List<Grade> getAllGrade();
	public int addGrades(Grade grade);
	public int updateGrade(Grade grade);
	public int deleteGrade(int gid);
	public Grade getGradeByGid(int gid);
}
