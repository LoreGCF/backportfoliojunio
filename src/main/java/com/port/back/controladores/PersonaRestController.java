
package com.port.back.controladores;


import com.port.back.modelo.Persona;
import com.port.back.servicios.PersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class PersonaRestController {
    
    private PersonaService personaService;

    @Autowired
    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    //LISTAR LA PERSONA 
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Persona> listarPersona(){
    return personaService.listarPersona();
    }
    
    //LISTAR POR ID
    @GetMapping(value = "admin/detail/{id}",headers = "Accept=application/json" )
    public Optional<Persona> buscarPorId(@PathVariable int id){
     return personaService.buscarPorId(id);
    }
    
    
    //CREAR PERSONA
    
    @PostMapping(value = "admin/crear", headers = "Accept=application/json" )
public void crearPersona(@RequestBody Persona persona){
personaService.crearPersona(persona);
}




//PARA ACTUALIZAR

@PutMapping(value = "admin/actualizar",headers = "Accept=application/json" )

public void actualizarPersona(@RequestBody Persona persona){
personaService.actualizarPersona(persona);

}


//ELIMINAR PERSONA

@DeleteMapping(value = "admin/eliminar/{id}", headers = "Accept=application/json")
public void eliminarPersona(@PathVariable int id){
personaService.eliminarPersona(id);
}
    
}
