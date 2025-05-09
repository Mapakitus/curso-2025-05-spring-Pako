package com.certidevs.repositories;

import com.certidevs.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Este repositorio hereda de JpaRepository, lo que le permite realizar operaciones CRUD
    //findAll, FindById, save, deleteById, etc.



}
