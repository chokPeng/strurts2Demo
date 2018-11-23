package com.digital.action;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.jndi.cosnaming.IiopUrl.Address;
public class UserLoginAction extends ActionSupport{
	private String userName;
	private String password;
	private String message;
	private String realName;
	private String sex;
	private String address;
	private String question;
	private String answer;
	private String favorite;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override	//默认方法
	public String execute() throws Exception{
		System.out.println("niangpao");
		//JDBC链接数据库的部分
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String back=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	//加载驱动
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital",
					"root","123456");	//	建立连接
			String sql="select * from user_info where userName='"+userName+"'and password='"+password+"'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {			//判断是否找到相应的用户名和密码
				back="success";//登录成功，返回success字符串	
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
				session=actionContext.getSession();		//上面user的值保存在session里面，之后通过session来调用
				session.put("CURRENT_USER",user);//currentUser是名字，可以改。user与之前new的user对应，不能随便改
				long currenTime=System.currentTimeMillis();//获取当前时间
				//获取开始时间
				Long startTime=(Long) session.get("startTime");
				if(startTime==null) {//第一次访问
					startTime=currenTime;
					session.put("startTime",startTime);
				}
				//以分钟计算访问的时间
				long usedTime=(currenTime-startTime)/1000/60;
				if(usedTime>60) {
					this.setMessage("您已经访问:"+usedTime+"分钟,请注意休息!");
				}else if(usedTime==0) {
					this.setMessage("您刚开始访问系统,祝您愉快!");
				}else {
					this.setMessage("您已经访问系统:"+usedTime+"分钟。");
				}
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
