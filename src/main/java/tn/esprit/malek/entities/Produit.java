package tn.esprit.malek.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;



    @ManyToOne()
    private  Stock stock;

    @ManyToOne()
    private CategorieProduit categorieProduit;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

}
