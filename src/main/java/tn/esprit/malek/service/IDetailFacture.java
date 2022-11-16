package tn.esprit.malek.service;

import tn.esprit.malek.entities.DetailFacture;

import java.util.Set;

public interface IDetailFacture {
    DetailFacture creer (DetailFacture detailFacture);
    Set<DetailFacture> lire();
    DetailFacture modifier (Long IdDetailFacture , DetailFacture detailFacture);
    void supprimer (Long IdDetailFacture);
}
