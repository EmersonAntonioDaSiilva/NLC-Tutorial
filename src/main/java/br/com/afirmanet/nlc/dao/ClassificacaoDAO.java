package br.com.afirmanet.nlc.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;

import br.com.afirmanet.core.exception.DaoException;
import br.com.afirmanet.core.persistence.GenericDAO;
import br.com.afirmanet.nlc.entity.Classificacao;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@TransactionManagement(TransactionManagementType.CONTAINER)
public @Stateless class ClassificacaoDAO extends GenericDAO<Classificacao, Integer> implements Serializable {
	private static final long serialVersionUID = 6907863285648197379L;

	public ClassificacaoDAO(EntityManager entityManager) {
		super(entityManager);
	}

	private Collection<Predicate> createPredicates() {
		Collection<Predicate> predicates = new ArrayList<>();

		
		return predicates;
	}
	
	@Override
	@SuppressWarnings("unused")
	public Collection<Predicate> createPaginationPredicates(Classificacao entity) {
		Collection<Predicate> predicates = createPredicates();

		return super.createPaginationPredicates(entity);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void delete(Classificacao entity) {
			super.delete(entity);
	}


	public Classificacao findByNome(String descricao) throws DaoException {
		Classificacao retornoClassificacao = null;
		
		try {
			CriteriaQuery<Classificacao> criteriaQuery = createCriteriaQuery();
			Collection<Predicate> predicates = new ArrayList<>();

			if (descricao != null && !descricao.isEmpty()) {
				predicates.add(cb.equal(cb.lower(root.get("descricao")), descricao.toLowerCase()));
			}

			if(!predicates.isEmpty()){
				criteriaQuery.select(root).where(predicates.toArray(new Predicate[] {}));

				retornoClassificacao = entityManager.createQuery(criteriaQuery).getSingleResult();
			}
		} catch (Exception e) {
			throw new DaoException(e.getMessage(),e);
		}
		return retornoClassificacao;

	}
}
