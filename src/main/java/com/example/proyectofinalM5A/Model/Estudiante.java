/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Model;

import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author usuario
 */
@Document(collection = "Estudiante")
@Data
public class Estudiante {

    @Id
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo_institucional;
    private String ciudad;
    private String telefono;


}
