package com.digital.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class DeleteUserAction extends ActionSupport{
	private String userName;
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName(String userName) {
		return userName;
	}
	public String execute() throws Exception{
		//JDBC链接数据库的部分
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rs=0;
		String back=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	//加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital",
					"root","123456");	//	建立连接
			String sql="delete from user_info where userName ='"+userName+"'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeUpdate();
			if(rs==1) {			
				back="success";
				System.out.println("jinqule");
				
			}else {
				back="input";
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(null!=pstmt) {pstmt.close();}
				if(null!=conn) {conn.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return back;
	}
}
