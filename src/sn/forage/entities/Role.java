package sn.forage.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role{
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int id;
	@Column(name="libelle")
	private String libelle;
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    List<User> users = new ArrayList<User>();

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int id, String libelle, List<User> clients) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.users = clients;
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

	public List<User> getClients() {
		return users;
	}

	public void setClients(List<User> clients) {
		this.users = clients;
	}
	
	
}
