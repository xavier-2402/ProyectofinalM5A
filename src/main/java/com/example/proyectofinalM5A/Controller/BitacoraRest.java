/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Controller;

import com.example.proyectofinalM5A.Model.Bitacora;
import com.example.proyectofinalM5A.Service.BitacoraService;
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
@RequestMapping("/bitacora")
@CrossOrigin(origins="*")
public class BitacoraRest {
    
    @Autowired
    BitacoraService bitacoraservice;
    
     // Metodo post
    @PostMapping(path = "/save")
    public ResponseEntity saveBinnacle(@RequestBody Bitacora bitacora) {
        bitacoraservice.crearBitacora(bitacora);
        return ResponseEntity.ok("Added binnacle with id "+bitacora.getId());
    }

    //Metodo get general
    @GetMapping(path = "/list")
    public ResponseEntity listBinnacles() {
        return ResponseEntity.ok(bitacoraservice.listarBitacoras());
    }
    
}
