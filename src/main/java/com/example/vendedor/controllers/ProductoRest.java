package com.example.vendedor.controllers;


import com.example.vendedor.models.entity.producto;
import com.example.vendedor.models.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("producto")
public class ProductoRest {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/guardar") // crear producto
    private ResponseEntity<producto> guardar(@RequestBody producto Producto) {
        producto temporal = productoService.create(Producto);
        try {

            return ResponseEntity.created(new URI("producto" + temporal.getIdcategoria())).body(temporal);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("/listar")  // Listar prodcutos
    private ResponseEntity<List<producto>> listarproductos() {
        return (ResponseEntity<List<producto>>) ResponseEntity.ok(productoService.getProductos()); // retornamos todas los vendedores
    }


    @DeleteMapping("/eliminar/{id}")
    private Object eliminarvendedor(@PathVariable long id) {    //eliminar por idcategoria
        productoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    // Buscar persona por idcategoria
    @GetMapping("/listar/{id}")
    private Object listarvendedorporid(@PathVariable long id) {

        return ResponseEntity.ok(productoService.findById(id));// retornamos todas las personas
    }

    @PutMapping("/actualizar")
    private ResponseEntity<producto> actualizar(@RequestBody producto Producto) {
        producto tempora2 = productoService.create(Producto);
        try {

            return ResponseEntity.created(new URI("vendedor" + tempora2.getIdcategoria())).body(tempora2);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

