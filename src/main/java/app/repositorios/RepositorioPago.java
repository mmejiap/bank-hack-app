package app.repositorios;

import org.springframework.data.repository.CrudRepository;

import app.modelo.Pago;
import app.modelo.Permiso;

public interface RepositorioPago extends CrudRepository<Pago, Integer> {

}