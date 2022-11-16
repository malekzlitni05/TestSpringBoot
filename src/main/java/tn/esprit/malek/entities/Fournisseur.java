package tn.esprit.malek.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long IdFournisseur;
        private String codeFournisseur;
        private String libelleFournisseur;
        @Enumerated(EnumType.STRING)
        private CategorieFournisseur categorieFournisseur;

        @ManyToMany
        Set<SecteurActivite>secteurActivites;


         @OneToMany(mappedBy = "fournisseur")
         Set <Facture> factures;
        @OneToOne(mappedBy = "fournisseur")
        private DetailFournisseur detailFournisseur;

        @ManyToMany
         Set<SecteurActivite> secteurActiviteSet;
}



