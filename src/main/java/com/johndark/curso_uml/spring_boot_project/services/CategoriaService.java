/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johndark.curso_uml.spring_boot_project.services;

import com.johndark.curso_uml.spring_boot_project.domain.Categoria;
import com.johndark.curso_uml.spring_boot_project.repositories.CategoriaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author airto
 */

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;
    
    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        
        return obj.orElse(null);
    }
}
