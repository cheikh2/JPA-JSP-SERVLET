package sn.forage.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "village")
public class Village {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int id;
	@Column(name="libelle")
	private String libelle;
	@OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
    List<Client> clients = new ArrayList<Client>();
	
	public Village() {
        super();
    }

	public Village(int id, String libelle, List<Client> clients) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.clients = clients;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public void put(int id2, Village village) {
		// TODO Auto-generated method stub
		
	}
	
}
