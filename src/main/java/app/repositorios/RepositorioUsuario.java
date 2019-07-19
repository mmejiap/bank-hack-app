package app.repositorios;

import org.springframework.data.repository.CrudRepository;

//import app.modelo.Permiso;
import app.modelo.Usuario;

public interface RepositorioUsuario extends CrudRepository<Usuario, String> {

}
