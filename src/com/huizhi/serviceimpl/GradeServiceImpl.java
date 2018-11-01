package com.huizhi.serviceimpl;

import java.sql.ResultSet;
import java.util.List;

import com.huizhi.dao.GradeDao;
import com.huizhi.daoimpl.GradeDaoImpl;
import com.huizhi.entity.Grade;
import com.huizhi.service.GradeService;

public class GradeServiceImpl implements GradeService {

	@Override
	public List<Grade> gatAllGrade() {

		GradeDao gDao = new GradeDaoImpl();
		return gDao.getAllGrade();
		
	}

}
