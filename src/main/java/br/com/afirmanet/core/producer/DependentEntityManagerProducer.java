package br.com.afirmanet.core.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.afirmanet.core.producer.interfaces.Dependent;

@ApplicationScoped
public class DependentEntityManagerProducer {

	@PersistenceContext
	private EntityManager entityManager;

	@Produces
	@Dependent
	public EntityManager createEntityManager() {
		return entityManager;
	}

}
