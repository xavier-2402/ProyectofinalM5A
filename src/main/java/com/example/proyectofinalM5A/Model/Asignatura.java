/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author usuario
 */
@Data
public class Asignatura {

    private String nomenclatura_asignatura;
    private String nombre_asignatura;
    private String nombre_docente;

}
