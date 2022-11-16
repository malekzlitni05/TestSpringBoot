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
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCategorieProduit;
    private String CodeProduit;
    private String LibelleCategorieProduit;

    @OneToMany(mappedBy = "CategorieProduit ")
    Set<Produit> produitSet;
}
