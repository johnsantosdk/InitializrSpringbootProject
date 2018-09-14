/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johndark.curso_uml.spring_boot_project.repositories;

import com.johndark.curso_uml.spring_boot_project.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author airto
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
