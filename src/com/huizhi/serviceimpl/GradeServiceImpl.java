package com.huizhi.serviceimpl;

import java.sql.ResultSet;
import java.util.List;

import com.huizhi.dao.GradeDao;
import com.huizhi.daoimpl.GradeDaoImpl;
import com.huizhi.entity.Grade;
import com.huizhi.service.GradeService;

public class GradeServiceImpl implements GradeService {
	GradeDao gDao = new GradeDaoImpl();
	public List<Grade> gatAllGrade() {
		return gDao.getAllGrade();
		
	}

	@Override
	public int addGrades(Grade grade) {
		// TODO Auto-generated method stub
		return gDao.addGrades(grade);
	}

	

	@Override
	public int addGrades(List<Grade> list) {
		// TODO Auto-generated method stub
		return gDao.addGrades(list);
	}

	@Override
	public int updateGrade(Grade grade) {
		// TODO Auto-generated method stub
		return gDao.updateGrade(grade);
	}

	@Override
	public int deleteGrade(int gid) {
		// TODO Auto-generated method stub
		return gDao.deleteGrade(gid);
	}

	@Override
	public Grade getGradeByGid(int gid) {
		// TODO Auto-generated method stub
		return gDao.getGradeByGid(gid);
	}

	@Override
	public List<Grade> getAllGrade() {
		// TODO Auto-generated method stub
		return gDao.getAllGrade();
	}

}
