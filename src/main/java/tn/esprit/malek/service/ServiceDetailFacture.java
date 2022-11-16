package tn.esprit.malek.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.malek.entities.DetailFacture;
import tn.esprit.malek.repository.RepositoryDetailFacture;

import java.util.Set;
@AllArgsConstructor
@Service
public class ServiceDetailFacture implements IDetailFacture {

    private final RepositoryDetailFacture repositoryDetailFacture;
    @Override
    public DetailFacture creer(DetailFacture detailFacture) {
        return null;
    }

    @Override
    public Set<DetailFacture> lire() {
        return null;
    }

    @Override
    public DetailFacture modifier(Long IdDetailFacture, DetailFacture detailFacture) {
        return null;
    }

    @Override
    public void supprimer(Long IdDetailFacture) {

    }
}
