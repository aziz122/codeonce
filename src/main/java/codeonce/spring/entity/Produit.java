package codeonce.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private Long quantiteproduit;
	private String libelleProduit;
	private float prix;
	@ManyToOne
	@JsonIgnore
	private Categorie categorieProduit;
	
	
	
	
	public Produit() {
		super();
	}
	public Produit(Long idProduit, Long quantiteproduit, String libelleProduit, float prix,
			Categorie categorieProduit) {
		super();
		this.idProduit = idProduit;
		this.quantiteproduit = quantiteproduit;
		this.libelleProduit = libelleProduit;
		this.prix = prix;
		this.categorieProduit = categorieProduit;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Long getQuantiteproduit() {
		return quantiteproduit;
	}
	public void setQuantiteproduit(Long quantiteproduit) {
		this.quantiteproduit = quantiteproduit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Categorie getCategorieProduit() {
		return categorieProduit;
	}
	public void setCategorieProduit(Categorie categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", quantiteproduit=" + quantiteproduit + ", libelleProduit="
				+ libelleProduit + ", prix=" + prix + ", categorieProduit=" + categorieProduit + ", getIdProduit()="
				+ getIdProduit() + ", getQuantiteproduit()=" + getQuantiteproduit() + ", getLibelleProduit()="
				+ getLibelleProduit() + ", getPrix()=" + getPrix() + ", getCategorieProduit()=" + getCategorieProduit()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	
	
	
}
