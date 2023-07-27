package com.example.crud.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.Models.jugadorModel;

@Repository
public interface jugadoresRepository extends CrudRepository<jugadorModel, Integer> {
    // No hace falta declarar metodos estaticos porque estos metodos ya estan
    // programados en la dependencia crudrepository
    // fingById()
    // fingAll()
    // DeleteById()

}
