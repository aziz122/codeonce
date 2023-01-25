package codeonce.spring.service;

import java.util.List;

import codeonce.spring.entity.Categorie;
import codeonce.spring.entity.Produit;

public interface ProduitService {
	
	public  List<Produit> FetchProduitByCategorie(String categoriename);
	public List<Categorie> GetAllCategorie();
}
