package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.CategorieProduit;

public interface RepositoryCategorieProduit extends JpaRepository<CategorieProduit,Integer> {
}
