package com.huizhi.ui;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.huizhi.dao.SelectGrade;

public class ShowGrade {
	public static void main(String[] args) {
		//
		SelectGrade sg = new SelectGrade();
		ResultSet rs = sg.getAllGrade();
		System.out.println("年级编号\t年级名称");
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
