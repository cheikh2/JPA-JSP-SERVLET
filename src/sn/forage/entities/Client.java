package sn.forage.entities;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private int id;
	@Column(name="prenom")
	private String prenom;
	@Column(name="nom")
	private String nom;
	@Column(name="adress")
    private String adress;
	@Column(name="telephone")
    private String telephone;
	@ManyToOne  @JoinColumn( name="idVillage" )
	private Village village;;
    
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String prenom, String nom, String adress, String telephone) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adress = adress;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}


}