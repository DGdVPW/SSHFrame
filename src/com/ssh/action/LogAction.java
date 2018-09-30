package com.ssh.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.service.impl.LogServiceImpl;

@Controller
@Scope("prototype")
public class LogAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private LogServiceImpl logServiceImpl;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLogServiceImpl(LogServiceImpl logServiceImpl) {
		this.logServiceImpl = logServiceImpl;
	}

	public String save(){
		return logServiceImpl.save(username);
	}
	public String list(){
		return logServiceImpl.list(username);
	}
}
