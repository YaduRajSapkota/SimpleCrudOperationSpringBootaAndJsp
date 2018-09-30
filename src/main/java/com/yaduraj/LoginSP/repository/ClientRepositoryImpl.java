package com.yaduraj.LoginSP.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.yaduraj.LoginSP.model.ClientModel;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

 
	@Override
	public void saveClient(ClientModel clientModel) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("saveClient");
		SqlParameterSource param = new MapSqlParameterSource().addValue("clientname", clientModel.getClientName())
				.addValue("address", clientModel.getAddress()).addValue("phoneno", clientModel.getPhoneNo());
		simpleJdbcCall.execute(param);

	}


	@Override
	public void removeClient(int id) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("deleteClient");
		SqlParameterSource param = new MapSqlParameterSource().addValue("client_id", id);
		simpleJdbcCall.execute(param);

	}

	@Override
	public void updateClient(ClientModel clientModel) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("updateclient");
		SqlParameterSource param = new MapSqlParameterSource().addValue("client_id", clientModel.getId()).addValue("clientname", clientModel.getClientName())
				.addValue("address", clientModel.getAddress()).addValue("phoneno", clientModel.getPhoneNo());
		simpleJdbcCall.execute(param);

	}

	@Override
	public ClientModel getClientModelById(int id) {
		
		SimpleJdbcCall call=new SimpleJdbcCall(jdbcTemplate).withProcedureName("getAllClientsById");
		SqlParameterSource param = new MapSqlParameterSource().addValue("cid", id);
		Map<String, Object> res=call.execute(param);
		ClientModel cm=new ClientModel();
		cm.setId((Integer)res.get("ccid"));
		cm.setAddress((String)res.get("addr"));
		cm.setClientName((String)res.get("cname"));
		cm.setPhoneNo((String)res.get("pnumber"));
		return cm;
	}

}
