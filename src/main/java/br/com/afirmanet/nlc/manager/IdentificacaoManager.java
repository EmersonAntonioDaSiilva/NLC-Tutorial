package br.com.afirmanet.nlc.manager;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
public class IdentificacaoManager implements Serializable {

	private static final long serialVersionUID = -2834709080602363548L;

	@PostConstruct
	public void init() {
		
	}
}
