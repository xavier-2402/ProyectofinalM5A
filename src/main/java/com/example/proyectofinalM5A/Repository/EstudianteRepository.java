/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Repository;

import com.example.proyectofinalM5A.Model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author usuario
 */
public interface EstudianteRepository extends MongoRepository<Estudiante,Long> {
    
}
