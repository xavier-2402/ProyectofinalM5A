/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectofinalM5A.Service;

import com.example.proyectofinalM5A.Model.Laboratorio;
import com.example.proyectofinalM5A.Repository.LaboratorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class LaboratorioService {
    
    @Autowired
    LaboratorioRepository laboratoriorepository;
    
    public Laboratorio crearLaboratorio(Laboratorio lb) {
        return laboratoriorepository.save(lb);
    }
    
    public List<Laboratorio> listarLaboratorios() {
        return laboratoriorepository.findAll();
    }
    
}
