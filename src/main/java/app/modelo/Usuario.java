package app.modelo;

import javax.persistence.Column;
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
    @Column(name="dni")
    private String dni;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="email")
    private String email;
    @Column(name="direccion")
    private String direccion;
    
    private String password;
        
    public void setDni(String n){this.dni=n;}
    public void setNombre(String name){this.nombre=name;}
    public void setApellido(String surname) {this.apellido=surname;}
    public void setEmail(String em) {this.email=em;}
    public void setDireccion(String dir) {this.direccion=dir;}
	public void setPassword(String password) {this.password = password;}
    
    public String getDni(){return this.dni;}
    public String getNombre() {return this.nombre;}
    public String getApellido() {return this.apellido;}
    public String getEmail() {return this.email;}
    public String getDireccion() {return this.direccion;}
	public String getPassword() {return password;}

    
    

}
