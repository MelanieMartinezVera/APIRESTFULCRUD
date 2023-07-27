package com.example.crud.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.Models.jugadorModel;
import com.example.crud.Repositories.jugadoresRepository;

@Service
public class jugadorService {
    @Autowired
    jugadoresRepository jugadorRepository;

    // Buscar todos los registros
    public ArrayList<jugadorModel> obtenerJugadores() {
        return (ArrayList<jugadorModel>) jugadorRepository.findAll();
    }

    // Buscar por ID
    public Optional<jugadorModel> obtenerId(Integer Id) {
        return jugadorRepository.findById(Id);
    }

    // Metodo para guardar un jugador
    public jugadorModel guardar(jugadorModel jugador) {
        return jugadorRepository.save(jugador);
    }

    // Metodo para eliminar datos
    public boolean eliminar(Integer Id) {
        try {
            jugadorRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
