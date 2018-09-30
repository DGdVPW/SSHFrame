package com.ssh.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.service.impl.HomeServiceImpl;
@Controller
@Scope("prototype")
public class HomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HomeServiceImpl homeServiceImpl;
	
	public void setHomeServiceImpl(HomeServiceImpl homeServiceImpl) {
		this.homeServiceImpl = homeServiceImpl;
	}

	public String view(){
		return homeServiceImpl.view();
	}
}
