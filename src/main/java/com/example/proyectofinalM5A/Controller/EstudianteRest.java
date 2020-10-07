/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Controller;

import com.example.proyectofinalM5A.Model.Estudiante;
import com.example.proyectofinalM5A.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins="*")
public class EstudianteRest {
    
    @Autowired
    EstudianteService estudianteservice;
    
    // Metodo post
    @PostMapping(path = "/save")
    public ResponseEntity saveStudent(@RequestBody Estudiante estudiante) {
        estudianteservice.crearEstudiante(estudiante);
        return ResponseEntity.ok("Added student with id "+estudiante.getId());
    }

    //Metodo get general
    @GetMapping(path = "/list")
    public ResponseEntity listStudents() {
        return ResponseEntity.ok(estudianteservice.listarEstudiantes());
    }
    
}
