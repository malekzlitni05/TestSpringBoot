package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.Fournisseur;

public interface RepositoryFournisseur extends JpaRepository<Fournisseur,Integer> {
}
