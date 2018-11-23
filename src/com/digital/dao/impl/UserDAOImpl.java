package com.digital.dao.impl;
import java.sql.*;
import com.opensymphony.xwork2.ActionContext;
import com.digital.entity.User;
import javassist.runtime.Inner;

public class UserDAOImpl extends BaseDAO implements UserDAO{
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	@Override
	public int addUser(User user) {
		int result=0;
		String sql="insert into user_info(userName,password,realName,address,email) values(?,?,?,?,?)";
		try {
			conn=this.getConnection();//建立数据库连接
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getRealName());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getEmail());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return result;
	}
}
