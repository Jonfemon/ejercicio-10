/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik.beginningjsf;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

/**
 *
 * @author diego
 */
@Entity
@Table (name = "Persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="PersonaId")
    private Integer personaId;
    
    @Column (name = "Nombre")
    @Size(min = 3, message = "Valor tiene que se mayor o igual que 3")
    private String nombre;
    
    @Column (name = "Apellido")
    @Size(min = 3, message = "Valor tien qeu ser mayor o igual que 3")
    private String apellido;
    
    @Column (name = "Edad")
    @Min(value = 18, message ="Valor minimo es de 18")
    @Max(value = 60, message ="Valor maximo es de 80")
    private int edad;
    
    public Integer getPersonaId() {
        return this.personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.personaId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.personaId, other.personaId)) {
            return false;
        }
        return true;
    }
    
}
