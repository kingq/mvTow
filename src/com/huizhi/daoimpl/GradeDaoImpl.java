package com.huizhi.daoimpl;

import java.sql.ResultSet;

import com.huizhi.dao.GradeDao;

public class GradeDaoImpl extends BaseDao implements GradeDao {

	@Override
	public ResultSet getAllGrade() {
		String sql = "select * from grade";
		return this.executeQuery(sql, null);
		 
	}

}
