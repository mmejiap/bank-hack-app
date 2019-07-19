package app.repositorios;

import org.springframework.data.repository.CrudRepository;

import app.modelo.Deudas;
import app.modelo.Permiso;

public interface RepositorioDeudas extends CrudRepository<Deudas, Integer> {

}
