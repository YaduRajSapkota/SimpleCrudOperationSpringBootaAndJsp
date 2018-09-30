package com.yaduraj.LoginSP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaduraj.LoginSP.model.LoginModel;
import com.yaduraj.LoginSP.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	

	@Override
	public LoginModel getUserByUsername(String username) {
		return loginRepository.getUserByUsername(username);
	}



	@Override
	public void saveUser(LoginModel loginModel) {
		loginRepository.saveUser(loginModel);
	}

	
}
