package tn.esprit.malek.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.malek.entities.DetailFacture;
import tn.esprit.malek.service.IDetailFacture;

import java.util.Set;

@RestController
@RequestMapping("DetailEquipe")

public class DetailFactureController {
    @Autowired
    IDetailFacture DetailFacture;
    @PostMapping("/creat")
    public DetailFacture create(@RequestBody DetailFacture detailFacture){
        return DetailFacture.creer(detailFacture);
        }
        @GetMapping ("/read")
                public Set<DetailFacture> read(){
            return DetailFacture.lire();

        }

        @PutMapping ("/update/{idDetailFacture}")
                public DetailFacture update(Long IdDetailFacture,DetailFacture detailFacture ) {
            return DetailFacture.modifier(IdDetailFacture, detailFacture);
        }

        @DeleteMapping("/delete")
                public void delete (@PathVariable Long IdDetailFacture){
             DetailFacture.supprimer(IdDetailFacture);
        }
    }

