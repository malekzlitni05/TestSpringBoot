package tn.esprit.malek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.malek.entities.DetailFacture;

public interface RepositoryDetailFacture extends JpaRepository<DetailFacture,Integer> {
}
