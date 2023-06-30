package com.port.back;

//import com.port.back.modelo.Rol;
//import com.port.back.modelo.Usuario;
//import com.port.back.modelo.UsuarioRol;
import com.port.back.servicios.UsuarioService;
//import java.util.HashSet;
//import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class PortfolioBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
			Usuario usuario = new Usuario();

			usuario.setNombre("Fanny");
			usuario.setApellido("Garcia Cabana Flores");
			usuario.setUsername("Fanny");
			usuario.setPassword("1234");
			usuario.setEmail("lorynegarcia@gmail.com");
			usuario.setTelefono("100000123");
			usuario.setPerfil("foto.png");

			Rol rol = new Rol();
			rol.setRolId(2L);
			rol.setRolNombre("ADMIN");

			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());
	*/	
	}
}
