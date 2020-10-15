/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Model;

import java.util.Date;
import java.util.UUID;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author usuario
 */
@Document (collection="Bitacora")
@Data
public class Bitacora {

    @Id
    private Long id;
    private String fechaBitacora;
    private String descripcionBitacora;
    private String nombreEquipo;
    private int idLaboratorio; 
    private String cedula;
    private String carreraNombre;
    private String nivelNombre;
    private String nombreAsignatura;


    
    
}
