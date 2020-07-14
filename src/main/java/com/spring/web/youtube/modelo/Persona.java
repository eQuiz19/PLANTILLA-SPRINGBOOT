/*
  Created by IntelliJ IDEA.
  User: DigitalDesign
  Date: 13-07-2020
  Time: 21:30
  
  Proyect: youtube
  File Type: CLASS
*/

package com.spring.web.youtube.modelo;


import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    private int id;
    private String name;
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String name, String telefono) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
