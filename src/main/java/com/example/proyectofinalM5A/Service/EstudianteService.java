/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Service;


import com.example.proyectofinalM5A.Model.Estudiante;
import com.example.proyectofinalM5A.Repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class EstudianteService {
    @Autowired
    
    EstudianteRepository estudianterepository;
    
     public Estudiante crearEstudiante(Estudiante est) {
        return estudianterepository.save(est);
    }
    
    public List<Estudiante> listarEstudiantes() {
        return estudianterepository.findAll();
    }
    
        public List<Estudiante> buscarporCedula(String cedula){
        return estudianterepository.findByCedula(cedula);
    }
      
}
