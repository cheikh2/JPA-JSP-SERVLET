package sn.forage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Client;
import sn.forage.entities.Village;

public class ClientImpl implements IClient{

	private EntityManager em;
	
	public ClientImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("foragePU");
		
		this.em = emf.createEntityManager();
	}
	@Override
	public int add(Client client) {
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> list() {
		return em.createQuery("SELECT c FROM Client c").getResultList();
	
	}
	
	@Override
	public Client getClient(Long id) {
		Client c = new Client();
		try {
		  c = em.find(Client.class, id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	
	@Override
	public Client update(Client c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Village getVillage(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
