package tn.esprit.malek.service;

import tn.esprit.malek.entities.Stock;

import java.util.List;

public interface Istock {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
