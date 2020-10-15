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
        
     @Query("{'nombreEquipo':?0,'idLaboratorio':?1}")
    List<Bitacora> findByEquipmentname(String nombreEquipo,int idLaboratorio);
    
    @Query("{fechaBitacora:ISODate(?0),'idLaboratorio':?1,'nombreEquipo':?2}")
    List<Bitacora> findSpecificsBinacle(String fecha,int idLaboratorio,String nombreEquipo);
    
      
    @Query("'idLaboratorio':?1,'nombreEquipo':?2}")
    List<Bitacora> findSpecificsBinacle2(int idLaboratorio,String nombreEquipo);
    
    @Query("{fechaBitacora:?0,'idLaboratorio':?1,'nombreEquipo':?2}")
    List<Bitacora> findSpecificsBinacle3(Date fecha,int idLaboratorio,String nombreEquipo);
    
}
