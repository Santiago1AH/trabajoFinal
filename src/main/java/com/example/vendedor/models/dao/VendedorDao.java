package com.example.vendedor.models.dao;


import com.example.vendedor.models.entity.vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   VendedorDao extends JpaRepository<vendedor, Long> {

}
