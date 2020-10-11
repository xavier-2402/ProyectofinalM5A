/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Service;

import com.example.proyectofinalM5A.Model.Bitacora;
import com.example.proyectofinalM5A.Repository.BitacoraRepository;
import java.util.Date;
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
    
   public List<Bitacora> buscarporNombreEquipo(String nombre, int id){
       return bitacorarepository.findByEquipmentname(nombre, id);
   }
   public List<Bitacora> buscarporFechaEspecifica(String fecha, int lab, String nombreEquipo){
       return bitacorarepository.findSpecificsBinacle(fecha, lab, nombreEquipo);
   }
   
   public List<Bitacora> buscarporFechaEspecifica( int lab, String nombreEquipo){
       return bitacorarepository.findSpecificsBinacle2( lab, nombreEquipo);
   }
   public List<Bitacora> buscarporFechaEspecifica3(Date fecha, int lab, String nombreEquipo){
       return bitacorarepository.findSpecificsBinacle3(fecha, lab, nombreEquipo);
   }
}
