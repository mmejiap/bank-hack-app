package app.repositorios;

import org.springframework.data.repository.CrudRepository;

import app.modelo.Servicios;
import app.modelo.Tarjeta;

public interface RepositorioTarjeta extends CrudRepository<Tarjeta, String> {

}
