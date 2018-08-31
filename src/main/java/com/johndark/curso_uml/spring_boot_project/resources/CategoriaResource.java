/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johndark.curso_uml.spring_boot_project.resources;

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
    public String list(){
        
        return "O Reste está funcionando";
    }
}
