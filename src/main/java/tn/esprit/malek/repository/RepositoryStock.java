package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.Stock;

public interface RepositoryStock extends JpaRepository<Stock,Integer> {
}
