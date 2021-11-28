package com.example.vendedor.models.services;


import com.example.vendedor.models.dao.VendedorDao;
import com.example.vendedor.models.entity.vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class vendedorService {

@Autowired
    private VendedorDao vendedorDao;


    public vendedor create(vendedor Vendedor) {   // crear
        return vendedorDao.save(Vendedor);
    }

    public List<vendedor> getVendedors(){		//Listar
        return vendedorDao.findAll();
    }

    public Optional<vendedor> findById (long id){ //listar por cedula
        return vendedorDao.findById(id);
    }
    public void deleteById (long id) {		//Borrar por cedula
        vendedorDao.deleteById(id);
    }

    public vendedor actualizar  (vendedor Vendedor) {	// actualizar
        return vendedorDao.save(Vendedor);
    }
}
