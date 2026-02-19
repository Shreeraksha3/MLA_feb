package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class StuDao {
	public static Connection getCon()
	{
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mlafeb1";
		String user="root";
		String pas="root@39";
		Connection con=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pas);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public void saveStudent(Student stu)
	{
		try {
			String sql="insert into student(usn, student_name, marks, address) values(?,?,?,?)";
			Connection con=StuDao.getCon();
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,  stu.getUsn());
			pst.setString(2, stu.getName());
			pst.setInt(3, stu.getMarks());
			pst.setString(4, stu.getAddress());
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public List<Student> getAllStudents()
	{
		List<Student> stuList=new ArrayList<>();
		try {
			String sql="select * from student";
			PreparedStatement pst=StuDao.getCon().prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Student stu=new Student();
				stu.setUsn(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setMarks(rs.getInt(3));
				stu.setAddress(rs.getString(4));
				
				stuList.add(stu);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stuList;
	}
	public void updateStudent(Student stu)
	{
		try {
			String sql="update student set student_name=?, marks=?, address=? where usn=?";
			PreparedStatement pst=StuDao.getCon().prepareStatement(sql);
			pst.setString(1, stu.getName());
			pst.setInt(2, stu.getMarks());
			pst.setString(3, stu.getAddress());
			pst.setInt(4, stu.getUsn());
			
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void deleteStudent(int usn)
	{
		try {
			String sql="delete from student where usn=?";
			PreparedStatement pst=StuDao.getCon().prepareStatement(sql);
			pst.setInt(1,usn);
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
