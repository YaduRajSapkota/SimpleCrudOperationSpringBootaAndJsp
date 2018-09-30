package com.yaduraj.LoginSP.repository;

import com.yaduraj.LoginSP.model.LoginModel;

public interface LoginRepository{
	
	public LoginModel getUserByUsername(String username);

	public void saveUser(LoginModel loginModel);
	

	
	

}
