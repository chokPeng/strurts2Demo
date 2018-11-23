package com.digital.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import com.digital.entity.Manager;
import com.mysql.jdbc.Field;
import com.opensymphony.xwork2.ActionContext;

public class ManagerLoginAction {
	private String managerName;
	private String password;
	private String keyWord;
	private String message;
	private Manager manager;
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	} 
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String execute() throws Exception{
		//JDBC链接数据库的部分
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String back=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	//加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?useUnicode=true&characterEncoding=utf-8&useSSL=false",
					"root","123456");	//	建立连接
			String sql="select * from manager_info where managerName= '"+managerName+"' and password= '"+password+"'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {			//判断是否找到相应的用户名和密码
				back="success";//登录成功，返回success字符串	
				Map<String,Object> session=null;
				ActionContext actionContext=ActionContext.getContext();
				session=actionContext.getSession();
				session.put("CURRENT_MANAGER",manager);
			}else {
				back="input";//登录失败，返回input字符串
				this.setMessage("登录失败，请检查用户名和密码是否正确");
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(null!=rs) {rs.close();}
				if(null!=pstmt) {pstmt.close();}
				if(null!=conn) {conn.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return back;
	}
}	
