package tn.esprit.malek.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class SecteurActivite {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;

    @ManyToMany
    @JsonIgnore
    private Set<SecteurActivite> secteurActiviteSet;


}

