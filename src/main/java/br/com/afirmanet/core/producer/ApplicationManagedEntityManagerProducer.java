package br.com.afirmanet.core.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import br.com.afirmanet.core.producer.interfaces.ApplicationManaged;

@ApplicationScoped
public class ApplicationManagedEntityManagerProducer {

	@PersistenceUnit(name="@PersistenceUnit")
	private EntityManagerFactory entityManagerFactory;

	@Produces
	@ApplicationManaged
	@RequestScoped
	public EntityManager create() {
		return entityManagerFactory.createEntityManager();
	}

	public void dispose(@Disposes @ApplicationManaged EntityManager entityManager) {
		if (entityManager.isOpen()) {
			entityManager.close();
		}
	}

}
