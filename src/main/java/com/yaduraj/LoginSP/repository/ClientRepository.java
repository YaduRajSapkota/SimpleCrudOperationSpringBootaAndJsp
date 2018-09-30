package com.yaduraj.LoginSP.repository;

import com.yaduraj.LoginSP.model.ClientModel;

public interface ClientRepository {
	
	//public List<ClientModel> getAllClients();
	public void saveClient(ClientModel clientModel);
	public void removeClient(int id);
	public void updateClient(ClientModel clientModel);
	public ClientModel getClientModelById(int id);

}
