package com.yaduraj.LoginSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaduraj.LoginSP.model.ClientModel;
import com.yaduraj.LoginSP.repository.ClientDao;
import com.yaduraj.LoginSP.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ClientDao clientDao;

	@Override
	public List<ClientModel> getAllClients() {
		return clientDao.findAll();
		//return clientRepository.getAllClients();
	}

	@Override
	public void saveClient(ClientModel clientModel) {
		clientRepository.saveClient(clientModel);
	}


	@Override
	public void removeClient(int id) {
		clientRepository.removeClient(id);
	}

	@Override
	public void updateClient(ClientModel clientModel) {
		clientRepository.updateClient(clientModel);
	}

	@Override
	public ClientModel getClientModelById(int id) {
		return clientRepository.getClientModelById(id);
		//return clientDao.getOne(id);
	}
	
	

}
