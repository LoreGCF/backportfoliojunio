
package com.port.back.repositorios;


import com.port.back.modelo.Persona;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer>{
    
   
    List<Persona> findByNombre(String nombre);
    
    
    
}
