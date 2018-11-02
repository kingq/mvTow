package com.huizhi.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huizhi.dao.StudentsDao;
import com.huizhi.entity.Students;

public class StudentsDaoImpl extends BaseDao implements StudentsDao {

	
	/**
	 * ʹ��ѧ���������ѧ����Ϣ
	 * @param students  ѧ����Ϣ���� 
	 * @return  ���ѧ����Ϣ�ɹ�  ������������ 1
	 */
	@Override
	public int addStudents(Students students) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 * ����ѧ�������ѧ��xh �޸�ѧ���������Ϣ 
	 * @param students  �޸�ѧ�������xh  ��Ҫ�޸ĵ�����
	 * @return  �޸ĳɹ�  ������������ 1
	 */
	@Override
	public int updateStudentsByXh(Students students) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 * ����ѧ��  ɾ��ѧ����Ϣ
	 * @param xh  ѧ��ѧ��
	 * @return  �޸ĳɹ�  ����int 1
	 */
	@Override
	public int deleteStudentByXh(int xh) {
		String sql = "delete From Students where xh = ?";
		return this.executeUpdate(sql, new Object [] {xh});
		
	}

	
	/**
	 * ����ѧ��xh  �鿴ѧ������Ϣ
	 * @param xh  ѧ��ѧ��
	 * @return  ����ѧ������ Students
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
	 * ���ݵ�ַ  ģ����ѯѧ����Ϣ
	 * @param addrsee  ��ַ
	 * @return  ����List<Students> ����
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
