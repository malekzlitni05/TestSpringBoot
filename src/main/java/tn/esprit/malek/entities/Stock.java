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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdStock;
    private  Integer qte;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(mappedBy = "Stock")
    private Stock stock;

}
