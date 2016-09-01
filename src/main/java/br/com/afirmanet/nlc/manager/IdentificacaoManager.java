package br.com.afirmanet.nlc.manager;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.afirmanet.nlc.dao.ClassificacaoDAO;
import br.com.afirmanet.nlc.entity.Classificacao;
import lombok.Getter;

@Named
public class IdentificacaoManager implements Serializable {

	private static final long serialVersionUID = -2834709080602363548L;

	@Inject
	private EntityManager entityManager;
	
	@Getter
	private String nome;
	
	@PostConstruct
	public void init() {
		try {
			ClassificacaoDAO classificacaoDAO = new ClassificacaoDAO(entityManager);
			List<Classificacao> findAll = classificacaoDAO.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		nome = "Test";
		
	}
}
