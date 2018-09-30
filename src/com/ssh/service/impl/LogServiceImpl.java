package com.ssh.service.impl;

import com.ssh.service.LogService;

public class LogServiceImpl implements LogService {
	@Override
	public String save(String username) {
		 if(username.equalsIgnoreCase("zqg"))
			return "saveUI";
		 else
			 return "list";
		
	}

	@Override
	public String list(String username) {
		if(username.equalsIgnoreCase("zqg"))
			return "saveUI";
		 else
			 return "list";
	}

}
