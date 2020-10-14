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
    private Date fecha_bitacora;
    private String descripcion_bitacora;
    private String nombre_equipo;
    private int id_laboratorio; 
    private String cedula;
    private String carrera_nombre;
    private String nivel_nombre;
    private String nombre_asignatura;
}
