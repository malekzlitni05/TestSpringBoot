package tn.esprit.malek.Generic;

import java.util.List;

public interface IGenericService<T,ID> {
    List<T> retrieveAll();

    T add (T entity);

    T update (T entity);

    T retrieveById (ID id);

    void remove(ID id);
}
