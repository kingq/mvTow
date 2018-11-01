package com.huizhi.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huizhi.dao.GradeDao;
import com.huizhi.entity.Grade;

public class GradeDaoImpl extends BaseDao implements GradeDao {

	@Override
	public List<Grade> getAllGrade() {
		String sql = "select * from grade";
		ResultSet rs = this.executeQuery(sql, null);
		List<Grade> list = null;
		try {
			list = new ArrayList<Grade>();
			while(rs.next()) {
				Grade grade = new Grade();
				grade.setGid(rs.getInt(1));
				grade.setName(rs.getString(2));
				list.add(grade);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.closeAll();
		}
		
		return list;
	}

	@Override
	public int addGrades(Grade grade) {
		String sql = "insert into grade values(?,?)";
		
		return this.executeUpdate(sql, new Object [] {grade.getGid(),grade.getName()});
	}

	@Override
	public int updateGrade(Grade grade) {
		String sql = "update grade set name = ? where gid = ?";
		return this.executeUpdate(sql, new Object [] {grade.getName(),grade.getGid()});
	}

	@Override
	public int deleteGrade(int gid) {
		String sql = "delete from grade where gid = ?";
		return this.executeUpdate(sql, new Object [] {gid});
	}

	@Override
	public Grade getGradeByGid(int gid) {
		Grade grade = new Grade();
		String sql = "select * from grade where gid = ?";
		ResultSet rs = this.executeQuery(sql, new Object [] {gid});
		try {
			if(rs.next()) {
				grade.setGid(rs.getInt(1));
				grade.setName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.closeAll();
		}
		
		return grade;
	}

	@Override
	public int addGrades(List<Grade> list) {
		String sql = "insert into grade (gid,name) values(?,?)";
		int temp = 0;
		for (Grade grade : list) {
			temp = this.executeUpdate(sql, new Object[] {grade.getGid(),grade.getName()});
		}
		return temp;
	}

	
}
