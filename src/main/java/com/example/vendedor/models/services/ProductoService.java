package com.example.vendedor.models.services;

import com.example.vendedor.models.dao.productoDao;
import com.example.vendedor.models.entity.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private productoDao ProductoDao;

    public producto create(producto Prodcuto) {   // crear
        return ProductoDao.save(Prodcuto);
    }

    public List<producto> getProductos(){		//Listar
        return ProductoDao.findAll();
    }

    public Optional<producto> findById (long id){ //listar por cedula
        return ProductoDao.findById(id);
    }
    public void deleteById (long id) {		//Borrar por cedula
        ProductoDao.deleteById(id);
    }

    public producto actualizar  (producto Producto) {	// actualizar
        return ProductoDao.save(Producto);
    }

}
