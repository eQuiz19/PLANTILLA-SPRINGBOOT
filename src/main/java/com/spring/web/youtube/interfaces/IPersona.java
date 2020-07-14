/*
  Created by IntelliJ IDEA.
  User: DigitalDesign
  Date: 13-07-2020
  Time: 21:37
  
  Proyect: youtube
  File Type: INTERFACE
*/


package com.spring.web.youtube.interfaces;

import com.spring.web.youtube.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
}
