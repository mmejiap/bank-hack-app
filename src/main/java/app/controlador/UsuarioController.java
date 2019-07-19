package app.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import app.modelo.Permiso;
import app.modelo.Usuario;
//import app.repositorios.RepositorioPermiso;
import app.repositorios.RepositorioUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@RestController    // Clase controlador
@RequestMapping(path="/usuario") // URL del servicio comienza con /agaport

public class UsuarioController {
	@Autowired
	private RepositorioUsuario usuarioRepo;
	/////////////////////////////
	@CrossOrigin
	@GetMapping(path="/validaUsuario")
	@ResponseBody
	public int validaUsuario(@RequestParam String numDni,
												@RequestParam String password
			) {
		System.out.println("-->Dni:"+numDni+"-> pass: "+password);
		try{
			Optional<Usuario> u =  usuarioRepo.findById(numDni);
			if(u.get().getPassword()==password) {
				return 1;
			}else
				return 0;

		}
		catch(Exception e){
			return 0;
		}
					
	}
}
