package tn.esprit.malek.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdFacture;
    private Float montantRemise;
    private Float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private Boolean archive;


    @OneToMany(mappedBy ="facture")
    private Set<Facture> reglement_fac;

    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglementSet ;

    @ManyToOne
    private Fournisseur fournisseur;




}

