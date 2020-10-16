package sn.forage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Client;

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

}
