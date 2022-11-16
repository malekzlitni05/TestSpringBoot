package tn.esprit.malek.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFournisseur {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long IdDetailFournisseur;
        private String adresse;
        private String matricule;

        @Temporal(TemporalType.DATE)
        private Date dateDebutCollaboration;

        @OneToOne
        private Fournisseur fournisseur;
        @OneToOne(mappedBy = "detailFournisseur")
        private Fournisseur getFournisseur;
}
