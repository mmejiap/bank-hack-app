package app.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.modelo.Pago;
import app.modelo.Servicios;
import app.repositorios.RepositorioPago;
import app.repositorios.RepositorioServicios;

@CrossOrigin
@RestController    // Clase controasdcasdclador
@RequestMapping(path="/servicios") 
public class ServiciosController {
	
	@Autowired
	private RepositorioServicios serviciosrepo;
	
	@CrossOrigin
	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Servicios> listarServicios() {
	        Iterable<Servicios> listaServicios = serviciosrepo.findAll();
	        ArrayList<Servicios> listaServicios2 = new ArrayList<Servicios>();
	     
	        for(Servicios p:listaServicios) {
	        	listaServicios2.add(p);
	        	
	        }
	        return listaServicios2;
	 }

}
