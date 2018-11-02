package com.huizhi.dao;

import java.util.List;

import com.huizhi.entity.Students;

public interface StudentsDao {
	/*
	 * 1.ʵ��ɾ������
	 2.ʵ�ֲ�ѯ����
	 3.����ѧ����ַ������ѧ����Ϣ 
	 */
	
	/**
	 * ʹ��ѧ���������ѧ����Ϣ
	 * @param students  ѧ����Ϣ���� 
	 * @return  ���ѧ����Ϣ�ɹ�  ������������ 1
	 */
	public int addStudents(Students students);
	
	
	/**
	 * ����ѧ�������ѧ��xh �޸�ѧ���������Ϣ 
	 * @param students  �޸�ѧ�������xh  ��Ҫ�޸ĵ�����
	 * @return  �޸ĳɹ�  ������������ 1
	 */
	public int updateStudentsByXh(Students students);
	
	/**
	 * ����ѧ��  ɾ��ѧ����Ϣ
	 * @param xh  ѧ��ѧ��
	 * @return  �޸ĳɹ�  ����int 1
	 */
	public int deleteStudentByXh(int xh);
	
	
	/**
	 * ����ѧ��xh  �鿴ѧ������Ϣ
	 * @param xh  ѧ��ѧ��
	 * @return  ����ѧ������ Students
	 */
	public Students infoStudnetsByXh(int xh);
	
	/**
	 * ���ݵ�ַ  ģ����ѯѧ����Ϣ
	 * @param addrsee  ��ַ
	 * @return  ����List<Students> ����
	 */
	public List<Students> infoStudentsByAdd(String addrsee);
}
