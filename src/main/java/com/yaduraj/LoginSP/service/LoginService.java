package com.yaduraj.LoginSP.service;

import com.yaduraj.LoginSP.model.LoginModel;

public interface LoginService {

	public LoginModel getUserByUsername(String username);

	public void saveUser(LoginModel loginModel);
	
}
