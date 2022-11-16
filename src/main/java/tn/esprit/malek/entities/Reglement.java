package tn.esprit.malek.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Reglement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReglement;
    private Float montantPaye;
    private Float montantRestant;
    private Boolean payee;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;


    @ManyToOne
    @JsonIgnore
    private Facture facture;

    @ManyToOne
    private Facture facturess;





}
