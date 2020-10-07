/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Service;

import com.example.proyectofinalM5A.Model.Carrera;
import com.example.proyectofinalM5A.Repository.CarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class CarreraService {
    @Autowired
    CarreraRepository carrerarepository;
    
     public Carrera crearCarrera(Carrera carrera) {
        return carrerarepository.save(carrera);
    }
    
    public List<Carrera> listarCarreras() {
        return carrerarepository.findAll();
    }
    
}
