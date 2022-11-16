package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.Produit;

public interface RepositoryProduit extends JpaRepository<Produit,Integer> {
}
