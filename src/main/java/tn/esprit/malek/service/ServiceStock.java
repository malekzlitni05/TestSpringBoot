package tn.esprit.malek.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.malek.entities.Stock;
import tn.esprit.malek.repository.RepositoryDetailFacture;
import tn.esprit.malek.repository.RepositoryStock;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceStock implements Istock {
    private final RepositoryStock repositoryStock;

    @Override
    public List<Stock> retrieveAllStocks() {
        return null;
    }

    @Override
    public Stock addStock(Stock s) {
        return null;
    }

    @Override
    public Stock updateStock(Stock s) {
        return null;
    }

    @Override
    public Stock retrieveStock(Long id) {
        return null;
    }

    @Override
    public void removeStock(Long id) {

    }
}
