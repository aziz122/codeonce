package codeonce.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeonce.spring.entity.Categorie;
import codeonce.spring.entity.Produit;
import codeonce.spring.repository.CategorieRepository;
import codeonce.spring.repository.ProduitRepository;

@Service
public class ProduitServiceIMP implements ProduitService{

	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private CategorieRepository catergorieRepository;
	@Override
	public List<Produit> FetchProduitByCategorie(String categoriename) {

		List<Categorie> categorie= catergorieRepository.findByLibelleCategorie(categoriename);
		if(categorie.isEmpty()){
			return null;
		}
		else
		{
			List<Produit> produits=produitRepository.findByCategorie_quantite(categorie.get(0).getIdCategorie());
			return produits;
		}
		
	
		
		
	}
	@Override
	public List<Categorie> GetAllCategorie() {
		List<Categorie> Categories=catergorieRepository.findAll();
		return Categories;
	}

	
}
