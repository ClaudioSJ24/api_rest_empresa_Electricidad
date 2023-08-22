package com.sanchez.app.proyecto3.Dao;

import com.sanchez.app.proyecto3.models.Trabajador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("DAOTrabajadores")//Nombre con el cual se tendra referencia a este repositorio
public interface TrabajadoresDAO extends PersonasDAO {


}
