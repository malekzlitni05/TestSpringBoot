package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.Facture;

public interface RepositoryFacture extends JpaRepository<Facture,Integer> {
}
