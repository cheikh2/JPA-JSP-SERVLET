package sn.forage.dao;

import java.util.List;

import sn.forage.entities.Client;

public interface IClient {

	public int add(Client client);
	public List<Client> list();
}
