/*
  Created by IntelliJ IDEA.
  User: DigitalDesign
  Date: 13-07-2020
  Time: 21:40
  
  Proyect: youtube
  File Type: INTERFACE
*/


package com.spring.web.youtube.interfaceService;

import com.spring.web.youtube.modelo.Persona;
import java.util.List;
import java.util.Optional;


public interface IpersonaService {

    public List <Persona> listar();
    public Optional <Persona> listarId(int id);
    public int save (Persona p);
    public void delete(int id);

}
