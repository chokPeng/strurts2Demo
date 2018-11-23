package com.digital.dao.impl;
import java.sql.*;
import com.digital.entity.Manager;

public class ManagerDAOImpl extends BaseDAO implements ManagerDAO{
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	@Override
	public int addManager(Manager manager) {
		int result=0;
		String sql="insert into manager_info(managerName,password,realName,phoneNumber,address,email,sex) values(?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");	//加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital",
					"root","123456");	//	建立连接
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, manager.getManagerName());
			pstmt.setString(2, manager.getPassword());
			pstmt.setString(3, manager.getRealName());
			pstmt.setString(4, manager.getPhoneNumber());
			pstmt.setString(5, manager.getAddress());
			pstmt.setString(6, manager.getEmail());
			pstmt.setString(7, manager.getSex());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return result;
	}
}