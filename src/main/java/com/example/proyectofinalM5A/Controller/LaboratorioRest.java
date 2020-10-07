/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Controller;

import com.example.proyectofinalM5A.Model.Laboratorio;
import com.example.proyectofinalM5A.Service.LaboratorioService;
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
@RequestMapping("/laboratorio")
@CrossOrigin(origins="*")
public class LaboratorioRest {
    @Autowired
    LaboratorioService laboratorioservice;
    
    // Metodo post
    @PostMapping(path = "/save")
    public ResponseEntity saveLaboratory(@RequestBody Laboratorio laboratorio) {
        laboratorioservice.crearLaboratorio(laboratorio);
        return ResponseEntity.ok("Added laboratory with id "+laboratorio.getId());
    }

    //Metodo get general
    @GetMapping(path = "/list")
    public ResponseEntity listLaboratorys() {
        return ResponseEntity.ok(laboratorioservice.listarLaboratorios());
    }
    
}
