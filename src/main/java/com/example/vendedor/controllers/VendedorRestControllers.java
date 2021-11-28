package com.example.vendedor.controllers;


import com.example.vendedor.models.entity.vendedor;
import com.example.vendedor.models.services.vendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("vendedor")
public class VendedorRestControllers {

@Autowired
    private vendedorService VendedorService;

    @PostMapping("/guardar")
    private ResponseEntity<vendedor> guardar(@RequestBody vendedor Vendedor) {
        vendedor temporal = VendedorService.create(Vendedor);
        try {

            return ResponseEntity.created(new URI("vendedor" + temporal.getId())).body(temporal);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("/listar")
    private ResponseEntity<List<vendedor>> listarVendedores (){
        return (ResponseEntity<List<vendedor>>) ResponseEntity.ok(VendedorService.getVendedors()); // retornamos todas los vendedores
    }


    @DeleteMapping("/eliminar/{id}")
    private Object  eliminarvendedor (@PathVariable long id){	//eliminar por cedula
        VendedorService.deleteById(id);
        return ResponseEntity.ok().build();
    }


    // Buscar persona por cedula
    @GetMapping ("/listar/{id}")
    private Object listarvendedorporid (@PathVariable long id){

        return ResponseEntity.ok(VendedorService.findById(id));// retornamos todas las personas
    }

    @PutMapping	("/actualizar")
    private ResponseEntity<vendedor> actualizar(@RequestBody vendedor Vendedor) {
        vendedor tempora2 = VendedorService.create(Vendedor);
        try {

            return ResponseEntity.created(new URI("vendedor" + tempora2.getId())).body(tempora2);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }



}
