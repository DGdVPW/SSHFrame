package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.User;
import com.ssh.service.UserService;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User("003","ÍõÎå","ÄÐ",26,"14673284232");
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return null;
	}
	public String save() {
        System.out.println("ProductAction.save()...");
        boolean flag = userService.save(user);
        if(flag)
        	return "success";
        else 
        	return "error";
    }   

}
