package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.Reglement;

public interface RepositoryReglement extends JpaRepository<Reglement,Integer> {
}
