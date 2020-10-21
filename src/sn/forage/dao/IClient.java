package sn.forage.dao;

import java.util.List;

import sn.forage.entities.Client;
import sn.forage.entities.Village;

public interface IClient {

	public int add(Client client);
	public List<Client> list();
	public List<Village> listVillage();
	public Client getClient(Long id);
	public Client update(Client c);
	public void deleteClient(Long id);
	public Village getVillage(Long id);
}
