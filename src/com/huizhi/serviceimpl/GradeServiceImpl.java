package com.huizhi.serviceimpl;

import java.sql.ResultSet;

import com.huizhi.dao.GradeDao;
import com.huizhi.daoimpl.GradeDaoImpl;
import com.huizhi.service.GradeService;

public class GradeServiceImpl implements GradeService {

	@Override
	public ResultSet gatAllGrade() {

		GradeDao gDao = new GradeDaoImpl();
		return gDao.getAllGrade();
		
	}

}
