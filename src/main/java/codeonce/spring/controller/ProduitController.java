package codeonce.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import codeonce.spring.entity.Categorie;
import codeonce.spring.entity.Produit;
import codeonce.spring.service.ProduitService;

@RestController
@RequestMapping("/Produit")
@CrossOrigin(origins = "http://localhost:4200")
public class ProduitController {
	
	@Autowired
	ProduitService produitService;
	
	
	
	
	@GetMapping("/getproduit/{categoriename}")
	@ResponseBody
	public  List<Produit> getProduitByc(@PathVariable("categoriename") String categoriename){
	
		return 	produitService.FetchProduitByCategorie(categoriename);
		
	}
	
	@GetMapping("/getcategorie")
	@ResponseBody
	public  List<Categorie> getcategorie(){
	
		return 	produitService.GetAllCategorie();
		
	}

}
