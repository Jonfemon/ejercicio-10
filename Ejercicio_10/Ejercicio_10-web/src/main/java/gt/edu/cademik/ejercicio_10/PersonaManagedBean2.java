/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.cademik.ejercicio_10;

import gt.edu.academik.beginningjsf.Persona;
import gt.edu.academik.beginningjsf.PersonaServicio;
import java.io.Serializable;
import java.util.*;
import static java.util.Collections.list;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author diego
 */
@Named
@ViewScoped
public class PersonaManagedBean2 implements Serializable {
   
    private Persona persona;
    List <Persona> lista;
    
    @EJB
    private PersonaServicio personaServicio;
    
    @PostConstruct
    public void inicializar (){
        this.persona = new Persona();
        this.lista=this.personaServicio.buscarPersonas();
    }
    
    public void agregarPersona () {
      //  lista.add(persona);
        this.personaServicio.agregarPersona(persona);
        //this.persona = new Persona();
        this.inicializar();
    }
    
     public Persona getPersona() {
         return persona;
     }
     
     public List<Persona> getList(){
        return lista;
    }
}
