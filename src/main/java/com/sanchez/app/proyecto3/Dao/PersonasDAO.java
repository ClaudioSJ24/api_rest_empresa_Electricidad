package com.sanchez.app.proyecto3.Dao;

import com.sanchez.app.proyecto3.models.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //Decorador que no crea Bean de una clase abstracta
public interface PersonasDAO extends CrudRepository<Persona, Long> {
}
