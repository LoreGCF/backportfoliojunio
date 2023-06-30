
package com.port.back.modelo;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String cargo;

    
    @NotNull
    private String descripcion1;
    
     @NotNull
    private String descripcion2;
     
      @NotNull
    private String descripcion3;
    
    
    @NotNull
    private String img; 

    public Persona() {
    }

    public Persona(String nombre, String cargo, String descripcion1, String descripcion2, String descripcion3, String img) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
    
}
