/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johndark.curso_uml.spring_boot_project.resources;

import com.johndark.curso_uml.spring_boot_project.domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author airton
 */
@RestController
@RequestMapping( value="/categoria" )

public class CategoriaResource {
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> list(){
        
        Categoria cat1 = new Categoria(1, "Informática");        
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        
        return lista;
    }
}
