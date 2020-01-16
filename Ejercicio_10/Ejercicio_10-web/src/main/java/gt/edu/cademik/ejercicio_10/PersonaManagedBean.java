/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.cademik.ejercicio_10;

import gt.edu.academik.beginningjsf.Persona;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author diego
 */
@Named
@ViewScoped
public class PersonaManagedBean implements Serializable {
    
    private String mensaje;
    private final Persona persona;
    
    public PersonaManagedBean(){
        this.persona = new Persona();
    }
    
    public void crearMensaje(){
        this.mensaje = "Ingreso de: " +this.persona.getNombre()
                +" y " + this.persona.getApellido()
                +" con "+ this.persona.getEdad();
    }
    
    public Persona getPersona(){
        return persona;
    }
    
    public String getMensaje(){ 
        return mensaje;
    }
    
    
}
