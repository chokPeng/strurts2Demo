package com.digital.action;

import com.digital.dao.impl.ManagerDAO;
import com.digital.dao.impl.ManagerDAOImpl;
import com.digital.entity.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class AddManagerAction extends ActionSupport{
	private Manager manager;
	private String repassword;
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String execute() throws Exception{
		ManagerDAO mDao=new ManagerDAOImpl();
		int result=mDao.addManager(manager);
		String back;
		if(result!=0) {
			back="success";
		}else {
			back="input";
		}
		return back;
	}
}
