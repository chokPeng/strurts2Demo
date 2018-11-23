package com.digital.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AlterUserInfo extends ActionSupport{
	private String userName;
	private String password;
	private String message;
	private String realName;
	private String sex;
	private String address;
	private String question;
	private String answer;
	private String favorite;
	private User user;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception{
		//JDBC链接数据库的部分
		Connection conn=null;
		PreparedStatement pstmt=null;
		String back=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	//加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital",
					"root","123456");	//	建立连接
			String sql="update user_info SET userName='"+userName+"',password='"+password+"',	realName='"+realName+"',"
					+"sex='"+sex+"',question='"+question+"',answer='"+answer+"',favorite='"+favorite+"' WHERE userName='"+userName+"'";
			pstmt=conn.prepareStatement(sql);
			int a=pstmt.executeUpdate();
			if(a==0) {
				back="success";
			}
			else {
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
}
