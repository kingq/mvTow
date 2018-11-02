package com.huizhi.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huizhi.dao.StudentsDao;
import com.huizhi.entity.Students;

public class StudentsDaoImpl extends BaseDao implements StudentsDao {

	
	/**
	 * 使用学生对象，添加学生信息
	 * @param students  学生信息对象 
	 * @return  添加学生信息成功  返回整型数据 1
	 */
	@Override
	public int addStudents(Students students) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 * 根据学生对象的学号xh 修改学生对象的信息 
	 * @param students  修改学生对象的xh  和要修改的内容
	 * @return  修改成功  返回整型数据 1
	 */
	@Override
	public int updateStudentsByXh(Students students) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 * 根据学号  删除学生信息
	 * @param xh  学生学号
	 * @return  修改成功  返回int 1
	 */
	@Override
	public int deleteStudentByXh(int xh) {
		String sql = "delete From Students where xh = ?";
		return this.executeUpdate(sql, new Object [] {xh});
		
	}

	
	/**
	 * 根据学号xh  查看学生的信息
	 * @param xh  学生学号
	 * @return  返回学生对象 Students
	 */
	@Override
	public Students infoStudnetsByXh(int xh) {
		Students stu = null;
		String sql = "select * from Students where xh = ?";
		ResultSet rs = this.executeQuery(sql, new Object [] {xh});
		try {
			if(rs.next()) {
				stu = new Students();
				stu.setXh(rs.getInt("xh"));
				stu.setName(rs.getString("name"));
				stu.setAdd(rs.getString("add"));
				stu.setAge(rs.getInt("age"));
				stu.setDate(rs.getString("date"));
				stu.setGid(rs.getInt("gid"));
				stu.setSex(rs.getString("sex"));
				stu.setState(rs.getInt("state"));
				stu.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return stu;
	}

	
	/**
	 * 根据地址  模糊查询学生信息
	 * @param addrsee  地址
	 * @return  返回List<Students> 集合
	 */
	@Override
	public List<Students> infoStudentsByAdd(String addrsee) {
		Students stu = null;
		List<Students> list = null;
		String sql = "select * from Students where add like ? ";
		ResultSet rs = this.executeQuery(sql,new Object[] {"%"+addrsee+"%"});
		try {
			list = new ArrayList<Students>();
			while(rs.next()) {
				stu = new Students();
				stu.setXh(rs.getInt("xh"));
				stu.setName(rs.getString("name"));
				stu.setAdd(rs.getString("add"));
				stu.setAge(rs.getInt("age"));
				stu.setDate(rs.getString("date"));
				stu.setGid(rs.getInt("gid"));
				stu.setSex(rs.getString("sex"));
				stu.setState(rs.getInt("state"));
				stu.setTel(rs.getString("tel"));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		
		return list;
	}

}
