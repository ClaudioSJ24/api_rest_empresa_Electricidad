package com.sanchez.app.proyecto3.services;

import com.sanchez.app.proyecto3.Dao.ClientesDAO;
import com.sanchez.app.proyecto3.Dao.PersonasDAO;
import com.sanchez.app.proyecto3.Dto.ClienteCreateDto;
import com.sanchez.app.proyecto3.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesService implements IService<Cliente, ClienteCreateDto>{



    @Autowired
    @Qualifier("DAOClientes")
    private PersonasDAO interfacePersonaDAO;
    @Override
    public List<Cliente> listar() {

        return null;

    }



    @Override
    public Optional<Cliente> getBy(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(ClienteCreateDto clienteCreateDto) {

    }

    @Override
    public void eliminar(Long id) {

    }
}
