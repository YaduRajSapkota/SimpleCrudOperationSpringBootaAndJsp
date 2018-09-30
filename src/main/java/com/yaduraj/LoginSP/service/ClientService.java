package com.yaduraj.LoginSP.service;

import java.util.List;


import com.yaduraj.LoginSP.model.ClientModel;

public interface ClientService {
	
	public List<ClientModel> getAllClients();
	
	public void saveClient(ClientModel clientModel);
	
	public void removeClient(int id);
	
	public void updateClient(ClientModel clientModel);
	
	public ClientModel getClientModelById(int id);
	
	

}
