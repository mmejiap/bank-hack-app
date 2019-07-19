package app.repositorios;

import org.springframework.data.repository.CrudRepository;

import app.modelo.Pago;
import app.modelo.Servicios;

public interface RepositorioServicios extends CrudRepository<Servicios, Integer> {

}
