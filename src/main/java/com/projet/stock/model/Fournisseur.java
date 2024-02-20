package com.projet.stock.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "fournisseur")
public class Fournisseur {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String libelle;
	  private String adresse;
	  private String tel;
	  private String email;
	  private String fax;
	  //private String login;
	  //private String pwd;
	  private String  matfisc;
	  //private float   soldinit;
	  //private float   soldef;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMatfisc() {
		return matfisc;
	}
	public void setMatfisc(String matfisc) {
		this.matfisc = matfisc;
	}
	@Override
	public String toString() {
		return "Fournisseur [id=" + id + ", libelle=" + libelle + ", adresse=" + adresse + ", tel=" + tel + ", email="
				+ email + ", fax=" + fax + ", matfisc=" + matfisc + "]";
	}
	public Fournisseur(long id, String libelle, String adresse, String tel, String email, String fax, String matfisc) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.fax = fax;
		this.matfisc = matfisc;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
}
