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
public class Operateur {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long IdOperateur;
        private String nom;
        private String prenom;
        private String password;

        @OneToMany
        private Set<Facture> factures;

    }
