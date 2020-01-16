package gt.edu.academik.beginningjsf;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Persona.class)
public abstract class Persona_ {

	public static volatile SingularAttribute<Persona, String> apellido;
	public static volatile SingularAttribute<Persona, Integer> personaId;
	public static volatile SingularAttribute<Persona, String> nombre;
	public static volatile SingularAttribute<Persona, Integer> edad;

	public static final String APELLIDO = "apellido";
	public static final String PERSONA_ID = "personaId";
	public static final String NOMBRE = "nombre";
	public static final String EDAD = "edad";

}

