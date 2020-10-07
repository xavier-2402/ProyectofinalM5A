/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Service;

import com.example.proyectofinalM5A.Model.Bitacora;
import com.example.proyectofinalM5A.Repository.BitacoraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class BitacoraService {
    @Autowired
    BitacoraRepository bitacorarepository;
    
     public Bitacora crearBitacora(Bitacora bitacora) {
        return bitacorarepository.save(bitacora);
    }
    
    public List<Bitacora> listarBitacoras() {
        return bitacorarepository.findAll();
    }
    
}
