package tn.esprit.malek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.malek.Generic.GenericController;
import tn.esprit.malek.entities.CategorieProduit;
import tn.esprit.malek.service.ICategorieProduit;

@RestController
@RequestMapping("/CategorieProduit")

public class CategorieProduitController extends GenericController <CategorieProduit,Long>{
    @Autowired
    ICategorieProduit iCategorieProduit;

}
