package tn.esprit.malek.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.malek.Generic.IGenericServiceImpl;
import tn.esprit.malek.entities.CategorieProduit;
import tn.esprit.malek.repository.RepositoryCategorieProduit;

public class ServiceCategorieProduit extends IGenericServiceImpl<CategorieProduit,Long> implements  ICategorieProduit{
    @Autowired
    RepositoryCategorieProduit repositoryCategorieProduit;
}
