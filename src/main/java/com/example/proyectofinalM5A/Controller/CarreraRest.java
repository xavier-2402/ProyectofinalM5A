/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Controller;

import com.example.proyectofinalM5A.Model.Carrera;
import com.example.proyectofinalM5A.Service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/carrera")
@CrossOrigin(origins = "*")
public class CarreraRest {

    @Autowired
    CarreraService carreraservice;

    // Metodo post
    @PostMapping(path = "/save")
    public ResponseEntity saveCareer(@RequestBody Carrera carrera) {
        carreraservice.crearCarrera(carrera);
        return ResponseEntity.ok("Added career with id " + carrera.getId());
    }

    //Metodo get general
    @GetMapping(path = "/list")
    public ResponseEntity listCareers() {
        return ResponseEntity.ok(carreraservice.listarCarreras());
    }

    @GetMapping(path = "/listById/{id}")
    public ResponseEntity FindById(@PathVariable int id) {
        return ResponseEntity.ok(carreraservice.BuscarCarreraporId(id));
    }
}
