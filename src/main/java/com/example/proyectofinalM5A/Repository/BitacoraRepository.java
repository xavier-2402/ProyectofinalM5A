/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Repository;

import com.example.proyectofinalM5A.Model.Bitacora;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public interface BitacoraRepository extends MongoRepository<Bitacora,Long>{
        
     @Query("{'nombre_equipo':?0,'id_laboratorio':?1}")
    List<Bitacora> findByEquipmentname(String nombre_equipo,int id_laboratorio);
    
    @Query("{fecha_bitacora:ISODate(?0),'id_laboratorio':?1,'nombre_equipo':?2}")
    List<Bitacora> findSpecificsBinacle(String fecha,int id_laboratorio,String nombre_equipo);
    
      
    @Query("'id_laboratorio':?1,'nombre_equipo':?2}")
    List<Bitacora> findSpecificsBinacle2(int id_laboratorio,String nombre_equipo);
    
    @Query("{fecha_bitacora:?0,'id_laboratorio':?1,'nombre_equipo':?2}")
    List<Bitacora> findSpecificsBinacle3(Date fecha,int id_laboratorio,String nombre_equipo);
    
}
