package app.controlador;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.modelo.Pago;
import app.repositorios.RepositorioPago;

@CrossOrigin
@RestController    // Clase controlador
@RequestMapping(path="/pago") // URL del servicio comienza con /agaport
public class PagoController {
    @Autowired
	private RepositorioPago pagorepo;
    @CrossOrigin
    @PostMapping(path="/insertar") // Map SOLO GET 
	public @ResponseBody String agregarPermiso (@RequestParam int id,
			                                    @RequestParam String ftarjeta,
												@RequestParam String fdeuda,
												@RequestParam Date fechapago) {
        Pago p = new Pago();
		p.setFtarjeta(ftarjeta);
        p.setFdeuda(fdeuda);
        p.setFechapago(fechapago);
        pagorepo.save(p);
        return "Guardado";
    }
    @CrossOrigin
    @GetMapping(path="/listar")
	public @ResponseBody Iterable<Pago> listarPermisos(@RequestParam String ftarjeta) {
        Iterable<Pago> listaPag = pagorepo.findAll();
        ArrayList<Pago> listPagos = new ArrayList<Pago>();
     
        for(Pago p:listaPag) {
        	if(p.getFtarjeta()==ftarjeta) {
        		listPagos.add(p);
        	}
        }
        return listPagos;
    }
    @CrossOrigin
	@PostMapping(path="/modificar")
	public @ResponseBody String modificarPermiso(@RequestParam int id,
			                                     @RequestParam String ftarjeta,
		                                       	 @RequestParam String fdeuda,
			                                     @RequestParam Date fechapago) {
        Pago p = pagorepo.findById(id).get();	
        p.setId(id);
        p.setFdeuda(fdeuda);
        p.setFtarjeta(ftarjeta);
        p.setFechapago(fechapago);
        return "Modificado";
    }   

}
