package codeonce.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codeonce.spring.entity.Categorie;

@Repository
public interface CategorieRepository  extends JpaRepository<Categorie, Long>{

	List<Categorie> findByLibelleCategorie(String LibelleCategorie);
}
