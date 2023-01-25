package codeonce.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import codeonce.spring.entity.Produit;

@Repository
public interface ProduitRepository   extends JpaRepository<Produit, Long>{

	
	@Query(value = "SELECT * FROM produit as p WHERE p.quantiteproduit > 0 AND p.categorie_produit_id_categorie=:id  ", nativeQuery = true)
	public List<Produit> findByCategorie_quantite(@Param("id") Long id);

}
