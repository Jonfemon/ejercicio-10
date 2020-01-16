/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik.beginningjsf;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author diego
 */
@Stateless
public class PersonaServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void agregarPersona (Persona persona){
        
        this.entityManager.persist(persona);
    }
    
    public List <Persona> buscarPersonas (){
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery <Persona> query = builder.createQuery(Persona.class);
        Root <Persona> root = query.from(Persona.class);
        query.select(root);
        return this.entityManager.createQuery(query).getResultList();
    }
}
