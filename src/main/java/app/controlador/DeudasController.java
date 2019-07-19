package app.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.modelo.Deudas;
import app.modelo.Pago;
import app.repositorios.RepositorioDeudas;

@CrossOrigin
@RestController
@RequestMapping("/deudas")

public class DeudasController {
	@Autowired
	private RepositorioDeudas deudasrepo;
	/*
	@CrossOrigin
	@PostMapping(path="/insertar")
	public @ResponseBody String agregarDeuda(@RequestParam int iddeuda,
												@RequestParam String fdni,
												@RequestParam String fidservicio,
												@RequestParam String montodeuda) {
		
	}
	*/
	
	@CrossOrigin
    @GetMapping(path="/listar")
	@ResponseBody
	public Iterable<Deudas> listarDeudas(@RequestParam String numDni) {
        Iterable<Deudas> listaDeu = deudasrepo.findAll();
        ArrayList<Deudas> listDeudas = new ArrayList<Deudas>();
        System.out.println("--->numDni:"+numDni);
        for(Deudas p:listaDeu) {
        	if(p.getFdni().equals(numDni)) {
        		listDeudas.add(p);
        	}
        }
        return listDeudas;
    }

			
			
}
