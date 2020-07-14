/*
  Created by IntelliJ IDEA.
  User: DigitalDesign
  Date: 13-07-2020
  Time: 21:50
  
  Proyect: youtube
  File Type: CLASS
*/

package com.spring.web.youtube.controller;

import com.spring.web.youtube.interfaceService.IpersonaService;
import com.spring.web.youtube.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.ws.rs.POST;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas = service.listar(); //metodo listar()desde PersonaService
        model.addAttribute("personas", personas);
        return "listado";
    }

    //este es solamente para que te envie al formulario de agregar persona
    @GetMapping ("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "agregarPersona";
    }

    //acá se guarda la nueva persona agregada.
    @PostMapping("/save")
    public String save(@Valid Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }


    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "agregarPersona";
    }
    @GetMapping("/eliminar/{id}")
    public String delete (@PathVariable int id, Model model){
        service.delete(id);
        return "redirect:/listar";
    }

}

