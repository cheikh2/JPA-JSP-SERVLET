package sn.forage.entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "village")
public class Village {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	@OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
    private Collection<Client> clients;
	
	public Village() {
        super();
    }

	public Village(int id, String libelle, Collection<Client> clients) {
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

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
}
