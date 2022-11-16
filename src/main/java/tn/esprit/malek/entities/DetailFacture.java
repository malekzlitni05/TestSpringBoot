package tn.esprit.malek.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DetailFacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDetailFacture;
    private Integer qteCommandee;
    private Float prixTotalDetail;
    private Integer pourcentageRemise;
    private Float montantRemise;

    @ManyToOne
    private Facture facture;


}
