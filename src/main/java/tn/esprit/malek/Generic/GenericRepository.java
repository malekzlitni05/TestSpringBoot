package tn.esprit.malek.Generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface GenericRepository<T,ID> extends JpaRepository<T,ID> {

}
