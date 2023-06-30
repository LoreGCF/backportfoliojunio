
package com.port.back.servicios;


import com.port.back.modelo.Persona;
import com.port.back.repositorios.IPersonaRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    //se instancia a la interface
    
    private IPersonaRepository personaRepo;
    
    @Autowired
    public PersonaService(IPersonaRepository personaRepo){
        this.personaRepo = personaRepo;
    }
    
    //METODO PARA LISTAR TODA LA PERSONA
    
    public List<Persona> listarPersona(){
    return personaRepo.findAll();
    
    }
    
    //METODO PARA BUSCAR PERSONA POR ID ESPECIFICO
    
    public Optional<Persona> buscarPorId(int id){
    return personaRepo.findById(id);
    
    }
    
    
    //METODO PARA BUSCAR POR Nombre
    
    List<Persona> buscarPorNombre(String nombre){
      return personaRepo.findByNombre(nombre);
    }
    
    
    
    //METODO PARA CREAR PERSONA
    //es void porque no necesito que me retorne nada 
    
    public void crearPersona(Persona persona){
     personaRepo.save(persona);
    }
    
    
    
    
    
    
    
    //METODO PARA ACTUALIZAR PERSONA
    public void actualizarPersona(Persona persona){
      personaRepo.save(persona);
    }
    
    
    //METODO PARA ELIMINAR PERSONA
    
    public void eliminarPersona(int id){
    personaRepo.deleteById(id);
    }
    
    
    
}
