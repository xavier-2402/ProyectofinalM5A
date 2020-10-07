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
@Document(collection = "Laboratorio")
@Data
public class Laboratorio {

    @Id
    private Long id;
    private String nombre_laboratorio;
    private String edificio;
    private List<Equipo> equipos;

}
