/*
  Created by IntelliJ IDEA.
  User: DigitalDesign
  Date: 13-07-2020
  Time: 21:43
  
  Proyect: youtube
  File Type: CLASS
*/

package com.spring.web.youtube.service;

import com.spring.web.youtube.interfaceService.IpersonaService;
import com.spring.web.youtube.interfaces.IPersona;
import com.spring.web.youtube.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {

     @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
    return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res=0;
        Persona persona = data.save(p);
        if(persona != null && persona.getId() > 0){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
