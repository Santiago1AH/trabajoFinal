package com.example.vendedor.models.dao;

import com.example.vendedor.models.entity.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoDao extends JpaRepository<producto, Long> {
}
