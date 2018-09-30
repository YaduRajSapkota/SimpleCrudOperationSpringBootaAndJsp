package com.yaduraj.LoginSP.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.yaduraj.LoginSP.model.LoginModel;

@Repository
public class LoginRepositoryImpl implements LoginRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public LoginModel getUserByUsername(String username) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getUserByUsername");
		SqlParameterSource param = new MapSqlParameterSource().addValue("user_name", username);
		Map<String, Object> data = simpleJdbcCall.execute(param);
		
		LoginModel loginModel = new LoginModel();
		loginModel.setUsername((String)data.get("uname"));
		loginModel.setPassword((String)data.get("pass"));
		
		return loginModel;
	}

	@Override
	public void saveUser(LoginModel loginModel) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("saveUser");
		SqlParameterSource param = new MapSqlParameterSource().addValue("username", loginModel.getUsername())
				.addValue("password", loginModel.getPassword());

		simpleJdbcCall.execute(param);
	}

}