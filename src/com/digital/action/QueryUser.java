    package com.digital.action;
	import java.sql.*;
	import java.util.Map;
	import com.digital.entity.User;
	import com.opensymphony.xwork2.ActionContext;
	import com.opensymphony.xwork2.ActionSupport;
	public class QueryUser extends ActionSupport{
		private String userName;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}	
		@Override	//默认方法
		public String execute() throws Exception{
			//JDBC链接数据库的部分
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			String back=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");	//加载驱动
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital",
						"root","123456");	//	建立连接
				String sql="select * from user_info where userName='"+userName+"'";
				System.out.println(userName);
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				if(rs.next()) {	//判断是否找到相应的用户名和密码
					User user=new User();//	先new一个对象
					user.setUserName(rs.getString("userName"));
					user.setPassword(rs.getString("password"));
					user.setRealName(rs.getString("realName"));
					user.setSex(rs.getString("sex"));
					user.setAddress(rs.getString("address"));
					user.setQuestion(rs.getString("question"));
					user.setAnswer(rs.getString("answer"));
				    user.setFavorite(rs.getString("favorite"));
					Map<String,Object> session=null;
					ActionContext actionContext=ActionContext.getContext();
					session=actionContext.getSession();
					session.put("CURRENT_USER",user);
					back="success";//登录成功，返回success字符串	
				}else {
					back="input";//登录失败，返回input字符串
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
