package app.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="usuario")

public class Usuario {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
        
    public void setDni(String n){this.dni=n;}
    public void setNombre(String name){this.nombre=name;}
    public void setApellido(String surname) {this.apellido=surname;}
    public void setEmail(String em) {this.email=em;}
    public void setDireccion(String dir) {this.direccion=dir;}
    
    public String getDni(){return this.dni;}
    public String getNombre() {return this.nombre;}
    public String getApellido() {return this.apellido;}
    public String getEmail() {return this.email;}
    public String getDireccion() {return this.direccion;}
    
    

}
