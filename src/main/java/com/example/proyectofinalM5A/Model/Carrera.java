/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author usuario
 */
@Document(collection = "Carrera")
@Data
public class Carrera {

    @Id
    private Long id;
    private String carreraNombre;
    private String modalidadCarrera;
    private String nomenclaturaCarrera;
    private String jornada;
    private List<Nivel> niveles;

}
