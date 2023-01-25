package codeonce.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String codeCategorie;
	private String libelleCategorie;
	@OneToMany(mappedBy = "categorieProduit")

	private Set<Produit> produits;
	
	public Categorie() {
		super();
	}
	
	public Categorie(Long idCategorie, String codeCategorie, String libelleCategorie, Set<Produit> produits) {
		super();
		this.idCategorie = idCategorie;
		this.codeCategorie = codeCategorie;
		this.libelleCategorie = libelleCategorie;
		this.produits = produits;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getLibelleCategorie() {
		return libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", codeCategorie=" + codeCategorie + ", libelleCategorie="
				+ libelleCategorie + ", produits=" + produits + "]";
	}


	
	
}
