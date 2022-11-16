package tn.esprit.malek.service;

import tn.esprit.malek.entities.Produit;

import java.util.List;

public interface IProduit {
    List<Produit> retrieveAllProduits();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit retrieveProduit(Long id);
}
