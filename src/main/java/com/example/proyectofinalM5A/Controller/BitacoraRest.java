/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Controller;

import com.example.proyectofinalM5A.Model.Bitacora;
import com.example.proyectofinalM5A.Service.BitacoraService;
import java.util.Date;
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
    
      @GetMapping(path = "/list/binnacles/{idLaboratorio}")
    public ResponseEntity listBinnaclesById_laboratorio(String nombre, int idLaboratorio) {
        return ResponseEntity.ok(bitacoraservice.buscarporNombreEquipo(nombre, idLaboratorio));
    }
       @GetMapping(path = "/list/prueba/binnacles/fecha{fecha/}/equipmentname/{nombreEquipo}/laboratorio/{idLaboratorio}")
    public ResponseEntity listBinnaclesBySpecificsBinacle(String fecha,int idLaboratorio,String nombreEquipo) {
        return ResponseEntity.ok(bitacoraservice.buscarporFechaEspecifica(fecha, idLaboratorio, nombreEquipo));
    }
    
       @GetMapping(path = "/list/prueba2/binnacles/equipmentname/{nombreEquipo}/laboratorio/{idLaboratorio}")
    public ResponseEntity listBinnaclesBySpecificsBinacle2(int idLaboratorio,String nombreEquipo) {
        return ResponseEntity.ok(bitacoraservice.buscarporFechaEspecifica(
                idLaboratorio, nombreEquipo));
    } 
    
        @GetMapping(path = "/list/prueba3/binnacles//fecha{/}/equipmentname/{nombreEquipo}/laboratorio/{idLaboratorio}")
    public ResponseEntity listBinnaclesBySpecificsBinacle3(Date fecha,int idLaboratorio,String nombreEquipo) {
        return ResponseEntity.ok(bitacoraservice.buscarporFechaEspecifica3(fecha, idLaboratorio, nombreEquipo));
    }
}
